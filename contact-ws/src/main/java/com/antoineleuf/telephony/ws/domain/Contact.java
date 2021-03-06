package com.antoineleuf.telephony.ws.domain;

public class Contact {
  
  private String id;
  private String telephoneNumber;
  private String address;
  private String name;
  private String birthdate;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTelephoneNumber() {
    return telephoneNumber;
  }

  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBirthday(){
     return birthdate;
  }
  
  public void setBirthday(String birthday) {
     this.birthdate = birthday; 
  }
}
