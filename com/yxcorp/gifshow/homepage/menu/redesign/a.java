package com.yxcorp.gifshow.homepage.menu.redesign.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import wkd.b;
import fo5.b;
import tta.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import android.app.Activity;
import qta.f0;
import tta.d;
import lnc.a1;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import tta.c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import fo5.c;
import tta.o;
import wh5.c;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import android.view.View;
import com.yxcorp.gifshow.homepage.menu.a;
import com.yxcorp.gifshow.homepage.menu.g;
import xl8.b;
import mrd.c;
import java.util.BitSet;

public class a extends PresenterV2	// class@00177c
{
    public final b A;
    public final c B;
    public d C;
    public c D;
    public BitSet E;
    public View p;
    public RecyclerView q;
    public TextView r;
    public o s;
    public a t;
    public g u;
    public a v;
    public b w;
    public f0 x;
    public List y;
    public b z;

    public void a(){
       super();
       this.A = b.a(0xad3151d);
       this.B = new b(this);
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "8")) {
          String str = this.A.t();
          if (!TextUtils.x(str)) {
             this.r.setText(str);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "6")) {
          uoa = this.C;
          if (uoa != null) {
             this.q.removeItemDecoration(uoa);
          }
          ViewGroup$MarginLayoutParams layoutParams = this.q.getLayoutParams();
          layoutParams.leftMargin = this.x.c(this.getActivity());
          layoutParams.rightMargin = this.x.c(this.getActivity());
          this.q.setLayoutParams(layoutParams);
          d uod = new d(this.x.b(this.getActivity()), a1.e(19.00f));
          this.C = uod;
          this.q.addItemDecoration(uod);
          this.q.setLayoutManager(new GridLayoutManager(this.getContext(), 3));
          c uoc = new c(this, false);
          this.s = uoc;
          this.q.setAdapter(uoc);
       }
       this.P8();
       this.A.j(this.B);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       a ts = this.s;
       if (ts != null) {
          ts.onDestroy();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.A.p(this.B);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       List list = (c.b())? this.A.u(): this.A.l();
       this.s.r1(new ArrayList(list));
       if (q.f(list)) {
          this.p.setVisibility(8);
       }else {
          this.p.setVisibility(0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.q = p0.findViewById(0x7f0a08e0);
       this.p = p0.findViewById(0x7f0a08e1);
       this.r = p0.findViewById(0x7f0a08eb);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.t = this.r8("HOME_MENU_CLOSE_HELPER");
       this.u = this.r8("HOME_MENU_LOGGER_V3");
       this.y = this.r8("HOME_PANEL_SLIDE_LISTENERS");
       this.x = this.r8("MENU_LAZY_DATA");
       this.w = this.r8("HOME_SLIDE_PANEL_STATE");
       this.z = this.r8("MENU_EDITOR_OPEN_STATE");
       this.D = this.t8("MENU_RED_DOT_SUBJECT");
       this.E = this.t8("MENU_RED_DOT_BIT_SET");
       return;
    }
}
