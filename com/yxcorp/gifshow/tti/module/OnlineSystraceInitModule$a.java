package com.yxcorp.gifshow.tti.module.OnlineSystraceInitModule$a;
import androidx.fragment.app.c$b;
import com.yxcorp.gifshow.tti.module.OnlineSystraceInitModule;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.View;

public class OnlineSystraceInitModule$a extends c$b	// class@001dc1
{
    public final OnlineSystraceInitModule a;

    public void OnlineSystraceInitModule$a(OnlineSystraceInitModule p0){
       this.a = p0;
       super();
    }
    public void a(c p0,Fragment p1,Bundle p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, OnlineSystraceInitModule$a.class, "5")) {
          return;
       }
       this.a.n0(p0, p1, "onFragmentActivityCreated");
       return;
    }
    public void b(c p0,Fragment p1,Context p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, OnlineSystraceInitModule$a.class, "2")) {
          return;
       }
       this.a.n0(p0, p1, "onFragmentAttached");
       return;
    }
    public void c(c p0,Fragment p1,Bundle p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, OnlineSystraceInitModule$a.class, "4")) {
          return;
       }
       this.a.n0(p0, p1, "onFragmentCreated");
       return;
    }
    public void d(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OnlineSystraceInitModule$a.class, "13")) {
          return;
       }
       this.a.n0(p0, p1, "onFragmentDestroyed");
       return;
    }
    public void f(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OnlineSystraceInitModule$a.class, "9")) {
          return;
       }
       this.a.n0(p0, p1, "onFragmentPaused");
       return;
    }
    public void g(c p0,Fragment p1,Context p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, OnlineSystraceInitModule$a.class, "1")) {
          return;
       }
       this.a.n0(p0, p1, "onFragmentPreAttached");
       return;
    }
    public void h(c p0,Fragment p1,Bundle p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, OnlineSystraceInitModule$a.class, "3")) {
          return;
       }
       this.a.n0(p0, p1, "onFragmentPreCreated");
       return;
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OnlineSystraceInitModule$a.class, "8")) {
          return;
       }
       this.a.n0(p0, p1, "onFragmentResumed");
       return;
    }
    public void j(c p0,Fragment p1,Bundle p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, OnlineSystraceInitModule$a.class, "11")) {
          return;
       }
       this.a.n0(p0, p1, "onFragmentSaveInstanceState");
       return;
    }
    public void k(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OnlineSystraceInitModule$a.class, "7")) {
          return;
       }
       this.a.n0(p0, p1, "onFragmentStarted");
       return;
    }
    public void l(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OnlineSystraceInitModule$a.class, "10")) {
          return;
       }
       this.a.n0(p0, p1, "onFragmentStopped");
       return;
    }
    public void m(c p0,Fragment p1,View p2,Bundle p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, OnlineSystraceInitModule$a.class, "6")) {
          return;
       }
       this.a.n0(p0, p1, "onFragmentViewCreated");
       return;
    }
    public void n(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OnlineSystraceInitModule$a.class, "12")) {
          return;
       }
       this.a.n0(p0, p1, "onFragmentViewDestroyed");
       return;
    }
}
