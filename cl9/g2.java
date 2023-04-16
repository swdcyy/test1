package cl9.g2;
import android.view.View$OnLayoutChangeListener;
import cl9.i2;
import java.lang.Object;
import android.view.View;
import java.util.Objects;

public final class g2 implements View$OnLayoutChangeListener	// class@000625
{
    public final i2 b;

    public void g2(i2 p0){
       this.b = p0;
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       g2 tb = this.b;
       Objects.requireNonNull(tb);
       if (p6 != p2 || p8 != p4) {
          tb.P8();
       }
       return;
    }
}
