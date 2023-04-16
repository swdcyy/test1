package ai5.i;
import q07.a;
import androidx.fragment.app.FragmentActivity;
import zjd.f;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dkd.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import dkd.a$a;
import java.lang.Enum;
import bkd.a;
import com.kwai.component.upgrade.f;
import zjd.c;
import zjd.g;
import zjd.h;

public class i extends a	// class@0000ad
{
    public final f c;
    public final RequestTiming d;

    public void i(int p0,FragmentActivity p1,f p2,RequestTiming p3){
       this.c = p2;
       this.d = p3;
       super(p0, p1);
    }
    public void b(a p0){
       int i;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, str)) {
          return;
       }
       i tc = this.c;
       i td = this.d;
       Object obj = PatchProxy.applyOneRefs(td, null, a.class, str);
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          switch (a$a.a[td.ordinal()]){
              case 1:
                i = 1;
                break;
              case 2:
                i = 2;
                break;
              case 3:
                i = 3;
                break;
              case 4:
                i = 4;
                break;
              case 5:
                i = 5;
                break;
              case 6:
                i = 6;
                break;
              case 7:
                i = 7;
                break;
              case 8:
                i = 8;
                break;
              case 9:
                i = 9;
                break;
              default:
                i = 0;
          }
       }
       tc.f(f.d(i, false), f.a(true), f.c(true), null);
       return;
    }
}
