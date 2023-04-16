package com.kuaishou.live.basic.model.StreamType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;

public final class StreamType extends Enum	// class@000ce1
{
    public int mValue;
    public static final StreamType[] $VALUES;
    public static final StreamType AUDIO;
    public static final StreamType GAME_LIVE;
    public static final StreamType KTV;
    public static final StreamType LINE_LIVE;
    public static final StreamType VIDEO;
    public static final StreamType VOICEPARTY;
    public static final long serialVersionUID;

    static {
       StreamType streamType = new StreamType("VIDEO", 0, 1);
       StreamType.VIDEO = streamType;
       StreamType streamType1 = new StreamType("AUDIO", 1, 2);
       StreamType.AUDIO = streamType1;
       StreamType streamType2 = new StreamType("VOICEPARTY", 2, 3);
       StreamType.VOICEPARTY = streamType2;
       StreamType streamType3 = new StreamType("KTV", 3, 4);
       StreamType.KTV = streamType3;
       StreamType streamType4 = new StreamType("GAME_LIVE", 4, 5);
       StreamType.GAME_LIVE = streamType4;
       StreamType streamType5 = new StreamType("LINE_LIVE", 5, 6);
       StreamType.LINE_LIVE = streamType5;
       StreamType[] streamTypeAr = new StreamType[]{streamType,streamType1,streamType2,streamType3,streamType4,streamType5};
       StreamType.$VALUES = streamTypeAr;
    }
    public void StreamType(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static StreamType fromInt(int p0){
       StreamType streamType = StreamType.class;
       if (PatchProxy.isSupport(streamType)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, streamType, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return StreamType.fromInt(p0, StreamType.VIDEO);
    }
    public static StreamType fromInt(int p0,StreamType p1){
       switch (p0){
           case 1:
             return StreamType.VIDEO;
           case 2:
             return StreamType.AUDIO;
           case 3:
             return StreamType.VOICEPARTY;
           case 4:
             return StreamType.KTV;
           case 5:
             return StreamType.GAME_LIVE;
           case 6:
             return StreamType.LINE_LIVE;
           default:
             return p1;
       }
    }
    public static StreamType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StreamType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(StreamType.class, p0);
    }
    public static StreamType[] values(){
       Object obj = PatchProxy.apply(null, null, StreamType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return StreamType.$VALUES.clone();
    }
    public int toInt(){
       return this.mValue;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, StreamType.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = this.toInt();
       if (i == 2) {
          return "LIVE_VOICE";
       }
       if (i == 3 || i == 4) {
          return "CHATROOM";
       }
       if (i == 5) {
          return "DOWNLOAD_MATE";
       }
       if (i != 6) {
          return "LIVE_VIDEO";
       }
       return "LIVE_ONLINE";
    }
}
