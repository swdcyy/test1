package com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupKey;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MakeupKey extends Enum	// class@0012f9
{
    public final String mName;
    public static final MakeupKey[] $VALUES;
    public static final MakeupKey DEFAULT;
    public static final MakeupKey EDIT;
    public static final MakeupKey IM_CHAT;
    public static final MakeupKey LIVE;
    public static final MakeupKey RECORD;

    static {
       MakeupKey makeupKey = new MakeupKey("DEFAULT", 0, "default");
       MakeupKey.DEFAULT = makeupKey;
       MakeupKey makeupKey1 = new MakeupKey("RECORD", 1, "record");
       MakeupKey.RECORD = makeupKey1;
       MakeupKey makeupKey2 = new MakeupKey("LIVE", 2, "live");
       MakeupKey.LIVE = makeupKey2;
       MakeupKey makeupKey3 = new MakeupKey("IM_CHAT", 3, "im_chat");
       MakeupKey.IM_CHAT = makeupKey3;
       MakeupKey makeupKey4 = new MakeupKey("EDIT", 4, "edit");
       MakeupKey.EDIT = makeupKey4;
       MakeupKey[] makeupKeyArr = new MakeupKey[]{makeupKey,makeupKey1,makeupKey2,makeupKey3,makeupKey4};
       MakeupKey.$VALUES = makeupKeyArr;
    }
    public void MakeupKey(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static MakeupKey valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MakeupKey.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MakeupKey.class, p0);
    }
    public static MakeupKey[] values(){
       Object obj = PatchProxy.apply(null, null, MakeupKey.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MakeupKey.$VALUES.clone();
    }
}
