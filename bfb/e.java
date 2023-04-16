package bfb.e;
import erd.g;
import com.yxcorp.gifshow.message.newgroup.manage.krn.IMGroupSettingBridge;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Boolean;

public final class e implements g	// class@0003ad
{
    public final IMGroupSettingBridge b;
    public final Promise c;

    public void e(IMGroupSettingBridge p0,Promise p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       IMGroupSettingBridge.g(this.b, this.c, p0);
    }
}
