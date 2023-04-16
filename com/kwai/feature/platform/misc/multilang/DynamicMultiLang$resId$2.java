package com.kwai.feature.platform.misc.multilang.DynamicMultiLang$resId$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import kotlin.jvm.internal.a;
import android.content.res.AssetManager;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import zsd.d;
import java.nio.charset.Charset;
import fg6.a;
import com.kwai.feature.platform.misc.multilang.MultiLangConfig$a;
import com.google.gson.Gson;
import l06.b;
import java.lang.StringBuilder;
import q87.c;

public final class DynamicMultiLang$resId$2 extends Lambda implements a	// class@0012b6
{
    public static final DynamicMultiLang$resId$2 INSTANCE;

    static {
       DynamicMultiLang$resId$2.INSTANCE = new DynamicMultiLang$resId$2();
    }
    public void DynamicMultiLang$resId$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       MultiLangConfig$a multiLangsRe;
       String str = "DynamicMultiLang";
       Object[] obj = PatchProxy.apply(null, this, DynamicMultiLang$resId$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       try{
          Application uApplication = a.b();
          a.o(uApplication, "AppEnv.getAppContext\(\)");
          InputStream inputStream = SplitAssetHelper.open(uApplication.getAssets(), "apk.json");
          a.o(inputStream, "AppEnv.getAppContext\(\).assets.open\(\"apk.json\"\)");
          byte[] uobyteArray = new byte[inputStream.available()];
          inputStream.read(uobyteArray);
          String str1 = new String(uobyteArray, d.a);
          MultiLangConfig$a uoa = a.a.h(str1, MultiLangConfig$a.class);
          Object[] objArray = new Object[i];
          b.C().t(str, "resId: "+uoa.multiLangsResMD5, objArray);
          multiLangsRe = uoa.multiLangsResMD5;
       }catch(java.io.IOException e0){
          obj = new Object[i];
          b.C().t(e0, "error resId is null", obj);
          multiLangsRe = "";
       }
       return multiLangsRe;
    }
}
