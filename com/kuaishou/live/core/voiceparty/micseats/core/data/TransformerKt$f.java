package com.kuaishou.live.core.voiceparty.micseats.core.data.TransformerKt$f;
import erd.c;
import java.lang.Object;
import ss2.l;
import com.google.common.base.Optional;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import ht2.a;
import com.kuaishou.live.core.voiceparty.micseats.core.data.TransformerKt;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatInfo;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.Collection;
import ts2.d;
import ts2.e;
import ss2.d;
import ts2.j$c;
import ts2.j;
import java.util.Iterator;
import java.lang.Iterable;
import ts2.j$a;
import com.kwai.framework.model.user.UserInfo;
import vs2.a;
import qs2.r;

public final class TransformerKt$f implements c	// class@001583
{
    public static final TransformerKt$f a;

    static {
       TransformerKt$f.a = new TransformerKt$f();
    }
    public void TransformerKt$f(){
       super();
    }
    public Object a(Object p0,Object p1){
       Iterator obj1;
       Object obj2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       List obj = PatchProxy.applyTwoRefs(p0, p1, this, TransformerKt$f.class, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "<name for destructuring parameter 0>");
          a.p(p1, "micSeatChangedInfo");
          obj = p0.a();
          int i = p0.b();
          if (p1.isPresent()) {
             p1 = p1.get();
             a.o(p1, "micSeatChangedInfo.get\(\)");
             if (PatchProxy.isSupport(TransformerKt.class)) {
                obj1 = PatchProxy.applyThreeRefs(obj, Integer.valueOf(i), p1, null, TransformerKt.class, "9");
                if (obj1 != patchProxyRe) {
                   obj = obj1;
                }
             }
             if (i < p1.c()) {
                i = p1.a();
                QCurrentUser qCurrentUser = QCurrentUser.me();
                a.o(qCurrentUser, "QCurrentUser.me\(\)");
                d uod = e.a(obj, qCurrentUser.getId());
                if (uod != null) {
                   uod.c(j$c.a);
                }
                Integer integer = Integer.valueOf(i.mMicSeatId);
                obj1 = obj.iterator();
                while (true) {
                   if (obj1.hasNext()) {
                      obj2 = obj1.next();
                      int id = obj2.getId();
                      Object obj3 = (integer != null && id == integer.intValue())? 1: null;
                      if (!obj3) {
                         continue ;
                      }
                   }else {
                      obj2 = null;
                   }
                   if (obj2 != null) {
                      obj2.c(new j$a(a.b()));
                      obj2.b(r.f(i.mMicState));
                   }
                   obj = new l(obj, p1.c());
                   break ;
                }
             }else {
                p1 = new l(obj, i);
             }
          }else {
             p1 = new l(obj, i);
          }
          obj = p1;
       }
       return obj;
    }
}
