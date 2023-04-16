package com.yxcorp.gifshow.fragment.user.h;
import com.yxcorp.gifshow.fragment.user.l$b;
import com.yxcorp.gifshow.fragment.user.g;
import com.yxcorp.gifshow.album.LocalAlbumParams;
import java.util.HashSet;
import k8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import q87.c;
import m8c.e;
import com.yxcorp.gifshow.fragment.user.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import l8c.b;
import java.lang.Integer;
import java.util.Set;
import com.yxcorp.gifshow.edit.draft.model.DraftEditException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import crd.a;
import java.util.List;
import g9c.a;
import java.util.Collection;
import ekd.q;
import java.lang.Boolean;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import java.util.Iterator;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewGroup;
import com.yxcorp.gifshow.fragment.user.h$a;
import android.view.View;
import android.content.Context;
import i2b.a;
import ika.n;
import com.yxcorp.gifshow.widget.banner.FixedHeightAspectRatioRelativeLayout;

public class h extends g implements l$b	// class@001287
{
    public boolean o;
    public b p;
    public Set q;
    public LocalAlbumParams r;
    public int s;
    public View t;
    public boolean u;
    public int v;

    public void h(boolean p0,int p1,LocalAlbumParams p2,int p3){
       super(p1);
       this.o = false;
       this.q = new HashSet();
       this.v = 0;
       Object[] objArray = new Object[false];
       a.D().w("LocalAlbumGridAdapter", "init pageCount: "+p1, objArray);
       this.r = p2;
       this.h = true;
       this.u = p0;
       this.v = p3;
    }
    public void A2(e p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "14")) {
          return;
       }
       h tp = this.p;
       if (tp != null) {
          tp.A2(p0, p1);
       }
       return;
    }
    public void B2(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "15")) {
          return;
       }
       h tp = this.p;
       if (tp != null) {
          tp.G7(p0);
       }
       return;
    }
    public void C2(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "16")) {
          return;
       }
       h tp = this.p;
       if (tp != null) {
          tp.mf(p0);
       }
       return;
    }
    public void D2(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "19")) {
          return;
       }
       h tp = this.p;
       if (tp != null) {
          tp.m6(p0);
       }
       return;
    }
    public void E2(int p0,e p1,l p2){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, h.class, "12")) {
          return;
       }
       boolean b = true;
       if (p1 == null || !p1.h()) {
          StringBuilder str = "onItemClick data error, project ";
          String str1 = (p1 == null)? "null": "exist "+p1.h();
          ExceptionHandler.handleCaughtException(new DraftEditException(str+str1+", total "+this.getItemCount()));
          this.b1(b);
          return;
       }else if(this.o != null){
          if (!PatchProxy.applyVoidTwoRefs(p1, p2, this, oh, "9")) {
             if (this.q.contains(p1)) {
                this.q.remove(p1);
                b = false;
             }else {
                this.q.add(p1);
             }
             p2.d(this.o, b);
             h tp = this.p;
             if (tp != null) {
                tp.X4(p1, b);
             }
          }
       }else {
          h tp1 = this.p;
          if (tp1 != null) {
             tp1.X2(p1, p0);
          }
       }
       return;
    }
    public void F2(e p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "20")) {
          return;
       }
       h tp = this.p;
       if (tp != null) {
          tp.ic(p0, p1);
       }
       return;
    }
    public void G2(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "17")) {
          return;
       }
       h tp = this.p;
       if (tp != null) {
          tp.na(p0);
       }
       return;
    }
    public void H2(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "18")) {
          return;
       }
       h tp = this.p;
       if (tp != null) {
          tp.C6(p0);
       }
       return;
    }
    public void I2(e p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "21")) {
          return;
       }
       h tp = this.p;
       if (tp != null) {
          tp.F7(p0, p1);
       }
       return;
    }
    public void X1(e p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "13")) {
          return;
       }
       h tp = this.p;
       if (tp != null) {
          tp.X1(p0, p1);
       }
       return;
    }
    public void Y0(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "3")) {
          return;
       }
       super.Y0(p0);
       Object[] objArray = new Object[0];
       a.D().A("LocalAlbumGridAdapter", "onLoadFailed: "+p0.getMessage(), objArray);
       h tp = this.p;
       if (tp != null) {
          tp.b8((q.f(this.Q0()) ^ 0x01));
       }
       return;
    }
    public void Z0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       super.Z0(p0);
       Object[] objArray = new Object[0];
       a.D().w("LocalAlbumGridAdapter", "onLoadFinished data size: "+p0.size(), objArray);
       h tp = this.p;
       if (tp != null) {
          tp.b8((q.f(this.Q0()) ^ 0x01));
       }
       return;
    }
    public void a1(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "1")) {
          return;
       }
       this.q.clear();
       long l = DraftFileManager.E().O().lastModified();
       Object[] objArray = new Object[0];
       a.D().w("LocalAlbumGridAdapter", "onReload reset: "+p0+"modify time: "+l, objArray);
       h tp = this.p;
       if (tp != null) {
          tp.Z4(p0, l);
       }
       return;
    }
    public void e1(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "7")) {
          return;
       }
       if (this.q.remove(p0)) {
          h tp = this.p;
          if (tp != null) {
             tp.X4(p0, false);
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, g.class, "6")) {
          this.l.remove(p0.getIdentifier());
          this.i = this.i - 1;
          this.T0(p0);
       }
       return;
    }
    public int f0(int p0){
       if (this.t != null && !p0) {
          return 1;
       }
       return 0;
    }
    public void f1(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "10")) {
          return;
       }
       if (this.o != p0) {
          this.o = p0;
          if (!p0) {
             Iterator iterator = this.q.iterator();
             while (iterator.hasNext()) {
                e uoe = iterator.next();
                h tp = this.p;
                if (tp != null) {
                   tp.X4(uoe, false);
                }
             }
             this.q.clear();
          }
          this.k0();
       }
       return;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, h.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.t != null) {
          return (this.e.size() + 1);
       }
       return super.getItemCount();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oh, "5")) {
          return;
       }
       if (this.f0(p1) == 1) {
          return;
       }
       if (this.t != null) {
          p1--;
       }
       int i = p1;
       l ol = p0;
       Object obj = this.N0(i);
       if (obj != null) {
          ol.a(obj, this.o, this.q.contains(obj), this, i);
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       n on;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oh, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == 1) {
          return new h$a(this.t);
       }else {
          boolean b = false;
          if (this.r.isNeedShowReShootButton()) {
             on = new n(this.u, a.e(p0.getContext(), 0x7f0d08fa, p0, b, this.v));
          }else {
             FixedHeightAspectRatioRelativeLayout uFixedHeight = a.e(p0.getContext(), R.layout.arg_RES_7f0d08f9, p0, b, this.v);
             on = new l(this.u, uFixedHeight);
             if (this.r.isNeedWidthHeight34()) {
                uFixedHeight.setAspectRadio(0x3f400000);
             }
          }
          on.i = this.s;
          on.j = this.r;
          return on;
       }
    }
}
