package com.yxcorp.gifshow.media.watermark.d$d;
import com.yxcorp.utility.AsyncTask;
import com.yxcorp.gifshow.media.watermark.d;
import java.lang.String;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.qa;
import lnc.t;
import com.yxcorp.utility.Log;
import y6b.n;
import com.kwai.framework.model.feed.BaseFeed;
import y6b.b;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.lang.Exception;
import com.kwai.video.editorsdk2.ExportTask;
import nxc.d;
import tkd.b;
import tkd.d;
import h69.d;
import java.lang.Math;
import y6b.o;
import com.kwai.framework.model.user.User;
import ekd.k1;
import java.io.File;
import com.yxcorp.gifshow.media.watermark.g;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import com.kwai.sdk.switchconfig.a;
import com.kwai.video.editorsdk2.ExportTaskNoQueueing;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import java.lang.StringBuilder;
import com.kwai.video.editorsdk2.ExportEventListener;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.fragment.ProgressFragment;

public class d$d extends AsyncTask	// class@001d31
{
    public o p;
    public String q;
    public final d r;

    public void d$d(d p0,String p1){
       this.r = p0;
       super();
       this.q = p1;
    }
    public Object b(Object[] p0){
       p0 = PatchProxy.applyOneRefs(p0, this, d$d.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          p0 = null;
          try{
             if (!qa.e.j()) {
                Log.d(this.r.a, "video sdk not ready");
             }else {
                d$d tr = this.r;
                tr.q = tr.g(tr.j, this.q, new n(this));
                d q = this.r.q;
                if (q != null && EditorSdk2UtilsV2.videoProjectPrivateDataLoaded(q)) {
                   tr = this.r;
                   tr.q = EditorSdk2UtilsV2.loadProject(tr.q);
                }
             }
          }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
             e0.printStackTrace();
             Log.g(this.r.a, e0.getMessage());
          }
       }
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, d$d.class, "4")) {
          return;
       }
       d$d tr = this.r;
       tr.d(tr.r);
       return;
    }
    public void j(Object p0){
       d$d uod = d$d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "3")) {
       }else if(PatchProxy.applyVoid(null, this, uod, "5")){
          p0 = this.r;
          int i = -223655702;
          if (p0.g != null) {
             p0.y = new d();
             this.p = (this.r.f != null)? new o(Math.min(d.a(i).H6(this.r.q), d.a(i).Yy(this.r.q)), Math.min(d.a(i).H6(this.r.q), d.a(i).Yy(this.r.q)), this.r.i): new o(d.a(i).H6(this.r.q), d.a(i).Yy(this.r.q), this.r.i);
             this.p.c();
             p0 = this.r.y;
             p0.c = k1.t(p0.a);
             if (!this.p.k(this.r.w)) {
                p0.b = 8;
             }else {
                p0 = this.r;
                p0.y.b = 7;
                g.h(p0.q, p0.w.getAbsolutePath());
             }
          }
          try{
             p0 = d.a(i).nV(this.r.q);
             p0.setNoFastStart(a.t().d("editorExportDisableFastStart", false));
             d$d tr = this.r;
             this.r.r = new ExportTaskNoQueueing(a.a().a(), tr.q, tr.c.getAbsolutePath(), p0);
             Log.g(this.r.a, "savePhotoMovie FrameRatePromote, start download video outputFile"+this.r.c.getAbsolutePath()+"--------------------");
             p0 = this.r;
             p0.r.setExportEventListener(p0.A);
             this.r.r.run();
             p0 = this.p;
             if (p0 == null) {
             label_0139 :
                return;
             }
          }catch(java.lang.Exception e6){
             e6.printStackTrace();
             p0 = this.p;
             if (p0 == null) {
             }
          }
          p0.recycle();
          goto label_0139 ;
       }
    }
    public void l(Object[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$d.class, "2")) {
       }else {
          d v = this.r.v;
          if (v != null && v.isAdded()) {
             this.r.v.Nh(p0[0].intValue());
          }
       }
       return;
    }
}
