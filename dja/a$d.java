package dja.a$d;
import z0.a;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.CDNUrl;
import h8c.a;
import java.lang.StringBuilder;
import java.lang.Integer;
import q87.c;

public final class a$d implements a	// class@0024b9
{
    public static final a$d a;

    static {
       a$d.a = new a$d();
    }
    public void a$d(){
       super();
    }
    public Object apply(Object p0){
       CDNUrl[] uCDNUrlArray = PatchProxy.applyOneRefs(p0, this, a$d.class, "1");
       if (uCDNUrlArray != PatchProxyResult.class) {
       }else {
          a uoa = a.C();
          StringBuilder str = "switch mockFeedThumbnail{postWorkId:";
          Integer integer = (p0 != null)? Integer.valueOf(p0.getPostWorkInfoId()): null;
          Object[] objArray = new Object[0];
          uoa.w("MockFeedViewModel", str+integer+'}', objArray);
          if (p0 != null) {
             uCDNUrlArray = p0.getCoverThumbnailUrls();
          }else {
             uCDNUrlArray = null;
          }
       }
       return uCDNUrlArray;
    }
}
