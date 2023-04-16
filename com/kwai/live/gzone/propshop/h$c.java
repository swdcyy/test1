package com.kwai.live.gzone.propshop.h$c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.live.gzone.propshop.h;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GzoneVirtualTradeBubble;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v67.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.util.Objects;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import f37.a;
import fq5.b;
import java.lang.System;
import java.lang.Long;
import java.util.Set;
import java.util.Iterator;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import o07.o;

public class h$c implements PopupInterface$h	// class@000de7
{
    public final LiveStreamMessages$GzoneVirtualTradeBubble b;
    public final h c;

    public void h$c(h p0,LiveStreamMessages$GzoneVirtualTradeBubble p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$c.class, "1")) {
          return;
       }
       LiveStreamMessages$GzoneVirtualTradeBubble gameName = this.b.gameName;
       Object obj = null;
       if (!PatchProxy.applyVoidOneRefs(gameName, obj, c.class, "4")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "GAME_SALE_PROMPT_CARD";
          uElementPack.params = c.b(gameName);
          u1.u0(6, uElementPack, obj);
       }
       h$c tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(obj, tc, h.class, "15")) {
          LinkedHashMap linkedHashMa = a.d(h.O);
          if (linkedHashMa == null) {
             linkedHashMa = new LinkedHashMap();
          }
          linkedHashMa.put(tc.s.d(), Long.valueOf(System.currentTimeMillis()));
          if (linkedHashMa.size() > 20) {
             linkedHashMa.remove(linkedHashMa.keySet().iterator().next());
          }
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString(b.d("user")+"live_gzone_prop_shop_tip_displayed_time_map", b.e(linkedHashMa));
          g.a(uEditor);
       }
       return;
    }
    public void H(c p0,int p1){
       p0.G = null;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
