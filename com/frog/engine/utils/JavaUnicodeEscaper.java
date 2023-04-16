package com.frog.engine.utils.JavaUnicodeEscaper;
import com.frog.engine.utils.UnicodeEscaper;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Character;
import java.lang.StringBuilder;
import com.frog.engine.utils.CharSequenceTranslator;

public class JavaUnicodeEscaper extends UnicodeEscaper	// class@001573
{

    public void JavaUnicodeEscaper(int p0,int p1,boolean p2){
       super(p0, p1, p2);
    }
    public static JavaUnicodeEscaper above(int p0){
       JavaUnicodeEscaper javaUnicodeE = JavaUnicodeEscaper.class;
       if (PatchProxy.isSupport(javaUnicodeE)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, javaUnicodeE, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return JavaUnicodeEscaper.outsideOf(0, p0);
    }
    public static JavaUnicodeEscaper below(int p0){
       JavaUnicodeEscaper javaUnicodeE = JavaUnicodeEscaper.class;
       if (PatchProxy.isSupport(javaUnicodeE)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, javaUnicodeE, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return JavaUnicodeEscaper.outsideOf(p0, Integer.MAX_VALUE);
    }
    public static JavaUnicodeEscaper between(int p0,int p1){
       JavaUnicodeEscaper javaUnicodeE = JavaUnicodeEscaper.class;
       if (PatchProxy.isSupport(javaUnicodeE)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, javaUnicodeE, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new JavaUnicodeEscaper(p0, p1, true);
    }
    public static JavaUnicodeEscaper outsideOf(int p0,int p1){
       JavaUnicodeEscaper javaUnicodeE = JavaUnicodeEscaper.class;
       if (PatchProxy.isSupport(javaUnicodeE)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, javaUnicodeE, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new JavaUnicodeEscaper(p0, p1, false);
    }
    public String toUtf16Escape(int p0){
       JavaUnicodeEscaper javaUnicodeE = JavaUnicodeEscaper.class;
       if (PatchProxy.isSupport(javaUnicodeE)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, javaUnicodeE, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       char[] uocharArray = Character.toChars(p0);
       return "\\u"+CharSequenceTranslator.hex(uocharArray[0])+"\\u"+CharSequenceTranslator.hex(uocharArray[1]);
    }
}
