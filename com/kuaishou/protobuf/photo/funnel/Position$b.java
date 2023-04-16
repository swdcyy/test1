package com.kuaishou.protobuf.photo.funnel.Position$b;
import pr4.j;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.Position;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.Position$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class Position$b extends GeneratedMessageLite$Builder implements j	// class@000e35
{

    public void Position$b(){
       super(Position.DEFAULT_INSTANCE);
    }
    public void Position$b(Position$a p0){
       super(Position.DEFAULT_INSTANCE);
    }
    public float getX(){
       Object obj = PatchProxy.apply(null, this, Position$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.instance.getX();
    }
    public float getY(){
       Object obj = PatchProxy.apply(null, this, Position$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.instance.getY();
    }
}
