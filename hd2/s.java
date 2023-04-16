package hd2.s;
import erd.o;
import hd2.r;
import java.lang.Object;
import com.kwai.video.waynelive.util.SeiExtraData;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.protobuf.livestream.sei.nano.LiveStreamSEI$MetaDataContainer;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.sei.nano.LiveStreamSEI$MetaDataContainer$StateData;
import java.lang.Integer;
import java.util.Map;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Throwable;

public final class s implements o	// class@002d77
{
    public final r b;

    public void s(r p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       s tb;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, s.class, "1");
       if (uBoolean != patchProxyRe) {
       }else {
          try{
             a.p(p0, "it");
             tb = this.b;
             p0 = p0.mData;
             a.o(p0, "it.mData");
             Objects.requireNonNull(tb);
             Object obj = PatchProxy.applyOneRefs(p0, tb, r.class, "10");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                p0 = MessageNano.mergeFrom(new LiveStreamSEI$MetaDataContainer(), p0);
                int i = 1;
                if (p0 != null) {
                   p0 = p0.a();
                   if (p0 != null) {
                      p0 = p0.state;
                      if (p0 != null) {
                         p0 = p0.get(Integer.valueOf(i));
                      label_0059 :
                         if (p0 == null) {
                            i = false;
                         }
                         b.Z(tb.a, "isMultiPkData "+i);
                         b = i;
                      }
                   }
                }
                p0 = null;
                goto label_0059 ;
             }
          }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e6){
             b.I(tb.a, "isMultiPkData", e6);
          }
          uBoolean = Boolean.valueOf(b);
       }
       return uBoolean;
    }
}
