package com.kwai.link.extensions.HttpTransaction$Method;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;

public final class HttpTransaction$Method extends Enum	// class@000ae1
{
    public final int value;
    public static final HttpTransaction$Method[] $VALUES;
    public static final HttpTransaction$Method DELETE;
    public static final HttpTransaction$Method GET;
    public static final HttpTransaction$Method HEAD;
    public static final HttpTransaction$Method OPTIONS;
    public static final HttpTransaction$Method PATCH;
    public static final HttpTransaction$Method POST;
    public static final HttpTransaction$Method PUT;
    public static final HttpTransaction$Method UNKNOWN;

    static {
       HttpTransaction$Method method = new HttpTransaction$Method("UNKNOWN", 0, 0);
       HttpTransaction$Method.UNKNOWN = method;
       HttpTransaction$Method method1 = new HttpTransaction$Method("GET", 1, 1);
       HttpTransaction$Method.GET = method1;
       HttpTransaction$Method method2 = new HttpTransaction$Method("POST", 2, 2);
       HttpTransaction$Method.POST = method2;
       HttpTransaction$Method method3 = new HttpTransaction$Method("PUT", 3, 3);
       HttpTransaction$Method.PUT = method3;
       HttpTransaction$Method method4 = new HttpTransaction$Method("PATCH", 4, 4);
       HttpTransaction$Method.PATCH = method4;
       HttpTransaction$Method method5 = new HttpTransaction$Method("DELETE", 5, 5);
       HttpTransaction$Method.DELETE = method5;
       HttpTransaction$Method method6 = new HttpTransaction$Method("HEAD", 6, 6);
       HttpTransaction$Method.HEAD = method6;
       HttpTransaction$Method method7 = new HttpTransaction$Method("OPTIONS", 7, 7);
       HttpTransaction$Method.OPTIONS = method7;
       HttpTransaction$Method[] methodArray = new HttpTransaction$Method[]{method,method1,method2,method3,method4,method5,method6,method7};
       HttpTransaction$Method.$VALUES = methodArray;
    }
    public void HttpTransaction$Method(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static HttpTransaction$Method fromValue(int p0){
       HttpTransaction$Method method = HttpTransaction$Method.class;
       if (PatchProxy.isSupport(method)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, method, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return HttpTransaction$Method.values()[p0];
    }
    public static HttpTransaction$Method valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, HttpTransaction$Method.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(HttpTransaction$Method.class, p0);
    }
    public static HttpTransaction$Method[] values(){
       Object obj = PatchProxy.apply(null, null, HttpTransaction$Method.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return HttpTransaction$Method.$VALUES.clone();
    }
    public int getValue(){
       return this.value;
    }
}
