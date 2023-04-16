package com.yxcorp.gifshow.camera.record.album.slideup.list.h;
import vb9.p;
import com.yxcorp.gifshow.camera.record.base.d;
import lnc.a1;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.album.slideup.list.h$a;
import java.util.HashSet;
import com.yxcorp.gifshow.model.config.ShowAlbum;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.camera.record.album.slideup.list.i;
import com.yxcorp.gifshow.camera.record.album.slideup.list.c;
import android.view.View;
import java.lang.Integer;
import android.view.ViewGroup;
import g9c.a;
import java.util.Set;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Float;
import android.app.Activity;
import gh9.d;
import gh9.g;
import java.util.Objects;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import android.graphics.Rect;
import com.yxcorp.gifshow.models.QMedia;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import oc9.w;
import com.yxcorp.gifshow.camera.bubble.c;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import com.yxcorp.gifshow.camerasdk.q;
import crd.b;
import brd.t;
import wb9.l;
import wb9.f;
import wb9.g;
import erd.g;
import com.yxcorp.gifshow.camera.record.album.slideup.list.e;
import java.util.Collection;
import ekd.q$b;
import ekd.q;
import com.yxcorp.gifshow.camera.record.widget.BottomSheetBehavior;
import com.yxcorp.gifshow.camera.record.album.slideup.AlbumSlideUpBehavior;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.camera.record.album.slideup.list.AlbumToolController$1;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import k17.b;
import androidx.recyclerview.widget.RecyclerView$n;
import wb9.j;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.camera.record.album.slideup.list.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.camera.record.album.slideup.list.d;
import com.yxcorp.gifshow.camera.record.album.slideup.list.g;
import java.lang.Runnable;
import android.content.Intent;
import vb9.a;
import wb9.e;

public class h extends d implements p	// class@001cdc
{
    public b A;
    public boolean B;
    public long C;
    public a D;
    public PostBubbleManager$c E;
    public final String n;
    public l o;
    public AlbumSlideUpBehavior p;
    public View q;
    public RecyclerView r;
    public LinearLayoutManager s;
    public a t;
    public List u;
    public Set v;
    public boolean w;
    public boolean x;
    public h$a y;
    public boolean z;
    public static final int F;

    static {
       h.F = a1.d(0x7f07031b);
    }
    public void h(CameraPageType p0,b p1,h$a p2){
       super(p0, p1);
       this.n = "AlbumToolController";
       this.v = new HashSet();
       this.y = p2;
    }
    public void S(ShowAlbum p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("AlbumToolController", "step1 onResponse end, total cost:"+a1.o(this.C)+" , showAlbum:"+p0, objArray);
       this.w = p0.mAutoShowAlbumTool;
       this.x = p0.mEnableAlbumShowNewPhoto;
       this.o = (p0.mUseAlbumLabelFilter != null)? new i(): new c();
       this.h2();
       return;
    }
    public void c(View p0,int p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oh, "13")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("AlbumToolController", "onStateChanged...newState:"+p1, objArray);
       h tr = this.r;
       if (tr != null && this.q != null) {
          boolean b = (p1 == 3)? true: false;
          tr.setEnabled(b);
          tr = this.q;
          if (p1 == 4) {
             i = 8;
          }
          tr.setVisibility(i);
          if (p1 != 4) {
             tr = this.t;
             if (tr != null && tr.R0()) {
                this.i2();
             }
          }
          if (p1 == 4) {
             this.f2();
             Object[] objArray1 = null;
             if (!PatchProxy.applyVoid(objArray1, this, oh, "18") && this.v.size()) {
                i3 oi3 = i3.f();
                oi3.c("content_num", Integer.valueOf(this.v.size()));
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "PHOTO_ALBUM_CONTENT";
                uElementPack.params = oi3.e();
                u1.u0(3, uElementPack, objArray1);
             }
             this.v.clear();
          }else if(p1 == 3){
             this.f2();
          }
       }
    label_00a5 :
       return;
    }
    public void f(View p0,float p1){
       View view;
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, oh, "14")) {
          return;
       }
       this.q.setAlpha(p1);
       float f = 0x3f800000 - p1;
       d tl = this.l;
       if (tl != null) {
          view = tl.findViewById(R.id.camera_time_tab_scroll_container);
          if (view != null && !view.getVisibility()) {
             view.setAlpha(f);
          }
       }
       view = this.e.findViewById(R.id.camera_scroll_snapshot_tab_container);
       if (view != null) {
          if (this.d.d(d.c).a != null) {
             if (f > 0) {
                Objects.requireNonNull(g.c);
                if (this.d.d(g.b).a != null) {
                   view.setVisibility(0);
                }
             }else {
                view.setVisibility(8);
             }
          }
          view.setAlpha(f);
       }
       return;
    }
    public void f2(){
       if (PatchProxy.applyVoid(null, this, h.class, "17")) {
          return;
       }
       if (this.u == null) {
          return;
       }
       int i = this.s.c();
       int i1 = 0;
       while (i1 <= i) {
          View view = this.s.findViewByPosition(i1);
          if (view != null && i1 < this.u.size()) {
             boolean globalVisibl = view.getGlobalVisibleRect(new Rect());
             QMedia qMedia = this.u.get(i1);
             if (qMedia != null && (!this.v.contains(qMedia.path) && globalVisibl)) {
                this.v.add(qMedia.path);
             }
          }
       label_0050 :
          i1 = i1 + 1;
       }
       return;
    }
    public final boolean g2(){
       h obj = PatchProxy.apply(null, this, h.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       boolean b = (obj != null && (float)obj.size() - 0x40a00000 >= 0)? true: false;
       return b;
    }
    public final void h2(){
       Object[] objArray;
       Object[] objArray1;
       if (PatchProxy.applyVoid(null, this, h.class, "5")) {
          return;
       }
       c uoc = this.d.b().V7();
       int i = 0;
       String str = "AlbumToolController";
       if (!PermissionUtils.a(this.e, "android.permission.WRITE_EXTERNAL_STORAGE")) {
          objArray = new Object[i];
          a.D().A(str, "loadData, warning, has no album permission", objArray);
          if (uoc != null) {
             uoc.u(RecordBubbleItem.AUTO_SHOW_ALBUM_TOOL);
          }
          return;
       }else if(this.o == null){
          objArray1 = new Object[i];
          a.D().A(str, "loadData,  warning, has no album data source", objArray1);
          return;
       }else if(this.z != null){
          objArray1 = new Object[i];
          a.D().w(str, "loadData already completed", objArray1);
          return;
       }else {
          d th = this.h;
          if (th == null || !th.M()) {
             objArray = new Object[i];
             a.D().w(str, "loadData, camera is not opened!", objArray);
             if (uoc != null) {
                uoc.u(RecordBubbleItem.AUTO_SHOW_ALBUM_TOOL);
             }
             return;
          }else {
             h tA = this.A;
             if (tA != null && !tA.isDisposed()) {
                objArray1 = new Object[i];
                a.D().w(str, "loadData is running.", objArray1);
                return;
             }else {
                b uob = this.o.a().subscribe(new f(this, a1.k(), uoc), new g(this, uoc));
                this.A = uob;
                this.Y1(uob);
                return;
             }
          }
       }
    }
    public final void i2(){
       if (PatchProxy.applyVoid(null, this, h.class, "9")) {
          return;
       }
       if (this.p != null && (this.r != null && this.t != null)) {
          h tu = this.u;
          if (tu != null) {
             q.c(tu, e.a);
             int i = 0;
             if ((float)this.u.size() - 0x40a00000 < 0) {
                Object[] objArray = new Object[i];
                a.D().w("AlbumToolController", "mMediaList.size\(\) < MEDIA_LIST_MIN_LIMIT, clear list", objArray);
                this.p.setState(4);
                this.p.m(i);
                this.t.M0();
                this.t.k0();
                this.q.setVisibility(8);
             }else if(this.u.size() != this.t.getItemCount()){
                Object[] objArray1 = new Object[i];
                a.D().w("AlbumToolController", "refresh list, size:"+this.u.size(), objArray1);
                this.p.m(true);
                this.t.W0(this.u);
                this.t.k0();
             }
          }
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       super.onResume();
       Object[] objArray = new Object[0];
       a.D().w("AlbumToolController", "onResume", objArray);
       this.h2();
       if (this.g2()) {
          h tt = this.t;
          if (tt != null && !tt.R0()) {
             this.i2();
          }
       }
       return;
    }
    public void u(View p0,AlbumSlideUpBehavior p1){
       h oh = h.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oh, "6")) {
          return;
       }
       if (this.o == null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("AlbumToolController", "initView", objArray);
       this.q = p0.findViewById(0x7f0a01e2);
       this.r = p0.findViewById(0x7f0a01d1);
       this.p = p1;
       if (!PatchProxy.applyVoid(null, this, oh, "7")) {
          Object[] objArray2 = new Object[0];
          a.D().w("AlbumToolController", "initAlbumList", objArray2);
          AlbumToolController$1 u1 = new AlbumToolController$1(this, this.e, 0, 0);
          this.s = u1;
          this.r.setLayoutManager(u1);
          this.r.addItemDecoration(new b(0, h.F, h.F));
          this.r.setAlpha(0x3f400000);
          this.r.clearOnScrollListeners();
          this.r.addOnScrollListener(new j(this));
          a uoa = new a(this.e);
          this.t = uoa;
          uoa.i = new d(this);
          this.r.setAdapter(uoa);
          this.q.setAlpha(0);
          this.q.setVisibility(8);
          this.p.m(this.g2());
          this.b2(new g(this));
       }
       Object[] objArray1 = new Object[0];
       a.D().w("AlbumToolController", "step3 initView end, total cost:"+a1.o(this.C), objArray1);
       return;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("AlbumToolController", "onCameraOpened", objArray);
       this.h2();
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       super.w1(p0);
       this.C = a1.k();
       this.d.l(a.class, new e(this));
       if (this.d.b().V7() != null) {
          this.d.b().V7().s(RecordBubbleItem.AUTO_SHOW_ALBUM_TOOL);
       }
       return;
    }
}
