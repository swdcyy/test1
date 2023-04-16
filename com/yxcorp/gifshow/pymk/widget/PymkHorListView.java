package com.yxcorp.gifshow.pymk.widget.PymkHorListView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import com.yxcorp.gifshow.pymk.log.d;
import android.util.AttributeSet;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import i7c.c;
import com.kwai.robust.PatchProxyResult;
import qvb.q;
import o7c.a;
import qvb.a;
import ekd.e0;
import com.yxcorp.gifshow.pymk.widget.PymkHorListView$a;
import java.lang.NullPointerException;
import o7c.b;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.pymk.f;
import a7c.h$a;
import a7c.h;
import qvb.n0;
import f9c.b;
import java.lang.Boolean;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$i;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import e7c.b;

public class PymkHorListView extends RecyclerView	// class@0016dd
{
    public RecyclerView$n b;
    public BaseFragment c;
    public f d;
    public q e;
    public h f;
    public b g;
    public b h;
    public final d i;
    public RecyclerView$i j;
    public boolean k;
    public static final String l;

    static {
       PymkHorListView.l = "PymkHorListView";
    }
    public void PymkHorListView(Context p0){
       super(p0);
       this.i = new d();
       this.k = true;
       this.x();
    }
    public void PymkHorListView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.i = new d();
       this.k = true;
       this.x();
    }
    public void PymkHorListView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.i = new d();
       this.k = true;
       this.x();
    }
    public void A(BaseFragment p0,int p1,String p2,List p3){
       if (PatchProxy.isSupport(PymkHorListView.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, PymkHorListView.class, "5")) {
          return;
       }
       this.c = p0;
       PymkHorListView td = this.d;
       if (td == null) {
          this.d = new c(p1, p2, p3);
          a uoa = PatchProxy.apply(null, this, PymkHorListView.class, "7");
          if (uoa != PatchProxyResult.class) {
          }else {
             uoa = new a(this);
          }
          this.e = uoa;
       }else if(td instanceof c){
          td.t2(p1, p2, p3);
       }
       this.d.h(this.e);
       if (this.h == null) {
          if (!e0.a) {
             this.h = new PymkHorListView$a(this);
          }else {
             throw new NullPointerException("Are you called method setPymkHorListener\(\) ?");
          }
       }
       td = this.h;
       td.f = this;
       if (this.f == null) {
          this.f = td.g(this.d, this.c.m()).b();
       }
       this.d.a();
       return;
    }
    public void setPymkHorListener(b p0){
       this.h = p0;
    }
    public final void x(){
       if (PatchProxy.applyVoid(null, this, PymkHorListView.class, "1")) {
          return;
       }
       new b().b(this);
       return;
    }
    public boolean y(int p0){
       if (PatchProxy.isSupport(PymkHorListView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PymkHorListView.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return super.canScrollHorizontally(p0);
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, PymkHorListView.class, "6")) {
          return;
       }
       PymkHorListView td = this.d;
       if (td != null) {
          td.f(this.e);
          this.d.u1();
       }
       td = this.j;
       if (td != null) {
          PymkHorListView tg = this.g;
          if (tg != null) {
             tg.I0(td);
          }
          this.j = null;
       }
       td = this.g;
       if (td != null) {
          td.onDestroy();
       }
       return;
    }
}
