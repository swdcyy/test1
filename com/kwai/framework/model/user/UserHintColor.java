package com.kwai.framework.model.user.UserHintColor;
import java.io.Serializable;
import java.lang.Object;

public class UserHintColor implements Serializable	// class@00175b
{
    public String mBgColorDark;
    public String mBgColorLight;
    public String mTextColorDark;
    public String mTextColorLight;
    public static final long serialVersionUID = 0x68786331ca34df67;

    public void UserHintColor(){
       super();
       this.mBgColorLight = "";
       this.mBgColorDark = "";
       this.mTextColorLight = "";
       this.mTextColorDark = "";
    }
}
