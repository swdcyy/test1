package com.yxcorp.gifshow.map.map.presenter.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z5b.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import j6b.k;
import androidx.recyclerview.widget.RecyclerView$r;
import j6b.g;
import brd.t;
import xl8.b;
import j6b.h;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import wrb.a;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import j6b.i;
import java.lang.Boolean;
import wkd.b;
import x5b.a;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import j6b.j;
import java.lang.Integer;
import android.widget.TextView;
import java.lang.CharSequence;
import android.view.View;
import ekd.m1;
import android.widget.RelativeLayout;
import android.widget.ImageView;
import com.yxcorp.gifshow.util.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import j6b.e;
import android.view.View$OnClickListener;
import j6b.f;
import com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.Drawable;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import k6b.j;
import android.view.ViewGroup;
import android.text.TextPaint;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class a extends PresenterV2	// class@001cc6
{
    public int A;
    public b B;
    public BaseFragment C;
    public final int D;
    public final int E;
    public final int F;
    public RelativeLayout p;
    public View q;
    public TextView r;
    public TextView s;
    public RecyclerView t;
    public final List u;
    public a v;
    public String w;
    public boolean x;
    public boolean y;
    public int z;
    public static final int G;

    static {
       a.G = a1.e(5.00f);
    }
    public void a(){
       super();
       this.u = new ArrayList();
       this.w = "0";
       this.D = a1.e(2.00f);
       this.E = a1.e(13.00f);
       this.F = a1.e(60.00f);
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       a tv = this.v;
       tv.e = this.u;
       this.t.setAdapter(tv);
       if (!PatchProxy.applyVoid(objArray, this, uoa, "8")) {
          this.t.addOnScrollListener(new k(this));
       }
       this.P8(true);
       this.v.f = new g(this);
       g e = Functions.e;
       this.X7(this.B.observable().subscribe(new h(this), e));
       this.X7(RxBus.f.g(a.class, RxBus$ThreadMode.MAIN).subscribe(new i(this), e));
       return;
    }
    public void P8(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "5")) {
          return;
       }
       uoa = b.a(0x42d90323);
       String str = (p0)? "0": this.w;
       this.X7(uoa.c(str).observeOn(d.c).map(new e()).observeOn(d.a).subscribe(new j(this, p0), Functions.d()));
       return;
    }
    public final void R8(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "7")) {
          return;
       }
       this.A = p0;
       if (p0 < 1) {
          this.r.setVisibility(8);
       }else {
          this.r.setVisibility(0);
          String str = String.valueOf(p0);
          if (p0 > 99) {
             str = "99+";
          }
          this.r.setText(str);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2a6f);
       ImageView imageView = m1.f(p0, R.id.btn_chat);
       w0.a(this.p, 0x3f000000);
       this.q = m1.f(p0, 0x7f0a2a71);
       this.r = m1.f(p0, 0x7f0a4111);
       this.s = m1.f(p0, 0x7f0a3f2c);
       this.q.setVisibility(8);
       this.p.setVisibility(8);
       this.t = m1.f(p0, 0x7f0a06bd);
       this.v = new a();
       this.t.setLayoutManager(new LinearLayoutManager(this.getContext()));
       this.p.setOnClickListener(new e(this));
       m1.f(p0, R.id.chat_close_btn).setOnClickListener(new f(this));
       if (MapExperimentUtils.g.e()) {
          imageView.getLayoutParams().height = this.F;
          imageView.getLayoutParams().width = this.F;
          imageView.setImageDrawable(a1.f(R.drawable.arg_RES_7f081640));
          ConstraintLayout$LayoutParams layoutParams = this.p.getLayoutParams();
          a tF = this.F;
          layoutParams.height = tF;
          layoutParams.width = tF;
          layoutParams.u = j.b();
          this.p.setLayoutParams(layoutParams);
          layoutParams = this.q.getLayoutParams();
          layoutParams.u = j.b();
          layoutParams.width = this.F;
          layoutParams.rightMargin = this.E;
          this.q.setLayoutParams(layoutParams);
          this.q.setBackgroundResource(R.drawable.arg_RES_7f081653);
          this.t.setPadding(0, 0, 0, 0);
          this.r.getLayoutParams().height = -2;
          this.r.setPadding(a.G, 0, a.G, this.D);
          ViewGroup$MarginLayoutParams layoutParams1 = this.s.getLayoutParams();
          layoutParams1.topMargin = this.D;
          this.s.getPaint().setFakeBoldText(true);
          this.s.setLayoutParams(layoutParams1);
          p0 = m1.f(p0, R.id.bg_blur_view);
          layoutParams1 = p0.getLayoutParams();
          layoutParams1.leftMargin = 0;
          layoutParams1.rightMargin = 0;
          p0.setLayoutParams(layoutParams1);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.B = this.r8("PHOTO_MAP_MAP_DATA_UPDATE");
       this.C = this.r8("FRAGMENT");
       return;
    }
}
