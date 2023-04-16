package g33.f;
import java.lang.Runnable;
import com.kuaishou.live.external.p;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import os5.l;

public final class f implements Runnable	// class@002a50
{
    public final p b;
    public final GifshowActivity c;

    public void f(p p0,GifshowActivity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.n().EQ(this.c);
    }
}
