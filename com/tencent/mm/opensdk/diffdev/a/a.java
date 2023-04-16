package com.tencent.mm.opensdk.diffdev.a.a;
import com.tencent.mm.opensdk.diffdev.IDiffDevOAuth;
import java.lang.Object;
import java.util.ArrayList;
import com.tencent.mm.opensdk.diffdev.a.a$a;
import com.tencent.mm.opensdk.diffdev.a.b;
import java.util.List;
import android.os.Handler;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import java.lang.String;
import java.lang.StringBuilder;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Looper;
import android.os.AsyncTask;
import java.lang.Void;
import java.util.concurrent.Executor;
import java.lang.Exception;

public class a implements IDiffDevOAuth	// class@000e7e
{
    public Handler a;
    public List b;
    public b c;
    public OAuthListener d;

    public void a(){
       super();
       this.a = null;
       this.b = new ArrayList();
       this.d = new a$a(this);
    }
    public static b a(a p0,b p1){
       p0.c = p1;
       return p1;
    }
    public static List a(a p0){
       return p0.b;
    }
    public static Handler b(a p0){
       return p0.a;
    }
    public void addListener(OAuthListener p0){
       if (!this.b.contains(p0)) {
          this.b.add(p0);
       }
       return;
    }
    public boolean auth(String p0,String p1,String p2,String p3,String p4,OAuthListener p5){
       a uoa = this;
       object oobject = p0;
       Object[] obj = p5;
       String str = "MicroMsg.SDK.DiffDevOAuth";
       Log.i(str, "start auth, appId = "+p0);
       if (oobject && (p0.length() > 0 && (p1 == null || p1.length() <= 0))) {
          obj = new Object[]{oobject,p1};
          Log.d(str, String.format("auth fail, invalid argument, appId = %s, scope = %s", obj));
          return 0;
       }else if(uoa.a == null){
          uoa.a = new Handler(Looper.getMainLooper());
       }
       if (!uoa.b.contains(obj)) {
          uoa.b.add(obj);
       }
       if (uoa.c != null) {
          Log.d(str, "auth, already running, no need to start auth again");
          return 1;
       }else {
          b uob = new b(p0, p1, p2, p3, p4, uoa.d);
          uoa.c = v10;
          Void[] voidArray = new Void[0];
          v10.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, voidArray);
          return 1;
       }
    }
    public void detach(){
       Log.i("MicroMsg.SDK.DiffDevOAuth", "detach");
       this.b.clear();
       this.stopAuth();
    }
    public void removeAllListeners(){
       this.b.clear();
    }
    public void removeListener(OAuthListener p0){
       this.b.remove(p0);
    }
    public boolean stopAuth(){
       boolean b;
       String str = "MicroMsg.SDK.DiffDevOAuth";
       String str1 = "stopAuth";
       try{
          Log.i(str, str1);
          a tc = this.c;
          b = (tc == null)? true: tc.a();
       }catch(java.lang.Exception e1){
          Log.w(str, "stopAuth fail, ex = "+e1.getMessage());
          b = false;
       }
       this.c = null;
       return b;
    }
}
