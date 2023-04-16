package fl0.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.life_plugin_common.fragment.LifeBasePluginProxyFragment;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import brd.t;
import fl0.b$b;
import erd.g;
import crd.b;
import fl0.b$c;
import android.view.View$OnClickListener;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import fl0.b$a;
import dl0.e;
import com.kwai.robust.PatchProxyResult;
import jd6.g;
import com.kwai.plugin.dva.Dva;
import dl0.c;
import dl0.a;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import io.reactivex.internal.functions.Functions;
import java.lang.Boolean;
import dl0.b;
import ekd.m1;

public final class b extends PresenterV2	// class@002372
{
    public LifeBasePluginProxyFragment p;
    public View q;
    public KwaiEmptyStateView r;
    public long s;

    public void b(){
       super();
    }
    public static final LifeBasePluginProxyFragment P8(b p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("proxyFragment");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b tp = this.p;
       String str = "proxyFragment";
       if (tp == null) {
          a.S(str);
       }
       if (tp.Vg().c()) {
          PluginDownloadExtension k = PluginDownloadExtension.k;
          k.s("life_plugin", 40);
          k.a("life_plugin");
       }else {
          tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          this.X7(tp.Vg().j().subscribe(new b$b(this)));
       }
       this.R8();
       tp = this.r;
       if (tp == null) {
          a.S("mHintEmptyView");
       }
       tp.p(new b$c(this));
       return;
    }
    public final void R8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "8")) {
          return;
       }
       this.s = SystemClock.elapsedRealtime();
       if (!PatchProxy.applyVoid(objArray, this, uob, "5")) {
          b tq = this.q;
          String str1 = "mLoadingAnimation";
          if (tq == null) {
             a.S(str1);
          }
          if (tq.getVisibility()) {
             tq = this.q;
             if (tq == null) {
                a.S(str1);
             }
             tq.setVisibility(0);
          }
          tq = this.r;
          str1 = "mHintEmptyView";
          if (tq == null) {
             a.S(str1);
          }
          int i = 8;
          if (tq.getVisibility() != i) {
             tq = this.r;
             if (tq == null) {
                a.S(str1);
             }
             tq.setVisibility(i);
          }
       }
       String str = "life_plugin";
       if (!PatchProxy.applyVoid(objArray, this, uob, "9")) {
          PluginDownloadExtension.k.s(str, 40);
       }
       b$a uoa = new b$a(this);
       b uob1 = PatchProxy.applyOneRefs(uoa, objArray, e.class, "3");
       if (uob1 != PatchProxyResult.class) {
       }else if(g.e(str) || Dva.instance().isLoaded(str)){
          uob1 = t.just(Boolean.TRUE).subscribe(new b(uoa));
       }else {
          uob1 = t.fromCallable(new c(uoa)).subscribeOn(d.c).observeOn(d.a).subscribe(Functions.d());
       }
       this.X7(uob1);
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       b tq = this.q;
       if (tq == null) {
          a.S("mLoadingAnimation");
       }
       tq.setVisibility(8);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.loading_circle);
       a.o(view, "bindWidget\(rootView, R.id.loading_circle\)");
       this.q = view;
       p0 = m1.f(p0, R.id.hint_empty_view);
       a.o(p0, "bindWidget\(rootView, R.id.hint_empty_view\)");
       this.r = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(PageAccessIds.FRAGMENT\)");
       this.p = obj;
       return;
    }
}
