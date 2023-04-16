package txc.l;
import f55.c;
import txc.l$a;
import txc.b;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsNewYodaPageConfigParams;
import f55.g;
import com.yxcorp.gifshow.webview.jsmodel.component.JsLocationWithCheckParams;
import com.yxcorp.gifshow.webview.jsmodel.component.JsLocationRequestWitchCheckParams;
import android.content.Context;
import java.lang.String;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsPageTitleParams;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsPageButtonParams;
import com.yxcorp.gifshow.webview.jsmodel.interact.JsInteractParams;
import com.yxcorp.gifshow.webview.helper.event.JsEventParameter;
import com.yxcorp.gifshow.webview.jsmodel.JsEmitParameter;
import com.yxcorp.gifshow.webview.jsmodel.component.JsPageSlideParams;
import cyc.b;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsPhysicalBackButtonParams;

public interface abstract l implements c	// class@003d15
{
    public static final l$a c;

    static {
       l.c = l$a.a;
    }
    void C6(b p0,JsNewYodaPageConfigParams p1,g p2);
    void D(b p0,JsLocationWithCheckParams p1,g p2);
    void E2(b p0,JsLocationRequestWitchCheckParams p1,g p2);
    void G7(Context p0,String p1,g p2);
    void H5(g p0);
    void I(g p0);
    void J7(g p0);
    void N4(Context p0,String p1,g p2);
    void O5(b p0,g p1);
    void P8(b p0,JsPageTitleParams p1,g p2);
    void Q1(b p0,JsPageButtonParams p1,g p2);
    void R2(b p0,JsInteractParams p1,g p2);
    void R9(b p0,JsPageButtonParams p1,g p2);
    void S4(b p0,JsEventParameter p1,g p2);
    void W0(b p0,g p1);
    void X(b p0,g p1);
    void Z1(b p0,JsEventParameter p1,g p2);
    void a2(b p0,JsPageButtonParams p1,g p2);
    void g0(b p0,g p1);
    String getNameSpace();
    void i0(String p0,g p1);
    void m5(b p0,g p1);
    void p3(JsEmitParameter p0,g p1);
    void r8(g p0);
    void s0(b p0,JsLocationWithCheckParams p1,g p2);
    void s5(b p0,g p1);
    void w(b p0,JsPageButtonParams p1,g p2);
    void w7(b p0,JsPageSlideParams p1,g p2);
    void w8(b p0,g p1);
    void x3(b p0,JsPageButtonParams p1,g p2);
    void x9(b p0,JsPhysicalBackButtonParams p1,g p2);
    void z8(g p0);
}
