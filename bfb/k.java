package bfb.k;
import erd.g;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.message.newgroup.manage.krn.IMGroupSettingBridge;

public final class k implements g	// class@0003b3
{
    public final Promise b;

    public void k(Promise p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       IMGroupSettingBridge.lambda$getJoinRequestInGroup$15(this.b, p0);
    }
}
