package com.yxcorp.gifshow.util.cdnresource.CdnResource$c;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$a;
import java.lang.Object;
import android.graphics.Bitmap;
import android.content.res.Resources;
import lnc.a1;
import android.graphics.BitmapFactory;
import java.lang.String;

public class CdnResource$c implements CdnResource$a	// class@001f63
{
    public final int[] a;

    public void CdnResource$c(int[] p0){
       super();
       this.a = p0;
    }
    public Bitmap a(int p0){
       if (p0 >= this.a.length || p0 < 0) {
          return null;
       }
       return BitmapFactory.decodeResource(a1.m(), this.a[p0]);
    }
    public int b(int p0){
       CdnResource$c ta = this.a;
       if (p0 >= ta.length || p0 < 0) {
          return 0;
       }
       return ta[p0];
    }
    public String getKsOrderId(){
       return null;
    }
    public int size(){
       return this.a.length;
    }
}
