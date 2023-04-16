package hd9.a0;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.yxcorp.gifshow.camera.record.followshoot.d;
import java.lang.Object;
import oh9.o0;
import com.yxcorp.gifshow.camera.record.followshoot.f;

public final class a0 implements b$a	// class@002604
{
    public final d a;

    public void a0(d p0){
       this.a = p0;
    }
    public final Object getData(){
       a0 ta = this.a;
       long l = (ta.w != null)? (long)(int)ta.w.getDuration(): 0;
       return new o0(l, 3);
    }
}
