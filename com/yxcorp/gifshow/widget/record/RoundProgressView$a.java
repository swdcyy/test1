package com.yxcorp.gifshow.widget.record.RoundProgressView$a;
import lnc.b0$b;
import com.yxcorp.gifshow.widget.record.RoundProgressView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;

public class RoundProgressView$a implements b0$b	// class@0019bf
{
    public final RoundProgressView a;

    public void RoundProgressView$a(RoundProgressView p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       RoundProgressView$a uoa = RoundProgressView$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.a;
       uoa.o = p0;
       try{
          uoa.postInvalidate();
       }catch(java.lang.Exception e4){
          PostUtils.D("RoundProgressView", "", e4);
       }
       return;
    }
}
