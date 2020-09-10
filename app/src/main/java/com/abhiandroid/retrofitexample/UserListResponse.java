
package com.abhiandroid.retrofitexample;

import java.util.HashMap;
import java.util.Map;

public class UserListResponse {

    // POJO class to get the data from web api
private String id;
private String name;
private String realname;
private String team;
private String  firstappearance;
private String createdby;
private String publisher;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getRealname() {
return realname;
}

public void setRealname(String realname) {
this.realname = realname;
}

public String getTeam() {
return team;
}

public void setTeam(String team) {
this.team = team;
}

public String getFirstAppearance() {
return firstappearance;
}

public void setFirstAppearance(String firstappearance) {
this.firstappearance = firstappearance;
}

public String getCreatedBy() {
return createdby;
}

public void setCreatedBy(String createdby) {
this.createdby = createdby;
}

public String getPublisher() {
return publisher;
}

public void setPublisher(String publisher) {
this.publisher = publisher;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}