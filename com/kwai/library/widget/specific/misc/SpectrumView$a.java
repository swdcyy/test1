package com.kwai.library.widget.specific.misc.SpectrumView$a;
import java.lang.Runnable;
import com.kwai.library.widget.specific.misc.SpectrumView;
import java.lang.Object;
import android.view.View;
import android.os.Handler;

public class SpectrumView$a implements Runnable	// class@000a19
{
    public final SpectrumView b;

    public void SpectrumView$a(SpectrumView p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.invalidate();
       SpectrumView$a tb = this.b;
       tb.i = tb.i + 0.10f;
       tb.k.postDelayed(this, (long)tb.h);
    }
}
