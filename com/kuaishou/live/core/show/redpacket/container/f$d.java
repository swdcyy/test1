package com.kuaishou.live.core.show.redpacket.container.f$d;
import rg2.b;
import com.kuaishou.live.core.show.redpacket.container.f;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.live.core.show.redpacket.container.b;
import com.kuaishou.android.live.log.LiveLogTag;
import com.google.common.collect.ImmutableMap;
import pp.c;
import java.util.Map;
import com.kuaishou.android.live.log.b;
import uw1.m;
import com.kuaishou.live.core.show.redpacket.container.b$a;
import p91.m;
import android.app.Activity;
import ng2.j;
import java.lang.StringBuilder;

public class f$d implements b	// class@000e76
{
    public final f a;

    public void f$d(f p0){
       this.a = p0;
       super();
    }
    public boolean a(int p0,int p1){
       f obj;
       boolean b1;
       f$d uod = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f$d uod1 = f$d.class;
       if (PatchProxy.isSupport(uod1)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uod1, "1");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = uod.a.E;
       boolean b = false;
       if (obj != null) {
          Objects.requireNonNull(obj);
          b uob = b.class;
          if (PatchProxy.isSupport(uob)) {
             Object obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), obj, uob, "3");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
             label_004c :
                LiveLogTag rED_PACKET = LiveLogTag.RED_PACKET;
                b.h0(rED_PACKET, "try auto open red packet dialog", ImmutableMap.of("mShouldIgnoreType", Boolean.valueOf(obj.c), "redPacketType", Integer.valueOf(p0), "redPacketSubType", Integer.valueOf(p1), "local red packet type", Integer.valueOf(obj.e), "local activity red packet sub type", Integer.valueOf(obj.f)));
                if (obj.c != null || (p0 == obj.e && p1 == obj.f)) {
                   uob = obj.d;
                   obj.a(b);
                   boolean b2 = j.a(obj.b.c(), obj.b.b(), obj.b.getActivity(), obj.b.a());
                   b.Z(rED_PACKET, "canAutoOpenRedPacketDialog ? "+b2);
                   if (b2) {
                      obj.b.c().j(null, uob);
                   }
                   b1 = b2;
                }else {
                   b1 = false;
                }
             }
          }else {
             goto label_004c ;
          }
          if (b1) {
             b = true;
          }
       }
       return b;
    }
}
