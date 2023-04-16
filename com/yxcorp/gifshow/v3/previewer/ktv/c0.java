package com.yxcorp.gifshow.v3.previewer.ktv.c0;
import com.kuaishou.android.post.session.previewtasks.GraphTask;
import com.yxcorp.gifshow.v3.previewer.ktv.c0$a;
import nsd.u;
import com.yxcorp.gifshow.v3.previewer.ktv.c0$b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.Workspace$Type;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.concurrent.Callable;
import java.lang.Boolean;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import com.yxcorp.gifshow.v3.previewer.ktv.p;
import com.kwai.robust.PatchProxyResult;
import brd.a;
import com.yxcorp.gifshow.v3.previewer.ktv.o;
import android.app.Activity;
import brd.e;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.kwai.flash.Flash$Type;

public final class c0 extends GraphTask	// class@0015b8
{
    public static final c0$a h;

    static {
       c0.h = new c0$a(null);
    }
    public void c0(c0$b p0){
       a.p(p0, "request");
       super(p0);
    }
    public Object key(){
       return "KtvSongDefaultCoverGenerateNSTask";
    }
    public synchronized void m(){
       a uoa;
       if (PatchProxy.applyVoid(null, this, c0.class, "1")) {
          return;
       }
       int i = 0;
       boolean b = (this.b.N().a1() == Workspace$Type.KTV_SONG)? true: false;
       Object[] objArray = new Object[i];
       a.D().w("KtvSongDefaultCoverGenerateGraphTask", ">9266 realRun isKtvSongType: "+b, objArray);
       if (!b) {
          return;
       }else {
          Boolean uBoolean = this.b.d.call();
          objArray = new Object[i];
          a.D().w("KtvSongDefaultCoverGenerateGraphTask", ">9267 realRun hasSongCover: "+uBoolean, objArray);
          a.o(uBoolean, "hasSongCover");
          if (uBoolean.booleanValue()) {
             return;
          }else {
             c uoc = this.b.N();
             GraphTask tb = this.b;
             c0$b f = tb.f;
             KtvInfo ktvInfo = tb.e.call();
             if (PatchProxy.isSupport(p.class)) {
                uoa = PatchProxy.applyFourRefs(uoc, f, ktvInfo, Boolean.FALSE, null, p.class, "22");
                if (uoa != PatchProxyResult.class) {
                label_00b6 :
                   Throwable throwable = uoa.f();
                   if (throwable == null) {
                      Object[] objArray1 = new Object[i];
                      a.D().w("KtvSongDefaultCoverGenerateGraphTask", ">3592 realRun success", objArray1);
                   }else {
                      PostUtils.D("KtvSongDefaultCoverGenerateGraphTask", "realRun failure", throwable);
                   }
                   return;
                }
             }
             uoa = a.z(new o(uoc, f, ktvInfo, i));
             goto label_00b6 ;
          }
       }
    }
    public Flash$Type type(){
       return Flash$Type.BACKGROUND;
    }
}
