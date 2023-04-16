package bfb.a;
import erd.g;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.message.newgroup.manage.krn.IMGroupSettingBridge;

public final class a implements g	// class@0003a9
{
    public final Promise b;

    public void a(Promise p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       IMGroupSettingBridge.lambda$addGroupManagers$7(this.b, p0);
    }
}
