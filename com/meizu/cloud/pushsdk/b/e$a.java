package com.meizu.cloud.pushsdk.b.e$a;
import java.util.Comparator;
import com.meizu.cloud.pushsdk.b.e;
import java.lang.Object;
import java.io.File;

public class e$a implements Comparator	// class@0014af
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public int a(File p0,File p1){
       if ((v2 = p0.lastModified() - p1.lastModified()) > 0) {
          return -1;
       }
       if (!v2) {
          return 0;
       }
       return 1;
    }
    public int compare(Object p0,Object p1){
       return this.a(p0, p1);
    }
}
