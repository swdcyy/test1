package cb8.f;
import cd8.f$a;
import com.mini.js.jsapi.BaseBindAPI;
import ma8.i;
import fc8.i;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.mini.d;
import na8.a;
import ga8.g;
import com.mini.js.commonapitracer.c$b;
import com.mini.js.commonapitracer.b;
import cb8.e;
import java.util.concurrent.Callable;
import brd.t;
import brd.z;
import fc8.c;
import cb8.a;
import erd.a;
import cb8.c;
import cb8.b;
import erd.g;
import crd.b;
import ga8.j;
import fc8.g;
import com.mini.js.jscomponent.keyboard.GlobalKeyboard;
import java.lang.Integer;
import zd8.d;
import java.lang.RuntimeException;
import cb8.d;
import java.lang.Runnable;
import cd8.f;
import java.lang.StringBuilder;

public class f extends BaseBindAPI implements f$a	// class@0003df
{
    public g e;

    public void f(i p0){
       super(p0);
    }
    public Object E(i p0,String p1,Object p2){
       f uof = f.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.equals("getSelectedTextRange", p1)) {
          if (!PatchProxy.applyVoidOneRefs(p0, this, uof, "3")) {
             if (d.f()) {
                d.a("#KeyboardBindApi#", "getSelectedTextRange: ");
             }
             a tc = this.c;
             tc.b(tc.j(p0), p0);
             this.b.a(t.fromCallable(new e(this)).subscribeOn(d.p()).observeOn(c.a()).doOnComplete(a.b).subscribe(new c(p0), new b(p0)), true);
          }
          return null;
       }else {
          String str = "onKeyboardHeightChange";
          if (TextUtils.equals(str, p1) && !PatchProxy.applyVoidOneRefs(p2, this, uof, "4")) {
             j oj = new j(str);
             a tc1 = this.c;
             tc1.b(tc1.j(oj), oj);
             if (d.f()) {
                d.a("#KeyboardBindApi#", "onKeyboardHeightChange: ");
             }
             g og = c.n(p2, true);
             if (og == null) {
                d.c("#KeyboardBindApi#", "onKeyboardHeightChange: 没有找到回调函数");
                tc1 = this.c;
                tc1.h(tc1.e(oj, 0, 0, "miniJSFunction is null", false), oj);
             }else {
                p2 = this.e;
                if (p2 != null) {
                   p2.g();
                }
                this.e = og;
                GlobalKeyboard.a().c(this);
                tc1 = this.c;
                tc1.h(tc1.e(oj, 0, 0, "", true), oj);
             }
          }
          return null;
       }
    }
    public void G(i p0,int p1,String p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, f.class, "2")) {
          return;
       }
       if (TextUtils.equals(p2, "getSelectedTextRange")) {
          p0.h(this.b.h.a(p1));
          return;
       }else if(!TextUtils.equals(p2, "onKeyboardHeightChange")){
          return;
       }else {
          throw new RuntimeException("forbidden in half screen display mode");
       }
    }
    public final void H(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "7")) {
          return;
       }
       if (this.e != null) {
          c.k(new d(this, p0));
       }
       return;
    }
    public void d(f p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uof, "5")) {
          return;
       }
       if (d.f()) {
          d.a("#KeyboardBindApi#", "onKeyboardShow: "+p1);
       }
       this.H(p1);
       return;
    }
    public void h(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "6")) {
          return;
       }
       if (d.f()) {
          d.a("#KeyboardBindApi#", "onKeyboardHide: ");
       }
       this.H(0);
       return;
    }
}
