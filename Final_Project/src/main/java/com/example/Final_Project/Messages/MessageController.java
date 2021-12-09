package com.example.Final_Project.Messages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path= "messages")
@CrossOrigin("*")
public class MessageController {

    private final MessageService messageService;


    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }



    @GetMapping
    public List<Message> getMessages(@RequestParam(required = false) String filter){
        return messageService.getMessages();
    }

    @GetMapping("/{id}")
    public Message getMessage(@PathVariable String id){
        return messageService.getMessage(id);
    }

    @PostMapping
    public void addMessage(@RequestBody Message message){
        messageService.addMessage(message);
    }

    @DeleteMapping("/{id}")
    public void delMessage(@PathVariable String id){
        messageService.deleteMessage(id);
    }

}
