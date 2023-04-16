package com.yxcorp.gifshow.model.BlockUser;
import java.io.Serializable;
import java.lang.Object;

public class BlockUser implements Serializable	// class@001def
{
    public User mAdmin;
    public long mBlockedTime;
    public User mBlockedUser;
    public static final long serialVersionUID = 0x2e6dbc9f53e11829;

    public void BlockUser(){
       super();
    }
}
