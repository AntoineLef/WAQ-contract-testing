package com.antoineleuf.telephony.ws.api.dto;

public class CallLogDto {
  public String id;
  public String telephoneNumber;
  public String date;
  public int durationInSeconds;
  public ContactDto caller; 
}
