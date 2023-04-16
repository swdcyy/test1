package d85.c;
import java.lang.Runnable;
import java.lang.Object;
import d85.d;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.List;
import com.kwai.chat.kwailink.log.a;
import com.kwai.chat.kwailink.service.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import java.util.Iterator;
import com.kwai.chat.kwailink.data.PacketData;
import d85.e;
import java.lang.Math;
import java.lang.System;

public final class c implements Runnable	// class@00147e
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void run(){
       List f1;
       Iterator iterator;
       boolean i;
       boolean i1;
       List e = d.e;
       List f = d.f;
       String str = "MSG_DISPATCH_PACKET, mNormalDispatchQueue.size="+e.size()+", mLargeDispatchQueue.size="+f.size();
       String str1 = "KwaiLinkPacketDispatcher";
       try{
          a.e(str1, str);
          if (!a.N1().M()) {
             a.g(str1, "MSG_DISPATCH_PACKET, but has logoff, clear packetCache.");
             e.clear();
             f.clear();
          }
          return;
       }catch(android.os.RemoteException e0){
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, objArray, d.class, "10")) {
          f1 = d.e;
          if (!f1.isEmpty()) {
             long l1 = SystemClock.elapsedRealtime();
             iterator = f1.iterator();
             while (iterator.hasNext()) {
                PacketData packetData2 = iterator.next();
                if (packetData2.n(l1)) {
                   a.e(str1, "handleNormalDispatchQueue, dispatch timeout, seq="+packetData2.j());
                   iterator.remove();
                }else if(d.b(packetData2)){
                   i = true;
                   i1 = false;
                }else {
                   i1 = d.a(packetData2);
                   i = false;
                }
                if (i || i1) {
                   iterator.remove();
                }
             }
          }
       }
       f1 = d.f;
       if (!PatchProxy.applyVoidOneRefs(f1, objArray, e.class, "2") && !f1.isEmpty()) {
          long l = SystemClock.elapsedRealtime();
          iterator = f1.iterator();
          while (iterator.hasNext()) {
             PacketData packetData = iterator.next();
             if (packetData.n(l)) {
                a.e("PacketDivider", "divideData, dispatch timeout, seq="+packetData.j());
                iterator.remove();
             }else {
                int len = packetData.b().length;
                i = Math.min(0x19000, len);
                i1 = len / i;
                int i2 = len % i;
                if (i2) {
                   i1 = i1 + 1;
                }
                i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i2 < len) {
                   PacketData packetData1 = packetData.clone();
                   packetData1.D(len);
                   packetData1.I(i1);
                   int i6 = i5 + 1;
                   packetData1.A(i5);
                   i5 = len - i2;
                   i5 = Math.min(i, i5);
                   byte[] uobyteArray = new byte[i5];
                   System.arraycopy(packetData.b(), i2, uobyteArray, 0, i5);
                   packetData1.w(uobyteArray);
                   i2 = i2 + i5;
                   if (d.b(packetData1)) {
                      i3 = i3 + 1;
                   }else if(d.a(packetData1)){
                      i4 = i4 + 1;
                   }
                   i5 = i6;
                }
                i3 = i3 + i4;
                if (i1 <= i3) {
                   iterator.remove();
                }
             }
          }
       }
       if (!d.e.isEmpty() || !d.f.isEmpty()) {
          d.c(1000);
          goto label_0163 ;
       }else {
          goto label_0163 ;
       }
    }
}
