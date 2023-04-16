package ec9.n1;
import ec9.k;
import ec9.b1;
import ec9.f1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import cc9.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa6.b;
import cc9.q;
import java.util.HashMap;
import java.util.List;
import java.lang.Integer;
import cc9.h;
import cc9.n;
import ec9.z;
import java.util.Objects;
import ec9.z$a;
import ec9.a;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.Map;
import cc9.p;
import ec9.e0;
import ec9.e0$a;
import com.kuaishou.android.model.music.Music;
import android.content.Intent;
import cc9.j;
import ec9.w;
import ec9.w$a;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import u80.d;
import cc9.r;
import cc9.t;
import cc9.m;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;

public final class n1 extends k	// class@00218b
{
    public final f1 b;

    public void n1(b1 p0,f1 p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.b = p1;
    }
    public void c(a p0){
       b1 uob1;
       n1 b1;
       b uob;
       int i1;
       b uob1;
       Object obj5;
       m om;
       Object obj = this;
       z$a obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, n1.class, str)) {
       }else {
          a.p(obj1, "action");
          q oq = this.a().j();
          if (obj1.b() == oq.b()) {
             int i = 0;
             boolean b = false;
             this.a().h(q.a(oq, null, 0, 0, i, b, false, false, false, 239, null));
             q oq1 = this.a().j();
             HashMap hashMap = oq1.i();
             h oh = hashMap.get(Integer.valueOf(oq1.b()));
             String str1 = "2";
             String str2 = "viewModel";
             String str3 = "provider";
             if (oh instanceof n) {
                obj1 = z.d;
                uob1 = this.a();
                b1 = obj.b;
                Objects.requireNonNull(obj1);
                if (!PatchProxy.applyVoidTwoRefs(uob1, b1, obj1, z$a.class, str)) {
                   a.p(uob1, str3);
                   a.p(b1, str2);
                   uob = uob1.j();
                   z obj2 = uob.i().get(Integer.valueOf(uob.b()));
                   if (obj2 instanceof n) {
                      i = obj2;
                   }
                   Object obj3 = i;
                   if (obj3 != null) {
                      obj2 = b1.t0().b(13);
                      if (obj2 != null) {
                         i1 = uob.b();
                         z oz = z.class;
                         if (!PatchProxy.isSupport(oz) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), obj2, oz, str1)) {
                            uob1 = obj2.b.get(Integer.valueOf(i1));
                            if (uob1 != null) {
                               b9.a(uob1);
                            }
                         }
                      }
                      int i2 = (obj3.b() != 2)? 0: obj3.b();
                      uob.i().put(Integer.valueOf(uob.b()), n.a(obj3, null, -1, i2, false, 9, null));
                      uob1.h(q.a(uob, null, 0, 0, null, 0, false, false, false, 255, null));
                   }
                }
             }else if(oh instanceof p){
                e0$a d = e0.d;
                uob1 = this.a();
                b1 = obj.b;
                Objects.requireNonNull(d);
                if (!PatchProxy.applyVoidTwoRefs(uob1, b1, d, e0$a.class, str)) {
                   a.p(uob1, str3);
                   a.p(b1, str2);
                   uob = uob1.j();
                   e0 obj4 = uob.i().get(Integer.valueOf(uob.b()));
                   if (obj4 instanceof p) {
                      i = obj4;
                   }
                   obj5 = i;
                   if (obj5 != null) {
                      obj4 = b1.t0().b(22);
                      if (obj4 != null) {
                         i1 = uob.b();
                         e0 uoe0 = e0.class;
                         if (!PatchProxy.isSupport(uoe0) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), obj4, uoe0, str1)) {
                            uob1 = obj4.b.get(Integer.valueOf(i1));
                            if (uob1 != null) {
                               b9.a(uob1);
                            }
                         }
                      }
                      uob.i().put(Integer.valueOf(uob.b()), p.a(obj5, null, -1, null, false, 13, null));
                      uob1.h(q.a(uob, null, 0, 0, null, false, false, false, false, 255, null));
                   }
                }
             }else if(oh instanceof j){
                w$a d1 = w.d;
                uob1 = this.a();
                b1 = obj.b;
                Objects.requireNonNull(d1);
                if (!PatchProxy.applyVoidTwoRefs(uob1, b1, d1, w$a.class, str)) {
                   a.p(uob1, str3);
                   a.p(b1, str2);
                   uob = uob1.j();
                   w obj6 = uob.i().get(Integer.valueOf(uob.b()));
                   if (obj6 instanceof j) {
                      i = obj6;
                   }
                   obj5 = i;
                   if (obj5 != null) {
                      obj6 = b1.t0().b(31);
                      if (obj6 != null) {
                         i1 = uob.b();
                         w ow = w.class;
                         if (!PatchProxy.isSupport(ow) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), obj6, ow, str1)) {
                            uob1 = obj6.b.get(Integer.valueOf(i1));
                            if (uob1 != null) {
                               b9.a(uob1);
                            }
                         }
                      }
                      uob.i().put(Integer.valueOf(uob.b()), j.a(obj5, null, -1, false, null, 13, null));
                      uob1.h(q.a(uob, null, 0, 0, null, false, false, false, false, 255, null));
                   }
                }
             }else if(oh instanceof r){
                if (oh.a()) {
                   obj.b.w0(new t(b, obj1.b()));
                }
             }else if(oh instanceof m){
                if (oh.a()) {
                   hashMap = oq.i();
                   Integer integer = Integer.valueOf(obj1.b());
                   if (PatchProxy.isSupport(m.class)) {
                      om = PatchProxy.applyOneRefs(Boolean.FALSE, oh, m.class, str);
                      if (om != PatchProxyResult.class) {
                      label_02dc :
                         hashMap.put(integer, om);
                      }
                   }
                   om = new m(b);
                   goto label_02dc ;
                }
                this.a().h(oq);
             }
          }
       }
       return;
    }
}
