package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.j$f;
import e1a.l$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public class j$f implements l$a	// class@00181f
{
    public final j a;

    public void j$f(j p0){
       this.a = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       boolean b;
       if (PatchProxy.isSupport2(j$f.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, j$f.class, "1")) {
          return;
       }
       j$f ta = this.a;
       if (ta.M == null) {
          PatchProxy.onMethodExit(j$f.class, "1");
          return;
       }else if(!p0 && ta.W8()){
          b = true;
       }else {
          b = false;
       }
       this.a.R8(b);
       PatchProxy.onMethodExit(j$f.class, "1");
       return;
    }
}
