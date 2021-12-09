package com.example.Final_Project.Messages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class MessageService {

    private final MessageRepository messageRepository;


    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public List<Message> getMessages(){
        return messageRepository.findAll();
    }

    public Message getMessage(String id){
        int message_id = Integer.valueOf(id);
        return messageRepository.findById(message_id).orElse(null);
    }

    public Message addMessage(Message message){

        return messageRepository.save(message);
    }

    public void deleteMessage(String id){
        int message_id = Integer.valueOf(id);
        messageRepository.deleteById(message_id);

    }

    }


