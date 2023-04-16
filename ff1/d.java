package ff1.d;
import ok.o;
import java.lang.Object;
import df1.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import df1.f;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import java.lang.CharSequence;
import android.text.TextUtils;

public class d implements o	// class@00231a
{

    public void d(){
       super();
    }
    public boolean apply(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!p0 instanceof f){
          p0 = a.a(p0.c.giftId);
          if (p0 == null || TextUtils.isEmpty(p0.mName)) {
             b = false;
          }
       }
       b = true;
       return b;
    }
}
