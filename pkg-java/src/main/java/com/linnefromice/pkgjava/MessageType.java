package com.linnefromice.pkgjava;

public enum MessageType {
  AFFIRMATIVE("affirmative"),
  NON_COMMITTAL("non-committal"),
  NEGATIVE("negative")
  ;

  private final String name;
  private MessageType(final String name) {
    this.name = name;
  }
}