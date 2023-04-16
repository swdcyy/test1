package com.yxcorp.gifshow.prettify.makeup.c$d;
import erd.g;
import com.yxcorp.gifshow.prettify.makeup.c;
import java.lang.Object;
import com.yxcorp.gifshow.prettify.makeup.c$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.prettify.makeup.d;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupKey;
import com.yxcorp.gifshow.prettify.makeup.m;
import kotlin.jvm.internal.a;
import w46.b;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import com.yxcorp.gifshow.prettify.makeup.i;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupItem;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import t16.a;
import f1c.f;
import l16.b;

public final class c$d implements g	// class@00116f
{
    public final c b;

    public void c$d(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$d.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, p0, c.class, "3")) {
             String t = c.t;
             int i = 0;
             Object[] objArray1 = new Object[i];
             a.D().w(t, "doApplyMakeupEffect suiteId "+p0.p+" delayTime "+p0.o, objArray1);
             m om = d.a().b(p0.n);
             a.o(om, "MakeupConfigManager.getI¡­tMakeupModule\(mMakeupKey\)");
             if (!om.l()) {
                a.m(t);
                Object[] objArray2 = new Object[i];
                a.D().t(t, "doApplyMakeupEffect before model init", objArray2);
             }else {
                om.p(objArray);
                c p = p0.p;
                String str = (p != null)? StringsKt__StringsKt.o5(p).toString(): objArray;
                c uoc = (str == null || !str.length())? 1: null;
                if (!uoc) {
                   long l = (long)p0.o * (long)1000;
                   om.p(objArray);
                   MakeupSuite makeupSuite = om.h(str);
                   if (makeupSuite != null && !makeupSuite.isEmpty()) {
                      boolean b = i.o(makeupSuite);
                      List list = i.k(makeupSuite);
                      a.o(list, "MakeupDownloadHelper.get¡­istResources\(makeupSuite\)");
                      if (q.f(list) && b) {
                         Object[] objArray3 = new Object[i];
                         a.D().w(t, "no need download "+makeupSuite.mName, objArray3);
                         p0.f2(makeupSuite, l);
                      }else {
                         i.f(new a("record", "taken_in_resource"), makeupSuite, b, list, new f(p0, makeupSuite, l));
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
