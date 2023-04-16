package bdc.d;
import erd.r;
import bdc.h;
import java.lang.Object;
import com.yxcorp.gifshow.events.realaction.RealAction;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import bdc.b;
import bdc.c;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class d implements r	// class@000454
{
    public final h b;

    public void d(h p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object[] objArray;
       d obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "action");
          obj = this.b;
          if (obj.j == null) {
             objArray = new Object[0];
             obj.h().j("Cache check blocked", objArray);
          }else if(w.r0(p0.mFeed)){
             objArray = new Object[0];
             this.b.h().j("ShowFeed is Load Cache", objArray);
          }else {
             RealAction mActionType = p0.mActionType;
             if (mActionType == 1 || (mActionType == 15 && TextUtils.n(p0.mPage, "FRIENDS"))) {
                b = true;
             }
          }
          b = false;
       }
       return b;
    }
}
