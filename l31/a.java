package l31.a;
import cy1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserExtraInfo;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import i2b.a;
import l31.a$b;
import ml8.c;
import java.util.List;
import androidx.recyclerview.widget.h$b;
import l31.a$a;

public class a extends a	// class@002e6c
{
    public final int x;
    public final int y;

    public void a(int p0,int p1){
       super();
       this.x = p0;
       this.y = p1;
    }
    public int f0(int p0){
       UserInfo obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.N0(p0);
       if (p0 < 3 && obj != null) {
          obj = obj.mExtraInfo;
          if (obj != null && obj.isTopPayingUser()) {
             return p0;
          }
       }
       return 3;
    }
    public f h1(ViewGroup p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 && (p1 != 1 && p1 != 2)) {
          p1 = (p1 != 3)? 0: this.y;
       }else {
          a ty = this.x;
       }
       return new f(a.i(p0, p1), new a$b(this));
    }
    public h$b r1(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a$a(this.Q0(), p0);
    }
}
