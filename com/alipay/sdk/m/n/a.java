package com.alipay.sdk.m.n.a;
import java.lang.Enum;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Class;
import java.lang.Object;

public final class a extends Enum	// class@000e98
{
    public String a;
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a[] h;

    static {
       a uoa = new a("None", 0, "none");
       a.b = uoa;
       a uoa1 = new a("WapPay", 1, "js://wappay");
       a.c = uoa1;
       a uoa2 = new a("Update", 2, "js://update");
       a.d = uoa2;
       a uoa3 = new a("OpenWeb", 3, "loc:openweb");
       a.e = uoa3;
       a uoa4 = new a("SetResult", 4, "loc:setResult");
       a.f = uoa4;
       a uoa5 = new a("Exit", 5, "loc:exit");
       a.g = uoa5;
       a[] uoaArray = new a[]{uoa,uoa1,uoa2,uoa3,uoa4,uoa5};
       a.h = uoaArray;
    }
    public void a(String p0,int p1,String p2){
       super(p0, p1);
       this.a = p2;
    }
    public static a a(String p0){
       if (TextUtils.isEmpty(p0)) {
          return a.b;
       }
       a b = a.b;
       a[] uoaArray = a.values();
       int len = uoaArray.length;
       int i = 0;
       while (i < len) {
          object oobject = uoaArray[i];
          if (p0.startsWith(oobject.a)) {
             b = oobject;
             break ;
          }else {
             i = i + 1;
          }
       }
       return b;
    }
    public static a valueOf(String p0){
       return Enum.valueOf(a.class, p0);
    }
    public static a[] values(){
       return a.h.clone();
    }
}
