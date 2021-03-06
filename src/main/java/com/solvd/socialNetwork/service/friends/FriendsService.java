package com.solvd.socialNetwork.service.friends;

import com.solvd.socialNetwork.binary.Friends;

import java.io.IOException;
import java.util.List;

public interface FriendsService {

    void save(Friends friend);

    Friends getById(long id);

    void delete(Friends u);

    List<Friends> getAll();

    void updateNameById(long id, String name);

    void updateLastNameById(long id, String lastName);

    void saveFriendsByJsonFile() throws IOException;

    void saveFriendsListByJsonFile() throws IOException;

    void writeJsonFromDBInfo() throws IOException;
}
