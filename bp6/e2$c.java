package bp6.e2$c;
import bp6.e2$e;
import java.lang.Object;
import com.kwai.imsdk.msg.KwaiMsg;
import java.lang.Class;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;

public class e2$c implements e2$e	// class@000512
{

    public void e2$c(){
       super();
    }
    public boolean equals(Object p0,Object p1){
       boolean b = true;
       if (p0 == p1) {
       }else if(p0 != null && (p1 == null || (p0.getClass().equals(p1.getClass()) && (p0.getTargetType() == p1.getTargetType() && (TextUtils.equals(p0.getTarget(), p1.getTarget()) && (TextUtils.equals(p0.getSender(), p1.getSender()) && !p0.getClientSeq() - p1.getClientSeq())))))){
          b = false;
       }
       return b;
    }
}
