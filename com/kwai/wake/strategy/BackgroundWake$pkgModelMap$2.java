package com.kwai.wake.strategy.BackgroundWake$pkgModelMap$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.Context;
import java.lang.Object;
import java.util.Map;
import com.kwai.wake.sp.SubProcessSp;
import gx7.j;
import java.lang.String;
import android.content.SharedPreferences;
import gx7.g;
import java.util.Objects;
import com.middleware.security.MXSec;
import kotlin.jvm.internal.a;
import com.middleware.security.wrapper.IKSecurityBase;
import android.util.Base64;
import zsd.d;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import com.kwai.middleware.azeroth.Azeroth2;
import com.google.gson.Gson;
import ex7.b;
import java.lang.reflect.Type;
import el.a;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.wake.pojo.PkgModel;

public final class BackgroundWake$pkgModelMap$2 extends Lambda implements a	// class@001127
{
    public final Context $appContext;

    public void BackgroundWake$pkgModelMap$2(Context p0){
       this.$appContext = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       String str = null;
       String str1 = SubProcessSp.f.a(this.$appContext).a.getString("pkg_model_map", str);
       Objects.requireNonNull(g.a);
       if (str1 != null) {
          MXSec mXSec = MXSec.get();
          a.o(mXSec, "MXSec.get\(\)");
          byte[] uobyteArray = mXSec.getWrapper().uDecrypt("Kuaiwake", "0adf377a-7aae-49ca-9d5b-929e68c588c9", 0, Base64.decode(str1, 0));
          a.o(uobyteArray, "output");
          str = new String(uobyteArray, d.a);
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       if (str != null) {
          Map map = Azeroth2.B.k().i(str, new b().getType());
          a.o(map, "temp");
          linkedHashMa.putAll(map);
       }
       LinkedHashMap linkedHashMa1 = new LinkedHashMap();
       Iterator iterator = linkedHashMa.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          int i = 1;
          if (uEntry.getValue().getStrategy() != i) {
             i = 0;
          }
          if (i) {
             linkedHashMa1.put(uEntry.getKey(), uEntry.getValue());
          }
       }
       return linkedHashMa1;
    }
}
