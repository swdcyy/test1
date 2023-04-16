package com.yxcorp.utility.TextUtils;
import android.text.style.StyleSpan;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import ekd.n0;
import android.text.SpannableString;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import android.text.style.ForegroundColorSpan;
import java.lang.Object;
import java.lang.Exception;
import ekd.e0;
import java.lang.NullPointerException;
import ekd.a0;
import java.lang.StringBuilder;
import android.widget.EditText;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import android.graphics.Color;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import java.lang.Long;
import java.util.Locale;
import java.math.BigDecimal;
import java.util.List;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import android.net.Uri;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.net.URLEncoder;
import java.lang.Integer;
import java.io.UnsupportedEncodingException;
import com.kuaishou.webkit.MimeTypeMap;
import java.util.Arrays;
import java.lang.Character$UnicodeBlock;

public class TextUtils	// class@001405
{
    public static StyleSpan a;
    public static int[][] b;

    static {
       TextUtils.a = new StyleSpan(1);
       int[][] ointArray = new int[][22];
       ointArray[0] = new int[2]{0x2e80,0x2eff};
       ointArray[1] = new int[2]{0x2f00,0x2fdf};
       ointArray[2] = new int[2]{0x3000,0x303f};
       ointArray[3] = new int[2]{0x3040,0x309f};
       ointArray[4] = new int[2]{0x30a0,0x30ff};
       ointArray[5] = new int[2]{0x3100,0x312f};
       ointArray[6] = new int[2]{0x3130,0x318f};
       ointArray[7] = new int[2]{0x3190,0x319f};
       ointArray[8] = new int[2]{0x31a0,0x31bf};
       ointArray[9] = new int[2]{0x31f0,0x31ff};
       ointArray[10] = new int[2]{0x3200,0x32ff};
       ointArray[11] = new int[2]{0x3300,1023};
       ointArray[12] = new int[2]{0x3400,0x4dbf};
       ointArray[13] = new int[2]{0x4e00,0x9fff};
       ointArray[14] = new int[2]{0xac00,0xd7af};
       ointArray[15] = new int[2]{0xf900,0xfaff};
       ointArray[16] = new int[2]{0xfe30,0xfe4f};
       ointArray[17] = new int[2]{0x20000,0x2a6df};
       ointArray[18] = new int[2]{0x2a700,0x2b73f};
       ointArray[19] = new int[2]{0x2b740,0x2b81f};
       ointArray[20] = new int[2]{0x2b820,0x2ceaf};
       ointArray[21] = new int[2]{0x2f800,0x2fa1f};
       TextUtils.b = ointArray;
    }
    public static String A(String p0,int p1){
       int i = TextUtils.f(p0);
       if (p1 < 0) {
          return "";
       }
       if (p1 >= i) {
          return p0;
       }
       return p0.substring(0, p0.offsetByCodePoints(0, p1));
    }
    public static boolean B(String p0,String[] p1){
       if (TextUtils.isEmpty(p0)) {
          return false;
       }
       p0 = n0.d(p0);
       int len = p1.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (p0.endsWith(n0.d(p1[i]))) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public static SpannableString C(int p0,String p1,String p2){
       SpannableString spannableStr = new SpannableString(p1);
       p2 = TextUtils.o(p2);
       if ((TextUtils.o(p1)).contains(p2) && !TextUtils.x(p2)) {
          try{
             Matcher matcher = Pattern.compile(p2).matcher(spannableStr);
             while (matcher.find()) {
                spannableStr.setSpan(new ForegroundColorSpan(p0), matcher.start(), matcher.end(), 33);
             }
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
       }
    }
    public static String D(String p0){
       if (!TextUtils.x(p0)) {
          return a0.c(p0);
       }
       if (!e0.a) {
          return "";
       }
       throw new NullPointerException("text is null");
    }
    public static String E(String p0){
       if (TextUtils.isEmpty(p0)) {
          p0 = null;
       }
       return p0;
    }
    public static String F(String p0,String p1,String p2){
       if (!TextUtils.isEmpty(p0) && !TextUtils.isEmpty(p1)) {
          p0 = p0.replaceAll("\("+p1+"=[^&]*\)", p1+"="+p2);
       }
       return p0;
    }
    public static Editable G(EditText p0){
       SpannableStringBuilder spannableStr = (p0 == null || p0.getText() == null)? new SpannableStringBuilder(""): p0.getText();
       return spannableStr;
    }
    public static CharSequence H(TextView p0){
       String str = "";
       if (p0 == null) {
          return str;
       }
       if (!TextUtils.isEmpty(p0.getText())) {
          str = p0.getText();
       }
       return str;
    }
    public static String I(String p0){
       if (p0 == null) {
          p0 = "";
       }
       return p0;
    }
    public static int J(String p0,int p1){
       return Color.parseColor(p0);
    }
    public static String K(long p0){
       long l = p0 / 0x36ee80;
       long l1 = (p0 / 0xea60) - (l * 60);
       p0 = ((p0 / 1000) - (60 * l1)) - (3600 * l);
       if (l > 0) {
          Object[] objArray = new Object[]{Long.valueOf(l),Long.valueOf(l1),Long.valueOf(p0)};
          return String.format("%02d:%02d:%02d", objArray);
       }else {
          Object[] objArray1 = new Object[]{Long.valueOf(l1),Long.valueOf(p0)};
          return String.format("%02d:%02d", objArray1);
       }
    }
    public static String L(String p0){
       if (TextUtils.isEmpty(p0)) {
       }else {
          p0 = p0.toLowerCase(Locale.US);
       }
       return p0;
    }
    public static String M(String p0){
       if (TextUtils.isEmpty(p0)) {
       }else {
          p0 = p0.toUpperCase(Locale.US);
       }
       return p0;
    }
    public static String N(long p0){
       return TextUtils.Q(Locale.getDefault(), p0);
    }
    public static String O(long p0,boolean p1){
       if (p1) {
          return TextUtils.Q(Locale.getDefault(), p0);
       }
       return TextUtils.v(Locale.getDefault(), p0, true);
    }
    public static String P(BigDecimal p0,BigDecimal p1,List p2,boolean p3){
       double d;
       if (p0.longValue() - p1.longValue() < 0) {
          return String.valueOf(p0.longValue());
       }
       int i = 0;
       while (true) {
          if (i >= p2.size()) {
             return "";
          }
          int i1 = i + 1;
          d = p0.divide(p1.pow(i1), 1, RoundingMode.HALF_UP).doubleValue();
          if (d - (double)p1.longValue() >= 0) {
             int i2 = p2.size() - 1;
             if (i != i2) {
                i = i1;
             }
          }
          if (p3) {
             break ;
          }else {
             return new DecimalFormat("0.0#"+p2.get(i)).format(d);
          }
       }
       return d+p2.get(i);
    }
    public static String Q(Locale p0,long p1){
       return TextUtils.v(p0, p1, false);
    }
    public static String a(String p0,int p1,String p2){
       if (TextUtils.x(p0) || (p1 > 0 && TextUtils.f(p0) > p1)) {
          if (TextUtils.x(p2)) {
             return TextUtils.A(p0, p1);
          }else {
             p1--;
             p0 = TextUtils.A(p0, p1)+p2;
          }
       }
       return p0;
    }
    public static String b(String p0,int p1,String p2){
       if (TextUtils.x(p0) || (p1 > 0 && p0.length() > p1)) {
          if (TextUtils.x(p2)) {
             return p0.substring(0, p1);
          }else {
             p1--;
             p0 = p0.substring(0, p1)+p2;
          }
       }
       return p0;
    }
    public static String c(String p0,String p1,String p2){
       if (TextUtils.x(p0)) {
          return p0;
       }
       Uri uri = Uri.parse(p0);
       if (uri != null && uri.getQueryParameterNames().contains(p1)) {
          return TextUtils.F(p0, p1, p2);
       }
       HashMap hashMap = new HashMap();
       hashMap.put(p1, p2);
       return TextUtils.e(p0, hashMap);
    }
    public static String d(String p0,CharSequence p1){
       if (TextUtils.x(p1)) {
          return p0;
       }
       int i = p0.indexOf("#");
       String str = "";
       String str1 = (i == -1)? str: p0.substring(i);
       int i1 = 0;
       if (i >= 0) {
          p0 = (!i)? str: p0.substring(i1, i);
       }
    label_0024 :
       StringBuilder str2 = p0;
       str = "?";
       if (!p0.contains(str)) {
          str2 = str2+str;
       }else if(!p0.endsWith(str)){
          str = "&";
          if (!p0.endsWith(str)) {
             str2 = str2+str;
          }
       }
       str2 = (p1.length() > 1 && (p1.charAt(i1) == '?' || p1.charAt(i1) == '&'))? str2+p1.subSequence(1, p1.length()): str2+p1;
       return str2+str1;
    }
    public static String e(String p0,Map p1){
       if (p1 != null) {
          StringBuilder str = "";
          int i = 1;
          Iterator iterator = p1.keySet().iterator();
          while (iterator.hasNext()) {
             String str1 = iterator.next();
             String str2 = p1.get(str1);
             if (!TextUtils.isEmpty(str1) && !TextUtils.isEmpty(str2)) {
                if (i) {
                   i = 0;
                }else {
                   str = str+'&';
                }
                str = str+str1+'='+URLEncoder.encode(str2, "utf-8");
             }
          }
          p0 = TextUtils.d(p0, str);
       }
       return p0;
    }
    public static int f(String p0){
       if (TextUtils.x(p0)) {
          return 0;
       }
       return p0.codePointCount(0, p0.length());
    }
    public static String g(int p0){
       Object[] objArray = new Object[]{Integer.valueOf((p0 & 0xff))};
       return String.format("%08X", objArray);
    }
    public static boolean h(String p0){
       if (!TextUtils.x(p0)) {
          char[] uocharArray = p0.toCharArray();
          int len = uocharArray.length;
          int i = 0;
          while (i < len) {
             if (TextUtils.w(uocharArray[i])) {
                return true;
             }
             i = i + 1;
          }
       }
       return false;
    }
    public static String i(String p0,String p1){
       if (TextUtils.x(p0)) {
          return p1;
       }
       return p0;
    }
    public static CharSequence j(CharSequence p0){
       String str;
       if (TextUtils.isEmpty(p0)) {
          str = "";
       }
       return str;
    }
    public static String k(String p0){
       if (TextUtils.isEmpty(p0)) {
          p0 = "";
       }
       return p0;
    }
    public static String l(String p0){
       if (p0 == null) {
          return "";
       }
       return URLEncoder.encode(p0);
    }
    public static boolean m(String p0,String p1){
       boolean b = (!TextUtils.x(p0) && (!TextUtils.x(p1) && p0.endsWith(p1)))? true: false;
       return b;
    }
    public static boolean n(CharSequence p0,CharSequence p1){
       if (p0 == p1) {
          return true;
       }
       if (p0 != null && p1 != null) {
          int i = p0.length();
          if (i == p1.length()) {
             if (p0 instanceof String && p1 instanceof String) {
                return p0.equals(p1);
             }else {
                int i1 = 0;
                while (true) {
                   if (i1 >= i) {
                      return true;
                   }
                   if (p0.charAt(i1) != p1.charAt(i1)) {
                      break ;
                   }else {
                      i1 = i1 + 1;
                   }
                }
                return false;
             }
          }
       }
       return false;
    }
    public static String o(String p0){
       if (!TextUtils.x(p0)) {
          String[] stringArray = new String[]{"\\","$","\(","\)","*","+",".","[","]","?","^","{","}","|"};
          int i = 0;
          while (i < 14) {
             object oobject = stringArray[i];
             if (p0.contains(oobject)) {
                p0 = p0.replace(oobject, "\\"+oobject);
             }
             i = i + 1;
          }
       }
       return p0;
    }
    public static String p(String p0){
       if (p0 == null) {
          return ".xxx";
       }
       int i = p0.lastIndexOf(46);
       if (i >= 0 && i < (p0.length() - 2)) {
          return n0.d(p0.substring(i));
       }
       return ".xxx";
    }
    public static String q(String p0){
       if (!TextUtils.x(p0)) {
          return TextUtils.p(Uri.parse(p0).getPath());
       }
       return ".xxx";
    }
    public static CharSequence r(int p0,String p1){
       SpannableString spannableStr = new SpannableString(p1);
       spannableStr.setSpan(new ForegroundColorSpan(p0), 0, spannableStr.length(), 0);
       return spannableStr;
    }
    public static String s(String p0){
       String str = "";
       if (TextUtils.isEmpty(p0)) {
          return str;
       }
       int i = p0.lastIndexOf(46);
       if (i >= 0) {
          str = p0.substring((i + 1));
       }
       return str;
    }
    public static int t(String p0){
       int i = 0;
       try{
          if (!TextUtils.x(p0)) {
             i = p0.getBytes("GB18030").length;
          }
       }catch(java.io.UnsupportedEncodingException e2){
          e2.printStackTrace();
       }
       return i;
    }
    public static String u(String p0){
       return MimeTypeMap.getSingleton().getMimeTypeFromExtension(TextUtils.s(p0));
    }
    public static String v(Locale p0,long p1,boolean p2){
       String[] stringArray;
       BigDecimal uBigDecimal = BigDecimal.valueOf(p1);
       if ((TextUtils.L(p0.getLanguage())).equals("zh")) {
          stringArray = new String[]{"Эђ","вк"};
          return TextUtils.P(uBigDecimal, BigDecimal.valueOf(0x2710), Arrays.asList(stringArray), p2);
       }else {
          stringArray = new String[]{"k","m","b"};
          return TextUtils.P(uBigDecimal, BigDecimal.valueOf(1000), Arrays.asList(stringArray), p2);
       }
    }
    public static boolean w(char p0){
       Character$UnicodeBlock unicodeBlock = Character$UnicodeBlock.of(p0);
       boolean b = (unicodeBlock != Character$UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS && (unicodeBlock != Character$UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS && (unicodeBlock != Character$UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A && (unicodeBlock != Character$UnicodeBlock.GENERAL_PUNCTUATION && (unicodeBlock == Character$UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || unicodeBlock == Character$UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS)))))? true: false;
       return b;
    }
    public static boolean x(CharSequence p0){
       boolean b = (p0 == null || !p0.length())? true: false;
       return b;
    }
    public static boolean y(CharSequence[] p0){
       if (!p0.length) {
          return true;
       }
       int len = p0.length;
       int i = 0;
       boolean b = false;
       while (i < len) {
          object oobject = p0[i];
          b = (b || TextUtils.x(oobject))? true: false;
          i = i + 1;
       }
       return b;
    }
    public static String z(String p0,int p1,char p2){
       StringBuilder str = "";
       int i = str.length() + p0.length();
       while (i < p1) {
          str = str+p2;
       }
       return str+p0;
    }
}
