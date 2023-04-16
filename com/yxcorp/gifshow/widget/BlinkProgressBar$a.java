package com.yxcorp.gifshow.widget.BlinkProgressBar$a;
import lnc.b0$b;
import com.yxcorp.gifshow.widget.BlinkProgressBar;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.widget.ProgressBar;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;

public class BlinkProgressBar$a implements b0$b	// class@0017f4
{
    public final BlinkProgressBar a;

    public void BlinkProgressBar$a(BlinkProgressBar p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       BlinkProgressBar$a uoa = BlinkProgressBar$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.a;
       uoa.g = p0;
       try{
          uoa.postInvalidate();
       }catch(java.lang.Exception e4){
          PostUtils.D("BlinkProgressBar", "", e4);
       }
       return;
    }
}
