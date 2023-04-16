package ml9.d;
import ml9.a;
import com.yxcorp.gifshow.comment.e;
import android.app.Activity;
import java.lang.Object;
import ml9.d$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.comment.e$b;
import com.kwai.sdk.switchconfig.a;
import io7.f;
import fg6.a;
import com.google.gson.JsonElement;
import ml9.e;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.List;

public class d implements a	// class@00304c
{
    public e a;
    public Activity b;
    public c c;
    public e$b d;
    public static List e;

    public void d(e p0,Activity p1){
       super();
       this.d = new d$a(this);
       this.a = p0;
       this.b = p1;
    }
    public void a(){
       d uod = d.class;
       if (PatchProxy.applyVoid(null, this, uod, "10")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uod, "2")) {
          uod = this.c;
          if (uod != null) {
             uod.o();
             this.c = null;
          }
       }
       this.a.j(this.d);
       this.b = null;
       this.a = null;
       return;
    }
    public void b(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "9")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "4") && d.e == null) {
          f uof = a.t().f("godCommentOfficialAccountIDList");
          if (uof != null) {
             d.e = a.a.i(uof.c().toString(), new e(this).getType());
          }
       }
       this.a.b(this.d);
       return;
    }
}
