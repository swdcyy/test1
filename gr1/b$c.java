package gr1.b$c;
import androidx.lifecycle.Observer;
import gr1.b;
import java.lang.Object;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaLiveState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import androidx.lifecycle.LiveData;
import dr1.f;
import dr1.d;
import java.util.Map;
import dr1.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import dr1.a;
import er1.a;
import dr1.a$a;

public final class b$c implements Observer	// class@002569
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
       }else {
          LiveMultiLineArenaLiveState sHOW_END = LiveMultiLineArenaLiveState.SHOW_END;
          if (p0 == sHOW_END) {
             p0 = this.b;
             Objects.requireNonNull(p0);
             b uob = b.class;
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, p0, uob, "4")) {
                d value = p0.j.d().getValue();
                if (value != null) {
                   Map map = value.c();
                   if (map != null) {
                      e uoe = map.get(p0.i);
                      if (uoe != null) {
                         d value1 = p0.j.d().getValue();
                         b i = p0.i;
                         Object obj = PatchProxy.applyTwoRefs(value1, i, p0, uob, "5");
                         if (obj != PatchProxyResult.class) {
                            b = obj.booleanValue();
                         }else if(value1 != null){
                            objArray = value1.d();
                         }
                         if (objArray == sHOW_END && TextUtils.n(value1.e(), i)) {
                            b = true;
                         }else {
                            b = false;
                         }
                         if (b) {
                            Objects.requireNonNull(a.f);
                            p0.u0(R.string.arg_RES_7f1025c0, String.valueOf(uoe.c()), uoe.a(), a.d);
                         }else {
                            p0.u0(R.string.arg_RES_7f1025c2, String.valueOf(uoe.c()), uoe.a(), a.f.a());
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
