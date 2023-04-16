package com.kwai.feature.api.danmaku.c;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import mrd.a;
import brd.t;
import im5.d;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import im5.f;
import im5.b;
import java.lang.Runnable;
import t45.c;
import com.kwai.feature.api.danmaku.a;
import crd.b;
import ok.h;
import lnc.b9;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.View;
import de5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import pm5.c;
import p5a.e;
import pm5.a$a;
import com.kwai.feature.api.danmaku.params.DanmakuKitType;
import com.kwai.framework.player.core.b;
import android.view.ViewGroup;
import pm5.a;
import tkd.b;
import tkd.d;
import im5.e;
import mm5.a;
import brd.y;

public class c	// class@000e74
{
    public boolean a;
    public BaseFragment b;
    public a c;
    public AtomicBoolean d;
    public QPhoto e;
    public View f;
    public c g;
    public b h;
    public d i;
    public final c j;
    public final t k;

    public void c(){
       super();
       this.d = new AtomicBoolean();
       a uoa = a.g();
       this.j = uoa;
       this.k = uoa.hide();
    }
    public void c(d p0){
       super();
       this.d = new AtomicBoolean();
       a uoa = a.g();
       this.j = uoa;
       this.k = uoa.hide();
       this.i = p0;
    }
    public d a(){
       return this.i;
    }
    public t b(boolean p0,boolean p1,Context p2){
       StringBuilder obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, this, c.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "createKitIfNull: "+p0+", mDanmakuKit is null: ";
       boolean b = (this.i == null)? true: false;
       this.e("getDanmakuKitObservable", obj+b);
       if (!p0 || (this.i == null && (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p1), p2, this, uoc, "4")))) {
          if (f.b()) {
             this.f("createDanmakuKit", "弹幕插件已经安装过了。run asyncCreateDanmakuKit\(\)");
             if (!PatchProxy.applyVoid(null, this, uoc, "5")) {
                c.a(new b(this));
             }
          }else {
             this.h = b9.c(this.h, new a(this, p1, p2));
          }
       }
       return this.k;
    }
    public void c(BaseFragment p0,View p1,a p2,QPhoto p3,c p4){
       this.a = true;
       this.b = p0;
       this.c = p2;
       this.f = p1;
       this.e = p3;
       this.g = p4;
    }
    public synchronized final void d(){
       StringBuilder str1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "6")) {
          return;
       }
       if (!this.d.get() && this.b != null) {
          c tc = this.c;
          if (tc != null && (tc.getPlayer() != null && (this.e != null && this.f != null))) {
             a$a uoa = new a$a().f(DanmakuKitType.PORTRAIT).c(this.b).d(this.e);
             e player = this.c.getPlayer();
             StringBuilder str = (this.c.c() == null)? "": this.c.c();
             a uoa1 = uoa.e(player, str).b(this.f).a();
             c tg = this.g;
             if (tg == null) {
                tg = new c();
             }
             d uod = d.a(0x67df4ca).Zf(uoa1, tg);
             str1 = "internalCreateDanmakuKit";
             str = "Kit is null: ";
             boolean b = (uod == null)? true: false;
             this.e(str1, str+b);
             if (uod != null) {
                this.d.set(true);
             }
             this.h(uod);
          label_00e4 :
             return;
          }
       }
    label_00a7 :
       str1 = "mContainer: "+this.f+", playModule: "+this.c+", mPlayer: ";
       c tc1 = this.c;
       if (tc1 != null) {
          objArray = tc1.getPlayer();
       }
       this.e("internalCreateDanmakuKit", str1+objArray+", mFragment: "+this.b);
       goto label_00e4 ;
    }
    public final void e(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.a.h("BarrageKitWrapper", p1, this.e, null, p0, objArray);
       return;
    }
    public final void f(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.a.h("BarrageKitWrapper", p1, this.e, "Plugin", p0, objArray);
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, c.class, "7")) {
          return;
       }
       b9.a(this.h);
       c ti = this.i;
       if (ti != null) {
          ti.destroy();
       }
       return;
    }
    public void h(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       if (p0 != null) {
          this.i = p0;
          this.j.onNext(p0);
       }
       return;
    }
    public void i(a p0,QPhoto p1,c p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "3")) {
          return;
       }
       this.c = p0;
       this.e = p1;
       if (this.i != null) {
          c uoc = null;
          c tg = this.g;
          if (tg != null && (p2 != null && tg.j(p2))) {
             uoc = p2;
          }
       label_0025 :
          this.i.i(p1, p0, DanmakuKitType.PORTRAIT, uoc);
       }
       this.g = p2;
       return;
    }
}
