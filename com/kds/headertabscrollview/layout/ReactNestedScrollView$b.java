package com.kds.headertabscrollview.layout.ReactNestedScrollView$b;
import java.lang.Runnable;
import com.kds.headertabscrollview.layout.ReactNestedScrollView;
import java.lang.Object;
import android.view.View;
import a2.i0;
import android.view.ViewGroup;
import uf.b;

public final class ReactNestedScrollView$b implements Runnable	// class@000728
{
    public boolean b;
    public final ReactNestedScrollView c;

    public void ReactNestedScrollView$b(ReactNestedScrollView p0){
       this.c = p0;
       super();
    }
    public void run(){
       ReactNestedScrollView$b tc = this.c;
       if (tc.U0 != null) {
          tc.U0 = false;
          i0.l0(tc, this, 20);
       }else if(tc.getPagingEnabled() && this.b == null){
          this.b = true;
          this.c.D(false);
          i0.l0(this.c, this, 20);
       }else if(this.c.getNeedSendMomentumEvents()){
          b.g(this.c);
       }
       this.c.W = null;
       return;
    }
}
