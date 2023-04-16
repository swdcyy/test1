package com.gifshow.kanim.parser.moshi.a;
import com.gifshow.kanim.parser.moshi.JsonReader;
import java.lang.String;
import okio.ByteString;
import okio.d;
import java.lang.Object;
import java.util.Objects;
import okio.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.gifshow.kanim.parser.moshi.JsonEncodingException;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.IllegalStateException;
import com.gifshow.kanim.parser.moshi.JsonReader$a;
import java.lang.Integer;
import java.lang.Boolean;
import java.io.EOFException;
import java.lang.StringBuilder;
import java.lang.Character;
import com.gifshow.kanim.parser.moshi.JsonDataException;
import com.gifshow.kanim.parser.moshi.JsonReader$Token;
import okio.n;
import java.lang.Double;
import java.lang.Long;
import java.lang.AssertionError;
import cud.f;

public final class a extends JsonReader	// class@0015c9
{
    public final d i;
    public final b j;
    public int k;
    public long l;
    public int m;
    public String n;
    public static final ByteString o;
    public static final ByteString p;
    public static final ByteString q;
    public static final ByteString r;
    public static final ByteString s;

    static {
       a.o = ByteString.encodeUtf8("\'\\");
       a.p = ByteString.encodeUtf8("\"\\");
       a.q = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");
       a.r = ByteString.encodeUtf8("\n\r");
       a.s = ByteString.encodeUtf8("*/");
    }
    public void a(d p0){
       super();
       this.k = 0;
       Objects.requireNonNull(p0, "source == null");
       this.i = p0;
       this.j = p0.buffer();
       this.u(6);
    }
    public final void C(){
       if (PatchProxy.applyVoid(null, this, a.class, "27")) {
          return;
       }
       if (this.f != null) {
          return;
       }
       throw this.A("Use JsonReader.setLenient\(true\) to accept malformed JSON");
    }
    public final int E(){
       int b1;
       a uoa1;
       byte b2;
       int i8;
       String str;
       int i = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       JsonReader obj = PatchProxy.apply(null, i, a.class, "7");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = i.c;
       JsonReader b = i.b;
       int i1 = obj[(b - 1)];
       int i2 = 93;
       a uoa = 59;
       int i3 = 44;
       long l = 6;
       long l1 = 0;
       int i4 = 5;
       int i5 = 4;
       int i6 = 1;
       if (i1 == i6) {
          obj[(b - i6)] = 2;
       }else if(i1 == 2){
          b1 = i.K(i6);
          i.j.readByte();
          if (b1 != i3) {
             if (b1 != uoa) {
                if (b1 == i2) {
                   i.k = i5;
                   return i5;
                }else {
                   throw i.A("Unterminated array");
                }
             }else {
                this.C();
             }
          }
       }else if(i1 == 3 || i1 == i4){
          i8 = 1;
          obj[(b - i8)] = 4;
          if (i1 == 5) {
             i6 = i.K(i8);
             i.j.readByte();
             if (i6 != i3) {
                if (i6 != uoa) {
                   if (i6 == 125) {
                      i.k = 2;
                      return 2;
                   }else {
                      throw i.A("Unterminated object");
                   }
                }else {
                   this.C();
                }
             }
             i8 = true;
          }
          i8 = i.K(i8);
          if (i8 != 34) {
             if (i8 != 39) {
                if (i8 != 125) {
                   this.C();
                   if (i.J((char)i8)) {
                      i.k = 14;
                      return 14;
                   }else {
                      throw i.A("Expected name");
                   }
                }else if(i1 != 5){
                   i.j.readByte();
                   i.k = 2;
                   return 2;
                }else {
                   throw i.A("Expected name");
                }
             }else {
                i.j.readByte();
                this.C();
                i.k = 12;
                return 12;
             }
          }else {
             i.j.readByte();
             i.k = 13;
             return 13;
          }
       }else if(i1 == i5){
          obj[(b - i6)] = i4;
          b1 = i.K(i6);
          i.j.readByte();
          if (b1 != 58) {
             if (b1 == 61) {
                this.C();
                if (i.i.request(1) && i.j.g(l1) == 62) {
                   i.j.readByte();
                }
             }else {
                throw i.A("Expected \':\'");
             }
          }
       }else if(i1 == l){
          obj[(b - i6)] = 7;
       }else if(i1 == 7){
          if (i.K(false) == -1) {
             i.k = 18;
             return 18;
          }else {
             this.C();
          label_00b3 :
             int i7 = i.K(i6);
             if (i7 != 34) {
                if (i7 != 39) {
                   if (i7 != i3 && i7 != uoa) {
                      if (i7 != 91) {
                         if (i7 != i2) {
                            if (i7 != 123) {
                               String obj1 = PatchProxy.apply(null, i, a.class, "8");
                               if (obj1 != patchProxyRe) {
                                  i7 = obj1.intValue();
                               }else {
                                  i7 = i.j.g(l1);
                                  if (i7 == 116 || i7 == 84) {
                                     obj1 = "true";
                                     str = "TRUE";
                                     i4 = 5;
                                  label_0111 :
                                     i5 = obj1.length();
                                     i2 = 1;
                                     while (true) {
                                        if (i2 < i5) {
                                           i3 = i2 + 1;
                                           if (i.i.request((long)i3)) {
                                              b2 = i.j.g((long)i2);
                                              if (b2 == obj1.charAt(i2) || b2 == str.charAt(i2)) {
                                                 i2 = i3;
                                                 l1 = 0;
                                              }
                                           }
                                        }else if(i.i.request((long)(i5 + 1)) && i.J(i.j.g((long)i5))){
                                           i.j.skip((long)i5);
                                           i.k = i4;
                                           i7 = i4;
                                        }
                                     }
                                     return i7;
                                  }else if(i7 == 102 || i7 == 70){
                                     obj1 = "false";
                                     str = "FALSE";
                                     i4 = 6;
                                     goto label_0111 ;
                                  }else if(i7 == 110 || i7 == 78){
                                     obj1 = "null";
                                     str = "NULL";
                                     i4 = 7;
                                     goto label_0111 ;
                                  }
                                  i7 = 0;
                               }
                               if (i7) {
                                  goto label_0162 ;
                               }else {
                                  obj1 = PatchProxy.apply(null, i, a.class, "9");
                                  if (obj1 != patchProxyRe) {
                                     i6 = obj1.intValue();
                                  }else {
                                     uoa1 = null;
                                     i7 = 0;
                                     i1 = 1;
                                     long l2 = 0;
                                     i2 = 0;
                                     while (true) {
                                        i3 = i7 + 1;
                                        if (!i.i.request((long)i3)) {
                                        label_01f9 :
                                           if (uoa1 == 2 && (i1 && (l2 - Long.MIN_VALUE || (i2 && (l2 || !i2))))) {
                                              if (!i2) {
                                                 l2 = - l2;
                                              }
                                              i.l = l2;
                                              i.j.skip((long)i7);
                                              i6 = 16;
                                              i.k = i6;
                                           }else if(uoa1 != 2 && (uoa1 == 4 || uoa1 == 7)){
                                              i.m = i7;
                                              i6 = 17;
                                              i.k = i6;
                                           }else {
                                           label_024f :
                                              i6 = 0;
                                           }
                                        }else {
                                           b2 = i.j.g((long)i7);
                                           if (b2 != 43) {
                                              if (b2 != 69 && b2 != 101) {
                                                 if (b2 != 45) {
                                                    if (b2 != 46) {
                                                       if (b2 < 48 || b2 > 57) {
                                                          if (!i.J(b2)) {
                                                             goto label_01f9 ;
                                                          }else {
                                                             goto label_024f ;
                                                          }
                                                       }else if(uoa1 == i6 || uoa1 == null){
                                                          b2 = b2 - 48;
                                                          i8 = - b2;
                                                          l2 = (long)i8;
                                                          uoa1 = 2;
                                                       }else if(uoa1 == 2){
                                                          if (!l2) {
                                                             goto label_024f ;
                                                          }else {
                                                             l = 10 * l2;
                                                             b2 = b2 - 48;
                                                             l = l - (long)b2;
                                                             v4 = l2 - 0xf333333333333334;
                                                             b1 = (i7 > 0 || (!i7 && l - l2 < 0))? 1: 0;
                                                             b1 = b1 & i1;
                                                             i1 = b1;
                                                             l2 = l;
                                                          }
                                                       }else if(uoa1 == 3){
                                                          uoa1 = 4;
                                                       }else if(uoa1 != 5){
                                                          if (uoa1 != 6) {
                                                          label_024a :
                                                             i7 = i3;
                                                             i6 = 1;
                                                          }
                                                       }else {
                                                          b1 = 6;
                                                       }
                                                       uoa1 = 7;
                                                       goto label_024a ;
                                                       b1 = 6;
                                                       goto label_024a ;
                                                    }else if(uoa1 == 2){
                                                       uoa1 = 3;
                                                       goto label_024a ;
                                                    }else {
                                                       goto label_024f ;
                                                    }
                                                 }else if(uoa1 == null){
                                                    uoa1 = 1;
                                                    i2 = 1;
                                                    goto label_024a ;
                                                 }else if(uoa1 == 5){
                                                 label_0249 :
                                                    uoa1 = 6;
                                                    goto label_024a ;
                                                 }else {
                                                    goto label_024f ;
                                                 }
                                              }else if(uoa1 == 2 || uoa1 == 4){
                                                 uoa1 = 5;
                                                 goto label_024a ;
                                              }else {
                                                 goto label_024f ;
                                              }
                                           }else if(uoa1 == 5){
                                              goto label_0249 ;
                                           }else {
                                              goto label_024f ;
                                           }
                                        }
                                     }
                                  }
                                  if (i6) {
                                     return i6;
                                  }else if(i.J(i.j.g(0))){
                                     this.C();
                                     i.k = 10;
                                     return 10;
                                  }else {
                                     throw i.A("Expected value");
                                  }
                               }
                            }else {
                               i.j.readByte();
                               i.k = 1;
                               return 1;
                            }
                         }else {
                            uoa1 = 1;
                            if (i1 == uoa1) {
                               i.j.readByte();
                               i.k = 4;
                               return 4;
                            }
                         }
                      }else {
                         i.j.readByte();
                         i.k = 3;
                         return 3;
                      }
                   }else {
                      uoa1 = 1;
                   }
                   if (i1 == uoa1 || i1 == 2) {
                      this.C();
                      i.k = 7;
                      return 7;
                   }else {
                      throw i.A("Unexpected value");
                   }
                }else {
                   this.C();
                   i.j.readByte();
                   i.k = 8;
                   return 8;
                }
             }else {
                i.j.readByte();
                i.k = 9;
                return 9;
             }
          }
       }else if(i1 != 8){
          goto label_00b3 ;
       }else {
          throw new IllegalStateException("JsonReader is closed");
       }
       b1 = false;
       goto label_00b3 ;
    }
    public final int I(String p0,JsonReader$a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int len = p1.a.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return -1;
          }
          if (p0.equals(p1.a[i])) {
             break ;
          }else {
             i = i + 1;
          }
       }
       this.k = 0;
       p1[(this.b - 1)] = p0;
       return i;
    }
    public final boolean J(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 != 9 && (p0 != 10 && (p0 != 12 && (p0 != 13 && p0 != 32)))) {
          if (p0 != 35) {
             if (p0 != 44) {
                if (p0 != 47 && p0 != 61) {
                   if (p0 != 123 && (p0 != 125 && p0 != 58)) {
                      if (p0 != 59) {
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
          this.C();
       }
    label_005b :
       return false;
    }
    public final int K(boolean p0){
       Object obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, a.class, "26");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       obj = 0;
    label_0020 :
       boolean i = 0;
       while (true) {
          byte i1 = i + 1;
          if (this.i.request((long)i1)) {
             i = this.j.g((long)i);
             if (i != 10 && (i != 32 && (i == 13 || i == 9))) {
                i = i1;
             }else {
                i1 = i1 - 1;
                this.j.skip((long)i1);
                a uoa = 47;
                if (i == uoa) {
                   if (!this.i.request(2)) {
                      break ;
                   }else {
                      this.C();
                      i1 = this.j.g(1);
                      if (i1 != 42) {
                         if (i1 != uoa) {
                            return i;
                         }else {
                            this.j.readByte();
                            this.j.readByte();
                            this.Q();
                            goto label_0020 ;
                         }
                      }else {
                         this.j.readByte();
                         this.j.readByte();
                         Object obj1 = PatchProxy.apply(null, this, a.class, "29");
                         if (obj1 != patchProxyRe) {
                            i = obj1.booleanValue();
                         }else {
                            ByteString s = a.s;
                            long l = this.i.u2(s);
                            i = (l - -1)? true: false;
                            a tj = this.j;
                            l = (i)? l + (long)s.size(): tj.p();
                            tj.skip(l);
                         }
                         if (i) {
                            goto label_0020 ;
                         }else {
                            throw this.A("Unterminated comment");
                         }
                      }
                   }
                }else if(i == 35){
                   this.C();
                   this.Q();
                   goto label_0020 ;
                }else {
                   return i;
                }
             }
          }else if(!p0){
             return -1;
          }else {
             throw new EOFException("End of input");
          }
       }
       return i;
    }
    public final String L(ByteString p0){
       long l;
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       while (true) {
          l = this.i.N(p0);
          if (!l - -1) {
             throw this.A("Unterminated string");
          }
          if (this.j.g(l) == 92) {
             if (obj == null) {
                obj = "";
             }
             this.j.readByte();
             obj = obj+this.j.readUtf8(l)+this.O();
          }else if(obj == null){
             break ;
          }else {
             this.j.readByte();
             return obj+this.j.readUtf8(l);
          }
       }
       this.j.readByte();
       return this.j.readUtf8(l);
    }
    public final String M(){
       String obj = PatchProxy.apply(null, this, a.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       long l = this.i.N(a.q);
       obj = (l - -1)? this.j.readUtf8(l): this.j.readUtf8();
       return obj;
    }
    public final char O(){
       Object obj = PatchProxy.apply(null, this, a.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.charValue();
       }
       if (!this.i.request(1)) {
          throw this.A("Unterminated escape sequence");
       }
       int b = this.j.readByte();
       JsonReader jsonReader = 10;
       if (b == jsonReader || (b == 34 || (b == 39 || (b == 47 || b == 92)))) {
          return (char)b;
       }
       if (b == 98) {
          return 8;
       }
       String str = 102;
       if (b == str) {
          return 12;
       }
       if (b == 110) {
          return jsonReader;
       }
       if (b == 114) {
          return 13;
       }
       if (b == 116) {
          return 9;
       }
       if (b != 117) {
          if (this.f != null) {
             return (char)b;
          }else {
             throw this.A("Invalid escape sequence: \\"+(char)b);
          }
       }else if(this.i.request(4)){
          b = 0;
          int i = 0;
          while (true) {
             if (b < 4) {
                int b1 = this.j.g((long)b);
                i = i << 4;
                char c = (char)i;
                if (b1 >= 48 && b1 <= 57) {
                   b1 = b1 - 48;
                }else if(b1 >= 97 && b1 <= str){
                   b1 = b1 - 97;
                }else if(b1 >= 65 && b1 <= 70){
                   b1 = b1 - 65;
                }else {
                   break ;
                }
                b1 = b1 + jsonReader;
                i = c + b1;
                c = (char)i;
                b = b + 1;
             }else {
                this.j.skip(4);
                return i;
             }
          }
          throw this.A("\\u"+this.j.readUtf8(4));
       }else {
          throw new EOFException("Unterminated escape sequence at path "+this.getPath());
       }
    }
    public final void P(ByteString p0){
       long l;
       long l1;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "21")) {
          return;
       }
       while (true) {
          l = this.i.N(p0);
          if (!l - -1) {
             throw this.A("Unterminated string");
          }
          l1 = 1;
          if (this.j.g(l) == 92) {
             l = l + l1;
             this.j.skip(l);
             this.O();
          }else {
             break ;
          }
       }
       this.j.skip((l + l1));
       return;
    }
    public final void Q(){
       if (PatchProxy.applyVoid(null, this, a.class, "28")) {
          return;
       }
       long l = this.i.N(a.r);
       a tj = this.j;
       l = (l - -1)? l + 1: tj.p();
       tj.skip(l);
       return;
    }
    public final void R(){
       if (PatchProxy.applyVoid(null, this, a.class, "22")) {
          return;
       }
       long l = this.i.N(a.q);
       a tj = this.j;
       if (!l - -1) {
          l = tj.p();
       }
       tj.skip(l);
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       a tk = this.k;
       if (tk == null) {
          tk = this.E();
       }
       if (tk == 3) {
          this.u(1);
          this.e[(this.b - 1)] = 0;
          this.k = 0;
          return;
       }else {
          throw new JsonDataException("Expected BEGIN_ARRAY but was "+this.s()+" at path "+this.getPath());
       }
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tk = this.k;
       if (tk == null) {
          tk = this.E();
       }
       if (tk == 1) {
          this.u(3);
          this.k = 0;
          return;
       }else {
          throw new JsonDataException("Expected BEGIN_OBJECT but was "+this.s()+" at path "+this.getPath());
       }
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, a.class, "24")) {
          return;
       }
       this.k = 0;
       this.c[0] = 8;
       this.b = 1;
       this.j.a();
       this.i.close();
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a tk = this.k;
       if (tk == null) {
          tk = this.E();
       }
       if (tk == 4) {
          int i = this.b - 1;
          this.b = i;
          JsonReader te = this.e;
          i = i - 1;
          te[i] = te[i] + 1;
          this.k = 0;
          return;
       }else {
          throw new JsonDataException("Expected END_ARRAY but was "+this.s()+" at path "+this.getPath());
       }
    }
    public void f(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "4")) {
          return;
       }
       a tk = this.k;
       if (tk == null) {
          tk = this.E();
       }
       if (tk == 2) {
          int i = this.b - 1;
          this.b = i;
          this.d[i] = objArray;
          JsonReader te = this.e;
          i = i - 1;
          te[i] = te[i] + 1;
          this.k = 0;
          return;
       }else {
          throw new JsonDataException("Expected END_OBJECT but was "+this.s()+" at path "+this.getPath());
       }
    }
    public boolean g(){
       boolean i;
       a obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k;
       if (obj == null) {
          i = this.E();
       }
       i = (i != 2 && (i != 4 && i != 18))? true: false;
       return i;
    }
    public boolean j(){
       int i;
       JsonReader te;
       int i2;
       a obj = PatchProxy.apply(null, this, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k;
       if (obj == null) {
          i = this.E();
       }
       int i1 = 0;
       if (i == 5) {
          this.k = i1;
          te = this.e;
          i2 = this.b - 1;
          te[i2] = te[i2] + 1;
          return 1;
       }else if(i == 6){
          this.k = i1;
          te = this.e;
          i2 = this.b - 1;
          te[i2] = te[i2] + 1;
          return i1;
       }else {
          throw new JsonDataException("Expected a boolean but was "+this.s()+" at path "+this.getPath());
       }
    }
    public double k(){
       int i;
       JsonReader te;
       int i1;
       double d;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       obj = this.k;
       if (obj == null) {
          i = this.E();
       }
       if (i == 16) {
          this.k = 0;
          te = this.e;
          i1 = this.b - 1;
          te[i1] = te[i1] + 1;
          return (double)this.l;
       }else {
          String str = "Expected a double but was ";
          if (i == 17) {
             this.n = this.j.readUtf8((long)this.m);
          }else if(i == 9){
             this.n = this.L(a.p);
          }else if(i == 8){
             this.n = this.L(a.o);
          }else if(i == 10){
             this.n = this.M();
          }else if(i == 11){
             throw new JsonDataException(str+this.s()+" at path "+this.getPath());
          }
          this.k = 11;
          try{
             d = Double.parseDouble(this.n);
             if (this.f != null || (!Double.isNaN(d) && !Double.isInfinite(d))) {
                this.n = objArray;
                this.k = 0;
                te = this.e;
                i1 = this.b - 1;
                te[i1] = te[i1] + 1;
                return d;
             }else {
                throw new JsonEncodingException("JSON forbids NaN and infinities: "+d+" at path "+this.getPath());
             }
          }catch(java.lang.NumberFormatException e0){
             throw new JsonDataException(d+this.n+" at path "+this.getPath());
          }
       }
    }
    public int l(){
       int i;
       int i2;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.k;
       if (obj == null) {
          i = this.E();
       }
       int i1 = 0;
       if (i == 16) {
          obj = this.l;
          i2 = (int)obj;
          if (!obj - (long)i2) {
             this.k = i1;
             JsonReader te = this.e;
             int i3 = this.b - 1;
             te[i3] = te[i3] + 1;
             return i2;
          }else {
             throw new JsonDataException("Expected an int but was "+this.l+" at path "+this.getPath());
          }
       }else {
          int i4 = 11;
          if (i == 17) {
             this.n = this.j.readUtf8((long)this.m);
          }else {
             JsonReader jsonReader = 9;
             if (i == jsonReader || i == 8) {
                String str = (i == jsonReader)? this.L(a.p): this.L(a.o);
                this.n = str;
                try{
                   this.k = i1;
                   jsonReader = this.e;
                   int i5 = this.b - 1;
                   jsonReader[i5] = jsonReader[i5] + 1;
                   return Integer.parseInt(str);
                }catch(java.lang.NumberFormatException e0){
                }
             }else if(i == i4){
                throw new JsonDataException("Expected an int but was "+this.s()+" at path "+this.getPath());
             }
          }
          this.k = i4;
          try{
             double d = Double.parseDouble(this.n);
             i = (int)d;
             if (!(double)i - d) {
                this.n = objArray;
                this.k = i1;
                JsonReader te1 = this.e;
                i2 = this.b - 1;
                te1[i2] = te1[i2] + 1;
                return i;
             }else {
                throw new JsonDataException("Expected an int but was "+this.n+" at path "+this.getPath());
             }
          }catch(java.lang.NumberFormatException e0){
             throw new JsonDataException("Expected an int but was "+this.n+" at path "+this.getPath());
          }
       }
    }
    public String o(){
       int i;
       String str;
       a obj = PatchProxy.apply(null, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj == null) {
          i = this.E();
       }
       if (i == 14) {
          str = this.M();
       }else if(i == 13){
          str = this.L(a.p);
       }else if(i == 12){
          str = this.L(a.o);
       }else if(i == 15){
          str = this.n;
       }else {
          throw new JsonDataException("Expected a name but was "+this.s()+" at path "+this.getPath());
       }
       this.k = 0;
       this.d[(this.b - 1)] = str;
       return str;
    }
    public String p(){
       int i;
       String str;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj == null) {
          i = this.E();
       }
       if (i == 10) {
          str = this.M();
       }else if(i == 9){
          str = this.L(a.p);
       }else if(i == 8){
          str = this.L(a.o);
       }else if(i == 11){
          str = this.n;
          this.n = objArray;
       }else if(i == 16){
          str = Long.toString(this.l);
       }else if(i == 17){
          str = this.j.readUtf8((long)this.m);
       }else {
          throw new JsonDataException("Expected a string but was "+this.s()+" at path "+this.getPath());
       }
       this.k = 0;
       JsonReader te = this.e;
       int i1 = this.b - 1;
       te[i1] = te[i1] + 1;
       return str;
    }
    public JsonReader$Token s(){
       a obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj == null) {
          int i = this.E();
       }
       switch (i){
           case 1:
             return JsonReader$Token.BEGIN_OBJECT;
           case 2:
             return JsonReader$Token.END_OBJECT;
           case 3:
             return JsonReader$Token.BEGIN_ARRAY;
           case 4:
             return JsonReader$Token.END_ARRAY;
           case 5:
           case 6:
             return JsonReader$Token.BOOLEAN;
           case 7:
             return JsonReader$Token.NULL;
           case 8:
           case 10:
           case 11:
           case 9:
             return JsonReader$Token.STRING;
           case 12:
           case 14:
           case 15:
           case 13:
             return JsonReader$Token.NAME;
           case 16:
           case 17:
             return JsonReader$Token.NUMBER;
           case 18:
             return JsonReader$Token.END_DOCUMENT;
           default:
             throw new AssertionError();
       }
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsonReader\("+this.i+"\)";
    }
    public int v(JsonReader$a p0){
       int i;
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "12");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.k;
       if (obj == null) {
          i = this.E();
       }
       JsonReader jsonReader = 12;
       if (i < jsonReader || i > 15) {
          return -1;
       }else if(i == 15){
          return this.I(this.n, p0);
       }else {
          i = this.i.d0(p0.b);
          if (i != -1) {
             this.k = 0;
             this.d[(this.b - 1)] = p0.a[i];
             return i;
          }else {
             object oobject = this.d[(this.b - 1)];
             String str = PatchProxy.apply(null, this, a.class, "11");
             if (str != patchProxyRe) {
             }else {
                a tk = this.k;
                if (tk == null) {
                   tk = this.E();
                }
                if (tk == 14) {
                   str1 = this.M();
                }else if(tk == 13){
                   str1 = this.L(a.p);
                }else if(tk == jsonReader){
                   str1 = this.L(a.o);
                }else if(tk == 15){
                   str1 = this.n;
                }else {
                   throw new JsonDataException("Expected a name but was "+this.s()+" at path "+this.getPath());
                }
                str = str1;
                this.k = 0;
                this.d[(this.b - 1)] = str;
             }
             int i1 = this.I(str, p0);
             if (i1 == -1) {
                this.k = 15;
                this.n = str;
                this.d[(this.b - 1)] = oobject;
             }
             return i1;
          }
       }
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, a.class, "13")) {
          return;
       }
       if (this.g != null) {
          throw new JsonDataException("Cannot skip unexpected "+this.s()+" at "+this.getPath());
       }
       a tk = this.k;
       if (tk == null) {
          tk = this.E();
       }
       if (tk == 14) {
          this.R();
       }else if(tk == 13){
          this.P(a.p);
       }else if(tk == 12){
          this.P(a.o);
       }else if(tk == 15){
          throw new JsonDataException("Expected a name but was "+this.s()+" at path "+this.getPath());
       }
       this.k = 0;
       this.d[(this.b - 1)] = "null";
       return;
    }
    public void y(){
       int i3;
       String str;
       if (PatchProxy.applyVoid(null, this, a.class, "25")) {
          return;
       }
       if (this.g != null) {
          throw new JsonDataException("Cannot skip unexpected "+this.s()+" at "+this.getPath());
       }
       int i = 0;
       int i1 = 0;
       while (true) {
          a tk = this.k;
          if (tk == null) {
             tk = this.E();
          }
          int i2 = 3;
          if (tk == i2) {
             this.u(1);
          label_0021 :
             i1 = i1 + 1;
          }else if(tk == 1){
             this.u(i2);
             goto label_0021 ;
          }else {
             str = " at path ";
             if (tk == 4) {
                i1 = i1 - 1;
                if (i1 >= 0) {
                   i3 = this.b - 1;
                   this.b = i3;
                }else {
                   throw new JsonDataException("Expected a value but was "+this.s()+str+this.getPath());
                }
             }else if(tk == 2){
                i1 = i1 - 1;
                if (i1 >= 0) {
                   i3 = this.b - 1;
                   this.b = i3;
                }else {
                   throw new JsonDataException("Expected a value but was "+this.s()+str+this.getPath());
                }
             }else if(tk == 14 || tk == 10){
                this.R();
             }else if(tk == 9 || tk == 13){
                this.P(a.p);
             }else if(tk == 8 || tk == 12){
                this.P(a.o);
             }else if(tk == 17){
                this.j.skip((long)this.m);
             }else if(tk != 18){
                break ;
             }
          }
          this.k = i;
          if (!i1) {
             JsonReader te = this.e;
             JsonReader tb = this.b;
             i3 = tb - 1;
             te[i3] = te[i3] + 1;
             this.d[(tb - 1)] = "null";
             return;
          }
       }
       throw new JsonDataException("Expected a value but was "+this.s()+str+this.getPath());
    }
}
