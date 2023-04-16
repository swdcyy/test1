package com.kwai.sdk.kbar.core.a;
import java.lang.Runnable;
import com.kwai.sdk.kbar.core.a$a;
import java.lang.Object;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.Math;
import java.lang.String;
import com.yxcorp.utility.Log;
import java.util.concurrent.locks.Lock;
import java.lang.StringBuilder;
import com.kwai.sdk.kbar.qrdetection.DecodeRet;

public class a implements Runnable	// class@001616
{
    public int b;
    public int c;
    public byte[] d;
    public a$a e;
    public boolean f;
    public Lock g;

    public void a(byte[] p0,int p1,int p2,boolean p3,a$a p4){
       super();
       this.g = new ReentrantLock();
       this.d = p0;
       this.e = p4;
       this.b = p1;
       this.c = p2;
       this.f = p3;
    }
    public final int[] a(int[] p0,int p1){
       int i = 4;
       if (i != p0.length) {
          return p0;
       }
       int[] ointArray = new int[i];
       ointArray[0] = Math.max(0, (p0[0] - p1));
       ointArray[1] = Math.max(0, (p0[1] - p1));
       p1 = p1 * 2;
       ointArray[2] = Math.min(this.b, (p0[2] + p1));
       ointArray[3] = Math.min(this.c, (p0[3] + p1));
       return ointArray;
    }
    public void run(){
       int i;
       DecodeRet[] uDecodeRetAr;
       a uoa = this;
       String str = ",";
       if (uoa.e == null) {
          Log.d("KBAR_ProcessDataTask", "delegate is null");
          return;
       }else if(!uoa.g.tryLock()){
          Log.d("KBAR_ProcessDataTask", "busying");
          return;
       }else {
          Log.d("KBAR_ProcessDataTask", "process task start");
          try{
             i = 0;
             Object obj = uoa.d.clone();
             int[] ointArray = uoa.e.i(obj, uoa.b, uoa.c);
             if (ointArray != null && ointArray.length == 4) {
                int i1 = 2;
                if (ointArray[i1] > 0) {
                   int i2 = 3;
                   if (ointArray[i2] > 0) {
                      Log.d("KBAR_ProcessDataTask", "qrcode area is detected!!!!!");
                      int[] ointArray1 = uoa.a(ointArray, 5);
                      Log.d("KBAR_ProcessDataTask", "expand rect:"+ointArray1[0]+str+ointArray1[1]+str+ointArray1[i1]+str+ointArray1[i2]);
                      uDecodeRetAr = uoa.e.f(obj, uoa.b, uoa.c, ointArray1[0], ointArray1[1], ointArray1[i1], ointArray1[i2]);
                      int len = uDecodeRetAr.length;
                      int i3 = 0;
                      for (i1 = 0; i1 < len; i1 = i1 + 1) {
                         object oobject = uDecodeRetAr[i1];
                         i2 = (oobject.getUrl() != null && (oobject.getUrl()).length() > 0)? 1: 0;
                         i3 = i3 | i2;
                      }
                      if (!i3 && uoa.f != null) {
                         uoa.e.a(uoa.b, uoa.c, ointArray);
                      label_00d7 :
                         uoa.e.j(uDecodeRetAr);
                      }else {
                         goto label_00d7 ;
                      }
                   }
                }
             }
             a b = uoa.b;
             a c = uoa.c;
             uDecodeRetAr = uoa.e.f(obj, b, c, 0, 0, b, c);
             goto label_00d7 ;
          }catch(java.lang.Exception e0){
             uoa.e.j(i);
          }
          uoa.g.unlock();
          Log.d("KBAR_ProcessDataTask", "process task end");
          return;
       }
    }
}
