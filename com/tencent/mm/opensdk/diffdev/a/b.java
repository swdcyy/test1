package com.tencent.mm.opensdk.diffdev.a.b;
import android.os.AsyncTask;
import java.lang.String;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import java.lang.Object;
import java.lang.Void;
import java.lang.Thread;
import java.lang.System;
import com.tencent.mm.opensdk.channel.a.a;
import java.lang.Long;
import com.tencent.mm.opensdk.diffdev.a.b$a;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import java.lang.StringBuilder;
import com.tencent.mm.opensdk.diffdev.a.c;
import java.util.concurrent.Executor;

public class b extends AsyncTask	// class@000e80
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public OAuthListener f;
    public c g;

    public void b(String p0,String p1,String p2,String p3,String p4,OAuthListener p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public boolean a(){
       Log.i("MicroMsg.SDK.GetQRCodeTask", "cancelTask");
       b tg = this.g;
       if (tg == null) {
          return this.cancel(true);
       }
       return tg.cancel(true);
    }
    public Object doInBackground(Object[] p0){
       Thread.currentThread().setName("OpenSdkGetQRCodeTask");
       Log.i("MicroMsg.SDK.GetQRCodeTask", "doInBackground");
       Object[] objArray = new Object[]{this.a,this.c,this.d,this.b,this.e};
       String str = String.format("https://open.weixin.qq.com/connect/sdk/qrconnect?appid=%s&noncestr=%s&timestamp=%s&scope=%s&signature=%s", objArray);
       byte[] uobyteArray = a.a(str, 0xea60);
       Object[] objArray1 = new Object[]{str,Long.valueOf((System.currentTimeMillis() - System.currentTimeMillis()))};
       Log.d("MicroMsg.SDK.GetQRCodeTask", String.format("doInBackground, url = %s, time consumed = %d\(ms\)", objArray1));
       return b$a.a(uobyteArray);
    }
    public void onPostExecute(Object p0){
       b$a a = p0.a;
       String str = "MicroMsg.SDK.GetQRCodeTask";
       if (a == OAuthErrCode.WechatAuth_Err_OK) {
          Log.d(str, "onPostExecute, get qrcode success imgBufSize = "+p0.e.length);
          this.f.onAuthGotQrcode(p0.d, p0.e);
          c uoc = new c(p0.b, this.f);
          this.g = uoc;
          Void[] voidArray = new Void[0];
          uoc.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, voidArray);
       }else {
          Object[] objArray = new Object[]{a};
          Log.e(str, String.format("onPostExecute, get qrcode fail, OAuthErrCode = %s", objArray));
          this.f.onAuthFinish(p0.a, null);
       }
       return;
    }
}
