package com.tachikoma.component.scroll.constants.OverScrollMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class OverScrollMode extends Enum	// class@000d27
{
    public final int mode;
    public static final OverScrollMode[] $VALUES;
    public static final OverScrollMode always;
    public static final OverScrollMode auto;
    public static final OverScrollMode never;

    static {
       OverScrollMode overScrollMo = new OverScrollMode("always", 0, 0);
       OverScrollMode.always = overScrollMo;
       OverScrollMode overScrollMo1 = new OverScrollMode("auto", 1, 1);
       OverScrollMode.auto = overScrollMo1;
       OverScrollMode overScrollMo2 = new OverScrollMode("never", 2, 2);
       OverScrollMode.never = overScrollMo2;
       OverScrollMode[] overScrollMo3 = new OverScrollMode[]{overScrollMo,overScrollMo1,overScrollMo2};
       OverScrollMode.$VALUES = overScrollMo3;
    }
    public void OverScrollMode(String p0,int p1,int p2){
       super(p0, p1);
       this.mode = p2;
    }
    public static OverScrollMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, OverScrollMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(OverScrollMode.class, p0);
    }
    public static OverScrollMode[] values(){
       Object obj = PatchProxy.apply(null, null, OverScrollMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return OverScrollMode.$VALUES.clone();
    }
}
