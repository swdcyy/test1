package bp6.h2;
import bp6.c;
import java.lang.Object;
import ip6.a;
import com.kwai.imsdk.msg.KwaiMsg;
import bp6.g2;
import com.kwai.imsdk.d;

public class h2 implements c	// class@000525
{

    public void h2(){
       super();
    }
    public KwaiMsg a(a p0){
       return g2.a(p0);
    }
    public boolean b(d p0){
       if (p0 != null && (p0.getTargetType() && (p0.getTargetType() != 4 && (p0.getTargetType() == 6 || p0.getTargetType() == 8)))) {
          return true;
       }
       return false;
    }
}
