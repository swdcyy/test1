package bfb.h;
import erd.g;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.message.newgroup.manage.krn.IMGroupSettingBridge;

public final class h implements g	// class@0003b0
{
    public final Promise b;

    public void h(Promise p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       IMGroupSettingBridge.lambda$commitGroupNotice$1(this.b, p0);
    }
}
