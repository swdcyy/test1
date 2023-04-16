package com.kuaishou.live.lite.gesture.a;
import java.lang.Runnable;
import com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl$a;
import java.lang.Object;

public final class a implements Runnable	// class@000993
{
    public final LiveLiteGestureServiceImpl$a b;

    public void a(LiveLiteGestureServiceImpl$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       this.b.b = false;
    }
}
