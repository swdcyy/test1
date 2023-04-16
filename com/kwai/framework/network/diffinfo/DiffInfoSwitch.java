package com.kwai.framework.network.diffinfo.DiffInfoSwitch;
import com.kwai.framework.network.diffinfo.DiffInfoSwitch$isOpen$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.framework.network.diffinfo.DiffInfoSwitch$isKeyConfigOpen$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class DiffInfoSwitch	// class@000c01
{
    public static final p a;
    public static final p b;
    public static final DiffInfoSwitch c;

    static {
       DiffInfoSwitch.c = new DiffInfoSwitch();
       DiffInfoSwitch.a = s.c(DiffInfoSwitch$isOpen$2.INSTANCE);
       DiffInfoSwitch.b = s.c(DiffInfoSwitch$isKeyConfigOpen$2.INSTANCE);
    }
    public void DiffInfoSwitch(){
       super();
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, DiffInfoSwitch.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = DiffInfoSwitch.b.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, DiffInfoSwitch.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = DiffInfoSwitch.a.getValue();
       }
       return obj.booleanValue();
    }
}
