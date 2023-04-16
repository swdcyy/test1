package com.vivo.push.util.s;
import com.vivo.push.b.c;
import com.vivo.push.util.w;
import com.vivo.push.o;
import java.lang.System;
import java.lang.StringBuilder;
import java.lang.String;
import com.vivo.push.util.b;

public final class s	// class@0010c1
{

    public static int a(c p0){
       w ow = w.b();
       int i = p0.b();
       int i1 = ow.a("com.vivo.push_preferences.operate."+i+"OPERATE_COUNT");
       long l = System.currentTimeMillis() - ow.b("com.vivo.push_preferences.operate."+i+"START_TIME", 0);
       if (l - 0x5265c00 > 0 || l < 0) {
          ow.a("com.vivo.push_preferences.operate."+i+"START_TIME", System.currentTimeMillis());
          ow.a("com.vivo.push_preferences.operate."+i+"OPERATE_COUNT", 1);
       }else if(i1 >= p0.f()){
          return 1001;
       }else {
          ow.a("com.vivo.push_preferences.operate."+i+"OPERATE_COUNT", (i1 + 1));
       }
       return 0;
    }
}
