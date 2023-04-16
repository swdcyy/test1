package df1.f;
import df1.c;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class f extends c	// class@001f8e
{
    public final HighFrequencyActionGuide c;

    public void f(HighFrequencyActionGuide p0){
       super();
       this.c = p0;
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h();
    }
    public int b(){
       return this.c.count;
    }
    public boolean c(){
       boolean b = true;
       if (this.c.style == b) {
       }else {
          b = false;
       }
       return b;
    }
    public String e(){
       return this.c.businessParams;
    }
    public int f(){
       return this.c.giftId;
    }
    public String g(){
       Object obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h()+"-"+this.c.giftId;
    }
    public String h(){
       return this.c.configBizIdV2;
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.x(this.c.text) && !TextUtils.x(this.c.configBizId))? true: false;
       return b;
    }
    public boolean k(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c obj = PatchProxy.apply(null, this, f.class, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       obj = (this.c.style <= null)? 1: null;
       if (!obj) {
          Object obj1 = PatchProxy.apply(null, this, c.class, "4");
          boolean b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): this.c() ^ 1;
          if (b1) {
          label_0039 :
             if (!TextUtils.n(this.h(), "highFrequency_localLike_v2") && !TextUtils.n(this.h(), "highFrequency_multiLike_v2")) {
                b = true;
             }
          }
       }else {
          goto label_0039 ;
       }
    label_0052 :
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "HighFluencyRemoteMessage{mMessage="+this.c.text+"BizId="+this.c.configBizId+"BizIdV2="+this.c.configBizIdV2+"isStrongStyle"+this.c()+'}';
    }
}
