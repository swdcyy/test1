package com.kwai.middleware.azeroth.AzerothStorage;
import com.kwai.middleware.azeroth.AzerothStorage$b;
import nsd.u;
import com.kwai.middleware.azeroth.AzerothStorage$a;
import java.lang.reflect.Type;
import el.a;
import java.lang.Object;
import com.kwai.middleware.azeroth.AzerothStorage$mStore$2;
import msd.a;
import qrd.p;
import qrd.s;
import xb7.a;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class AzerothStorage	// class@000d54
{
    public final p a;
    public static final Type b;
    public static final AzerothStorage$b c;

    static {
       AzerothStorage.c = new AzerothStorage$b(null);
       AzerothStorage.b = new AzerothStorage$a().getType();
    }
    public void AzerothStorage(){
       super();
       this.a = s.c(AzerothStorage$mStore$2.INSTANCE);
    }
    public final a a(){
       return this.a.getValue();
    }
    public final void b(String p0){
       a.q(p0, "currentHost");
       a.d(this.a(), "KEY_CURRENT_HOST", p0, false, 4, null);
    }
}
