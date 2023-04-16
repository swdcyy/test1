package com.yxcorp.gifshow.postfont.repo.FontDownloadHelper$Companion$fontIdPathMap$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import c0c.b;
import c0c.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import java.util.HashMap;

public final class FontDownloadHelper$Companion$fontIdPathMap$2 extends Lambda implements a	// class@00109a
{
    public static final FontDownloadHelper$Companion$fontIdPathMap$2 INSTANCE;

    static {
       FontDownloadHelper$Companion$fontIdPathMap$2.INSTANCE = new FontDownloadHelper$Companion$fontIdPathMap$2();
    }
    public void FontDownloadHelper$Companion$fontIdPathMap$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       Object[] objArray = null;
       Type obj = PatchProxy.apply(objArray, this, FontDownloadHelper$Companion$fontIdPathMap$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.b;
       String str = a.a.getString("font_id_path_map", "{}");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       if (objArray == null) {
          objArray = new HashMap();
       }
       return objArray;
    }
}
