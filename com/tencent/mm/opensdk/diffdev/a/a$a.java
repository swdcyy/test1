package com.tencent.mm.opensdk.diffdev.a.a$a;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.diffdev.a.a;
import java.lang.Object;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.diffdev.a.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.lang.StringBuilder;
import android.os.Handler;
import com.tencent.mm.opensdk.diffdev.a.a$a$a;
import java.lang.Runnable;

public class a$a implements OAuthListener	// class@000e7d
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void onAuthFinish(OAuthErrCode p0,String p1){
       Object[] objArray = new Object[]{p0.toString(),p1};
       Log.d("MicroMsg.SDK.ListenerWrapper", String.format("onAuthFinish, errCode = %s, authCode = %s", objArray));
       a.a(this.a, null);
       ArrayList uArrayList = new ArrayList();
       uArrayList.addAll(a.a(this.a));
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          iterator.next().onAuthFinish(p0, p1);
       }
       return;
    }
    public void onAuthGotQrcode(String p0,byte[] p1){
       Log.d("MicroMsg.SDK.ListenerWrapper", "onAuthGotQrcode, qrcodeImgPath = "+p0);
       ArrayList uArrayList = new ArrayList();
       uArrayList.addAll(a.a(this.a));
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          iterator.next().onAuthGotQrcode(p0, p1);
       }
       return;
    }
    public void onQrcodeScanned(){
       Log.d("MicroMsg.SDK.ListenerWrapper", "onQrcodeScanned");
       if (a.b(this.a) != null) {
          a.b(this.a).post(new a$a$a(this));
       }
       return;
    }
}
