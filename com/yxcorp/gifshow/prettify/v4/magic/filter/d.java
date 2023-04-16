package com.yxcorp.gifshow.prettify.v4.magic.filter.d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j$e;
import o1c.w0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xyb.a;
import q87.c;
import com.kwai.feature.post.api.widget.PrettifyLoadingView;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j$c;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyTagView;
import d1c.c;
import p0c.c;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j$d;
import brd.t;
import t45.d;
import brd.z;
import o1c.j;
import o1c.i;
import erd.g;
import crd.b;

public final class d implements View$OnClickListener	// class@0011ba
{
    public final j b;
    public final j$e c;
    public final w0 d;

    public void d(j p0,j$e p1,w0 p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onClick(View p0){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       Objects.requireNonNull(tb);
       int adapterPosit = tc.getAdapterPosition();
       if (adapterPosit == -1) {
       }else {
          int i = 0;
          if (td.j()) {
             tb.l = tc.getAdapterPosition();
             if (!PatchProxy.applyVoidTwoRefs(tc, td, tb, j.class, "22") && tb.m != null) {
                if (tb.m1()) {
                   Object[] objArray = new Object[i];
                   a.D().w(j.s, "already requesting", objArray);
                }else {
                   tc.l.c();
                   tc.c.p();
                   j i1 = tb.i;
                   if (i1 != null) {
                      i1.t(tb.m.e().k());
                   }
                   tb.o = tb.m.e().x().observeOn(d.a).subscribe(new j(tb, td, tc), new i(tb, tc));
                }
             }
          }else if(tb.j == adapterPosit){
             i = true;
          }
          tb.l1(tc, adapterPosit, td, i);
       }
       return;
    }
}
