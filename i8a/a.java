package i8a.a;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Throwable;
import kotlin.jvm.internal.a;
import uw9.o;
import q87.c;
import i8a.a$a;
import i8a.a$b;
import java.lang.Runnable;
import t45.c;

public final class a	// class@0027c0
{
    public static final boolean a;
    public static final a b;

    static {
       a.b = new a();
       a.a = a.t().d("enableCaptionUploadLog", false);
    }
    public void a(){
       super();
    }
    public static final String a(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Photo{user="+p0.getUserName()+",id="+p0.getPhotoId()+",caption="+p0.getCaption()+'}';
    }
    public static final void b(String p0,QPhoto p1,String p2,Throwable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, a.class, "3")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p2, "msg");
       a.p(p3, "e");
       o oo = o.C();
       p0 = "][";
       StringBuilder str = '['+p0+p0;
       String str1 = (p1 != null)? a.a(p1): null;
       oo.e("CaptionLogger", str+str1+p0+p2+']', p3);
       return;
    }
    public static final void c(String p0,QPhoto p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "2")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p2, "msg");
       o oo = o.C();
       p0 = "][";
       StringBuilder str = '['+p0+p0;
       String str1 = (p1 != null)? a.a(p1): null;
       Object[] objArray = new Object[0];
       oo.w("CaptionLogger", str+str1+p0+p2+']', objArray);
       return;
    }
    public static final void d(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "4")) {
          return;
       }
       a.p(p0, "info");
       if (!a.a) {
          return;
       }
       c.a(new a$b(p0));
       return;
    }
}
