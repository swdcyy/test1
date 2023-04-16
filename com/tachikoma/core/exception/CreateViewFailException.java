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
                str = (p0 != 2)? "create view fail": "对应 key: "+p1+" 的构建返回了非 view 类型";
             }else {
                str = "对应 key: "+p1+" 的构建返回了 null";
             }
          }else {
             str = "找不到对应 key: "+p1+" 的 view";
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
