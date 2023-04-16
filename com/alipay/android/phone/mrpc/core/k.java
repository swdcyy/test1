package com.alipay.android.phone.mrpc.core.k;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import com.alipay.android.phone.mrpc.core.k$a;
import android.text.format.Time;
import java.lang.IllegalArgumentException;
import java.lang.Character;

public final class k	// class@000e51
{
    public static final Pattern a;
    public static final Pattern b;

    static {
       k.a = Pattern.compile("\([0-9]{1,2}\)[- ]\([A-Za-z]{3,9}\)[- ]\([0-9]{2,4}\)[ ]\([0-9]{1,2}:[0-9][0-9]:[0-9][0-9]\)");
       k.b = Pattern.compile("[ ]\([A-Za-z]{3,9}\)[ ]+\([0-9]{1,2}\)[ ]\([0-9]{1,2}:[0-9][0-9]:[0-9][0-9]\)[ ]\([0-9]{2,4}\)");
    }
    public static long a(String p0){
       int i3;
       int i4;
       k$a uoa;
       int i5;
       Matcher matcher = k.a.matcher(p0);
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       if (matcher.find()) {
          i3 = k.b(matcher.group(1));
          i4 = k.c(matcher.group(i2));
          i1 = k.d(matcher.group(i1));
          uoa = k.e(matcher.group(i));
       }else {
          Matcher matcher1 = k.b.matcher(p0);
          if (matcher1.find()) {
             i4 = k.c(matcher1.group(1));
             i1 = k.d(matcher1.group(i));
             i3 = k.b(matcher1.group(i2));
             uoa = k.e(matcher1.group(i1));
          }else {
             throw new IllegalArgumentException();
          }
       }
       if (i1 >= 2038) {
          i5 = 2038;
       }else {
          int i6 = i3;
          int i7 = i4;
          i5 = i1;
       }
       Time time = new Time("UTC");
       time.set(uoa.c, uoa.b, uoa.a, 1, 0, i5);
       return time.toMillis(false);
    }
    public static int b(String p0){
       int i = 0;
       if (p0.length() == 2) {
          return (((p0.charAt(i) - 48) * 10) + (p0.charAt(1) - 48));
       }
       return (p0.charAt(i) - 48);
    }
    public static int c(String p0){
       int i = 0;
       int i1 = 1;
       int i2 = ((Character.toLowerCase(p0.charAt(i)) + Character.toLowerCase(p0.charAt(i1))) + Character.toLowerCase(p0.charAt(2))) - 291;
       int i3 = 9;
       if (i2 == i3) {
          return 11;
       }
       if (i2 == 10) {
          return i1;
       }
       if (i2 == 22) {
          return i;
       }
       if (i2 == 26) {
          return 7;
       }
       if (i2 == 29) {
          return 2;
       }
       if (i2 == 32) {
          return 3;
       }
       if (i2 == 40) {
          return 6;
       }
       if (i2 == 42) {
          return 5;
       }
       if (i2 == 48) {
          return 10;
       }
       switch (i2){
           case '#':
             return i3;
           case '$':
             i3 = 4;
             goto label_0050 ;
             break;
           case '%':
             return 8;
           default:
             throw new IllegalArgumentException();
       }
    }
    public static int d(String p0){
       int i = 1;
       if (p0.length() == 2) {
          int i1 = ((p0.charAt(0) - 48) * 10) + (p0.charAt(i) - 48);
          if (i1 >= 70) {
             return (i1 + 1900);
          }
          return (i1 + 2000);
       }else if(p0.length() == 3){
          return (((((p0.charAt(0) - 48) * 100) + ((p0.charAt(i) - 48) * 10)) + (p0.charAt(2) - 48)) + 1900);
       }else if(p0.length() == 4){
          return (((((p0.charAt(0) - 48) * 1000) + ((p0.charAt(i) - 48) * 100)) + ((p0.charAt(2) - 48) * 10)) + (p0.charAt(3) - 48));
       }else {
          return 1970;
       }
    }
    public static k$a e(String p0){
       int i2;
       int i = p0.charAt(0) - 48;
       int i1 = 1;
       if (p0.charAt(i1) != ':') {
          i2 = 2;
          i = (i * 10) + (p0.charAt(i1) - 48);
       }else {
          i2 = 1;
       }
       i2 = i2 + i1;
       int i3 = i2 + 1;
       int i4 = i3 + 1;
       i4 = i4 + i1;
       return new k$a(i, (((p0.charAt(i2) - 48) * 10) + (p0.charAt(i3) - 48)), (((p0.charAt(i4) - 48) * 10) + (p0.charAt((i4 + 1)) - 48)));
    }
}
