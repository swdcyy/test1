package com.yxcorp.gifshow.widget.record.RoundProgressView$b;
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

public class RoundProgressView$b implements b0$b	// class@0019c0
{
    public final RoundProgressView a;

    public void RoundProgressView$b(RoundProgressView p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       RoundProgressView$b uob = RoundProgressView$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       uob = this.a;
       uob.q = p0;
       try{
          uob.postInvalidate();
       }catch(java.lang.Exception e4){
          PostUtils.D("RoundProgressView", "", e4);
       }
       return;
    }
}
