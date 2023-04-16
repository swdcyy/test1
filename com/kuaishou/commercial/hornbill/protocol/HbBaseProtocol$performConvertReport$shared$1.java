package com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol$performConvertReport$shared$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import java.lang.Object;
import com.google.gson.JsonObject;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.Number;

public final class HbBaseProtocol$performConvertReport$shared$1 extends Lambda implements l	// class@0014eb
{
    public final BaseFeed $baseFeed;
    public final boolean $defaultConvert;
    public final String $scene;
    public final HbBaseProtocol this$0;

    public void HbBaseProtocol$performConvertReport$shared$1(HbBaseProtocol p0,boolean p1,BaseFeed p2,String p3){
       this.this$0 = p0;
       this.$defaultConvert = p1;
       this.$baseFeed = p2;
       this.$scene = p3;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HbBaseProtocol$performConvertReport$shared$1.class, "1")) {
          return;
       }
       a.p(p0, "special");
       p0.a0("is_default_convert", Integer.valueOf(this.$defaultConvert));
       this.this$0.a(this.$baseFeed, this.$scene, -1000, p0);
       return;
    }
}
