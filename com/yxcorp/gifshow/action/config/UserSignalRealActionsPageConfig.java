package com.yxcorp.gifshow.action.config.UserSignalRealActionsPageConfig;
import com.yxcorp.gifshow.action.startup.FeedRealActionsPageBaseConfig;
import java.util.List;

public class UserSignalRealActionsPageConfig extends FeedRealActionsPageBaseConfig	// class@001312
{
    public List mActions;
    public static final long serialVersionUID = 0xc3f524142fe8b233;

    public void UserSignalRealActionsPageConfig(){
       super();
    }
    public List getActions(){
       return this.mActions;
    }
}
