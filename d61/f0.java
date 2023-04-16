package d61.f0;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import java.lang.Math;
import android.widget.TextView;
import android.graphics.Typeface;
import android.content.Context;
import ekd.d0;
import qq3.a;
import java.lang.Throwable;
import q87.c;
import java.lang.Long;
import java.util.Locale;

public final class f0	// class@001f19
{

    public void f0(){
       super();
    }
    public static String a(String p0,int p1){
       f0 uof0 = f0.class;
       if (PatchProxy.isSupport(uof0)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uof0, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (TextUtils.x(p0)) {
          return p0;
       }else if(p0.length() <= p1){
          return p0;
       }else {
          return TextUtils.A(p0, Math.max((p1 - 1), 1))+"...";
       }
    }
    public static String b(String p0,int p1){
       f0 uof0 = f0.class;
       if (PatchProxy.isSupport(uof0)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uof0, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (TextUtils.x(p0) || !p1) {
          return "";
       }else if(p0.length() <= (p1 / 2)){
          return p0;
       }else {
          p1 = p1 * 2;
          int i = 0;
          int i1 = 0;
          int i2 = 0;
          while (i1 < p0.length()) {
             i2 = (p0.charAt(i1) < 128)? i2 + 1: i2 + 2;
             if (i2 > p1) {
                i = i1;
                break ;
             }
             i1 = i1 + 1;
          }
          if (i2 <= p1) {
             return p0;
          }else {
             return TextUtils.A(p0, i);
          }
       }
    }
    public static String c(String p0,int p1){
       f0 uof0 = f0.class;
       if (PatchProxy.isSupport(uof0)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uof0, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (TextUtils.x(p0) || !p1) {
          return "";
       }else if(p0.length() <= (p1 / 2)){
          return p0;
       }else {
          p1 = p1 * 2;
          int i = 0;
          int i1 = 0;
          int i2 = 0;
          while (i1 < p0.length()) {
             i2 = (p0.charAt(i1) < 128)? i2 + 1: i2 + 2;
             if (i2 > p1) {
                i = i1;
                break ;
             }
             i1 = i1 + 1;
          }
          if (i2 <= p1) {
             return p0;
          }else {
             return TextUtils.A(p0, i)+"...";
          }
       }
    }
    public static String d(String p0,int p1){
       f0 uof0 = f0.class;
       if (PatchProxy.isSupport(uof0)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uof0, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (TextUtils.x(p0)) {
          return p0;
       }else if(p1 >= TextUtils.f(p0)){
          return p0;
       }else {
          return TextUtils.A(p0, p1)+"...";
       }
    }
    public static void e(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, f0.class, "6")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.setTypeface(Typeface.defaultFromStyle(3));
       return;
    }
    public static void f(TextView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, f0.class, "4")) {
          return;
       }
       f0.g(p0, p1, 0);
       return;
    }
    public static void g(TextView p0,String p1,int p2){
       if (PatchProxy.isSupport(f0.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, f0.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       try{
          p0.setTypeface(Typeface.create(p1, p2));
          return;
       }catch(java.lang.IndexOutOfBoundsException e0){
       }
    }
    public static void h(String p0,TextView[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, f0.class, "3")) {
          return;
       }
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          f0.g(p1[i], p0, 0);
       }
       return;
    }
    public static void i(TextView p0,Context p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, f0.class, "5")) {
          return;
       }
       try{
          if (p0 != null && p1 != null) {
             Typeface typeface = d0.a("alte-din.ttf", p1);
             if (typeface != null) {
                p0.setTypeface(typeface);
             }
          }
          return;
       }catch(java.lang.IndexOutOfBoundsException e0){
       }
    }
    public static void j(TextView p0,Typeface p1,int p2){
       if (PatchProxy.isSupport(f0.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, f0.class, "7")) {
          return;
       }
       try{
          p0.setTypeface(p1, p2);
       }catch(java.lang.Exception e7){
          Object[] objArray = new Object[0];
          a.C().u("setTypefaceError", e7, objArray);
       }
       return;
    }
    public static String k(long p0){
       f0 uof0 = f0.class;
       if (PatchProxy.isSupport(uof0)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, uof0, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return TextUtils.Q(Locale.getDefault(), p0);
    }
}
