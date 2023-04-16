package com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.g$a;
import uw9.y;
import b3a.f;
import xk9.g;
import e1a.v;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.g;
import java.lang.Object;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import uw9.x;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import im8.f;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.e;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import uw9.m3;
import g99.w;

public class g$a implements y, f, g, v	// class@001bad
{
    public int a;
    public int b;
    public int c;
    public View d;
    public RecyclerView e;
    public final g f;

    public void g$a(g p0,boolean p1){
       this.f = p0;
       super();
       View view = p0.m8().findViewById(R.id.title_root);
       this.d = view;
       this.c = view.getHeight();
       if (p1) {
          this.b = g.J;
          this.a = g.K;
       }else {
          this.g();
       }
       return;
    }
    public void a(){
       x.a(this);
    }
    public void b(int p0,QComment p1){
       if (PatchProxy.isSupport(g$a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, g$a.class, "2")) {
          return;
       }
       this.d();
       return;
    }
    public void c(int p0){
       if (PatchProxy.isSupport(g$a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, g$a.class, "8")) {
          return;
       }
       this.d();
       return;
    }
    public void d(){
       int b;
       g$a uoa = g$a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "5")) {
          return;
       }
       RecyclerView recyclerView = this.f.z.get();
       this.e = recyclerView;
       g$a uoa1 = null;
       int i = (recyclerView != null)? (int)recyclerView.getTranslationY(): 0;
       this.c = this.f.D.get().intValue() - i;
       g$a obj = PatchProxy.apply(objArray, this, uoa, "7");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          e q = this.f.q;
          if (q != null && q.isAdded()) {
             uoa1 = 1;
          }
          b = uoa1;
       }
       if (b != null && this.a != null) {
          obj = this.b;
          if (obj != null) {
             if (obj < null) {
                b = this.f.C.get().intValue() - m3.f(this.f.getActivity(), this.f.F);
                this.b = b;
                this.a = b - g.I;
             }
             obj = this.c;
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(obj), this, uoa, "6")) {
                uoa = this.a;
                if (obj <= uoa) {
                   this.f.w.u0(0);
                }else {
                   g$a tb = this.b;
                   if (obj >= tb) {
                      this.f.w.u0(0x3f800000);
                   }else {
                      this.f.w.u0(((float)(obj - uoa) / (float)(tb - uoa)));
                   }
                }
             }
          }
       }
       return;
    }
    public void e(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(g$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, g$a.class, "4")) {
          return;
       }
       this.d();
       return;
    }
    public void f(QComment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "3")) {
          return;
       }
       this.d();
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "1")) {
          return;
       }
       int i = this.f.C.get().intValue() - m3.f(this.f.getActivity(), this.f.F);
       this.b = i;
       this.a = i - g.I;
       return;
    }
}
