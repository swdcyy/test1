package com.hpplay.sdk.source.permission.a;
import com.hpplay.sdk.source.permission.d;
import android.app.Activity;
import java.lang.String;
import android.os.Build$VERSION;
import com.hpplay.sdk.source.permission.c;
import com.hpplay.sdk.source.permission.a$a;
import android.os.Handler;
import android.os.Looper;
import com.hpplay.sdk.source.permission.a$1;
import java.lang.Runnable;

public class a extends d	// class@000679
{

    public void a(){
       super();
    }
    public static void a(Activity p0,String[] p1,int p2){
       if (Build$VERSION.SDK_INT >= 23) {
          c.a(p0, p1, p2);
       }else if(p0 instanceof a$a){
          new Handler(Looper.getMainLooper()).post(new a$1(p1, p0, p2));
       }
       return;
    }
}
