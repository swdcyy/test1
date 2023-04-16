package lz1.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.util.zip.CRC32;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$LayoutConfig;
import java.lang.Integer;
import com.kuaishou.protobuf.livestream.sei.nano.LiveStreamSEI$MetaDataContainer;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.sei.nano.LiveStreamSEI$MetaDataContainer$StateData;
import java.util.Map;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$Size;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Throwable;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;

public final class g	// class@003095
{
    public static final g a;

    static {
       g.a = new g();
    }
    public void g(){
       super();
    }
    public final long a(byte[] p0){
       CRC32 obj = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       a.p(p0, "byteArray");
       obj = new CRC32();
       obj.update(p0);
       return obj.getValue();
    }
    public final LiveStageProto$LayoutConfig b(byte[] p0,int p1,int p2){
       if (PatchProxy.isSupport(g.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, g.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          if (p0 == null || p2 != 251) {
          }else {
             LiveStreamSEI$MetaDataContainer metaDataCont = MessageNano.mergeFrom(new LiveStreamSEI$MetaDataContainer(), p0, 0, p1);
             a.o(metaDataCont, "metadata");
             LiveStreamSEI$MetaDataContainer$StateData metaDataCont1 = metaDataCont.a();
             if (metaDataCont1 != null) {
                metaDataCont1 = metaDataCont1.state;
                if (metaDataCont1 != null) {
                   metaDataCont1 = metaDataCont1.get(Integer.valueOf(1));
                   if (metaDataCont1 != null) {
                      LiveStageProto$LayoutConfig layoutConfig = MessageNano.mergeFrom(new LiveStageProto$LayoutConfig(), metaDataCont1, 0, metaDataCont1.length);
                      if (layoutConfig != null) {
                         if (layoutConfig.bizType != null) {
                            LiveStageProto$LayoutConfig canvasSize = layoutConfig.canvasSize;
                            if (canvasSize == null || (canvasSize.width != null && canvasSize.height != null)) {
                               return layoutConfig;
                            }
                         }
                         b.B(LiveLogTag.LIVE_MULTI_INTERACT, "receive sei , everything\'s empty");
                      }
                   }
                }
             }
             return null;
          }
       }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e8){
          b.I(LiveLogTag.LIVE_MULTI_INTERACT, "seiInfoListener", e8);
       }
       return null;
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableSeiDispatch", false);
    }
}
