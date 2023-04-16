package com.kuaishou.live.core.show.luckystar.openresult.b;
import k51.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import yb2.i;
import dc2.a;
import p91.m;
import brd.t;
import zb2.o;
import t45.d;
import brd.z;
import ec2.d;
import com.kuaishou.live.core.show.luckystar.openresult.b$a;
import erd.g;
import crd.b;
import android.view.View;
import ekd.m1;
import com.facebook.drawee.view.SimpleDraweeView;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;

public class b extends c	// class@000ce3
{
    public final int A;
    public i p;
    public View q;
    public SimpleDraweeView r;
    public TextView s;
    public TextView t;
    public View u;
    public TextView v;
    public RecyclerView w;
    public KwaiImageView x;
    public boolean y;
    public final String z;
    public static String sLivePresenterClassName = "LiveAudienceLuckyStarOpenResultPresenter";

    public void b(String p0,int p1){
       super();
       this.y = false;
       this.z = p0;
       this.A = p1;
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "6")) {
          LinearLayoutManager linearLayout = new LinearLayoutManager(this.getContext());
          linearLayout.setOrientation(1);
          this.w.setLayoutManager(linearLayout);
       }
       this.P8();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       this.y = false;
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       b tp = this.p;
       this.X7(tp.n.a(new a(tp.a.getLiveStreamId(), this.z)).observeOn(d.a).subscribe(new d(this), new b$a(this)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a2138);
       this.r = m1.f(p0, 0x7f0a2133);
       this.s = m1.f(p0, 0x7f0a2149);
       this.t = m1.f(p0, 0x7f0a214a);
       this.v = m1.f(p0, 0x7f0a2145);
       this.w = m1.f(p0, 0x7f0a2135);
       this.x = m1.f(p0, 0x7f0a2109);
       this.u = m1.f(p0, 0x7f0a2129);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.q8(i.class);
       return;
    }
}
