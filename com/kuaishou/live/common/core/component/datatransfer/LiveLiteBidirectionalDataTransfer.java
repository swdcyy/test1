package com.kuaishou.live.common.core.component.datatransfer.LiveLiteBidirectionalDataTransfer;
import com.kuaishou.live.common.core.component.datatransfer.LiveLiteBidirectionalDataTransfer$dataMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.component.datatransfer.LiveLiteBidirectionalDataTransfer$refCountMap$2;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import java.util.Map;
import com.kuaishou.android.live.log.b;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Number;
import java.lang.Boolean;

public final class LiveLiteBidirectionalDataTransfer	// class@0010dc
{
    public static final p a;
    public static final p b;
    public static final LiveLiteBidirectionalDataTransfer c;

    static {
       LiveLiteBidirectionalDataTransfer.c = new LiveLiteBidirectionalDataTransfer();
       LiveLiteBidirectionalDataTransfer.a = s.c(LiveLiteBidirectionalDataTransfer$dataMap$2.INSTANCE);
       LiveLiteBidirectionalDataTransfer.b = s.c(LiveLiteBidirectionalDataTransfer$refCountMap$2.INSTANCE);
    }
    public void LiveLiteBidirectionalDataTransfer(){
       super();
    }
    public final void a(String p0){
       LiveLiteBidirectionalDataTransfer liveLiteBidi = LiveLiteBidirectionalDataTransfer.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveLiteBidi, "6")) {
          return;
       }
       a.p(p0, "streamId");
       LiveLiteLogTag bIDIRECTIONA = LiveLiteLogTag.BIDIRECTIONAL_DATA_TRANSFER;
       bIDIRECTIONA.appendTag("LiveLiteBidirectionalDataTransfer");
       b.U(bIDIRECTIONA, "decreaseRefCount", "streamId", p0, "refCountMap", this.d(), "dataMap", this.c());
       Integer integer = this.d().get(p0);
       if (integer != null) {
          int i = integer.intValue() - 1;
          if (i <= 0) {
             if (!PatchProxy.applyVoidOneRefs(p0, this, liveLiteBidi, "7")) {
                bIDIRECTIONA.appendTag("LiveLiteBidirectionalDataTransfer");
                b.U(bIDIRECTIONA, "clear", "streamId", p0, "refCountMap", this.d(), "dataMap", this.c());
                this.d().remove(p0);
                this.c().remove(p0);
             }
          }else {
             this.d().put(p0, Integer.valueOf(i));
          }
       }
       return;
    }
    public final Object b(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveLiteBidirectionalDataTransfer.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "streamId");
       a.p(p1, "bizKey");
       Map map = this.c().get(p0);
       map = (map != null)? map.get(p1): null;
       return map;
    }
    public final Map c(){
       Object obj = PatchProxy.apply(null, this, LiveLiteBidirectionalDataTransfer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteBidirectionalDataTransfer.a.getValue();
    }
    public final Map d(){
       Object obj = PatchProxy.apply(null, this, LiveLiteBidirectionalDataTransfer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteBidirectionalDataTransfer.b.getValue();
    }
    public final void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBidirectionalDataTransfer.class, "5")) {
          return;
       }
       a.p(p0, "streamId");
       LiveLiteLogTag bIDIRECTIONA = LiveLiteLogTag.BIDIRECTIONAL_DATA_TRANSFER;
       bIDIRECTIONA.appendTag("LiveLiteBidirectionalDataTransfer");
       b.U(bIDIRECTIONA, "increaseRefCount", "streamId", p0, "refCountMap", this.d(), "dataMap", this.c());
       Map map = this.d();
       Integer integer = map.get(p0);
       if (integer == null) {
          LiveLiteBidirectionalDataTransfer.c.c().put(p0, new ConcurrentHashMap());
          integer = Integer.valueOf(0);
          map.put(p0, integer);
       }
       this.d().put(p0, Integer.valueOf((integer.intValue() + 1)));
       return;
    }
    public final boolean f(String p0,String p1,Object p2){
       boolean b;
       Map obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveLiteBidirectionalDataTransfer.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "streamId");
       a.p(p1, "bizKey");
       a.p(p2, "bizValue");
       obj = this.c().get(p0);
       if (obj != null) {
          obj.put(p1, p2);
          b = true;
       }else {
          LiveLiteLogTag bIDIRECTIONA = LiveLiteLogTag.BIDIRECTIONAL_DATA_TRANSFER;
          bIDIRECTIONA.appendTag("LiveLiteBidirectionalDataTransfer");
          b.U(bIDIRECTIONA, "can\'t find data for given streamId!", "streamId", p0, "bizKey", p1, "bizValue", p2);
          b = false;
       }
       return b;
    }
}
