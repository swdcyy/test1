package com.kwai.middleware.azeroth.AzerothConfig;
import z1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.middleware.azeroth.AzerothConfig$networkConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import y97.a;
import q97.a;
import n97.b;
import z97.d;

public final class AzerothConfig	// class@000d50
{
    public final p a;
    public boolean b;
    public a c;
    public e d;
    public a0 e;
    public a f;
    public b g;
    public a h;
    public a i;
    public c j;
    public final k k;

    public void AzerothConfig(k p0){
       a.q(p0, "networkConfigSupplier");
       super();
       this.k = p0;
       this.a = s.c(new AzerothConfig$networkConfig$2(this));
       this.c = new a();
       this.d = new a();
       this.i = new b();
       this.j = new d();
    }
}
