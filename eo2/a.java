package eo2.a;
import androidx.lifecycle.Observer;
import eo2.g;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import z61.e;
import androidx.lifecycle.MutableLiveData;

public final class a implements Observer	// class@002798
{
    public final g b;

    public void a(g p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       g a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          p0 = p0.component2();
          int i = (!p0.component1().booleanValue() && !p0.booleanValue())? 1: 0;
          a tb = this.b;
          a = tb.a;
          int i1 = (i)? 0x7f081124: 0x7f081123;
          a.mIconRes = i1;
          a.c = i ^ 1;
          tb.b.setValue(a);
       }
       return;
    }
}
