package com.epam.wklab.soap;

import com.epam.wklab.person.Friends;
import com.epam.wklab.person.Person;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

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
