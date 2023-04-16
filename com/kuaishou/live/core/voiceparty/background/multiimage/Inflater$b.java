package com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$b;
import ho2.e;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater;
import java.lang.Object;
import java.util.Map;
import ho2.c;
import ho2.m$b;
import trd.t0;
import java.util.LinkedHashMap;
import trd.s0;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import java.lang.CharSequence;
import kotlin.jvm.internal.a;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import ho2.g;
import asd.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.background.multiimage.Url;
import ho2.p;
import qrd.l1;
import csd.b;
import ho2.b;
import ho2.n;
import com.kuaishou.live.core.voiceparty.background.multiimage.Image;
import ho2.o;

public final class Inflater$b implements e	// class@001356
{
    public final Map a;
    public final Inflater b;

    public void Inflater$b(Inflater p0){
       Map$Entry uEntry;
       CharSequence value;
       this.b = p0;
       super();
       Map map = t0.n0(p0.e.c(), p0.f.e);
       LinkedHashMap linkedHashMa = new LinkedHashMap(s0.j(map.size()));
       Iterator iterator = map.entrySet().iterator();
       while (true) {
          if (iterator.hasNext()) {
             uEntry = iterator.next();
             Object key = uEntry.getKey();
             value = uEntry.getValue();
             int i = (value == null || !value.length())? 1: 0;
             i = i ^ 1;
             if (i) {
                Object value1 = uEntry.getValue();
                a.m(value1);
                linkedHashMa.put(key, value1);
             }else {
                break ;
             }
          }else {
             this.a = linkedHashMa;
             return;
          }
       }
       throw new IllegalStateException("variable "+uEntry.getKey()+" don\'t have a value".toString());
    }
    public Object a(g p0,c p1){
       l1 a;
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, Inflater$b.class, "2");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0.c() instanceof p) {
          throw new IllegalStateException("lottie src can\'t use param".toString());
       }
       Map map = p0.b();
       if (map != null) {
          Iterator iterator = map.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             this.e("lottie asset "+key, uEntry.getValue());
          }
          a = l1.a;
       }else {
          a = null;
       }
       if (a == b.h()) {
          return a;
       }else {
          return l1.a;
       }
    }
    public Object b(b p0,c p1){
       return l1.a;
    }
    public Object c(n p0,c p1){
       return l1.a;
    }
    public Object d(Image p0,c p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, Inflater$b.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       this.e("image", p0.c());
       return l1.a;
    }
    public final void e(String p0,Url p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Inflater$b.class, "3")) {
          return;
       }
       if (!p1 instanceof o || this.b.e.c().containsKey(p1.a())) {
          return;
       }
       throw new IllegalStateException(p0+" uses undeclared variable "+p1.a().toString());
    }
}
