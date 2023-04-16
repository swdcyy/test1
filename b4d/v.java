package b4d.v;
import java.lang.Runnable;
import b4d.w;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import g9c.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$StickerInfoPackage;
import bk5.c;
import ak5.j;
import java.util.List;
import java.util.Iterator;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchStickerInfoPackage;
import k2b.u1;

public final class v implements Runnable	// class@00039b
{
    public final w b;

    public void v(w p0){
       this.b = p0;
    }
    public final void run(){
       ClientContent$StickerInfoPackage stickerInfoP1;
       v tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, w.class, "7")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 0x7751;
          uElementPack.index = tb.s;
          i3 oi3 = i3.f();
          oi3.d("area_type", tb.P8());
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          w v = tb.v;
          if (v != null && v.getItemCount() > 0) {
             int itemCount = tb.v.getItemCount();
             ClientContent$StickerInfoPackage[] stickerInfoP = new ClientContent$StickerInfoPackage[itemCount];
             for (int i = 0; i < itemCount; i = i1) {
                String str = tb.v.N0(i);
                c uoc = PatchProxy.applyOneRefs(str, null, w.class, "9");
                if (uoc != PatchProxyResult.class) {
                }else {
                   List list = j.o().j();
                   if (list != null) {
                      Iterator iterator = list.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            c uoc1 = iterator.next();
                            if (uoc1 != null) {
                               c a = uoc1.a;
                               if (a != null && a.equals(str)) {
                                  uoc = uoc1;
                                  break ;
                               }
                            }
                         }
                      }
                   }
                   uoc = null;
                }
                int i1 = i + 1;
                if (PatchProxy.isSupport(w.class)) {
                   stickerInfoP1 = PatchProxy.applyTwoRefs(uoc, Integer.valueOf(i1), null, w.class, "8");
                   if (stickerInfoP1 != PatchProxyResult.class) {
                   label_00b5 :
                      stickerInfoP[i] = stickerInfoP1;
                   }
                }
                stickerInfoP1 = new ClientContent$StickerInfoPackage();
                stickerInfoP1.pageIndex = 0;
                stickerInfoP1.index = i1;
                if (uoc != null) {
                   stickerInfoP1.id = uoc.a;
                }
                stickerInfoP1.type = 1;
                goto label_00b5 ;
             }
             ClientContent$BatchStickerInfoPackage uBatchSticke = new ClientContent$BatchStickerInfoPackage();
             uContentPack.batchStickerInfoPackage = uBatchSticke;
             uBatchSticke.batchInfoPackage = stickerInfoP;
          }
          u1.u0(6, uElementPack, uContentPack);
       }
       return;
    }
}
