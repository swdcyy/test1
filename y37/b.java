package y37.b;
import f55.c;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.gamezone.bridge.JsAddShortcutToDesktopParams;
import f55.g;
import com.yxcorp.gifshow.gamecenter.api.model.JsGamePlaySquareParam;
import com.kwai.live.gzone.bridge.function.LiveGzoneCompetationIdParam;
import com.kwai.live.gzone.bridge.function.GzoneJsObtainOpenIdParams;
import com.kwai.live.gzone.bridge.function.LiveGzoneThirdPlatformParams;
import java.lang.String;
import com.kwai.feature.api.platform.bridge.beans.JsPageWXMiniProgramParams;
import com.kwai.live.gzone.bridge.function.LiveGzoneShowTaskRewardParam;

public interface abstract b implements c	// class@003d60
{

    void A6(Activity p0,QPhoto p1);
    void D7(Activity p0,JsAddShortcutToDesktopParams p1,g p2);
    void I1(Activity p0,JsGamePlaySquareParam p1);
    void J0(Activity p0,LiveGzoneCompetationIdParam p1,g p2);
    void P9(Activity p0,LiveGzoneCompetationIdParam p1,g p2);
    void Q5(Activity p0,GzoneJsObtainOpenIdParams p1,g p2);
    void S5(LiveGzoneThirdPlatformParams p0,g p1);
    void U5(String p0,g p1);
    void Z0(Activity p0,JsPageWXMiniProgramParams p1);
    String getNameSpace();
    void w2(LiveGzoneShowTaskRewardParam p0,g p1);
}
