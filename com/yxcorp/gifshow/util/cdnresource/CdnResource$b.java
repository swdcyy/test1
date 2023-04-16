package com.yxcorp.gifshow.util.cdnresource.CdnResource$b;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$a;
import java.io.File;
import java.lang.String;
import java.lang.Object;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class CdnResource$b implements CdnResource$a	// class@001f62
{
    public final File[] a;
    public final String b;

    public void CdnResource$b(File[] p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public Bitmap a(int p0){
       CdnResource$b ta = this.a;
       if (p0 >= ta.length || p0 < 0) {
          return null;
       }
       object oobject = ta[p0];
       if (oobject.isDirectory()) {
          return null;
       }
       return BitmapFactory.decodeFile(oobject.getAbsolutePath());
    }
    public int b(int p0){
       CdnResource$b ta = this.a;
       if (p0 >= ta.length || p0 < 0) {
          return 0;
       }
       return (ta[p0].getName()).hashCode();
    }
    public String getKsOrderId(){
       return this.b;
    }
    public int size(){
       return this.a.length;
    }
}
