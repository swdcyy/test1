package bpa.a;
import ay7.a;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.AbsoluteLayout;
import rn.a;
import java.lang.Integer;
import rn.a$a;

public final class a extends a	// class@000417
{

    public void a(){
       super();
    }
    public String c(){
       return "pageDismiss";
    }
    public String d(){
       return "KwaiBubble";
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       FunctionResultParams uFunctionRes = new FunctionResultParams();
       uFunctionRes.mResult = 0x1e84c;
       Integer tag = (p0 != null)? p0.getTag(R.id.ug_kwai_bubble_popup_tag): null;
       if (tag != null) {
          uFunctionRes.mResult = 1;
          a$a.a(tag, null, 1, null);
       }
       return uFunctionRes;
    }
}
