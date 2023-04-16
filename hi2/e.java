package hi2.e;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import fi2.d;
import java.lang.Integer;
import java.util.List;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.model.CDNUrl;

public final class e	// class@002da2
{
    public Integer a;
    public Integer b;
    public List c;
    public List d;
    public List e;
    public List f;

    public void e(LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo p0){
       int len;
       int i1;
       object oobject;
       Integer integer1;
       a.p(p0, "btnInfo");
       super();
       this.c = new ArrayList();
       this.d = new ArrayList();
       this.e = new ArrayList();
       this.f = new ArrayList();
       LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo buttonColor = p0.buttonColor;
       int i = 0;
       if (buttonColor != null) {
          len = buttonColor.length;
          i1 = 0;
          while (i1 < len) {
             oobject = buttonColor[i1];
             a.o(oobject, "it");
             Integer integer = d.b.d(oobject);
             if (integer != null) {
                this.c.add(integer);
             }
             i1 = i1 + 1;
          }
       }
       buttonColor = p0.buttonProgressBgColor;
       if (buttonColor != null) {
          integer1 = d.b.d(buttonColor);
          if (integer1 != null) {
             this.b = integer1;
          }
       }
       buttonColor = p0.buttonProgressColor;
       if (buttonColor != null) {
          integer1 = d.b.d(buttonColor);
          if (integer1 != null) {
             this.a = integer1;
          }
       }
       buttonColor = p0.buttonBgPict;
       if (buttonColor != null) {
          len = buttonColor.length;
          i1 = 0;
          while (i1 < len) {
             oobject = buttonColor[i1];
             if (!TextUtils.isEmpty(oobject.url)) {
                this.d.add(new CDNUrl(oobject.cdn, oobject.url, oobject.ip, oobject.urlPattern));
             }
             i1 = i1 + 1;
          }
       }
       buttonColor = p0.buttonOpenPict;
       if (buttonColor != null) {
          len = buttonColor.length;
          i1 = 0;
          while (i1 < len) {
             oobject = buttonColor[i1];
             if (!TextUtils.isEmpty(oobject.url)) {
                this.e.add(new CDNUrl(oobject.cdn, oobject.url, oobject.ip, oobject.urlPattern));
             }
             i1 = i1 + 1;
          }
       }
       p0 = p0.buttonOpenAnimationPict;
       if (p0 != null) {
          int len1 = p0.length;
          while (i < len1) {
             object oobject1 = p0[i];
             if (!TextUtils.isEmpty(oobject1.url)) {
                this.f.add(new CDNUrl(oobject1.cdn, oobject1.url, oobject1.ip, oobject1.urlPattern));
             }
             i = i + 1;
          }
       }
       return;
    }
}
