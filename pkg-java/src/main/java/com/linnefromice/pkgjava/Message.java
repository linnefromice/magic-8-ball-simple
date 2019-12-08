package com.linnefromice.pkgjava;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {
  private String text;
  private MessageType type;
}