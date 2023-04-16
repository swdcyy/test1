package b11.j$c;
import b11.j$b;
import android.app.Activity;
import java.lang.Object;
import java.lang.ref.WeakReference;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeInfo;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import d61.y;
import java.lang.StringBuilder;
import android.content.res.Resources;
import lnc.a1;

public class j$c implements j$b	// class@000301
{
    public final WeakReference a;

    public void j$c(Activity p0){
       super();
       this.a = new WeakReference(p0);
    }
    public CharSequence a(int p0,LiveWealthGradeInfo p1){
       String str;
       j$c uoc = j$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int b = y.d(this.a.get());
       int i = 1;
       if (p0 > 0) {
          Object[] objArray = new Object[i];
          objArray[0] = Integer.valueOf(p0);
          str = String.format("\(+%s\)", objArray);
       }else {
          str = "";
       }
       StringBuilder str1 = "";
       Resources resources = a1.m();
       b = (b)? 0x7f102ec7: 0x7f102ec8;
       Object[] objArray1 = new Object[i];
       objArray1[0] = String.valueOf(p1.mLightOnGradeScore);
       return str1+resources.getString(b, objArray1)+str;
    }
}
