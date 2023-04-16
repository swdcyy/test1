package asa.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import asa.b$a;
import nsd.u;
import pr6.d;
import wq6.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import xq6.a;
import asa.b$c;
import asa.b$b;
import com.kwai.kcube.ext.actionbar.KCubeTabActionBar;
import lr6.a;
import wra.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.home.block.topbar.actionbar.HomeBlockActionBarAdapter;
import xra.a;
import com.kwai.robust.PatchProxyResult;
import xra.b;
import gr6.j;
import gr6.b;
import gr6.c;
import lr6.f;
import asa.b$d;
import lr6.e;
import asa.b$e;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import android.view.ViewTreeObserver$OnPreDrawListener;
import zq6.b;
import bo5.a;
import asa.b$f;
import zq6.p;
import zq6.u;
import zq6.s;
import xq6.b;
import wkd.b;
import hsa.g;
import hsa.b;
import cta.e;
import cta.a;
import android.view.View;

public final class b extends PresenterV2	// class@0002e5
{
    public b p;
    public ViewTreeObserver$OnPreDrawListener q;
    public final a r;
    public KCubeTabActionBar s;
    public a t;
    public final b$c u;
    public final b$b v;
    public final d w;
    public final f x;
    public final boolean y;
    public static final b$a z;

    static {
       b.z = new b$a(null);
    }
    public void b(d p0,f p1,boolean p2){
       a.p(p0, "fragmentWrapper");
       a.p(p1, "containerController");
       super();
       this.w = p0;
       this.x = p1;
       this.y = p2;
       this.r = new a();
       this.u = new b$c(this);
       this.v = new b$b(this);
    }
    public static final KCubeTabActionBar P8(b p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("actionBar");
       }
       return p0;
    }
    public static final a R8(b p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("actionBarController");
       }
       return p0;
    }
    public static final b S8(b p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mHomeBlockViewState");
       }
       return p0;
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       b ts = this.s;
       String str = "actionBar";
       if (ts == null) {
          a.S(str);
       }
       HomeBlockActionBarAdapter homeBlockAct = new HomeBlockActionBarAdapter(this.x, this.y);
       b tx = this.x;
       a uoa = new a();
       uob = PatchProxy.apply(objArray, this, uob, "6");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b(this.w);
       }
       a uoa1 = ts.a(homeBlockAct, tx, uoa, uob);
       a.o(uoa1, "actionBar.buildLayout\(\n ¡­eateGlobalContext\(\)\n    \)");
       this.t = uoa1;
       String str1 = "actionBarController";
       if (uoa1 == null) {
          a.S(str1);
       }
       uoa1.create();
       uob = this.t;
       if (uob == null) {
          a.S(str1);
       }
       uob.d();
       if (this.y == null) {
          uob = this.t;
          if (uob == null) {
             a.S(str1);
          }
          uob.J(new b$d(this));
       }else {
          this.q = new b$e(this);
          uob = this.s;
          if (uob == null) {
             a.S(str);
          }
          uob.getViewTreeObserver().addOnPreDrawListener(this.q);
       }
       p e = a.e;
       a.o(e, "HomeTopStateId.TAB_BAR_VIEW_INFO");
       this.r.a(this.x.y().b(e, new b$f(this)));
       b.a(0x430040f9).c(this.v);
       b.a(-920422449).d(this.u);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b tq = this.q;
       if (tq != null) {
          b ts = this.s;
          if (ts == null) {
             a.S("actionBar");
          }
          ts.getViewTreeObserver().removeOnPreDrawListener(tq);
       }
       tq = this.t;
       String str = "actionBarController";
       if (tq == null) {
          a.S(str);
       }
       tq.b();
       tq = this.t;
       if (tq == null) {
          a.S(str);
       }
       tq.destroy();
       this.r.c();
       b.a(0x430040f9).a(this.v);
       b.a(-920422449).e(this.u);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       p0 = p0.findViewById(R.id.block_tabs);
       a.o(p0, "rootView.findViewById\(R.id.block_tabs\)");
       this.s = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       Object obj = this.q8(b.class);
       a.o(obj, "inject\(HomeBlockViewState::class.java\)");
       this.p = obj;
       return;
    }
}
