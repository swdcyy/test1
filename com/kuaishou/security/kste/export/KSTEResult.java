package com.kuaishou.security.kste.export.KSTEResult;
import com.kuaishou.security.kste.export.KSTEResult$Code;
import java.lang.Object;

public class KSTEResult	// class@000f10
{
    public byte[] result;
    public KSTEResult$Code retCode;

    public void KSTEResult(KSTEResult$Code p0,byte[] p1){
       super();
       this.retCode = p0;
       this.result = p1;
    }
    public byte[] getResult(){
       return this.result;
    }
    public KSTEResult$Code getRetCode(){
       return this.retCode;
    }
    public void setResult(byte[] p0){
       this.result = p0;
    }
    public void setRetCode(KSTEResult$Code p0){
       this.retCode = p0;
    }
}
