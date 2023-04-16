package com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayPhotoDetailVMFragment$a;
import joc.b0;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayPhotoDetailVMFragment;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import v6a.o0;
import java.lang.Integer;

public class SlidePlayPhotoDetailVMFragment$a implements b0	// class@00172d
{
    public final SlidePlayPhotoDetailVMFragment a;

    public void SlidePlayPhotoDetailVMFragment$a(SlidePlayPhotoDetailVMFragment p0){
       this.a = p0;
       super();
    }
    public boolean a(MotionEvent p0,boolean p1){
       if (PatchProxy.isSupport2(SlidePlayPhotoDetailVMFragment$a.class, "1")) {
          p0 = PatchProxy.applyTwoRefsWithListener(p0, Boolean.valueOf(p1), this, SlidePlayPhotoDetailVMFragment$a.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       boolean b = (this.a.N.n.intValue())? true: false;
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment$a.class, "1");
       return b;
    }
}
