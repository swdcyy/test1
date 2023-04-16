package com.kuaishou.live.core.show.subscribe.edit.SubscribeDialogParams$DisplayMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SubscribeDialogParams$DisplayMode extends Enum	// class@0010f3
{
    public final int mMode;
    public static final SubscribeDialogParams$DisplayMode[] $VALUES;
    public static final SubscribeDialogParams$DisplayMode DetailList;
    public static final SubscribeDialogParams$DisplayMode SelectSubscribe;

    static {
       SubscribeDialogParams$DisplayMode uDisplayMode = new SubscribeDialogParams$DisplayMode("SelectSubscribe", 0, 1);
       SubscribeDialogParams$DisplayMode.SelectSubscribe = uDisplayMode;
       SubscribeDialogParams$DisplayMode uDisplayMode1 = new SubscribeDialogParams$DisplayMode("DetailList", 1, 2);
       SubscribeDialogParams$DisplayMode.DetailList = uDisplayMode1;
       SubscribeDialogParams$DisplayMode[] uDisplayMode2 = new SubscribeDialogParams$DisplayMode[]{uDisplayMode,uDisplayMode1};
       SubscribeDialogParams$DisplayMode.$VALUES = uDisplayMode2;
    }
    public void SubscribeDialogParams$DisplayMode(String p0,int p1,int p2){
       super(p0, p1);
       this.mMode = p2;
    }
    public static SubscribeDialogParams$DisplayMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubscribeDialogParams$DisplayMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SubscribeDialogParams$DisplayMode.class, p0);
    }
    public static SubscribeDialogParams$DisplayMode[] values(){
       Object obj = PatchProxy.apply(null, null, SubscribeDialogParams$DisplayMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SubscribeDialogParams$DisplayMode.$VALUES.clone();
    }
    public int getMode(){
       return this.mMode;
    }
}
