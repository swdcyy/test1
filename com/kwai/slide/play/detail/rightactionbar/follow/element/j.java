package com.kwai.slide.play.detail.rightactionbar.follow.element.j;
import androidx.lifecycle.Observer;
import com.kwai.slide.play.detail.rightactionbar.follow.element.k;
import java.lang.Object;
import z1.a;
import ns7.f0;
import java.lang.Runnable;
import ekd.k1;

public final class j implements Observer	// class@00185c
{
    public final k b;

    public void j(k p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       j tb = this.b;
       k n = tb.N;
       if (n != null && tb.O != null) {
          p0.accept(n);
          k1.o(new f0(tb));
       }
       return;
    }
}
