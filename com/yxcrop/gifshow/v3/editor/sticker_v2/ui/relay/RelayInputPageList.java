package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.relay.RelayInputPageList;
import qvb.f;
import java.util.ArrayList;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qvb.n0;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.RelayRecoInputInfo;
import java.lang.CharSequence;
import java.util.Collection;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.relay.RelayInputPageList$onCreateRequest$observer$result$1;
import java.util.List;
import wkd.b;
import dmd.b;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.relay.RelayInputPageList$b;
import erd.o;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.relay.RelayInputPageList$a;
import kotlin.jvm.internal.a;

public final class RelayInputPageList extends f	// class@000acb
{
    public final ArrayList p;
    public final ArrayList q;
    public final ArrayList r;
    public String s;
    public final boolean t;

    public void RelayInputPageList(boolean p0){
       super();
       this.t = p0;
       this.p = new ArrayList();
       this.q = new ArrayList();
       this.r = new ArrayList();
    }
    public t I1(){
       String cursor;
       Object[] objArray = null;
       RelayRecoInputInfo obj = PatchProxy.apply(objArray, this, RelayInputPageList.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.L0();
       if (obj != null) {
          cursor = obj.getCursor();
          if (cursor != null) {
          label_0021 :
             int i = 1;
             RelayInputPageList relayInputPa = (!cursor.length())? 1: null;
             t ot = (relayInputPa && (this.r.isEmpty() ^ i))? t.just(new RelayInputPageList$onCreateRequest$observer$result$1(this, this.s, objArray, objArray)): b.a(-1189350045).b(cursor, 8).map(RelayInputPageList$b.b);
             t ot1 = ot.map(new RelayInputPageList$a(this, cursor));
             a.o(ot1, "observer.map { result ->бн     }\n      result\n    }");
             return ot1;
          }
       }
       cursor = "";
       goto label_0021 ;
    }
    public final ArrayList h2(){
       return this.q;
    }
    public final ArrayList i2(){
       return this.p;
    }
}
