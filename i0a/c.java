package i0a.c;
import java.lang.Runnable;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import java.lang.Object;
import k2b.u1;

public final class c implements Runnable	// class@002746
{
    public final ShowMetaData b;

    public void c(ShowMetaData p0){
       this.b = p0;
    }
    public final void run(){
       u1.B0(this.b);
    }
}
