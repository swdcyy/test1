package i6a.f$e;
import android.view.View$OnClickListener;
import i6a.f;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i6a.k;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.framework.model.feed.BaseFeed;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import java.lang.Integer;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import ekd.r0;
import e17.i;
import android.widget.TextView;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import i6a.g;
import android.animation.Animator$AnimatorListener;

public final class f$e implements View$OnClickListener	// class@002794
{
    public final f b;

    public void f$e(f p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       f a;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f$e.class, "1")) {
          return;
       }
       BaseFeed baseFeed = f.R8(this.b).getBaseFeed();
       a.o(baseFeed, "mDetailParam.baseFeed");
       Integer integer = null;
       k.b.b(baseFeed, f.S8(this.b), "CHANGE", integer);
       f$e tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidWithListener(integer, tb, f.class, "10")) {
          if (!r0.d(tb.getActivity())) {
             i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
             PatchProxy.onMethodExit(f.class, "10");
          }else {
             a = tb.A;
             if (a == null) {
                a.S("leftButton");
             }
             a.setClickable(false);
             a = tb.p;
             if (a == null) {
                a.S("cardsContainer");
             }
             a.animate().setDuration(100).scaleX(0x3f733333).scaleY(0x3f733333).setListener(new g(tb));
             PatchProxy.onMethodExit(f.class, "10");
          }
       }
       PatchProxy.onMethodExit(f$e.class, "1");
       return;
    }
}
