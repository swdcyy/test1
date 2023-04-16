package com.yxcorp.gifshow.growth.widget.virtual.c;
import android.os.Handler$Callback;
import java.lang.Object;
import android.os.Message;
import com.yxcorp.gifshow.growth.widget.virtual.e;

public final class c implements Handler$Callback	// class@001610
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final boolean handleMessage(Message p0){
       Message what = p0.what;
       boolean b = true;
       if (what != null) {
          if (what != b) {
             b = false;
          }else {
             p0.obj.b();
          }
       }else {
          p0.obj.a();
       }
       return b;
    }
}
