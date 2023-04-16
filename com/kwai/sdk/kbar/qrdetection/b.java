package com.kwai.sdk.kbar.qrdetection.b;
import java.lang.Runnable;
import com.kwai.sdk.kbar.qrdetection.DecodeRet;
import fo7.a$a;
import java.util.LinkedList;
import java.lang.Object;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.String;
import com.yxcorp.utility.Log;
import com.kwai.sdk.kbar.qrdetection.DecodeRet$DecodeStatus;
import com.kwai.sdk.kbar.qrdetection.DecodeRet$CodeType;
import android.graphics.YuvImage;
import java.io.ByteArrayOutputStream;
import android.graphics.Rect;
import java.io.OutputStream;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.kwai.sdk.kbar.qrdetection.a;
import java.lang.StringBuilder;
import com.google.gson.JsonObject;
import java.util.concurrent.locks.Lock;

public class b implements Runnable	// class@001628
{
    public DecodeRet[] b;
    public byte[] c;
    public int d;
    public int e;
    public int[] f;
    public boolean g;
    public a$a h;
    public LinkedList i;
    public final int j;
    public Lock k;

    public void b(DecodeRet[] p0,byte[] p1,int p2,int p3,int[] p4,boolean p5,a$a p6,LinkedList p7){
       super();
       this.i = new LinkedList();
       this.j = 2;
       this.k = new ReentrantLock();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
    }
    public final void a(){
       a uoa;
       b th;
       String str = "UploadRunnable";
       Log.b(str, "processUpload begin");
       b tb = this.b;
       DecodeRet$DecodeStatus[] uDecodeStatu = new DecodeRet$DecodeStatus[tb.length];
       DecodeRet$CodeType[] uCodeTypeArr = new DecodeRet$CodeType[tb.length];
       int i = 0;
       int i1 = 0;
       b tb1 = this.b;
       while (i1 < tb1.length) {
          uDecodeStatu[i1] = tb1[i1].getDecodeStatus();
          uCodeTypeArr[i1] = this.b[i1].getDecodeType();
          i1 = i1 + 1;
       }
       b tc = this.c;
       tb1 = this.d;
       b te = this.e;
       YuvImage yuvImage = new YuvImage(tc, 17, tb1, te, null);
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream(tc.length);
       Rect rect = new Rect(i, i, tb1, te);
       if (!v5.compressToJpeg(rect, 100, uByteArrayOu)) {
          uoa = null;
       }else {
          byte[] uobyteArray = uByteArrayOu.toByteArray();
          uoa = BitmapFactory.decodeByteArray(uobyteArray, i, uobyteArray.length);
       }
       a uoa1 = new a(this.g, uoa, uDecodeStatu, uCodeTypeArr, this.f);
       Log.b(str, "upload info :"+uoa.a());
       if (this.g == null) {
          th = this.h;
          if (th != null) {
             th.b(uoa);
          }
       }else {
          tb1 = this.b;
          if (tb1 != null && tb1[i].getDecodeStatus() == DecodeRet$DecodeStatus.DECODE_SUCCESS) {
             if (this.i.size() >= 2) {
                this.i.removeFirst();
             }
             this.i.add(uoa);
             while (i < this.i.size()) {
                th = this.h;
                if (th != null) {
                   th.b(this.i.get(i));
                }
                i = i + 1;
             }
          }else {
             Log.b(str, "upload failed info :"+uoa.a()+" size:"+this.i.size());
             if (this.i.size() >= 2) {
                this.i.removeFirst();
             }
             this.i.add(uoa);
          }
       }
       return;
    }
    public void run(){
       if (this.h == null) {
          Log.d("UploadRunnable", "delegate is null");
          return;
       }else if(!this.k.tryLock()){
          Log.d("UploadRunnable", "busying");
          return;
       }else {
          try{
             this.a();
             this.k.unlock();
             return;
          }catch(java.lang.IllegalArgumentException e0){
          }
       }
    }
}
