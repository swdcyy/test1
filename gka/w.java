package gka.w;
import java.lang.Runnable;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.gifshow.widget.SectorProgressView;
import java.lang.CharSequence;
import android.widget.TextView;

public final class w implements Runnable	// class@002b1c
{
    public final ProgressFragment b;
    public final float c;
    public final String d;

    public void w(ProgressFragment p0,float p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       w tb = this.b;
       w tc = this.c;
       w td = this.d;
       Objects.requireNonNull(tb);
       ProgressFragment q = tb.q;
       if (q != null) {
          q.setPercent((tc * 100.00f));
          tb.r.setText(td);
       }
       return;
    }
}
