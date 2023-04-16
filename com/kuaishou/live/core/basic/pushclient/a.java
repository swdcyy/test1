package com.kuaishou.live.core.basic.pushclient.a;
import com.kuaishou.live.common.core.component.stream.LiveAnchorStreamService$a;
import i91.a;
import i91.i;
import android.os.Handler;
import android.os.Looper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import u00.a;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.stream.LiveAnchorStreamService;
import u71.e;
import com.kuaishou.live.common.core.basic.baseinfo.QLivePushConfig;
import wx1.c;
import lp3.e;
import hf3.a;
import java.lang.Boolean;
import java.lang.StringBuilder;
import z12.e;
import tr.d;
import s12.b;
import jw4.a;
import jw4.e;
import lp3.c;
import w51.a;
import q00.b;
import com.yxcorp.gifshow.util.resource.Category;
import boc.b;
import com.yxcorp.gifshow.util.resource.p;
import com.yxcorp.gifshow.util.resource.n;
import k91.e;
import k91.c;
import ekd.k1;
import com.kwai.plugin.dva.work.c$c;
import com.kwai.plugin.dva.work.c;
import yx1.a;
import java.lang.Float;
import com.kuaishou.live.common.core.basic.arya.SoundEffectItem;
import o56.c;
import o56.a;
import android.app.Application;
import com.kuaishou.live.common.core.component.stream.LiveAnchorStreamService$LivePushDestinationType;
import java.util.Objects;
import tj3.r;
import com.kwai.video.waynelive.debug.Logger;
import s12.a;
import java.lang.Runnable;
import java.lang.Throwable;

public class a extends a implements LiveAnchorStreamService$a	// class@0008d0
{
    public QLivePushConfig a;
    public e b;
    public e c;
    public b d;
    public d e;
    public final boolean f;
    public boolean g;
    public SoundEffectItem h;
    public a i;
    public final Handler j;
    public c k;
    public a l;
    public boolean m;
    public LiveAnchorStreamService n;
    public String o;

    public void a(){
       super();
       this.f = false;
       this.g = false;
       this.h = i.b;
       this.j = new Handler(Looper.getMainLooper());
    }
    public int A(){
       int i;
       a obj = PatchProxy.apply(null, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.i;
       obj = (obj != null)? obj.k: 0;
       return obj;
    }
    public String B(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       if (obj != null) {
          objArray = obj.e;
       }
       return objArray;
    }
    public long C(){
       a obj = PatchProxy.apply(null, this, a.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.i;
       long l = (obj != null)? (long)obj.h: 0;
       return l;
    }
    public void D(LiveFlvStream$LiveFlvStreamMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "25")) {
          return;
       }
       byte[] uobyteArray = MessageNano.toByteArray(p0);
       b.c0(LiveLogTag.LIVE_PUSH_CLIENT, "insertData flv message", "length", Integer.valueOf(uobyteArray.length));
       this.n.t0(uobyteArray);
       return;
    }
    public boolean E(){
       return this.g;
    }
    public String F(){
       return this.o;
    }
    public e G(){
       return this.b;
    }
    public e H(){
       return this.c;
    }
    public void I(String p0,QLivePushConfig p1,c p2,e p3,a p4,boolean p5){
       b uob;
       int i = 0;
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, a.class, "1")) {
             return;
          }
       }
       String[] stringArray = new String[i];
       e.c("AryaLivePushClient", "init useTexturer "+p5, stringArray);
       this.o = p0;
       this.a = p1;
       this.k = p2;
       this.l = p4;
       if (PatchProxy.isSupport(a.class)) {
          uob = PatchProxy.applyOneRefs(Boolean.valueOf(p5), this, a.class, "2");
          if (uob != PatchProxyResult.class) {
          label_0066 :
             this.e = uob;
             a uoa = e.a(this.o, uob);
             this.n = p3.a(LiveAnchorStreamService.class);
             if (a.A()) {
                return;
             }else {
                this.d = uoa.e();
                this.O();
                uoa = this.d;
                if (uoa != null) {
                   uoa.p();
                   uoa = this.d;
                   String str = PatchProxy.apply(null, this, a.class, "12");
                   if (str != PatchProxyResult.class) {
                   }else {
                      Category mAGIC_YCNN_A = Category.MAGIC_YCNN_ARYA_DRL_CC;
                      if (!p.h(mAGIC_YCNN_A)) {
                         n.l(mAGIC_YCNN_A);
                         b.Z(LiveLogTag.LIVE_PUSH_CLIENT, "downloadYcnnSceneIfNeeded: download ycnn arya drl cc");
                         str = "";
                      }else {
                         str = mAGIC_YCNN_A.getResourceDir();
                         b.c0(LiveLogTag.LIVE_PUSH_CLIENT, "get ktp model path", "ktpModelPath", str);
                      }
                   }
                   uoa.o(str);
                }
                this.n.tf(this);
                return;
             }
          }
       }
       uob = new b(this, p5);
       goto label_0066 ;
    }
    public void J(){
       if (PatchProxy.applyVoid(null, this, a.class, "22")) {
          return;
       }
       this.N(true, true);
       this.m = true;
       return;
    }
    public void K(){
       c a;
       if (PatchProxy.applyVoid(null, this, a.class, "24")) {
          return;
       }
       this.j.removeCallbacksAndMessages(null);
       this.n.He(this);
       a td = this.d;
       if (td != null) {
          td.release();
          this.d = null;
       }
       if (!PatchProxy.applyVoid(null, null, e.class, "6")) {
          a = e.a;
          if (a != null && !PatchProxy.applyVoid(null, a, c.class, "9")) {
             k1.n(a.a);
             c b = a.b;
             if (b != null) {
                b.n(a.a);
                a.b = null;
             }
          }
          e.c = null;
          e.a = null;
          e.b = null;
       }
       return;
    }
    public void L(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.b = p0;
       this.n.x(p0.getWidth(), p0.getHeight());
       return;
    }
    public void M(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.c = p0;
       this.n.n(p0.getWidth(), p0.getHeight());
       return;
    }
    public final void N(boolean p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "28")) {
          return;
       }
       uoa = this.d;
       if (uoa != null) {
          uoa.Z(p0, p1);
       }
       return;
    }
    public void O(){
       if (PatchProxy.applyVoid(null, this, a.class, "23")) {
          return;
       }
       this.N(false, true);
       this.m = false;
       return;
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, a.class, "21")) {
          return;
       }
       a td = this.d;
       if (td != null) {
          this.i = td.J();
       }
       if (this.i == null) {
          this.i = new a();
       }
       return;
    }
    public void a(int p0,int p1,int p2,boolean p3){
       a.j(this, p0, p1, p2, p3);
    }
    public void b(String p0,String p1,int p2,boolean p3){
       a.e(this, p0, p1, p2, p3);
    }
    public void c(String p0,int p1,int p2){
       a.i(this, p0, p1, p2);
    }
    public void d(String[] p0){
       a.a(this, p0);
    }
    public void e(float p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "11")) {
          return;
       }
       uoa = this.d;
       if (uoa != null) {
          uoa.L(p0);
       }
       return;
    }
    public void f(long p0){
       a.g(this, p0);
    }
    public void g(){
       a.c(this);
    }
    public void h(SoundEffectItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "10")) {
          return;
       }
       if (p0 == null) {
          p0 = i.b;
       }
       a th = this.h;
       if (p0 != th) {
          this.k.J(th.mSoundEffectType, a.a().a().getString(this.h.mName), this.g);
       }
       this.h = p0;
       th = this.d;
       if (th != null) {
          th.F(p0.mReverbLevel);
       }
       return;
    }
    public boolean i(boolean p0){
       a obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.d;
       if (obj == null) {
          return false;
       }else {
          return obj.G();
       }
    }
    public void j(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "6")) {
          return;
       }
       e.d(this.d, p0);
       return;
    }
    public void k(boolean p0){
       this.g = p0;
    }
    public void l(LiveAnchorStreamService$LivePushDestinationType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "29")) {
          return;
       }
       if (p0 == LiveAnchorStreamService$LivePushDestinationType.CDN) {
          a tk = this.k;
          Objects.requireNonNull(tk);
          if (!PatchProxy.applyVoid(null, tk, r.class, "4")) {
             tk.a.i("addRetryCount");
             tk.A((tk.l() + 1));
          }
       }else if(p0 == LiveAnchorStreamService$LivePushDestinationType.ORIGIN){
          this.k.m0(3);
       }
       return;
    }
    public void m(){
       a.b(this);
    }
    public void n(float p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "9")) {
          return;
       }
       uoa = this.d;
       if (uoa != null) {
          uoa.K(p0);
          this.d.u(p0);
          String[] stringArray = new String[]{"volume:"+p0};
          e.c("AryaRemoteBgmVolume", "setPushBgmVolume", stringArray);
       }
       return;
    }
    public void o(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "5")) {
          return;
       }
       uoa = this.d;
       if (uoa != null) {
          uoa.a(p0);
       }
       return;
    }
    public void p(boolean p0){
       a td;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "7")) {
          return;
       }
       if (!p0) {
          td = this.d;
          if (td != null) {
             td.P();
          }
          return;
       }else {
          td = this.d;
          uoa = 0;
          if (td != null && !td.y()) {
             uoa = 1;
          }
          if (!uoa) {
             k1.r(new a(this), 300);
          }
          return;
       }
    }
    public void q(Throwable p0,String p1){
       a.f(this, p0, p1);
    }
    public SoundEffectItem r(){
       return this.h;
    }
    public void s(boolean p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, a.class, "27")) {
          return;
       }
       this.N(this.m, this.m);
       return;
    }
    public int t(){
       a obj = PatchProxy.apply(null, this, a.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.d;
       if (obj != null && obj.J() != null) {
          return this.d.J().m;
       }
       return -1;
    }
    public b u(){
       return this.d;
    }
    public d v(){
       return this.e;
    }
    public long w(){
       a obj = PatchProxy.apply(null, this, a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.i;
       long l = (obj != null)? (long)obj.j: 0;
       return l;
    }
    public long x(){
       Object obj = PatchProxy.apply(null, this, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.i == null) {
          this.P();
       }
       return (long)this.i.i;
    }
    public String y(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       if (obj != null) {
          objArray = obj.c;
       }
       return objArray;
    }
    public String z(){
       String str;
       a obj = PatchProxy.apply(null, this, a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       obj = (obj != null)? obj.a: "";
       return obj;
    }
}
