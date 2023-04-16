package com.kuaishou.protobuf.photo.funnel.ViewClick$b;
import pr4.t;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.ViewClick;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.ViewClick$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.ByteString;

public final class ViewClick$b extends GeneratedMessageLite$Builder implements t	// class@000e82
{

    public void ViewClick$b(){
       super(ViewClick.DEFAULT_INSTANCE);
    }
    public void ViewClick$b(ViewClick$a p0){
       super(ViewClick.DEFAULT_INSTANCE);
    }
    public String getId(){
       Object obj = PatchProxy.apply(null, this, ViewClick$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getId();
    }
    public ByteString getIdBytes(){
       Object obj = PatchProxy.apply(null, this, ViewClick$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getIdBytes();
    }
    public String getTime(){
       Object obj = PatchProxy.apply(null, this, ViewClick$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getTime();
    }
    public ByteString getTimeBytes(){
       Object obj = PatchProxy.apply(null, this, ViewClick$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getTimeBytes();
    }
}
