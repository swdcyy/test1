package az3.i;
import lnc.c3$a;
import java.lang.String;
import java.lang.Object;
import android.widget.TextView;
import java.lang.CharSequence;

public final class i implements c3$a	// class@0002e0
{
    public final boolean a;
    public final String b;

    public void i(boolean p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void apply(Object p0){
       i tb = this.b;
       if (this.a != null) {
          p0.setText(tb);
          p0.setVisibility(0);
       }else {
          p0.setVisibility(8);
       }
       return;
    }
}
