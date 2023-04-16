package com.kwai.framework.model.user.UserDeserializer$c;
import com.kwai.framework.model.user.UserDeserializer$a;
import pa6.q;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;

public class UserDeserializer$c extends UserDeserializer$a	// class@00173e
{
    public String a;
    public String mAvatar;
    public CDNUrl[] mAvatars;
    public String mId;
    public String mName;
    public String mSex;

    public void UserDeserializer$c(){
       super(null);
    }
    public String a(){
       return this.mAvatar;
    }
    public CDNUrl[] b(){
       return this.mAvatars;
    }
    public String c(){
       return this.mId;
    }
    public String d(){
       return this.mName;
    }
    public String e(){
       return this.mSex;
    }
    public String f(){
       return this.a;
    }
}
