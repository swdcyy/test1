package com.kuaishou.pagedy.request.PreReqManager$1;
import java.util.HashMap;
import com.kuaishou.pagedy.request.d;
import com.kuaishou.pagedy.request.PreReqInfo;
import com.kuaishou.pagedy.request.a;
import java.lang.Object;

public class PreReqManager$1 extends HashMap	// class@000a95
{
    public final d this$0;
    public final PreReqInfo val$preReqInfo;

    public void PreReqManager$1(d p0,PreReqInfo p1){
       this.this$0 = p0;
       this.val$preReqInfo = p1;
       super();
       this.put("path", p1.a.f);
    }
}
