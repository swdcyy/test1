package com.yxcorp.gifshow.channel.stagger.header.subentrance.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import jj9.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lj9.c;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import java.util.Collection;
import ekd.q;
import java.util.List;
import lj9.b;
import java.lang.Integer;
import ok.x;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import lnc.a1;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import lj9.a;
import com.kwai.component.feedstaggercard.model.CardStyle;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import g9c.a;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.channel.stagger.widget.ChannelSubEntranceRecyclerView;
import oj9.e;

public class c extends PresenterV2	// class@00106e
{
    public ChannelSubEntranceRecyclerView p;
    public a q;
    public e r;
    public List s;
    public t t;
    public CardStyle u;

    public void c(){
       super();
       this.U7(new b());
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.P8();
       this.X7(this.t.subscribe(new c(this), Functions.e));
       return;
    }
    public final void P8(){
       int c;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "4")) {
          return;
       }
       if (q.f(this.s)) {
          return;
       }
       c tp = this.p;
       int i = this.s.size();
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(tp, Integer.valueOf(i), objArray, uob, "1")) {
          c = (b.a.get().intValue() < 360)? b.c: b.b;
          if (i > c) {
             tp.setClipToPadding(0);
             tp.setClipChildren(0);
             tp.setPadding(a1.d(R.dimen.arg_RES_7f07014a), tp.getPaddingTop(), tp.getPaddingRight(), tp.getPaddingBottom());
          }else {
             tp.setPadding(0, tp.getPaddingTop(), tp.getPaddingRight(), tp.getPaddingBottom());
          }
       }
       this.p.setLayoutManager(new LinearLayoutManager(this.getContext(), 0, 0));
       a uoa = new a(this.u);
       this.q = uoa;
       this.p.setAdapter(uoa);
       this.p.getLayoutParams().height = a1.e(82.00f);
       this.p.setVisibility(0);
       this.q.W0(this.s);
       this.q.k0();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3bae);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.r = this.r8("HOT_CHANNEL_COLUMN_PAGE_LIST");
       this.s = this.r8("HOT_CHANNEL_SUB_ENTRANCES");
       this.u = this.r8("HOT_CHANNEL_CARD_STYLE");
       this.t = this.r8("HOT_CHANNEL_COLUMN_WIDTH_CHANGE_EVENT");
       return;
    }
}
