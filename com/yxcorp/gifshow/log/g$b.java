package com.yxcorp.gifshow.log.g$b;
import java.lang.Object;
import java.util.ArrayList;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;

public class g$b	// class@001b07
{
    public final List a;
    public final int b;

    public void g$b(int p0){
       super();
       this.a = new ArrayList();
       this.b = p0;
    }
    public void a(ClientEvent$ExpTagTrans p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$b.class, "1")) {
          return;
       }
       this.a.add(p0);
       return;
    }
    public ClientEvent$ExpTagTransList b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g$b uob = g$b.class;
       Object[] objArray = null;
       g$b obj = PatchProxy.apply(objArray, this, uob, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       Iterator obj1 = PatchProxy.applyOneRefs(obj, this, uob, "4");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else if(obj.isEmpty()){
          ArrayList uArrayList = new ArrayList();
          obj1 = obj.iterator();
          while (obj1.hasNext()) {
             ClientEvent$ExpTagTrans uExpTagTrans = obj1.next();
             if (this.c(uExpTagTrans)) {
                uArrayList.add(uExpTagTrans);
             }
          }
          g$b tb = this.b;
          if (uArrayList.size() > tb) {
             uArrayList = uArrayList.subList(0, tb);
          }
          objArray = new ClientEvent$ExpTagTransList();
          ClientEvent$ExpTagTrans[] uExpTagTrans1 = new ClientEvent$ExpTagTrans[0];
          objArray.expTagTrans = uArrayList.toArray(uExpTagTrans1);
       }
       return objArray;
    }
    public boolean c(ClientEvent$ExpTagTrans p0){
       boolean b = (p0 != null && (p0.clientExpTag != null && p0.serverExpTag != null))? true: false;
       return b;
    }
    public ClientEvent$ExpTagTrans d(){
       ClientEvent$ExpTagTrans uExpTagTrans;
       Object obj = PatchProxy.apply(null, this, g$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = this.a.size() - 1;
       while (true) {
          if (i < 0) {
             return null;
          }
          uExpTagTrans = this.a.get(i);
          if (this.c(uExpTagTrans)) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return uExpTagTrans;
    }
}
