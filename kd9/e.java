package kd9.e;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.frame.c;
import java.lang.Object;

public final class e implements Runnable	// class@002c4e
{
    public final c b;

    public void e(c p0){
       this.b = p0;
    }
    public final void run(){
       e tb = this.b;
       tb.i2(tb.K);
       tb.K = 0;
    }
}
