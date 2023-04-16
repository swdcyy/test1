package com.yxcorp.gifshow.widget.EditSpectrumView$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.widget.EditSpectrumView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.os.Handler;

public class EditSpectrumView$a implements Runnable	// class@001820
{
    public final EditSpectrumView b;

    public void EditSpectrumView$a(EditSpectrumView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, EditSpectrumView$a.class, "1")) {
          return;
       }
       this.b.invalidate();
       EditSpectrumView$a tb = this.b;
       tb.j = tb.j + 0.10f;
       tb.l.postDelayed(this, (long)tb.i);
       return;
    }
}
