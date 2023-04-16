package com.kuaishou.live.lite.bottombar.LiteBottomBarDataSource$Companion$startUpConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiteBottomBarConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wg3.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;

public final class LiteBottomBarDataSource$Companion$startUpConfig$2 extends Lambda implements a	// class@001ea5
{
    public static final LiteBottomBarDataSource$Companion$startUpConfig$2 INSTANCE;

    static {
       LiteBottomBarDataSource$Companion$startUpConfig$2.INSTANCE = new LiteBottomBarDataSource$Companion$startUpConfig$2();
    }
    public void LiteBottomBarDataSource$Companion$startUpConfig$2(){
       super(0);
    }
    public final LiveConfigStartupResponse$LiteBottomBarConfig invoke(){
       Object[] objArray = null;
       LiveConfigStartupResponse$LiteBottomBarConfig obj = PatchProxy.apply(objArray, this, LiteBottomBarDataSource$Companion$startUpConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveConfigStartupResponse$LiteBottomBarConfig.class;
       String str = a.a.getString("liteBottomBarConfig", "");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
