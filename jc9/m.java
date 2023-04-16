package jc9.m;
import java.lang.Runnable;
import jc9.b0;
import lc9.b;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.b;

public final class m implements Runnable	// class@002945
{
    public final b0 b;
    public final b c;

    public void m(b0 p0,b p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.c.f(this.b.f);
    }
}
