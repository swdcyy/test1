package bfb.f;
import erd.g;
import com.yxcorp.gifshow.message.newgroup.manage.krn.IMGroupSettingBridge;
import com.facebook.react.bridge.Promise;
import java.lang.Object;

public final class f implements g	// class@0003ae
{
    public final IMGroupSettingBridge b;
    public final Promise c;

    public void f(IMGroupSettingBridge p0,Promise p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       IMGroupSettingBridge.f(this.b, this.c, p0);
    }
}
