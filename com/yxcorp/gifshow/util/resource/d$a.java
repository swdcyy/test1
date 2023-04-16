package com.yxcorp.gifshow.util.resource.d$a;
import java.lang.String;
import android.net.Uri;
import java.lang.Object;
import java.util.Locale;
import c0d.d;

public class d$a	// class@000ce0
{
    public final String a;
    public final Uri b;
    public String c;
    public d d;

    public void d$a(String p0,Uri p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public String toString(){
       Locale uS = Locale.US;
       Object[] objArray = new Object[2];
       objArray[0] = this.c;
       d$a td = this.d;
       d c = (td != null)? td.c: null;
       objArray[1] = c;
       return String.format(uS, "url:%s, ip:%s", objArray);
    }
}
