package com.google.gson.stream.a;
import java.io.Closeable;
import java.lang.String;
import com.google.gson.stream.a$a;
import com.google.gson.internal.a;
import java.io.Reader;
import java.lang.Object;
import java.util.Objects;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import com.google.gson.stream.JsonToken;
import java.lang.Math;
import java.io.IOException;
import java.lang.Long;
import java.lang.AssertionError;
import java.util.Arrays;
import java.lang.NumberFormatException;
import com.google.gson.stream.MalformedJsonException;
import java.lang.System;
import java.lang.Class;
import java.lang.Double;
import java.lang.Integer;
import java.io.EOFException;

public class a implements Closeable	// class@0005bd
{
    public final Reader b;
    public boolean c;
    public final char[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public long j;
    public int k;
    public String l;
    public int[] m;
    public int n;
    public String[] o;
    public int[] p;
    public static final char[] q;

    static {
       a.q = ("\)]}\'\n").toCharArray();
       a.a = new a$a();
    }
    public void a(Reader p0){
       super();
       this.c = false;
       char[] uocharArray = new char[1024];
       this.d = uocharArray;
       this.e = 0;
       this.f = 0;
       this.g = 0;
       this.h = 0;
       this.i = 0;
       int[] ointArray = new int[32];
       this.m = ointArray;
       this.n = 0;
       this.n = false + 1;
       ointArray[0] = 6;
       String[] stringArray = new String[32];
       this.o = stringArray;
       int[] ointArray1 = new int[32];
       this.p = ointArray1;
       Objects.requireNonNull(p0, "in == null");
       this.b = p0;
    }
    public void A(){
       a ti = this.i;
       if (ti == null) {
          ti = this.f();
       }
       if (ti == 7) {
          this.i = 0;
          ti = this.p;
          int i = this.n - 1;
          ti[i] = ti[i] + 1;
          return;
       }else {
          throw new IllegalStateException("Expected null but was "+this.J()+this.r());
       }
    }
    public final String C(char p0){
       int i1;
       int i2;
       int i3;
       a td = this.d;
       StringBuilder str = null;
       do {
          a te = this.e;
          a tf = this.f;
          while (true) {
             a uoa = tf;
             tf = te;
             break ;
          }
          while (true) {
             int i = 16;
             if (te < uoa) {
                i1 = te + 1;
                char c = td[te];
                if (c == p0) {
                   this.e = i1;
                   i1 = (i1 - tf) - 1;
                   if (str == null) {
                      break ;
                   }else {
                      return str+td;
                   }
                }else if(c == '\'){
                   this.e = i1;
                   i1 = i1 - tf;
                   i1 = i1 - 1;
                   if (str == null) {
                      i2 = i1 + 1;
                      i2 = i2 * 2;
                      str = new StringBuilder(Math.max(i2, i));
                   }
                   str = str+td+this.L();
                   te = this.e;
                   tf = this.f;
                }else if(c == 10){
                   i3 = this.g + 1;
                   this.g = i3;
                   this.h = i1;
                }
                i3 = i1;
             }else if(str == null){
                i2 = te - tf;
                i2 = i2 * 2;
                str = new StringBuilder(Math.max(i2, i));
             }
             int i4 = te - tf;
             str = str+td;
             this.e = te;
             if (this.k(1)) {
                continue ;
             }else {
             }
          }
          return new String(td, tf, i1);
       } while (this.k(1));
       this.R("Unterminated string");
       throw null;
    }
    public String E(){
       String str;
       a ti = this.i;
       if (ti == null) {
          ti = this.f();
       }
       if (ti == 10) {
          str = this.I();
       }else if(ti == 8){
          str = this.C(''');
       }else if(ti == 9){
          str = this.C('"');
       }else if(ti == 11){
          str = this.l;
          this.l = null;
       }else if(ti == 15){
          str = Long.toString(this.j);
       }else if(ti == 16){
          str = new String(this.d, this.e, this.k);
          this.e = this.e + this.k;
       }else {
          throw new IllegalStateException("Expected a string but was "+this.J()+this.r());
       }
       this.i = 0;
       a tp = this.p;
       int i = this.n - 1;
       tp[i] = tp[i] + 1;
       return str;
    }
    public final String I(){
       int i3;
       int i = 0;
       String str = null;
       do {
          int i1 = 0;
          while (true) {
             a te = this.e;
             int i2 = te + i1;
             if (i2 < this.f) {
                i3 = te + i1;
                char c = this.d[i3];
                if (c != 9 && (c != 10 && (c != 12 && (c != 13 && c != ' ')))) {
                   if (c != '#') {
                      if (c != ',') {
                         if (c != '/' && c != '=') {
                            if (c != '{' && (c != '}' && c != ':')) {
                               if (c != ';') {
                                  switch (c){
                                      case '[':
                                      case ']':
                                     label_005c :
                                        i = i1;
                                        break;
                                      case 92:
                                        break;
                                      default:
                                        i1 = i1 + 1;
                                  }
                               }
                            }else {
                               goto label_005c ;
                            }
                         }
                      }else {
                         goto label_005c ;
                      }
                   }
                   this.e();
                   goto label_005c ;
                }else {
                   goto label_005c ;
                }
             }else if(i1 < this.d.length){
                i3 = i1 + 1;
                if (this.k(i3)) {
                   continue ;
                }else {
                   goto label_005c ;
                }
             }else if(str == null){
                str = new StringBuilder(Math.max(i1, 16));
             }
             str = str+this.d;
             i3 = this.e + i1;
             this.e = i3;
             if (!this.k(1)) {
             }else {
                continue ;
             }
          }
       } while (!this.k(1));
       str = (str == null)? new String(this.d, this.e, i): str+this.d;
       this.e = this.e + i;
       return str;
    }
    public JsonToken J(){
       a ti = this.i;
       if (ti == null) {
          ti = this.f();
       }
       switch (ti){
           case 1:
             return JsonToken.BEGIN_OBJECT;
           case 2:
             return JsonToken.END_OBJECT;
           case 3:
             return JsonToken.BEGIN_ARRAY;
           case 4:
             return JsonToken.END_ARRAY;
           case 5:
           case 6:
             return JsonToken.BOOLEAN;
           case 7:
             return JsonToken.NULL;
           case 8:
           case 10:
           case 11:
           case 9:
             return JsonToken.STRING;
           case 12:
           case 14:
           case 13:
             return JsonToken.NAME;
           case 15:
           case 16:
             return JsonToken.NUMBER;
           case 17:
             return JsonToken.END_DOCUMENT;
           default:
             throw new AssertionError();
       }
    }
    public final void K(int p0){
       a tn = this.n;
       a tm = this.m;
       if (tn == tm.length) {
          int i = tn * 2;
          this.m = Arrays.copyOf(tm, i);
          this.p = Arrays.copyOf(this.p, i);
          this.o = Arrays.copyOf(this.o, i);
       }
       tm = this.n;
       this.n = tm + 1;
       this.m[tm] = p0;
       return;
    }
    public final char L(){
       int i5;
       String str = "Unterminated escape sequence";
       a uoa = null;
       int i = 1;
       if (this.e != this.f || this.k(i)) {
          a te = this.e;
          int i1 = te + 1;
          this.e = i1;
          char c = this.d[te];
          int i2 = 10;
          if (c != i2) {
             if (c != '"' && (c != ''' && (c != '/' && c != '\'))) {
                if (c != 'b') {
                   a uoa1 = 102;
                   if (c != uoa1) {
                      if (c != 'n') {
                         if (c != 'r') {
                            if (c != 't') {
                               if (c == 'u') {
                                  int i3 = 4;
                                  if ((i1 + i3) <= this.f || this.k(i3)) {
                                     int i4 = 0;
                                     uoa = this.e;
                                     i1 = uoa + 4;
                                     while (true) {
                                        if (uoa < i1) {
                                           char c1 = this.d[uoa];
                                           i4 = i4 << 4;
                                           char c2 = (char)i4;
                                           if (c1 >= '0' && c1 <= '9') {
                                              i5 = c1 - 48;
                                           }else if(c1 >= 'a' && c1 <= uoa1){
                                              i5 = c1 - 97;
                                           }else if(c1 >= 'A' && c1 <= 'F'){
                                              i5 = c1 - 65;
                                           }else {
                                              break ;
                                           }
                                           i5 = i5 + i2;
                                           i4 = c2 + i5;
                                           c2 = (char)i4;
                                           int i6 = uoa + 1;
                                        }else {
                                           this.e = this.e + i3;
                                           return i4;
                                        }
                                     }
                                     throw new NumberFormatException("\\u"+new String(this.d, this.e, i3));
                                  }else {
                                     this.R(str);
                                     throw uoa;
                                  }
                               }else {
                                  this.R("Invalid escape sequence");
                                  throw uoa;
                               }
                            }else {
                               return 9;
                            }
                         }else {
                            return 13;
                         }
                      }else {
                         return i2;
                      }
                   }else {
                      return 12;
                   }
                }else {
                   return 8;
                }
             }
          }else {
             this.g = this.g + i;
             this.h = i1;
          }
          return c;
       }else {
          this.R(str);
          throw uoa;
       }
    }
    public final void M(boolean p0){
       this.c = p0;
    }
    public final void O(char p0){
       int i;
       int i1;
       a td = this.d;
       do {
          a te = this.e;
          a tf = this.f;
          while (true) {
             if (te < tf) {
                i = te + 1;
                char c = td[te];
                if (c == p0) {
                   break ;
                }else if(c == '\'){
                   this.e = i;
                   this.L();
                   te = this.e;
                   tf = this.f;
                }else if(c == 10){
                   i1 = this.g + 1;
                   this.g = i1;
                   this.h = i;
                }
                i1 = i;
             }else {
                this.e = te;
                if (this.k(1)) {
                   continue ;
                }else {
                }
             }
          }
          this.e = i;
          return;
       } while (this.k(1));
       this.R("Unterminated string");
       throw null;
    }
    public final void P(){
       while (this.e < this.f || this.k(1)) {
          a te = this.e;
          int i = te + 1;
          this.e = i;
          char c = this.d[te];
          if (c == 10) {
             this.g = this.g + 1;
             this.h = i;
             break ;
          }
          break ;
       }
       return;
    }
    public void Q(){
       int i3;
       int i = 0;
       int i1 = 0;
       do {
          a ti = this.i;
          if (ti == null) {
             ti = this.f();
          }
          int i2 = 3;
          if (ti == i2) {
             this.K(1);
          label_0011 :
             i1 = i1 + 1;
          }else if(ti == 1){
             this.K(i2);
             goto label_0011 ;
          }else if(ti == 4){
             i3 = this.n - 1;
             this.n = i3;
          }else if(ti == 2){
             i3 = this.n - 1;
             this.n = i3;
          }else if(ti == 14 || ti == 10){
             do {
                i3 = 0;
                while (true) {
                   i2 = this.e + i3;
                   if (i2 < this.f) {
                      char c = this.d[i2];
                      if (c != 9 && (c != 10 && (c != 12 && (c != 13 && c != ' ')))) {
                         if (c != '#') {
                            if (c != ',') {
                               if (c != '/' && c != '=') {
                                  if (c != '{' && (c != '}' && c != ':')) {
                                     if (c != ';') {
                                        switch (c){
                                            case '[':
                                            case ']':
                                              break;
                                            case 92:
                                              break;
                                            default:
                                              i3 = i3 + 1;
                                        }
                                     }
                                  }
                               }
                            }
                         }
                         this.e();
                      }
                   label_00a4 :
                      i2 = this.e + i3;
                      this.e = i2;
                   }else {
                      this.e = i2;
                      if (this.k(1)) {
                         continue ;
                      }
                   }
                }
                a tp = this.p;
                a tn = this.n;
                i3 = tn - 1;
                tp[i3] = tp[i3] + 1;
                this.o[(tn - 1)] = "null";
                return;
             } while (!this.k(1));
          }else if(ti == 8 || ti == 12){
             this.O(''');
          }else if(ti == 9 || ti == 13){
             this.O('"');
          }else if(ti == 16){
             i3 = this.e + this.k;
             this.e = i3;
          }
          i1 = i1 - 1;
          this.i = i;
          if (!i1) {
             goto label_00b6 ;
          }else {
             continue ;
          }
       } while (!i1);
    }
    public final IOException R(String p0){
       throw new MalformedJsonException(p0+this.r());
    }
    public void a(){
       a ti = this.i;
       if (ti == null) {
          ti = this.f();
       }
       if (ti == 3) {
          this.K(1);
          this.p[(this.n - 1)] = 0;
          this.i = 0;
          return;
       }else {
          throw new IllegalStateException("Expected BEGIN_ARRAY but was "+this.J()+this.r());
       }
    }
    public void c(){
       a ti = this.i;
       if (ti == null) {
          ti = this.f();
       }
       if (ti == 1) {
          this.K(3);
          this.i = 0;
          return;
       }else {
          throw new IllegalStateException("Expected BEGIN_OBJECT but was "+this.J()+this.r());
       }
    }
    public void close(){
       this.i = 0;
       this.m[0] = 8;
       this.n = 1;
       this.b.close();
    }
    public final void e(){
       if (this.c != null) {
          return;
       }
       this.R("Use JsonReader.setLenient\(true\) to accept malformed JSON");
       throw null;
    }
    public int f(){
       int i7;
       String str;
       String str1;
       int i8;
       int i10;
       long l2;
       char c2;
       a uoa = this;
       a m = uoa.m;
       a n = uoa.n;
       int i = m[(n - 1)];
       int i1 = 93;
       int i2 = 59;
       a uoa1 = 44;
       int i3 = 6;
       int i4 = 7;
       a uoa2 = null;
       int i5 = 4;
       int i6 = 0;
       if (i == 1) {
          m[(n - 1)] = 2;
       }else if(i == 2){
          i7 = uoa.z(1);
          if (i7 != uoa1) {
             if (i7 != i2) {
                if (i7 == i1) {
                   uoa.i = i5;
                   return i5;
                }else {
                   uoa.R("Unterminated array");
                   throw uoa2;
                }
             }else {
                this.e();
             }
          }
       }else if(i == 3 || i == 5){
          m[(n - 1)] = 4;
          str = 125;
          if (i == 5) {
             i10 = uoa.z(1);
             if (i10 != uoa1) {
                if (i10 != i2) {
                   if (i10 == str) {
                      uoa.i = 2;
                      return 2;
                   }else {
                      uoa.R("Unterminated object");
                      throw 0;
                   }
                }else {
                   this.e();
                }
             }
          }
          i10 = uoa.z(1);
          if (i10 != 34) {
             if (i10 != 39) {
                if (i10 != str) {
                   this.e();
                   uoa.e = uoa.e - 1;
                   if (uoa.p((char)i10)) {
                      uoa.i = 14;
                      return 14;
                   }else {
                      uoa.R("Expected name");
                      throw 0;
                   }
                }else if(i != 5){
                   uoa.i = 2;
                   return 2;
                }else {
                   uoa.R("Expected name");
                   throw 0;
                }
             }else {
                this.e();
                uoa.i = 12;
                return 12;
             }
          }else {
             uoa.i = 13;
             return 13;
          }
       }else if(i == i5){
          m[(n - 1)] = 5;
          i7 = uoa.z(1);
          if (i7 != 58) {
             if (i7 == 61) {
                this.e();
                if (uoa.e < uoa.f || uoa.k(1)) {
                   n = uoa.e;
                   if (uoa.d[n] == '>') {
                      uoa.e = n + 1;
                   }
                }
             }else {
                uoa.R("Expected \':\'");
                throw uoa2;
             }
          }
       }else if(i == i3){
          if (uoa.c != null) {
             uoa.z(1);
             i7 = uoa.e - 1;
             uoa.e = i7;
             char[] q = a.q;
             if ((i7 + q.length) <= uoa.f || uoa.k(q.length)) {
                i7 = 0;
                while (true) {
                   q = a.q;
                   if (i7 < q.length) {
                      int i11 = uoa.e + i7;
                      if (uoa.d[i11] == q[i7]) {
                         i7 = i7 + 1;
                         uoa2 = null;
                      }
                   }else {
                      uoa.e = uoa.e + q.length;
                   }
                }
                return i;
             }
          }
          uoa.m[(uoa.n - 1)] = i4;
       }else if(i == i4){
          if (uoa.z(i6) == -1) {
             uoa.i = 17;
             return 17;
          }else {
             this.e();
             uoa.e = uoa.e - 1;
          }
       }else if(i != 8){
          throw new IllegalStateException("JsonReader is closed");
       }
       i7 = uoa.z(1);
       if (i7 != 34) {
          if (i7 != 39) {
             if (i7 != uoa1 && i7 != i2) {
                if (i7 != 91) {
                   if (i7 != i1) {
                      if (i7 != 123) {
                         i7 = uoa.e - 1;
                         uoa.e = i7;
                         char c = uoa.d[i7];
                         if (c == 't' || c == 'T') {
                            str = "true";
                            str1 = "TRUE";
                            i = 5;
                         label_011f :
                            i1 = str.length();
                            i2 = 1;
                            while (true) {
                               if (i2 < i1) {
                                  i8 = uoa.e + i2;
                                  if (i8 >= uoa.f) {
                                     i8 = i2 + 1;
                                     if (uoa.k(i8)) {
                                     }
                                  }else {
                                  }
                               }else if((uoa.e + i1) < uoa.f || (uoa.k((i1 + 1)) && uoa.p(uoa.d[(uoa.e + i1)]))){
                                  uoa.e = uoa.e + i1;
                                  uoa.i = i;
                               label_0172 :
                                  if (i) {
                                     goto label_0174 ;
                                  }else {
                                     m = uoa.d;
                                     n = uoa.e;
                                     a f = uoa.f;
                                     long l = 0;
                                     long l1 = l;
                                     i8 = 0;
                                     uoa2 = 0;
                                     i5 = 1;
                                     int i9 = 0;
                                     while (true) {
                                        i6 = n + i8;
                                        if (i6 == f) {
                                           if (i8 == m.length) {
                                           label_018a :
                                              i6 = 0;
                                           }else {
                                              i10 = i8 + 1;
                                              if (!uoa.k(i10)) {
                                              label_0205 :
                                                 if (uoa2 == 2 && (i5 && (l1 - Long.MIN_VALUE || (i9 && (l1 || !i9))))) {
                                                    if (!i9) {
                                                       l1 = - l1;
                                                    }
                                                    uoa.j = l1;
                                                    uoa.e = uoa.e + i8;
                                                    i6 = 15;
                                                    uoa.i = i6;
                                                 }else if(uoa2 != 2 && (uoa2 == 4 || uoa2 == 7)){
                                                    uoa.k = i8;
                                                    i6 = 16;
                                                    uoa.i = i6;
                                                 }else {
                                                    goto label_018a ;
                                                 }
                                              }else {
                                                 n = uoa.e;
                                                 f = uoa.f;
                                              label_019b :
                                                 i6 = n + i8;
                                                 char c1 = m[i6];
                                                 if (c1 != '+') {
                                                    if (c1 != 'E' && c1 != 'e') {
                                                       if (c1 != '-') {
                                                          if (c1 != '.') {
                                                             if (c1 < '0' || c1 > '9') {
                                                                if (!uoa.p(c1)) {
                                                                   goto label_0205 ;
                                                                }else {
                                                                   goto label_018a ;
                                                                }
                                                             }else if(uoa2 == 1 || !uoa2){
                                                                i6 = c1 - 48;
                                                                i6 = - i6;
                                                                l1 = (long)i6;
                                                                uoa2 = 2;
                                                             }else if(uoa2 == 2){
                                                                if (!l1 - l) {
                                                                   goto label_018a ;
                                                                }else {
                                                                   l2 = 10 * l1;
                                                                   i6 = c1 - 48;
                                                                   l2 = l2 - (long)i6;
                                                                   v8 = l1 - 0xf333333333333334;
                                                                   i6 = (i2 > 0 || (!i2 && l2 - l1 < 0))? 1: 0;
                                                                   i5 = i5 & i6;
                                                                   l1 = l2;
                                                                   l = 6;
                                                                }
                                                             }else {
                                                                l = 6;
                                                                if (uoa2 == 3) {
                                                                   uoa2 = 4;
                                                                }else if(uoa2 == 5 || uoa2 == l){
                                                                   uoa2 = 7;
                                                                }
                                                             }
                                                             l2 = 0;
                                                          }else {
                                                             l2 = l;
                                                             if (uoa2 == 2) {
                                                                uoa2 = 3;
                                                             }else {
                                                                goto label_018a ;
                                                             }
                                                          }
                                                       }else {
                                                          l2 = l;
                                                          if (!uoa2) {
                                                             uoa2 = 1;
                                                             i9 = 1;
                                                          }else if(uoa2 == 5){
                                                          label_025a :
                                                             uoa2 = 6;
                                                          }else {
                                                             goto label_018a ;
                                                          }
                                                       }
                                                    }else {
                                                       l2 = l;
                                                       if (uoa2 == 2 || uoa2 == 4) {
                                                          uoa2 = 5;
                                                       }else {
                                                          goto label_018a ;
                                                       }
                                                    }
                                                 }else {
                                                    l2 = l;
                                                    if (uoa2 == 5) {
                                                       goto label_025a ;
                                                    }else {
                                                       goto label_018a ;
                                                    }
                                                 }
                                                 i8 = i8 + 1;
                                                 l = l2;
                                                 i4 = 7;
                                              }
                                           }
                                        }else {
                                           goto label_019b ;
                                        }
                                     }
                                     if (i6) {
                                        return i6;
                                     }else if(uoa.p(uoa.d[uoa.e])){
                                        this.e();
                                        uoa.i = 10;
                                        return 10;
                                     }else {
                                        uoa.R("Expected value");
                                        throw 0;
                                     }
                                  }
                               }
                            }
                         }else if(c == 'f' || c == 'F'){
                            str = "false";
                            str1 = "FALSE";
                            i = 6;
                            goto label_011f ;
                         }else if(c == 'n' || c == 'N'){
                            str = "null";
                            str1 = "NULL";
                            i = 7;
                            goto label_011f ;
                         }
                         i = 0;
                         goto label_0172 ;
                      }else {
                         uoa.i = 1;
                         return 1;
                      }
                   }else if(i == 1){
                      uoa.i = 4;
                      return 4;
                   }
                }else {
                   uoa.i = 3;
                   return 3;
                }
             }
             if (i == 1 || i == 2) {
                this.e();
                uoa.e = uoa.e - 1;
                uoa.i = 7;
                return 7;
             }else {
                uoa.R("Unexpected value");
                throw 0;
             }
          }else {
             this.e();
             uoa.i = 8;
             return 8;
          }
       }else {
          uoa.i = 9;
          return 9;
       }
    }
    public void g(){
       a ti = this.i;
       if (ti == null) {
          ti = this.f();
       }
       if (ti == 4) {
          int i = this.n - 1;
          this.n = i;
          a tp = this.p;
          i = i - 1;
          tp[i] = tp[i] + 1;
          this.i = 0;
          return;
       }else {
          throw new IllegalStateException("Expected END_ARRAY but was "+this.J()+this.r());
       }
    }
    public String getPath(){
       StringBuilder str = '$';
       a tn = this.n;
       int i = 0;
       while (i < tn) {
          int i1 = this.m[i];
          if (i1 != 1 && i1 != 2) {
             if (i1 == 3 || (i1 == 4 || i1 == 5)) {
                str = str+'.';
                a to = this.o;
                if (to[i] != null) {
                   str = str+to[i];
                }
             }
          }else {
             str = str+'['+this.p[i]+']';
          }
          i = i + 1;
       }
       return str;
    }
    public void j(){
       a ti = this.i;
       if (ti == null) {
          ti = this.f();
       }
       if (ti == 2) {
          int i = this.n - 1;
          this.n = i;
          this.o[i] = null;
          a tp = this.p;
          i = i - 1;
          tp[i] = tp[i] + 1;
          this.i = 0;
          return;
       }else {
          throw new IllegalStateException("Expected END_OBJECT but was "+this.J()+this.r());
       }
    }
    public final boolean k(int p0){
       int i;
       int i1;
       a td = this.d;
       a te = this.e;
       this.h = this.h - te;
       a tf = this.f;
       if (tf != te) {
          i = tf - te;
          this.f = i;
          System.arraycopy(td, te, td, 0, i);
       }else {
          this.f = 0;
       }
       this.e = 0;
       while (true) {
          te = this.f;
          i1 = td.length - te;
          i = this.b.read(td, te, i1);
          if (i == -1) {
             return 0;
          }
          int i2 = this.f + i;
          this.f = i2;
          i1 = 1;
          if (this.g == null) {
             tf = this.h;
             if (tf == null && (i2 > 0 && td[0] == 0xfeff)) {
                int i3 = this.e + i1;
                this.e = i3;
                i = tf + 1;
                this.h = i;
                p0++;
             }
          }
          if (i2 >= p0) {
             break ;
          }
       }
       return i1;
    }
    public boolean l(){
       a ti = this.i;
       if (ti == null) {
          ti = this.f();
       }
       boolean b = (ti != 2 && ti != 4)? true: false;
       return b;
    }
    public final boolean o(){
       return this.c;
    }
    public final boolean p(char p0){
       if (p0 != 9 && (p0 != 10 && (p0 != 12 && (p0 != 13 && p0 != ' ')))) {
          if (p0 != '#') {
             if (p0 != ',') {
                if (p0 != '/' && p0 != '=') {
                   if (p0 != '{' && (p0 != '}' && p0 != ':')) {
                      if (p0 != ';') {
                         switch (p0){
                             case '[':
                             case ']':
                             case 92:
                               break;
                             default:
                               return true;
                         }
                      }
                   }
                }
             }
          }
          this.e();
       }
    label_003c :
       return false;
    }
    public String r(){
       return " at line "+(this.g + 1)+" column "+((this.e - this.h) + 1)+" path "+this.getPath();
    }
    public boolean s(){
       int i1;
       a ti = this.i;
       if (ti == null) {
          ti = this.f();
       }
       int i = 0;
       if (ti == 5) {
          this.i = i;
          ti = this.p;
          i1 = this.n - 1;
          ti[i1] = ti[i1] + 1;
          return 1;
       }else if(ti == 6){
          this.i = i;
          ti = this.p;
          i1 = this.n - 1;
          ti[i1] = ti[i1] + 1;
          return i;
       }else {
          throw new IllegalStateException("Expected a boolean but was "+this.J()+this.r());
       }
    }
    public String toString(){
       return this.getClass().getSimpleName()+this.r();
    }
    public double u(){
       int i1;
       a ti = this.i;
       if (ti == null) {
          ti = this.f();
       }
       int i = 0;
       if (ti == 15) {
          this.i = i;
          ti = this.p;
          i1 = this.n - 1;
          ti[i1] = ti[i1] + 1;
          return (double)this.j;
       }else {
          int i2 = 11;
          if (ti == 16) {
             this.l = new String(this.d, this.e, this.k);
             this.e = this.e + this.k;
          }else {
             i1 = 8;
             if (ti == i1 || ti == 9) {
                char c = (ti == i1)? ''': '"';
                this.l = this.C(c);
             }else if(ti == 10){
                this.l = this.I();
             }else if(ti == i2){
                throw new IllegalStateException("Expected a double but was "+this.J()+this.r());
             }
          }
          this.i = i2;
          double d = Double.parseDouble(this.l);
          if (this.c != null || (!Double.isNaN(d) && !Double.isInfinite(d))) {
             this.l = null;
             this.i = i;
             a tp = this.p;
             i2 = this.n - 1;
             tp[i2] = tp[i2] + 1;
             return d;
          }else {
             throw new MalformedJsonException("JSON forbids NaN and infinities: "+d+this.r());
          }
       }
    }
    public int v(){
       int i;
       double d;
       char c;
       a ti = this.i;
       if (ti == null) {
          ti = this.f();
       }
       String str = "Expected an int but was ";
       if (ti == 15) {
          ti = this.j;
          i = (int)ti;
          if (!ti - (long)i) {
             this.i = 0;
             ti = this.p;
             int i1 = this.n - 1;
             ti[i1] = ti[i1] + 1;
             return i;
          }else {
             throw new NumberFormatException(str+this.j+this.r());
          }
       }else if(ti == 16){
          this.l = new String(this.d, this.e, this.k);
          this.e = this.e + this.k;
       }else {
          try{
             a uoa = 10;
             a uoa1 = 8;
             if (ti != uoa1 && (ti == 9 || ti == uoa)) {
                if (ti == uoa) {
                   this.l = this.I();
                }else if(ti == uoa1){
                   c = ''';
                }else {
                   c = '"';
                }
                this.l = this.C(c);
                this.i = 0;
                uoa = this.p;
                i = this.n - 1;
                uoa[i] = uoa[i] + 1;
                return Integer.parseInt(this.l);
             }else {
                throw new IllegalStateException(str+this.J()+this.r());
             }
          }catch(java.lang.NumberFormatException e0){
          }
       }
    }
    public long x(){
       double d;
       long l;
       char c;
       a ti = this.i;
       if (ti == null) {
          ti = this.f();
       }
       int i = 0;
       if (ti == 15) {
          this.i = i;
          ti = this.p;
          int i1 = this.n - 1;
          ti[i1] = ti[i1] + 1;
          return this.j;
       }else if(ti == 16){
          this.l = new String(this.d, this.e, this.k);
          this.e = this.e + this.k;
       }else {
          try{
             StringBuilder str = 10;
             a uoa = 8;
             if (ti != uoa && (ti == 9 || ti == str)) {
                if (ti == str) {
                   this.l = this.I();
                }else if(ti == uoa){
                   c = ''';
                }else {
                   c = '"';
                }
                this.l = this.C(c);
                this.i = i;
                uoa = this.p;
                int i2 = this.n - 1;
                uoa[i2] = uoa[i2] + 1;
                return Long.parseLong(this.l);
             }else {
                throw new IllegalStateException("Expected a long but was "+this.J()+this.r());
             }
          }catch(java.lang.NumberFormatException e0){
          }
       }
    }
    public String y(){
       String str;
       a ti = this.i;
       if (ti == null) {
          ti = this.f();
       }
       if (ti == 14) {
          str = this.I();
       }else if(ti == 12){
          str = this.C(''');
       }else if(ti == 13){
          str = this.C('"');
       }else {
          throw new IllegalStateException("Expected a name but was "+this.J()+this.r());
       }
       this.i = 0;
       this.o[(this.n - 1)] = str;
       return str;
    }
    public final int z(boolean p0){
       int i1;
       char c;
       int i2;
       int b;
       a td = this.d;
       a te = this.e;
       a tf = this.f;
       while (true) {
          int i = 1;
          if (te == tf) {
             this.e = te;
             if (!this.k(i)) {
                if (!p0) {
                }else {
                   throw new EOFException("End of input"+this.r());
                }
             }else {
                te = this.e;
                tf = this.f;
             label_0034 :
                i1 = te + 1;
                c = td[te];
                if (c == 10) {
                   i2 = this.g + i;
                   this.g = i2;
                   this.h = i1;
                }else if(c != ' ' && (c == 13 || c == 9)){
                   int i3 = 47;
                   if (c == i3) {
                      this.e = i1;
                      if (i1 == tf) {
                         i1 = i1 - 1;
                         this.e = i1;
                         b = this.k(2);
                         i1 = this.e + i;
                         this.e = i1;
                         if (!b) {
                            return c;
                         }
                      }
                      this.e();
                      tf = this.e;
                      char c1 = td[tf];
                      if (c1 != '*') {
                         if (c1 != i3) {
                            return c;
                         }else {
                            b = tf + 1;
                            this.e = b;
                            this.P();
                            te = this.e;
                            tf = this.f;
                         }
                      }else {
                         b = tf + 1;
                         this.e = b;
                         while (true) {
                            i2 = this.e + 2;
                            i1 = 0;
                            if (i2 <= this.f || this.k(2)) {
                               tf = this.e;
                               if (this.d[tf] == 10) {
                                  i2 = this.g + i;
                                  this.g = i2;
                                  b = tf + 1;
                                  this.h = b;
                               }else {
                                  while (true) {
                                     if (i1 < 2) {
                                        b = this.e + i1;
                                        if (this.d[b] == ("*/").charAt(i1)) {
                                           i1 = i1 + 1;
                                        }
                                     }else if(i){
                                        i2 = this.e + 2;
                                        tf = this.f;
                                     }else {
                                        this.R("Unterminated comment");
                                        throw 0;
                                     }
                                  }
                                  return -1;
                               }
                               i2 = this.e + i;
                               this.e = i2;
                            }else {
                               i = 0;
                               goto label_00c7 ;
                            }
                         }
                      }
                   }else if(c == '#'){
                      this.e = i1;
                      this.e();
                      this.P();
                      te = this.e;
                      tf = this.f;
                   }else {
                      break ;
                   }
                }
                i2 = i1;
             }
          }else {
             goto label_0034 ;
          }
       }
       this.e = i1;
       return c;
    }
}
