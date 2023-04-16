package com.kuaishou.android.vader.persistent.DBAction;
import com.kuaishou.android.vader.persistent.LogRecord;
import com.kuaishou.android.vader.persistent.DBAction$Type;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collections;
import java.lang.Boolean;
import java.util.Collection;

public class DBAction	// class@000717
{
    public final List a;
    public final DBAction$Type b;

    public void DBAction(LogRecord p0,DBAction$Type p1){
       super();
       ArrayList uArrayList = new ArrayList();
       this.a = uArrayList;
       uArrayList.add(p0);
       this.b = p1;
    }
    public void DBAction(List p0,DBAction$Type p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public List a(){
       Object obj = PatchProxy.apply(null, this, DBAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.a);
    }
    public DBAction$Type b(){
       return this.b;
    }
    public boolean c(DBAction p0){
       DBAction obj = PatchProxy.applyOneRefs(p0, this, DBAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       DBAction$Type sentinel = DBAction$Type.Sentinel;
       if (obj != sentinel) {
          DBAction b = p0.b;
          if (b != sentinel && obj == b) {
             this.a.addAll(p0.a());
             return true;
          }
       }
       return false;
    }
}
