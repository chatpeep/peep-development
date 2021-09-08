package com.peep;

public interface UserStatusListener {
    public void online(String login);
    public void offline(String login);
}
