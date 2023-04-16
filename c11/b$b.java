package c11.b$b;
import android.view.View$OnClickListener;
import c11.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kotlin.jvm.internal.a;
import t02.a0;
import vq5.d;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import c11.b$b$a;
import java.lang.Runnable;
import e93.f;
import android.content.Context;

public final class b$b implements View$OnClickListener	// class@00044d
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       b$b tb = this.b;
       b.S(tb.K, "bottom bar clicked !!!", "url", tb.N);
       if (TextUtils.x(this.b.N)) {
          return;
       }
       b o = this.b.O;
       if (o == null) {
          a.S("livePlayCallerContext");
       }
       a0 p2 = o.p2;
       b n = this.b.N;
       a.m(n);
       if (p2.P0(n)) {
          if (y.d(this.b.getActivity())) {
             y.f(this.b.getActivity());
             f.j("startRouter", new b$b$a(this, p2), this.b.P);
          }else {
             n = this.b.N;
             a.m(n);
             p2.r4(n, null);
          }
       }else {
          tb = this.b;
          b.S(tb.K, "bottom bar clicked, but cannot route !!!", "url", tb.N);
       }
       return;
    }
}
