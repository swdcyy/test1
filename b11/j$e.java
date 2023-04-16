package b11.j$e;
import b11.j$b;
import java.lang.Object;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeInfo;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import lnc.a1;
import android.content.res.Resources;

public class j$e implements j$b	// class@000303
{

    public void j$e(){
       super();
    }
    public CharSequence a(int p0,LiveWealthGradeInfo p1){
       j$e uoe = j$e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoe, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[]{String.valueOf(p1.mNextGrade),String.valueOf((p1.mNextGradeScore - p1.mCurrentScore))};
       return a1.c().getResources().getString(0x7f102eca, objArray);
    }
}
