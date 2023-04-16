package com.xiaomi.mipush.sdk.ag;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ag extends Enum	// class@0010e8
{
    public static final ag a;
    public static final ag[] a;
    public static final ag b;
    public static final ag c;
    public static final ag d;
    public static final ag e;
    public static final ag f;

    static {
       ag uoag = new ag("HUAWEI", 0);
       ag.a = uoag;
       ag uoag1 = new ag("MEIZU", 1);
       ag.b = uoag1;
       ag uoag2 = new ag("FCM", 2);
       ag.c = uoag2;
       ag uoag3 = new ag("OPPO", 3);
       ag.d = uoag3;
       ag uoag4 = new ag("VIVO", 4);
       ag.e = uoag4;
       ag uoag5 = new ag("OTHER", 5);
       ag.f = uoag5;
       ag[] uoagArray = new ag[]{uoag,uoag1,uoag2,uoag3,uoag4,uoag5};
       ag.a = uoagArray;
    }
    public void ag(String p0,int p1){
       super(p0, p1);
    }
    public static ag valueOf(String p0){
       return Enum.valueOf(ag.class, p0);
    }
    public static ag[] values(){
       return ag.a.clone();
    }
}
