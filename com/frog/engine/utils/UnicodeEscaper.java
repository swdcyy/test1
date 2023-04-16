package com.frog.engine.utils.UnicodeEscaper;
import com.frog.engine.utils.CodePointTranslator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.frog.engine.utils.CharSequenceTranslator;
import java.io.Writer;
import java.lang.Boolean;

public class UnicodeEscaper extends CodePointTranslator	// class@00157e
{
    public final int above;
    public final int below;
    public final boolean between;

    public void UnicodeEscaper(){
       super(0, Integer.MAX_VALUE, true);
    }
    public void UnicodeEscaper(int p0,int p1,boolean p2){
       super();
       this.below = p0;
       this.above = p1;
       this.between = p2;
    }
    public static UnicodeEscaper above(int p0){
       UnicodeEscaper unicodeEscap = UnicodeEscaper.class;
       if (PatchProxy.isSupport(unicodeEscap)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, unicodeEscap, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return UnicodeEscaper.outsideOf(0, p0);
    }
    public static UnicodeEscaper below(int p0){
       UnicodeEscaper unicodeEscap = UnicodeEscaper.class;
       if (PatchProxy.isSupport(unicodeEscap)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, unicodeEscap, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return UnicodeEscaper.outsideOf(p0, Integer.MAX_VALUE);
    }
    public static UnicodeEscaper between(int p0,int p1){
       UnicodeEscaper unicodeEscap = UnicodeEscaper.class;
       if (PatchProxy.isSupport(unicodeEscap)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, unicodeEscap, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new UnicodeEscaper(p0, p1, true);
    }
    public static UnicodeEscaper outsideOf(int p0,int p1){
       UnicodeEscaper unicodeEscap = UnicodeEscaper.class;
       if (PatchProxy.isSupport(unicodeEscap)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, unicodeEscap, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new UnicodeEscaper(p0, p1, false);
    }
    public String toUtf16Escape(int p0){
       UnicodeEscaper unicodeEscap = UnicodeEscaper.class;
       if (PatchProxy.isSupport(unicodeEscap)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, unicodeEscap, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return "\\u"+CharSequenceTranslator.hex(p0);
    }
    public boolean translate(int p0,Writer p1){
       char[] obj;
       UnicodeEscaper unicodeEscap = UnicodeEscaper.class;
       if (PatchProxy.isSupport(unicodeEscap)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, unicodeEscap, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (this.between != null) {
          if (p0 < this.below || p0 > this.above) {
             return b;
          }
       }else if(p0 >= this.below && p0 <= this.above){
          return b;
       }
       if (p0 > 0xffff) {
          p1.write(this.toUtf16Escape(p0));
       }else {
          p1.write("\\u");
          obj = CharSequenceTranslator.HEX_DIGITS;
          p1.write(obj[((p0 >> 12) & 0x0f)]);
          p1.write(obj[((p0 >> 8) & 0x0f)]);
          p1.write(obj[((p0 >> 4) & 0x0f)]);
          p1.write(obj[(p0 & 0x0f)]);
       }
       return true;
    }
}
