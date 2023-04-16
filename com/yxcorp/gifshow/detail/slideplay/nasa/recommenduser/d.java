package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.d;
import bz5.a$c;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.e;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewParent;
import android.view.ViewGroup;
import k6a.f;
import java.lang.Runnable;

public final class d implements a$c	// class@00175c
{
    public final e a;

    public void d(e p0){
       this.a = p0;
    }
    public final void D(){
       d ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidWithListener(null, ta, e.class, "5")) {
       }else {
          e h = ta.h;
          if (h == null || h.getParent() == null) {
             PatchProxy.onMethodExit(e.class, "5");
          }else {
             ViewGroup parent = ta.h.getParent();
             parent.post(new f(ta, parent));
             PatchProxy.onMethodExit(e.class, "5");
          }
       }
       return;
    }
}
