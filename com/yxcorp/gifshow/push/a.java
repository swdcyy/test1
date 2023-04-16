package com.yxcorp.gifshow.push.a;
import w96.a$b;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import ekd.j0;

public final class a implements a$b	// class@001618
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final String a(Intent p0){
       String str = (j0.g(p0, "provider"))? "PUSH": null;
       return str;
    }
}
