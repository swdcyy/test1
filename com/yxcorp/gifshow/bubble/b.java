package com.yxcorp.gifshow.bubble.b;
import com.yxcorp.gifshow.bubble.a;
import ra9.c;
import java.lang.Object;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import com.yxcorp.gifshow.bubble.b$c;
import com.kwai.library.widget.popup.common.c;
import brd.t;
import ra9.a;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import com.yxcorp.gifshow.bubble.b$a;
import com.yxcorp.gifshow.bubble.e;
import lnc.l3;
import q87.c;
import com.yxcorp.gifshow.bubble.d;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import java.lang.Long;
import com.yxcorp.gifshow.widget.popup.a;
import android.app.Activity;
import com.kwai.library.widget.popup.bubble.a$c;
import lnc.a1;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.c$b;
import ra9.j;
import k07.g;
import com.yxcorp.gifshow.bubble.b$b;
import a2.i0;
import android.view.ViewTreeObserver;
import ra9.k;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public class b implements a	// class@001c77
{
    public final c b;
    public View c;
    public long d;
    public b$b e;
    public PostBubbleManager$c f;
    public KwaiBubbleOption g;
    public b$c h;
    public t i;
    public boolean j;
    public c k;

    public void b(c p0){
       super();
       this.d = 3000;
       this.g = KwaiBubbleOption.e;
       this.j = true;
       this.b = p0;
    }
    public boolean a(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c;
       b = (obj != null && (obj.isEnabled() && (this.c.isShown() && !this.c.getRotation())))? true: false;
       return b;
    }
    public b b(View p0){
       this.c = p0;
       return this;
    }
    public boolean c(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.h;
       b = false;
       obj = (obj == null || obj.c())? 1: 0;
       int i = (this.i != null || this.a())? 1: 0;
       if (obj && i) {
          b = true;
       }
       return b;
    }
    public c d(){
       return this.b;
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b tk = this.k;
       if (tk != null) {
          tk.o();
          this.k = null;
       }
       return;
    }
    public t e(){
       return this.i;
    }
    public boolean f(){
       return a.d(this);
    }
    public boolean g(String p0){
       return a.c(this, p0);
    }
    public b h(t p0){
       this.i = p0;
       return this;
    }
    public boolean i(FragmentActivity p0,PostBubbleManager$c p1){
       boolean b;
       d uod;
       a uoa1;
       Object obj = this;
       Object obj1 = p0;
       d obj2 = p1;
       b obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, b.class, "2");
       if (obj3 != PatchProxyResult.class) {
          return obj3.booleanValue();
       }
       b$a uoa = new b$a(obj, obj2);
       obj2 = PatchProxy.applyThreeRefs(p0, this, uoa, null, e.class, "1");
       if (obj2 != PatchProxyResult.class) {
          b = obj2.booleanValue();
       }else if(!this.a()){
          Object[] objArray = new Object[0];
          l3.C().A("PostBubbleUtils", "showBubble: view not ready", objArray);
          b = false;
       }else {
          obj2 = new d(obj, uoa);
          obj3 = obj.c;
          String content = this.d().getContent();
          b d = obj.d;
          if (PatchProxy.isSupport(e.class)) {
             uod = obj2;
             b = true;
             uoa1 = PatchProxy.applyFourRefs(p0, obj3, content, Long.valueOf(d), null, e.class, "3");
             if (uoa1 != PatchProxyResult.class) {
             label_009f :
                uoa1.K0(obj.g);
                uoa1.t0(new j(obj));
                obj3 = obj.e;
                if (obj3 != null) {
                   obj3.a(uoa1);
                }
                uoa1.M(uod);
                if (i0.Y(obj.c)) {
                   e.a(obj, uoa1);
                }else {
                   obj.c.getViewTreeObserver().addOnGlobalLayoutListener(new k(obj, uoa1));
                }
             }
          }else {
             uod = obj2;
             b = true;
          }
          uoa1 = new a(obj1);
          uoa1.q0(b);
          uoa1.o0(obj3);
          uoa1.v0(a1.d(R.dimen.arg_RES_7f07030a));
          uoa1.F0(content);
          uoa1.T(d);
          goto label_009f ;
       }
       return b;
    }
    public b j(PostBubbleManager$c p0){
       this.f = p0;
       return this;
    }
    public b k(b$b p0){
       this.e = p0;
       return this;
    }
    public b l(b$c p0){
       this.h = p0;
       return this;
    }
    public b m(boolean p0){
       this.j = p0;
       return this;
    }
}
