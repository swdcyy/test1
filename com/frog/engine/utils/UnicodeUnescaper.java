package com.frog.engine.utils.UnicodeUnescaper;
import com.frog.engine.utils.CharSequenceTranslator;
import java.lang.CharSequence;
import java.io.Writer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Throwable;

public class UnicodeUnescaper extends CharSequenceTranslator	// class@00157f
{

    public void UnicodeUnescaper(){
       super();
    }
    public int translate(CharSequence p0,int p1,Writer p2){
       if (PatchProxy.isSupport(UnicodeUnescaper.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, UnicodeUnescaper.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0.charAt(p1) == '\') {
          int i = p1 + 1;
          if (i < p0.length()) {
             int i1 = 117;
             if (p0.charAt(i) == i1) {
                i = 2;
                int i2 = p1 + i;
                while (i2 < p0.length() && p0.charAt(i2) == i1) {
                   i = i + 1;
                }
                if (i2 < p0.length() && p0.charAt(i2) == '+') {
                   i = i + 1;
                }
                i1 = p1 + i;
                i2 = i1 + 4;
                if (i2 <= p0.length()) {
                   p0 = p0.subSequence(i1, i2);
                   try{
                      p2.write((char)Integer.parseInt(p0.toString(), 16));
                      return (i + 4);
                   }catch(java.lang.NumberFormatException e9){
                      throw new IllegalArgumentException("Unable to parse unicode value: "+p0, e9);
                   }
                }else {
                   throw new IllegalArgumentException("Less than 4 hex digits in unicode value: \'"+p0.subSequence(p1, p0.length())+"\' due to end of CharSequence");
                }
             }
          }
       }
       return 0;
    }
}
