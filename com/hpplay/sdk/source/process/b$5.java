package com.hpplay.sdk.source.process.b$5;
import com.hpplay.sdk.source.browse.api.IAPICallbackListener;
import com.hpplay.sdk.source.process.b;
import java.lang.Object;
import com.hpplay.sdk.source.e;
import java.util.List;
import java.lang.String;
import java.lang.Throwable;
import com.hpplay.sdk.source.a.a;

public class b$5 implements IAPICallbackListener	// class@000694
{
    public final b a;

    public void b$5(b p0){
       this.a = p0;
       super();
    }
    public void onResult(int p0,Object p1){
       try{
          b.i(this.a).onResult(p0, p1);
       }catch(java.lang.Exception e2){
          a.b("LelinkSdkManager", e2);
       }
       return;
    }
}
