package e12.l$a;
import ok.o;
import e12.l;
import java.lang.Object;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;

public class l$a implements o	// class@002600
{
    public final l b;

    public void l$a(l p0){
       this.b = p0;
       super();
    }
    public boolean apply(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, l$a.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 != null && (p0.mUser != null && (!TextUtils.x(p0.getId()) && !r1.l1(p0)))){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
