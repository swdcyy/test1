package com.kuaishou.live.common.core.component.pendant.miniwidget.position.lefttop.c;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.lefttop.d;
import com.kuaishou.livestream.message.nano.LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate;
import z51.i;
import java.lang.Object;
import java.lang.System;
import wv1.r;

public final class c implements Runnable	// class@001704
{
    public final d b;
    public final LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate c;
    public final i d;

    public void c(d p0,LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate p1,i p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       if (tb.v - System.currentTimeMillis() <= 0) {
       }else {
          tb.R8(new r(tb, tc, td));
       }
       return;
    }
}
