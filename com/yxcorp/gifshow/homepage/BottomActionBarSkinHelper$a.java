package com.yxcorp.gifshow.homepage.BottomActionBarSkinHelper$a;
import ok.h;
import java.lang.Object;
import com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.opt.BottomActionBarSkinConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.homepage.BottomTabResourceHelper;

public final class BottomActionBarSkinHelper$a implements h	// class@001694
{
    public static final BottomActionBarSkinHelper$a b;

    static {
       BottomActionBarSkinHelper$a.b = new BottomActionBarSkinHelper$a();
    }
    public void BottomActionBarSkinHelper$a(){
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BottomActionBarSkinHelper$a.class, "1");
       if (obj != PatchProxyResult.class) {
       }else if(BottomTabResourceHelper.b.c()){
          p0 = null;
       }
       obj = p0;
       return obj;
    }
}
