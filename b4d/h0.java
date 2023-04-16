package b4d.h0;
import android.view.View$OnLayoutChangeListener;
import b4d.i0;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup;

public final class h0 implements View$OnLayoutChangeListener	// class@000370
{
    public final i0 b;

    public void h0(i0 p0){
       this.b = p0;
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       h0 tb = this.b;
       if (tb.v.getTop() < 0) {
          tb.v.setVisibility(8);
          tb.v.removeOnLayoutChangeListener(tb.p);
          tb.p = null;
       }
       return;
    }
}
