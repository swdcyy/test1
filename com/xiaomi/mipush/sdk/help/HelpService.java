package com.xiaomi.mipush.sdk.help.HelpService;
import android.app.IntentService;
import java.lang.String;
import android.content.Intent;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Context;
import android.net.Uri;
import vs8.r0;

public class HelpService extends IntentService	// class@0010f3
{

    public void HelpService(){
       super("intentService");
    }
    public void onHandleIntent(Intent p0){
       if (!TextUtils.isEmpty(p0.getStringExtra("awake_info"))) {
          r0.a(this, p0, null);
       }
       return;
    }
}
