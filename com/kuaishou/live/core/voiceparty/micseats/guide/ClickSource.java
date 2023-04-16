package com.kuaishou.live.core.voiceparty.micseats.guide.ClickSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ClickSource extends Enum	// class@0015b0
{
    public static final ClickSource[] $VALUES;
    public static final ClickSource BUTTON;
    public static final ClickSource PHOTO;

    static {
       ClickSource uClickSource1;
       ClickSource[] uClickSource = new ClickSource[]{uClickSource1,uClickSource1};
       uClickSource1 = new ClickSource("BUTTON", 0);
       ClickSource.BUTTON = uClickSource1;
       uClickSource1 = new ClickSource("PHOTO", 1);
       ClickSource.PHOTO = uClickSource1;
       ClickSource.$VALUES = uClickSource;
    }
    public void ClickSource(String p0,int p1){
       super(p0, p1);
    }
    public static ClickSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClickSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ClickSource.class, p0);
    }
    public static ClickSource[] values(){
       Object obj = PatchProxy.apply(null, null, ClickSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ClickSource.$VALUES.clone();
    }
}
