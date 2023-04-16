package com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayHorizontalPhotosVMFragment$b;
import joc.b0;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayHorizontalPhotosVMFragment;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import v6a.o0;
import java.lang.Integer;

public class SlidePlayHorizontalPhotosVMFragment$b implements b0	// class@00172b
{
    public final SlidePlayHorizontalPhotosVMFragment a;

    public void SlidePlayHorizontalPhotosVMFragment$b(SlidePlayHorizontalPhotosVMFragment p0){
       this.a = p0;
       super();
    }
    public boolean a(MotionEvent p0,boolean p1){
       if (PatchProxy.isSupport2(SlidePlayHorizontalPhotosVMFragment$b.class, "1")) {
          p0 = PatchProxy.applyTwoRefsWithListener(p0, Boolean.valueOf(p1), this, SlidePlayHorizontalPhotosVMFragment$b.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       boolean b = (this.a.J.n.intValue())? true: false;
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment$b.class, "1");
       return b;
    }
}
