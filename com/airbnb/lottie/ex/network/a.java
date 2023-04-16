package com.airbnb.lottie.ex.network.a;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import com.airbnb.lottie.ex.network.FileExtension;
import java.lang.StringBuilder;
import java.io.InputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class a	// class@000dbf
{
    public final Context a;
    public final String b;

    public void a(Context p0,String p1){
       super();
       this.a = p0.getApplicationContext();
       this.b = p1;
    }
    public static String a(String p0,FileExtension p1,boolean p2){
       FileExtension extension;
       StringBuilder str = "lottie_cache_"+p0.replaceAll("\\W+", "");
       p0 = (p2)? p1.tempExtension(): p1.extension;
       return str+p0;
    }
    public File b(InputStream p0,FileExtension p1){
       File uFile = new File(this.a.getCacheDir(), a.a(this.b, p1, true));
       FileOutputStream uFileOutputS = new FileOutputStream(uFile);
       byte[] uobyteArray = new byte[1024];
       int i = p0.read(uobyteArray);
       while (i != -1) {
          uFileOutputS.write(uobyteArray, 0, i);
       }
       uFileOutputS.flush();
       uFileOutputS.close();
       p0.close();
       return uFile;
    }
}
