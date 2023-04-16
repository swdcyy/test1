package com.yxcorp.gifshow.growth.widget.a;
import w96.a$b;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;

public final class a implements a$b	// class@0015de
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final String a(Intent p0){
       String str = "DESKTOP_WIDGET";
       if (p0.getStringExtra(str) != null) {
       }else {
          str = null;
       }
       return str;
    }
}
