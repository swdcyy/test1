package com.swmansion.reanimated.ReanimatedModule$e;
import com.swmansion.reanimated.ReanimatedModule$m;
import com.swmansion.reanimated.ReanimatedModule;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Object;
import hn8.b;
import android.util.SparseArray;
import java.lang.String;
import in8.q;
import com.facebook.react.uimanager.f;
import in8.s;
import in8.t;
import in8.u;
import in8.c;
import in8.h;
import in8.o;
import in8.r;
import in8.i;
import in8.e;
import in8.f$a;
import in8.f$b;
import in8.f$c;
import in8.l;
import in8.b;
import com.swmansion.reanimated.nodes.EventNode;
import in8.a;
import in8.g;
import in8.p;
import in8.k;
import in8.d;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;

public class ReanimatedModule$e implements ReanimatedModule$m	// class@000c94
{
    public final int a;
    public final ReadableMap b;
    public final ReanimatedModule c;

    public void ReanimatedModule$e(ReanimatedModule p0,int p1,ReadableMap p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(b p0){
       q oq;
       ReanimatedModule$e ta = this.a;
       ReanimatedModule$e tb = this.b;
       if (p0.a.get(ta) != null) {
          throw new JSApplicationIllegalArgumentException("Animated node with ID "+ta+" already exists");
       }
       String str = tb.getString("type");
       if (("props").equals(str)) {
          oq = new q(ta, tb, p0, p0.c);
       }else if(("style").equals(str)){
          oq = new s(ta, tb, p0);
       }else if(("transform").equals(str)){
          oq = new t(ta, tb, p0);
       }else if(("value").equals(str)){
          oq = new u(ta, tb, p0);
       }else if(("block").equals(str)){
          oq = new c(ta, tb, p0);
       }else if(("cond").equals(str)){
          oq = new h(ta, tb, p0);
       }else if(("op").equals(str)){
          oq = new o(ta, tb, p0);
       }else if(("set").equals(str)){
          oq = new r(ta, tb, p0);
       }else if(("debug").equals(str)){
          oq = new i(ta, tb, p0);
       }else if(("clock").equals(str)){
          oq = new e(ta, tb, p0);
       }else if(("clockStart").equals(str)){
          oq = new f$a(ta, tb, p0);
       }else if(("clockStop").equals(str)){
          oq = new f$b(ta, tb, p0);
       }else if(("clockTest").equals(str)){
          oq = new f$c(ta, tb, p0);
       }else if(("call").equals(str)){
          oq = new l(ta, tb, p0);
       }else if(("bezier").equals(str)){
          oq = new b(ta, tb, p0);
       }else if(("event").equals(str)){
          oq = new EventNode(ta, tb, p0);
       }else if(("always").equals(str)){
          oq = new a(ta, tb, p0);
       }else if(("concat").equals(str)){
          oq = new g(ta, tb, p0);
       }else if(("param").equals(str)){
          oq = new p(ta, tb, p0);
       }else if(("func").equals(str)){
          oq = new k(ta, tb, p0);
       }else if(("callfunc").equals(str)){
          oq = new d(ta, tb, p0);
       }else {
          throw new JSApplicationIllegalArgumentException("Unsupported node type: "+str);
       }
       p0.a.put(ta, oq);
       return;
    }
}
