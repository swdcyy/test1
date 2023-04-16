package com.vivo.push.ups.a;
import com.vivo.push.IPushActionListener;
import com.vivo.push.ups.VUpsManager;
import com.vivo.push.ups.UPSRegisterCallback;
import android.content.Context;
import java.lang.Object;
import com.vivo.push.ups.TokenResult;
import com.vivo.push.PushClient;
import java.lang.String;
import com.vivo.push.ups.ICallbackResult;

public final class a implements IPushActionListener	// class@0010a4
{
    public final UPSRegisterCallback a;
    public final Context b;
    public final VUpsManager c;

    public void a(VUpsManager p0,UPSRegisterCallback p1,Context p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public final void onStateChanged(int p0){
       this.a.onResult(new TokenResult(p0, PushClient.getInstance(this.b).getRegId()));
    }
}
