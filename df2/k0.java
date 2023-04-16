package df2.k0;
import android.content.DialogInterface$OnClickListener;
import df2.m0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import android.content.DialogInterface;

public final class k0 implements DialogInterface$OnClickListener	// class@0024f8
{
    public final m0 b;
    public final GifshowActivity c;

    public void k0(m0 p0,GifshowActivity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(DialogInterface p0,int p1){
       m0.X8(this.b, this.c, p0, p1);
    }
}
