package byd.g;
import java.lang.Object;
import retrofit2.q;
import java.lang.reflect.Method;
import retrofit2.o$a;
import eyd.b;
import java.lang.String;
import eyd.f;
import eyd.g;
import eyd.n;
import eyd.o;
import eyd.p;
import eyd.m;
import eyd.h;
import eyd.k;
import okhttp3.Headers$Builder;
import okhttp3.MediaType;
import java.lang.Throwable;
import java.lang.RuntimeException;
import retrofit2.r;
import okhttp3.Headers;
import eyd.l;
import eyd.e;
import retrofit2.l;
import okhttp3.MultipartBody$Part;
import eyd.y;
import java.lang.reflect.Type;
import okhttp3.HttpUrl;
import java.net.URI;
import java.lang.Class;
import retrofit2.l$p;
import eyd.s;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Set;
import java.lang.annotation.Annotation;
import retrofit2.h;
import retrofit2.l$k;
import eyd.t;
import java.lang.Iterable;
import java.lang.reflect.ParameterizedType;
import retrofit2.l$l;
import java.lang.StringBuilder;
import eyd.v;
import retrofit2.l$n;
import eyd.u;
import java.util.Map;
import retrofit2.l$m;
import eyd.i;
import retrofit2.l$f;
import eyd.j;
import retrofit2.l$h;
import retrofit2.l$g;
import eyd.c;
import retrofit2.l$d;
import eyd.d;
import retrofit2.l$e;
import eyd.q;
import retrofit2.l$o;
import retrofit2.l$i;
import eyd.r;
import retrofit2.l$j;
import eyd.a;
import retrofit2.l$c;
import eyd.x;
import retrofit2.l$q;
import asd.c;
import retrofit2.o;
import java.lang.Void;
import retrofit2.p;
import java.lang.reflect.WildcardType;
import retrofit2.r$b;
import retrofit2.a;
import byd.h;
import byd.i;
import java.lang.System;
import retrofit2.b$a;
import retrofit2.b;
import okhttp3.Response;
import retrofit2.j$a;
import okhttp3.Call$Factory;
import retrofit2.j$c;
import retrofit2.j$b;

public abstract class g	// class@000308
{

    public void g(){
       super();
    }
    public static g b(q p0,Method p1){
       object oobject;
       int len1;
       int i1;
       object oobject1;
       String str3;
       Object[] objArray;
       Object[] objArray1;
       int i5;
       int i6;
       l$p op;
       int i7;
       int i8;
       int i9;
       object oobject3;
       object oobject4;
       o$a uoa1;
       l$p op1;
       Class uClass;
       l ol;
       l$l ol1;
       Class uClass1;
       Class uClass2;
       Type type;
       Type type1;
       Type type2;
       String str10;
       object oobject6;
       int i10;
       o k;
       Annotation[] annotations;
       r$b uob;
       b$a uoa3;
       Object[] objArray2;
       h oh;
       j$a uoa4;
       q oq = p0;
       Method method = p1;
       o$a uoa = new o$a(oq, method);
       o$a c = uoa.c;
       int len = c.length;
       boolean b = false;
       int i = 0;
       while (true) {
          String str = "HEAD";
          String str1 = 1;
          if (i < len) {
             oobject = c[i];
             if (oobject instanceof b) {
                uoa.b("DELETE", oobject.value(), b);
             }else if(oobject instanceof f){
                uoa.b("GET", oobject.value(), b);
             }else if(oobject instanceof g){
                uoa.b(str, oobject.value(), b);
             }else if(oobject instanceof n){
                uoa.b("PATCH", oobject.value(), str1);
             }else if(oobject instanceof o){
                uoa.b("POST", oobject.value(), str1);
             }else if(oobject instanceof p){
                uoa.b("PUT", oobject.value(), str1);
             }else if(oobject instanceof m){
                uoa.b("OPTIONS", oobject.value(), b);
             }else if(oobject instanceof h){
                uoa.b(oobject.method(), oobject.path(), oobject.hasBody());
             }else if(oobject instanceof k){
                String[] stringArray = oobject.value();
                if (stringArray.length) {
                   Headers$Builder uBuilder = new Headers$Builder();
                   len1 = stringArray.length;
                   i1 = 0;
                   while (true) {
                      if (i1 < len1) {
                         oobject1 = stringArray[i1];
                         int i2 = oobject1.indexOf(58);
                         if (i2 != -1 && i2) {
                            int i3 = oobject1.length() - str1;
                            if (i2 != i3) {
                               String str2 = oobject1.substring(b, i2);
                               i2 = i2 + 1;
                               str3 = (oobject1.substring(i2)).trim();
                               if (("Content-Type").equalsIgnoreCase(str2)) {
                                  try{
                                     uoa.t = MediaType.get(str3);
                                  }catch(java.lang.IllegalArgumentException e0){
                                     objArray = new Object[str1];
                                     objArray[b] = str3;
                                     throw r.l(uoa.b, e0, "Malformed content type: %s", objArray);
                                  }
                               }else {
                                  uBuilder.add(str2, str3);
                               }
                               i1 = i1 + 1;
                            }
                         }
                         break ;
                      }else {
                         uoa.s = uBuilder.build();
                      }
                   }
                   objArray1 = new Object[str1];
                   objArray1[b] = oobject1;
                   throw r.k(uoa.b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", objArray1);
                }else {
                   objArray1 = new Object[b];
                   throw r.k(uoa.b, "@Headers annotation is empty.", objArray1);
                }
             }else {
                String str4 = "Only one encoding annotation is allowed.";
                if (oobject instanceof l) {
                   if (uoa.p == null) {
                      uoa.q = str1;
                   }else {
                      objArray1 = new Object[b];
                      throw r.k(uoa.b, str4, objArray1);
                   }
                }else if(oobject instanceof e){
                   if (uoa.q == null) {
                      uoa.p = str1;
                   }else {
                      objArray1 = new Object[b];
                      throw r.k(uoa.b, str4, objArray1);
                   }
                }
             }
             i = i + 1;
          }else if(uoa.n != null){
             if (uoa.o == null) {
                if (uoa.q == null) {
                   if (uoa.p != null) {
                      objArray1 = new Object[b];
                      throw r.k(uoa.b, "FormUrlEncoded can only be specified on HTTP methods with request body \(e.g., @POST\).", objArray1);
                   }
                }else {
                   objArray1 = new Object[b];
                   throw r.k(uoa.b, "Multipart can only be specified on HTTP methods with request body \(e.g., @POST\).", objArray1);
                }
             }
             int len2 = uoa.d.length;
             l[] olArray = new l[len2];
             uoa.v = olArray;
             len = len2 - 1;
             i = 0;
             while (true) {
                if (i < len2) {
                   o$a v = uoa.v;
                   object oobject2 = uoa.e[i];
                   oobject1 = uoa.d[i];
                   int i4 = (i == len)? 1: 0;
                   if (oobject1 != null) {
                      i1 = oobject1.length;
                      len1 = 0;
                      i5 = 0;
                      while (true) {
                         if (len1 < i1) {
                            oobject = oobject1[len1];
                            String str5 = String.class;
                            MultipartBody$Part part = MultipartBody$Part.class;
                            i6 = len2;
                            String str6 = "@Path parameters may not be used with @Url.";
                            if (oobject instanceof y) {
                               uoa.c(i, oobject2);
                               if (uoa.m == null) {
                                  if (uoa.i == null) {
                                     if (uoa.j == null) {
                                        if (uoa.k == null) {
                                           if (uoa.l == null) {
                                              if (uoa.r == null) {
                                                 uoa.m = true;
                                                 if (oobject2 != HttpUrl.class && (oobject2 != str5 && (oobject2 == URI.class || (oobject2 instanceof Class && ("android.net.Uri").equals(oobject2.getName()))))) {
                                                    op = new l$p(uoa.b, i);
                                                    i7 = len;
                                                    i8 = len1;
                                                    i9 = i1;
                                                    oobject3 = oobject1;
                                                    oobject4 = oobject2;
                                                    uoa1 = v;
                                                 label_083c :
                                                    op1 = op;
                                                 }else {
                                                    objArray1 = new Object[0];
                                                    throw r.m(uoa.b, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", objArray1);
                                                 }
                                              }else {
                                                 objArray1 = new Object[]{uoa.n};
                                                 throw r.m(uoa.b, i, "@Url cannot be used with @%s URL", objArray1);
                                              }
                                           }else {
                                              objArray1 = new Object[0];
                                              throw r.m(uoa.b, i, "A @Url parameter must not come after a @QueryMap.", objArray1);
                                           }
                                        }else {
                                           objArray1 = new Object[0];
                                           throw r.m(uoa.b, i, "A @Url parameter must not come after a @QueryName.", objArray1);
                                        }
                                     }else {
                                        objArray1 = new Object[0];
                                        throw r.m(uoa.b, i, "A @Url parameter must not come after a @Query.", objArray1);
                                     }
                                  }else {
                                     objArray1 = new Object[0];
                                     throw r.m(uoa.b, i, str6, objArray1);
                                  }
                               }else {
                                  objArray1 = new Object[0];
                                  throw r.m(uoa.b, i, "Multiple @Url method annotations found.", objArray1);
                               }
                            }else {
                               i7 = len;
                               o$a uoa2 = 2;
                               if (oobject instanceof s) {
                                  uoa.c(i, oobject2);
                                  if (uoa.j == null) {
                                     if (uoa.k == null) {
                                        if (uoa.l == null) {
                                           if (uoa.m == null) {
                                              if (uoa.r != null) {
                                                 uoa.i = true;
                                                 str6 = oobject.value();
                                                 if (o$a.y.matcher(str6).matches()) {
                                                    if (uoa.u.contains(str6)) {
                                                       i8 = len1;
                                                       i9 = i1;
                                                       oobject3 = oobject1;
                                                       uoa1 = v;
                                                       l$k ok = new l$k(uoa.b, i, str6, uoa.a.g(oobject2, oobject1), oobject.encoded());
                                                       oobject4 = oobject2;
                                                    }else {
                                                       objArray1 = new Object[uoa2];
                                                       objArray1[0] = uoa.r;
                                                       objArray1[1] = str6;
                                                       throw r.m(uoa.b, i, "URL \"%s\" does not contain \"{%s}\".", objArray1);
                                                    }
                                                 }else {
                                                    objArray1 = new Object[uoa2];
                                                    objArray1[0] = o$a.x.pattern();
                                                    objArray1[1] = str6;
                                                    throw r.m(uoa.b, i, "@Path parameter name must match %s. Found: %s", objArray1);
                                                 }
                                              }else {
                                                 objArray1 = new Object[]{uoa.n};
                                                 throw r.m(uoa.b, i, "@Path can only be used with relative url on @%s", objArray1);
                                              }
                                           }else {
                                              objArray1 = new Object[0];
                                              throw r.m(uoa.b, i, str6, objArray1);
                                           }
                                        }else {
                                           objArray1 = new Object[0];
                                           throw r.m(uoa.b, i, "A @Path parameter must not come after a @QueryMap.", objArray1);
                                        }
                                     }else {
                                        objArray1 = new Object[0];
                                        throw r.m(uoa.b, i, "A @Path parameter must not come after a @QueryName.", objArray1);
                                     }
                                  }else {
                                     objArray1 = new Object[0];
                                     throw r.m(uoa.b, i, "A @Path parameter must not come after a @Query.", objArray1);
                                  }
                               }else {
                                  i8 = len1;
                                  i9 = i1;
                                  oobject3 = oobject1;
                                  oobject4 = oobject2;
                                  uoa1 = v;
                                  String str7 = "<String>\)";
                                  str3 = " must include generic type \(e.g., ";
                                  if (oobject instanceof t) {
                                     uoa.c(i, oobject4);
                                     str6 = oobject.value();
                                     len = oobject.encoded();
                                     uClass = r.g(oobject4);
                                     uoa.j = true;
                                     if (Iterable.class.isAssignableFrom(uClass)) {
                                        if (oobject4 instanceof ParameterizedType) {
                                           ol = new l$l(str6, uoa.a.g(r.f(0, oobject4), oobject3), len).c();
                                        }else {
                                           objArray = new Object[0];
                                           throw r.m(uoa.b, i, uClass.getSimpleName()+str3+uClass.getSimpleName()+str7, objArray);
                                        }
                                     }else if(uClass.isArray()){
                                        ol = new l$l(str6, uoa.a.g(o$a.a(uClass.getComponentType()), oobject3), len).b();
                                     }else {
                                        ol1 = new l$l(str6, uoa.a.g(oobject4, oobject3), len);
                                     }
                                  }else if(oobject instanceof v){
                                     uoa.c(i, oobject4);
                                     len2 = oobject.encoded();
                                     uClass1 = r.g(oobject4);
                                     uoa.k = true;
                                     if (Iterable.class.isAssignableFrom(uClass1)) {
                                        if (oobject4 instanceof ParameterizedType) {
                                           ol = new l$n(uoa.a.g(r.f(0, oobject4), oobject3), len2).c();
                                        }else {
                                           objArray = new Object[0];
                                           throw r.m(uoa.b, i, uClass1.getSimpleName()+str3+uClass1.getSimpleName()+str7, objArray);
                                        }
                                     }else if(uClass1.isArray()){
                                        ol = new l$n(uoa.a.g(o$a.a(uClass1.getComponentType()), oobject3), len2).b();
                                     }else {
                                        ol = new l$n(uoa.a.g(oobject4, oobject3), len2);
                                     }
                                  }else {
                                     String str8 = "Map must include generic types \(e.g., Map<String, String>\)";
                                     if (oobject instanceof u) {
                                        uoa.c(i, oobject4);
                                        uClass2 = r.g(oobject4);
                                        len = true;
                                        uoa.l = len;
                                        if (Map.class.isAssignableFrom(uClass2)) {
                                           type = r.h(oobject4, uClass2, Map.class);
                                           if (type instanceof ParameterizedType) {
                                              type1 = r.f(0, type);
                                              if (str5 == type1) {
                                                 ol = new l$m(uoa.b, i, uoa.a.g(r.f(len, type), oobject3), oobject.encoded());
                                              }else {
                                                 objArray = new Object[0];
                                                 throw r.m(uoa.b, i, "@QueryMap keys must be of type String: "+type1, objArray);
                                              }
                                           }else {
                                              objArray1 = new Object[0];
                                              throw r.m(uoa.b, i, str8, objArray1);
                                           }
                                        }else {
                                           objArray1 = new Object[0];
                                           throw r.m(uoa.b, i, "@QueryMap parameter type must be Map.", objArray1);
                                        }
                                     }else if(oobject instanceof i){
                                        uoa.c(i, oobject4);
                                        str6 = oobject.value();
                                        uClass1 = r.g(oobject4);
                                        if (Iterable.class.isAssignableFrom(uClass1)) {
                                           if (oobject4 instanceof ParameterizedType) {
                                              ol = new l$f(str6, uoa.a.g(r.f(0, oobject4), oobject3)).c();
                                           }else {
                                              objArray = new Object[0];
                                              throw r.m(uoa.b, i, uClass1.getSimpleName()+str3+uClass1.getSimpleName()+str7, objArray);
                                           }
                                        }else if(uClass1.isArray()){
                                           ol = new l$f(str6, uoa.a.g(o$a.a(uClass1.getComponentType()), oobject3)).b();
                                        }else {
                                           ol = new l$f(str6, uoa.a.g(oobject4, oobject3));
                                        }
                                     }else if(oobject instanceof j){
                                        if (oobject4 == Headers.class) {
                                           ol = new l$h(uoa.b, i);
                                        }else {
                                           uoa.c(i, oobject4);
                                           uClass2 = r.g(oobject4);
                                           if (Map.class.isAssignableFrom(uClass2)) {
                                              type = r.h(oobject4, uClass2, Map.class);
                                              if (type instanceof ParameterizedType) {
                                                 type2 = r.f(0, type);
                                                 if (str5 == type2) {
                                                    op1 = new l$g(uoa.b, i, uoa.a.g(r.f(1, type), oobject3));
                                                 }else {
                                                    objArray = new Object[0];
                                                    throw r.m(uoa.b, i, "@HeaderMap keys must be of type String: "+type2, objArray);
                                                 }
                                              }else {
                                                 objArray1 = new Object[0];
                                                 throw r.m(uoa.b, i, str8, objArray1);
                                              }
                                           }else {
                                              objArray1 = new Object[0];
                                              throw r.m(uoa.b, i, "@HeaderMap parameter type must be Map.", objArray1);
                                           }
                                        }
                                     }else if(oobject instanceof c){
                                        uoa.c(i, oobject4);
                                        if (uoa.p != null) {
                                           str6 = oobject.value();
                                           len = oobject.encoded();
                                           uoa.f = true;
                                           uClass = r.g(oobject4);
                                           if (Iterable.class.isAssignableFrom(uClass)) {
                                              if (oobject4 instanceof ParameterizedType) {
                                                 ol = new l$d(str6, uoa.a.g(r.f(0, oobject4), oobject3), len).c();
                                              }else {
                                                 objArray = new Object[0];
                                                 throw r.m(uoa.b, i, uClass.getSimpleName()+str3+uClass.getSimpleName()+str7, objArray);
                                              }
                                           }else if(uClass.isArray()){
                                              ol = new l$d(str6, uoa.a.g(o$a.a(uClass.getComponentType()), oobject3), len).b();
                                           }else {
                                              ol1 = new l$d(str6, uoa.a.g(oobject4, oobject3), len);
                                           }
                                        }else {
                                           objArray1 = new Object[0];
                                           throw r.m(uoa.b, i, "@Field parameters can only be used with form encoding.", objArray1);
                                        }
                                     }else if(oobject instanceof d){
                                        uoa.c(i, oobject4);
                                        if (uoa.p != null) {
                                           uClass2 = r.g(oobject4);
                                           if (Map.class.isAssignableFrom(uClass2)) {
                                              type = r.h(oobject4, uClass2, Map.class);
                                              if (type instanceof ParameterizedType) {
                                                 type2 = r.f(0, type);
                                                 if (str5 == type2) {
                                                    uoa.f = true;
                                                    op1 = new l$e(uoa.b, i, uoa.a.g(r.f(1, type), oobject3), oobject.encoded());
                                                 }else {
                                                    objArray = new Object[0];
                                                    throw r.m(uoa.b, i, "@FieldMap keys must be of type String: "+type2, objArray);
                                                 }
                                              }else {
                                                 objArray1 = new Object[0];
                                                 throw r.m(uoa.b, i, str8, objArray1);
                                              }
                                           }else {
                                              objArray1 = new Object[0];
                                              throw r.m(uoa.b, i, "@FieldMap parameter type must be Map.", objArray1);
                                           }
                                        }else {
                                           objArray1 = new Object[0];
                                           throw r.m(uoa.b, i, "@FieldMap parameters can only be used with form encoding.", objArray1);
                                        }
                                     }else if(oobject instanceof q){
                                        uoa.c(i, oobject4);
                                        if (uoa.q != null) {
                                           uoa.g = true;
                                           str6 = oobject.value();
                                           Class uClass3 = r.g(oobject4);
                                           if (str6.isEmpty()) {
                                              String str9 = "@Part annotation must supply a name or use MultipartBody.Part parameter type.";
                                              if (Iterable.class.isAssignableFrom(uClass3)) {
                                                 if (oobject4 instanceof ParameterizedType) {
                                                    len2 = 0;
                                                    if (part.isAssignableFrom(r.g(r.f(len2, oobject4)))) {
                                                       ol = l$o.a.c();
                                                    }else {
                                                       objArray1 = new Object[len2];
                                                       throw r.m(uoa.b, i, str9, objArray1);
                                                    }
                                                 }else {
                                                    objArray = new Object[0];
                                                    throw r.m(uoa.b, i, uClass3.getSimpleName()+str3+uClass3.getSimpleName()+str7, objArray);
                                                 }
                                              }else if(uClass3.isArray()){
                                                 if (part.isAssignableFrom(uClass3.getComponentType())) {
                                                    ol = l$o.a.b();
                                                 }else {
                                                    objArray1 = new Object[0];
                                                    throw r.m(uoa.b, i, str9, objArray1);
                                                 }
                                              }else {
                                                 v = null;
                                                 if (part.isAssignableFrom(uClass3)) {
                                                    op = l$o.a;
                                                    goto label_083c ;
                                                 }else {
                                                    objArray1 = new Object[v];
                                                    throw r.m(uoa.b, i, str9, objArray1);
                                                 }
                                              }
                                           }else {
                                              String[] stringArray1 = new String[]{"Content-Disposition","form-data; name=\""+str6+"\"","Content-Transfer-Encoding",oobject.encoding()};
                                              Headers headers = Headers.of(stringArray1);
                                              str10 = "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.";
                                              if (Iterable.class.isAssignableFrom(uClass3)) {
                                                 if (oobject4 instanceof ParameterizedType) {
                                                    type1 = r.f(0, oobject4);
                                                    if (!part.isAssignableFrom(r.g(type1))) {
                                                       op = new l$i(uoa.b, i, headers, uoa.a.e(type1, oobject3, uoa.c)).c();
                                                       goto label_083c ;
                                                    }else {
                                                       objArray1 = new Object[0];
                                                       throw r.m(uoa.b, i, str10, objArray1);
                                                    }
                                                 }else {
                                                    objArray = new Object[0];
                                                    throw r.m(uoa.b, i, uClass3.getSimpleName()+str3+uClass3.getSimpleName()+str7, objArray);
                                                 }
                                              }else if(uClass3.isArray()){
                                                 uClass1 = o$a.a(uClass3.getComponentType());
                                                 if (!part.isAssignableFrom(uClass1)) {
                                                    op = new l$i(uoa.b, i, headers, uoa.a.e(uClass1, oobject3, uoa.c)).b();
                                                    goto label_083c ;
                                                 }else {
                                                    objArray1 = new Object[0];
                                                    throw r.m(uoa.b, i, str10, objArray1);
                                                 }
                                              }else if(!part.isAssignableFrom(uClass3)){
                                                 ol = new l$i(uoa.b, i, headers, uoa.a.e(oobject4, oobject3, uoa.c));
                                              }else {
                                                 objArray1 = new Object[0];
                                                 throw r.m(uoa.b, i, str10, objArray1);
                                              }
                                           }
                                        }else {
                                           objArray1 = new Object[0];
                                           throw r.m(uoa.b, i, "@Part parameters can only be used with multipart encoding.", objArray1);
                                        }
                                     }else if(oobject instanceof r){
                                        uoa.c(i, oobject4);
                                        if (uoa.q != null) {
                                           uoa.g = true;
                                           uClass2 = r.g(oobject4);
                                           if (Map.class.isAssignableFrom(uClass2)) {
                                              type = r.h(oobject4, uClass2, Map.class);
                                              if (type instanceof ParameterizedType) {
                                                 type1 = r.f(0, type);
                                                 if (str5 == type1) {
                                                    type = r.f(1, type);
                                                    if (!part.isAssignableFrom(r.g(type))) {
                                                       op1 = new l$j(uoa.b, i, uoa.a.e(type, oobject3, uoa.c), oobject.encoding());
                                                    }else {
                                                       objArray1 = new Object[0];
                                                       throw r.m(uoa.b, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", objArray1);
                                                    }
                                                 }else {
                                                    objArray1 = new Object[0];
                                                    throw r.m(uoa.b, i, "@PartMap keys must be of type String: "+type1, objArray1);
                                                 }
                                              }else {
                                                 objArray1 = new Object[0];
                                                 throw r.m(uoa.b, i, str8, objArray1);
                                              }
                                           }else {
                                              objArray1 = new Object[0];
                                              throw r.m(uoa.b, i, "@PartMap parameter type must be Map.", objArray1);
                                           }
                                        }else {
                                           objArray1 = new Object[0];
                                           throw r.m(uoa.b, i, "@PartMap parameters can only be used with multipart encoding.", objArray1);
                                        }
                                     }else if(oobject instanceof a){
                                        uoa.c(i, oobject4);
                                        if (uoa.p == null && uoa.q == null) {
                                           if (uoa.h == null) {
                                              try{
                                                 uoa.h = true;
                                                 op1 = new l$c(uoa.b, i, uoa.a.e(oobject4, oobject3, uoa.c));
                                              }catch(java.lang.RuntimeException e0){
                                                 objArray = new Object[]{oobject4};
                                                 throw r.n(uoa.b, e0, i, "Unable to create @Body converter for %s", objArray);
                                              }
                                           }else {
                                              objArray1 = new Object[0];
                                              throw r.m(uoa.b, i, "Multiple @Body method annotations found.", objArray1);
                                           }
                                        }else {
                                           objArray1 = new Object[0];
                                           throw r.m(uoa.b, i, "@Body parameters cannot be used with form or multi-part encoding.", objArray1);
                                        }
                                     }else if(oobject instanceof x){
                                        uoa.c(i, oobject4);
                                        uClass2 = r.g(oobject4);
                                        len = i - 1;
                                        while (true) {
                                           if (len >= 0) {
                                              object oobject5 = uoa.v[len];
                                              if (!oobject5 instanceof l$q || !oobject5.a.equals(uClass2)) {
                                                 len = len - 1;
                                              }else {
                                                 objArray = new Object[0];
                                                 throw r.m(uoa.b, i, "@Tag type "+uClass2.getName()+" is duplicate of parameter #"+(len + 1)+" and would always overwrite its value.", objArray);
                                              }
                                           }else {
                                              op1 = new l$q(uClass2);
                                           }
                                        }
                                     }else {
                                        op1 = null;
                                     }
                                  }
                                  op1 = ol1;
                               }
                               op1 = part;
                            }
                            if (op1 != null) {
                               if (i5 == null) {
                                  i5 = op1;
                               }else {
                                  objArray1 = new Object[0];
                                  throw r.m(uoa.b, i, "Multiple Retrofit annotations found, only one allowed.", objArray1);
                               }
                            }
                            len2 = i8 + 1;
                            oobject1 = oobject3;
                            oobject2 = oobject4;
                            len = i7;
                            i1 = i9;
                            v = uoa1;
                            len1 = len2;
                            len2 = i6;
                         }else {
                            i6 = len2;
                            i7 = len;
                            oobject4 = oobject2;
                            uoa1 = v;
                         }
                      }
                   }else {
                      i6 = len2;
                      i7 = len;
                      oobject4 = oobject2;
                      uoa1 = v;
                      i5 = null;
                   }
                   if (i5 == null) {
                      try{
                         if (i4 && r.g(oobject4) == c.class) {
                            uoa.w = true;
                            oobject6 = null;
                         }else {
                            objArray1 = new Object[0];
                            throw r.m(uoa.b, i, "No Retrofit annotation found.", objArray1);
                         }
                      }catch(java.lang.NoClassDefFoundError e0){
                      }
                   }else {
                      oobject6 = i5;
                   }
                   uoa1[i] = oobject6;
                   i = i + 1;
                   len2 = i6;
                   len = i7;
                   i10 = 1;
                }else if(uoa.r != null || uoa.m != null){
                   c = uoa.p;
                   if (c == null && (uoa.q == null && (uoa.o != null || uoa.h == null))) {
                      if (c == null || uoa.f != null) {
                         o oo = null;
                         if (uoa.q == null || uoa.g != null) {
                            oo = new o(uoa);
                            Type genericRetur = p1.getGenericReturnType();
                            if (!r.i(genericRetur)) {
                               if (genericRetur != Void.TYPE) {
                                  p op2 = p.class;
                                  k = oo.k;
                                  annotations = p1.getAnnotations();
                                  if (k != null) {
                                     Type[] genericParam = p1.getGenericParameterTypes();
                                     i10 = 0;
                                     object oobject7 = genericParam[(genericParam.length - 1)].getActualTypeArguments()[i10];
                                     if (oobject7 instanceof WildcardType) {
                                        oobject7 = oobject7.getLowerBounds()[i10];
                                     }
                                     if (r.g(oobject7) == op2 && oobject7 instanceof ParameterizedType) {
                                        oobject7 = r.f(i10, oobject7);
                                        str10 = 1;
                                     }else {
                                        str10 = 0;
                                     }
                                     Type[] typeArray = new Type[]{oobject7};
                                     uob = new r$b(null, a.class, typeArray);
                                     if (!r.j(annotations, h.class)) {
                                        Annotation[] uAnnotationA = new Annotation[(annotations.length + 1)];
                                        uAnnotationA[i10] = i.Z;
                                        System.arraycopy(annotations, i10, uAnnotationA, 1, annotations.length);
                                        annotations = uAnnotationA;
                                     }
                                     uoa3 = null;
                                  }else {
                                     uob = p1.getGenericReturnType();
                                     uoa3 = null;
                                     str10 = 0;
                                  }
                                  try{
                                     b uob1 = oq.d(uoa3, uob, annotations);
                                     Type type3 = uob1.responseType();
                                     if (type3 != Response.class) {
                                        if (type3 != op2) {
                                           if (!(oo.c).equals(str) || Void.class.equals(type3)) {
                                              Annotation[] annotations1 = p1.getAnnotations();
                                              try{
                                                 oh = oq.f(type3, annotations1);
                                                 oq = oq.b;
                                                 if (k == null) {
                                                    uoa4 = new j$a(oo, oq, oh, uob1);
                                                 }else if(str10){
                                                    uoa4 = new j$c(oo, oq, oh, uob1);
                                                 }else {
                                                    uoa4 = new j$b(oo, oq, oh, uob1, 0);
                                                 }
                                              }catch(java.lang.RuntimeException e0){
                                                 objArray2 = new Object[]{oh};
                                                 throw r.l(method, e0, "Unable to create converter for %s", objArray2);
                                              }
                                           }else {
                                              objArray2 = new Object[0];
                                              throw r.k(method, "HEAD method must use Void as response type.", objArray2);
                                           }
                                        }else {
                                           objArray2 = new Object[0];
                                           throw r.k(method, "Response must include generic type \(e.g., Response<String>\)", objArray2);
                                        }
                                     }else {
                                        objArray = new Object[0];
                                        throw r.k(method, "\'"+r.g(type3).getName()+"\' is not a valid response body type. Did you mean ResponseBody?", objArray);
                                     }
                                  }catch(java.lang.RuntimeException e0){
                                     objArray2 = new Object[]{uob};
                                     throw r.l(method, e0, "Unable to create call adapter for %s", objArray2);
                                  }
                               }else {
                                  objArray2 = new Object[0];
                                  throw r.k(method, "Service methods cannot return void.", objArray2);
                               }
                            }else {
                               objArray2 = new Object[]{genericRetur};
                               throw r.k(method, "Method return type must not include a type variable or wildcard: %s", objArray2);
                            }
                         }else {
                            objArray1 = new Object[oo];
                            throw r.k(uoa.b, "Multipart method must contain at least one @Part.", objArray1);
                         }
                      }else {
                         objArray1 = new Object[0];
                         throw r.k(uoa.b, "Form-encoded method must contain at least one @Field.", objArray1);
                      }
                   }else {
                      objArray1 = new Object[0];
                      throw r.k(uoa.b, "Non-body HTTP method cannot contain @Body.", objArray1);
                   }
                }else {
                   objArray1 = new Object[]{uoa.n};
                   throw r.k(uoa.b, "Missing either @%s URL or @Url parameter.", objArray1);
                }
             }
             return uoa4;
          }else {
             objArray1 = new Object[0];
             throw r.k(uoa.b, "HTTP method annotation is required \(e.g., @GET, @POST, etc.\).", objArray1);
          }
       }
    }
    public abstract Object a(Object[] p0);
}
