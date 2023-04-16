package com.airbnb.lottie.ex.b;
import java.util.concurrent.Callable;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import com.airbnb.lottie.ex.network.b;
import java.util.Objects;
import com.airbnb.lottie.ex.network.a;
import java.io.File;
import com.airbnb.lottie.ex.network.FileExtension;
import java.io.FileInputStream;
import a5.d;
import z1.e;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import a5.k;
import com.airbnb.lottie.ex.a;
import a5.e;
import java.lang.Throwable;

public final class b implements Callable	// class@000da3
{
    public final Context b;
    public final String c;

    public void b(Context p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       int i;
       e uoe;
       k ok;
       boolean a;
       b uob = new b(this.b, this.c);
       b c = uob.c;
       Objects.requireNonNull(c);
       try{
          i = 0;
          a b = c.b;
          FileExtension jSON = FileExtension.JSON;
          File uFile = new File(c.a.getCacheDir(), a.a(b, jSON, false));
          if (!uFile.exists()) {
             uFile = new File(c.a.getCacheDir(), a.a(b, FileExtension.ZIP, false));
             if (!uFile.exists()) {
                uFile = i;
             }
          }
          if (uFile == null) {
             uoe = i;
          }else {
             FileInputStream uFileInputSt = new FileInputStream(uFile);
             if ((uFile.getAbsolutePath()).endsWith(".zip")) {
                jSON = FileExtension.ZIP;
             }
             uFile.getAbsolutePath();
             uoe = new e(jSON, uFileInputSt);
          }
       }catch(java.io.FileNotFoundException e0){
       }
       if (uoe != null) {
          uoe = uoe.b;
          ok = (uoe.a == FileExtension.ZIP)? a.e(new ZipInputStream(uoe), uob.b): a.b(uoe, uob.b);
          if (ok.b() != null) {
             Object obj = ok.b();
          }
       }
       if (i != null) {
          ok = new k(i);
       }else {
          a = d.a;
          try{
             ok = uob.a();
          }catch(java.io.IOException e0){
             ok = new k(e0);
          }
       }
    }
}
