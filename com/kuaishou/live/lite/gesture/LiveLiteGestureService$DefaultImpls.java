package com.kuaishou.live.lite.gesture.LiveLiteGestureService$DefaultImpls;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import android.view.View;
import msd.l;
import java.lang.Object;
import crd.b;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService$subscribeTouchEvent$1;

public final class LiveLiteGestureService$DefaultImpls	// class@00097b
{

    public static b a(LiveLiteGestureService p0,View p1,boolean p2,l p3,int p4,Object p5){
       LiveLiteGestureService$subscribeTouchEvent$1 iNSTANCE = (p4 & 0x04)? LiveLiteGestureService$subscribeTouchEvent$1.INSTANCE: null;
       return p0.b(p1, p2, iNSTANCE);
    }
}
