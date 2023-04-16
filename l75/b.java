package l75.b;
import com.kwai.chat.kwailink.adapter.p$a;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import java.lang.StringBuilder;
import com.kwai.chat.kwailink.log.a;

public final class b implements p$a	// class@001d4f
{
    public final int a;
    public final int b;

    public void b(int p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Intent run(){
       b ta = this.a;
       b tb = this.b;
       Intent intent = new Intent("com.kwai.chat.kwailink.ACTION_SESSION_MANAGER_STATE_CHANGED");
       intent.putExtra("extra_old_state", ta);
       intent.putExtra("extra_new_state", tb);
       StringBuilder str = "callbackConnectStateChanged by broadcast, oldState="+ta;
       a.e("CallbackUtils", str+", newState="+tb);
       return intent;
    }
}
