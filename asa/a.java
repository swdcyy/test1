package asa.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import xq6.a;
import wq6.f;
import java.lang.String;
import kotlin.jvm.internal.a;
import wq6.h;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import gr6.b;
import lr6.f;
import xra.a;
import asa.a$a;
import erd.g;
import crd.b;
import brd.t;
import bo5.a;
import asa.a$b;
import zq6.p;
import zq6.u;
import zq6.s;
import zq6.b;
import xq6.b;
import asa.a$c;
import asa.a$d;
import pn5.a;
import asa.a$e;
import asa.a$f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wq6.g;
import com.kwai.kcube.TabIdentifier;
import zq6.r;
import lr6.a;

public final class a extends PresenterV2	// class@0002de
{
    public TextView p;
    public a q;
    public h r;
    public f s;
    public b t;
    public final a u;
    public final boolean v;

    public void a(boolean p0){
       super();
       this.v = p0;
       this.u = new a();
    }
    public static final f P8(a p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("containerController");
       }
       return p0;
    }
    public static final h R8(a p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("kcubeTab");
       }
       return p0;
    }
    public static final TextView S8(a p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("textView");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a tq = this.q;
       if (tq == null) {
          a.S("actionBarController");
       }
       this.X7(tq.c().b.subscribe(new a$a(this)));
       tq = this.u;
       a tt = this.t;
       String str = "childStateReader";
       if (tt == null) {
          a.S(str);
       }
       a tr = this.r;
       String str1 = "kcubeTab";
       if (tr == null) {
          a.S(str1);
       }
       p s = a.s;
       a.o(s, "HomeTopStateId.TAB_TEXT");
       tq.a(tt.g(tr, s, new a$b(this)));
       if (this.v == null) {
          tq = this.u;
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          tr = this.r;
          if (tr == null) {
             a.S(str1);
          }
          s = a.M;
          a.o(s, "HomeTopStateId.TAB_IMAGE_TITLE");
          tq.a(tt.g(tr, s, new a$c(this)));
          tq = this.u;
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          tr = this.r;
          if (tr == null) {
             a.S(str1);
          }
          s = a.N;
          a.o(s, "HomeTopStateId.TAB_COMMON_LOTTIE");
          tq.a(tt.g(tr, s, new a$d(this)));
          tq = this.u;
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          tr = this.r;
          if (tr == null) {
             a.S(str1);
          }
          s = a.d;
          a.o(s, "HomeBlockTopStateId.TAB_ACTION_BAR_SKIN_CONFIG");
          tq.a(tt.g(tr, s, new a$e(this)));
          tq = this.u;
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          a tr1 = this.r;
          if (tr1 == null) {
             a.S(str1);
          }
          p e = a.e;
          a.o(e, "HomeTopStateId.TAB_BAR_VIEW_INFO");
          tq.a(tt.g(tr1, e, new a$f(this)));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       this.u.c();
       return;
    }
    public final boolean V8(){
       boolean b;
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.v == null) {
          obj = this.s;
          if (obj == null) {
             a.S("containerController");
          }
          TabIdentifier tabIdentifie = obj.j().M2();
          a tr = this.r;
          if (tr == null) {
             a.S("kcubeTab");
          }
          if (a.g(tabIdentifie, tr.M2())) {
             b = true;
          label_003f :
             return b;
          }
       }
       b = false;
       goto label_003f ;
    }
    public final void W8(p p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "4")) {
          return;
       }
       if (!this.V8()) {
          return;
       }
       a ts = this.s;
       if (ts == null) {
          a.S("containerController");
       }
       ts.e0().a(p0, p1);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       Object obj = this.r8("BAR_CONTROLLER");
       a.o(obj, "inject\(ActionBarAccessIds.BAR_CONTROLLER\)");
       this.q = obj;
       obj = this.r8("KCUBE_TAB");
       a.o(obj, "inject\(ActionBarAccessIds.KCUBE_TAB\)");
       this.r = obj;
       obj = this.q8(TextView.class);
       a.o(obj, "inject\(TextView::class.java\)");
       this.p = obj;
       obj = this.r8("KCUBE_CONTAINER_CONTROLLER");
       a.o(obj, "inject\(ActionBarAccessId¡­UBE_CONTAINER_CONTROLLER\)");
       this.s = obj;
       this.t = obj.y();
       return;
    }
}
