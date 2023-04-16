package hg9.a0;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.yxcorp.gifshow.camera.record.photo.m;
import java.lang.Object;
import java.util.Objects;
import hg9.u;

public final class a0 implements b$a	// class@00264a
{
    public final m a;

    public void a0(m p0){
       this.a = p0;
    }
    public final Object getData(){
       a0 ta = this.a;
       Objects.requireNonNull(ta);
       return new u(ta.c1());
    }
}
