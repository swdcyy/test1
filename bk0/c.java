package bk0.c;
import xu6.j;
import lj0.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.model.LoadingStateTrack;
import java.util.Objects;
import com.kuaishou.krn.model.KrnBundleLoadInfo;
import java.lang.System;
import hg.a;
import cv6.b;
import com.kwai.kxb.update.model.DownloadPriority;
import zu6.a;

public final class c extends j	// class@00039d
{
    public final c b;

    public void c(c p0){
       a.p(p0, "mKrnContext");
       super();
       this.b = p0;
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "12")) {
          return;
       }
       LoadingStateTrack loadingState = this.b.o();
       Objects.requireNonNull(loadingState);
       if (!PatchProxy.applyVoid(null, loadingState, LoadingStateTrack.class, "23")) {
          loadingState = loadingState.k;
          Objects.requireNonNull(loadingState);
          if (!PatchProxy.applyVoid(null, loadingState, KrnBundleLoadInfo.class, "41")) {
             loadingState.z = System.currentTimeMillis();
             if (loadingState.c != null) {
                a.d(0, "asset_check", a.e(), 6);
             }
          }
       }
       return;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "11")) {
          return;
       }
       LoadingStateTrack loadingState = this.b.o();
       Objects.requireNonNull(loadingState);
       if (!PatchProxy.applyVoid(objArray, loadingState, LoadingStateTrack.class, "22")) {
          loadingState = loadingState.k;
          Objects.requireNonNull(loadingState);
          if (!PatchProxy.applyVoid(objArray, loadingState, KrnBundleLoadInfo.class, "40")) {
             loadingState.y = System.currentTimeMillis();
             if (loadingState.c != null) {
                a.b(0, "asset_check", a.e(), 6);
             }
          }
       }
       return;
    }
    public void d(b p0,DownloadPriority p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "10")) {
          return;
       }
       a.p(p0, "config");
       a.p(p1, "priority");
       super.d(p0, p1, p2);
       LoadingStateTrack loadingState = this.b.o();
       Objects.requireNonNull(loadingState);
       if (!PatchProxy.applyVoid(null, loadingState, LoadingStateTrack.class, "21")) {
          loadingState = loadingState.k;
          Objects.requireNonNull(loadingState);
          if (!PatchProxy.applyVoid(null, loadingState, KrnBundleLoadInfo.class, "39")) {
             loadingState.x = System.currentTimeMillis();
             if (loadingState.c != null) {
                a.d(0, "asset_get", a.e(), 6);
             }
          }
       }
       return;
    }
    public void e(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "9")) {
          return;
       }
       a.p(p0, "config");
       super.e(p0);
       LoadingStateTrack loadingState = this.b.o();
       Objects.requireNonNull(loadingState);
       if (!PatchProxy.applyVoid(null, loadingState, LoadingStateTrack.class, "20")) {
          loadingState = loadingState.k;
          Objects.requireNonNull(loadingState);
          if (!PatchProxy.applyVoid(null, loadingState, KrnBundleLoadInfo.class, "38")) {
             loadingState.w = System.currentTimeMillis();
             if (loadingState.c != null) {
                a.b(0, "asset_get", a.e(), 6);
             }
          }
       }
       return;
    }
    public void f(a p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "14")) {
          return;
       }
       a.p(p0, "config");
       super.f(p0, p1);
       LoadingStateTrack loadingState = this.b.o();
       Objects.requireNonNull(loadingState);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, loadingState, LoadingStateTrack.class, "25")) {
          loadingState = loadingState.k;
          Objects.requireNonNull(loadingState);
          if (!PatchProxy.applyVoid(objArray, loadingState, KrnBundleLoadInfo.class, "43")) {
             loadingState.B = System.currentTimeMillis();
             if (loadingState.c != null) {
                a.d(0, "asset_resolve", a.e(), 6);
             }
          }
       }
       return;
    }
    public void g(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "13")) {
          return;
       }
       a.p(p0, "config");
       super.g(p0);
       LoadingStateTrack loadingState = this.b.o();
       Objects.requireNonNull(loadingState);
       if (!PatchProxy.applyVoid(null, loadingState, LoadingStateTrack.class, "24")) {
          loadingState = loadingState.k;
          Objects.requireNonNull(loadingState);
          if (!PatchProxy.applyVoid(null, loadingState, KrnBundleLoadInfo.class, "42")) {
             loadingState.A = System.currentTimeMillis();
             if (loadingState.c != null) {
                a.b(0, "asset_resolve", a.e(), 6);
             }
          }
       }
       return;
    }
    public void h(Throwable p0){
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, c.class, "4")) {
          return;
       }
       if (obj.b.y()) {
          LoadingStateTrack loadingState = obj.b.o();
          Objects.requireNonNull(loadingState);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, loadingState, LoadingStateTrack.class, "15")) {
             loadingState = loadingState.k;
             Objects.requireNonNull(loadingState);
             if (!PatchProxy.applyVoid(objArray, loadingState, KrnBundleLoadInfo.class, "33")) {
                loadingState.r = System.currentTimeMillis();
                if (loadingState.c != null) {
                   a.b(0, "asset_load_from_local", loadingState.h1, 6);
                   a.d(0, "asset_load_from_local", a.e(), 6);
                }
             }
          }
       }
       return;
    }
    public void i(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "3")) {
          return;
       }
       if (this.b.y()) {
          LoadingStateTrack loadingState = this.b.o();
          Objects.requireNonNull(loadingState);
          if (!PatchProxy.applyVoid(objArray, loadingState, LoadingStateTrack.class, "14")) {
             loadingState = loadingState.k;
             Objects.requireNonNull(loadingState);
             if (!PatchProxy.applyVoid(objArray, loadingState, KrnBundleLoadInfo.class, "32")) {
                loadingState.q = System.currentTimeMillis();
                loadingState.h1 = a.e();
             }
          }
       }
       return;
    }
    public void j(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       if (this.b.y()) {
          LoadingStateTrack loadingState = this.b.o();
          Objects.requireNonNull(loadingState);
          if (!PatchProxy.applyVoid(null, loadingState, LoadingStateTrack.class, "13")) {
             loadingState = loadingState.k;
             Objects.requireNonNull(loadingState);
             if (!PatchProxy.applyVoid(null, loadingState, KrnBundleLoadInfo.class, "31")) {
                loadingState.p = System.currentTimeMillis();
                if (loadingState.c != null) {
                   a.d(0, "asset_load_from_memory", a.e(), 6);
                }
             }
          }
       }
       return;
    }
    public void k(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "1")) {
          return;
       }
       if (this.b.y()) {
          LoadingStateTrack loadingState = this.b.o();
          Objects.requireNonNull(loadingState);
          if (!PatchProxy.applyVoid(objArray, loadingState, LoadingStateTrack.class, "12")) {
             loadingState = loadingState.k;
             Objects.requireNonNull(loadingState);
             if (!PatchProxy.applyVoid(objArray, loadingState, KrnBundleLoadInfo.class, "30")) {
                loadingState.o = System.currentTimeMillis();
                if (loadingState.c != null) {
                   a.b(0, "asset_load_from_memory", a.e(), 6);
                }
             }
          }
       }
       return;
    }
    public void l(Throwable p0){
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, c.class, "6")) {
          return;
       }
       if (obj.b.y()) {
          LoadingStateTrack loadingState = obj.b.o();
          Objects.requireNonNull(loadingState);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, loadingState, LoadingStateTrack.class, "17")) {
             loadingState = loadingState.k;
             Objects.requireNonNull(loadingState);
             if (!PatchProxy.applyVoid(objArray, loadingState, KrnBundleLoadInfo.class, "35")) {
                loadingState.t = System.currentTimeMillis();
                if (loadingState.c != null) {
                   a.b(0, "asset_load_from_not_local", loadingState.i1, 6);
                   a.d(0, "asset_load_from_not_local", a.e(), 6);
                }
             }
          }
       }
       return;
    }
    public void m(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "5")) {
          return;
       }
       if (this.b.y()) {
          LoadingStateTrack loadingState = this.b.o();
          Objects.requireNonNull(loadingState);
          if (!PatchProxy.applyVoid(objArray, loadingState, LoadingStateTrack.class, "16")) {
             loadingState = loadingState.k;
             Objects.requireNonNull(loadingState);
             if (!PatchProxy.applyVoid(objArray, loadingState, KrnBundleLoadInfo.class, "34")) {
                loadingState.s = System.currentTimeMillis();
                loadingState.i1 = a.e();
             }
          }
       }
       return;
    }
    public void q(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "8")) {
          return;
       }
       a.p(p0, "bundleId");
       super.q(p0, p1);
       LoadingStateTrack loadingState = this.b.o();
       Objects.requireNonNull(loadingState);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, loadingState, LoadingStateTrack.class, "19")) {
          loadingState = loadingState.k;
          Objects.requireNonNull(loadingState);
          if (!PatchProxy.applyVoid(objArray, loadingState, KrnBundleLoadInfo.class, "37")) {
             loadingState.v = System.currentTimeMillis();
             if (loadingState.c != null) {
                a.d(0, "asset_get_info", a.e(), 6);
             }
          }
       }
       return;
    }
    public void r(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "7")) {
          return;
       }
       a.p(p0, "bundleId");
       super.r(p0);
       LoadingStateTrack loadingState = this.b.o();
       Objects.requireNonNull(loadingState);
       if (!PatchProxy.applyVoid(null, loadingState, LoadingStateTrack.class, "18")) {
          loadingState = loadingState.k;
          Objects.requireNonNull(loadingState);
          if (!PatchProxy.applyVoid(null, loadingState, KrnBundleLoadInfo.class, "36")) {
             loadingState.u = System.currentTimeMillis();
             if (loadingState.c != null) {
                a.b(0, "asset_get_info", a.e(), 6);
             }
          }
       }
       return;
    }
}
