package bk0.k;
import bk0.l;
import bk0.h;
import bk0.d;
import bk0.k$a;
import nsd.u;
import java.lang.String;
import com.kuaishou.krn.log.model.KrnPageFunnelLoadTime;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import lj0.c;
import zj0.v;
import ek0.d;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.log.model.KrnPageFunnelParams;
import com.kuaishou.krn.log.model.KrnPageFunnelError;
import com.kuaishou.krn.log.model.KrnLogCommonParams;
import bk0.j;
import java.lang.System;
import java.lang.Long;
import rj0.c;
import rj0.a;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.lang.Integer;
import java.lang.RuntimeException;
import fk0.l;
import rj0.b;
import com.kuaishou.krn.model.LaunchModel;

public final class k extends d implements l, h	// class@0003aa
{
    public final KrnPageFunnelLoadTime c;
    public boolean d;
    public String e;
    public static final k$a f;

    static {
       k.f = new k$a(null);
    }
    public void k(String p0){
       super();
       this.e = p0;
       this.c = new KrnPageFunnelLoadTime();
    }
    public static void I(k p0,String p1,Throwable p2,int p3,Object p4){
       p0.G(p1, null);
    }
    public final void G(String p0,Throwable p1){
       k ok = k.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ok, "22")) {
          return;
       }
       if (this.d != null) {
          d.i("funnel has reported, "+this.D());
          return;
       }else {
          boolean b = true;
          this.d = b;
          KrnPageFunnelParams krnPageFunne = PatchProxy.applyTwoRefs(p0, p1, this, ok, "1");
          if (krnPageFunne != PatchProxyResult.class) {
          }else {
             krnPageFunne = new KrnPageFunnelParams();
             krnPageFunne.setLoadTime(this.c);
             krnPageFunne.setSessionId(this.e);
             krnPageFunne.setEventName(p0);
             krnPageFunne.setResult(b);
             if (p1 != null) {
                KrnPageFunnelError krnPageFunne1 = new KrnPageFunnelError();
                krnPageFunne1.setMsg(p1.getMessage());
                int i = 0;
                krnPageFunne1.setType(String.valueOf(i));
                krnPageFunne.setError(krnPageFunne1);
                krnPageFunne.setResult(i);
             }
             krnPageFunne.setCommon(new KrnLogCommonParams(this.D(), null));
          }
          j.b.b("KRN_PAGE_LOAD", krnPageFunne);
          return;
       }
    }
    public void H(){
       if (PatchProxy.applyVoid(null, this, k.class, "17")) {
          return;
       }
       this.c.setPageExitTime(Long.valueOf(System.currentTimeMillis()));
       k.I(this, "PAGE_EXITED", null, 2, null);
       return;
    }
    public void a(c p0,a p1,long p2){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, k.class, "16")) {
          return;
       }
       this.c.setReactRootViewFirstOnAttachTime(Long.valueOf(p2));
       k tc = this.c;
       Long longx = null;
       Long longx1 = (p0 != null)? Long.valueOf(p0.c()): longx;
       tc.setLcpLayoutUpdateTime(longx1);
       tc = this.c;
       longx1 = (p0 != null)? Long.valueOf(p0.b()): longx;
       tc.setLcpOverHeadInShadowThread(longx1);
       tc = this.c;
       longx1 = (p0 != null)? Long.valueOf(p0.d()): longx;
       tc.setLcpOnDrawTime(longx1);
       tc = this.c;
       Long longx2 = (p0 != null)? Long.valueOf(p0.a()): longx;
       tc.setLcpOverHeadInUIThread(longx2);
       k tc1 = this.c;
       Long longx3 = (p1 != null)? Long.valueOf(p1.c()): longx;
       tc1.setFmpLayoutUpdateTime(longx3);
       tc1 = this.c;
       longx3 = (p1 != null)? Long.valueOf(p1.b()): longx;
       tc1.setFmpOverHeadInShadowThread(longx3);
       tc1 = this.c;
       longx3 = (p1 != null)? Long.valueOf(p1.d()): longx;
       tc1.setFmpOnDrawTime(longx3);
       tc1 = this.c;
       if (p1 != null) {
          longx = Long.valueOf(p1.a());
       }
       tc1.setFmpOverHeadInUIThread(longx);
       return;
    }
    public void b(long p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ok, "13")) {
          return;
       }
       if (this.c.getNativeT1() != null) {
          return;
       }
       this.c.setNativeT1(Long.valueOf(p0));
       return;
    }
    public void d(long p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ok, "11")) {
          return;
       }
       this.c.setFcpTime(Long.valueOf(p0));
       return;
    }
    public void e(long p0,Throwable p1){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, k.class, "12")) {
          return;
       }
       a.p(p1, "throwable");
       this.G("NATIVE_EXCEPTION", p1);
       return;
    }
    public void g(long p0,Throwable p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, ok, "5")) {
          return;
       }
       this.c.setEngineEndTime(Long.valueOf(System.currentTimeMillis()));
       if (p1 != null) {
          this.G("ENGINE_END", p1);
       }
       return;
    }
    public void h(Long p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "20")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.c.setJsDataRequestStartTime(p0);
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, k.class, "6")) {
          return;
       }
       this.c.setPrepareJSRuntimeStartTimestamp(Long.valueOf(System.currentTimeMillis()));
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       this.c.setViewContainerEndTime(Long.valueOf(System.currentTimeMillis()));
       return;
    }
    public void k(Long p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "19")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.c.setFmpTime(p0);
       k.I(this, "FMP", null, 2, null);
       return;
    }
    public void l(Long p0,int p1,Map p2){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, k.class, "21")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.c.setJsDataRequestEndTime(p0);
       if (!p1) {
          this.G("JS_DATA_REQUEST_END", new RuntimeException("js data request failed"));
       }
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, k.class, "9")) {
          return;
       }
       this.c.setBusinessJsLoadStartTime(Long.valueOf(System.currentTimeMillis()));
       return;
    }
    public void o(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "18")) {
          return;
       }
       a.p(p0, "pageRenderInfo");
       this.c.setT2(Long.valueOf(p0.a));
       this.c.setT3(Long.valueOf(p0.b));
       k.I(this, "FMP", null, 2, null);
       return;
    }
    public void p(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "15")) {
          return;
       }
       a.p(p0, "funnelTime");
       this.c.setLoadType(Integer.valueOf(p0.h()));
       this.c.setKrnEntryTimestamp(Long.valueOf(p0.g()));
       this.c.setBridgeInitTime(Long.valueOf(p0.f()));
       this.c.setBaseBundleStartRunTime(Long.valueOf(p0.b()));
       this.c.setBaseBundleEndRunTime(Long.valueOf(p0.c()));
       this.c.setBundleStartRunTime(Long.valueOf(p0.d()));
       this.c.setBundleEndRunTime(Long.valueOf(p0.a()));
       this.c.setContentAppearedTime(Long.valueOf(p0.e()));
       return;
    }
    public void q(long p0,Throwable p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, ok, "10")) {
          return;
       }
       this.c.setBusinessJsLoadEndTime(Long.valueOf(System.currentTimeMillis()));
       if (p1 != null) {
          this.G("BUSINESS_JS_LOAD_END", p1);
       }
       return;
    }
    public void t(long p0,long p1){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, k.class, "4")) {
          return;
       }
       this.c.setEngineStartTime(Long.valueOf(p0));
       return;
    }
    public void u(long p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ok, "14")) {
          return;
       }
       if (this.c.getT1() != null) {
          return;
       }
       this.c.setT1(Long.valueOf(p0));
       return;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, k.class, "7")) {
          return;
       }
       this.c.setBundleInfoLoadStartTime(Long.valueOf(System.currentTimeMillis()));
       return;
    }
    public void y(LaunchModel p0,long p1,long p2){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, k.class, "2")) {
          return;
       }
       a.p(p0, "launchModel");
       this.c.setViewContainerStartTime(Long.valueOf(p1));
       return;
    }
    public void z(long p0,Throwable p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, ok, "8")) {
          return;
       }
       this.c.setBundleInfoLoadEndTime(Long.valueOf(System.currentTimeMillis()));
       if (p1 != null) {
          this.G("BUNDLE_INFO_LOAD_END", p1);
       }
       return;
    }
}
