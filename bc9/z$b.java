package bc9.z$b;
import cc9.i;
import bc9.z;
import java.lang.Object;
import cc9.q;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cc9.h;
import cc9.m;
import j8c.a;
import java.lang.StringBuilder;
import bc9.k;
import com.yxcorp.gifshow.camera.record.assistant.a;
import androidx.recyclerview.widget.RecyclerView;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import pc9.c;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.camera.record.base.b;
import bc9.a0;
import androidx.recyclerview.widget.RecyclerView$r;
import ec9.j;
import cc9.d;
import sa6.a;
import ac9.g;
import ac9.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Objects;
import java.lang.Integer;
import java.util.ListIterator;
import lnc.s6;
import ec9.f1;
import cc9.l;
import nsd.u;
import cc9.n;
import cc9.b;
import dc9.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.camerasdk.q;
import com.yxcorp.gifshow.util.rx.RxBus;
import j4b.f;
import android.content.Context;
import com.yxcorp.gifshow.model.SimpleMagicFace;

public final class z$b implements i	// class@000415
{
    public final z a;

    public void z$b(z p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       z$b a;
       List list;
       int i;
       SimpleMagicFace mChildId;
       ListIterator obj2;
       boolean b1;
       l ol;
       int scrollState;
       Object obj = this;
       z$b obj1 = p0;
       z oz = z.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, z$b.class, "1")) {
       }else {
          a.p(obj1, "newState");
          h oh = obj1.c();
          v4 = oh instanceof m;
          String str = "CameraAssistant";
          boolean b = false;
          Object[] objArray = null;
          Object[] objArray1 = -1;
          if (v4) {
             if (a.g(obj.a.q, oh) ^ 1) {
                h oh1 = oh;
                if (oh1.a()) {
                   a = obj.a;
                   a.q = oh1;
                   if (!PatchProxy.applyVoid(objArray, a, oz, "8")) {
                      a uoa = a.D();
                      StringBuilder str1 = "openMagicPanel..., list state:";
                      k ok = a.v.p();
                      if (ok != null) {
                         RecyclerView recyclerView = ok.h0();
                         if (recyclerView != null) {
                            scrollState = recyclerView.getScrollState();
                         label_006d :
                            Object[] objArray2 = new Object[b];
                            uoa.w(str, str1+scrollState, objArray2);
                            if (a.v.A()) {
                               k ok1 = a.v.p();
                               if (ok1 != null) {
                                  RecyclerView recyclerView1 = ok1.h0();
                                  if (recyclerView1 != null && !recyclerView1.getScrollState()) {
                                     a.d.m(new c(a.h2()));
                                  }else {
                                  label_00a5 :
                                     ok1 = a.v.p();
                                     if (ok1 != null) {
                                        recyclerView1 = ok1.h0();
                                        if (recyclerView1 != null) {
                                           recyclerView1.addOnScrollListener(new a0(recyclerView1, a));
                                        }
                                     }
                                  }
                               }else {
                                  goto label_00a5 ;
                               }
                               a.v.g().w0(new d(9, b));
                            }
                         }
                      }
                      scrollState = -1;
                      goto label_006d ;
                   }
                }
             }
          }else {
             obj.a.q = objArray;
          }
          a = 2;
          if (obj1.d() != null && !obj1.d() instanceof i) {
             z$b a1 = obj.a;
             list = obj.a.g2().k();
             a.m(list);
             ArrayList uArrayList = new ArrayList(list);
             i = obj1.b();
             Objects.requireNonNull(a1);
             if (!PatchProxy.isSupport(oz) || !PatchProxy.applyVoidTwoRefs(uArrayList, Integer.valueOf(i), a1, oz, "11")) {
                obj2 = uArrayList.listIterator(uArrayList.size());
                while (true) {
                   if (obj2.hasPrevious()) {
                      if (obj2.previous() instanceof i) {
                         objArray1 = obj2.nextIndex();
                      }
                   }
                   if (objArray1 >= 0) {
                      uArrayList.remove(objArray1);
                      if (s6.u() == a) {
                         int i1 = i - 1;
                         if (i1 >= 0 && i1 < uArrayList.size()) {
                            ol = i;
                            l ol1 = i;
                            ol = new l(uArrayList, i1, false, false, 8, null);
                            a1.v.r().w0(ol1);
                         label_016f :
                            a1.v.g().w0(new d(13, b));
                         }
                      }
                      ol = new l(uArrayList, i, false, false, 8, null);
                      a1.v.r().w0(objArray1);
                      goto label_016f ;
                   }
                }
             }
          }
          z$b a2 = obj.a;
          a2.s = obj1;
          if (!a.g(a2.p, oh)) {
             if (oh instanceof n) {
                z o = obj.a.o;
                if (o != null && !o.k()) {
                   obj.a.g2().g().w0(new d(6, 1));
                }
                o = obj.a.o;
                if (o != null && !o.l()) {
                   obj.a.g2().g().w0(new d(7, 1));
                }
                o = obj.a.o;
                if (o != null && !o.j()) {
                   obj.a.g2().g().w0(new d(9, 1));
                }
                z$b a3 = obj.a;
                Objects.requireNonNull(a3);
                if (!PatchProxy.applyVoidTwoRefs(oh, obj1, a3, oz, "6")) {
                   a.p(oh, "newMagicItemState");
                   a.p(obj1, "newRecommendListState");
                   objArray1 = new Object[b];
                   a.D().w(str, "onMagicItemSelected", objArray1);
                   a3.p = oh;
                   if (oh.b() == 2 && (a.g(a3.h2(), oh.c()) ^ 1)) {
                      objArray1 = new Object[b];
                      a.D().w(str, "applyMagicFace", objArray1);
                      d d = a3.d;
                      a.o(d, "mCallerContext");
                      BaseFragment uBaseFragmen = d.f();
                      a.o(uBaseFragmen, "mCallerContext.fragment");
                      a3.v.h().h(uBaseFragmen, a3.v.m());
                      d h = a3.h;
                      if (h != null) {
                         obj2 = PatchProxy.applyOneRefs(obj1, a3, oz, "14");
                         if (obj2 != PatchProxyResult.class) {
                            b1 = obj2.booleanValue();
                         }else {
                            g og = obj1.d();
                            b1 = (og != null && og.getRecognitionType() == 1)? true: false;
                         }
                         h.x0(b1);
                      }
                      MagicEmoji$MagicFace magicFace1 = oh.c();
                      if (!PatchProxy.applyVoidOneRefs(magicFace1, a3, oz, "13")) {
                         RxBus.f.b(new f(magicFace1, a3.e));
                      }
                      if (a3.v.B()) {
                         a3.u = oh.c();
                      }
                   }
                }
             }else {
                obj1 = obj.a;
                if (obj1.p != null && !v4) {
                   obj1.i2(1);
                }
             }
          label_02af :
             obj1 = obj.a;
             if (obj1.p != null) {
                j oj = obj1.g2().g();
                z p = obj.a.p;
                if (p != null) {
                   MagicEmoji$MagicFace magicFace = p.c();
                   if (magicFace != null) {
                      mChildId = magicFace.mChildId;
                   label_02cf :
                      if (mChildId == null || !mChildId.length()) {
                         b = true;
                      }
                      oj.w0(new d(9, b));
                   }
                }
                mChildId = null;
                goto label_02cf ;
             }
          }
       }
       return;
    }
}
