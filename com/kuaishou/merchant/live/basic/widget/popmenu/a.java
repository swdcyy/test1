package com.kuaishou.merchant.live.basic.widget.popmenu.a;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import l24.a;
import android.view.View;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.app.Activity;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import z8c.a;
import bld.b;
import android.content.res.Resources;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.merchant.live.basic.widget.popmenu.b;
import java.util.List;
import com.kuaishou.merchant.live.basic.widget.popmenu.a$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import o07.n;

public class a extends c implements PopupInterface$f	// class@0018d8
{
    public a$a p;
    public RecyclerView q;
    public List r;
    public b s;
    public View t;
    public int u;

    public void a(c$b p0){
       super(p0);
       p0.v(true);
       p0.L(this);
    }
    public void O(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       f.G(this.f, new a(this));
       return;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       View view = p1.inflate(R.layout.arg_RES_7f0d087e, p2);
       RecyclerView recyclerView = m1.f(view, R.id.popup_menu_recycler_view);
       this.q = recyclerView;
       recyclerView.setLayoutManager(new LinearLayoutManager(this.u()));
       a uoa = new a(1, false, false);
       b uob = new b();
       uob.v(this.u().getResources().getColor(R.color.arg_RES_7f061dc8));
       uob.u(this.u().getResources().getDimension(R.dimen.arg_RES_7f070258));
       uob.t(this.u().getResources().getDimension(R.dimen.arg_RES_7f070195));
       uob.s(DrawableCreator$Shape.Rectangle);
       uoa.o(uob.a());
       this.q.addItemDecoration(uoa);
       uoa = this.r;
       a tp = this.p;
       b uob1 = PatchProxy.applyTwoRefs(uoa, tp, this, a.class, "3");
       if (uob1 != PatchProxyResult.class) {
       }else {
          uob1 = new b(uoa, tp);
       }
       this.s = uob1;
       this.q.setAdapter(uob1);
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
