package hi2.h;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.List;

public class h	// class@002da5
{
    public List a;
    public List b;

    public void h(LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo p0){
       a.p(p0, "innerInfo");
       super();
       this.a = new ArrayList();
       this.b = new ArrayList();
       LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo luckyResultB = p0.luckyResultBgPict;
       int i = 0;
       if (luckyResultB != null) {
          int len = luckyResultB.length;
          int i1 = 0;
          while (i1 < len) {
             object oobject = luckyResultB[i1];
             if (!TextUtils.isEmpty(oobject.url)) {
                this.a.add(new CDNUrl(oobject.cdn, oobject.url, oobject.ip, oobject.urlPattern));
             }
             i1 = i1 + 1;
          }
       }
       p0 = p0.resultInnerBgPict;
       if (p0 != null) {
          int len1 = p0.length;
          while (i < len1) {
             object oobject1 = p0[i];
             if (!TextUtils.isEmpty(oobject1.url)) {
                this.b.add(new CDNUrl(oobject1.cdn, oobject1.url, oobject1.ip, oobject1.urlPattern));
             }
             i = i + 1;
          }
       }
       return;
    }
}
