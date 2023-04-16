package com.kwai.library.push.http.InPushApiExt$apiService$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import ky6.a;
import java.util.ArrayList;
import com.kwai.library.push.http.InPushApiExt;
import oy6.a;
import com.kwai.library.push.utils.InPushSettingExt;
import my6.d;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.List;
import t97.b;
import cyd.a;
import trd.t;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import t97.a;
import java.lang.Class;

public final class InPushApiExt$apiService$2 extends Lambda implements a	// class@0008c3
{
    public static final InPushApiExt$apiService$2 INSTANCE;

    static {
       InPushApiExt$apiService$2.INSTANCE = new InPushApiExt$apiService$2();
    }
    public void InPushApiExt$apiService$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       String str;
       ArrayList uArrayList = new ArrayList();
       a uoa = InPushSettingExt.d();
       d uod = (uoa != null)? uoa.a(): null;
       boolean b = (uod != null)? uod.a(): false;
       int i = (uod != null)? uod.d(): 0;
       if (1 == i) {
          str = "push.test.gifshow.com";
       }else if(2 == i){
          str = "push.staging.kuaishou.com";
       }else {
          str = "push.gifshow.com";
       }
       String str1 = (b)? "http://": "https://";
       uArrayList.add(str1+str);
       b uob = new b("inapp");
       uob.m(1);
       uob.j(t.k(a.a()));
       uob.i(t.k(RxJava2CallAdapterFactory.create()));
       uob.h(uArrayList);
       uob.d(false);
       a uoa1 = uob.b();
       return uoa1.a(a.class);
    }
}
