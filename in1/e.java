package in1.e;
import com.kwai.video.waynelive.listeners.LivePlayerErrorListener;
import in1.c;
import java.lang.Object;

public final class e implements LivePlayerErrorListener	// class@002962
{
    public final c a;

    public void e(c p0){
       this.a = p0;
       super();
    }
    public final boolean onError(int p0,int p1){
       return this.a.h;
    }
}
