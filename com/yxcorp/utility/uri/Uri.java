package com.yxcorp.utility.uri.Uri;
import android.os.Parcelable;
import java.lang.Comparable;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.utility.uri.Uri$a;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import java.lang.AssertionError;
import com.yxcorp.utility.uri.Uri$StringUri;

public abstract class Uri implements Parcelable, Comparable	// class@0009dd
{
    public static final String b;
    public static final char[] c;

    static {
       Uri.b = "NOT CACHED";
       Uri.c = ("0123456789ABCDEF").toCharArray();
    }
    public void Uri(){
       super();
    }
    public void Uri(Uri$a p0){
       super();
    }
    public static String b(String p0){
       if (p0 == null) {
          p0 = null;
       }else {
          int i = p0.length();
          StringBuilder str = null;
          int i1 = 0;
          while (true) {
             if (i1 < i) {
                int i2 = i1;
                while (i2 < i && Uri.e(p0.charAt(i2), null)) {
                   i2 = i2 + 1;
                }
                if (i2 == i) {
                   if (i1) {
                      p0 = str+p0;
                   }
                }else if(str == null){
                   str = "";
                }
                if (i2 > i1) {
                   str = str+p0;
                }
                i1 = i2 + 1;
                while (i1 < i && !Uri.e(p0.charAt(i1), null)) {
                   i1 = i1 + 1;
                }
                String str1 = p0.substring(i2, i1);
                try{
                   byte[] bytes = str1.getBytes("UTF-8");
                   int len = bytes.length;
                   for (int i3 = 0; i3 < len; i3 = i3 + 1) {
                      char[] c = Uri.c;
                      int i4 = bytes[i3] & 0x00f0;
                      i4 = i4 >> 4;
                      i4 = bytes[i3] & 0x0f;
                      str = str+'%'+c[i4]+c[i4];
                   }
                }catch(java.io.UnsupportedEncodingException e10){
                   throw new AssertionError(e10);
                }
             }else if(str == null){
                p0 = str;
                break ;
             }
          }
       }
       return p0;
    }
    public static boolean e(char p0,String p1){
       boolean b = (p0 < 'A' || (p0 > 'Z' && (p0 < 'a' || (p0 > 'z' && (p0 < '0' || (p0 > '9' && (("_-!.~\'\(\)*").indexOf(p0) != -1 || (p1 != null && p1.indexOf(p0) != -1))))))))? true: false;
       return b;
    }
    public static Uri f(String p0){
       return new Uri$StringUri(p0);
    }
    public int a(Uri p0){
       return (this.toString()).compareTo(p0.toString());
    }
    public abstract String c();
    public int compareTo(Object p0){
       return this.a(p0);
    }
    public abstract String d();
    public boolean equals(Object p0){
       if (!p0 instanceof Uri) {
          return false;
       }
       return (this.toString()).equals(p0.toString());
    }
    public int hashCode(){
       return (this.toString()).hashCode();
    }
}
