package l69.u;
import java.lang.Object;
import java.lang.String;
import boc.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.util.resource.Category;
import boc.e;
import java.io.File;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.resource.p;

public final class u	// class@002cad
{
    public static final u a;

    static {
       u.a = new u();
    }
    public void u(){
       super();
    }
    public final b a(String p0){
       MagicModel l;
       Object obj = PatchProxy.applyOneRefs(p0, this, u.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       switch (p0.hashCode()){
           case 0x88283092:
             if (p0.equals("CATEGORY_FACE_ATTR")) {
                l = e.l;
             }else {
             label_0043 :
                l = null;
             }
             break;
           case 0xbd11ae4d:
             if (p0.equals("CATEGORY_YCNN_LAND_MARK")) {
                l = e.c;
             }else {
                goto label_0043 ;
             }
             break;
           case 0xbdf494a:
             if (p0.equals("CATEGORY_MAGIC_YCNN_SCENE")) {
                l = e.A;
             }else {
                goto label_0043 ;
             }
             break;
           case 0x77b58011:
             if (p0.equals("CATEGORY_VOICE_DETECT")) {
                l = Category.VOICE_DETECT;
             }else {
                goto label_0043 ;
             }
             break;
           default:
             goto label_0043 ;
       }
       return l;
    }
    public final File b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, u.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "category");
       b uob = this.a(p0);
       if (uob == null || !p.h(uob)) {
          return null;
       }
       File uFile = (uob == Category.VOICE_DETECT)? p.d(uob, uob.getResourceName()): new File(uob.getResourceDir());
       return uFile;
    }
}
