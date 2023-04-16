package bfb.i;
import erd.g;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.message.newgroup.manage.krn.IMGroupSettingBridge;

public final class i implements g	// class@0003b1
{
    public final Promise b;

    public void i(Promise p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       IMGroupSettingBridge.lambda$getGroupMemberInfoByCount$3(this.b, p0);
    }
}
