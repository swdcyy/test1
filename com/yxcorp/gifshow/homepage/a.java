package com.yxcorp.gifshow.homepage.a;
import ok.x;
import java.lang.Object;
import gsa.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import so5.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import wkd.b;
import sb5.c;
import com.kwai.component.homepage_interface.skin.HomeBottomBarSkinConfig;
import no5.a;

public final class a implements x	// class@0016a1
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object get(){
       boolean b;
       HomeBottomBarSkinConfig obj = PatchProxy.apply(null, null, i.class, "11");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(a.a().booleanValue()){
          Log.g("NasaBottomTabIconUtils", "sEnableBottomTabIconSaveFile: "+i.a);
          obj = b.a(-1397878105).b();
          if (i.b() && (obj != null && obj.mVersionCode == a.a())) {
             b = true;
          }
       }
       b = false;
       return Boolean.valueOf(b);
    }
}
