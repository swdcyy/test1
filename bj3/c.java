package bj3.c;
import ok.h;
import java.lang.Object;
import com.kuaishou.android.model.mix.LivePlaybackMeta;
import java.lang.Long;

public final class c implements h	// class@0003d9
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object apply(Object p0){
       LivePlaybackMeta mLiveStartTi = (p0 != null)? p0.mLiveStartTime: 0;
       return Long.valueOf(mLiveStartTi);
    }
}
