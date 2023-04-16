package androidx.lifecycle.MethodCallsLogger;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.util.Map;
import java.lang.Integer;

public class MethodCallsLogger	// class@0007e7
{
    public Map mCalledMethods;

    public void MethodCallsLogger(){
       super();
       this.mCalledMethods = new HashMap();
    }
    public boolean approveCall(String p0,int p1){
       Integer integer = this.mCalledMethods.get(p0);
       int i = 0;
       int i1 = (integer != null)? integer.intValue(): 0;
       if (i1 & p1) {
          i = 1;
       }
       this.mCalledMethods.put(p0, Integer.valueOf((p1 | i1)));
       return (i ^ 0x01);
    }
}
