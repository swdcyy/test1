package com.yxcorp.gifshow.media.watermark.b;
import com.yxcorp.gifshow.fragment.ProgressFragment$a;
import com.yxcorp.gifshow.media.watermark.d;
import java.lang.Object;
import nxc.c;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import ok.h;
import y6b.e;
import android.view.View$OnClickListener;

public final class b implements ProgressFragment$a	// class@001d2c
{
    public final d a;

    public void b(d p0){
       this.a = p0;
    }
    public final void a(){
       b ta = this.a;
       ta.n.e = true;
       ta.v.Lh();
       d o = ta.o;
       if (o != null) {
          o.apply(ta.n);
       }
       ta.v.sh();
       ta.v.Bh(new e(ta));
       return;
    }
}
