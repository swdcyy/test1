package com.xiaomi.mipush.sdk.au;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class au extends Enum	// class@0010e9
{
    public static final au a;
    public static final au[] a;
    public static final au b;
    public static final au c;
    public static final au d;
    public static final au e;
    public static final au f;

    static {
       au uoau = new au("DISABLE_PUSH", 0);
       au.a = uoau;
       au uoau1 = new au("ENABLE_PUSH", 1);
       au.b = uoau1;
       au uoau2 = new au("UPLOAD_HUAWEI_TOKEN", 2);
       au.c = uoau2;
       au uoau3 = new au("UPLOAD_FCM_TOKEN", 3);
       au.d = uoau3;
       au uoau4 = new au("UPLOAD_COS_TOKEN", 4);
       au.e = uoau4;
       au uoau5 = new au("UPLOAD_FTOS_TOKEN", 5);
       au.f = uoau5;
       au[] uoauArray = new au[]{uoau,uoau1,uoau2,uoau3,uoau4,uoau5};
       au.a = uoauArray;
    }
    public void au(String p0,int p1){
       super(p0, p1);
    }
    public static au valueOf(String p0){
       return Enum.valueOf(au.class, p0);
    }
    public static au[] values(){
       return au.a.clone();
    }
}
