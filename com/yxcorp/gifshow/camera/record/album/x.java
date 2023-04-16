package com.yxcorp.gifshow.camera.record.album.x;
import android.content.Context;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.album.x$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import tkd.b;
import tkd.d;
import r16.e;
import r16.f;
import com.yxcorp.gifshow.camera.record.album.u;
import java.util.Collection;
import ekd.q$a;
import ekd.q;
import pr3.d;
import lnc.a1;
import pca.x;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import java.lang.Boolean;
import com.kwai.video.clipkit.config.ClipKitConfigManager;
import com.kwai.video.clipkit.config.ClipKitConfig;
import com.kwai.video.clipkit.config.EditorEncodeConfig;
import com.kwai.video.clipkit.config.EditorEncodeConfigModule$ImportParam;
import com.kwai.video.clipkit.config.EditorEncodeConfigModule;
import gq.a;
import java.io.File;
import java.util.ArrayList;
import com.yxcorp.gifshow.encode.l;
import io.reactivex.g;
import t45.d;
import brd.z;
import pca.u;
import erd.g;
import pca.v;
import erd.o;
import com.yxcorp.gifshow.encode.m;
import erd.a;
import com.yxcorp.gifshow.camera.record.album.v;
import sb9.i0;
import sb9.h0;
import com.yxcorp.gifshow.camera.record.album.w;
import sb9.k0;
import sb9.j0;
import crd.b;
import com.yxcorp.gifshow.models.QMedia;
import w69.x0;

public class x	// class@001ce3
{
    public Context a;
    public AttrAnimProgressFragment b;
    public int c;
    public boolean d;
    public static b e;

    public void x(Context p0){
       super();
       this.a = p0;
       this.c = 0;
    }
    public void a(List p0,String p1,x$a p2){
       Object[] this;
       boolean b;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, x.class, "1")) {
          return;
       }
       int i = 0;
       this = new Object[i];
       String str = "ImportVideoHandler";
       a.D().w(str, "exportVideoIfNeed: media size ="+p0.size(), this);
       if (!d.a(0x6758ee6d).tJ(true)) {
          Object[] objArray = new Object[i];
          a.D().w(str, "exportVideoIfNeed: canEnterEditorPage return false ignore this call", objArray);
          return;
       }else {
          List list = q.g(p0, u.a);
          d uod = new d();
          this.d = i;
          Context uContext = a1.c();
          t ot = PatchProxy.applyThreeRefs(uContext, list, p1, null, x.class, "3");
          if (ot != PatchProxyResult.class) {
          }else {
             d ot1 = new d();
             Object[] objArray1 = null;
             Object[] obj = PatchProxy.apply(objArray1, objArray1, x.class, "14");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(ClipKitConfigManager.getInstance().getConfig() == null){
                EditorEncodeConfig editorEncode = ClipKitConfigManager.getInstance().getConfig().getEditorEncodeConfig();
                if (editorEncode != null) {
                   EditorEncodeConfig normalConfig = editorEncode.normalConfig;
                   if (normalConfig != null && normalConfig.getImportParams() != null) {
                      b = editorEncode.normalConfig.getImportParams().disableSkipDialog;
                   }
                }
             }
             b = false;
             ot1.b = b;
             if (!PatchProxy.applyVoidOneRefs(list, objArray1, x.class, "8")) {
                obj = new Object[i];
                a.D().w("ClipKitExport", "mapCacheFile", obj);
                while (i < list.size()) {
                   str = x.g(list.get(i), x.d(), x.b());
                   if (new File(str).exists()) {
                      list.set(i, str);
                   }
                   i = i + 1;
                }
             }
             ot1.c = new ArrayList(list);
             ot = t.create(new l(list, p1, uContext)).observeOn(d.c).doOnNext(new u(list)).concatMap(new v(ot1)).doFinally(m.b);
          }
          x.e = ot.subscribeOn(d.c).observeOn(d.a).doOnNext(new v(this)).doOnDispose(new i0(this, uod, p2, p0)).doFinally(new h0(this)).distinct(w.b).subscribe(new k0(this, uod, p2, p0), new j0(p2, p0));
          return;
       }
    }
    public final List b(List p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, x.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       while (i < p0.size()) {
          if (!(p0.get(i).path).equals(p1.get(i))) {
             QMedia qMedia = x0.a(p0.get(i));
             qMedia.path = p1.get(i);
             p0.set(i, qMedia);
             int i1 = this.c + 1;
             this.c = i1;
          }
          i = i + 1;
       }
       return p0;
    }
}
