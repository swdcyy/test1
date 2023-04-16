package com.tencent.open.b.f;
import android.content.Context;
import com.tencent.open.utils.f;
import java.lang.String;
import com.tencent.open.utils.g;

public class f	// class@000f49
{

    public static int a(){
       int i = g.a(f.a(), null).a("Common_HttpRetryCount");
       if (!i) {
          i = 2;
       }
       return i;
    }
    public static int a(String p0){
       int i = 100;
       if (f.a() == null) {
          return i;
       }
       int i1 = g.a(f.a(), p0).a("Common_BusinessReportFrequency");
       if (i1) {
          i = i1;
       }
       return i;
    }
}
