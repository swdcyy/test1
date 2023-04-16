package com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager;
import zn7.a;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$1;
import msd.l;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$3;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$2;
import java.lang.String;
import ml5.a;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$4;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1;

public final class EveInferenceManager$directInferAsync$5 implements Runnable	// class@00155b
{
    public final EveInferenceManager b;
    public final a c;
    public final EveInferenceManager$directInferAsync$1 d;
    public final l e;
    public final EveInferenceManager$directInferAsync$3 f;
    public final EveInferenceManager$directInferAsync$2 g;
    public final String h;
    public final String i;
    public final a j;
    public final EveInferenceManager$directInferAsync$4 k;

    public void EveInferenceManager$directInferAsync$5(EveInferenceManager p0,a p1,EveInferenceManager$directInferAsync$1 p2,l p3,EveInferenceManager$directInferAsync$3 p4,EveInferenceManager$directInferAsync$2 p5,String p6,String p7,a p8,EveInferenceManager$directInferAsync$4 p9){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       this.j = p8;
       this.k = p9;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EveInferenceManager$directInferAsync$5.class, "1")) {
          return;
       }
       this.c.o(new EveInferenceManager$directInferAsync$5$1(this));
       return;
    }
}
