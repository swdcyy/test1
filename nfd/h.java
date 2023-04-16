package nfd.h;
import nfd.i;
import android.content.Context;
import java.lang.Object;
import android.view.ViewConfiguration;

public final class h implements i	// class@001db6
{
    public int b;
    public int c;
    public int d;
    public final int e;

    public void h(Context p0){
       super();
       this.d = 0;
       this.e = ViewConfiguration.get(p0).getScaledTouchSlop();
    }
    public void setFixScrollDirection(int p0){
       this.d = p0;
    }
}
