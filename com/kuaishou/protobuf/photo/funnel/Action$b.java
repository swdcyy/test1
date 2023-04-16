package com.kuaishou.protobuf.photo.funnel.Action$b;
import pr4.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.Action;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.Action$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.ByteString;

public final class Action$b extends GeneratedMessageLite$Builder implements a	// class@000dff
{

    public void Action$b(){
       super(Action.DEFAULT_INSTANCE);
    }
    public void Action$b(Action$a p0){
       super(Action.DEFAULT_INSTANCE);
    }
    public String getName(){
       Object obj = PatchProxy.apply(null, this, Action$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getName();
    }
    public ByteString getNameBytes(){
       Object obj = PatchProxy.apply(null, this, Action$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getNameBytes();
    }
    public String getTime(){
       Object obj = PatchProxy.apply(null, this, Action$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getTime();
    }
    public ByteString getTimeBytes(){
       Object obj = PatchProxy.apply(null, this, Action$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getTimeBytes();
    }
}
