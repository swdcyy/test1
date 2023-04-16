package af5.g;
import p1a.a$a;
import af5.f;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;

public class g extends a$a	// class@000097
{
    public final QPhoto x;
    public final int y;
    public final f z;

    public void g(f p0,int p1,int p2,String p3,QPhoto p4,int p5){
       this.z = p0;
       this.x = p4;
       this.y = p5;
       super(p1, p2, p3);
    }
    public ClientContent$ContentPackage d(ClientContent$ContentPackage p0){
       ClientContent$PhotoPackage obj = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = w1.f(this.x.mEntity);
       int i = 1;
       obj.index = (long)(this.y + i);
       if (this.x.isMoodType()) {
          obj.type = 9;
       }else if(this.x.isLiveStream()){
          i = 2;
       }
       obj.type = i;
       return p0;
    }
}
