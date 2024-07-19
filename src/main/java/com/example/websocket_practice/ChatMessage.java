package com.example.websocket_practice;

import lombok.Data;

@Data
public class ChatMessage {

    public enum MessageType{
        ENTER, TALK, MATCH, EXIT, MATCH_REQUEST;
    }

    private MessageType type;
    private String roomId;
    private String sender;
    private String message;
}
