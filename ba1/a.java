package ba1.a;
import j85.e;
import ba1.d;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.socket.nano.SocketMessages$SocketMessage;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import com.kuaishou.protobuf.livestream.nano.SCLiveKlinkMessage;
import com.google.protobuf.nano.MessageNano;
import java.lang.Boolean;
import com.kuaishou.protobuf.livestream.nano.LiveKlinkProcessCondition;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import hf3.b;
import java.lang.Integer;
import java.util.Map;
import java.util.List;
import lf3.i;
import ba1.c;
import java.lang.Runnable;
import e93.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import lf3.g;
import ba1.b;

public final class a implements e	// class@000326
{
    public final d a;

    public void a(d p0){
       this.a = p0;
    }
    public final void onSignalReceive(String p0,String p1,byte[] p2){
       SocketMessages$SocketMessage payloadType;
       SCLiveKlinkMessage sCLiveKlinkM;
       i obj;
       boolean b;
       List list;
       ArrayList uArrayList;
       Iterator iterator;
       SCLiveKlinkMessage liveKlinkPro;
       a ta = this.a;
       Objects.requireNonNull(ta);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p2, ta, uod, "32")) {
       }else {
          SocketMessages$SocketMessage socketMessag = PatchProxy.applyOneRefs(p2, ta, uod, "34");
          MessageNano messageNano = null;
          if (socketMessag != patchProxyRe) {
          }else {
             try{
                socketMessag = SocketMessages$SocketMessage.parseFrom(p2);
             }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e1){
                b.H(LiveLogTag.LIVE_SOCKET, "failed to parse im message", "socketMessage", p2, e1);
                socketMessag = messageNano;
             }
          }
       }
    label_00f3 :
       return;
    }
}
