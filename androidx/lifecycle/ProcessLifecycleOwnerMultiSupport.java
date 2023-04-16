package androidx.lifecycle.ProcessLifecycleOwnerMultiSupport;
import java.lang.Object;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import androidx.lifecycle.LifecycleDispatcher;
import androidx.lifecycle.ProcessLifecycleOwner;

public class ProcessLifecycleOwnerMultiSupport	// class@0007ef
{

    public void ProcessLifecycleOwnerMultiSupport(){
       super();
    }
    public static void init(Application p0){
       if (SystemUtil.L(p0)) {
          return;
       }
       LifecycleDispatcher.init(p0);
       ProcessLifecycleOwner.init(p0);
       return;
    }
}
