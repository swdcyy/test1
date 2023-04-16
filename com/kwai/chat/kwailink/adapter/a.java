package com.kwai.chat.kwailink.adapter.a;
import com.kwai.chat.kwailink.adapter.p$a;
import java.lang.Object;
import android.content.Intent;
import com.kwai.chat.kwailink.adapter.p;
import java.lang.String;
import android.os.SystemClock;
import com.kwai.chat.kwailink.log.a;

public final class a implements p$a	// class@000a07
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final Intent run(){
       Intent intent = new Intent("com.kwai.chat.kwailink.ACTION_LINK_SERVICE_CREATED");
       intent.putExtra("extra_act_time", SystemClock.elapsedRealtime());
       a.e("CallbackUtils", "callbackServiceCreated by broadcast");
       return intent;
    }
}
