package com.kuaishou.live.core.voiceparty.background.multiimage.Inflater;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$a;
import nsd.u;
import android.content.Context;
import java.io.File;
import ho2.c;
import ho2.m$b;
import java.lang.Object;
import ho2.a;
import com.kuaishou.live.core.voiceparty.background.multiimage.MultiImageView;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.background.multiimage.Config;
import com.kuaishou.live.core.voiceparty.background.multiimage.Coordinate;
import asd.c;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$inflate$1;
import csd.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import qrd.j0;
import java.lang.IllegalStateException;
import ho2.d;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$b;
import java.util.List;
import ho2.e;
import ftd.j2;
import ftd.z0;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$inflate$3;
import kotlin.coroutines.CoroutineContext;
import msd.p;
import kotlinx.coroutines.a;

public final class Inflater	// class@00135b
{
    public final a a;
    public final MultiImageView b;
    public final Context c;
    public final File d;
    public final c e;
    public final m$b f;
    public static final Inflater$a g;

    static {
       Inflater.g = new Inflater$a(null);
    }
    public void Inflater(Context p0,File p1,c p2,m$b p3,u p4){
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.a = new a();
       Objects.requireNonNull(p2);
       c uoc = PatchProxy.apply(null, p2, c.class, "2");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = p2._config;
          if (uoc == null) {
             uoc = new Config(null, 1, null);
          }
       }
       this.b = new MultiImageView(p0, uoc, p2.a());
       return;
    }
    public final Object a(c p0){
       Inflater$inflate$1 l$2;
       Inflater$inflate$1 l$1;
       Inflater$inflate$1 l$0;
       Inflater$inflate$1 obj = PatchProxy.applyOneRefs(p0, this, Inflater.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof Inflater$inflate$1) {
          obj = p0;
          Inflater$inflate$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          int i1 = label & i;
          if (i1) {
             int i2 = label - i;
             obj.label = i2;
          label_0025 :
             Inflater$inflate$1 result = obj.result;
             Object obj1 = b.h();
             Inflater$inflate$1 label1 = obj.label;
             int i3 = 1;
             if (label1 != null) {
                if (label1 != i3) {
                   if (label1 == 2) {
                      j0.n(result);
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   label1 = obj.L$3;
                   l$2 = obj.L$2;
                   l$1 = obj.L$1;
                   l$0 = obj.L$0;
                   j0.n(result);
                }
             }else {
                j0.n(result);
                l$1 = new Ref$ObjectRef();
                l$1.element = new Inflater$b(this);
                l$2 = this.e.b();
                Iterator iterator = l$2.iterator();
                l$0 = this;
             }
             while (true) {
                if (label1.hasNext()) {
                   result = label1.next();
                   Object obj2 = result;
                   obj.L$0 = l$0;
                   obj.L$1 = l$1;
                   obj.L$2 = l$2;
                   obj.L$3 = label1;
                   obj.L$4 = result;
                   obj.L$5 = obj2;
                   obj.label = i3;
                   if (obj2.a(l$1.element, obj) == obj1) {
                      return obj1;
                   }
                   continue ;
                }else {
                   obj.L$0 = l$0;
                   obj.L$1 = l$1;
                   obj.label = 2;
                   result = a.i(z0.g().A(), new Inflater$inflate$3(l$0, l$1, null), obj);
                   if (result == obj1) {
                      return obj1;
                   }else {
                      break ;
                   }
                }
             }
             return result;
          }
       }
       obj = new Inflater$inflate$1(this, p0);
       goto label_0025 ;
    }
}
