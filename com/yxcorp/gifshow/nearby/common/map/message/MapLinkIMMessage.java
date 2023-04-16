package com.yxcorp.gifshow.nearby.common.map.message.MapLinkIMMessage;
import java.io.Serializable;
import com.yxcorp.gifshow.nearby.common.map.message.MapLinkIMMessage$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;

public final class MapLinkIMMessage implements Serializable	// class@00211c
{
    public final String mLeftIcon;
    public final String mLink;
    public final String mLinkMessage;
    public final String mSubtitle;
    public final String mTargetUid;
    public final String mTextMessage;
    public final String mTitle;
    public final int mType;
    public static final MapLinkIMMessage$a Companion;
    public static final long serialVersionUID;

    static {
       MapLinkIMMessage.Companion = new MapLinkIMMessage$a(null);
    }
    public void MapLinkIMMessage(){
       super();
       this.mType = -1;
       this.mTargetUid = "";
       this.mLinkMessage = "";
       this.mTextMessage = "";
       this.mTitle = "";
       this.mSubtitle = "";
       this.mLeftIcon = "";
       this.mLink = "";
    }
    public static void getMType$annotations(){
    }
    public final String getMLeftIcon(){
       return this.mLeftIcon;
    }
    public final String getMLink(){
       return this.mLink;
    }
    public final String getMLinkMessage(){
       return this.mLinkMessage;
    }
    public final String getMSubtitle(){
       return this.mSubtitle;
    }
    public final String getMTargetUid(){
       return this.mTargetUid;
    }
    public final String getMTextMessage(){
       return this.mTextMessage;
    }
    public final String getMTitle(){
       return this.mTitle;
    }
    public final int getMType(){
       return this.mType;
    }
}
