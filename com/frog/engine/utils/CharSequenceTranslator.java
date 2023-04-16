package com.frog.engine.utils.CharSequenceTranslator;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.Locale;
import java.lang.CharSequence;
import java.io.Writer;
import java.io.StringWriter;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.Character;
import java.lang.System;
import com.frog.engine.utils.AggregateTranslator;

public abstract class CharSequenceTranslator	// class@00156e
{
    public static final char[] HEX_DIGITS;

    static {
       CharSequenceTranslator.HEX_DIGITS = new char[16]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    }
    public void CharSequenceTranslator(){
       super();
    }
    public static String hex(int p0){
       CharSequenceTranslator uCharSequenc = CharSequenceTranslator.class;
       if (PatchProxy.isSupport(uCharSequenc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uCharSequenc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return (Integer.toHexString(p0)).toUpperCase(Locale.ENGLISH);
    }
    public abstract int translate(CharSequence p0,int p1,Writer p2);
    public final String translate(CharSequence p0){
       StringWriter obj = PatchProxy.applyOneRefs(p0, this, CharSequenceTranslator.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       try{
          obj = new StringWriter((p0.length() * 2));
          this.translate(p0, obj);
          return obj.toString();
       }catch(java.io.IOException e3){
          throw new RuntimeException(e3);
       }
    }
    public final void translate(CharSequence p0,Writer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CharSequenceTranslator.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       int i = p0.length();
       int i1 = 0;
       while (i1 < i) {
          int i2 = this.translate(p0, i1, p1);
          if (!i2) {
             char c = p0.charAt(i1);
             p1.write(c);
             i1 = i1 + 1;
             if (Character.isHighSurrogate(c) && i1 < i) {
                c = p0.charAt(i1);
                if (Character.isLowSurrogate(c)) {
                   p1.write(c);
                   i1 = i1 + 1;
                }
             }
          }else {
             for (int i3 = 0; i3 < i2; i3 = i3 + 1) {
                i1 = i1 + Character.charCount(Character.codePointAt(p0, i1));
             }
          }
       }
       return;
    }
    public final CharSequenceTranslator with(CharSequenceTranslator[] p0){
       CharSequenceTranslator[] obj = PatchProxy.applyOneRefs(p0, this, CharSequenceTranslator.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CharSequenceTranslator[(p0.length + 1)];
       obj[0] = this;
       System.arraycopy(p0, 0, obj, 1, p0.length);
       return new AggregateTranslator(obj);
    }
}
