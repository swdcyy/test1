package cl9.d2;
import ekd.q$b;
import cl9.e2;
import java.lang.Object;
import com.kuaishou.android.model.mix.QComment$Label;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;

public class d2 implements q$b	// class@000614
{
    public final e2 a;

    public void d2(e2 p0){
       this.a = p0;
       super();
    }
    public boolean a(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, d2.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0.mLabelType.intValue() != 9 && p0.mLabelType.intValue() != 13){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
