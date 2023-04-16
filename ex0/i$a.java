package ex0.i$a;
import com.kwai.video.waynelive.listeners.LivePlayerBufferListener;
import ex0.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import ex0.c;
import java.lang.Boolean;
import java.util.List;
import java.lang.Iterable;
import ok.o;
import qk.y;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import java.util.Iterator;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveAnchorQosInfoSyncMessage;
import android.os.SystemClock;
import java.lang.Long;
import androidx.collection.SimpleArrayMap;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Integer;
import z1.a;

public class i$a implements LivePlayerBufferListener	// class@002213
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public void onBufferEnd(){
    }
    public void onBufferStart(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i$a.class, "1")) {
          return;
       }
       i p = this.b.P;
       Objects.requireNonNull(p);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (!PatchProxy.applyVoid(objArray, p, uoc, "3")) {
          Object obj = PatchProxy.apply(objArray, p, uoc, "4");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(p.b.size() >= 2 && y.b(p.b, p.d)){
             b = true;
          }else {
             b = false;
          }
          LiveLogTag bAD_NETWORK = LiveLogTag.BAD_NETWORK;
          Boolean uBoolean = Boolean.valueOf(b);
          StringBuilder str = PatchProxy.apply(objArray, p, uoc, "5");
          if (str != patchProxyRe) {
          }else {
             str = "[";
             Iterator iterator = p.b.iterator();
             while (iterator.hasNext()) {
                LiveFlvStream$LiveAnchorQosInfoSyncMessage liveAnchorQo = iterator.next();
                long l = SystemClock.elapsedRealtime() - p.c.getOrDefault(liveAnchorQo, Long.valueOf(0)).longValue();
                l = l / 1000;
                str = str+"AnchorQos\(passed: "+l;
                str = str+"s, maxQ: "+liveAnchorQo.maxQ+"\), ";
             }
             str = str+"]";
          }
          Object obj1 = str;
          b.d0(bAD_NETWORK, "audience buffering", "isAnchorBlock", uBoolean, "qosInfoList", obj1);
          if (b) {
             p.a.accept(Integer.valueOf(R.string.arg_RES_7f101e78));
             p.b.clear();
          }
       }
       return;
    }
}
