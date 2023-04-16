package com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayVerticalPhotosVMFragment$a;
import joc.b0;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayVerticalPhotosVMFragment;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import v6a.o0;
import java.lang.Integer;

public class SlidePlayVerticalPhotosVMFragment$a implements b0	// class@00172f
{
    public final SlidePlayVerticalPhotosVMFragment a;

    public void SlidePlayVerticalPhotosVMFragment$a(SlidePlayVerticalPhotosVMFragment p0){
       this.a = p0;
       super();
    }
    public boolean a(MotionEvent p0,boolean p1){
       if (PatchProxy.isSupport2(SlidePlayVerticalPhotosVMFragment$a.class, "1")) {
          p0 = PatchProxy.applyTwoRefsWithListener(p0, Boolean.valueOf(p1), this, SlidePlayVerticalPhotosVMFragment$a.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       SlidePlayVerticalPhotosVMFragment g = this.a.G;
       p1 = false;
       if (g != null && g.getChildCount() > 0) {
          if (this.a.L.n.intValue()) {
             p1 = true;
          }
          PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment$a.class, "1");
          return p1;
       }else {
          PatchProxy.onMethodExit(SlidePlayVerticalPhotosVMFragment$a.class, "1");
          return p1;
       }
    }
}
