package com.yxcorp.gifshow.action.startup.FeedRealActionsPageBaseConfig;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;

public abstract class FeedRealActionsPageBaseConfig implements Serializable	// class@00132a
{
    public String mPage;
    public String[] mSources;
    public static final long serialVersionUID = 0xc3f524142fe8b233;

    public void FeedRealActionsPageBaseConfig(){
       super();
    }
    public abstract List getActions();
}
