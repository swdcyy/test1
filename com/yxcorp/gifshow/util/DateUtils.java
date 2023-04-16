package com.yxcorp.gifshow.util.DateUtils;
import java.util.concurrent.ConcurrentHashMap;
import android.content.Context;
import java.lang.String;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Integer;
import java.lang.System;
import java.lang.Math;
import java.util.Calendar;
import java.util.TimeZone;
import java.lang.StringBuilder;
import ekd.k1;
import java.util.Date;
import java.text.SimpleDateFormat;
import o56.c;
import o56.a;
import android.app.Application;
import java.util.Locale;
import java.util.Map;
import java.text.DecimalFormat;
import ekd.n0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.e0;
import java.text.NumberFormat;

public class DateUtils	// class@001ee0
{
    public static SimpleDateFormat a;
    public static SimpleDateFormat b;
    public static String c;
    public static NumberFormat d;
    public static final Map e;

    static {
       DateUtils.e = new ConcurrentHashMap();
    }
    public static String A(Context p0,long p1){
       int i;
       int i1;
       Object[] objArray;
       String str;
       Resources resources = p0.getResources();
       long l = 0xea60;
       if (p1 - l < 0) {
          i = (int)(p1 / 1000);
          i1 = (i == 1)? 0x7f103a56: 0x7f103a57;
          objArray = new Object[]{Integer.valueOf(i)};
          str = resources.getString(i1, objArray);
       }else {
          long l1 = 0x36ee80;
          if (p1 - l1 < 0) {
             i = (int)(p1 / l);
             i1 = (i == 1)? 0x7f103a48: 0x7f103a4b;
             objArray = new Object[]{Integer.valueOf(i)};
             str = resources.getString(i1, objArray);
          }else {
             objArray = 0x5265c00;
             if (p1 - objArray < 0) {
                i = (int)(p1 / l1);
                i1 = (i == 1)? 0x7f103a42: 0x7f103a45;
                objArray = new Object[]{Integer.valueOf(i)};
                str = resources.getString(i1, objArray);
             }else if(p1 - 0x9fa52400 < 0){
                i = (int)(p1 / objArray);
                i1 = (i == 1)? 0x7f103a3c: 0x7f103a3f;
                objArray = new Object[]{Integer.valueOf(i)};
                str = resources.getString(i1, objArray);
             }else {
                objArray = 0x7528ad000;
                if (p1 - objArray < 0) {
                   i = (int)(p1 / 0x9fa52400);
                   i1 = (i == 1)? 0x7f103a4f: 0x7f103a52;
                   objArray = new Object[]{Integer.valueOf(i)};
                   str = resources.getString(i1, objArray);
                }else {
                   i = (int)(p1 / objArray);
                   i1 = (i == 1)? 0x7f103a59: 0x7f103a5c;
                   objArray = new Object[]{Integer.valueOf(i)};
                   str = resources.getString(i1, objArray);
                }
             }
          }
       }
       return str;
    }
    public static String B(Context p0,long p1){
       String str;
       if (p1 - null <= 0) {
          return "";
       }
       Resources resources = p0.getResources();
       long l = Math.abs((System.currentTimeMillis() - p1));
       if (l - 0x5265c00 < 0) {
          return DateUtils.D(p0, p1);
       }
       if (l - 0x7528ad000 < 0) {
          str = DateUtils.e(p1, "/");
       }else {
          int i = (int)(l / 0x7528ad000);
          int i1 = 1;
          int i2 = (i == i1)? 0x7f103a5b: 0x7f103a5e;
          Object[] objArray = new Object[i1];
          objArray[0] = Integer.valueOf(i);
          str = resources.getString(i2, objArray);
       }
       return str;
    }
    public static String C(Context p0,long p1){
       String str;
       Object[] objArray;
       String str1;
       Resources resources = p0.getResources();
       long l = System.currentTimeMillis();
       long l1 = Math.abs((l - p1));
       long l2 = 0xea60;
       if (l1 - l2 < 0) {
          str = resources.getString(R.string.arg_RES_7f1017e3);
       }else if(l1 - 0x36ee80 < 0){
          int i = (int)(l1 / l2);
          int i1 = (i == 1)? 0x7f103a4a: 0x7f103a4e;
          objArray = new Object[]{Integer.valueOf(i)};
          str = resources.getString(i1, objArray);
       }else if(l1 - 0x5265c00 < 0){
          objArray = new Object[]{Integer.valueOf((int)(l1 / 0x36ee80))};
          str = resources.getString(R.string.arg_RES_7f103a44, objArray);
       }else {
          l1 = l - (((long)Calendar.getInstance().getTimeZone().getRawOffset() + l) % 0x5265c00);
          if (DateUtils.G(l, p1)) {
             if (p1 - (l1 - 0x5265c00) > 0) {
                return resources.getString(0x7f10525e)+" "+DateUtils.i(p1);
             }else {
                _monitor_enter("MM/dd HH:mm");
                if (k1.h()) {
                   Date uDate = new Date(p1);
                   str1 = DateUtils.u().format(uDate)+DateUtils.n("HH:mm").format(uDate);
                   _monitor_exit("MM/dd HH:mm");
                }else {
                   str1 = DateUtils.n("MM/dd HH:mm").format(new Date(p1));
                   _monitor_exit("MM/dd HH:mm");
                }
                return str1;
             }
          }else {
             return DateUtils.b(p1);
          }
       }
       return str;
    }
    public static String D(Context p0,long p1){
       String str;
       Object[] objArray;
       Resources resources = p0.getResources();
       long l = Math.abs((System.currentTimeMillis() - p1));
       long l1 = 0xea60;
       if (l - l1 < 0) {
          str = resources.getString(R.string.arg_RES_7f1017e3);
       }else if(l - 0x36ee80 < 0){
          int i = (int)(l / l1);
          int i1 = (i == 1)? 0x7f103a4a: 0x7f103a4e;
          objArray = new Object[]{Integer.valueOf(i)};
          str = resources.getString(i1, objArray);
       }else if(l - 0x5265c00 < 0){
          objArray = new Object[]{Integer.valueOf((int)(l / 0x36ee80))};
          str = resources.getString(R.string.arg_RES_7f103a44, objArray);
       }else {
          return DateUtils.i(p1);
       }
       return str;
    }
    public static SimpleDateFormat E(){
       String str = "yyyy/MM/dd";
       _monitor_enter(str);
       if (DateUtils.a == null) {
          try{
             DateUtils.a = new SimpleDateFormat("yyyy"+a.a().a().getResources().getString(0x7f104cf8)+"MM"+a.a().a().getResources().getString(0x7f104cf2)+"dd"+a.a().a().getResources().getString(0x7f104cef));
          }catch(java.lang.Exception e0){
             DateUtils.a = DateUtils.n("yyyy/MM/dd");
          }
       }
    }
    public static boolean F(long p0){
       return DateUtils.G(p0, System.currentTimeMillis());
    }
    public static boolean G(long p0,long p1){
       Calendar instance = Calendar.getInstance();
       instance.setTimeInMillis(p0);
       int i = 1;
       instance.setTimeInMillis(p1);
       if (instance.get(i) == instance.get(i)) {
       }else {
          i = false;
       }
       return i;
    }
    public static boolean H(long p0){
       return (DateUtils.n("yyyy.MM.dd").format(new Date(p0))).equals(DateUtils.m());
    }
    public static boolean I(long p0,long p1){
       return (DateUtils.n("yyyy.MM.dd").format(new Date(p0))).equals(DateUtils.n("yyyy.MM.dd").format(new Date(p1)));
    }
    public static boolean J(long p0){
       boolean b = (!DateUtils.l() - DateUtils.o(p0))? true: false;
       return b;
    }
    public static String a(long p0){
       _monitor_enter("yyyy-MM-dd HH:mm:ss");
       _monitor_exit("yyyy-MM-dd HH:mm:ss");
       return DateUtils.n("yyyy-MM-dd HH:mm:ss").format(new Date(p0));
    }
    public static String b(long p0){
       _monitor_enter("yyyy/MM/dd HH:mm");
       if (k1.h()) {
          Date uDate = new Date(p0);
          _monitor_exit("yyyy/MM/dd HH:mm");
          return DateUtils.E().format(uDate)+" "+DateUtils.n("HH:mm").format(uDate);
       }else {
          _monitor_exit("yyyy/MM/dd HH:mm");
          return DateUtils.n("yyyy/MM/dd HH:mm").format(new Date(p0));
       }
    }
    public static String c(long p0,String p1){
       _monitor_enter("yyyy/MM/dd HH:mm");
       _monitor_exit("yyyy/MM/dd HH:mm");
       return (DateUtils.n("yyyy/MM/dd HH:mm").format(new Date(p0))).replaceAll("/", p1);
    }
    public static String d(long p0){
       if (DateUtils.G(p0, System.currentTimeMillis())) {
          return DateUtils.e(p0, "-");
       }
       return DateUtils.c(p0, "-");
    }
    public static String e(long p0,String p1){
       _monitor_enter("MM/dd HH:mm");
       _monitor_exit("MM/dd HH:mm");
       return (DateUtils.n("MM/dd HH:mm").format(new Date(p0))).replaceAll("/", p1);
    }
    public static String f(long p0){
       _monitor_enter("yyyy/MM/dd");
       if (k1.h()) {
          _monitor_exit("yyyy/MM/dd");
          return DateUtils.E().format(new Date(p0));
       }else {
          _monitor_exit("yyyy/MM/dd");
          return DateUtils.n("yyyy/MM/dd").format(new Date(p0));
       }
    }
    public static String g(long p0){
       _monitor_enter("MM/dd");
       if (k1.h()) {
          _monitor_exit("MM/dd");
          return DateUtils.u().format(new Date(p0));
       }else {
          _monitor_exit("MM/dd");
          return DateUtils.n("MM/dd").format(new Date(p0));
       }
    }
    public static String h(long p0,String p1){
       _monitor_enter("MM/dd");
       String str = DateUtils.n("MM/dd").format(new Date(p0));
       if (p1 != null) {
          str = str.replaceAll("/", p1);
       }
       _monitor_exit("MM/dd");
       return str;
    }
    public static String i(long p0){
       _monitor_enter("HH:mm");
       _monitor_exit("HH:mm");
       return DateUtils.n("HH:mm").format(new Date(p0));
    }
    public static String j(long p0,String p1){
       _monitor_enter("yyyy/MM/dd");
       String str = DateUtils.n("yyyy/MM/dd").format(new Date(p0));
       if (p1 != null) {
          str = str.replaceAll("/", p1);
       }
       _monitor_exit("yyyy/MM/dd");
       return str;
    }
    public static long k(int p0,int p1,int p2,int p3){
       Calendar instance = Calendar.getInstance();
       instance.set(11, p0);
       instance.set(12, p1);
       instance.set(13, p2);
       instance.set(14, p3);
       return instance.getTime().getTime();
    }
    public static long l(){
       Calendar instance = Calendar.getInstance();
       instance.set(11, 23);
       instance.set(12, 59);
       instance.set(13, 59);
       instance.set(14, 999);
       return instance.getTime().getTime();
    }
    public static String m(){
       _monitor_enter("yyyy.MM.dd");
       _monitor_exit("yyyy.MM.dd");
       return DateUtils.n("yyyy.MM.dd").format(new Date(System.currentTimeMillis()));
    }
    public static SimpleDateFormat n(String p0){
       Locale uS = Locale.US;
       Map e = DateUtils.e;
       SimpleDateFormat simpleDateFo = e.get(p0);
       if (simpleDateFo != null) {
       }else {
          _monitor_enter(e);
          simpleDateFo = e.get(p0);
          if (simpleDateFo != null) {
             _monitor_exit(e);
          }else if(uS == null){
             simpleDateFo = new SimpleDateFormat(p0);
          }else {
             simpleDateFo = new SimpleDateFormat(p0, uS);
          }
          e.put(p0, simpleDateFo);
          _monitor_exit(e);
       }
       return simpleDateFo;
    }
    public static long o(long p0){
       Calendar instance = Calendar.getInstance();
       instance.setTime(new Date(p0));
       instance.set(11, 23);
       instance.set(12, 59);
       instance.set(13, 59);
       instance.set(14, 999);
       return instance.getTime().getTime();
    }
    public static String p(long p0){
       return DateUtils.q(p0, true);
    }
    public static String q(long p0,boolean p1){
       if (DateUtils.d == null) {
          DateUtils.d = n0.b("0.0");
       }
       if (TextUtils.x(DateUtils.c)) {
          DateUtils.c = e0.b.getString(0x7f1045e8);
       }
       StringBuilder str = DateUtils.d.format((double)((float)p0 / 1000.00f));
       String c = (p1)? DateUtils.c: "";
       return str+c;
    }
    public static int r(long p0,long p1){
       Calendar instance = Calendar.getInstance();
       instance.setTimeInMillis(p0);
       Calendar instance1 = Calendar.getInstance();
       instance1.setTimeInMillis(p1);
       int i = instance.get(6);
       int i1 = instance1.get(6);
       int i2 = 1;
       int i3 = instance.get(i2);
       int i4 = instance1.get(i2);
       if (i3 == i4) {
          return (i1 - i);
       }
       i2 = 0;
       while (i3 < i4) {
          int i5 = i3 % 4;
          if (!i5) {
             i5 = i3 % 100;
             if (i5) {
             label_0031 :
                i2 = i2 + 366;
             label_0036 :
                i3 = i3 + 1;
             }
          }
          i5 = i3 % 400;
          if (!i5) {
             goto label_0031 ;
          }else {
             i2 = i2 + 365;
             goto label_0036 ;
          }
       }
       return (i2 + (i1 - i));
    }
    public static String s(long p0){
       if (p0 - 0x36ee80 < 0) {
          return DateUtils.n("m:ss").format(new Date(p0));
       }
       DateUtils.n("HH:mm:ss").setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
       return DateUtils.n("HH:mm:ss").format(new Date(p0));
    }
    public static String t(long p0){
       return DateUtils.n("MM/dd HH:mm").format(new Date(p0));
    }
    public static SimpleDateFormat u(){
       String str = "MM/dd";
       _monitor_enter(str);
       if (DateUtils.b == null) {
          try{
             DateUtils.b = new SimpleDateFormat("MM"+a.a().a().getResources().getString(0x7f104cf2)+"dd"+a.a().a().getResources().getString(0x7f104cef));
          }catch(java.lang.Exception e0){
             DateUtils.b = DateUtils.n("MM/dd");
          }
       }
    }
    public static String v(long p0){
       if (p0 - 0x36ee80 < 0) {
          return DateUtils.n("mm:ss").format(new Date(p0));
       }
       DateUtils.n("HH:mm:ss").setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
       return DateUtils.n("HH:mm:ss").format(new Date(p0));
    }
    public static String w(Context p0,long p1){
       int i;
       int i1;
       Object[] objArray;
       String str;
       Object[] objArray1;
       long l = p1;
       if (l - null <= 0) {
          return "";
       }
       Resources resources = p0.getResources();
       long l1 = System.currentTimeMillis();
       long l2 = Math.abs((l1 - l));
       long l3 = 0x5265c00;
       long l4 = l1 - (((long)Calendar.getInstance().getTimeZone().getRawOffset() + l1) % l3);
       long l5 = l4 - l3;
       long l6 = l4 - 0xa4cb800;
       l4 = l4 - 0xf731400;
       long l7 = 0xea60;
       if (l2 - l7 < 0) {
          return resources.getString(0x7f1017e3);
       }
       if (l2 - 0x36ee80 < 0) {
          i = (int)(l2 / l7);
          i1 = (i == 1)? 0x7f103a4a: 0x7f103a4e;
          objArray = new Object[]{Integer.valueOf(i)};
          str = resources.getString(i1, objArray);
       }else if(l2 - 0x5265c00 < 0){
          i = (int)(l2 / 0x36ee80);
          i1 = (i == 1)? 0x7f103a44: 0x7f103a47;
          objArray = new Object[]{Integer.valueOf(i)};
          str = resources.getString(i1, objArray);
       }else if(l - l5 > 0){
          str = resources.getString(R.string.arg_RES_7f10525e);
       }else if(l - l6 > 0){
          objArray1 = new Object[]{Integer.valueOf(2)};
          str = resources.getString(R.string.arg_RES_7f103a41, objArray1);
       }else if(l - l4 > 0){
          objArray1 = new Object[]{Integer.valueOf(3)};
          str = resources.getString(R.string.arg_RES_7f103a41, objArray1);
       }else if(DateUtils.G(l1, l)){
          str = DateUtils.h(l, "-");
       }else {
          str = DateUtils.j(l, "-");
       }
       return str;
    }
    public static String x(Context p0,long p1){
       int i;
       int i1;
       String str;
       if (p1 <= 0) {
          return "";
       }
       Resources resources = p0.getResources();
       long l = System.currentTimeMillis() - p1;
       p1 = Math.abs(l);
       long l1 = 0xea60;
       if (l - l1 < 0) {
          return resources.getString(0x7f1017e3);
       }
       Object[] objArray = 0x36ee80;
       if (p1 - objArray < 0) {
          i = (int)(p1 / l1);
          i1 = (i == 1)? 0x7f103a4a: 0x7f103a4e;
          objArray = new Object[]{Integer.valueOf(i)};
          str = resources.getString(i1, objArray);
       }else {
          l1 = 0x5265c00;
          if (p1 - l1 < 0) {
             i = (int)(p1 / objArray);
             i1 = (i == 1)? 0x7f103a44: 0x7f103a47;
             objArray = new Object[]{Integer.valueOf(i)};
             str = resources.getString(i1, objArray);
          }else {
             objArray = 0x9fa52400;
             if (p1 - objArray < 0) {
                i = (int)(p1 / l1);
                i1 = (i == 1)? 0x7f103a3e: 0x7f103a41;
                objArray = new Object[]{Integer.valueOf(i)};
                str = resources.getString(i1, objArray);
             }else if(p1 - 0x7528ad000 < 0){
                i = (int)(p1 / objArray);
                i1 = (i == 1)? 0x7f103a51: 0x7f103a54;
                objArray = new Object[]{Integer.valueOf(i)};
                str = resources.getString(i1, objArray);
             }else {
                i = (int)(p1 / 0x7528ad000);
                i1 = (i == 1)? 0x7f103a5b: 0x7f103a5e;
                objArray = new Object[]{Integer.valueOf(i)};
                str = resources.getString(i1, objArray);
             }
          }
       }
       return str;
    }
    public static String y(long p0){
       return DateUtils.n("yyyy-MM-dd").format(new Date(p0));
    }
    public static String z(long p0){
       _monitor_enter("MM/dd HH:mm");
       if (k1.h()) {
          Date uDate = new Date(p0);
          _monitor_exit("MM/dd HH:mm");
          return DateUtils.u().format(uDate)+DateUtils.n("  HH:mm").format(uDate);
       }else {
          _monitor_exit("MM/dd HH:mm");
          return DateUtils.n("MM/dd HH:mm").format(new Date(p0));
       }
    }
}
