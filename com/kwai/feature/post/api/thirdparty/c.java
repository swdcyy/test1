package com.kwai.feature.post.api.thirdparty.c;
import com.kwai.feature.post.api.thirdparty.d$a;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import com.kwai.feature.post.api.thirdparty.d;
import java.lang.Long;

public final class c implements d$a	// class@001455
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final boolean a(Intent p0,String p1,String p2){
       boolean b;
       Set o = d.o;
       try{
          p0.putExtra(p1, Long.parseLong(p2));
          b = true;
       }catch(java.lang.NumberFormatException e0){
          b = false;
       }
       return b;
    }
}
