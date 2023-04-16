package com.yxcorp.gifshow.v3.constructor.l;
import im8.g;
import qoc.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import android.content.Intent;
import ekd.j0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.Serializable;
import com.yxcorp.gifshow.model.Lyrics;
import java.util.List;
import android.util.Pair;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.f;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.v3.constructor.j;
import com.yxcorp.gifshow.v3.constructor.j$a;
import qba.d;
import android.text.TextPaint;
import brd.a0;
import t45.d;
import brd.z;
import qoc.u;
import com.kuaishou.live.common.core.basic.tools.h;
import erd.g;
import crd.b;
import crd.a;
import qoc.v;
import java.util.Map;
import java.util.HashMap;

public class l extends g implements g	// class@000d4b
{
    public c d;
    public Intent e;
    public Pair f;
    public d g;
    public PublishSubject h;

    public void l(){
       super();
    }
    public void N(){
       boolean b;
       boolean i1;
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "1")) {
          return;
       }
       Lyrics obj = PatchProxy.apply(objArray, this, ol, "3");
       int i = 0;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          Workspace$Type type = this.d.a1();
          if (type != Workspace$Type.KTV_MV && type != Workspace$Type.KTV_SONG) {
             i1 = j0.a(this.e, "VIDEO_IS_LIP_SYNC", i);
             if (TextUtils.x(j0.f(this.e, "same_frame_origin_photo_id")) && !i1) {
                b = true;
             }
          }
          b = false;
       }
       if (!b) {
          return;
       }else {
          obj = j0.e(this.e, "LYRICS");
          if (obj != null) {
             Lyrics mLines = obj.mLines;
             if (mLines != null && !mLines.isEmpty()) {
                double d = (double)((float)j0.b(this.e, "MUSIC_START_TIME", i) / 1000.00f);
                i1 = this.f.first.intValue();
                int i2 = this.f.second.intValue();
                float f = 0x3f400000;
                if (i2) {
                   float f1 = 0x3f800000;
                   float f2 = ((float)i1 * f1) / (float)i2;
                   if (f2 - f >= 0 && f2 - f1 > 0) {
                      f = 0x3f266666;
                   }
                }
                Object[] objArray1 = new Object[i];
                a.D().w("NormalLyricConstructor", "construct: lyricPositionYRatio:"+f+"["+this.f.first+"x"+this.f.second+"]", objArray1);
                j$a uoa = new j$a((double)f, 0x3fe99999a0000000, this.f.first.intValue(), this.g.a, f.K(), obj.mLines, d);
                a0 uoa0 = new j().O(objArray1, this.d);
                this.c.c(uoa0.G(d.a).R(new u(this), h.b));
             }
          }
          return;
       }
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("injector")) {
          return new v();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, l.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("injector")) {
          obj.put(l.class, new v());
       }else {
          obj.put(l.class, null);
       }
       return obj;
    }
}
