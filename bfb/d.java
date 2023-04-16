package bfb.d;
import erd.g;
import com.yxcorp.gifshow.message.newgroup.manage.krn.IMGroupSettingBridge;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Boolean;

public final class d implements g	// class@0003ac
{
    public final IMGroupSettingBridge b;
    public final Promise c;

    public void d(IMGroupSettingBridge p0,Promise p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       IMGroupSettingBridge.d(this.b, this.c, p0);
    }
}
