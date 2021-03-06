package com.antoineleuf.telephony.ws.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.antoineleuf.telephony.ws.api.dto.ContactDto;

@Path("/contacts")
public interface ContactResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  List<ContactDto> getContacts();

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("{id}")
  ContactDto getContact(@PathParam("id") String id);

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  void addContact(ContactDto contactDto);

  @PUT
  @Path("{id}")
  void updateContact(@PathParam("id") String id,
                     ContactDto contactDto);

  @DELETE
  @Path("{id}")
  void deleteContact(@PathParam("id") String id);
}
