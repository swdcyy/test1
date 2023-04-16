package n0.a;
import android.text.Spanned;
import android.text.GetChars;
import java.lang.Object;
import android.text.Layout;
import android.text.style.ReplacementSpan;
import android.text.StaticLayout;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Class;
import java.lang.Math;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.lang.System;

public class a implements Spanned, GetChars	// class@0026a6
{
    public final Spanned b;
    public Layout c;
    public int d;
    public int e;
    public ReplacementSpan f;
    public static final char[] g;

    static {
       char[] uocharArray = new char[]{8230};
       a.g = uocharArray;
    }
    public void a(Spanned p0){
       super();
       this.d = -1;
       this.e = -1;
       this.b = p0;
    }
    public void a(int p0,int p1,int p2,char[] p3,int p4){
       char c;
       int i2;
       int ellipsisCoun = this.c.getEllipsisCount(p2);
       if (!ellipsisCoun) {
          return;
       }
       int ellipsisStar = this.c.getEllipsisStart(p2);
       p2 = this.c.getLineStart(p2);
       int i = ellipsisStar;
       int i1 = ellipsisStar + ellipsisCoun;
       while (i < i1) {
          if (i == ellipsisStar) {
             c = a.g[0];
             i2 = i + p2;
             this.d = i2;
             i2 = i2 + ellipsisCoun;
             this.e = i2;
          }else {
             c = 0xfeff;
          }
          i2 = i + p2;
          if (i2 >= p0 && i2 < p1) {
             i2 = i2 + p4;
             i2 = i2 - p0;
             p3[i2] = c;
          }
          i = i + 1;
       }
       return;
    }
    public Spanned b(){
       return this.b;
    }
    public void c(ReplacementSpan p0){
       this.f = p0;
    }
    public char charAt(int p0){
       return this.b.charAt(p0);
    }
    public void d(StaticLayout p0){
       this.c = p0;
    }
    public void getChars(int p0,int p1,char[] p2,int p3){
       TextUtils.getChars(this.b, p0, p1, p2, p3);
       a tc = this.c;
       if (tc != null) {
          int lineForOffse1 = this.c.getLineForOffset(p1);
          for (int lineForOffse = tc.getLineForOffset(p0); lineForOffse <= lineForOffse1; lineForOffse = lineForOffse + 1) {
             this.a(p0, p1, lineForOffse, p2, p3);
          }
       }
       return;
    }
    public int getSpanEnd(Object p0){
       a tf = this.f;
       if (tf != null && tf == p0) {
          return this.e;
       }
       return this.b.getSpanEnd(p0);
    }
    public int getSpanFlags(Object p0){
       a tf = this.f;
       if (tf != null && tf == p0) {
          return 17;
       }
       return this.b.getSpanFlags(p0);
    }
    public int getSpanStart(Object p0){
       a tf = this.f;
       if (tf != null && tf == p0) {
          return this.d;
       }
       return this.b.getSpanStart(p0);
    }
    public Object[] getSpans(int p0,int p1,Class p2){
       if (this.e >= p1) {
          a td = this.d;
          if (td <= p1) {
             Object[] spans = this.b.getSpans(p0, Math.max(td, p0), p2);
             Object[] spans1 = this.b.getSpans(Math.min(p1, this.e), p1, p2);
             int i = (this.f != null && (p2.isAssignableFrom(ReplacementSpan.class) || p2 == this.f.getClass()))? 1: 0;
             int i1 = (spans.length + spans1.length) + i;
             Object[] objArray = Array.newInstance(p2, i1);
             if (objArray.length > i1) {
                objArray = Arrays.copyOf(objArray, i1);
             }
             System.arraycopy(spans, 0, objArray, 0, spans.length);
             if (i > 0) {
                objArray[spans.length] = this.f;
             }
             System.arraycopy(spans1, 0, objArray, (spans.length + i), spans1.length);
             return objArray;
          }
       }
       return this.b.getSpans(p0, p1, p2);
    }
    public int length(){
       return this.b.length();
    }
    public int nextSpanTransition(int p0,int p1,Class p2){
       return this.b.nextSpanTransition(p0, p1, p2);
    }
    public CharSequence subSequence(int p0,int p1){
       return this.b.subSequence(p0, p1);
    }
}
