package com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveCommentNoticeChannelType extends Enum	// class@000f94
{
    public final int mValue;
    public static final LiveCommentNoticeChannelType[] $VALUES;
    public static final LiveCommentNoticeChannelType API_ANCHOR_STATUS;
    public static final LiveCommentNoticeChannelType API_DELAY_INFO;
    public static final LiveCommentNoticeChannelType API_PLAYBACK_STATUS;
    public static final LiveCommentNoticeChannelType API_USER_IO_STATUS;
    public static final LiveCommentNoticeChannelType API_USER_STATUS;
    public static final LiveCommentNoticeChannelType LONG_CONNECTION;
    public static final LiveCommentNoticeChannelType PULL_REQUEST;

    static {
       LiveCommentNoticeChannelType liveCommentN = new LiveCommentNoticeChannelType("LONG_CONNECTION", 0, 1);
       LiveCommentNoticeChannelType.LONG_CONNECTION = liveCommentN;
       LiveCommentNoticeChannelType liveCommentN1 = new LiveCommentNoticeChannelType("API_USER_STATUS", 1, 8);
       LiveCommentNoticeChannelType.API_USER_STATUS = liveCommentN1;
       LiveCommentNoticeChannelType liveCommentN2 = new LiveCommentNoticeChannelType("API_ANCHOR_STATUS", 2, 16);
       LiveCommentNoticeChannelType.API_ANCHOR_STATUS = liveCommentN2;
       LiveCommentNoticeChannelType liveCommentN3 = new LiveCommentNoticeChannelType("API_DELAY_INFO", 3, 32);
       LiveCommentNoticeChannelType.API_DELAY_INFO = liveCommentN3;
       LiveCommentNoticeChannelType liveCommentN4 = new LiveCommentNoticeChannelType("API_PLAYBACK_STATUS", 4, 64);
       LiveCommentNoticeChannelType.API_PLAYBACK_STATUS = liveCommentN4;
       LiveCommentNoticeChannelType liveCommentN5 = new LiveCommentNoticeChannelType("PULL_REQUEST", 5, 128);
       LiveCommentNoticeChannelType.PULL_REQUEST = liveCommentN5;
       LiveCommentNoticeChannelType liveCommentN6 = new LiveCommentNoticeChannelType("API_USER_IO_STATUS", 6, 256);
       LiveCommentNoticeChannelType.API_USER_IO_STATUS = liveCommentN6;
       LiveCommentNoticeChannelType[] liveCommentN7 = new LiveCommentNoticeChannelType[]{liveCommentN,liveCommentN1,liveCommentN2,liveCommentN3,liveCommentN4,liveCommentN5,liveCommentN6};
       LiveCommentNoticeChannelType.$VALUES = liveCommentN7;
    }
    public void LiveCommentNoticeChannelType(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static int combineChannels(LiveCommentNoticeChannelType[] p0){
       int len = p0.length;
       int i1 = 0;
       for (int i = 0; i < len; i = i + 1) {
          i1 = i1 | p0[i].mValue;
       }
       return i1;
    }
    public static int getTotalChannels(){
       LiveCommentNoticeChannelType[] obj = PatchProxy.apply(null, null, LiveCommentNoticeChannelType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new LiveCommentNoticeChannelType[]{LiveCommentNoticeChannelType.LONG_CONNECTION,LiveCommentNoticeChannelType.API_USER_STATUS,LiveCommentNoticeChannelType.API_ANCHOR_STATUS,LiveCommentNoticeChannelType.API_DELAY_INFO,LiveCommentNoticeChannelType.API_PLAYBACK_STATUS,LiveCommentNoticeChannelType.PULL_REQUEST,LiveCommentNoticeChannelType.API_USER_IO_STATUS};
       return LiveCommentNoticeChannelType.combineChannels(obj);
    }
    public static LiveCommentNoticeChannelType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveCommentNoticeChannelType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveCommentNoticeChannelType.class, p0);
    }
    public static LiveCommentNoticeChannelType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveCommentNoticeChannelType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveCommentNoticeChannelType.$VALUES.clone();
    }
    public int getValue(){
       return this.mValue;
    }
    public boolean isSupportedBy(int p0){
       boolean b = (p0 & this.mValue)? true: false;
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveCommentNoticeChannelType.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveCommentNoticeChannelType{mValue="+this.mValue+'}';
    }
}
