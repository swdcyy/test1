package fia.s;
import erd.g;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.follow.common.data.PymiTipsShowResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.follow.common.data.PymiTipsShowResponse$PymiTipModel;
import java.util.Collection;
import ekd.q;
import java.util.Objects;
import android.view.ViewStub;
import android.view.View;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.follow.common.pymi.PymiUserRecyclerView;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.autoplay.widget.FeedsLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import bia.h;
import k2b.e0;
import cia.w;
import y8c.g;
import aha.c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import cha.a;
import xha.a;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import xtd.a;
import fia.t;
import ytd.b;
import java.lang.Boolean;
import xl8.b;

public final class s implements g	// class@002935
{
    public final FollowSlideInternalPymiListPresenter b;

    public void s(FollowSlideInternalPymiListPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       FollowSlideInternalPymiListPresenter t;
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
       }else {
          a.p(p0, "res");
          PymiTipsShowResponse mPymiUserBar = p0.mPymiUserBar;
          if (mPymiUserBar == null || q.f(mPymiUserBar.mInfos)) {
             this.b.S8().d(new PymiTipsShowResponse());
          }else {
             s tb = this.b;
             Objects.requireNonNull(tb);
             FollowSlideInternalPymiListPresenter uFollowSlide = FollowSlideInternalPymiListPresenter.class;
             if (!PatchProxy.applyVoidOneRefs(p0, tb, uFollowSlide, "12") && tb.t instanceof ViewStub) {
                String str = "null cannot be cast to non-null type android.view.ViewStub";
                if (tb.X8()) {
                   t = tb.t;
                   Objects.requireNonNull(t, str);
                   t.setLayoutResource(R.layout.arg_RES_7f0d0443);
                }
                t = tb.t;
                Objects.requireNonNull(t, str);
                view = t.inflate();
                tb.t = view;
                if (view != null) {
                   view.setBackgroundResource(R.color.arg_RES_7f061994);
                }
                int i = tb.u + n.A(a.B);
                tb.u = i;
                FollowSlideInternalPymiListPresenter t1 = tb.t;
                int i1 = 0;
                if (t1 != null) {
                   t1.setPadding(i1, i, i1, i1);
                }
                t = tb.t;
                PymiUserRecyclerView pymiUserRecy = null;
                if (t != null) {
                   pymiUserRecy = t.findViewById(0x7f0a3361);
                }
                tb.z = pymiUserRecy;
                if (pymiUserRecy != null) {
                   pymiUserRecy.setCanScrollHorizontally(i1);
                }
                t = tb.z;
                if (t != null && !PatchProxy.applyVoidTwoRefs(t, p0, tb, uFollowSlide, "13")) {
                   t.addOnScrollListener(tb.F);
                   t.setLayoutManager(tb.R8());
                   h oh = tb.V8();
                   t1 = tb.v;
                   if (t1 == null) {
                      a.S("mFollowSlideInjectAdapter");
                   }
                   oh.n1("PYMI_LOGPAGE_FRAGMENT", t1.N());
                   tb.V8().n1("PYMI_USER_LIST_ADAPTER", tb.V8());
                   tb.V8().n1("PYMI_USER_AVATAR_REQUEST_CACHE", new c());
                   t.setAdapter(tb.V8());
                   t.setNestedScrollingEnabled(i1);
                   t.setHasFixedSize(true);
                   tb.V8().n1("NIRVANA_FOLLOW_VIEW_PAGER_STATE", tb.W8());
                   tb.V8().n1("PYMI_RECYCLER_VIEW", t);
                   tb.V8().n1("PYMI_LOGGER", new a());
                   tb.V8().n1("PYMI_VERTICAL_POSITION", Integer.valueOf(i1));
                   tb.V8().n1("PYMI_SOURCE", Integer.valueOf(4));
                   str = "";
                   String str1 = "PYMI_LIST_LOAD_SEQUENCEID";
                   if (!TextUtils.x(p0.mLlsid)) {
                      tb.V8().n1(str1, p0.mLlsid);
                   }else {
                      tb.V8().n1(str1, str);
                   }
                   PymiTipsShowResponse mPymiUserBar1 = p0.mPymiUserBar;
                   str1 = "PYMI_EXP_TAG";
                   if (mPymiUserBar1 != null && !TextUtils.x(mPymiUserBar1.mExpTag)) {
                      tb.V8().n1(str1, p0.mPymiUserBar.mExpTag);
                   }else {
                      tb.V8().n1(str1, str);
                   }
                   tb.V8().n1("FOLLOW_VERSION", Integer.valueOf(tb.w));
                   tb.H = new a(new t(t), 3.00f, 0x3f800000, -2.50f);
                }
                tb.B.d(Boolean.TRUE);
                FollowSlideInternalPymiListPresenter t2 = tb.t;
                if (t2 != null) {
                   t2.setVisibility(8);
                }
             }
          label_0192 :
             this.b.S8().d(p0);
          }
       }
       return;
    }
}
