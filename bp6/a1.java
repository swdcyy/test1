package bp6.a1;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kwai.chat.sdk.signal.f;
import com.kwai.chat.sdk.signal.ClientUserInfo;

public final class a1 implements Runnable	// class@0004ff
{
    public final String b;
    public final String c;

    public void a1(String p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       f.e().c().j(this.b);
       f.e().c().i(this.c);
    }
}
