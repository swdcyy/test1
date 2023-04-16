package com.kuaishou.android.model.mix.RankMeta;
import java.io.Serializable;
import java.lang.Object;

public class RankMeta implements Serializable	// class@000de2
{
    public String mCategory;
    public String mContent;
    public CDNUrl[] mIconUrls;
    public String mId;
    public String mTitle;
    public List mUsers;
    public static final long serialVersionUID = 0x94747385007e3ae2;

    public void RankMeta(){
       super();
    }
}
