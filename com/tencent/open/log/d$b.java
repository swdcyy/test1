package com.tencent.open.log.d$b;
import java.lang.String;
import android.os.Environment;
import java.lang.Object;
import com.tencent.open.log.d$c;
import java.io.File;

public final class d$b	// class@000f65
{

    public static boolean a(){
       String externalStor = Environment.getExternalStorageState();
       boolean b = (("mounted").equals(externalStor) || ("mounted_ro").equals(externalStor))? true: false;
       return b;
    }
    public static d$c b(){
       if (!d$b.a()) {
          return null;
       }
       return d$c.b(Environment.getExternalStorageDirectory());
    }
}
