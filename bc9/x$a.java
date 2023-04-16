package bc9.x$a;
import cc9.i;
import bc9.x;
import java.lang.Object;
import cc9.q;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cc9.h;
import cc9.j;
import u80.d;
import com.yxcorp.gifshow.camera.record.assistant.a;
import dc9.c;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.camera.record.base.b;
import k2b.e0;
import java.util.Objects;
import java.lang.Boolean;
import java.util.List;
import ec9.j;
import cc9.d;
import sa6.a;
import vf9.f0;
import android.content.Intent;
import com.kwai.feature.post.api.music.data.MusicSource;
import vf9.s;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Number;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Integer;
import androidx.viewpager.widget.ViewPager;
import bc9.g;
import android.view.ViewGroup;
import cc9.p;

public final class x$a implements i	// class@000409
{
    public final x a;

    public void x$a(x p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       x$a a;
       boolean b1;
       int i;
       Integer integer;
       x w;
       f0 j;
       Object obj = this;
       x obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       x ox = x.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, x$a.class, "1")) {
       }else {
          a.p(obj1, "newState");
          h oh = obj1.c();
          if (v5 = oh instanceof j) {
             h oh1 = oh;
             if (oh1.d() != null) {
                d uod = oh1.d();
                x t = obj.a.t;
                d uod1 = (t != null)? t.d(): null;
                if (a.g(uod, uod1) ^ 1) {
                   uod1 = obj.a.d;
                   a.o(uod1, "mCallerContext");
                   BaseFragment uBaseFragmen = uod1.f();
                   a.o(uBaseFragmen, "mCallerContext.fragment");
                   obj.a.h2().h().h(uBaseFragmen, obj.a.h2().m());
                }
             }
          }
          a = obj.a;
          Objects.requireNonNull(a);
          Object obj2 = PatchProxy.applyTwoRefs(obj1, oh, a, ox, "2");
          boolean b = false;
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else if((a.g(obj1.f(), a.K) ^ 1) && oh != null){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
             a = obj.a;
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidOneRefs(obj1, a, ox, "3")) {
                a.K = obj1.f();
                if (a.i2(obj1.c()) && a.G == null) {
                   a.p2();
                }
             }
          }
          if (!obj.a.i2(oh)) {
             a = obj.a;
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidTwoRefs(obj1, oh, a, ox, "4")) {
                if (v5) {
                   x t1 = a.t;
                   obj2 = (t1 == null)? 1: 0;
                   if (t1 == null) {
                      a.L.g().w0(new d(6, b));
                      a.L.g().w0(new d(7, b));
                      a.L.g().w0(new d(9, b));
                      Intent obj3 = a.d.d(f0.k);
                      a.o(obj3, "mCallerContext.getData\(MusicData.sDefaultValue\)");
                      if (a.L.n() == null) {
                         x l = a.L;
                         obj3 = (obj3.a == MusicSource.MAGIC_FACE)? null: obj3.j;
                         l.K(obj3);
                         s os = v15;
                         s os1 = v15;
                         os = new s(null, false, false, 1, 0);
                         a.d.m(os1);
                      }
                   }
                   if (!PatchProxy.applyVoidOneRefs(oh, a, ox, "14")) {
                      Object[] objArray = new Object[b];
                      a.D().w("CameraAssistant", "onSelectKSTemplate", objArray);
                      KSTemplateDetailInfo mTemplateId = oh.b().mTemplateId;
                      a.t = oh;
                      x b3 = a.B;
                      if (b3 != null) {
                         a.o(mTemplateId, "ksTemplateId");
                         Object obj4 = PatchProxy.applyTwoRefs(mTemplateId, b3, a, ox, "15");
                         if (obj4 != patchProxyRe) {
                            i = obj4.intValue();
                         }else {
                            Iterator iterator = b3.iterator();
                            int i1 = 0;
                            while (true) {
                               if (iterator.hasNext()) {
                                  if (a.g(iterator.next().mTemplateId, mTemplateId)) {
                                     i = i1;
                                  }else {
                                     i1 = i1 + 1;
                                  }
                               }else {
                                  w = a.o;
                               }
                            }
                         }
                         integer = Integer.valueOf(i);
                      }else {
                         integer = null;
                      }
                      if (integer != null && integer.intValue() != a.o) {
                         w = a.w;
                         if (w != null) {
                            w.setCurrentItem(integer.intValue(), 1);
                         }
                         w = a.v;
                         if (w != null) {
                            w.I(integer.intValue());
                         }
                         a.E = integer.intValue();
                      }
                   }
                label_01cd :
                   if (obj2) {
                      boolean b2 = (obj1.e() < obj1.b())? true: false;
                      a.g2(b2);
                   }else if(a.G == null){
                      a.p2();
                   }
                   obj1 = a.w;
                   if (obj1 != null) {
                      obj1.setVisibility(b);
                   }
                   a.G = true;
                }else if(a.t != null){
                   if (obj1.e() > obj1.b()) {
                      b = true;
                   }
                   a.k2(Boolean.valueOf(b), (oh instanceof p ^ 1));
                }
             }
          }
       }
       return;
    }
}
