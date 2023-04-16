package kg9.a;
import android.os.MessageQueue$IdleHandler;
import kg9.f;
import java.lang.Object;
import java.util.Objects;
import lq.i;
import lq.a;
import brd.t;
import kg9.c;
import kg9.d;
import io.reactivex.internal.functions.Functions;
import kg9.e;
import erd.g;
import erd.a;
import crd.b;
import com.yxcorp.gifshow.camera.record.base.d;

public final class a implements MessageQueue$IdleHandler	// class@002c84
{
    public final f a;

    public void a(f p0){
       this.a = p0;
    }
    public final boolean queueIdle(){
       a ta = this.a;
       Objects.requireNonNull(ta);
       ta.Y1(i.m().p().init().subscribe(c.b, d.b, Functions.c, e.b));
       return false;
    }
}
