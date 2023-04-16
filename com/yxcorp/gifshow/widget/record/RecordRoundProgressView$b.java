package com.yxcorp.gifshow.widget.record.RecordRoundProgressView$b;
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

public class RecordRoundProgressView$b implements b0$b	// class@0019bd
{
    public final RecordRoundProgressView a;

    public void RecordRoundProgressView$b(RecordRoundProgressView p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       RecordRoundProgressView$b uob = RecordRoundProgressView$b.class;
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
