package com.google.protobuf.MessageLiteToString;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Character;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Double;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.Enum;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map$Entry;
import com.google.protobuf.TextFormatEscaper;
import com.google.protobuf.GeneratedMessageLite;
import java.util.HashMap;
import java.util.TreeSet;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Deprecated;
import java.lang.reflect.Modifier;
import com.google.protobuf.GeneratedMessageLite$ExtendableMessage;
import com.google.protobuf.FieldSet;
import com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor;
import com.google.protobuf.UnknownFieldSetLite;

public final class MessageLiteToString	// class@00047d
{

    public void MessageLiteToString(){
       super();
    }
    public static final String camelCaseToSnakeCase(String p0){
       StringBuilder str = "";
       for (int i = 0; i < p0.length(); i = i + 1) {
          char c = p0.charAt(i);
          if (Character.isUpperCase(c)) {
             str = str+"_";
          }
          str = str+Character.toLowerCase(c);
       }
       return str;
    }
    public static boolean isDefaultValue(Object p0){
       int i = 1;
       if (p0 instanceof Boolean) {
          return (p0.booleanValue() ^ i);
       }
       if (p0 instanceof Integer) {
          if (p0.intValue()) {
             i = false;
          }
          return i;
       }else if(p0 instanceof Float){
          if (p0.floatValue()) {
             i = false;
          }
          return i;
       }else if(p0 instanceof Double){
          if (p0.doubleValue()) {
             i = false;
          }
          return i;
       }else if(p0 instanceof String){
          return p0.equals("");
       }else if(p0 instanceof ByteString){
          return p0.equals(ByteString.EMPTY);
       }else if(p0 instanceof MessageLite){
          if (p0 != p0.getDefaultInstanceForType()) {
             i = false;
          }
          return i;
       }else if(p0 instanceof Enum){
          if (p0.ordinal()) {
             i = false;
          }
          return i;
       }else {
          return false;
       }
    }
    public static final void printField(StringBuilder p0,int p1,String p2,Object p3){
       if (p3 instanceof List) {
          p3 = p3.iterator();
          while (p3.hasNext()) {
             MessageLiteToString.printField(p0, p1, p2, p3.next());
          }
          return;
       }else if(p3 instanceof Map){
          p3 = p3.entrySet().iterator();
          while (p3.hasNext()) {
             MessageLiteToString.printField(p0, p1, p2, p3.next());
          }
          return;
       }else {
          p0 = p0+10;
          int i = 0;
          for (int i1 = 0; i1 < p1; i1 = i1 + 1) {
             p0 = p0+' ';
          }
          p0 = p0+p2;
          char c = '"';
          String str = ": \"";
          if (p3 instanceof String) {
             p0+str+TextFormatEscaper.escapeText(p3)+c;
          }else if(p3 instanceof ByteString){
             p0+str+TextFormatEscaper.escapeBytes(p3)+c;
          }else {
             String str1 = " {";
             if (p3 instanceof GeneratedMessageLite) {
                p0 = p0+str1;
                MessageLiteToString.reflectivePrintWithIndent(p3, p0, (p1 + 2));
                p0 = p0+"\n";
                for (; i < p1; i = i + 1) {
                   p0 = p0+' ';
                }
                p0+"}";
             }else if(p3 instanceof Map$Entry){
                p0 = p0+str1;
                int i2 = p1 + 2;
                MessageLiteToString.printField(p0, i2, "key", p3.getKey());
                MessageLiteToString.printField(p0, i2, "value", p3.getValue());
                p0 = p0+"\n";
                for (; i < p1; i = i + 1) {
                   p0 = p0+' ';
                }
                p0+"}";
             }else {
                p0+": "+p3.toString();
             }
          }
          return;
       }
    }
    public static void reflectivePrintWithIndent(MessageLite p0,StringBuilder p1,int p2){
       int i2;
       HashMap hashMap = new HashMap();
       HashMap hashMap1 = new HashMap();
       TreeSet treeSet = new TreeSet();
       Method[] declaredMeth = p0.getClass().getDeclaredMethods();
       int len = declaredMeth.length;
       int i = 0;
       String str = "get";
       while (i < len) {
          object oobject = declaredMeth[i];
          hashMap1.put(oobject.getName(), oobject);
          if (!oobject.getParameterTypes().length) {
             hashMap.put(oobject.getName(), oobject);
             if ((oobject.getName()).startsWith(str)) {
                treeSet.add(oobject.getName());
             }
          }
          i = i + 1;
       }
       Iterator iterator = treeSet.iterator();
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          i = 3;
          String str2 = (str1.startsWith(str))? str1.substring(i): str1;
          String str3 = "List";
          int i1 = 1;
          if (str2.endsWith(str3) && (!str2.endsWith("OrBuilderList") && !str2.equals(str3))) {
             i2 = str2.length() - 4;
             str3 = (str2.substring(0, i1)).toLowerCase()+str2.substring(i1, i2);
             Method method = hashMap.get(str1);
             if (method != null && method.getReturnType().equals(List.class)) {
                Object[] objArray = new Object[0];
                MessageLiteToString.printField(p1, p2, MessageLiteToString.camelCaseToSnakeCase(str3), GeneratedMessageLite.invokeOrDie(method, p0, objArray));
             }
          }
       label_00c0 :
          str3 = "Map";
          if (str2.endsWith(str3) && !str2.equals(str3)) {
             i2 = str2.length() - i;
             String str4 = (str2.substring(0, i1)).toLowerCase()+str2.substring(i1, i2);
             Method method1 = hashMap.get(str1);
             if (method1 != null && (method1.getReturnType().equals(Map.class) && (!method1.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method1.getModifiers())))) {
                Object[] objArray1 = new Object[0];
                MessageLiteToString.printField(p1, p2, MessageLiteToString.camelCaseToSnakeCase(str4), GeneratedMessageLite.invokeOrDie(method1, p0, objArray1));
             }
          }
       label_0123 :
          if (hashMap1.get("set"+str2) == null) {
             continue ;
          }else if(str2.endsWith("Bytes")){
             i = str2.length() - 5;
             if (hashMap.containsKey(str+str2.substring(0, i))) {
                continue ;
             }
          }
          str1 = (str2.substring(0, i1)).toLowerCase()+str2.substring(i1);
          Method method2 = hashMap.get(str+str2);
          Method method3 = hashMap.get("has"+str2);
          if (method2 != null) {
             Object[] objArray2 = new Object[0];
             Object obj = GeneratedMessageLite.invokeOrDie(method2, p0, objArray2);
             if (method3 == null) {
                if (MessageLiteToString.isDefaultValue(obj)) {
                   i1 = 0;
                }
             }else {
                objArray2 = new Object[0];
                i1 = GeneratedMessageLite.invokeOrDie(method3, p0, objArray2).booleanValue();
             }
             if (i1) {
                MessageLiteToString.printField(p1, p2, MessageLiteToString.camelCaseToSnakeCase(str1), obj);
             }
          }
       }
       if (p0 instanceof GeneratedMessageLite$ExtendableMessage) {
          Iterator iterator1 = p0.extensions.iterator();
          while (iterator1.hasNext()) {
             Map$Entry uEntry = iterator1.next();
             MessageLiteToString.printField(p1, p2, "["+uEntry.getKey().getNumber()+"]", uEntry.getValue());
          }
       }
       GeneratedMessageLite unknownField = p0.unknownFields;
       if (unknownField != null) {
          unknownField.printWithIndent(p1, p2);
       }
       return;
    }
    public static String toString(MessageLite p0,String p1){
       StringBuilder str = "# "+p1;
       MessageLiteToString.reflectivePrintWithIndent(p0, str, 0);
       return str;
    }
}
