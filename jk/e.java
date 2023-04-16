package jk.e;
import java.lang.Runnable;
import com.google.android.material.tabs.b;
import com.kwai.library.widget.popup.bubble.a$c;
import sn5.g;
import java.lang.Object;

public final class e implements Runnable	// class@002420
{
    public final b b;
    public final a$c c;
    public final g d;
    public final boolean e;

    public void e(b p0,a$c p1,g p2,boolean p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       b.b(this.b, this.c, this.d, this.e);
    }
}
