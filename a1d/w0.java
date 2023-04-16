package a1d.w0;
import lnc.c3$a;
import a1d.b1;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Objects;
import android.content.res.Resources;
import android.app.Activity;
import android.content.res.Configuration;
import a1d.u0;
import hka.b;

public final class w0 implements c3$a	// class@00005b
{
    public final b1 a;

    public void w0(b1 p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       w0 ta = this.a;
       Objects.requireNonNull(ta);
       ta.C = p0.getResources().getConfiguration().orientation;
       u0 ou0 = new u0(ta);
       ta.D = ou0;
       p0.i3(ou0);
    }
}
