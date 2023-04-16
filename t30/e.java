package t30.e;
import android.database.ContentObserver;
import java.util.List;
import android.os.Handler;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Iterator;
import com.kuaishou.dfp.cloudid.bridge.DfpBridgeCallBack;

public class e extends ContentObserver	// class@00245c
{
    public List a;

    public void e(List p0){
       super(new Handler());
       this.a = p0;
    }
    public void onChange(boolean p0){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, e.class, "1")) {
          return;
       }
       e ta = this.a;
       if (ta != null) {
          Iterator iterator = ta.iterator();
          while (iterator.hasNext()) {
             iterator.next().receiveMessage("");
          }
       }
       return;
    }
}
