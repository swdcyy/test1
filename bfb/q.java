package bfb.q;
import javax.inject.Provider;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import com.yxcorp.gifshow.message.newgroup.manage.krn.IMGroupSettingBridge;

public final class q implements Provider	// class@0003b9
{
    public final ReactApplicationContext a;

    public void q(ReactApplicationContext p0){
       this.a = p0;
    }
    public final Object get(){
       return new IMGroupSettingBridge(this.a);
    }
}
