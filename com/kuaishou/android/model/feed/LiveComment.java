package com.kuaishou.android.model.feed.LiveComment;
import java.io.Serializable;
import sp.c;
import java.lang.Object;
import java.lang.String;
import com.kwai.framework.model.user.UserInfo;

public class LiveComment implements Serializable, c	// class@000afe
{
    public String mContent;
    public UserInfo mUserInfo;
    public static final long serialVersionUID = 0x9fee49774c527665;

    public void LiveComment(){
       super();
    }
    public String getColor(){
       return null;
    }
    public String getContent(){
       return this.mContent;
    }
    public String getIconUrl(){
       LiveComment tmUserInfo = this.mUserInfo;
       if (tmUserInfo == null) {
          return null;
       }
       return tmUserInfo.mHeadUrl;
    }
    public int getType(){
       return 1;
    }
}
