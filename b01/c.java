package b01.c;
import ok.o;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.LiveProp;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class c implements o	// class@0002e6
{
    public final String b;

    public void c(String p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       c tb = this.b;
       boolean b = (p0 != null && TextUtils.n(tb, p0.mPropId))? true: false;
       return b;
    }
}
