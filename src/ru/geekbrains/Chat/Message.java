package ru.geekbrains.Chat;

import java.util.*;
import java.text.*;


public class Message {
    String text;
    //String userID;
    Date dMessage;

 public Message(String newText) {
     text = newText;
     dMessage = new Date();
 }

//Пока так: отправляем не на сервер же
 public String send(){

     SimpleDateFormat f = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");

     return f.format(dMessage) + " " + text;
 }
}
