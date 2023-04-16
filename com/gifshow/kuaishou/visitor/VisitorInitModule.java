package com.gifshow.kuaishou.visitor.VisitorInitModule;
import com.kwai.framework.init.HomeCreateInitModule;
import com.gifshow.kuaishou.visitor.VisitorInitModule$a;
import nsd.u;
import android.app.Activity;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.privacy.dialog.helper.e;
import com.yxcorp.gifshow.util.rx.RxBus;
import zh5.b;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.gifshow.kuaishou.visitor.VisitorInitModule$execute$1;
import th.a;
import msd.l;
import erd.g;
import crd.b;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.HomeActivity;

public final class VisitorInitModule extends HomeCreateInitModule	// class@0015d7
{
    public static boolean q;
    public static boolean r;
    public static final VisitorInitModule$a s;

    static {
       VisitorInitModule.s = new VisitorInitModule$a(null);
    }
    public void VisitorInitModule(){
       super();
    }
    public int f0(){
       return 9;
    }
    public void l0(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VisitorInitModule.class, "2")) {
          return;
       }
       if (p0 != null && (!VisitorInitModule.r && VisitorInitModule.q)) {
          VisitorInitModule.r = true;
          VisitorInitModule.q = false;
          new e().a(p0);
       }
    label_0023 :
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, VisitorInitModule.class, "1")) {
          return;
       }
       RxBus.f.h(b.class, RxBus$ThreadMode.MAIN, Integer.MAX_VALUE).subscribe(new a(new VisitorInitModule$execute$1(this)));
       return;
    }
    public final void onVisitorModeEvent(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorInitModule.class, "3")) {
          return;
       }
       if (p0.b == null) {
          return;
       }
       HomeActivity.N3(a.b());
       HomeActivity homeActivity = HomeActivity.H3();
       if (homeActivity != null) {
          int i = (p0.a())? 0x7f010109: 0x7f010106;
          int i1 = (p0.a())? 0x7f01010f: 0x7f010112;
          homeActivity.overridePendingTransition(i, i1);
       }
       return;
    }
}
