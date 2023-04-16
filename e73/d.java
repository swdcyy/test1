package e73.d;
import erd.g;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xp5.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import brd.t;

public final class d implements g	// class@002695
{
    public final LiveLiteFansGroupDataModel b;

    public void d(LiveLiteFansGroupDataModel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else if(p0.c != null){
          p0 = p0.b;
          LiveLiteFansGroupDataModel j = this.b.j;
          String str = (j != null)? j.d(): null;
          if (TextUtils.n(p0, str)) {
             LiveLiteFansGroupDataModel.d(this.b, true, false, false, false, 14, null);
          }
       }
       return;
    }
}
