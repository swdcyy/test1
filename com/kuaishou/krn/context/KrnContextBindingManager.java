package com.kuaishou.krn.context.KrnContextBindingManager;
import java.util.ArrayList;
import java.lang.Object;
import lj0.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import java.util.List;
import com.kuaishou.krn.context.KrnContextBindingManager$remove$1;
import msd.l;
import trd.y;

public final class KrnContextBindingManager	// class@000851
{
    public static final List a;
    public static final KrnContextBindingManager b;

    static {
       KrnContextBindingManager.b = new KrnContextBindingManager();
       KrnContextBindingManager.a = new ArrayList();
    }
    public void KrnContextBindingManager(){
       super();
    }
    public synchronized final void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnContextBindingManager.class, "1")) {
          return;
       }
       a.p(p0, "krnContext");
       KrnContextBindingManager.a.add(new WeakReference(p0));
       return;
    }
    public synchronized final void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnContextBindingManager.class, "2")) {
          return;
       }
       a.p(p0, "krnContext");
       y.K0(KrnContextBindingManager.a, new KrnContextBindingManager$remove$1(p0));
       return;
    }
}
