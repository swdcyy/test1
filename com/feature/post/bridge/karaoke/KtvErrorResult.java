package com.feature.post.bridge.karaoke.KtvErrorResult;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.String;

public class KtvErrorResult extends FunctionResultParams	// class@0014a0
{
    public final String mErrorMsg;

    public void KtvErrorResult(int p0,String p1){
       super();
       this.mResult = p0;
       this.mErrorMsg = p1;
    }
}
