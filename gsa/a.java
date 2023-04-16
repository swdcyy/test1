package gsa.a;
import ok.h;
import java.lang.Object;
import com.kwai.component.homepage_interface.skin.HomeBottomBarSkinConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class a implements h	// class@002bdd
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public Object apply(Object p0){
       HomeBottomBarSkinConfig homeBottomBa = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (homeBottomBa != PatchProxyResult.class) {
       }else {
          a.m(p0);
          homeBottomBa = p0.mDarkBottomBarBgUrl;
       }
       return homeBottomBa;
    }
}
