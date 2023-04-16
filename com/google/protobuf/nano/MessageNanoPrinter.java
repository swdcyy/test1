package com.google.protobuf.nano.MessageNanoPrinter;
import java.lang.Object;
import java.lang.StringBuffer;
import java.lang.String;
import java.lang.Integer;
import java.lang.Character;
import java.lang.StringBuilder;
import com.google.protobuf.nano.MessageNano;
import java.lang.reflect.InvocationTargetException;
import java.lang.IllegalAccessException;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.Byte;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.Boolean;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public final class MessageNanoPrinter	// class@00051a
{

    public void MessageNanoPrinter(){
       super();
    }
    public static void appendQuotedBytes(byte[] p0,StringBuffer p1){
       if (p0 == null) {
          p1+"\"\"";
          return;
       }else {
          p1 = p1+'"';
          int i = 0;
          while (i < p0.length) {
             int i1 = p0[i] & 0x00ff;
             char c = '\';
             if (i1 == c || i1 == '"') {
                p1 = p1+c+(char)i1;
             }else if(i1 >= 32 && i1 < 127){
                p1 = p1+(char)i1;
             }else {
                Object[] objArray = new Object[]{Integer.valueOf(i1)};
                p1 = p1+String.format("\\%03o", objArray);
             }
             i = i + 1;
          }
          p1+'"';
          return;
       }
    }
    public static String deCamelCaseify(String p0){
       StringBuffer str = "";
       int i = 0;
       while (i < p0.length()) {
          char c = p0.charAt(i);
          if (!i) {
             str = str+Character.toLowerCase(c);
          }else if(Character.isUpperCase(c)){
             str = str+'_'+Character.toLowerCase(c);
          }else {
             str = str+c;
          }
          i = i + 1;
       }
       return str;
    }
    public static String escapeString(String p0){
       int i = p0.length();
       StringBuilder str = new StringBuilder(i);
       int i1 = 0;
       while (i1 < i) {
          char c = p0.charAt(i1);
          if (c >= ' ' && (c <= '~' && (c != '"' && c != '''))) {
             str = str+c;
          }else {
             Object[] objArray = new Object[]{Integer.valueOf(c)};
             str = str+String.format("\\u%04x", objArray);
          }
          i1 = i1 + 1;
       }
       return str;
    }
    public static String print(MessageNano p0){
       if (p0 == null) {
          return "";
       }
       StringBuffer str = "";
       String str1 = null;
       try{
          MessageNanoPrinter.print(str1, p0, "", str);
          return str;
       }catch(java.lang.IllegalAccessException e4){
          return v0+e4.getMessage();
       }catch(java.lang.reflect.InvocationTargetException e4){
          return v0+e4.getMessage();
       }
    }
    public static void print(String p0,Object p1,StringBuffer p2,StringBuffer p3){
       String obj;
       if (p1 == null) {
       }else {
          String str = "  ";
          String str1 = " <\n";
          if (p1 instanceof MessageNano) {
             int i = p2.length();
             if (p0 != null) {
                p3 = p3+p2+MessageNanoPrinter.deCamelCaseify(p0)+str1;
                p2 = p2+str;
             }
             Class class = p1.getClass();
             Field[] fields = class.getFields();
             int len = fields.length;
             int i1 = 0;
             while (i1 < len) {
                object oobject = fields[i1];
                int modifiers = oobject.getModifiers();
                String name = oobject.getName();
                if (!("cachedSize").equals(name)) {
                   int i2 = modifiers & 0x01;
                   if (i2 == 1) {
                      modifiers = modifiers & 0x08;
                      if (modifiers != 8) {
                         String str2 = "_";
                         if (!name.startsWith(str2) && !name.endsWith(str2)) {
                            Class type = oobject.getType();
                            obj = oobject.get(p1);
                            if (type.isArray()) {
                               if (type.getComponentType() == Byte.TYPE) {
                                  MessageNanoPrinter.print(name, obj, p2, p3);
                               }else if(obj == null){
                                  modifiers = 0;
                               }else {
                                  modifiers = Array.getLength(obj);
                               }
                               for (i2 = 0; i2 < modifiers; i2 = i2 + 1) {
                                  MessageNanoPrinter.print(name, Array.get(obj, i2), p2, p3);
                               }
                            }else {
                               MessageNanoPrinter.print(name, obj, p2, p3);
                            }
                         }
                      }
                   }
                }
                i1 = i1 + 1;
             }
             Method[] methods = class.getMethods();
             len = methods.length;
             i1 = 0;
             while (i1 < len) {
                obj = methods[i1].getName();
                if (obj.startsWith("set")) {
                   obj = obj.substring(3);
                   try{
                      Class[] uClassArray = new Class[0];
                      Object[] objArray = new Object[0];
                      if (class.getMethod("has"+obj, uClassArray).invoke(p1, objArray).booleanValue()) {
                         uClassArray = new Class[0];
                         objArray = new Object[0];
                         MessageNanoPrinter.print(obj, class.getMethod("get"+obj, uClassArray).invoke(p1, objArray), p2, p3);
                      }
                   }catch(java.lang.NoSuchMethodException e0){
                   }
                }
                i1 = i1 + 1;
             }
             if (p0 != null) {
                p2.setLength(i);
                p3+p2+">\n";
             }
          }else if(p1 instanceof Map){
             p0 = MessageNanoPrinter.deCamelCaseify(p0);
             p1 = p1.entrySet().iterator();
             while (p1.hasNext()) {
                Map$Entry uEntry = p1.next();
                p3 = p3+p2+p0+str1;
                p2 = p2+str;
                MessageNanoPrinter.print("key", uEntry.getKey(), p2, p3);
                MessageNanoPrinter.print("value", uEntry.getValue(), p2, p3);
                p2.setLength(p2.length());
                p3+p2+">\n";
             }
          }else {
             p3 = p3+p2+MessageNanoPrinter.deCamelCaseify(p0)+": ";
             if (p1 instanceof String) {
                p3 = p3+"\""+MessageNanoPrinter.sanitizeString(p1)+"\"";
             }else if(p1 instanceof byte[]){
                MessageNanoPrinter.appendQuotedBytes(p1, p3);
             }else {
                p3 = p3+p1;
             }
             p3+"\n";
          }
       }
       return;
    }
    public static String sanitizeString(String p0){
       if (!p0.startsWith("http") && p0.length() > 200) {
          p0 = p0.substring(0, 200)+"[...]";
       }
       return MessageNanoPrinter.escapeString(p0);
    }
}
