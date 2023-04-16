package ek2.a0$b;
import ek2.b;
import ek2.a0;
import java.lang.Object;
import com.kuaishou.live.core.show.stayinfo.StayInfo;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoRecommendDialog;
import ek2.x;
import android.content.Context;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import t02.a0;
import y8c.g;
import com.kuaishou.live.core.show.stayinfo.Content;
import java.util.List;
import java.util.ArrayList;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import android.app.Dialog;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.live.core.show.stayinfo.ActionButton;
import ek2.b0;
import ek2.c0;
import ek2.d0;
import android.content.DialogInterface$OnDismissListener;

public final class a0$b implements b	// class@002740
{
    public final a0 a;

    public void a0$b(a0 p0){
       this.a = p0;
       super();
    }
    public boolean a(StayInfo p0,View$OnClickListener p1,View$OnClickListener p2){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a0$b.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = "stayInfo";
       a.p(p0, obj);
       String str = "onPositiveClickListener";
       a.p(p1, str);
       String str1 = "onNegativeClickListener";
       a.p(p2, str1);
       a0$b ta = this.a;
       Objects.requireNonNull(ta);
       Object obj1 = PatchProxy.applyThreeRefs(p0, p1, p2, ta, a0.class, "4");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          a.p(p0, obj);
          a.p(p1, str);
          a.p(p2, str1);
          Activity activity = ta.getActivity();
          int i = 0;
          if (activity != null) {
             a0 m = ta.M;
             if (m == null) {
                a.S("mFragment");
             }
             a0 l = ta.L;
             if (l == null) {
                a.S("mLivePlayCallerContext");
             }
             LiveAudienceStayInfoRecommendDialog liveAudience = new LiveAudienceStayInfoRecommendDialog(activity, m, l, p0, new x(p0.c()));
             ta.K = v7;
             Content qPhotoList = p0.b().qPhotoList;
             if (qPhotoList != null) {
                LiveAudienceStayInfoRecommendDialog liveAudience1 = 3;
                if (qPhotoList.size() >= liveAudience1) {
                   ArrayList uArrayList = new ArrayList();
                   for (; i < liveAudience1; i = i + 1) {
                      uArrayList.add(new QPhoto(qPhotoList.get(i)));
                   }
                   a0 k = ta.K;
                   if (k != null) {
                      k.show();
                   }
                   k = ta.K;
                   if (k != null && !PatchProxy.applyVoidOneRefs(uArrayList, k, LiveAudienceStayInfoRecommendDialog.class, "7")) {
                      liveAudience1 = k.k;
                      if (liveAudience1 != null) {
                         liveAudience1.W0(uArrayList);
                         k.k.k0();
                      }
                   }
                   k = ta.K;
                   if (k != null) {
                      obj = p0.b().c();
                      if (!PatchProxy.applyVoidOneRefs(obj, k, LiveAudienceStayInfoRecommendDialog.class, "4")) {
                         liveAudience = k.c;
                         if (liveAudience != null) {
                            liveAudience.setText(obj);
                         }
                      }
                   }
                   k = ta.K;
                   if (k != null) {
                      obj = p0.b().a().b();
                      if (!PatchProxy.applyVoidOneRefs(obj, k, LiveAudienceStayInfoRecommendDialog.class, "5")) {
                         liveAudience = k.e;
                         if (liveAudience != null) {
                            liveAudience.setText(obj);
                         }
                      }
                   }
                   k = ta.K;
                   if (k != null) {
                      obj = p0.b().b();
                      if (!PatchProxy.applyVoidOneRefs(obj, k, LiveAudienceStayInfoRecommendDialog.class, "6")) {
                         liveAudience = k.f;
                         if (liveAudience != null) {
                            liveAudience.setText(obj);
                         }
                      }
                   }
                   k = ta.K;
                   if (k != null) {
                      k.h = new b0(ta, p0, p1, p2);
                   }
                   if (k != null) {
                      k.g = new c0(ta, p0, p1, p2);
                   }
                   if (k != null) {
                      k.setOnDismissListener(new d0(ta, p0, p1, p2));
                   }
                   b = true;
                }
             }
          }
       label_0142 :
          b = false;
       }
       return b;
    }
}
