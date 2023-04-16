package com.kuaishou.live.gzone.winter.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fc5.b;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import m63.k;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import gc5.b;
import ec5.h;
import ec5.f;
import com.kwai.component.list.exposed.behavior.ItemExposedBehavior;
import ec5.q$a;
import android.view.View;
import androidx.fragment.app.Fragment;
import android.graphics.Rect;
import com.yxcorp.utility.n;
import ec5.q;
import ec5.g;
import m63.j;
import gc5.d;
import com.kuaishou.live.gzone.winter.b;
import erd.g;
import crd.b;
import brd.t;
import lnc.b9;
import p91.m;
import mrd.a;
import mrd.c;

public class c extends PresenterV2	// class@001d07
{
    public boolean p;
    public RecyclerFragment q;
    public m r;
    public final HashMap s;
    public a t;
    public c u;
    public b v;
    public b w;
    public static String sLivePresenterClassName = "LiveWinterListItemShowPresenter";

    public void c(){
       super();
       this.p = false;
       this.s = new HashMap();
    }
    public void E8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "2")) {
          return;
       }
       if (this.p == null) {
          boolean b = true;
          this.p = b;
          if (!PatchProxy.applyVoid(objArray, this, uoc, "4")) {
             this.w = new b(this.q.g7());
             q$a uoa = new q$a("live_winter_oly");
             uoa.e(n.B(this.q.getView(), b));
             uoa.c(0);
             f.a(this.q.h0(), this.q, new k(this)).b(this.w).d(uoa.a()).a(new j(this)).start();
             this.v = this.u.subscribe(new b(this));
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       b9.a(this.v);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       this.r = this.r8("LIVE_BASIC_CONTEXT");
       this.t = this.r8("TITLE");
       this.u = this.r8("LIVE_WINTER_LIST_SWITCH_SUBJECT");
       return;
    }
}
