package com.alipay.sdk.m.f.c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class c extends Enum	// class@000e97
{
    public int a;
    public String b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static final c g;
    public static final c h;
    public static final c i;
    public static final c j;
    public static final c[] k;

    static {
       c uoc = new c("SUCCEEDED", 0, 9000, "处理成功");
       c.c = uoc;
       c uoc1 = new c("FAILED", 1, 4000, "系统繁忙，请稍后再试");
       c.d = uoc1;
       c uoc2 = new c("CANCELED", 2, 6001, "用户取消");
       c.e = uoc2;
       c uoc3 = new c("NETWORK_ERROR", 3, 6002, "网络连接异常");
       c.f = uoc3;
       c uoc4 = new c("ACTIVITY_NOT_START_EXIT", 4, 6007, "支付未完成");
       c.g = uoc4;
       c uoc5 = new c("PARAMS_ERROR", 5, 4001, "参数错误");
       c.h = uoc5;
       c uoc6 = new c("DOUBLE_REQUEST", 6, 5000, "重复请求");
       c.i = uoc6;
       c uoc7 = new c("PAY_WAITTING", 7, 8000, "支付结果确认中");
       c.j = uoc7;
       c[] uocArray = new c[]{uoc,uoc1,uoc2,uoc3,uoc4,uoc5,uoc6,uoc7};
       c.k = uocArray;
    }
    public void c(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.a = p2;
       this.b = p3;
    }
    public static c b(int p0){
       if (p0 == 4001) {
          return c.h;
       }
       if (p0 == 5000) {
          return c.i;
       }
       if (p0 == 8000) {
          return c.j;
       }
       if (p0 == 9000) {
          return c.c;
       }
       if (p0 == 6001) {
          return c.e;
       }
       if (p0 != 6002) {
          return c.d;
       }
       return c.f;
    }
    public static c valueOf(String p0){
       return Enum.valueOf(c.class, p0);
    }
    public static c[] values(){
       return c.k.clone();
    }
    public String a(){
       return this.b;
    }
    public void a(int p0){
       this.a = p0;
    }
    public void a(String p0){
       this.b = p0;
    }
    public int b(){
       return this.a;
    }
}
