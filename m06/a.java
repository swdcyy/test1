package m06.a;
import v79.c;
import com.kwai.feature.platform.misc.albumcontrol.AlbumControlInitModule;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import wk7.j;
import com.kwai.robust.PatchProxyResult;
import tk7.j;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;

public class a implements c	// class@001e26
{
    public final AlbumControlInitModule a;

    public void a(AlbumControlInitModule p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1,String p2,String p3,boolean p4,boolean p5,int p6){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4),Boolean.valueOf(p5),Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
             return;
          }
       }else {
          int i = this;
       }
       j.c("photo", p0, p1, p2, p3, p4, p5, p6);
       return;
    }
    public boolean b(String p0,String p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       j oj = j.g();
       Objects.requireNonNull(oj);
       obj = PatchProxy.applyThreeRefs("photo", p0, p1, oj, j.class, "31");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(j.i() && oj.b(p0, p1, "photo", (TextUtils.isEmpty(p1) ^ 1))){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
