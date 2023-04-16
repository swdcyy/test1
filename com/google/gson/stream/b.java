package com.google.gson.stream.b;
import java.io.Closeable;
import java.io.Flushable;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.io.Writer;
import java.util.Objects;
import java.lang.Double;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.IllegalStateException;
import java.io.IOException;
import java.util.Arrays;

public class b implements Closeable, Flushable	// class@0005be
{
    public final Writer b;
    public int[] c;
    public int d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;
    public String i;
    public boolean j;
    public static final String[] k;
    public static final String[] l;

    static {
       String[] stringArray = new String[128];
       b.k = stringArray;
       int i = 0;
       for (int i1 = 0; i1 <= 31; i1 = i1 + 1) {
          Object[] objArray = new Object[1];
          objArray[i] = Integer.valueOf(i1);
          b.k[i1] = String.format("\\u%04x", objArray);
       }
       stringArray = b.k;
       stringArray[34] = "\\\"";
       stringArray[92] = "\\\\";
       stringArray[9] = "\\t";
       stringArray[8] = "\\b";
       stringArray[10] = "\\n";
       stringArray[13] = "\\r";
       stringArray[12] = "\\f";
       stringArray = stringArray.clone();
       b.l = stringArray;
       stringArray[60] = "\\u003c";
       stringArray[62] = "\\u003e";
       stringArray[38] = "\\u0026";
       stringArray[61] = "\\u003d";
       stringArray[39] = "\\u0027";
    }
    public void b(Writer p0){
       super();
       int[] ointArray = new int[32];
       this.c = ointArray;
       this.d = 0;
       this.y(6);
       this.f = ":";
       this.j = true;
       Objects.requireNonNull(p0, "out == null");
       this.b = p0;
    }
    public final void A(boolean p0){
       this.h = p0;
    }
    public final void C(boolean p0){
       this.g = p0;
    }
    public final void E(boolean p0){
       this.j = p0;
    }
    public final void I(String p0){
       object oobject;
       String[] l = (this.h != null)? b.l: b.k;
       this.b.write(34);
       int i = p0.length();
       int i1 = 0;
       int i2 = 0;
       while (i1 < i) {
          char c = p0.charAt(i1);
          if (c < 128) {
             oobject = l[c];
             if (oobject == null) {
             label_0042 :
                i1 = i1 + 1;
             }
          }else if(c == 8232){
             oobject = "\\u2028";
          }else if(c == 8233){
             oobject = "\\u2029";
          }
          if (i2 < i1) {
             int i3 = i1 - i2;
             this.b.write(p0, i2, i3);
          }
          this.b.write(oobject);
          i2 = i1 + 1;
          goto label_0042 ;
       }
       if (i2 < i) {
          this.b.write(p0, i2, (i - i2));
       }
       this.b.write(34);
       return;
    }
    public b J(double p0){
       this.Q();
       if (this.g == null && (Double.isNaN(p0) || Double.isInfinite(p0))) {
          throw new IllegalArgumentException("Numeric values must be finite, but was "+p0);
       }
       this.a();
       this.b.append(Double.toString(p0));
       return this;
    }
    public b K(long p0){
       this.Q();
       this.a();
       this.b.write(Long.toString(p0));
       return this;
    }
    public b L(Boolean p0){
       if (p0 == null) {
          return this.u();
       }
       this.Q();
       this.a();
       b tb = this.b;
       String str = (p0.booleanValue())? "true": "false";
       tb.write(str);
       return this;
    }
    public b M(Number p0){
       if (p0 == null) {
          return this.u();
       }
       this.Q();
       String str = p0.toString();
       if (this.g == null && (str.equals("-Infinity") || (str.equals("Infinity") || str.equals("NaN")))) {
          throw new IllegalArgumentException("Numeric values must be finite, but was "+p0);
       }
       this.a();
       this.b.append(str);
       return this;
    }
    public b O(String p0){
       if (p0 == null) {
          return this.u();
       }
       this.Q();
       this.a();
       this.I(p0);
       return this;
    }
    public b P(boolean p0){
       this.Q();
       this.a();
       b tb = this.b;
       String str = (p0)? "true": "false";
       tb.write(str);
       return this;
    }
    public final void Q(){
       if (this.i != null) {
          int i = this.x();
          if (i == 5) {
             this.b.write(44);
          }else if(i == 3){
             throw new IllegalStateException("Nesting problem.");
          }
          this.s();
          this.z(4);
          this.I(this.i);
          this.i = null;
       }
       return;
    }
    public final void a(){
       int i = this.x();
       int i1 = 2;
       if (i != 1) {
          if (i != i1) {
             if (i != 4) {
                if (i != 6) {
                   if (i == 7) {
                      if (this.g == null) {
                         throw new IllegalStateException("JSON must have only one top-level value.");
                      }
                   }else {
                      throw new IllegalStateException("Nesting problem.");
                   }
                }
                this.z(7);
             }else {
                this.b.append(this.f);
                this.z(5);
             }
          }else {
             this.b.append(',');
             this.s();
          }
       }else {
          this.z(i1);
          this.s();
       }
       return;
    }
    public b c(){
       this.Q();
       this.v(1, '[');
       return this;
    }
    public void close(){
       this.b.close();
       b td = this.d;
       int i = 1;
       if (td > i || (td == i && this.c[(td - i)] != 7)) {
          throw new IOException("Incomplete document");
       }
       this.d = 0;
       return;
    }
    public b e(){
       this.Q();
       this.v(3, '{');
       return this;
    }
    public final b f(int p0,int p1,char p2){
       int i = this.x();
       if (i != p1 && i != p0) {
          throw new IllegalStateException("Nesting problem.");
       }
       if (this.i != null) {
          throw new IllegalStateException("Dangling name: "+this.i);
       }
       this.d = this.d - 1;
       if (i == p1) {
          this.s();
       }
       this.b.write(p2);
       return this;
    }
    public void flush(){
       if (this.d == null) {
          throw new IllegalStateException("JsonWriter is closed.");
       }
       this.b.flush();
       return;
    }
    public b g(){
       this.f(1, 2, ']');
       return this;
    }
    public b j(){
       this.f(3, 5, '}');
       return this;
    }
    public final boolean k(){
       return this.j;
    }
    public final boolean l(){
       return this.h;
    }
    public boolean o(){
       return this.g;
    }
    public b p(String p0){
       if (p0 == null) {
          return this.u();
       }
       this.Q();
       this.a();
       this.b.append(p0);
       return this;
    }
    public b r(String p0){
       Objects.requireNonNull(p0, "name == null");
       if (this.i != null) {
          throw new IllegalStateException();
       }
       if (this.d == null) {
          throw new IllegalStateException("JsonWriter is closed.");
       }
       this.i = p0;
       return this;
    }
    public final void s(){
       if (this.e == null) {
          return;
       }
       this.b.write(10);
       b td = this.d;
       for (int i = 1; i < td; i = i + 1) {
          this.b.write(this.e);
       }
       return;
    }
    public b u(){
       if (this.i != null) {
          if (this.j != null) {
             this.Q();
          }else {
             this.i = null;
             return this;
          }
       }
       this.a();
       this.b.write("null");
       return this;
    }
    public final b v(int p0,char p1){
       this.a();
       this.y(p0);
       this.b.write(p1);
       return this;
    }
    public final int x(){
       b td = this.d;
       if (td != null) {
          return this.c[(td - 1)];
       }
       throw new IllegalStateException("JsonWriter is closed.");
    }
    public final void y(int p0){
       b td = this.d;
       b tc = this.c;
       if (td == tc.length) {
          this.c = Arrays.copyOf(tc, (td * 2));
       }
       tc = this.d;
       this.d = tc + 1;
       this.c[tc] = p0;
       return;
    }
    public final void z(int p0){
       this.c[(this.d - 1)] = p0;
    }
}
