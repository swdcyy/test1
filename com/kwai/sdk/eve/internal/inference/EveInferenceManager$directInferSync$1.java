package com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferSync$1;
import io.reactivex.g;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager;
import zn7.a;
import java.lang.String;
import ml5.a;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferSync$1$1;
import msd.l;

public final class EveInferenceManager$directInferSync$1 implements g	// class@00155d
{
    public final EveInferenceManager b;
    public final a c;
    public final String d;
    public final a e;
    public final String f;

    public void EveInferenceManager$directInferSync$1(EveInferenceManager p0,a p1,String p2,a p3,String p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveInferenceManager$directInferSync$1.class, "1")) {
          return;
       }
       a.p(p0, "source");
       this.b.d(this.c, this.f, this.d, this.e, new EveInferenceManager$directInferSync$1$1(p0));
       return;
    }
}
