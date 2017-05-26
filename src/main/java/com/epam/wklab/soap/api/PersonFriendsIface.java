package com.epam.wklab.soap.api;

import com.epam.wklab.person.Friends;
import com.epam.wklab.person.Person;
import com.epam.wklab.soap.simpl.NoMatchedFriendsException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by sten on 11.04.17.
 */
@WebService
public interface PersonFriendsIface {
    @WebMethod
    @WebResult(name="friends")
    Friends getFriends(
            @WebParam(name = "person") Person p,
            @WebParam(name = "year") Integer year) throws NoMatchedFriendsException;
}
