package fta.a;
import zq6.t;
import java.lang.Object;
import wq6.h;
import un5.c;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import android.os.Build$VERSION;
import com.yxcorp.utility.RomUtils;
import com.yxcorp.gifshow.homepage.BottomActionBarSkinHelper;
import rn5.a;
import zq6.p;
import as6.a;
import sn5.a;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import tn5.a;
import com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.opt.ThemeConfig;
import zf6.l;
import sb5.e;

public final class a implements t	// class@0029e9
{

    public void a(){
       super();
    }
    public Object a(h p0,Object p1){
       return this.c(p0, p1);
    }
    public final String b(String p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return "NavigationBar:"+p0+':'+p1;
    }
    public c c(h p0,c p1){
       int i;
       BottomActionBarSkinHelper obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "tab");
       if (Build$VERSION.SDK_INT == 23 && RomUtils.n()) {
          return c.d;
       }
       obj = BottomActionBarSkinHelper.b;
       c uoc = null;
       if (!obj.a()) {
          return uoc;
       }
       p b = a.b;
       a.o(b, "HomeBottomStateId.BOTTOM_SCHEME");
       a uoa = a.l(p0, b);
       if (uoa != null) {
          TabIdentifier z = b.z;
          a.o(z, "if \(BuildConfig.IS_NEBUL¡­abIdentifier.NASA\n      }");
          a uoa1 = obj.b(p0, a.p(z, p0));
          if (uoa1 != null) {
             ThemeConfig themeConfig = (uoa.i != null)? uoa1.a(): uoa1.b();
             String str = (themeConfig != null)? themeConfig.d(): uoc;
             if (str == null) {
                return uoc;
             }else {
                uoc = p0.F(this.b(uoa1.c(), uoa.i));
                if (uoc == null) {
                   String str1 = themeConfig.d();
                   if (p1 != null) {
                      p1 = p1.a;
                   }else if(l.r()){
                      i = -1;
                   }else {
                      i = 0xff000000;
                   }
                   uoc = new c(e.g(str1, p1));
                   p0.r(this.b(uoa1.c(), uoa.i), uoc);
                }
             }
          }
       }
       return uoc;
    }
}
