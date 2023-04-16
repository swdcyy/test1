package com.tachikoma.core.exception.CreateViewFailException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class CreateViewFailException extends RuntimeException	// class@000dc8
{
    public int mErrorType;

    public void CreateViewFailException(int p0,String p1){
       String str;
       if (PatchProxy.isSupport(CreateViewFailException.class)) {
          str = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, CreateViewFailException.class, "1");
          if (str != PatchProxyResult.class) {
          }else if(p0){
             if (p0 != 1) {
                str = (p0 != 2)? "create view fail": "��Ӧ key: "+p1+" �Ĺ��������˷� view ����";
             }else {
                str = "��Ӧ key: "+p1+" �Ĺ��������� null";
             }
          }else {
             str = "�Ҳ�����Ӧ key: "+p1+" �� view";
          }
       }else {
          goto label_001c ;
       }
       super(str);
       this.mErrorType = p0;
       return;
    }
    public int getErrorType(){
       return this.mErrorType;
    }
}
