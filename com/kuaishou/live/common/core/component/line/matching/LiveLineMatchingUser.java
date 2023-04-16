package com.kuaishou.live.common.core.component.line.matching.LiveLineMatchingUser;
import java.io.Serializable;
import java.lang.Object;

public class LiveLineMatchingUser implements Serializable	// class@00147f
{
    public List mUserInfos;
    public String matchSource;
    public int matchType;
    public static final long serialVersionUID = 0x83858c270b0ee8c9;

    public void LiveLineMatchingUser(){
       super();
       this.matchType = 1;
    }
}
