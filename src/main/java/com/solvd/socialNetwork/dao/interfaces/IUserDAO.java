package com.solvd.socialNetwork.dao.interfaces;

import com.solvd.socialNetwork.binary.Friends;
import com.solvd.socialNetwork.binary.Profile;
import com.solvd.socialNetwork.binary.User;
import com.solvd.socialNetwork.utils.collections.MyLinkedList;

import java.util.List;

public interface IUserDAO extends IEntityDAO<User> {

    List<User> getForUserName(String username);

    MyLinkedList<Profile> getProfileByUserId(long id);

    MyLinkedList<Profile> getAllProfileByUser();

    MyLinkedList<Friends> getFriendsByUserId(long id);

    MyLinkedList<Friends> getAllFriendsByUser();

    void updateUserName(Integer id, String userName);

    void updatePassword(Integer id, String userName);
}
