package com.kwai.feature.api.feed.growth.model.ResultResponse;
import java.io.Serializable;
import com.kwai.feature.api.feed.growth.model.ResultResponse$a;
import nsd.u;
import java.lang.Object;

public class ResultResponse implements Serializable	// class@000ed4
{
    public int result;
    public static final ResultResponse$a Companion;

    static {
       ResultResponse.Companion = new ResultResponse$a(null);
    }
    public void ResultResponse(){
       super(0, 1, null);
    }
    public void ResultResponse(int p0){
       super();
       this.result = p0;
    }
    public void ResultResponse(int p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = 0;
       }
       super(p0);
       return;
    }
    public final int getResult(){
       return this.result;
    }
    public boolean isSuccess(){
       boolean b = true;
       if (this.result == b) {
       }else {
          b = false;
       }
       return b;
    }
    public final void setResult(int p0){
       this.result = p0;
    }
}
