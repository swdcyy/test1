package com.google.common.base.CaseFormat;
import java.lang.Enum;
import com.google.common.base.CaseFormat$1;
import ok.b;
import java.lang.String;
import com.google.common.base.CaseFormat$2;
import com.google.common.base.CaseFormat$3;
import com.google.common.base.CaseFormat$4;
import com.google.common.base.CaseFormat$5;
import java.lang.StringBuilder;
import ok.a;
import java.lang.Class;
import java.lang.Object;
import java.lang.CharSequence;
import ok.f;
import com.google.common.base.CaseFormat$StringConverter;
import ok.n;

public abstract class CaseFormat extends Enum	// class@001712
{
    public final b wordBoundary;
    public final String wordSeparator;
    public static final CaseFormat[] $VALUES;
    public static final CaseFormat LOWER_CAMEL;
    public static final CaseFormat LOWER_HYPHEN;
    public static final CaseFormat LOWER_UNDERSCORE;
    public static final CaseFormat UPPER_CAMEL;
    public static final CaseFormat UPPER_UNDERSCORE;

    static {
       CaseFormat$1 u1 = new CaseFormat$1("LOWER_HYPHEN", 0, b.e('-'), "-");
       CaseFormat.LOWER_HYPHEN = u1;
       CaseFormat$2 u2 = new CaseFormat$2("LOWER_UNDERSCORE", 1, b.e('_'), "_");
       CaseFormat.LOWER_UNDERSCORE = u2;
       CaseFormat$3 u3 = new CaseFormat$3("LOWER_CAMEL", 2, b.c('A', 'Z'), "");
       CaseFormat.LOWER_CAMEL = u3;
       CaseFormat$4 u4 = new CaseFormat$4("UPPER_CAMEL", 3, b.c('A', 'Z'), "");
       CaseFormat.UPPER_CAMEL = u4;
       CaseFormat$5 u5 = new CaseFormat$5("UPPER_UNDERSCORE", 4, b.e('_'), "_");
       CaseFormat.UPPER_UNDERSCORE = u5;
       CaseFormat[] uCaseFormatA = new CaseFormat[]{u1,u2,u3,u4,u5};
       CaseFormat.$VALUES = uCaseFormatA;
    }
    public void CaseFormat(String p0,int p1,b p2,String p3){
       super(p0, p1);
       this.wordBoundary = p2;
       this.wordSeparator = p3;
    }
    public void CaseFormat(String p0,int p1,b p2,String p3,CaseFormat$1 p4){
       super(p0, p1, p2, p3);
    }
    public static String firstCharOnlyToUpper(String p0){
       if (p0.isEmpty()) {
       }else {
          StringBuilder str = "";
          char c = p0.charAt(0);
          if (a.a(c)) {
             c = (char)(c & 0x5f);
          }
          p0 = str+c+a.c(p0.substring(1));
       }
       return p0;
    }
    public static CaseFormat valueOf(String p0){
       return Enum.valueOf(CaseFormat.class, p0);
    }
    public static CaseFormat[] values(){
       return CaseFormat.$VALUES.clone();
    }
    public String convert(CaseFormat p0,String p1){
       StringBuilder str = null;
       int i = 0;
       int i1 = -1;
       i1 = i1 + 1;
       i1 = this.wordBoundary.d(p1, i1);
       while (i1 != -1) {
          if (!i) {
             int i2 = (this.wordSeparator).length() * 4;
             int i3 = p1.length() + i2;
             str = new StringBuilder(i3)+p0.normalizeFirstWord(p1.substring(i, i1));
          }else {
             str = str+p0.normalizeWord(p1.substring(i, i1));
          }
          str = str+p0.wordSeparator;
          i = (this.wordSeparator).length() + i1;
       }
       String str1 = (!i)? p0.normalizeFirstWord(p1): str+p0.normalizeWord(p1.substring(i));
       return str1;
    }
    public f converterTo(CaseFormat p0){
       return new CaseFormat$StringConverter(this, p0);
    }
    public final String normalizeFirstWord(String p0){
       p0 = (this == CaseFormat.LOWER_CAMEL)? a.c(p0): this.normalizeWord(p0);
       return p0;
    }
    public abstract String normalizeWord(String p0);
    public final String to(CaseFormat p0,String p1){
       n.j(p0);
       n.j(p1);
       if (p0 == this) {
       }else {
          p1 = this.convert(p0, p1);
       }
       return p1;
    }
}
