package com.kuaishou.commercial.tvc.TvcTimeUtils;
import com.kuaishou.commercial.tvc.TvcTimeUtils$TIME_INTERVAL_MIN$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.commercial.tvc.TvcTimeUtils$a;
import java.lang.reflect.Type;
import el.a;
import java.lang.Object;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Map;
import qw.f;
import java.util.LinkedHashMap;
import java.lang.System;
import java.lang.Long;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import yx.j0;
import java.lang.Number;
import nsd.s0;

public final class TvcTimeUtils	// class@0016a6
{
    public static final p a;
    public static final Type b;
    public static final TvcTimeUtils c;

    static {
       TvcTimeUtils.c = new TvcTimeUtils();
       TvcTimeUtils.a = s.c(TvcTimeUtils$TIME_INTERVAL_MIN$2.INSTANCE);
       TvcTimeUtils.b = new TvcTimeUtils$a().getType();
    }
    public void TvcTimeUtils(){
       super();
    }
    public static final void d(LiveStreamFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, TvcTimeUtils.class, "2")) {
          return;
       }
       a.p(p0, "liveStreamFeed");
       Map map = f.q(TvcTimeUtils.b);
       if (map == null) {
          map = new LinkedHashMap();
       }
       String id = p0.getId();
       a.o(id, "liveStreamFeed.id");
       map.put(id, Long.valueOf(System.currentTimeMillis()));
       SharedPreferences$Editor uEditor = f.a.edit();
       uEditor.putString("tvc_card_showed_times", b.e(map));
       g.a(uEditor);
       return;
    }
    public static final boolean e(String p0){
       TvcTimeUtils obj = PatchProxy.applyOneRefs(p0, null, TvcTimeUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "liveStreamFeedId");
       obj = TvcTimeUtils.c;
       Long longx = obj.b(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       j0.f("TvcTimeUtils", p0+" last show time: "+longx, objArray);
       if (longx == null) {
          return true;
       }
       longx.longValue();
       long l = (System.currentTimeMillis() - longx.longValue()) / (long)1000;
       objArray = new Object[i];
       j0.f("TvcTimeUtils", p0+" show interval "+l+" seconds", objArray);
       StringBuilder str = "";
       String str1 = (l - obj.a() > 0)? "can show ": "cannot show ";
       Object[] objArray1 = new Object[i];
       j0.f("TvcTimeUtils", str+str1+p0+" \'s TVC", objArray1);
       if (l - obj.a() > 0) {
          i = true;
       }
       return i;
    }
    public final long a(){
       Object obj = PatchProxy.apply(null, this, TvcTimeUtils.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = TvcTimeUtils.a.getValue();
       }
       return obj.longValue();
    }
    public final Long b(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, TvcTimeUtils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = f.q(TvcTimeUtils.b);
       Long longx = null;
       if (!s0.H(obj)) {
          obj = longx;
       }
       if (obj != null) {
          longx = obj.get(p0);
       }
       return longx;
    }
    public final boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TvcTimeUtils.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "liveStreamFeedId");
       boolean b = (this.b(p0) != null)? true: false;
       return b;
    }
}
