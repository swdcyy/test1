package com.yxcorp.gifshow.homepage.kcube.actionbar.bottom.BottomBarSchemeStateValueInterceptor$intercept$1$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.opt.TabIcon;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BottomBarSchemeStateValueInterceptor$intercept$1$2 extends Lambda implements l	// class@0016ed
{
    public static final BottomBarSchemeStateValueInterceptor$intercept$1$2 INSTANCE;

    static {
       BottomBarSchemeStateValueInterceptor$intercept$1$2.INSTANCE = new BottomBarSchemeStateValueInterceptor$intercept$1$2();
    }
    public void BottomBarSchemeStateValueInterceptor$intercept$1$2(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final List invoke(TabIcon p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BottomBarSchemeStateValueInterceptor$intercept$1$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       List list = (p0 != null)? p0.b(): null;
       return list;
    }
}
