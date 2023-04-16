package com.kuaishou.godzilla.idc.KwaiDefaultIDCSpeedTestRequestGenerator;
import com.kuaishou.godzilla.idc.KwaiSpeedTestRequestGenerator;
import java.lang.String;
import okhttp3.OkHttpClient$Builder;
import okhttp3.OkHttpClient;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.godzilla.idc.KwaiSpeedTestRequest;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.TimeUnit;
import java.lang.StringBuilder;
import com.kuaishou.godzilla.idc.KwaiDefaultIDCSpeedTestRequest;

public class KwaiDefaultIDCSpeedTestRequestGenerator implements KwaiSpeedTestRequestGenerator	// class@000894
{
    public OkHttpClient mClient;
    public String mPath;

    public void KwaiDefaultIDCSpeedTestRequestGenerator(String p0){
       super(new OkHttpClient$Builder().build(), p0);
    }
    public void KwaiDefaultIDCSpeedTestRequestGenerator(OkHttpClient p0,String p1){
       super();
       this.mClient = p0;
       this.mPath = (TextUtils.isEmpty(p1))? "/": p1;
       return;
    }
    public KwaiSpeedTestRequest createTestRequest(String p0,long p1){
       KwaiDefaultIDCSpeedTestRequestGenerator kwaiDefaultI = KwaiDefaultIDCSpeedTestRequestGenerator.class;
       if (PatchProxy.isSupport(kwaiDefaultI)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, kwaiDefaultI, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (TextUtils.isEmpty(p0) || p1 - null <= 0) {
          return null;
       }else if((long)this.mClient.connectTimeoutMillis() - p1){
          this.mClient = this.mClient.newBuilder().connectTimeout(p1, TimeUnit.MILLISECONDS).build();
       }
       return new KwaiDefaultIDCSpeedTestRequest(this.mClient, p0+this.getRequestPath());
    }
    public String getRequestPath(){
       return this.mPath;
    }
}
