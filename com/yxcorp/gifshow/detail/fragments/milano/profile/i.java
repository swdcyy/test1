package com.yxcorp.gifshow.detail.fragments.milano.profile.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.fragments.milano.profile.i$a;
import com.yxcorp.gifshow.detail.fragments.milano.profile.i$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import ef5.a;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import bf5.q;
import z0a.u;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Math;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import k2b.e0;
import com.yxcorp.gifshow.log.c0;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.log.d0;
import l66.c;
import dda.m;
import m66.a;
import lnc.i3;
import android.view.View;
import z0a.v;
import p1a.a$a;
import i0a.d;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import ef5.c;
import java.lang.Boolean;

public class i extends PresenterV2	// class@001551
{
    public RecyclerView p;
    public BaseFragment q;
    public c r;
    public q s;
    public SlidePlayViewModel t;
    public int u;
    public int v;
    public boolean w;
    public final RecyclerView$r x;
    public final b y;

    public void i(){
       super();
       this.u = -1;
       this.v = -1;
       this.x = new i$a(this);
       this.y = new i$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       this.t = SlidePlayViewModel.B0(this.q);
       this.r.a(this.y);
       this.p.addOnScrollListener(this.x);
       this.X7(this.s.u.subscribe(new u(this), Functions.e));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       this.p.removeOnScrollListener(this.x);
       return;
    }
    public void P8(){
       int i;
       if (PatchProxy.applyVoid(null, this, i.class, "5")) {
          return;
       }
       a adapter = this.p.getAdapter();
       LinearLayoutManager layoutManage = this.p.getLayoutManager();
       if (adapter != null && layoutManage != null) {
          i = layoutManage.i0();
          i tu = this.u;
          String str = -1;
          this.u = (tu != str)? Math.min(i, tu): i;
          int i1 = layoutManage.c();
          i tv = this.v;
          this.v = (tv != str)? Math.max(i1, tv): i1;
          i tu1 = this.u;
          if (tu1 != str && this.v != str) {
             while (tu1 <= this.v) {
                QPhoto qPhoto = adapter.N0(tu1);
                if (!PatchProxy.isSupport(i.class) || (PatchProxy.applyVoidTwoRefs(qPhoto, Integer.valueOf(tu1), this, i.class, "6") || (qPhoto != null && (!qPhoto.isShowed() && this.t.t() instanceof e0)))) {
                   qPhoto.setShowed(true);
                   if (!PatchProxy.isSupport(i.class) || !PatchProxy.applyVoidTwoRefs(qPhoto, Integer.valueOf(tu1), this, i.class, "7")) {
                      qPhoto.setPosition(tu1);
                      c0.q().n(d0.h(qPhoto.mEntity, 4));
                      if (this.w == null) {
                         c.a().b(new m(qPhoto.mEntity));
                      }
                   }
                   i3 oi3 = i3.f();
                   oi3.d("page_special_type", "SIDE_FEED_PAGE");
                   v ov = new v(this, 0, 804, "show_photo");
                   ov.m(oi3.e());
                   d.b(this.t.t(), this.m8(), qPhoto, ov);
                }
             label_00e6 :
                tu1 = tu1 + 1;
             }
          }
       }
    label_00ea :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a32a9);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       this.r = this.r8("MILANO_ATTACH_LISTENER");
       this.s = this.q8(q.class);
       this.w = this.r8("HAS_PROFILE_AD").booleanValue();
       return;
    }
}
