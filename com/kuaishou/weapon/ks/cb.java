package com.kuaishou.weapon.ks.cb;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import com.kuaishou.weapon.ks.af;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.weapon.ks.bh;
import com.kuaishou.weapon.ks.l;

public class cb	// class@001205
{
    public static int a = 255;

    public void cb(){
       super();
    }
    public static String a(Context p0){
       af uoaf = af.a(p0);
       String str = uoaf.a("plc001_cd_is", cb.a(uoaf, 128));
       if (TextUtils.isEmpty(str)) {
          str = bh.e(p0);
          uoaf.b("plc001_cd_is", str);
       }
       return str;
    }
    public static String a(Context p0,int p1){
       String str1;
       af uoaf = af.a(p0);
       String str = cb.a(uoaf, 128);
       if (p1 == 1) {
          str1 = "plc001_cd_is_1";
       }else if(p1 == 2){
          str1 = "plc001_cd_is_2";
       }else {
          str1 = "plc001_cd_is";
       }
       str = uoaf.a(str1, str);
       if (TextUtils.isEmpty(str)) {
          str = bh.i(p0, p1);
          uoaf.b(str1, str);
       }
       return str;
    }
    public static String a(Context p0,int p1,String p2){
       String str1;
       af uoaf = af.a(p0);
       int i = 1;
       String str = cb.a(uoaf, i);
       if (!p1) {
          str1 = "plc001_cd_ie_0";
       }else if(p1 == i){
          str1 = "plc001_cd_ie_1";
       }else {
          str1 = "plc001_cd_ie";
       }
       str = uoaf.a(str1, str);
       if (!cb.c(p0) && (!af.a(p0).a(i) && !TextUtils.isEmpty(p2))) {
          if (TextUtils.isEmpty(str) || ("RISK_NOT_ALLOWED").equals(str)) {
             uoaf.b(str1, p2);
          }
          return p2;
       }else if(TextUtils.isEmpty(str)){
          str = bh.d(p0, p1);
          uoaf.b(str1, str);
       }
       return str;
    }
    public static String a(Context p0,String p1){
       af uoaf = af.a(p0);
       int i = 1;
       String str = uoaf.a("plc001_cd_ie", cb.a(uoaf, i));
       if (!cb.c(p0) && (!af.a(p0).a(i) && !TextUtils.isEmpty(p1))) {
          if (TextUtils.isEmpty(str) || ("RISK_NOT_ALLOWED").equals(str)) {
             uoaf.b("plc001_cd_ie", p1);
          }
          return p1;
       }else if(TextUtils.isEmpty(str)){
          str = bh.d(p0);
          uoaf.b("plc001_cd_ie", str);
       }
       return str;
    }
    public static String a(af p0,int p1){
       String str = (p0.a(p1))? "": "RISK_NOT_ALLOWED";
       return str;
    }
    public static String b(Context p0){
       af uoaf = af.a(p0);
       String str = uoaf.a("plc001_cd_ic", cb.a(uoaf, 128));
       if (TextUtils.isEmpty(str)) {
          str = bh.f(p0);
          uoaf.b("plc001_cd_ic", str);
       }
       return str;
    }
    public static String b(Context p0,int p1){
       String str1;
       af uoaf = af.a(p0);
       String str = cb.a(uoaf, 128);
       if (p1 == 1) {
          str1 = "plc001_cd_ic_1";
       }else if(p1 == 2){
          str1 = "plc001_cd_ic_2";
       }else {
          str1 = "plc001_cd_ic";
       }
       str = uoaf.a(str1, str);
       if (TextUtils.isEmpty(str)) {
          String str2 = bh.h(p0, p1);
          if (TextUtils.isEmpty(str2)) {
             str2 = "RISK_GET_FIELD_EMPTY";
          }
          str = str2;
          uoaf.b(str1, str);
       }
       return str;
    }
    public static String b(Context p0,String p1){
       af uoaf = af.a(p0);
       int i = 2;
       String str = uoaf.a("plc001_cd_ai", cb.a(uoaf, i));
       if (!cb.c(p0) && (!af.a(p0).a(i) && !TextUtils.isEmpty(p1))) {
          if (TextUtils.isEmpty(str) || ("RISK_NOT_ALLOWED").equals(str)) {
             uoaf.b("plc001_cd_ai", p1);
          }
          return p1;
       }else if(TextUtils.isEmpty(str)){
          str = bh.g(p0);
          uoaf.b("plc001_cd_ai", str);
       }
       return str;
    }
    public static int c(Context p0){
       if (cb.a == -1) {
          cb.a = l.a(p0, "re_po_rt").c("plc001_pd_bss", 0);
       }
       return cb.a;
    }
}
