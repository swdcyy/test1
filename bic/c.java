package bic.c;
import bic.b;
import java.lang.String;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import uo7.h0;
import yhc.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class c implements b	// class@00047e
{
    public final String a;
    public final String b;
    public final BaseFeed c;

    public void c(String p0,String p1,BaseFeed p2){
       a.p(p1, "mActionUrl");
       a.p(p2, "feed");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public boolean N(){
       boolean b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       String obj = PatchProxy.apply(null, this, uoc, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = new h0(this.b).c();
       c ta = this.a;
       boolean b = true;
       if (d.a.a(this.c, 2)) {
          Object obj1 = PatchProxy.applyOneRefs(obj, this, uoc, "2");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(!TextUtils.n(obj, "wechat") && (!TextUtils.n(obj, "wechatMoments") && (!TextUtils.n(obj, "wechatWow") && (!TextUtils.n(obj, "qq") && (TextUtils.n(obj, "qzone") || TextUtils.n(obj, "weibo")))))){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
             Object obj2 = PatchProxy.applyOneRefs(ta, this, uoc, "3");
             if (obj2 != patchProxyRe) {
                b2 = obj2.booleanValue();
             }else if(!TextUtils.n(ta, "DOWNLOAD") && !TextUtils.n(ta, "TOKEN")){
                b2 = true;
             }else {
                b2 = false;
             }
             if (b2) {
             label_0099 :
                return b;
             }
          }
       }
    label_0098 :
       b = false;
       goto label_0099 ;
    }
}
