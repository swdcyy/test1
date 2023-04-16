package mk0.d;
import java.lang.Runnable;
import com.kuaishou.krn.widget.react.KrnReactRootView;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.util.Objects;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.Class;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.ReactRootView;

public final class d implements Runnable	// class@00318f
{
    public final KrnReactRootView b;
    public final ReactContext c;

    public void d(KrnReactRootView p0,ReactContext p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       d tb = this.b;
       Objects.requireNonNull(tb);
       UIManagerModule nativeModule = this.c.getNativeModule(UIManagerModule.class);
       if (nativeModule != null) {
          nativeModule.removeRootViewByNative(tb.getRootViewTag());
       }
       return;
    }
}
