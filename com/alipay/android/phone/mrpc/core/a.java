package com.alipay.android.phone.mrpc.core.a;
import com.alipay.android.phone.mrpc.core.v;
import java.lang.reflect.Method;
import java.lang.String;
import java.lang.Object;

public abstract class a implements v	// class@000e40
{
    public Method a;
    public byte[] b;
    public String c;
    public int d;
    public String e;
    public boolean f;

    public void a(Method p0,int p1,String p2,byte[] p3,String p4,boolean p5){
       super();
       this.a = p0;
       this.d = p1;
       this.c = p2;
       this.b = p3;
       this.e = p4;
       this.f = p5;
    }
}
