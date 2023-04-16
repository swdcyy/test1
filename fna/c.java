package fna.c;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import fna.c$b;
import java.lang.reflect.Type;
import el.a;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfiguration;
import vma.a;
import o56.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.res.AssetManager;
import android.app.Application;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import isd.a;
import zsd.d;
import java.nio.charset.Charset;
import fg6.a;
import java.lang.Class;
import com.google.gson.Gson;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import fna.c$a;
import ok.x;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationHolder;
import com.kwai.robust.PatchProxy;

public final class c extends ConfigAutoParseJsonConsumer	// class@002975
{
    public static final c e;

    static {
       try{
          c.e = new c();
          if (a.a(new c$b().getType()) == null) {
             Application b = a.B;
             a.o(b, "AppEnv.APP");
             InputStream inputStream = SplitAssetHelper.open(b.getAssets(), "cleaner_configuration.json");
             a.o(inputStream, "AppEnv.APP.assets.open\(\"¡­aner_configuration.json\"\)");
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putString("cleanerConfig", b.e(a.a.h(new String(a.p(inputStream), d.a), CleanerConfiguration.class)));
             g.a(uEditor);
          }
       }catch(java.lang.Exception e0){
       }
    }
    public void c(){
       super(c$a.b);
    }
    public void b(Object p0){
       CleanerConfigurationHolder cleanerConfi;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
       }else if(p0 != null){
          cleanerConfi = p0.cleanerConfig;
       }else {
          cleanerConfi = null;
       }
       if (cleanerConfi != null) {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("cleanerConfig", b.e(p0.cleanerConfig));
          g.a(uEditor);
       }
       return;
    }
}
