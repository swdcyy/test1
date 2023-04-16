package bj3.d;
import ok.h;
import java.lang.Object;
import com.kuaishou.android.model.mix.LivePlaybackMeta;
import java.lang.Long;

public final class d implements h	// class@0003da
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object apply(Object p0){
       LivePlaybackMeta mLiveStartTi = (p0 != null)? p0.mLiveStartTime: 0;
       return Long.valueOf(mLiveStartTi);
    }
}
