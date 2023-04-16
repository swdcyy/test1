package b5d.b;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MusicLoadingStatusPackage;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.TextUtils;

public class b	// class@0003a5
{
    public ClientContent$MusicLoadingStatusPackage a;
    public long b;
    public int c;

    public void b(){
       super();
       this.b = 0;
       this.c = 0;
    }
    public void a(boolean p0){
       b ta = this.a;
       if (ta == null) {
          return;
       }
       int i = (p0)? 2: 1;
       ta.musicFileType = i;
       return;
    }
    public void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "3")) {
          return;
       }
       b ta = this.a;
       if (ta == null) {
          return;
       }
       ta.downloadUrl = TextUtils.k(p0);
       p0.musicLoadingMode = p1;
       return;
    }
}
