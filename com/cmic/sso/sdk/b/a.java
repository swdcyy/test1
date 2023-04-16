package com.cmic.sso.sdk.b.a;
import com.cmic.sso.sdk.b.a$a;
import com.cmic.sso.sdk.b.a$1;
import java.lang.Enum;
import android.os.Build;
import java.lang.String;

public class a	// class@000f36
{

    public static int a(){
       return a.a(a.b());
    }
    public static int a(a$a p0){
       int i = a$1.a[p0.ordinal()];
       if (i == 1) {
          return 0;
       }
       if (i != 2) {
          return -1;
       }
       return 1;
    }
    public static a$a b(){
       String bRAND = Build.BRAND;
       if (bRAND.equalsIgnoreCase("samsung")) {
          return a$a.b;
       }
       if (bRAND.equalsIgnoreCase("Huawei")) {
          return a$a.c;
       }
       return a$a.a;
    }
}
