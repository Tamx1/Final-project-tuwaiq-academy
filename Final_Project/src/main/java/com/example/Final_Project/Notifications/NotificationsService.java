package com.example.Final_Project.Notifications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class NotificationsService {

    private final NotificationsRepository notificationsRepository;


    @Autowired
    public NotificationsService(NotificationsRepository notificationsRepository) {
        this.notificationsRepository = notificationsRepository;
    }

    public List<Notifications> getNotifications(){
        return notificationsRepository.findAll();
    }

    public Notifications getNotifications(String id){
        int notifications_id = Integer.valueOf(id);
        return notificationsRepository.findById(notifications_id).orElse(null);
    }

    public Notifications addNotifications(Notifications notifications){

        return notificationsRepository.save(notifications);
    }

    public void deleteNotifications(String id){
        int notifications_id = Integer.valueOf(id);
        notificationsRepository.deleteById(notifications_id);

    }

    }


