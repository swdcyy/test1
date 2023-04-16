package com.vivo.push.ups.b;
import com.vivo.push.IPushActionListener;
import com.vivo.push.ups.VUpsManager;
import com.vivo.push.ups.UPSRegisterCallback;
import java.lang.Object;
import com.vivo.push.ups.TokenResult;
import java.lang.String;
import com.vivo.push.ups.ICallbackResult;

public final class b implements IPushActionListener	// class@0010a5
{
    public final UPSRegisterCallback a;
    public final VUpsManager b;

    public void b(VUpsManager p0,UPSRegisterCallback p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void onStateChanged(int p0){
       this.a.onResult(new TokenResult(p0, ""));
    }
}
