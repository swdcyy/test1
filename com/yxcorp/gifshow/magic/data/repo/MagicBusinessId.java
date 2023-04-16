package com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MagicBusinessId extends Enum	// class@001b8a
{
    public final int mId;
    public static final MagicBusinessId[] $VALUES;
    public static final MagicBusinessId EDIT;
    public static final MagicBusinessId IM_CHAT;
    public static final MagicBusinessId KTV;
    public static final MagicBusinessId LIVE;
    public static final MagicBusinessId LIVE_VR_IMAGE;
    public static final MagicBusinessId LOCAL_CHAT;
    public static final MagicBusinessId PHOTO;
    public static final MagicBusinessId POP_AR;
    public static final MagicBusinessId STORY;
    public static final MagicBusinessId VIDEO;

    static {
       MagicBusinessId magicBusines = new MagicBusinessId("VIDEO", 0, 0);
       MagicBusinessId.VIDEO = magicBusines;
       MagicBusinessId magicBusines1 = new MagicBusinessId("LIVE", 1, 2);
       MagicBusinessId.LIVE = magicBusines1;
       MagicBusinessId magicBusines2 = new MagicBusinessId("PHOTO", 2, 4);
       MagicBusinessId.PHOTO = magicBusines2;
       MagicBusinessId magicBusines3 = new MagicBusinessId("KTV", 3, 6);
       MagicBusinessId.KTV = magicBusines3;
       MagicBusinessId magicBusines4 = new MagicBusinessId("STORY", 4, 10);
       MagicBusinessId.STORY = magicBusines4;
       MagicBusinessId magicBusines5 = new MagicBusinessId("LOCAL_CHAT", 5, 16);
       MagicBusinessId.LOCAL_CHAT = magicBusines5;
       MagicBusinessId magicBusines6 = new MagicBusinessId("EDIT", 6, 19);
       MagicBusinessId.EDIT = magicBusines6;
       MagicBusinessId magicBusines7 = new MagicBusinessId("LIVE_VR_IMAGE", 7, 20);
       MagicBusinessId.LIVE_VR_IMAGE = magicBusines7;
       MagicBusinessId magicBusines8 = new MagicBusinessId("POP_AR", 8, 21);
       MagicBusinessId.POP_AR = magicBusines8;
       MagicBusinessId magicBusines9 = new MagicBusinessId("IM_CHAT", 9, 23);
       MagicBusinessId.IM_CHAT = magicBusines9;
       MagicBusinessId[] magicBusines10 = new MagicBusinessId[10];
       magicBusines10[0] = magicBusines;
       magicBusines10[1] = magicBusines1;
       magicBusines10[2] = magicBusines2;
       magicBusines10[3] = magicBusines3;
       magicBusines10[4] = magicBusines4;
       magicBusines10[5] = magicBusines5;
       magicBusines10[6] = magicBusines6;
       magicBusines10[7] = magicBusines7;
       magicBusines10[8] = magicBusines8;
       magicBusines10[9] = magicBusines9;
       MagicBusinessId.$VALUES = magicBusines10;
    }
    public void MagicBusinessId(String p0,int p1,int p2){
       super(p0, p1);
       this.mId = p2;
    }
    public static MagicBusinessId getMagicBizId(int p0){
       if (p0 == 2) {
          return MagicBusinessId.LIVE;
       }
       if (p0 == 4) {
          return MagicBusinessId.PHOTO;
       }
       if (p0 == 6) {
          return MagicBusinessId.KTV;
       }
       if (p0 == 10) {
          return MagicBusinessId.STORY;
       }
       if (p0 == 16) {
          return MagicBusinessId.LOCAL_CHAT;
       }
       if (p0 == 23) {
          return MagicBusinessId.IM_CHAT;
       }
       switch (p0){
           case 19:
             return MagicBusinessId.EDIT;
           case 20:
             return MagicBusinessId.LIVE_VR_IMAGE;
           case 21:
             return MagicBusinessId.POP_AR;
           default:
             return MagicBusinessId.VIDEO;
       }
    }
    public static MagicBusinessId valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MagicBusinessId.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MagicBusinessId.class, p0);
    }
    public static MagicBusinessId[] values(){
       Object obj = PatchProxy.apply(null, null, MagicBusinessId.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MagicBusinessId.$VALUES.clone();
    }
}
