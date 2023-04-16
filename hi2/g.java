package hi2.g;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.List;

public final class g	// class@002da4
{
    public List a;

    public void g(LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo p0){
       a.p(p0, "innerInfo");
       super();
       this.a = new ArrayList();
       p0 = p0.innerBgPict;
       if (p0 != null) {
          int len = p0.length;
          int i = 0;
          while (i < len) {
             object oobject = p0[i];
             if (!TextUtils.isEmpty(oobject.url)) {
                this.a.add(new CDNUrl(oobject.cdn, oobject.url, oobject.ip, oobject.urlPattern));
             }
             i = i + 1;
          }
       }
       return;
    }
}
