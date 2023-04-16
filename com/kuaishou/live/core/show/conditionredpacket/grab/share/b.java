package com.kuaishou.live.core.show.conditionredpacket.grab.share.b;
import erd.g;
import com.kuaishou.live.core.show.conditionredpacket.grab.share.c;
import java.lang.Object;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p91.m;
import androidx.lifecycle.LiveData;
import java.lang.Boolean;
import android.view.View;
import java.util.Collection;
import ekd.q;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f62.h;
import u52.t;
import j62.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import g9c.a;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import hi2.b;
import gi2.d;
import hi2.c;
import java.lang.Integer;
import com.yxcorp.gifshow.image.KwaiImageView;
import gi2.f;
import f62.e;
import androidx.lifecycle.Observer;
import i62.z;
import i62.t$c;
import brd.t;
import f62.f;
import crd.b;

public final class b implements g	// class@000aa5
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == null) {
       }else {
          tb.G = p0;
          c uoc = c.class;
          if (!PatchProxy.applyVoidOneRefs(p0, tb, uoc, "5")) {
             Object[] objArray = null;
             if (tb.s.e()) {
                tb.S8(p0);
                tb.W8();
             }else if(tb.G.q.getValue().booleanValue()){
                tb.W8();
                if (!PatchProxy.applyVoid(objArray, tb, uoc, "9")) {
                   int i = 0;
                   tb.A.setVisibility(i);
                   if (q.f(tb.G.l)) {
                      tb.C.setVisibility(8);
                   }else {
                      tb.C.setVisibility(i);
                      if (tb.D == null) {
                         tb.D = new h(tb.r, tb.q);
                         tb.C.setLayoutManager(new LinearLayoutManager(tb.getContext(), i, i));
                         tb.C.setAdapter(tb.D);
                      }
                      tb.D.W0(tb.G.l);
                      tb.D.k0();
                   }
                }
             }else {
                tb.v.setText(a1.p(R.string.arg_RES_7f101fe2));
             }
             tb.Z8();
             if (!PatchProxy.applyVoid(objArray, tb, uoc, "11")) {
                LiveConditionRedPacketInfo liveConditio = tb.n6();
                if (liveConditio != null && liveConditio.z != null) {
                   b uob = tb.W0(liveConditio);
                   if (uob != null && uob.e() != null) {
                      Integer integer = uob.e().b();
                      if (integer != null) {
                         tb.y.setTextColor(integer.intValue());
                      }
                      List list = uob.e().a();
                      if (!q.f(list)) {
                         tb.y4(tb.z, list);
                      }
                   }
                }
             }
             tb.V8(p0);
          }
          p0 = tb.G.t;
          tb.E = p0;
          e uoe = new e(tb);
          tb.F = uoe;
          p0.observeForever(uoe);
          tb.X7(tb.r.c.n().d(2).subscribe(new f(tb)));
       }
       return;
    }
}
