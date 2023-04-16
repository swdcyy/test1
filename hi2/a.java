package hi2.a;
import hi2.d;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$AudienceRedPackSkin;
import hi2.e;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinOpenButtonInfo;
import hi2.h;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinInnerInfo;
import hi2.c;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo;

public final class a extends d	// class@002d9e
{
    public e f;
    public h g;
    public c h;

    public void a(LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme p0){
       a.p(p0, "skinTheme");
       LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme commonInfo = p0.commonInfo;
       a.o(commonInfo, "skinTheme.commonInfo");
       super(commonInfo);
       LiveCustomRedPackSkinMessage$AudienceRedPackSkin audienceRedP = p0.getAudienceRedPackSkin();
       if (audienceRedP != null) {
          audienceRedP = audienceRedP.openButton;
          if (audienceRedP != null) {
             this.f = new e(audienceRedP);
          }
       }
       audienceRedP = p0.getAudienceRedPackSkin();
       if (audienceRedP != null) {
          audienceRedP = audienceRedP.innerInfo;
          if (audienceRedP != null) {
             this.g = new h(audienceRedP);
          }
       }
       LiveCustomRedPackSkinMessage$AudienceRedPackSkin audienceRedP1 = p0.getAudienceRedPackSkin();
       if (audienceRedP1 != null) {
          audienceRedP1 = audienceRedP1.sendGiftButton;
          if (audienceRedP1 != null) {
             this.h = new c(audienceRedP1);
          }
       }
       return;
    }
}
