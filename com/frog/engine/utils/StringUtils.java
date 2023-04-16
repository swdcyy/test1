package com.frog.engine.utils.StringUtils;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Random;
import java.lang.StringBuffer;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.lang.Character;
import java.util.Collection;
import java.util.Iterator;
import java.math.BigInteger;
import java.util.List;
import java.lang.Long;

public class StringUtils	// class@00157a
{
    public static final Pattern BLANK_STRING_PATTERN;

    static {
       StringUtils.BLANK_STRING_PATTERN = Pattern.compile("\\s+");
    }
    public void StringUtils(){
       super();
    }
    public static boolean contains(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, StringUtils.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       int i1 = 0;
       while (i < p1.length() && i1 < p0.length()) {
          if (p1.charAt(i) == p0.charAt(i1)) {
             i = i + 1;
          }
          i1 = i1 + 1;
       }
       if (i == p1.length()) {
          return true;
       }
       return false;
    }
    public static String generateRandomString(int p0){
       Random obj;
       StringUtils stringUtils = StringUtils.class;
       if (PatchProxy.isSupport(stringUtils)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, stringUtils, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Random();
       StringBuffer str = "";
       for (int i = 0; i < p0; i = i + 1) {
          str = str+("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789").charAt(obj.nextInt(62));
       }
       return str;
    }
    public static byte[] getBytes(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StringUtils.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return p0.getBytes("UTF-8");
       }catch(java.io.UnsupportedEncodingException e0){
          return p0.getBytes();
       }
    }
    public static String getStringNotNull(String p0){
       if (p0 == null) {
          p0 = "";
       }
       return p0;
    }
    public static int getStringUTF8Length(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StringUtils.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (TextUtils.isEmpty(p0)) {
          return 0;
       }
       try{
          return p0.getBytes("UTF-8").length;
       }catch(java.io.UnsupportedEncodingException e0){
          return v1;
       }
    }
    public static boolean isBlankString(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StringUtils.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!TextUtils.isEmpty(p0)) {
          return StringUtils.BLANK_STRING_PATTERN.matcher(p0).matches();
       }
       return true;
    }
    public static boolean isLetterOrDigit(char p0){
       boolean b = ('a' > p0 || (p0 > 'z' && ('A' > p0 || (p0 <= 'Z' || ('0' <= p0 && p0 <= '9')))))? true: false;
       return b;
    }
    public static boolean isValidStringInUTF8(CharSequence p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StringUtils.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.isEmpty(p0)) {
          return false;
       }
       int i = p0.length();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return 1;
          }
          char c = p0.charAt(i1);
          if (0xd800 <= c && c <= 0xdfff) {
             if (Character.codePointAt(p0, i1) < 0x10000) {
                break ;
             }else {
                i1 = i1 + 1;
             }
          }
          i1 = i1 + 1;
       }
       return false;
    }
    public static String join(Collection p0,char p1){
       StringUtils stringUtils = StringUtils.class;
       if (PatchProxy.isSupport(stringUtils)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Character.valueOf(p1), null, stringUtils, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          return null;
       }else {
          return StringUtils.join(p0.iterator(), p1);
       }
    }
    public static String join(Collection p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, StringUtils.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return StringUtils.join(p0.iterator(), p1);
    }
    public static String join(Iterator p0,char p1){
       Object obj1;
       StringUtils stringUtils = StringUtils.class;
       Object obj = null;
       if (PatchProxy.isSupport(stringUtils)) {
          obj1 = PatchProxy.applyTwoRefs(p0, Character.valueOf(p1), obj, stringUtils, "6");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (p0 == null) {
          return obj;
       }else if(!p0.hasNext()){
          return "";
       }else {
          obj1 = p0.next();
          if (!p0.hasNext()) {
             return obj1.toString();
          }else {
             StringBuffer str = new StringBuffer(256);
             if (obj1 != null) {
                str = str+obj1;
             }
             while (p0.hasNext()) {
                str = str+p1;
                obj1 = p0.next();
                if (obj1 != null) {
                   str = str+obj1;
                }
             }
             return str;
          }
       }
    }
    public static String join(Iterator p0,String p1){
       StringBuffer obj = null;
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, StringUtils.class, "7");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       if (!p0.hasNext()) {
          return "";
       }
       obj1 = p0.next();
       if (!p0.hasNext()) {
          return obj1.toString();
       }
       obj = new StringBuffer(256);
       if (obj1 != null) {
          obj = obj+obj1;
       }
       while (p0.hasNext()) {
          if (p1 != null) {
             obj = obj+p1;
          }
          obj1 = p0.next();
          if (obj1 != null) {
             obj = obj+obj1;
          }
       }
       return obj;
    }
    public static String join(Object[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StringUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return StringUtils.join(p0, null);
    }
    public static String join(Object[] p0,char p1){
       StringUtils stringUtils = StringUtils.class;
       if (PatchProxy.isSupport(stringUtils)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Character.valueOf(p1), null, stringUtils, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          return null;
       }else {
          return StringUtils.join(p0, p1, 0, p0.length);
       }
    }
    public static String join(Object[] p0,char p1,int p2,int p3){
       int i1;
       if (PatchProxy.isSupport(StringUtils.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Character.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), null, StringUtils.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          return null;
       }else {
          int i = p3 - p2;
          if (i <= 0) {
             return "";
          }else if(p0[p2] == null){
             i1 = 16;
          }else {
             i1 = (p0[p2].toString()).length();
          }
          StringBuffer str = new StringBuffer((i * (i1 + 1)));
          i = p2;
          while (i < p3) {
             if (i > p2) {
                str = str+p1;
             }
             if (p0[i] != null) {
                str = str+p0[i];
             }
             i = i + 1;
          }
          return str;
       }
    }
    public static String join(Object[] p0,String p1){
       Object obj = null;
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, StringUtils.class, "4");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       return StringUtils.join(p0, p1, 0, p0.length);
    }
    public static String join(Object[] p0,String p1,int p2,int p3){
       StringBuffer obj;
       int i1;
       if (PatchProxy.isSupport(StringUtils.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), null, StringUtils.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          return null;
       }else {
          obj = "";
          if (p1 == null) {
             p1 = obj;
          }
          int i = p3 - p2;
          if (i <= 0) {
             return obj;
          }else if(p0[p2] == null){
             i1 = 16;
          }else {
             i1 = (p0[p2].toString()).length();
          }
          obj = new StringBuffer((i * (i1 + p1.length())));
          i = p2;
          while (i < p3) {
             if (i > p2) {
                obj = obj+p1;
             }
             if (p0[i] != null) {
                obj = obj+p0[i];
             }
             i = i + 1;
          }
          return obj;
       }
    }
    public static String toHexString(byte[] p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, StringUtils.class, "18");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       Object[] objArray = new Object[]{new BigInteger(1, p0)};
       return (String.format("%1$032X", objArray)).toLowerCase();
    }
    public static int[] toIntArray(List p0){
       int[] obj = PatchProxy.applyOneRefs(p0, null, StringUtils.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new int[p0.size()];
       for (int i = 0; i < p0.size(); i = i + 1) {
          obj[i] = p0.get(i).intValue();
       }
       return obj;
    }
    public static long[] toLongArray(List p0){
       long[] obj = PatchProxy.applyOneRefs(p0, null, StringUtils.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new long[p0.size()];
       for (int i = 0; i < p0.size(); i = i + 1) {
          obj[i] = p0.get(i).longValue();
       }
       return obj;
    }
    public static String[] toStrArray(List p0){
       String[] obj = PatchProxy.applyOneRefs(p0, null, StringUtils.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[p0.size()];
       p0.toArray(obj);
       return obj;
    }
}
