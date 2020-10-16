package com.example.sendmessage.model;

import java.io.Serializable;

public class Message implements Serializable {
    private String timestamp;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    private String message;

    @Override
    public String toString() {
        return "Message{" +
                "timestamp='" + timestamp + '\'' +
                ", message='" + message + '\'' +
                ", user='" + user + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message1 = (Message) o;

        if (!timestamp.equals(message1.timestamp)) return false;
        return message.equals(message1.message);
    }

    @Override
    public int hashCode() {
        int result = timestamp.hashCode();
        result = 31 * result + message.hashCode();
        return result;
    }

    public Message(String timestamp, String message, String user) {
        this.timestamp = timestamp;
        this.message = message;
        this.user = user;
    }

    private String user;

}
