package i6a.o$d;
import com.yxcorp.gifshow.widget.m;
import i6a.o;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import ekd.r0;
import e17.i;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementV3Meta;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import i6a.k;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Integer;
import k2b.e0;
import android.widget.TextView;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import i6a.p;
import android.animation.Animator$AnimatorListener;

public final class o$d extends m	// class@0027a3
{
    public final o c;

    public void o$d(o p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       o x;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, o$d.class, "1")) {
          return;
       }
       o$d tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidWithListener(null, tc, o.class, "4")) {
          int i = 0x7f11066a;
          if (!r0.d(tc.getActivity())) {
             i.a(i, R.string.arg_RES_7f1038e5);
             PatchProxy.onMethodExit(o.class, "4");
          }else if(tc.E == null){
             x = tc.x;
             String str = "mInterestMeta";
             if (x == null) {
                a.S(str);
             }
             if (!TextUtils.x(x.mNoMoreToastText)) {
                o x1 = tc.x;
                if (x1 == null) {
                   a.S(str);
                }
                i.d(i, x1.mNoMoreToastText);
                PatchProxy.onMethodExit(o.class, "4");
             }
          }
          k b = k.b;
          o v = tc.v;
          if (v == null) {
             a.S("mDetailParam");
          }
          BaseFeed baseFeed = v.getBaseFeed();
          a.o(baseFeed, "mDetailParam.baseFeed");
          o w = tc.w;
          if (w == null) {
             a.S("mFragment");
          }
          b.b(baseFeed, w, "CHANGE", Integer.valueOf(2));
          x = tc.t;
          if (x == null) {
             a.S("mLeftBtn");
          }
          x.setClickable(false);
          x = tc.s;
          if (x == null) {
             a.S("mLabelsGroup");
          }
          x.animate().setDuration(100).scaleX(0x3f733333).scaleY(0x3f733333).setListener(new p(tc));
          PatchProxy.onMethodExit(o.class, "4");
       }
       PatchProxy.onMethodExit(o$d.class, "1");
       return;
    }
}
