package com.vivo.push.ups.c;
import com.vivo.push.IPushActionListener;
import com.vivo.push.ups.VUpsManager;
import com.vivo.push.ups.UPSTurnCallback;
import java.lang.Object;
import com.vivo.push.ups.CodeResult;
import com.vivo.push.ups.ICallbackResult;

public final class c implements IPushActionListener	// class@0010a6
{
    public final UPSTurnCallback a;
    public final VUpsManager b;

    public void c(VUpsManager p0,UPSTurnCallback p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void onStateChanged(int p0){
       this.a.onResult(new CodeResult(p0));
    }
}
