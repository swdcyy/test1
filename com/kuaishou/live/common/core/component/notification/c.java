package com.kuaishou.live.common.core.component.notification.c;
import erd.i;
import java.lang.Object;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.notification.LiveOperationNotificationView;

public final class c implements i	// class@0016e5
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final Object a(Object p0,Object p1,Object p2,Object p3){
       boolean b = (p0.booleanValue() && (p1.booleanValue() && (p2.booleanValue() && p3.booleanValue())))? true: false;
       return Boolean.valueOf(b);
    }
}
