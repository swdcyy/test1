package l75.f;
import com.kwai.chat.kwailink.adapter.p$a;
import java.lang.String;
import java.lang.Object;
import android.content.Intent;
import java.lang.StringBuilder;
import com.kwai.chat.kwailink.log.a;

public final class f implements p$a	// class@001d52
{
    public final String a;

    public void f(String p0){
       this.a = p0;
    }
    public final Intent run(){
       f ta = this.a;
       Intent intent = new Intent("com.kwai.chat.kwailink.ACTION_PUSH_TOKEN_READY");
       intent.putExtra("extra_data", ta);
       a.e("CallbackUtils", "callbackPushTokenReady by broadcast, pushToken="+ta);
       return intent;
    }
}
