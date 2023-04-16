package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.n$a;
import r7a.h;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.n;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;

public class n$a extends h	// class@001825
{
    public final n a;

    public void n$a(n p0){
       this.a = p0;
       super();
    }
    public void a(MotionEvent p0,boolean p1,int p2){
       if (PatchProxy.isSupport2(n$a.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, Boolean.valueOf(p1), Integer.valueOf(p2), this, n$a.class, "1")) {
          return;
       }
       if (this.a.w.isMine()) {
          PatchProxy.onMethodExit(n$a.class, "1");
          return;
       }else {
          n$a ta = this.a;
          ta.M = p1 ^ 0x01;
          ta.o0(p0.getRawX(), p0.getRawY());
          PatchProxy.onMethodExit(n$a.class, "1");
          return;
       }
    }
}
