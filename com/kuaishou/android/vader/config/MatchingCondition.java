package com.kuaishou.android.vader.config.MatchingCondition;
import java.lang.Object;
import com.kuaishou.android.vader.type.Operator;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;

public class MatchingCondition	// class@000f76
{
    public Operator op;
    public List path;
    public String value;

    public void MatchingCondition(){
       super();
    }
    public Operator getOperator(){
       MatchingCondition top = this.op;
       if (top == null) {
          top = Operator.noop;
       }
       return top;
    }
    public List getPath(){
       ArrayList uArrayList;
       MatchingCondition obj = PatchProxy.apply(null, this, MatchingCondition.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.path;
       if (obj == null) {
          uArrayList = new ArrayList();
       }
       return uArrayList;
    }
    public String getValue(){
       MatchingCondition tvalue = this.value;
       if (tvalue == null) {
          tvalue = "";
       }
       return tvalue;
    }
}
