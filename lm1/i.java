package lm1.i;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import lm1.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import lm1.f$a;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.gifshow.models.Gift;
import lm1.e;

public class i	// class@002fa6
{
    public final LiveSendGiftBaseTraceInfo a;
    public GiftTab b;
    public String c;
    public f d;
    public String e;

    public void i(LiveSendGiftBaseTraceInfo p0){
       int i = this;
       super();
       i.b = GiftTab.NormalGift;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       f$a obj = PatchProxy.apply(objArray, objArray, f.class, "6");
       if (obj != patchProxyRe) {
       }else {
          obj = f.m;
          Objects.requireNonNull(obj);
          obj = PatchProxy.apply(objArray, obj, f$a.class, "2");
          if (obj != patchProxyRe) {
          }else {
             f uof = new f(null, null, null, false, false, true, 0, 0, false, 0, null, null);
             obj = patchProxyRe;
          }
       }
       i.d = obj;
       i.a = p0;
       return;
    }
    public String a(){
       return this.c;
    }
    public f b(){
       return this.d;
    }
    public GiftTab c(){
       return this.b;
    }
    public String d(){
       return this.e;
    }
    public LiveSendGiftBaseTraceInfo e(){
       return this.a;
    }
    public void f(String p0){
       this.c = p0;
    }
    public void g(f p0){
       this.d = p0;
    }
    public void h(GiftTab p0){
       this.b = p0;
    }
    public void i(String p0){
       this.e = p0;
    }
}
