package bfb.n;
import erd.g;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.message.newgroup.manage.krn.IMGroupSettingBridge;

public final class n implements g	// class@0003b6
{
    public final Promise b;

    public void n(Promise p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       IMGroupSettingBridge.lambda$setGroupMuteAll$11(this.b, p0);
    }
}
