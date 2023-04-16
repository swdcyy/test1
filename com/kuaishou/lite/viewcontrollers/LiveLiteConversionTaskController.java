package com.kuaishou.lite.viewcontrollers.LiveLiteConversionTaskController;
import zl0.q;
import zl0.s0;
import jl0.a;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.lite.viewcontrollers.LiveLiteConversionTaskController$a;
import nsd.u;
import e93.a;
import e93.c;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;
import com.kuaishou.live.lite.sidebar.e;
import v51.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.lite.viewcontrollers.LiveLiteConversionTaskController$mLiveBaseTaskController$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.lite.viewcontrollers.LiveLiteConversionTaskController$mShrinkChangedListener$2;
import com.kuaishou.lite.viewcontrollers.LiveLiteConversionTaskController$b;
import androidx.fragment.app.DialogFragment;
import zl0.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.live.ad.social.i;
import com.kuaishou.live.ad.social.LiveAdConversionTaskDetail;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import android.app.Activity;
import qrd.l1;
import com.kuaishou.live.ad.social.r;
import z1.a;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$SCLiveCommonStateSignal;
import kl0.b;
import lf3.g;
import kotlin.collections.ArraysKt___ArraysKt;
import java.lang.Boolean;
import lnc.y0;
import com.kuaishou.lite.viewcontrollers.LiveLiteConversionTaskController$requestSocialDataIfNeed$1$1;
import kl0.d;
import msd.l;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionTask;
import km9.a;
import com.kwai.robust.PatchProxyResult;
import jl0.c;
import com.kuaishou.live.ad.social.y;
import com.kuaishou.live.lite.LiveLiteParam;
import da6.c;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarType;
import android.content.Context;
import android.view.View;
import android.view.View$OnClickListener;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import com.kuaishou.live.ad.social.LiveAdConversionTaskDetail$ControlInfo;
import androidx.fragment.app.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import xp5.g;

public final class LiveLiteConversionTaskController extends ViewController implements q, s0, a	// class@00094c
{
    public boolean j;
    public c k;
    public DialogFragment l;
    public i m;
    public final p n;
    public final p o;
    public final View$OnClickListener p;
    public a q;
    public c r;
    public LiveLiteBottomBarService s;
    public e t;
    public a u;
    public static final LiveLiteConversionTaskController$a v;

    static {
       LiveLiteConversionTaskController.v = new LiveLiteConversionTaskController$a(null);
    }
    public void LiveLiteConversionTaskController(a p0,c p1,LiveLiteBottomBarService p2,e p3,a p4){
       a.p(p0, "mAudienceInfoService");
       a.p(p1, "mLiveLiteFragmentService");
       a.p(p2, "mLiteBottomBarService");
       a.p(p3, "mLiteSideBarService");
       a.p(p4, "mLiveLiteLongConnectManager");
       super();
       this.q = p0;
       this.r = p1;
       this.s = p2;
       this.t = p3;
       this.u = p4;
       this.n = s.c(new LiveLiteConversionTaskController$mLiveBaseTaskController$2(this));
       this.o = s.c(new LiveLiteConversionTaskController$mShrinkChangedListener$2(this));
       this.p = new LiveLiteConversionTaskController$b(this);
    }
    public void A4(DialogFragment p0){
       this.l = p0;
    }
    public void C6(a1 p0,int p1){
       LiveLiteConversionTaskController liveLiteConv = LiveLiteConversionTaskController.class;
       if (PatchProxy.isSupport(liveLiteConv) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, liveLiteConv, "15")) {
          return;
       }
       a.p(p0, "currentTask");
       liveLiteConv = this.m;
       if (liveLiteConv != null) {
          liveLiteConv.l(p0, p1);
       }
       return;
    }
    public void D(){
       this.j = false;
    }
    public void D4(a1 p0,LiveAdConversionTaskDetail p1,int p2){
       if (PatchProxy.isSupport(LiveLiteConversionTaskController.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LiveLiteConversionTaskController.class, "13")) {
          return;
       }
       a.p(p0, "task");
       a.p(p1, "taskDetail");
       LiveLiteConversionTaskController tm = this.m;
       if (tm != null) {
          tm.j(p0, p1, p2);
       }
       return;
    }
    public void F2(){
       LiveLiteConversionTaskController liveLiteConv = LiveLiteConversionTaskController.class;
       if (PatchProxy.applyVoid(null, this, liveLiteConv, "3")) {
          return;
       }
       this.j = false;
       if (!PatchProxy.applyVoid(null, this, liveLiteConv, "4")) {
          this.k = null;
          LiveStreamFeed liveStreamFe1 = this.q.j0();
          boolean b = true;
          if (liveStreamFe1 != null) {
             this.m = new i(b, liveStreamFe1, this.B2(), this);
          }
          this.V2().b(b);
       }
       if (!PatchProxy.applyVoid(null, this, liveLiteConv, "5")) {
          this.t.e(this.W2());
       }
       if (!PatchProxy.applyVoid(null, this, liveLiteConv, "6")) {
          this.u().u0(641, LiveExtraMessages$SCLiveCommonStateSignal.class, new b(this));
       }
       if (!PatchProxy.applyVoid(null, this, liveLiteConv, "7")) {
          LiveStreamFeed liveStreamFe = this.q.j0();
          if (liveStreamFe != null) {
             liveStreamFe = liveStreamFe.mTypeViewList;
             Boolean uBoolean = (liveStreamFe != null)? Boolean.valueOf(ArraysKt___ArraysKt.P7(liveStreamFe, Integer.valueOf(41))): null;
             if (y0.p(uBoolean)) {
                this.V2().i.um(null, false, false, new d(new LiveLiteConversionTaskController$requestSocialDataIfNeed$1$1(this)));
             }
          }
       }
       return;
    }
    public boolean G2(){
       return false;
    }
    public boolean H2(){
       return false;
    }
    public void I0(a1 p0,int p1){
       LiveLiteConversionTaskController liveLiteConv = LiveLiteConversionTaskController.class;
       if (PatchProxy.isSupport(liveLiteConv) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, liveLiteConv, "14")) {
          return;
       }
       a.p(p0, "task");
       liveLiteConv = this.m;
       if (liveLiteConv != null) {
          liveLiteConv.k(p0, p1);
       }
       return;
    }
    public String I6(){
       String str;
       LiveLiteConversionTaskController obj = PatchProxy.apply(null, this, LiveLiteConversionTaskController.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m;
       if (obj != null) {
          str = obj.f();
          if (str != null) {
          label_001d :
             return str;
          }
       }
       str = "";
       goto label_001d ;
    }
    public void J1(){
       if (PatchProxy.applyVoid(null, this, LiveLiteConversionTaskController.class, "11")) {
          return;
       }
       this.j = true;
       this.V2().i.bf(2);
       return;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteConversionTaskController.class, "10")) {
          return;
       }
       this.t.c(this.W2());
       LiveLiteConversionTaskController tm = this.m;
       if (tm != null) {
          tm.a(this.l);
       }
       this.V2().a(this.l);
       tm = this.k;
       if (tm != null && !PatchProxy.applyVoid(objArray, tm, c.class, "6")) {
          tm.a = false;
          tm.b = false;
          c d = tm.d;
          if (d != null) {
             d.e();
          }
       }
       return;
    }
    public void K0(boolean p0){
       LiveLiteConversionTaskController liveLiteConv = LiveLiteConversionTaskController.class;
       if (PatchProxy.isSupport(liveLiteConv) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveLiteConv, "24")) {
          return;
       }
       LiveLiteParam liveLitePara = this.q.ok();
       a.o(liveLitePara, "mAudienceInfoService.liveLiteParam");
       LiveStreamFeed liveStreamFe = liveLitePara.getLiveStreamFeed();
       if (liveStreamFe != null) {
          liveStreamFe.f("ENABLE_NONAD_LOG", Boolean.valueOf(p0));
       }
       return;
    }
    public void R0(QLiveMessage p0){
    }
    public final r V2(){
       Object obj = PatchProxy.apply(null, this, LiveLiteConversionTaskController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n.getValue();
    }
    public final a W2(){
       Object obj = PatchProxy.apply(null, this, LiveLiteConversionTaskController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.o.getValue();
    }
    public final void X2(boolean p0){
       LiveLiteConversionTaskController tk;
       LiveLiteConversionTaskController liveLiteConv = LiveLiteConversionTaskController.class;
       if (PatchProxy.isSupport(liveLiteConv) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveLiteConv, "8")) {
          return;
       }
       if (p0) {
          if (!PatchProxy.applyVoid(null, this, liveLiteConv, "9")) {
             if (this.k == null) {
                this.k = new c(LiveLiteBottomBarService$BottomBarType.SOCIAL, this);
             }
             tk = this.k;
             a.m(tk);
             tk.a(this.D2()).setOnClickListener(this.p);
          }
          tk = this.k;
          if (tk != null) {
             r i = this.V2().i;
             a.o(i, "taskService");
             a1 uoa1 = i.pn();
             if (!i.qk() || this.j != null) {
                return;
             }else if(i.qk()){
                tk.e(this.t.j());
                this.s.a(tk);
                if (uoa1 != null) {
                   a1 k = uoa1.k;
                   if (k != null) {
                      LiveAdConversionTaskDetail mControlInfo = k.mControlInfo;
                      if (mControlInfo != null) {
                         liveLiteConv = this.k;
                         if (liveLiteConv != null && !PatchProxy.applyVoidOneRefs(mControlInfo, liveLiteConv, c.class, "5")) {
                            c d = liveLiteConv.d;
                            if (d != null) {
                               d.c(mControlInfo);
                               d.d();
                            }
                         }
                      }
                   }
                }
             }else {
                liveLiteConv = this.k;
                a.m(liveLiteConv);
                this.s.c(liveLiteConv);
             }
          }
       }else {
          tk = this.k;
          if (tk != null) {
             this.j = false;
             a.m(tk);
             this.s.c(tk);
          }
       }
    label_00b1 :
       return;
    }
    public void X3(a1 p0,String p1,int p2){
       if (PatchProxy.isSupport(LiveLiteConversionTaskController.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LiveLiteConversionTaskController.class, "16")) {
          return;
       }
       LiveLiteConversionTaskController tm = this.m;
       if (tm != null) {
          tm.m(p0, p1, p2);
       }
       return;
    }
    public c b(){
       Object obj = PatchProxy.apply(null, this, LiveLiteConversionTaskController.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.r.a().getFragmentManager();
    }
    public String d(){
       String obj = PatchProxy.apply(null, this, LiveLiteConversionTaskController.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q.d();
       if (obj == null) {
          obj = "";
       }
       return obj;
    }
    public String d4(a1 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteConversionTaskController.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "task");
       String str = this.V2().d(p0);
       a.o(str, "mLiveBaseTaskController.getH5DataFromTask\(task\)");
       return str;
    }
    public String d6(){
       String str;
       LiveLiteConversionTaskController obj = PatchProxy.apply(null, this, LiveLiteConversionTaskController.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m;
       if (obj != null) {
          str = obj.h();
          if (str != null) {
          label_001d :
             return str;
          }
       }
       str = "";
       goto label_001d ;
    }
    public String getLiveStreamId(){
       String obj = PatchProxy.apply(null, this, LiveLiteConversionTaskController.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q.getLiveStreamId();
       if (obj == null) {
          obj = "";
       }
       return obj;
    }
    public String k2(){
       String str;
       LiveLiteConversionTaskController obj = PatchProxy.apply(null, this, LiveLiteConversionTaskController.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m;
       if (obj != null) {
          str = obj.g();
          if (str != null) {
          label_001d :
             return str;
          }
       }
       str = "";
       goto label_001d ;
    }
    public a u(){
       a obj = PatchProxy.apply(null, this, LiveLiteConversionTaskController.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.u.u();
       a.o(obj, "mLiveLiteLongConnectManager.liveLongConnection");
       return obj;
    }
}
