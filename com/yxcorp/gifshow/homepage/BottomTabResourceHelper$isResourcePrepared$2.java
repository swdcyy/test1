package com.yxcorp.gifshow.homepage.BottomTabResourceHelper$isResourcePrepared$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import kotlin.jvm.internal.a;
import sb5.c;
import com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.opt.BottomActionBarSkinConfig;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.homepage.BottomTabResourceHelper$isResourcePrepared$2$a;
import java.lang.Runnable;
import t45.c;
import com.yxcorp.gifshow.homepage.BottomTabResourceHelper;
import java.util.List;
import java.util.Iterator;
import java.io.File;
import com.kwai.component.kcube.model.startup.c;
import java.lang.StringBuilder;

public final class BottomTabResourceHelper$isResourcePrepared$2 extends Lambda implements a	// class@00169e
{
    public static final BottomTabResourceHelper$isResourcePrepared$2 INSTANCE;

    static {
       BottomTabResourceHelper$isResourcePrepared$2.INSTANCE = new BottomTabResourceHelper$isResourcePrepared$2();
    }
    public void BottomTabResourceHelper$isResourcePrepared$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       boolean b;
       BottomActionBarSkinConfig obj = PatchProxy.apply(null, this, BottomTabResourceHelper$isResourcePrepared$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = b.a(-1397878105);
       a.o(obj, "Singleton.get\(SkinManager::class.java\)");
       obj = obj.e();
       b = false;
       String str = "BottomTabResourceHelper";
       if (obj == null) {
          Log.g(str, "BottomActionBarSkinConfig is null.");
       }else {
          c.a(new BottomTabResourceHelper$isResourcePrepared$2$a(obj));
          Iterator iterator = BottomTabResourceHelper.b.b(obj).iterator();
          while (true) {
             if (iterator.hasNext()) {
                if (c.b(iterator.next()) != null) {
                   continue ;
                }
             }else {
                b = true;
             }
             Log.g(str, "isResourcePrepared: "+b);
             if (!b) {
                BottomTabResourceHelper.b.d(obj);
                break ;
             }
          }
       }
       return b;
    }
}
