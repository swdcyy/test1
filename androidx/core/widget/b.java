package androidx.core.widget.b;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.graphics.Paint$FontMetricsInt;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.method.TransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.os.Build$VERSION;
import java.util.Locale;
import android.icu.text.DecimalFormatSymbols;
import java.lang.String;
import java.lang.Character;
import y1.c$a;
import android.text.PrecomputedText$Params;
import y1.c$a$a;
import android.graphics.Paint;
import androidx.core.widget.a;
import android.content.res.ColorStateList;
import java.lang.Object;
import z1.h;
import e2.j;
import android.graphics.PorterDuff$Mode;
import java.lang.Math;
import y1.c;
import android.text.PrecomputedText;
import java.lang.CharSequence;
import java.lang.IllegalArgumentException;
import android.content.Context;
import android.view.ActionMode$Callback;
import androidx.core.widget.b$a;

public final class b	// class@000731
{
    public static Field a;
    public static boolean b;
    public static Field c;
    public static boolean d;
    public static Field e;
    public static boolean f;
    public static Field g;
    public static boolean h;

    public static Drawable[] a(TextView p0){
       return p0.getCompoundDrawablesRelative();
    }
    public static int b(TextView p0){
       return (p0.getPaddingTop() - p0.getPaint().getFontMetricsInt().top);
    }
    public static int c(TextView p0){
       return (p0.getPaddingBottom() + p0.getPaint().getFontMetricsInt().bottom);
    }
    public static int d(TextView p0){
       return p0.getMaxLines();
    }
    public static int e(TextDirectionHeuristic p0){
       if (p0 == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
          return 1;
       }
       if (p0 == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
          return 1;
       }
       if (p0 == TextDirectionHeuristics.ANYRTL_LTR) {
          return 2;
       }
       if (p0 == TextDirectionHeuristics.LTR) {
          return 3;
       }
       if (p0 == TextDirectionHeuristics.RTL) {
          return 4;
       }
       if (p0 == TextDirectionHeuristics.LOCALE) {
          return 5;
       }
       if (p0 == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
          return 6;
       }
       if (p0 == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
          return 7;
       }
       return 1;
    }
    public static TextDirectionHeuristic f(TextView p0){
       if (p0.getTransformationMethod() instanceof PasswordTransformationMethod) {
          return TextDirectionHeuristics.LTR;
       }
       int i = 0;
       if (Build$VERSION.SDK_INT >= 28 && (p0.getInputType() & 0x0f) == 3) {
          byte directionali = Character.getDirectionality((DecimalFormatSymbols.getInstance(p0.getTextLocale()).getDigitStrings()[i]).codePointAt(i));
          if (directionali == 1 || directionali == 2) {
             return TextDirectionHeuristics.RTL;
          }else {
             return TextDirectionHeuristics.LTR;
          }
       }else if(p0.getLayoutDirection() == 1){
          i = 1;
       }
       switch (p0.getTextDirection()){
           case 2:
             return TextDirectionHeuristics.ANYRTL_LTR;
           case 3:
             return TextDirectionHeuristics.LTR;
           case 4:
             return TextDirectionHeuristics.RTL;
           case 5:
             return TextDirectionHeuristics.LOCALE;
           case 6:
             return TextDirectionHeuristics.FIRSTSTRONG_LTR;
           case 7:
             return TextDirectionHeuristics.FIRSTSTRONG_RTL;
           default:
             TextDirectionHeuristic fIRSTSTRONG_ = (i)? TextDirectionHeuristics.FIRSTSTRONG_RTL: TextDirectionHeuristics.FIRSTSTRONG_LTR;
             return fIRSTSTRONG_;
       }
    }
    public static c$a g(TextView p0){
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 28) {
          return new c$a(p0.getTextMetricsParams());
       }
       c$a$a uoa$a = new c$a$a(new TextPaint(p0.getPaint()));
       if (sDK_INT >= 23) {
          uoa$a.b(p0.getBreakStrategy());
          uoa$a.c(p0.getHyphenationFrequency());
       }
       uoa$a.d(b.f(p0));
       return uoa$a.a();
    }
    public static void h(TextView p0,int p1,int p2,int p3,int p4){
       if (Build$VERSION.SDK_INT >= 27) {
          p0.setAutoSizeTextTypeUniformWithConfiguration(p1, p2, p3, p4);
       }else if(p0 instanceof a){
          p0.setAutoSizeTextTypeUniformWithConfiguration(p1, p2, p3, p4);
       }
       return;
    }
    public static void i(TextView p0,int p1){
       if (Build$VERSION.SDK_INT >= 27) {
          p0.setAutoSizeTextTypeWithDefaults(p1);
       }else if(p0 instanceof a){
          p0.setAutoSizeTextTypeWithDefaults(p1);
       }
       return;
    }
    public static void j(TextView p0,ColorStateList p1){
       h.g(p0);
       if (Build$VERSION.SDK_INT >= 24) {
          p0.setCompoundDrawableTintList(p1);
       }else if(p0 instanceof j){
          p0.setSupportCompoundDrawablesTintList(p1);
       }
       return;
    }
    public static void k(TextView p0,PorterDuff$Mode p1){
       h.g(p0);
       if (Build$VERSION.SDK_INT >= 24) {
          p0.setCompoundDrawableTintMode(p1);
       }else if(p0 instanceof j){
          p0.setSupportCompoundDrawablesTintMode(p1);
       }
       return;
    }
    public static void l(TextView p0,Drawable p1,Drawable p2,Drawable p3,Drawable p4){
       p0.setCompoundDrawablesRelative(p1, p2, p3, p4);
    }
    public static void m(TextView p0,int p1,int p2,int p3,int p4){
       p0.setCompoundDrawablesRelativeWithIntrinsicBounds(p1, p2, p3, p4);
    }
    public static void n(TextView p0,int p1){
       h.d(p1);
       if (Build$VERSION.SDK_INT >= 28) {
          p0.setFirstBaselineToTopHeight(p1);
          return;
       }else {
          Paint$FontMetricsInt fontMetricsI = p0.getPaint().getFontMetricsInt();
          fontMetricsI = (p0.getIncludeFontPadding())? fontMetricsI.top: fontMetricsI.ascent;
          if (p1 > Math.abs(fontMetricsI)) {
             p0.setPadding(p0.getPaddingLeft(), (p1 + fontMetricsI), p0.getPaddingRight(), p0.getPaddingBottom());
          }
          return;
       }
    }
    public static void o(TextView p0,int p1){
       h.d(p1);
       Paint$FontMetricsInt fontMetricsI = p0.getPaint().getFontMetricsInt();
       fontMetricsI = (p0.getIncludeFontPadding())? fontMetricsI.bottom: fontMetricsI.descent;
       if (p1 > Math.abs(fontMetricsI)) {
          p0.setPadding(p0.getPaddingLeft(), p0.getPaddingTop(), p0.getPaddingRight(), (p1 - fontMetricsI));
       }
       return;
    }
    public static void p(TextView p0,int p1){
       h.d(p1);
       int fontMetricsI = p0.getPaint().getFontMetricsInt(null);
       if (p1 != fontMetricsI) {
          p0.setLineSpacing((float)(p1 - fontMetricsI), 0x3f800000);
       }
       return;
    }
    public static void q(TextView p0,c p1){
       if (Build$VERSION.SDK_INT >= 29) {
          p0.setText(p1.b());
       }else if(b.g(p0).a(p1.a())){
          p0.setText(p1);
       }else {
          throw new IllegalArgumentException("Given text can not be applied to TextView.");
       }
       return;
    }
    public static void r(TextView p0,int p1){
       if (Build$VERSION.SDK_INT >= 23) {
          p0.setTextAppearance(p1);
       }else {
          p0.setTextAppearance(p0.getContext(), p1);
       }
       return;
    }
    public static void s(TextView p0,c$a p1){
       p0.setTextDirection(b.e(p1.d()));
       if (Build$VERSION.SDK_INT < 23) {
          float textScaleX = p1.e().getTextScaleX();
          p0.getPaint().set(p1.e());
          if (!textScaleX - p0.getTextScaleX()) {
             p0.setTextScaleX(((textScaleX / 2.00f) + 0x3f800000));
          }
          p0.setTextScaleX(textScaleX);
       }else {
          p0.getPaint().set(p1.e());
          p0.setBreakStrategy(p1.b());
          p0.setHyphenationFrequency(p1.c());
       }
       return;
    }
    public static ActionMode$Callback t(TextView p0,ActionMode$Callback p1){
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 26 && (sDK_INT > 27 || p1 instanceof b$a)) {
          return p1;
       }
       return new b$a(p1, p0);
    }
}
