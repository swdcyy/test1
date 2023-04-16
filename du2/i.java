package du2.i;
import y8c.g;
import du2.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import java.lang.String;
import java.lang.Object;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.voiceparty.online.userlist.a;
import ml8.c;

public class i extends g	// class@0025a5
{
    public e0 A;
    public g w;
    public boolean x;
    public ClientContent$LiveVoicePartyPackageV2 y;
    public ClientContent$LiveStreamPackage z;

    public void i(boolean p0,g p1,ClientContent$LiveStreamPackage p2,ClientContent$LiveVoicePartyPackageV2 p3,e0 p4){
       super();
       this.w = p1;
       this.n1("ADAPTER", this);
       this.x = p0;
       this.z = p2;
       this.y = p3;
       this.A = p4;
    }
    public f h1(ViewGroup p0,int p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oi, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a uoa = new a(this.x, this.w, this.z, this.y, this.A);
       return new f(a.i(p0, 0x7f0d0e50), v6);
    }
}
