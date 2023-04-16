package hi2.c;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.List;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import fi2.d;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;

public class c	// class@002da0
{
    public List a;
    public String b;

    public void c(LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo p0){
       a.p(p0, "btnInfo");
       super();
       this.a = new ArrayList();
       this.b = "";
       LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo textColor = p0.textColor;
       if (textColor != null && !PatchProxy.applyVoidOneRefs(textColor, this, c.class, "2")) {
          a.p(textColor, "<set-?>");
          this.b = textColor;
       }
       p0 = p0.buttonBgPict;
       if (p0 != null) {
          int len = p0.length;
          int i = 0;
          while (i < len) {
             object oobject = p0[i];
             if (!TextUtils.isEmpty(oobject.url)) {
                this.a().add(new CDNUrl(oobject.cdn, oobject.url, oobject.ip, oobject.urlPattern));
             }
             i = i + 1;
          }
       }
       return;
    }
    public List a(){
       return this.a;
    }
    public final Integer b(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.b.d(this.b);
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!q.f(this.a()) && this.b() != null)? true: false;
       return b;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (q.f(this.a()) && this.b() == null)? true: false;
       return b;
    }
}
