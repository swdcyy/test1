package com.yxcorp.gifshow.aggregate.relation.b;
import y8c.g;
import android.content.Context;
import qa9.q;
import java.lang.Object;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import oxa.d;
import y8c.f;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.utility.n;
import f69.x;
import f69.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ml8.c;
import java.util.List;
import java.lang.Boolean;
import brd.t;
import d69.q;
import erd.g;
import crd.b;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import lnc.b9;

public class b extends g	// class@001934
{
    public final ArrayList w;
    public final q x;
    public b y;

    public void b(Context p0,q p1,Object[] p2){
       super();
       this.w = Lists.e(p2);
       this.x = p1;
       d.d().a(p0, R.layout.arg_RES_7f0d12f4, 8);
       this.p1(true);
    }
    public final ArrayList a1(int p0,f p1){
       return this.w;
    }
    public f h1(ViewGroup p0,int p1){
       View obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = d.d().f(p0.getContext(), R.layout.arg_RES_7f0d12f4);
       obj.setLayoutParams(new ViewGroup$LayoutParams(n.z(p0.getContext()), -2));
       x ox = new x();
       ox.U7(new s(this.x));
       return new f(obj, ox);
    }
    public void j1(boolean p0,boolean p1,List p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, this, b.class, "3")) {
          return;
       }
       if (p0) {
          b tx = this.x;
          if (tx != null && !tx.d()) {
             this.y = this.x.e().subscribe(new q(this, p2));
          label_0041 :
             return;
          }
       }
       this.W0(p2);
       this.k0();
       goto label_0041 ;
    }
    public void z0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       super.z0(p0);
       d.d().b();
       b9.a(this.y);
       return;
    }
}
