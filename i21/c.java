package i21.c;
import rs1.a;
import android.app.Activity;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import i21.c$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hka.b;
import i21.b;
import i21.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import fe3.a;
import va1.n0;
import re3.c;
import java.lang.Number;
import android.app.Application;
import o56.a;
import android.view.WindowManager;
import android.graphics.Point;
import android.view.Display;
import usd.q;
import rkd.b;
import p51.b$a;
import p51.b;
import java.util.Objects;
import java.lang.Integer;
import androidx.lifecycle.LiveData;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import ym5.a;
import f61.b;
import sp5.b;

public final class c implements a	// class@00280c
{
    public final ViewGroup b;
    public final ViewGroup c;
    public b d;
    public a e;
    public final View f;
    public final View$OnLayoutChangeListener g;
    public final MutableLiveData h;
    public final MutableLiveData i;
    public final RenderAreaView j;
    public final Activity k;

    public void c(Activity p0,ViewGroup p1){
       b uob;
       Object[] objArray;
       a.p(p0, "activity");
       a.p(p1, "rootView");
       super();
       this.k = p0;
       View view = p1.findViewById(R.id.live_multi_pk_container_layout);
       a.o(view, "rootView.findViewById\(R.¡­ulti_pk_container_layout\)");
       this.b = view;
       view = p1.findViewById(R.id.play_view_wrapper);
       a.o(view, "rootView.findViewById\(R.id.play_view_wrapper\)");
       this.c = view;
       view = p1.findViewById(R.id.live_multi_interact_container_background);
       a.o(view, "rootView.findViewById\(R.¡­act_container_background\)");
       this.f = view;
       this.g = new c$a(this);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "1")) {
       }else if(this.d == null){
          if (this.j()) {
             uob = PatchProxy.apply(null, this, uoc, "3");
             if (uob != patchProxyRe) {
             }else {
                uob = new b(this);
             }
          }else {
             uob = PatchProxy.apply(null, this, uoc, "2");
             if (uob != patchProxyRe) {
             }else {
                uob = new a(this);
             }
          }
          this.d = uob;
       }
       if (!p0 instanceof GifshowActivity) {
          objArray = null;
       }
       if (objArray != null) {
          objArray.i3(this.d);
       }
       this.h = new MutableLiveData();
       this.i = new MutableLiveData();
       View view1 = p1.findViewById(R.id.live_multi_line_render_area);
       a.o(view1, "rootView.findViewById\(R.¡­e_multi_line_render_area\)");
       this.j = view1;
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "16")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.f.getLayoutParams();
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          layoutParams.topMargin = (int)this.c.getY();
       }
       return;
    }
    public final void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "11")) {
          return;
       }
       int i = n0.f();
       int i1 = (int)((float)(p0.c() * i) / (float)p0.d());
       p0.height = i1;
       p0.width = i;
       this.f.setVisibility(8);
       this.f();
       this.l(i, i1);
       return;
    }
    public c c(){
       return this.i();
    }
    public final void d(a p0){
       int i;
       int i2;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "12")) {
          return;
       }
       Object[] objArray = null;
       Application obj = PatchProxy.apply(objArray, this, uoc, "14");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          obj = a.b();
          Object[] systemServic = (obj != null)? obj.getSystemService("window"): objArray;
          if (systemServic instanceof WindowManager) {
             objArray = systemServic;
          }
          Point point = new Point();
          if (objArray != null) {
             Display defaultDispl = objArray.getDefaultDisplay();
             if (defaultDispl != null) {
                defaultDispl.getRealSize(point);
             }
          }
          i = q.u(point.x, point.y);
       }
       float f = (float)i * 0x3f800000;
       int i1 = (int)(((float)p0.c() * f) / (float)p0.d());
       if (b.e()) {
          i2 = (int)((f * (float)p0.d()) / (float)p0.c());
       }else {
          i2 = i;
          i = i1;
       }
       this.b.getLayoutParams().height = i;
       this.b.getLayoutParams().width = i2;
       this.f.setVisibility(8);
       this.f();
       this.l(i2, i);
       return;
    }
    public final void e(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "13")) {
          return;
       }
       b$a uoa = b.a(p0.d(), p0.c());
       this.b.getLayoutParams().height = uoa.c();
       this.b.getLayoutParams().width = uoa.e();
       ViewGroup$LayoutParams layoutParams = this.f.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       layoutParams.topMargin = (int)this.c.getY();
       layoutParams.height = uoa.c();
       this.f.setVisibility(0);
       this.a();
       this.f();
       int i = uoa.d();
       this.l(i, uoa.c());
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, c.class, "15")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.b.getLayoutParams();
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          int i = (int)this.c.getY();
          layoutParams.topMargin = i;
          this.i.setValue(Integer.valueOf(i));
          if (this.j()) {
             layoutParams.leftMargin = (int)this.c.getX();
          }
       }
       return;
    }
    public LiveData g(){
       return this.h;
    }
    public LiveData h(){
       return this.i;
    }
    public RenderAreaView i(){
       return this.j;
    }
    public final boolean j(){
       Object obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return d.a(0x4c5dd1b8).f2();
    }
    public void k(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "5")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.e = p0;
       if (b.b()) {
          this.e(p0);
       }else if(this.j()){
          this.d(p0);
       }else {
          this.b(p0);
       }
       return;
    }
    public final void l(int p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "6")) {
          return;
       }
       this.h.setValue(new b(p0, p1));
       return;
    }
}
