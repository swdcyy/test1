package ed1.f;
import ed1.e;
import lp3.a;
import android.content.Context;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lp3.e;
import s51.c;
import lp3.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class f extends a implements e	// class@0020eb
{
    public Context d;
    public t e;

    public void f(Context p0,t p1){
       super();
       this.d = p0;
       this.e = p1;
    }
    public void hk(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       c uoc = this.Po().a(c.class);
       if (!TextUtils.x("kwailive://showcommenteditor?tab=1") && uoc.P0("kwailive://showcommenteditor?tab=1")) {
          uoc.r4("kwailive://showcommenteditor?tab=1", this.d);
       }
       return;
    }
    public t ji(){
       return this.e;
    }
}
