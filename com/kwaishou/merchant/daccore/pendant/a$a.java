package com.kwaishou.merchant.daccore.pendant.a$a;
import com.kwaishou.merchant.daccore.pendant.extension.PendantExtension;
import c08.a;
import com.kwaishou.merchant.daccore.rnlive.RNLive;
import java.lang.String;
import com.google.gson.JsonObject;
import com.kwaishou.merchant.daccore.data.model.DataSource;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import brd.t;
import n08.a;
import java.lang.Boolean;
import java.lang.Object;

public class a$a extends PendantExtension	// class@00132b
{

    public void a$a(){
       super();
    }
    public void a(a p0){
       super.a(p0);
       RNLive rNLive = p0.f();
       if (rNLive != null) {
          rNLive.onLiveEvent("onPageShow");
       }
       return;
    }
    public void b(a p0){
       super.b(p0);
       RNLive rNLive = p0.f();
       if (rNLive != null) {
          rNLive.onLiveEvent("onLiveUnbind");
       }
       return;
    }
    public void c(a p0){
       super.c(p0);
       RNLive rNLive = p0.f();
       if (rNLive != null) {
          rNLive.onLiveEvent("onLiveCreate");
       }
       return;
    }
    public void d(a p0){
       super.d(p0);
       RNLive rNLive = p0.f();
       if (rNLive != null) {
          rNLive.onLiveEvent("onLiveBind");
       }
       return;
    }
    public void e(a p0){
       super.e(p0);
       RNLive rNLive = p0.f();
       if (rNLive != null) {
          rNLive.onLiveEvent("onPageHide");
       }
       return;
    }
    public void f(a p0){
       super.f(p0);
       RNLive rNLive = p0.f();
       if (rNLive != null) {
          rNLive.onLiveEvent("onLiveStop");
       }
       return;
    }
    public void g(a p0){
       super.g(p0);
       RNLive rNLive = p0.f();
       if (rNLive != null) {
          rNLive.onLiveEvent("onLiveDestroy");
       }
       return;
    }
    public void h(a p0,JsonObject p1,DataSource p2,String p3){
       RNLive rNLive = p0.f();
       if (rNLive != null) {
          rNLive.a("afterPendantRemoved", p1, p2.getSource(), p3);
       }
       return;
    }
    public t j(a p0,String p1,DataSource p2,PendantMountInfo p3,JsonObject p4,String p5){
       RNLive rNLive = p0.f();
       if (rNLive != null) {
          return rNLive.e(p1, p2.getSource(), p3, p4, p5);
       }
       return super.j(p0, p1, p2, p3, p4, p5);
    }
    public t k(a p0,String p1,DataSource p2,JsonObject p3,String p4,a p5){
       RNLive rNLive = p0.f();
       if (rNLive != null) {
          return rNLive.g(p1, p2.getSource(), p3, p4, p5);
       }
       return t.just(Boolean.FALSE);
    }
}
