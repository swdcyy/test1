package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.p$a;
import r7a.h;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.p;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class p$a extends h	// class@00182c
{
    public final p a;

    public void p$a(p p0){
       this.a = p0;
       super();
    }
    public void a(MotionEvent p0,boolean p1,int p2){
       if (PatchProxy.isSupport2(p$a.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, Boolean.valueOf(p1), Integer.valueOf(p2), this, p$a.class, "1")) {
          return;
       }
       p$a ta = this.a;
       ta.Q = p1 ^ 0x01;
       ta.o0(p0.getX(), p0.getY());
       PatchProxy.onMethodExit(p$a.class, "1");
       return;
    }
}
