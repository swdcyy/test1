package com.samsung.android.sdk.camera.SCaptureRequest$b;
import android.hardware.camera2.CaptureRequest$Key;
import java.lang.Object;
import java.lang.String;
import com.samsung.android.sdk.camera.SCaptureRequest$a;
import java.lang.Class;
import vk8.k;
import xk8.c;

public final class SCaptureRequest$b	// class@000b77
{
    public final CaptureRequest$Key a;
    public final String b;

    public void SCaptureRequest$b(CaptureRequest$Key p0){
       super();
       this.b = p0.getName();
       this.a = p0;
    }
    public void SCaptureRequest$b(CaptureRequest$Key p0,SCaptureRequest$a p1){
       super(p0);
    }
    public void SCaptureRequest$b(String p0,Class p1){
       super();
       this.b = p0;
       this.a = c.b(p0, k.c(p1));
    }
    public void SCaptureRequest$b(String p0,Class p1,SCaptureRequest$a p2){
       super(p0, p1);
    }
    public void SCaptureRequest$b(String p0,String p1){
       super();
       this.b = p0;
       this.a = c.a(p1);
    }
    public void SCaptureRequest$b(String p0,String p1,SCaptureRequest$a p2){
       super(p0, p1);
    }
    public final boolean equals(Object p0){
       SCaptureRequest$b ta = this.a;
       boolean b = true;
       if (ta == null) {
          if (!p0 instanceof SCaptureRequest$b || p0.b != this.b) {
             b = false;
          }
          return b;
       }else if(p0 instanceof SCaptureRequest$b){
          p0 = p0.a;
          if (p0 != null && p0.equals(ta)) {
          label_0027 :
             return b;
          }
       }
       b = false;
       goto label_0027 ;
    }
    public final int hashCode(){
       return (this.b).hashCode();
    }
    public String toString(){
       Object[] objArray = new Object[]{this.b};
       return String.format("SCaptureRequest.Key\(%s\)", objArray);
    }
}
