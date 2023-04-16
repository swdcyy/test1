package com.yxcorp.gifshow.prettify.PrettifyPreferenceKey;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PrettifyPreferenceKey extends Enum	// class@0010e2
{
    public String mKey;
    public static final PrettifyPreferenceKey[] $VALUES;
    public static final PrettifyPreferenceKey EDIT;
    public static final PrettifyPreferenceKey IM_CHAT;
    public static final PrettifyPreferenceKey LIVE;
    public static final PrettifyPreferenceKey RECORD;

    static {
       PrettifyPreferenceKey prettifyPref = new PrettifyPreferenceKey("RECORD", 0, "record");
       PrettifyPreferenceKey.RECORD = prettifyPref;
       PrettifyPreferenceKey prettifyPref1 = new PrettifyPreferenceKey("EDIT", 1, "edit");
       PrettifyPreferenceKey.EDIT = prettifyPref1;
       PrettifyPreferenceKey prettifyPref2 = new PrettifyPreferenceKey("LIVE", 2, "live");
       PrettifyPreferenceKey.LIVE = prettifyPref2;
       PrettifyPreferenceKey prettifyPref3 = new PrettifyPreferenceKey("IM_CHAT", 3, "im_chat");
       PrettifyPreferenceKey.IM_CHAT = prettifyPref3;
       PrettifyPreferenceKey[] prettifyPref4 = new PrettifyPreferenceKey[]{prettifyPref,prettifyPref1,prettifyPref2,prettifyPref3};
       PrettifyPreferenceKey.$VALUES = prettifyPref4;
    }
    public void PrettifyPreferenceKey(String p0,int p1,String p2){
       super(p0, p1);
       this.mKey = p2;
    }
    public static PrettifyPreferenceKey valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyPreferenceKey.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PrettifyPreferenceKey.class, p0);
    }
    public static PrettifyPreferenceKey[] values(){
       Object obj = PatchProxy.apply(null, null, PrettifyPreferenceKey.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PrettifyPreferenceKey.$VALUES.clone();
    }
    public String getKey(){
       return this.mKey;
    }
}
