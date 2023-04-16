package i02.e;
import erd.g;
import i02.f;
import java.lang.Object;
import wca.n;

public final class e implements g	// class@0027ed
{
    public final f b;

    public void e(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.onEventMainThread(p0);
    }
}
