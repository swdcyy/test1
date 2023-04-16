package bj3.b;
import ok.h;
import java.lang.Object;
import com.kuaishou.android.model.mix.LivePlaybackMeta;
import java.lang.Long;

public final class b implements h	// class@0003d8
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object apply(Object p0){
       LivePlaybackMeta mStartTime = (p0 != null)? p0.mStartTime: 0;
       return Long.valueOf(mStartTime);
    }
}
