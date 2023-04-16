package com.yxcorp.gifshow.widget.record.RecordRoundProgressView$a;
import lnc.b0$b;
import com.yxcorp.gifshow.widget.record.RecordRoundProgressView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;

public class RecordRoundProgressView$a implements b0$b	// class@0019bc
{
    public final RecordRoundProgressView a;

    public void RecordRoundProgressView$a(RecordRoundProgressView p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       RecordRoundProgressView$a uoa = RecordRoundProgressView$a.class;
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
