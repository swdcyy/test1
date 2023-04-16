package com.kuaishou.kotlin.livedata.ListHolder;
import java.util.List;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.kotlin.livedata.ListHolder$UpdateType;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ListHolder	// class@0007a4
{
    public int a;
    public ListHolder$UpdateType b;
    public Object c;
    public final List d;

    public void ListHolder(){
       super(null, 1, null);
    }
    public void ListHolder(List p0){
       a.p(p0, "list");
       super();
       this.d = p0;
       this.a = -1;
    }
    public void ListHolder(List p0,int p1,u p2){
       ArrayList uArrayList = (p1 & 0x01)? new ArrayList(): null;
       super(uArrayList);
       return;
    }
    public final void a(RecyclerView$Adapter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ListHolder.class, "6")) {
          return;
       }
       a.p(p0, "adapter");
       ListHolder tb = this.b;
       if (tb != null) {
          tb.notifyChange(p0, this.a);
       }
       return;
    }
    public final int b(){
       return this.a;
    }
    public final List c(){
       return this.d;
    }
    public final Object d(){
       return this.c;
    }
    public final ListHolder$UpdateType e(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ListHolder.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ListHolder && a.g(this.d, p0.d))) {
          return true;
       }
       return false;
    }
    public final int f(){
       Object obj = PatchProxy.apply(null, this, ListHolder.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.size();
    }
    public int hashCode(){
       ListHolder obj = PatchProxy.apply(null, this, ListHolder.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.d;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ListHolder.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ListHolder\(list="+this.d+"\)";
    }
}
