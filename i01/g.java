package i01.g;
import erd.g;
import i01.j;
import java.lang.Object;
import com.kuaishou.live.common.core.component.fansgroup.model.LiveFansGroupJoinResponse;
import android.os.SystemClock;
import com.google.gson.JsonElement;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.component.fansgroup.utils.FansGroupKswitchUtil;
import l95.b;
import l95.c;
import t02.a0;
import kg1.e;

public final class g implements g	// class@0027df
{
    public final j b;
    public final long c;

    public void g(j p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       g tb = this.b;
       tb.R8();
       tb.Y8(7, (SystemClock.elapsedRealtime() - this.c), p0.mCsLogCorrelateInfo);
       i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f10225c));
       if (PatchProxy.applyVoid(null, tb, j.class, "24")) {
       }else if(FansGroupKswitchUtil.b()){
          c.a(tb.P8(200));
       }
       if (tb.W8()) {
          tb.b9();
       }else {
          tb.p.r1.A1();
       }
       return;
    }
}
