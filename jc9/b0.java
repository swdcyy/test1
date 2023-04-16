package jc9.b0;
import hc9.e$a;
import ad9.i$e;
import com.yxcorp.gifshow.camera.record.base.b;
import hc9.e;
import java.lang.Object;
import jc9.b0$a;
import ad9.i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import jc9.b0$b;
import hc9.f;
import ad9.l;
import java.util.Map;
import hc9.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import crd.b;
import crd.a;
import bh9.s;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.bubble.a;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lc9.b;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.widget.TextView;
import ekd.k1;
import java.lang.Runnable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import java.util.List;
import java.util.Arrays;
import jd.c;
import ub.b;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import android.view.ViewTreeObserver;
import ad9.k;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.widget.ProgressBar;
import jc9.k;
import android.view.View$OnClickListener;
import android.text.TextPaint;
import jc9.r;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.utility.n;
import ad9.g;
import com.kwai.library.widget.popup.common.f;
import jc9.l;
import jc9.n;
import nc9.a;
import android.os.Handler;
import lnc.b9;
import oc9.w;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import ra9.c;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import jc9.z;
import jc9.q;
import brd.t;
import jc9.y;
import jc9.w;
import erd.g;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import jc9.o;
import ad9.a;
import jc9.d0;

public class b0 implements e$a, i$e	// class@002937
{
    public Map b;
    public int c;
    public i d;
    public e e;
    public b f;
    public Handler g;
    public a h;
    public boolean i;
    public a j;
    public PostBubbleManager$c k;
    public final r$a l;

    public void b0(b p0,e p1){
       super();
       this.c = 0;
       this.l = new b0$a(this);
       this.f = p0;
       this.d = new i(p0.f(), new b0$b(this), p1.a().i());
       this.e = p1;
       p1.j(true);
       this.b = d.a(this.e.a());
       this.e.b(this);
       p0.h = this;
    }
    public void a(int p0){
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob0, "25")) {
          return;
       }
       this.d.o = p0;
       return;
    }
    public final void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "14")) {
          return;
       }
       b0 th = this.h;
       if (th == null || th.isDisposed()) {
          this.h = new a();
       }
       this.h.c(p0);
       return;
    }
    public final void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b0.class, "8")) {
          return;
       }
       if (this.e.g() != 7) {
          if (this.f.d(s.c).b != null) {
             if (this.f.f().getView() != null) {
                objArray = this.f.f().getView().findViewById(R.id.control_speed_layout);
             }
             this.d.a(objArray);
          }else {
             this.d.a(objArray);
          }
       }
       return;
    }
    public void d(int p0){
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob0, "11")) {
          return;
       }
       if (this.e.g() != 7 && this.e.g()) {
          this.e.c(null, p0);
       }
       b0 td = this.d;
       if (td.l != null) {
          td.c(true);
       }
       this.e();
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, b0.class, "24")) {
          return;
       }
       b0 tj = this.j;
       if (tj != null) {
          b0 tk = this.k;
          if (tk != null) {
             tk.a(tj, null, 4);
          }
       }
       this.j = null;
       this.k = null;
       return;
    }
    public final long f(int p0,f p1){
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uob0, "21");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       if (p0 == 5 || (p0 == 4 && (p1 != null && p1.f() > 0))) {
          return p1.f();
       }else {
          return 3000;
       }
    }
    public final void g(Object p0,b p1,int p2,boolean p3,int p4){
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Boolean.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uob0, "22")) {
             return;
          }
       }
       String str = (p2 == 3)? p1.o(p0, p4, 0): p1.a(p0, p2, 0);
       this.d.d.setText(str);
       if (this.d.e != null) {
          if (k1.f() && p3) {
             if (p2 != 3 && (p2 == 1 || p2 == 2)) {
                this.d.e.setVisibility(0);
                this.d.e.setText(p1.o(p0, p4, 1));
             }else if(p2 == 5){
                this.d.e.setVisibility(0);
                this.d.e.setText(p1.a(p0, 5, 1));
             }else if(p2 == 4){
                this.d.e.setVisibility(0);
                this.d.e.setText(p1.a(p0, 4, 1));
             }else {
                this.d.e.setVisibility(8);
             }
          }else {
             this.d.e.setVisibility(8);
          }
       }
       return;
    }
    public final void h(b p0,Object p1,int p2,Runnable p3,boolean p4,Runnable p5){
       l this;
       f uof2;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       int i = p2;
       b0 uob0 = b0.class;
       int i1 = 1;
       int i2 = 0;
       int i3 = 4;
       int i4 = 3;
       int i5 = 2;
       int i6 = 6;
       int i7 = 5;
       if (PatchProxy.isSupport(uob0)) {
          Object[] objArray = new Object[i6];
          objArray[i2] = oobject;
          objArray[i1] = oobject1;
          objArray[i5] = Integer.valueOf(p2);
          objArray[i4] = p3;
          objArray[i3] = Boolean.valueOf(p4);
          objArray[i7] = p5;
          if (PatchProxy.applyVoid(objArray, obj, uob0, "20")) {
             return;
          }
       }
       if (!obj.d.e()) {
          return;
       }else if(obj.d.l != null && (i != i4 && (i != i7 && (i == i1 || i == i5)))){
          if (oobject.d(oobject1, obj.f)) {
             obj.d.f.setPlaceHolderImage(oobject.d(oobject1, obj.f));
          }
          obj.d.f.R(Arrays.asList(e0.b(p0.j(p1), "")), 0, 0, p0.p(p1), null);
       }
       f uof = obj.e.a();
       boolean b = uof.o();
       f uof1 = uof;
       this.g(p1, p0, p2, b, 0);
       i2 = TextUtils.n(obj.d.d.getText().toString(), obj.d.d.getText().toString()) ^ 0x01;
       if (i2 && uof1.l()) {
          uob0 = obj.d;
          Objects.requireNonNull(uob0);
          if (!PatchProxy.applyVoid(null, uob0, i.class, "11") && uob0.e != null) {
             uob0.d.getViewTreeObserver().addOnPreDrawListener(new k(uob0));
          }
       }else {
          i c = obj.d.c;
          int i8 = (i6 == i)? 100: 0;
          c.setProgress(i8);
       }
       boolean k uob01 = uof1.q();
       if (i == i7) {
          uob01 = uof1.p();
       }else if(i == i3){
          uob01 = uof1.r();
       }
       if (uob01) {
          obj.d.g(i1);
          b0 d = obj.d;
          String str = p0.i(p1, p2);
          uob01 = new k(this, p0, p1, p2, p3);
          Objects.requireNonNull(d);
          if (!PatchProxy.applyVoidTwoRefs(str, i7, d, i.class, "1")) {
             d.h.setText(str);
             d.h.setOnClickListener(i7);
             d.h.getPaint().setFakeBoldText(i1);
          }
       }else {
          obj.d.g(false);
       }
       p0.g(p1, p2);
       uob01 = (obj.d.l == null || uof1.j())? true: false;
       this = (!i2)? null: uob01;
       if (uof1.n()) {
          uof2 = uof1;
          uof2.z(false);
       }else {
          uof2 = uof1;
          i1 = this;
       }
       obj.d.b();
       if (i1 != null) {
          b0 d1 = obj.d;
          r ViewGroup$LayoutParams uob011 = new r(this, p4, p2, uof2, p5);
          Objects.requireNonNull(d1);
          if (!PatchProxy.applyVoidOneRefs(oobject1, d1, i.class, "9") && (!PatchProxy.isSupport(i.class) || !PatchProxy.applyVoidTwoRefs(oobject1, Boolean.FALSE, d1, i.class, "8"))) {
             uob011 = d1.d.getLayoutParams();
             if (uob011 != null) {
                n.Y(d1.j, 0, 0);
                uob011.width = -2;
                d1.d.setLayoutParams(uob011);
                f.F(d1.d, new g(d1, 0, oobject1));
             }
          }
       }else if(p4){
          obj.d.i(super(obj), obj.f(i, uof2));
       }
       if (p5 != null) {
          p5.run();
       }
    label_01e2 :
       this.c();
       return;
    }
    public void onStateChanged(int p0){
       b uob1;
       Object obj2;
       b0 obj3;
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob0, "2")) {
          return;
       }
       if (!p0) {
          b0 tb = this.b;
          if (tb != null) {
             tb.clear();
          }
       }
       f uof = this.e.a();
       String str = a.b(uof.h());
       Object obj = null;
       if (!TextUtils.x(str)) {
          b uob = this.b.get(str);
          if (uob == null) {
             Map map = d.a(uof);
             this.b = map;
             uob = map.get(str);
          }
          uob1 = uob;
       }else {
          uob1 = obj;
       }
       int i = 0;
       switch (p0){
           case 1:
           case 2:
             if (!PatchProxy.isSupport(uob0) || !PatchProxy.applyVoidTwoRefs(uob1, Integer.valueOf(p0), this, uob0, "15")) {
                Object[] objArray = new Object[i];
                a.D().w("AutoDownloadBarHandler", "onPrepare, state:"+p0, objArray);
                Object obj1 = this.e.f();
                Objects.requireNonNull(this.e);
                if (obj1 == null || uob1 == null) {
                   this.e.c(obj, i);
                }else {
                   o oo = new o(this, uob1, obj1, p0);
                   if (!PatchProxy.applyVoidTwoRefs(oo, obj1, this, uob0, "23")) {
                      this.f.m(new a(obj, obj1));
                      if (!this.e.a().k() && (this.i == null && this.f.b().V7() != null)) {
                         this.f.b().V7().n(new d0(this, oo));
                      }else {
                         oo.run();
                      }
                      this.i = true;
                   }
                }
             }
             break;
           case 3:
             if (!PatchProxy.applyVoidOneRefs(uob1, this, uob0, "16")) {
                obj2 = this.e.f();
                if (obj2 == null || uob1 == null) {
                   this.e.c(obj, i);
                }else if(!this.d.e()){
                   this.h(uob1, obj2, 3, null, false, new n(this, uob1, obj2));
                }
             }
             break;
           case 4:
             if (!PatchProxy.applyVoidOneRefs(uob1, this, uob0, "17")) {
                obj2 = this.e.f();
                if (obj2 == null || (uob1 != null && this.d.e())) {
                   uob1.e(obj2);
                   this.h(uob1, obj2, 4, null, this.e.a().m(), null);
                }
             }
             break;
           case 5:
             if (!PatchProxy.applyVoidOneRefs(uob1, this, uob0, "19")) {
                obj3 = this.e.f();
                if (obj3 != null && uob1 != null) {
                   if (this.e.a().b() > 0) {
                      this.e.d(6, obj3);
                      this.e.a().v(i);
                   }else {
                      uob1.c(obj3, this.f).subscribe(new y(this, obj3, uob1), new w(this, obj3));
                   }
                }
             }
             break;
           case 6:
             if (!PatchProxy.applyVoidOneRefs(uob1, this, uob0, "18")) {
                obj3 = this.e.f();
                if (obj3 == null || (uob1 != null && this.d.e())) {
                   if (this.g == null) {
                      this.g = new Handler();
                   }
                   this.h(uob1, obj3, 6, new z(this), false, null);
                   this.g.postDelayed(new q(this, obj3), this.e.a().b());
                }
             }
             break;
           case 7:
             if (uob1 != null) {
                obj3 = this.g;
                if (obj3 != null) {
                   obj3.removeCallbacksAndMessages(obj);
                }
                obj3 = this.h;
                if (obj3 != null) {
                   b9.a(obj3);
                }
                uob1.k(this.e.f(), this.f);
                this.b.remove(str);
                this.e();
                c uoc = this.f.b().V7();
                if (uoc != null && (uoc.h() != null && uoc.h().d() == RecordBubbleItem.AUTO_DOWNLOAD_PANEL)) {
                   uoc.c();
                }
             }
             break;
           default:
       }
    label_022e :
       return;
    }
}
