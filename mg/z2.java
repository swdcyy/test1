package mg.z2;
import java.lang.Runnable;
import com.kwai.feature.post.api.feature.bridge.JsUploadCurrentDraftParams;
import f55.g;
import java.lang.Object;
import og.l;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import r16.d;
import java.lang.Class;
import lnc.x6;
import lnc.y6;
import android.os.Bundle;
import ln.b;
import com.kwai.feature.post.api.feature.bridge.TokenInfo;
import java.util.Iterator;
import java.util.List;
import com.kwai.feature.post.api.feature.upload.model.ServerInfo;
import java.util.ArrayList;
import ln.b$a;
import brd.t;
import mg.j0;
import mg.k0;
import erd.g;
import crd.b;

public final class z2 implements Runnable	// class@002684
{
    public final JsUploadCurrentDraftParams b;
    public final g c;

    public void z2(JsUploadCurrentDraftParams p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       z2 tb = this.b;
       z2 tc = this.c;
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "JsGrowthBridgeFuns";
       l.D().w(str, "uploadCurrentDraftFile\(\)  "+tb, objArray);
       Bundle uBundle = null;
       if (tb == null || !tb.isValid()) {
          if (tc != null) {
             tc.a(0x1e84f, "wrong params ", uBundle);
          }
       }else {
          d uod = y6.r(d.class);
          if (uod == null) {
             Object[] objArray1 = new Object[i];
             l.D().A(str, "uploadCurrentDraftFile\(\) download plugin failed", objArray1);
             if (tc != null) {
                tc.a(0x4e21, "download plugin failed", uBundle);
             }
          }else {
             b uob = new b();
             Iterator iterator = tb.mTokenInfo.mEndpointList.iterator();
             while (iterator.hasNext()) {
                ServerInfo serverInfo = iterator.next();
                ArrayList uArrayList = new ArrayList();
                uob.d = uArrayList;
                uArrayList.add(new b$a(serverInfo.mHost, serverInfo.mPort, serverInfo.mProtocol));
             }
             uob.a = tb.mTokenInfo.mToken;
             uod.ch(tb.mUploadKey, uob, tb.mKey).subscribe(new j0(tc), new k0(tc));
          }
       }
       return;
    }
}
