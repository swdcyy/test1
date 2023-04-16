package com.kuaishou.commercial.search.commodity.AdSearchCommodityCoverTipsPresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.commercial.search.commodity.AdSearchCommodityCoverTipsPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import wl9.t;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import java.lang.StringBuilder;
import yx.j0;
import com.yxcorp.gifshow.entity.QPhoto;
import yf5.a;
import lnc.ja;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.LinkedList;
import java.util.Queue;
import android.view.ViewGroup;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView;
import mxb.q;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import ry.e;
import android.view.View$OnClickListener;
import ry.d;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import tkd.b;
import tkd.d;
import nl9.u;

public final class AdSearchCommodityCoverTipsPresenter$onBind$1 extends FunctionReferenceImpl implements l	// class@001552
{

    public void AdSearchCommodityCoverTipsPresenter$onBind$1(AdSearchCommodityCoverTipsPresenter p0){
       super(1, p0, AdSearchCommodityCoverTipsPresenter.class, "receiveShowNegativePopEvent", "receiveShowNegativePopEvent\(Lcom/yxcorp/gifshow/commercial/event/ShowSearchNegativePopEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(t p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdSearchCommodityCoverTipsPresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       AdSearchCommodityCoverTipsPresenter uAdSearchCom = AdSearchCommodityCoverTipsPresenter.class;
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, uAdSearchCom, "4")) {
          Object[] objArray = new Object[0];
          j0.f("AdSearchCommodityCoverTipsPresenter", "receiveShowNegativePopEvent:"+p0, objArray);
          AdSearchCommodityCoverTipsPresenter r = treceiver.r;
          if (r == null) {
             a.S("mPhoto");
          }
          if (r.mEntity == p0.a && p0.b == null) {
             a.b(0);
             ja.a();
             p0 = p0.c;
             a.o(p0, "event.mNativeId");
             Object[] obj = PatchProxy.applyOneRefs(p0, treceiver, uAdSearchCom, "5");
             if (obj != PatchProxyResult.class) {
                view = obj;
             }else if(TextUtils.x(p0) || treceiver.s == null){
                obj = new Object[0];
                j0.c("AdSearchCommodityCoverTipsPresenter", "nativeId:"+p0+",rootView:"+treceiver.s, obj);
             }else {
                LinkedList linkedList = new LinkedList();
                linkedList.offer(treceiver.s);
                while (true) {
                   if (!linkedList.isEmpty()) {
                      View view1 = linkedList.poll();
                      a.o(view1, "currentView");
                      if (a.g(p0, view1.getContentDescription())) {
                         view = view1;
                         break ;
                      }else {
                         if (view1 instanceof ViewGroup) {
                            int childCount = view1.getChildCount();
                            for (int i = 0; i < childCount; i = i + 1) {
                               linkedList.offer(view1.getChildAt(i));
                            }
                         }
                      }
                   }
                }
             }
             view = null;
             if (!PatchProxy.applyVoidOneRefs(view, treceiver, uAdSearchCom, "6") && view != null) {
                Object[] objArray1 = new Object[0];
                j0.f("AdSearchCommodityCoverTipsPresenter", "showPhotoReduceReasonFragment", objArray1);
                AdSearchCommodityCoverTipsPresenter p = treceiver.p;
                if (p instanceof RecyclerFragment) {
                   Objects.requireNonNull(p, "null cannot be cast to non-null type com.yxcorp.gifshow.recycler.fragment.RecyclerFragment<*>");
                   p.h0().requestDisallowInterceptTouchEvent(true);
                }
                Activity uActivity = treceiver.getActivity();
                AdSearchCommodityCoverTipsPresenter r1 = treceiver.r;
                if (r1 == null) {
                   a.S("mPhoto");
                }
                q oq = new q(uActivity, view, r1, new e(treceiver), false);
                p.h0().i(new d());
                d.a(-1694791652).Bo(p.h0());
             }
          }
       }
    label_012a :
       return;
    }
}
