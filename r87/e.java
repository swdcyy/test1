package r87.e;
import java.io.FileFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import b97.c;
import java.lang.ThreadLocal;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import q87.b;
import com.kwai.logger.KwaiLog;
import java.lang.CharSequence;
import android.content.Context;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class e implements FileFilter	// class@002319
{
    public final long b;

    public void e(long p0){
       this.b = p0;
    }
    public final boolean accept(File p0){
       int i;
       long l;
       e tb = this.b;
       String name = p0.getName();
       try{
          i = -1;
          ThreadLocal a = c.a;
          SimpleDateFormat simpleDateFo = a.get();
          if (simpleDateFo == null) {
             simpleDateFo = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
             a.set(simpleDateFo);
          }
          l = simpleDateFo.parse(name).getTime();
       }catch(java.lang.Exception e0){
          l = i;
       }
       int i1 = 0;
       if (l - i > 0) {
          if ((e0 - l) - 0x240c8400 >= 0) {
             c.a(p0);
             p0.getName();
             g.a(o.c(KwaiLog.h(), "kwai_logger_sp", i1).edit().remove((((p0.getAbsolutePath()).replace(KwaiLog.i().b(), "")).replace(".zip", "")).replace(".log", "")));
          }
          i1 = true;
       }
       return i1;
    }
}
