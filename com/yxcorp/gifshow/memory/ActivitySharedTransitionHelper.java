package com.yxcorp.gifshow.memory.ActivitySharedTransitionHelper;
import com.yxcorp.gifshow.memory.ActivitySharedTransitionHelper$b;
import nsd.u;
import java.lang.Object;
import java.util.ArrayList;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.memory.ActivitySharedTransitionHelper$a;
import java.util.List;

public class ActivitySharedTransitionHelper	// class@001d3e
{
    public final List a;
    public final List b;
    public final List c;
    public static final ActivitySharedTransitionHelper$b d;

    static {
       ActivitySharedTransitionHelper.d = new ActivitySharedTransitionHelper$b(null);
    }
    public void ActivitySharedTransitionHelper(){
       super();
       this.a = new ArrayList();
       this.b = new ArrayList();
       this.c = new ArrayList();
    }
    public final void a(int p0,l p1){
       ActivitySharedTransitionHelper uActivitySha = ActivitySharedTransitionHelper.class;
       if (PatchProxy.isSupport(uActivitySha) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uActivitySha, "2")) {
          return;
       }
       a.p(p1, "factory");
       this.b.add(new ActivitySharedTransitionHelper$a(p0, p1));
       return;
    }
}
