package p75.e;
import com.kwai.chat.kwailink.f$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import s75.c;
import o75.i0;

public class e extends f$a	// class@002173
{

    public void e(){
       super();
    }
    public void w1(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          c uoc = new c(p0);
          if (uoc.c()) {
             i0.b(uoc.b());
          }else {
             i0.a(uoc.a(), uoc.b());
          }
       }
       return;
    }
}
