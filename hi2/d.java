package hi2.d;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.List;

public class d	// class@002da1
{
    public List a;
    public List b;
    public List c;
    public List d;
    public List e;

    public void d(LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo p0){
       int len;
       int i1;
       object oobject;
       a.p(p0, "commonInfo");
       super();
       this.a = new ArrayList();
       this.b = new ArrayList();
       this.c = new ArrayList();
       this.d = new ArrayList();
       this.e = new ArrayList();
       LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo coverTopPict = p0.coverTopPict;
       int i = 0;
       if (coverTopPict != null) {
          len = coverTopPict.length;
          i1 = 0;
          while (i1 < len) {
             oobject = coverTopPict[i1];
             if (!TextUtils.x(oobject.url)) {
                this.a.add(new CDNUrl(oobject.cdn, oobject.url, oobject.ip, oobject.urlPattern));
             }
             i1 = i1 + 1;
          }
       }
       coverTopPict = p0.coverBottomPict;
       if (coverTopPict != null) {
          len = coverTopPict.length;
          i1 = 0;
          while (i1 < len) {
             oobject = coverTopPict[i1];
             if (!TextUtils.x(oobject.url)) {
                this.b.add(new CDNUrl(oobject.cdn, oobject.url, oobject.ip, oobject.urlPattern));
             }
             i1 = i1 + 1;
          }
       }
       coverTopPict = p0.bgPict;
       if (coverTopPict != null) {
          len = coverTopPict.length;
          i1 = 0;
          while (i1 < len) {
             oobject = coverTopPict[i1];
             if (!TextUtils.x(oobject.url)) {
                this.c.add(new CDNUrl(oobject.cdn, oobject.url, oobject.ip, oobject.urlPattern));
             }
             i1 = i1 + 1;
          }
       }
       coverTopPict = p0.ambientTopPict;
       if (coverTopPict != null) {
          len = coverTopPict.length;
          i1 = 0;
          while (i1 < len) {
             oobject = coverTopPict[i1];
             if (!TextUtils.x(oobject.url)) {
                this.d.add(new CDNUrl(oobject.cdn, oobject.url, oobject.ip, oobject.urlPattern));
             }
             i1 = i1 + 1;
          }
       }
       p0 = p0.ambientBottomPict;
       if (p0 != null) {
          int len1 = p0.length;
          while (i < len1) {
             object oobject1 = p0[i];
             if (!TextUtils.x(oobject1.url)) {
                this.e.add(new CDNUrl(oobject1.cdn, oobject1.url, oobject1.ip, oobject1.urlPattern));
             }
             i = i + 1;
          }
       }
       return;
    }
    public final List a(){
       return this.e;
    }
    public final List b(){
       return this.d;
    }
    public final List c(){
       return this.b;
    }
    public final List d(){
       return this.a;
    }
}
