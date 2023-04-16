package bc3.h;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class h	// class@000376
{

    public void h(){
       super();
    }
    public static CDNUrl[] a(LiveCdnNodeView[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       if (p0 == null || !p0.length) {
          CDNUrl[] uCDNUrlArray = new CDNUrl[i];
          return uCDNUrlArray;
       }else {
          CDNUrl[] uCDNUrlArray1 = new CDNUrl[p0.length];
          for (; i < p0.length; i = i + 1) {
             uCDNUrlArray1[i] = new CDNUrl(p0[i].cdn, p0[i].url);
          }
          return uCDNUrlArray1;
       }
    }
}
