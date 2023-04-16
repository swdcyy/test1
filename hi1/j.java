package hi1.j;
import ok.h;
import java.lang.Object;
import java.lang.String;
import hi1.u;
import android.util.Base64;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;

public final class j implements h	// class@0026dc
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public final Object apply(Object p0){
       int i = 0;
       try{
          p0 = LiveCommonEffectInfo.parseFrom(Base64.decode(p0, i));
       }catch(java.lang.Exception e0){
          p0 = null;
       }
       return p0;
    }
}
