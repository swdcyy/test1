package com.yxcorp.gifshow.growth.widget.b;
import w96.a$b;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;

public final class b implements a$b	// class@0015df
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final String a(Intent p0){
       String str = "NOTIFICATION_BAR_RECO_VIDEO_PUSH";
       if (p0.getStringExtra(str) != null) {
       }else {
          str = null;
       }
       return str;
    }
}
