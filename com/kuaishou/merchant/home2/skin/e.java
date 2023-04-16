package com.kuaishou.merchant.home2.skin.e;
import io.reactivex.g;
import java.lang.Object;
import brd.v;
import zw3.b;
import java.lang.System;
import java.lang.String;
import wkd.b;
import j80.c;
import java.io.File;
import qkd.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import brd.g;

public final class e implements g	// class@001826
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void subscribe(v p0){
       long l = b.d();
       long l1 = System.currentTimeMillis();
       long l2 = 0;
       if (l - l2 && l - l1 < 0) {
          b.j("");
          b.k(l2);
       }
       String str = b.c();
       File uFile = new File(b.a(-1504323719).h("merchant/home/skin/").getAbsolutePath());
       if (uFile.exists() && uFile.isDirectory()) {
          File[] uFileArray = uFile.listFiles();
          int i = 0;
          while (uFileArray != null && i < uFileArray.length) {
             try{
                if (uFileArray[i].isFile()) {
                   b.x(uFileArray[i]);
                }else if(uFileArray[i].isDirectory() && !TextUtils.n(uFileArray[i].getAbsolutePath(), str)){
                   b.p(uFileArray[i]);
                }
             }catch(java.io.IOException e5){
                a.l(MerchantHomeLogBiz.Skin, "CLEAN_SKIN", "fail to clean skin", e5);
             }
             i = i + 1;
          }
       }else if(uFile.exists() && uFile.isFile()){
          try{
             b.x(uFile);
          }catch(java.io.IOException e0){
             a.l(MerchantHomeLogBiz.Skin, "CLEAN_SKIN", "fail to clean skin", e0);
          }
       }
    }
}
