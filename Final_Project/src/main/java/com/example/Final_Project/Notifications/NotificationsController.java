package com.example.Final_Project.Notifications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path= "notifications")
@CrossOrigin("*")
public class NotificationsController {

    private final NotificationsService notificationsService;


    @Autowired
    public NotificationsController(NotificationsService notificationsService) {
        this.notificationsService = notificationsService;
    }



    @GetMapping
    public List<Notifications> getNotificationss(@RequestParam(required = false) String filter){
        return notificationsService.getNotifications();
    }

    @GetMapping("/{id}")
    public Notifications getNotifications(@PathVariable String id){
        return notificationsService.getNotifications(id);
    }

    @PostMapping
    public void addNotifications(@RequestBody Notifications notifications){
        notificationsService.addNotifications(notifications);
    }

    @DeleteMapping("/{id}")
    public void delNotifications(@PathVariable String id){
        notificationsService.deleteNotifications(id);
    }





}
