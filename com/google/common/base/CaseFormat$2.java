package com.google.common.base.CaseFormat$2;
import com.google.common.base.CaseFormat;
import java.lang.String;
import ok.b;
import com.google.common.base.CaseFormat$1;
import ok.a;

public final class CaseFormat$2 extends CaseFormat	// class@00170d
{

    public void CaseFormat$2(String p0,int p1,b p2,String p3){
       super(p0, p1, p2, p3, null);
    }
    public String convert(CaseFormat p0,String p1){
       if (p0 == CaseFormat.LOWER_HYPHEN) {
          return p1.replace('_', '-');
       }
       if (p0 == CaseFormat.UPPER_UNDERSCORE) {
          return a.d(p1);
       }
       return super.convert(p0, p1);
    }
    public String normalizeWord(String p0){
       return a.c(p0);
    }
}
