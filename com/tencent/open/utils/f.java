package com.tencent.open.utils.f;
import android.content.Context;
import java.lang.String;
import java.io.File;
import com.tencent.open.utils.k;

public final class f	// class@000f7b
{
    public static Context a;

    public static final Context a(){
       Context a = f.a;
       if (a == null) {
          a = null;
       }
       return a;
    }
    public static final File a(String p0){
       return k.h(f.a(), p0);
    }
    public static final void a(Context p0){
       f.a = p0;
    }
    public static final String b(){
       if (f.a() == null) {
          return "";
       }
       return f.a().getPackageName();
    }
    public static final File c(){
       if (f.a() == null) {
          return null;
       }
       return f.a().getFilesDir();
    }
    public static final File d(){
       Context uContext = f.a();
       File cacheDir = (uContext != null)? uContext.getCacheDir(): null;
       return cacheDir;
    }
    public static final File e(){
       return f.a(null);
    }
}
