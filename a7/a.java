package a7.a;
import java.lang.String;
import java.lang.Object;
import java.text.SimpleDateFormat;
import java.lang.StringBuffer;
import java.util.Calendar;
import java.util.Date;
import java.lang.StringBuilder;
import x6.a;

public final class a	// class@0000fb
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    public void a(String p0,String p1,String p2,String p3,String p4,String p5,String p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public final String toString(){
       String str2;
       a te;
       a tg;
       String str3;
       String str = ",";
       StringBuffer str1 = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime())+str+this.a+str+this.b+str+this.c+str+this.d;
       if (a.c(this.e) || (this.e).length() < 20) {
          str2 = str;
          te = this.e;
       }else {
          str2 = str;
          str3 = (this.e).substring(0, 20);
       }
       str1 = str1+str2+te;
       if (a.c(this.f) || (this.f).length() < 20) {
          str2 = str;
          te = this.f;
       }else {
          str2 = str;
          str3 = (this.f).substring(0, 20);
       }
       str1 = str1+str2+te;
       if (a.c(this.g) || (this.g).length() < 20) {
          str2 = str;
          tg = this.g;
       }else {
          str2 = str;
          tg = (this.g).substring(0, 20);
       }
       return str1+str2+tg;
    }
}
