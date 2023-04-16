package sn4.b;
import f55.c;
import com.kwai.poi.service.model.JsPoiParams;
import f55.g;
import android.app.Activity;
import com.kuaishou.nearby_poi.poi.model.JsOpenDetailParams;
import com.kuaishou.nearby_poi.poi.LocalLifeUrlParams;
import com.kuaishou.nearby_poi.poi.model.LocalLifeLoggerParams;
import com.kuaishou.nearby_poi.poi.model.LocalLifeHalfContainerParams;
import com.kuaishou.nearby_poi.poi.model.LoadWebViewParams;
import java.lang.String;
import com.kuaishou.nearby_poi.poi.model.LlhcRNViewReadyParams;
import com.kuaishou.nearby_poi.poi.model.PoiCommentElementParams;
import com.kwai.locallife.model.LocalLifeGlobalEvent;
import com.kwai.framework.model.locallife.LiveLocalLifeUpdateBizStatusModel;
import com.kuaishou.nearby_poi.poi.model.LocalLifeJinJingParams;
import com.kuaishou.nearby_poi.poi.model.PoiOpenLiveFeedParams;

public interface abstract b implements c	// class@0031b0
{

    void Aa(JsPoiParams p0,g p1);
    void C8(Activity p0,JsOpenDetailParams p1);
    void D9(Activity p0,JsOpenDetailParams p1);
    void Fa(JsPoiParams p0,g p1);
    void J4(Activity p0,LocalLifeUrlParams p1,g p2);
    void M0(Activity p0,LocalLifeLoggerParams p1,g p2);
    void N0(Activity p0,LocalLifeHalfContainerParams p1,g p2);
    void f9(Activity p0,LoadWebViewParams p1,g p2);
    String getNameSpace();
    void i6(Activity p0,LlhcRNViewReadyParams p1,g p2);
    void k0(Activity p0,PoiCommentElementParams p1,g p2);
    void l2(JsPoiParams p0,g p1);
    void o5(JsPoiParams p0,g p1);
    void pa(Activity p0,LocalLifeGlobalEvent p1,g p2);
    void s7(LiveLocalLifeUpdateBizStatusModel p0,g p1);
    void v1(Activity p0,LocalLifeJinJingParams p1,g p2);
    void x7(Activity p0,PoiOpenLiveFeedParams p1,g p2);
    void xa(Activity p0,LocalLifeHalfContainerParams p1,g p2);
    void z0(JsPoiParams p0,g p1);
}
