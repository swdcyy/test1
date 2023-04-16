package bjc.g;
import java.lang.Runnable;
import bjc.h;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.widget.SectorProgressView;
import android.content.Context;
import android.app.Dialog;
import java.lang.CharSequence;
import android.widget.TextView;

public final class g implements Runnable	// class@000486
{
    public final h b;
    public final int c;
    public final String d;

    public void g(h p0,int p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       g tb = this.b;
       tb.N.setPercent((float)this.c);
       Object[] objArray = new Object[]{this.d};
       tb.M.setText(String.format(tb.getContext().getString(R.string.arg_RES_7f1043db), objArray));
    }
}
