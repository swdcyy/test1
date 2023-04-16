package com.yxcorp.gifshow.homepage.menu.redesign.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import wkd.b;
import fo5.b;
import tta.f0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wh5.c;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView;
import tta.e0;
import android.app.Activity;
import qta.f0;
import lnc.a1;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import tta.g0;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import fo5.c;
import tta.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.homepage.menu.a;
import com.yxcorp.gifshow.homepage.menu.g;
import xl8.b;
import mrd.c;
import java.util.BitSet;

public class h extends PresenterV2	// class@00178a
{
    public final c A;
    public e0 B;
    public c C;
    public BitSet D;
    public View p;
    public RecyclerView q;
    public o r;
    public a s;
    public g t;
    public a u;
    public b v;
    public f0 w;
    public List x;
    public b y;
    public final b z;

    public void h(){
       super();
       this.z = b.a(0xad3151d);
       this.A = new f0(this);
    }
    public void E8(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "3")) {
          return;
       }
       if (c.b()) {
          this.p.setVisibility(8);
          return;
       }else if(PatchProxy.applyVoid(objArray, this, oh, "6")){
          oh = this.B;
          if (oh != null) {
             this.q.removeItemDecoration(oh);
          }
          e0 uoe0 = new e0(this.w.d(this.getActivity()), a1.e(15.00f));
          this.B = uoe0;
          this.q.addItemDecoration(uoe0);
          this.q.setLayoutManager(new GridLayoutManager(this.getContext(), 3));
          g0 og0 = new g0(this, true);
          this.r = og0;
          this.q.setAdapter(og0);
       }
       this.P8();
       this.z.j(this.A);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, h.class, "5")) {
          return;
       }
       h tr = this.r;
       if (tr != null) {
          tr.onDestroy();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       this.z.p(this.A);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, h.class, "7")) {
          return;
       }
       ArrayList uArrayList = new ArrayList(this.z.d());
       this.r.r1(uArrayList);
       if (q.f(uArrayList)) {
          this.p.setVisibility(8);
       }else {
          this.p.setVisibility(0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       this.q = p0.findViewById(0x7f0a3ffc);
       this.p = p0.findViewById(0x7f0a3ffd);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.s = this.r8("HOME_MENU_CLOSE_HELPER");
       this.t = this.r8("HOME_MENU_LOGGER_V3");
       this.x = this.r8("HOME_PANEL_SLIDE_LISTENERS");
       this.w = this.r8("MENU_LAZY_DATA");
       this.v = this.r8("HOME_SLIDE_PANEL_STATE");
       this.y = this.r8("MENU_EDITOR_OPEN_STATE");
       this.C = this.t8("MENU_RED_DOT_SUBJECT");
       this.D = this.t8("MENU_RED_DOT_BIT_SET");
       return;
    }
}
