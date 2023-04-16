package com.facebook.hermes.unicode.AndroidUnicodeUtils;
import java.lang.Object;
import java.lang.String;
import java.util.Locale;
import java.lang.RuntimeException;
import java.text.DateFormat;
import java.lang.Long;
import java.text.Collator;
import java.text.Normalizer$Form;
import java.lang.CharSequence;
import java.text.Normalizer;

public class AndroidUnicodeUtils	// class@0010e2
{

    public void AndroidUnicodeUtils(){
       super();
    }
    public static String convertToCase(String p0,int p1,boolean p2){
       Locale default = (p2)? Locale.getDefault(): Locale.ENGLISH;
       if (p1) {
          if (p1 == 1) {
             return p0.toLowerCase(default);
          }else {
             throw new RuntimeException("Invalid target case");
          }
       }else {
          return p0.toUpperCase(default);
       }
    }
    public static String dateFormat(double p0,boolean p1,boolean p2){
       DateFormat dateTimeInst;
       if (p1 && p2) {
          dateTimeInst = DateFormat.getDateTimeInstance(2, 2);
       }else if(p1){
          dateTimeInst = DateFormat.getDateInstance(2);
       }else if(p2){
          dateTimeInst = DateFormat.getTimeInstance(2);
       }else {
          throw new RuntimeException("Bad dateFormat configuration");
       }
       return dateTimeInst.format(Long.valueOf((long)p0));
    }
    public static int localeCompare(String p0,String p1){
       return Collator.getInstance().compare(p0, p1);
    }
    public static String normalize(String p0,int p1){
       if (!p1) {
          return Normalizer.normalize(p0, Normalizer$Form.NFC);
       }
       if (p1 == 1) {
          return Normalizer.normalize(p0, Normalizer$Form.NFD);
       }
       if (p1 == 2) {
          return Normalizer.normalize(p0, Normalizer$Form.NFKC);
       }
       if (p1 == 3) {
          return Normalizer.normalize(p0, Normalizer$Form.NFKD);
       }
       throw new RuntimeException("Invalid form");
    }
}
