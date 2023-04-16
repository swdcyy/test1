package com.yxcorp.gifshow.v3.constructor.j;
import im8.g;
import qoc.g;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Iterator;
import java.util.List;
import android.util.Pair;
import com.kuaishou.edit.draft.LyricAsset$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.LyricAsset;
import com.kuaishou.edit.draft.StickerResult;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.StickerResult$b;
import com.kuaishou.edit.draft.Text$b;
import com.kuaishou.edit.draft.Text;
import com.yxcorp.gifshow.v3.constructor.j$a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import brd.a0;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import com.yxcorp.gifshow.v3.constructor.i;
import juc.b;
import huc.d;
import java.util.HashMap;
import java.lang.Integer;
import java.util.Map;
import kotlin.Pair;
import qoc.i;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import qoc.j;

public class j extends g implements g	// class@000d49
{
    public a d;
    public a e;
    public List f;
    public List g;

    public void j(){
       super();
       this.f = new ArrayList();
       this.g = new ArrayList();
    }
    public void N(){
       Pair second;
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       if (!this.d.D()) {
          this.d.c0();
       }
       Iterator iterator = this.f.iterator();
       while (iterator.hasNext()) {
          Pair pair = iterator.next();
          second = pair.second;
          StickerResult$b uob = second.instance.getResult().toBuilder();
          uob.m(this.d.Q(pair.first));
          second.b(uob);
          this.d.b().mergeFrom(second.build());
       }
       this.f.clear();
       this.d.g(false);
       if (!this.e.D()) {
          this.e.c0();
       }
       iterator = this.g.iterator();
       while (iterator.hasNext()) {
          second = iterator.next();
          Pair second1 = second.second;
          StickerResult$b uob1 = second1.getResult().toBuilder();
          uob1.m(this.e.Q(second.first));
          second1.j(uob1);
          this.e.b().mergeFrom(second1.build());
       }
       this.g.clear();
       this.e.g(false);
       return;
    }
    public a0 O(j$a p0,c p1){
       b uob;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       long l = System.currentTimeMillis();
       this.f.clear();
       this.g.clear();
       obj = PatchProxy.apply(null, null, i.class, "7");
       if (obj != patchProxyRe) {
          uob = obj;
       }else {
          d.s();
          HashMap hashMap = new HashMap();
          hashMap.put("nowShowFrom", Integer.valueOf(4096));
          b uob1 = d.j("shadow_01", hashMap, false);
          uob1.c();
          uob = uob1;
       }
       i oi = new i(this, p0, p1, uob, l);
       return a0.y(patchProxyRe).T(d.c);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("injector")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("injector")) {
          obj.put(j.class, new j());
       }else {
          obj.put(j.class, null);
       }
       return obj;
    }
}
