package c24.e0;
import cb4.e;
import java.lang.Object;
import cb4.d;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.merchant.router.RouterConfig;
import java.util.Map;
import ot3.l0;
import com.kuaishou.merchant.api.live.basic.model.SwitchToolParams;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import q14.s;
import brd.t;
import c24.e0$a;
import erd.g;
import crd.b;

public final class e0 implements e	// class@000474
{

    public void e0(){
       super();
    }
    public boolean a(){
       return d.a(this);
    }
    public boolean b(RouterRequest p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, e0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          obj = p0.c().c();
          String str = l0.i("liveStreamId", obj);
          int i = l0.e("type", obj);
          SwitchToolParams switchToolPa = new SwitchToolParams();
          switchToolPa.mActivity = p0.a();
          switchToolPa.mLiveStreamId = str;
          switchToolPa.mRootTag = l0.e("rootTag", obj);
          s.d().a(i, switchToolPa).subscribe(new e0$a(p0));
       }
       return true;
    }
    public String getName(){
       return d.b(this);
    }
}
