package com.google.common.base.CaseFormat$StringConverter;
import java.io.Serializable;
import ok.f;
import com.google.common.base.CaseFormat;
import java.lang.Object;
import ok.n;
import java.lang.String;
import java.lang.Enum;
import java.lang.StringBuilder;

public final class CaseFormat$StringConverter extends f implements Serializable	// class@001711
{
    public final CaseFormat sourceFormat;
    public final CaseFormat targetFormat;
    public static final long serialVersionUID;

    public void CaseFormat$StringConverter(CaseFormat p0,CaseFormat p1){
       super();
       n.j(p0);
       this.sourceFormat = p0;
       n.j(p1);
       this.targetFormat = p1;
    }
    public Object doBackward(Object p0){
       return this.doBackward(p0);
    }
    public String doBackward(String p0){
       return this.targetFormat.to(this.sourceFormat, p0);
    }
    public Object doForward(Object p0){
       return this.doForward(p0);
    }
    public String doForward(String p0){
       return this.sourceFormat.to(this.targetFormat, p0);
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof CaseFormat$StringConverter && (this.sourceFormat.equals(p0.sourceFormat) && this.targetFormat.equals(p0.targetFormat))) {
          b = true;
       }
    label_001c :
       return b;
    }
    public int hashCode(){
       return (this.sourceFormat.hashCode() ^ this.targetFormat.hashCode());
    }
    public String toString(){
       return this.sourceFormat+".converterTo\("+this.targetFormat+"\)";
    }
}
