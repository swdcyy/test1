package c42.l;
import java.lang.Runnable;
import c42.m;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;

public final class l implements Runnable	// class@0004bc
{
    public final m b;
    public final QPhoto c;

    public void l(m p0,QPhoto p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.Y8(this.c, true);
    }
}
