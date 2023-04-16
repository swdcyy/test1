package gsa.b;
import ok.h;
import java.lang.Object;
import com.kwai.component.homepage_interface.skin.HomeBottomBarSkinConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class b implements h	// class@002be1
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public Object apply(Object p0){
       HomeBottomBarSkinConfig homeBottomBa = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (homeBottomBa != PatchProxyResult.class) {
       }else {
          a.m(p0);
          homeBottomBa = p0.mLightBottomBarBgUrl;
       }
       return homeBottomBa;
    }
}
