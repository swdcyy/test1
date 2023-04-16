package com.xiaomi.push.h;
import org.xmlpull.v1.XmlPullParser;
import ws8.a5;
import com.xiaomi.push.e;
import java.lang.String;
import com.xiaomi.push.e$a;
import java.util.HashMap;
import java.lang.Object;
import com.xiaomi.push.f;
import ws8.n5;
import ws8.p5;
import ws8.w5;
import ws8.v5;
import com.xiaomi.push.f$a;
import rs8.c;
import java.util.Map;
import com.xiaomi.push.go;
import com.xiaomi.push.go$b;
import java.lang.System;
import java.lang.StringBuilder;
import java.io.PrintStream;
import java.lang.Integer;
import com.xiaomi.push.go$a;
import java.util.ArrayList;
import java.util.List;
import ws8.u5;
import ys8.y0;
import com.xiaomi.push.service.bg;
import com.xiaomi.push.service.bg$b;
import ys8.a0;
import ws8.o5;
import com.xiaomi.push.gg;
import java.lang.CharSequence;
import android.text.TextUtils;
import ws8.r5;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlPullParserException;
import java.io.InputStreamReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Reader;

public class h	// class@00110f
{
    public static XmlPullParser a;

    public static e a(XmlPullParser p0,a5 p1){
       String str = "";
       String attributeVal = p0.getAttributeValue(str, "id");
       String attributeVal1 = p0.getAttributeValue(str, "to");
       String attributeVal2 = p0.getAttributeValue(str, "from");
       String attributeVal3 = p0.getAttributeValue(str, "chid");
       e$a uoa = e$a.a(p0.getAttributeValue(str, "type"));
       HashMap hashMap = new HashMap();
       int i = 0;
       for (int i1 = 0; i1 < p0.getAttributeCount(); i1 = i1 + 1) {
          String attributeNam = p0.getAttributeName(i1);
          hashMap.put(attributeNam, p0.getAttributeValue(str, attributeNam));
       }
       p5 op5 = null;
       f uof = op5;
       while (!i) {
          int i2 = p0.next();
          if (i2 == 2) {
             String name = p0.getName();
             String namespace = p0.getNamespace();
             if (name.equals("error")) {
                uof = h.c(p0);
             }else {
                op5 = new e();
                op5.i(h.e(name, namespace, p0));
             }
          }else if(i2 == 3 && (p0.getName()).equals("iq")){
             i = 1;
          }
       }
       if (op5 == null) {
          if (e$a.b == uoa || e$a.c == uoa) {
             v5 ov5 = new v5();
             ov5.n(attributeVal);
             ov5.r(attributeVal2);
             ov5.t(attributeVal1);
             ov5.y(e$a.e);
             ov5.p(attributeVal3);
             ov5.h(new f(f$a.f));
             p1.n(ov5);
             c.u("iq usage error. send packet in packet parser.");
             return null;
          }else {
             op5 = new w5();
          }
       }
       op5.n(attributeVal);
       op5.r(attributeVal1);
       op5.p(attributeVal3);
       op5.t(attributeVal2);
       op5.y(uoa);
       op5.h(uof);
       op5.z(hashMap);
       return op5;
    }
    public static go b(XmlPullParser p0){
       go ogo;
       String attributeVal1;
       int i;
       String name;
       String namespace;
       go$b a = go$b.a;
       String str = "";
       String attributeVal = p0.getAttributeValue(str, "type");
       if (attributeVal != null && !attributeVal.equals(str)) {
          try{
             a = go$b.valueOf(attributeVal);
          }catch(java.lang.IllegalArgumentException e0){
             System.err.println("Found invalid presence type "+attributeVal);
          }
       }
    }
    public static f c(XmlPullParser p0){
       String str2;
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       int i1 = 0;
       String str = "-1";
       String str1 = i1;
       int i2 = str1;
       int i3 = 0;
       while (i3 < p0.getAttributeCount()) {
          str2 = "code";
          String str3 = "";
          if ((p0.getAttributeName(i3)).equals(str2)) {
             str = p0.getAttributeValue(str3, str2);
          }
          str2 = "type";
          if ((p0.getAttributeName(i3)).equals(str2)) {
             i2 = p0.getAttributeValue(str3, str2);
          }
          str2 = "reason";
          if ((p0.getAttributeName(i3)).equals(str2)) {
             str1 = p0.getAttributeValue(str3, str2);
          }
          i3 = i3 + 1;
       }
       String str4 = i1;
       int i4 = str4;
       while (!i) {
          i1 = p0.next();
          if (i1 == 2) {
             if ((p0.getName()).equals("text")) {
                i4 = p0.nextText();
             }else {
                String name = p0.getName();
                str2 = p0.getNamespace();
                if (("urn:ietf:params:xml:ns:xmpp-stanzas").equals(str2)) {
                   str4 = name;
                }else {
                   uArrayList.add(h.e(name, str2, p0));
                }
             }
          }else if(i1 == 3){
             if ((p0.getName()).equals("error")) {
                i = 1;
             }
          }else if(i1 == 4){
             i4 = p0.getText();
          }
       }
       String str5 = (i2 == null)? "cancel": i2;
       f uof = new f(Integer.parseInt(str), str5, str1, str4, i4, uArrayList);
       return v8;
    }
    public static String d(XmlPullParser p0){
       int depth = p0.getDepth();
       String str = "";
       while (p0.next() != 3 || p0.getDepth() != depth) {
          str = str+p0.getText();
       }
       return str;
    }
    public static n5 e(String p0,String p1,XmlPullParser p2){
       p0 = u5.c().a("all", "xm:chat");
       if (p0 != null && p0 instanceof y0) {
          return p0.c(p2);
       }
       return null;
    }
    public static p5 f(XmlPullParser p0){
       String attributeVal;
       String text;
       XmlPullParser xmlPullParse = p0;
       String str = "";
       String str1 = "s";
       String str2 = "type";
       String str3 = "to";
       String str4 = "from";
       String str5 = "chid";
       String str6 = "id";
       int i = 0;
       String str7 = null;
       if (("1").equals(xmlPullParse.getAttributeValue(str, str1))) {
          attributeVal = xmlPullParse.getAttributeValue(str, str5);
          str5 = xmlPullParse.getAttributeValue(str, str6);
          str4 = xmlPullParse.getAttributeValue(str, str4);
          str3 = xmlPullParse.getAttributeValue(str, str3);
          str = xmlPullParse.getAttributeValue(str, str2);
          bg$b uob = bg.c().b(attributeVal, str3);
          if (uob == null) {
             uob = bg.c().b(attributeVal, str4);
          }
          if (uob != null) {
             p5 op5 = str7;
             while (true) {
                String str8 = "error while receiving a encrypted message with wrong format";
                if (!i) {
                   int i1 = p0.next();
                   if (i1 == 2) {
                      if (str1.equals(p0.getName())) {
                         if (p0.next() == 4) {
                            text = p0.getText();
                            if (("5").equals(attributeVal) || ("6").equals(attributeVal)) {
                               break ;
                            }else {
                               h.h(a0.h(a0.g(uob.i, str5), text));
                               h.a.next();
                               op5 = h.f(h.a);
                            }
                         }else {
                            throw new gg(str8);
                         }
                      }else {
                         throw new gg(str8);
                      }
                   }else if(i1 == 3 && (p0.getName()).equals("message")){
                      i = 1;
                   }
                }else if(op5 != null){
                   return op5;
                }else {
                   throw new gg(str8);
                }
             }
             o5 oo5 = new o5();
             oo5.p(attributeVal);
             oo5.C(true);
             oo5.t(str4);
             oo5.r(str3);
             oo5.n(str5);
             oo5.K(str);
             n5 on5 = new n5(str1, str7, str7, str7);
             on5.f(text);
             oo5.i(on5);
             return oo5;
          }else {
             throw new gg("the channel id is wrong while receiving a encrypted message");
          }
       }else {
          o5 oo51 = new o5();
          attributeVal = xmlPullParse.getAttributeValue(str, str6);
          if (attributeVal == null) {
             attributeVal = "ID_NOT_AVAILABLE";
          }
          oo51.n(attributeVal);
          oo51.r(xmlPullParse.getAttributeValue(str, str3));
          oo51.t(xmlPullParse.getAttributeValue(str, str4));
          oo51.p(xmlPullParse.getAttributeValue(str, str5));
          attributeVal = xmlPullParse.getAttributeValue(str, "appid");
          try{
             oo51.x(attributeVal);
             attributeVal = xmlPullParse.getAttributeValue(str, "transient");
          }catch(java.lang.Exception e0){
             CharSequence uCharSequenc = str7;
          }
          try{
             text = e0.getAttributeValue(str, "seq");
             if (!TextUtils.isEmpty(text)) {
                oo51.B(text);
             }
             try{
                text = e0.getAttributeValue(str, "mseq");
                if (!TextUtils.isEmpty(text)) {
                   oo51.E(text);
                }
                try{
                   text = e0.getAttributeValue(str, "fseq");
                   if (!TextUtils.isEmpty(text)) {
                      oo51.G(text);
                   }
                   try{
                      text = e0.getAttributeValue(str, "status");
                      if (!TextUtils.isEmpty(text)) {
                         oo51.I(text);
                      }
                   }catch(java.lang.Exception e0){
                   }
                   int b = (!TextUtils.isEmpty(uCharSequenc) && uCharSequenc.equalsIgnoreCase("true"))? true: false;
                   oo51.z(b);
                   oo51.K(e0.getAttributeValue(str, str2));
                   attributeVal = h.i(p0);
                   if (attributeVal != null && !str.equals(attributeVal.trim())) {
                      oo51.Q(attributeVal);
                   }else {
                      attributeVal = p5.j;
                   }
                   while (!i) {
                      b = p0.next();
                      if (b == 2) {
                         attributeVal = p0.getName();
                         text = p0.getNamespace();
                         if (TextUtils.isEmpty(text)) {
                            text = "xm";
                         }
                         if (attributeVal.equals("subject")) {
                            h.i(p0);
                            oo51.M(h.d(p0));
                         }else if(attributeVal.equals("body")){
                            attributeVal = e0.getAttributeValue(str, "encode");
                            text = h.d(p0);
                            if (!TextUtils.isEmpty(attributeVal)) {
                               oo51.y(text, attributeVal);
                            }else {
                               oo51.O(text);
                            }
                         }else if(attributeVal.equals("thread")){
                            if (str7 == null) {
                               str7 = p0.nextText();
                            }
                         }else if(attributeVal.equals("error")){
                            oo51.h(h.c(p0));
                         }else {
                            oo51.i(h.e(attributeVal, text, e0));
                         }
                         text = 3;
                      }else if(b == 3 && (p0.getName()).equals("message")){
                         i = 1;
                      }
                   }
                   oo51.P(str7);
                   return oo51;
                }catch(java.lang.Exception e0){
                }
             }catch(java.lang.Exception e0){
             }
          }catch(java.lang.Exception e0){
          }
       }
    }
    public static r5 g(XmlPullParser p0){
       r5 or5 = null;
       int i = 0;
       while (!i) {
          int i1 = p0.next();
          if (i1 == 2) {
             or5 = new r5(p0.getName());
          }else if(i1 == 3 && (p0.getName()).equals("error")){
             i = 1;
          }
       }
       return or5;
    }
    public static void h(byte[] p0){
       if (h.a == null) {
          try{
             XmlPullParser xmlPullParse = XmlPullParserFactory.newInstance().newPullParser();
             h.a = xmlPullParse;
             xmlPullParse.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
          }catch(org.xmlpull.v1.XmlPullParserException e0){
             e0.printStackTrace();
          }
       }
    }
    public static String i(XmlPullParser p0){
       int i = 0;
       while (true) {
          if (i >= p0.getAttributeCount()) {
             return null;
          }
          String attributeNam = p0.getAttributeName(i);
          if (("xml:lang").equals(attributeNam) || (("lang").equals(attributeNam) && ("xml").equals(p0.getAttributePrefix(i)))) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return p0.getAttributeValue(i);
    }
}
