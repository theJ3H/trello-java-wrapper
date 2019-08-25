package com.julienvey.trello.domain;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//https://developers.trello.com/reference#membersidtokens
@JsonIgnoreProperties(ignoreUnknown = true)
public class Token extends TrelloEntity{

	private String id;
	private String identifier;
	private String idMember;
	private Date dateCreated;
	private Date dateExpires;
	
	private Webhook[] webhooks;

	public String getId() {
		return id;
	}

	public String getIdentifier() {
		return identifier;
	}

	public String getIdMember() {
		return idMember;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public Date getDateExpires() {
		return dateExpires;
	}

	public List<Webhook> getWebhooks() {
		return Arrays.asList(webhooks);
	}
	
	
	
}
