package com.tencent.open.log.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Thread;
import java.lang.Throwable;
import android.text.format.Time;
import java.lang.StringBuilder;
import android.util.Log;

public final class g	// class@000f6b
{
    public static final g a;

    static {
       g.a = new g();
    }
    public void g(){
       super();
    }
    public final String a(int p0){
       if (p0 == 1) {
          return "V";
       }
       if (p0 == 2) {
          return "D";
       }
       if (p0 == 4) {
          return "I";
       }
       if (p0 == 8) {
          return "W";
       }
       if (p0 == 16) {
          return "E";
       }
       if (p0 != 32) {
          return "-";
       }
       return "A";
    }
    public String a(int p0,Thread p1,long p2,String p3,String p4,Throwable p5){
       long l = p2 % 1000;
       Time time = new Time();
       time.set(p2);
       StringBuilder str = this.a(p0)+'/'+time.format("%Y-%m-%d %H:%M:%S")+'.';
       if (l - 10 < 0) {
          str = str+"00";
       }else if(l - 100 < 0){
          str = str+'0';
       }
       char c = ' ';
       str = str+l+c+'[';
       str = (p1 == null)? str+"N/A": str+p1.getName();
       char c1 = ']';
       c = 10;
       str = str+c1+'['+p3+c1+c+p4+c;
       if (p5 != null) {
          str = str+"* Exception : \n"+Log.getStackTraceString(p5)+c;
       }
       return str;
    }
}
