package com.yxcorp.gifshow.homepage.BottomTabResourceHelper$a;
import io7.a;
import java.lang.Object;
import java.lang.String;
import io7.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import sb5.b;
import java.lang.reflect.Type;
import java.lang.Void;
import com.yxcorp.gifshow.homepage.BottomTabResourceHelper;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.opt.BottomActionBarSkinConfig;

public final class BottomTabResourceHelper$a implements a	// class@00169c
{
    public static final BottomTabResourceHelper$a b;

    static {
       BottomTabResourceHelper$a.b = new BottomTabResourceHelper$a();
    }
    public void BottomTabResourceHelper$a(){
       super();
    }
    public final void a(String p0,f p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BottomTabResourceHelper$a.class, "1")) {
          return;
       }
       Log.g("BottomTabResourceHelper", "SkinConfig change");
       Void void = null;
       if (p1 != null) {
          void = p1.d(b.class, void);
       }
       if (void != null) {
          b mBottomActio = void.mBottomActionBarSkinConfig;
          a.o(mBottomActio, "it.mBottomActionBarSkinConfig");
          BottomTabResourceHelper.b.d(mBottomActio);
       }
       return;
    }
}
