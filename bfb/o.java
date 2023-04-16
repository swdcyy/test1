package bfb.o;
import erd.g;
import com.yxcorp.gifshow.message.newgroup.manage.krn.IMGroupSettingBridge;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import sv5.d;

public final class o implements g	// class@0003b7
{
    public final IMGroupSettingBridge b;
    public final Promise c;

    public void o(IMGroupSettingBridge p0,Promise p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       IMGroupSettingBridge.e(this.b, this.c, p0);
    }
}
