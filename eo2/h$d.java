package eo2.h$d;
import aq5.b;
import eo2.h;
import java.lang.Object;
import aq5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;

public final class h$d implements b	// class@0027a3
{
    public final h b;

    public void h$d(h p0){
       this.b = p0;
       super();
    }
    public final void e6(a p0,boolean p1){
       h$d tb;
       h$d uod = h$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uod, "1")) {
          return;
       }
       if (p0 == AudienceBizRelation.SPECIAL_ROLE) {
          tb = this.b;
          tb.r0(tb.C0()).setValue(Boolean.valueOf(p1));
       }else if(p0 == AudienceBizRelation.GIFT_COMBO){
          tb = this.b;
          tb.r0(tb.y0()).setValue(Boolean.valueOf(p1));
       }
       return;
    }
}
