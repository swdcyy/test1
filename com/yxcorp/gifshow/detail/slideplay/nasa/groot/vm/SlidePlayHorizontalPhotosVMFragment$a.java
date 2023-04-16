package com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayHorizontalPhotosVMFragment$a;
import joc.d;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayHorizontalPhotosVMFragment;
import java.lang.Object;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import v6a.o0;
import vd5.a;

public class SlidePlayHorizontalPhotosVMFragment$a implements d	// class@00172a
{
    public final SlidePlayHorizontalPhotosVMFragment a;

    public void SlidePlayHorizontalPhotosVMFragment$a(SlidePlayHorizontalPhotosVMFragment p0){
       this.a = p0;
       super();
    }
    public boolean a(MotionEvent p0,boolean p1){
       if (PatchProxy.isSupport2(SlidePlayHorizontalPhotosVMFragment$a.class, "1")) {
          p0 = PatchProxy.applyTwoRefsWithListener(p0, Boolean.valueOf(p1), this, SlidePlayHorizontalPhotosVMFragment$a.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       boolean b = false;
       if (!p1) {
          o0 obj = PatchProxy.applyWithListener(null, this, SlidePlayHorizontalPhotosVMFragment$a.class, "2");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = this.a.J.T;
             if (obj != null && obj.a()) {
                b = true;
             }
             PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment$a.class, "2");
          }
       }
       PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment$a.class, "1");
       return b;
    }
}
