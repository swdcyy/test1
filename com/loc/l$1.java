package com.loc.l$1;
import com.loc.ck;
import android.content.Context;
import java.lang.String;
import com.loc.al;
import java.io.File;
import java.io.FileOutputStream;
import com.loc.x;
import java.lang.Throwable;
import com.loc.ak;

public final class l$1 extends ck	// class@001449
{
    public final Context a;
    public final String b;

    public void l$1(Context p0,String p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(){
       File uFile = new File(al.c(this.a, "k.store"));
       if (!uFile.getParentFile().exists()) {
          uFile.getParentFile().mkdirs();
       }
       FileOutputStream uFileOutputS = new FileOutputStream(uFile);
       uFileOutputS.write(x.a(this.b));
       uFileOutputS.close();
       return;
    }
}
