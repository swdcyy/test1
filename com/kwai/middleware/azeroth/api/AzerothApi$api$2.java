package com.kwai.middleware.azeroth.api.AzerothApi$api$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import e97.a;
import com.kwai.middleware.azeroth.Azeroth2;
import java.lang.Object;
import java.util.Objects;
import qrd.p;
import t97.a;
import java.lang.Class;

public final class AzerothApi$api$2 extends Lambda implements a	// class@000ef8
{
    public static final AzerothApi$api$2 INSTANCE;

    static {
       AzerothApi$api$2.INSTANCE = new AzerothApi$api$2();
    }
    public void AzerothApi$api$2(){
       super(0);
    }
    public final a invoke(){
       Objects.requireNonNull(Azeroth2.B);
       return Azeroth2.g.getValue().a(a.class);
    }
    public Object invoke(){
       return this.invoke();
    }
}
