package t87.e;
import java.lang.Runnable;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import a97.f;
import java.io.File;
import android.os.Environment;
import java.lang.StringBuilder;
import c97.d;
import h97.g;
import java.lang.CharSequence;
import android.text.TextUtils;
import a97.c;

public final class e implements Runnable	// class@00247d
{
    public final Context b;

    public void e(Context p0){
       this.b = p0;
    }
    public final void run(){
       e tb = this.b;
       int i = 0;
       if (!f.a(tb, "clean_temp_file", i)) {
          File[] uFileArray = new File(Environment.getDataDirectory().getPath()+"/data/"+tb.getPackageName()).listFiles();
          if (uFileArray != null) {
             String productName = d.a().b().getProductName();
             int len = uFileArray.length;
             int i1 = 0;
             while (i1 < len) {
                object oobject = uFileArray[i1];
                String[] stringArray = (oobject.getName()).split("-");
                if (stringArray.length == 5 && (!TextUtils.isEmpty(stringArray[i]) && (stringArray[i]).equals(productName))) {
                   int i2 = 4;
                   if (!TextUtils.isEmpty(stringArray[i2]) && (stringArray[i2]).matches("\\d{13}")) {
                      c.c(oobject);
                   }
                }
             label_007d :
                i1 = i1 + 1;
             }
             f.c(tb, "clean_temp_file", 1);
          }
       }
       return;
    }
}
