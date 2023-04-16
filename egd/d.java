package egd.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import egd.c;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import ekd.m1;

public final class d extends PresenterV2	// class@000d13
{
    public c p;
    public TextView q;
    public TextView r;

    public void d(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       d tq = this.q;
       if (tq == null) {
          a.S("mCachePathView");
       }
       StringBuilder str = "";
       d tp = this.p;
       if (tp == null) {
          a.S("mTopCacheInfo");
       }
       tq.setText(str+tp.a()+"  ");
       tq = this.p;
       if (tq == null) {
          a.S("mTopCacheInfo");
       }
       tq.a();
       tq = this.r;
       if (tq == null) {
          a.S("mCacheSizeView");
       }
       str = "";
       tp = this.p;
       if (tp == null) {
          a.S("mTopCacheInfo");
       }
       tq.setText(str+tp.b()+" MB");
       tq = this.p;
       if (tq == null) {
          a.S("mTopCacheInfo");
       }
       tq.b();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.top_cache_path);
       a.o(view, "bindWidget\(rootView, R.id.top_cache_path\)");
       this.q = view;
       p0 = m1.f(p0, R.id.top_cache_size);
       a.o(p0, "bindWidget\(rootView, R.id.top_cache_size\)");
       this.r = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       Object obj = this.q8(c.class);
       a.o(obj, "inject\(TopCacheInfo::class.java\)");
       this.p = obj;
       obj.toString();
       return;
    }
}
