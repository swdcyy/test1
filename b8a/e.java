package b8a.e;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.d;
import java.lang.Object;
import tp7.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import uw9.o;
import q87.c;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.View;
import java.lang.Integer;
import e0d.h;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import kp.r1;
import lxb.s;
import java.util.Collection;
import ekd.q;
import uw9.l0;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import xx9.a;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import androidx.fragment.app.Fragment;
import oo5.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import ib5.q;
import android.widget.TextView;
import java.lang.CharSequence;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import k17.b;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.detail.slidev2.presenter.d$a;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.StringBuilder;
import java.lang.Runnable;
import android.view.ViewGroup;
import com.yxcorp.utility.n;
import lnc.a1;
import lnc.ja;

public final class e implements g	// class@0003a0
{
    public final d b;

    public void e(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       Object[] objArray;
       Object[] objArray1;
       String str1;
       RecyclerView$LayoutManager layoutManage1;
       e b = this.b;
       QPhoto qPhoto = p0;
       Objects.requireNonNull(b);
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(qPhoto, b, uod, "5")) {
       }else {
          d r = b.r;
          if (r != null && r.l0()) {
             objArray = new Object[0];
             o.C().w("SlidePlayAtlasProgressPresenter", "禁止拖拽, reason: pagelist requesting", objArray);
          }else {
             int actionMasked = qPhoto.a().getActionMasked();
             boolean b1 = true;
             if (actionMasked == 2) {
                if (!PatchProxy.applyVoidOneRefs(qPhoto, b, uod, "8")) {
                   int i = qPhoto.b();
                   if (i != -1 && i != b.A) {
                      b.A = i;
                      r = b.p;
                      if (r != null && r.getParent() != null) {
                         View view = b.p.inflate();
                         b.q = view;
                         view.setVisibility(8);
                      }
                      r = b.q;
                      if (r != null && !r.isShown()) {
                         r = b.A;
                         if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(r), b, uod, "10")) {
                            b.B = r;
                            h.g(b1);
                            objArray = null;
                            if (!PatchProxy.applyVoid(objArray, b, uod, "16")) {
                               b.x.clear();
                               QPhoto currentPhoto = b.r.getCurrentPhoto();
                               b.t = currentPhoto;
                               if (currentPhoto != null) {
                                  ImageMeta$AtlasCoverSize[] uAtlasCoverS = r1.n0(currentPhoto.getEntity());
                                  if (uAtlasCoverS != null) {
                                     b.z = uAtlasCoverS.length;
                                     for (int i2 = 0; i2 < b.z; i2 = i2 + 1) {
                                        List list = r1.m0(b.t.getEntity(), i2);
                                        s os = new s();
                                        os.a = i2;
                                        if (!q.f(list)) {
                                           os.b.addAll(list);
                                        }
                                        os.c = uAtlasCoverS[i2];
                                        b.x.add(os);
                                     }
                                  }
                               }
                            }
                            if (b.R8()) {
                               b.u.L1.onNext(Boolean.TRUE);
                            }else if(!b.u.s2.c()){
                               b.u.s2.d(new ChangeScreenVisibleEvent(b.t, ChangeScreenVisibilityCause.ATLAS_TOUCH_PROGRESS));
                            }
                            a.e(b.s, 0);
                            q.p0(b.getActivity()).w0(0, 20);
                            if (!PatchProxy.applyVoid(objArray, b, uod, "14")) {
                               b.w = b.q.findViewById(0x7f0a4140);
                               b.q.findViewById(R.id.tv_total_index_atlas_preview).setText(String.valueOf(b.z));
                            }
                            if (!PatchProxy.applyVoid(objArray, b, uod, "17")) {
                               RecyclerView recyclerView = b.q.findViewById(R.id.rv_atlas_preview);
                               b.v = recyclerView;
                               recyclerView.setLayoutManager(new LinearLayoutManager(b.getContext(), 0, 0));
                               if (b.v.getItemDecorationCount() > 0) {
                                  b.v.removeItemDecorationAt(0);
                               }
                               b.v.addItemDecoration(new b(0, d.D, d.D, d.E));
                               b.v.setItemViewCacheSize(b.x.size());
                               d$a uoa = new d$a(b.t);
                               uoa.W0(b.x);
                               b.v.setAdapter(uoa);
                            }
                            b.q.setVisibility(0);
                         }
                      }
                      RecyclerView$LayoutManager layoutManage = b.v.getLayoutManager();
                      View view1 = layoutManage.findViewByPosition(i);
                      String str = "position";
                      if (view1 == null) {
                         objArray1 = new Object[0];
                         o.C().w("SlidePlayAtlasProgressPresenter", "position滚动,distance "+(b.y / 2)+str+i, objArray1);
                         layoutManage.scrollToPositionWithOffset(i, (b.y / 2));
                         b.v.postDelayed(b.C, 200);
                      }else if(PatchProxy.isSupport(uod)){
                         str1 = str;
                         layoutManage1 = layoutManage;
                         if (!PatchProxy.applyVoidFourRefs(view1, Integer.valueOf(i), qPhoto, layoutManage, b, d.class, "9")) {
                         label_0219 :
                            int i1 = n.p(view1)[0] - ((int)qPhoto.a().getX() - (view1.getWidth() / 2));
                            Object[] objArray2 = new Object[0];
                            o.C().w("SlidePlayAtlasProgressPresenter", "scrollBy滚动distance: "+i1+str1+i, objArray2);
                            b.v.removeCallbacks(b.C);
                            if (!i) {
                               b.v.scrollBy((- (b.y / 2)), 0);
                            }else if(i == (b.z - 1)){
                               b.v.scrollBy((b.y / 2), 0);
                            }else {
                               b.v.scrollBy(i1, 0);
                            }
                            actionMasked = i - 1;
                            if (actionMasked >= 0 && (actionMasked < b.z && layoutManage1.findViewByPosition(actionMasked) == null)) {
                               if (i1 < 0) {
                                  b.v.scrollBy(a1.e(-10.00f), 0);
                               }else {
                                  b.v.scrollBy(a1.e(-20.00f), 0);
                               }
                            }
                         }
                      }else {
                         str1 = str;
                         layoutManage1 = layoutManage;
                         goto label_0219 ;
                      }
                      b.S8(i);
                      b.V8(i);
                      qPhoto.c = b.t;
                      b.u.K1.onNext(qPhoto);
                      b.w.setText(String.valueOf((i + 1)));
                      ja.a();
                   }
                }
             }else if(actionMasked == 1 || actionMasked == 3){
                objArray1 = new Object[0];
                o.C().w("SlidePlayAtlasProgressPresenter", "手机抬起时时up还是cancel"+actionMasked, objArray1);
                b.P8();
             }
          }
       }
       return;
    }
}
