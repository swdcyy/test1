package c2a.a;
import j85.e;
import com.yxcorp.gifshow.detail.network.feedback.init.NetworkDetectorInitModule;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import com.yxcorp.gifshow.detail.network.feedback.log.a;
import java.lang.StringBuilder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.nio.charset.Charset;
import fg6.a;
import com.kwai.library.network.detector.model.NetworkDetectConfig;
import com.google.gson.Gson;
import java.lang.Exception;
import yb6.d;
import wkd.b;
import by6.e;
import c2a.b;
import by6.e$b;

public final class a implements e	// class@00053c
{
    public final NetworkDetectorInitModule a;

    public void a(NetworkDetectorInitModule p0){
       this.a = p0;
    }
    public final void onSignalReceive(String p0,String p1,byte[] p2){
       NetworkDetectConfig networkDetec;
       a ta = this.a;
       Objects.requireNonNull(ta);
       a.a("initModule onSignalReceive");
       if (p2 != null) {
          a.a("initModule onSignalReceive extra:"+p2.length);
          if (!PatchProxy.applyVoidOneRefs(p2, ta, NetworkDetectorInitModule.class, "4")) {
             int i = 0;
             try{
                networkDetec = a.a.h(new String(p2, NetworkDetectorInitModule.q), NetworkDetectConfig.class);
             }catch(java.lang.Exception e7){
                e7.printStackTrace();
             }
             if (networkDetec == null) {
                a.a("initModule networkDetectConfig == null");
             }else {
                a.a("initModule NetworkDetectConfig id:"+networkDetec.id+" mode:"+networkDetec.mMode+" createTime:"+networkDetec.mCreateTimestamp+" expiredTime"+networkDetec.mExpiredTimestamp);
                if (networkDetec.mExpiredTimestamp - d.a() <= 0) {
                   a.a("initModule NetworkDetectConfig expired serverTime:"+d.a());
                }else {
                   b.a(0x2e66f141).a(networkDetec, new b(ta));
                }
             }
          }
       }
       return;
    }
}
