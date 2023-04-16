package com.yxcorp.gifshow.util.span.SpannableStringBuilderUtils;
import android.text.SpannableStringBuilder;
import java.lang.String;
import java.lang.CharSequence;
import android.text.style.AbsoluteSizeSpan;
import java.lang.Object;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.graphics.Typeface;
import com.yxcorp.gifshow.util.span.CustomTypefaceSpan;
import goc.d;
import android.text.style.ReplacementSpan;
import lnc.u9;
import android.widget.TextView;
import android.text.style.ClickableSpan;
import com.yxcorp.gifshow.util.span.SpannableStringBuilderUtils$1;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import android.text.style.StrikethroughSpan;

public final class SpannableStringBuilderUtils	// class@000d05
{

    public static void a(SpannableStringBuilder p0,String p1,int p2){
       p0.append(p1);
       p0.setSpan(new AbsoluteSizeSpan(p2, false), p0.length(), p0.length(), 33);
    }
    public static void b(SpannableStringBuilder p0,CharSequence p1,int p2){
       p0.append(p1);
       p0.setSpan(new ForegroundColorSpan(p2), p0.length(), p0.length(), 33);
    }
    public static void c(SpannableStringBuilder p0,String p1,int p2,int p3,int p4){
       int i = p0.length();
       p0.append(p1);
       int i1 = p0.length();
       p0.setSpan(new AbsoluteSizeSpan(p2, false), i, i1, 33);
       p0.setSpan(new ForegroundColorSpan(p3), i, i1, 33);
       p0.setSpan(new StyleSpan(p4), i, i1, 33);
    }
    public static void d(SpannableStringBuilder p0,String p1,int p2,int p3,Typeface p4){
       int i = p0.length();
       p0.append(p1);
       int i1 = p0.length();
       p0.setSpan(new AbsoluteSizeSpan(p2, false), i, i1, 33);
       p0.setSpan(new CustomTypefaceSpan("", p4), i, i1, 33);
       p0.setSpan(new ForegroundColorSpan(p3), i, i1, 33);
    }
    public static void e(SpannableStringBuilder p0,String p1,int p2,int p3,boolean p4){
       int i = p0.length();
       p0.append(p1);
       int i1 = p0.length();
       p0.setSpan(new AbsoluteSizeSpan(p2, false), i, i1, 33);
       p0.setSpan(new StyleSpan(false), i, i1, 33);
       if (p4) {
          p0.setSpan(new d(p3), i, i1, 33);
       }
       return;
    }
    public static void f(SpannableStringBuilder p0,String p1,int p2,int p3,boolean p4,Typeface p5){
       int i = p0.length();
       p0.append(p1);
       int i1 = p0.length();
       p0.setSpan(new AbsoluteSizeSpan(p2, false), i, i1, 33);
       p0.setSpan(new CustomTypefaceSpan("", p5), i, i1, 33);
       if (p4) {
          p0.setSpan(new d(p3), i, i1, 33);
       }
       return;
    }
    public static void g(SpannableStringBuilder p0,ReplacementSpan p1){
       p0.append(" ");
       int i = p0.length() - 1;
       p0.setSpan(p1, i, (i + 1), 33);
    }
    public static void h(SpannableStringBuilder p0,String p1,int p2,int p3){
       int i = p0.length();
       p0.append(p1);
       int i1 = p0.length();
       p0.setSpan(new AbsoluteSizeSpan(p2, false), i, i1, 33);
       p0.setSpan(new ForegroundColorSpan(p3), i, i1, 33);
    }
    public static void i(SpannableStringBuilder p0,int p1){
       p0.append(" ");
       int i = p0.length() - 1;
       p0.setSpan(new u9(p1), i, (i + 1), 33);
    }
    public static void j(TextView p0,SpannableStringBuilder p1,int p2,int p3,ClickableSpan p4,boolean p5,int p6){
       p3 = p3 + p2;
       int i = 33;
       try{
          p1.setSpan(p4, p2, p3, i);
          p1.setSpan(new ForegroundColorSpan(p6), p2, p3, i);
          p1.setSpan(new SpannableStringBuilderUtils$1(p5), p2, p3, i);
          p0.setHighlightColor(0);
          p0.setMovementMethod(LinkMovementMethod.getInstance());
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static void k(SpannableStringBuilder p0,int p1,CharSequence p2){
       if (p0.length() < p2.length()) {
          return;
       }
       p0.setSpan(new ForegroundColorSpan(p1), (p0.length() - p2.length()), p0.length(), 33);
       return;
    }
    public static void l(SpannableStringBuilder p0,CharSequence p1,int p2){
       if (p0.length() < p1.length()) {
          return;
       }
       p0.setSpan(new StyleSpan(p2), (p0.length() - p1.length()), p0.length(), 33);
       return;
    }
    public static void m(SpannableStringBuilder p0,CharSequence p1){
       if (p0.length() < p1.length()) {
          return;
       }
       p0.setSpan(new StrikethroughSpan(), (p0.length() - p1.length()), p0.length(), 33);
       return;
    }
    public static void n(SpannableStringBuilder p0,Typeface p1,CharSequence p2){
       if (p0.length() < p2.length()) {
          return;
       }
       p0.setSpan(new CustomTypefaceSpan("", p1), (p0.length() - p2.length()), p0.length(), 33);
       return;
    }
}
