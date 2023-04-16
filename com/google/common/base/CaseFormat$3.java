package com.google.common.base.CaseFormat$3;
import com.google.common.base.CaseFormat;
import java.lang.String;
import ok.b;
import com.google.common.base.CaseFormat$1;

public final class CaseFormat$3 extends CaseFormat	// class@00170e
{

    public void CaseFormat$3(String p0,int p1,b p2,String p3){
       super(p0, p1, p2, p3, null);
    }
    public String normalizeWord(String p0){
       return CaseFormat.firstCharOnlyToUpper(p0);
    }
}
