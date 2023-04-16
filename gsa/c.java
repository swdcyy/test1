package gsa.c;
import ok.h;
import sn5.a;
import java.lang.Object;
import com.kwai.component.homepage_interface.skin.HomeBottomBarSkinConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import sb5.e;

public final class c implements h	// class@002be3
{
    public final a b;

    public void c(a p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Integer integer = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          a.m(p0);
          integer = Integer.valueOf(e.g(p0.mSelectedTitleColor, this.b.c));
       }
       return integer;
    }
}
