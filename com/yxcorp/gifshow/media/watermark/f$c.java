package com.yxcorp.gifshow.media.watermark.f$c;
import com.yxcorp.gifshow.video.d$b;
import com.yxcorp.gifshow.media.watermark.d;
import java.lang.Object;
import nxc.d;
import hxc.a;
import com.yxcorp.gifshow.video.c$c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.media.watermark.f$c$a;
import com.yxcorp.gifshow.video.c$e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.video.editorsdk2.ExportTask;
import ekd.k1;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.video.b$c;
import com.yxcorp.gifshow.media.watermark.g;
import com.kwai.sdk.switchconfig.a;
import y6b.i;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import com.kwai.video.editorsdk2.ExportTaskNoQueueing;
import com.kwai.video.hodor.ExportMediaCacheTask;
import com.yxcorp.utility.AsyncTask;
import com.kwai.framework.model.feed.BaseFeed;
import java.io.File;
import qkd.b;
import android.net.Uri;
import ekd.w0;
import nxc.c;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Locale;
import lnc.a1;
import y6b.f;
import android.view.View$OnClickListener;
import ok.h;
import com.yxcorp.gifshow.media.watermark.c;
import com.yxcorp.gifshow.fragment.ProgressFragment$a;
import java.lang.ref.WeakReference;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.IllegalArgumentException;

public class f$c implements d$b	// class@001d37
{
    public final d a;

    public void f$c(d p0){
       super();
       this.a = p0;
    }
    public d a(){
       return this.a.y;
    }
    public a b(){
       return this.a.z;
    }
    public void c(c$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c.class, "1")) {
          return;
       }
       this.a.s = new f$c$a(this, p0);
       return;
    }
    public c$e d(boolean p0){
       ExportTask uExportTask;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f$c uoc = f$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoc, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       uoc = this.a;
       Objects.requireNonNull(uoc);
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          uExportTask = PatchProxy.applyOneRefs(Boolean.valueOf(p0), uoc, uod, "4");
          if (uExportTask != patchProxyRe) {
          label_003d :
             return new b$c(uExportTask);
          }
       }
       k1.c();
       uExportTask = uoc.a(p0, null);
       goto label_003d ;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, f$c.class, "5")) {
          return;
       }
       f$c ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, d.class, "9")) {
          d obj = PatchProxy.apply(null, null, g.class, "12");
          boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): Boolean.valueOf(a.t().d("share_download_task_cancel_thread", false)).booleanValue();
          if (b) {
             c.k(new i(ta));
          }else {
             obj = ta.r;
             if (obj != null) {
                obj.cancel();
             }
          }
          obj = ta.u;
          if (obj != null) {
             obj.cancel();
             ta.u = null;
          }
          obj = ta.t;
          if (obj != null) {
             obj.a(true);
             ta.t = null;
          }
       }
       return;
    }
    public void f(boolean p0){
       boolean b1;
       f$c uoc = f$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "3")) {
          return;
       }
       uoc = this.a;
       Objects.requireNonNull(uoc);
       d uod = d.class;
       if (!PatchProxy.isSupport(uod) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uoc, uod, "10") && uoc.c != null)) {
          String str = uoc.h(uoc.j);
          boolean b = false;
          int i = 1;
          if (str == null) {
             uoc.p(null);
          }else if(!str.startsWith("http")){
             File uFile = new File(str);
             Object obj = PatchProxy.applyOneRefs(uFile, uoc, uod, "18");
             if (obj != PatchProxyResult.class) {
                b1 = obj.booleanValue();
             }else if(!b.S(uFile)){
                if (uFile.length() <= 0) {
                   b.q(uFile);
                }else {
                   b1 = true;
                }
             }
             b1 = false;
             if (!b1) {
                uoc.o();
             }else {
                uoc.p(w0.c(uFile).toString());
             }
          }else {
             uoc.o();
          }
          if (p0) {
             d n = uoc.n;
             c c = n.c;
             n.e = b;
             ProgressFragment progressFrag = new ProgressFragment();
             uoc.v = progressFrag;
             progressFrag.Eh(b, 100);
             uoc.v.setCancelable(b);
             n = uoc.v;
             if (TextUtils.x(uoc.h)) {
                Object[] objArray = new Object[i];
                objArray[b] = a1.p(0x7f100f18);
                str = String.format(Locale.US, "%s ", objArray);
             }else {
                d h = uoc.h;
             }
             n.Jh(str);
             uoc.v.Kh(uoc.m);
             uoc.v.Ch(R.drawable.arg_RES_7f08234f);
             uoc.v.Bh(new f(uoc));
             if (uoc.m != null) {
                n = uoc.o;
                if (n != null) {
                   n.apply(uoc.n);
                }
             }else if(c > null){
                uoc.v.Hh((long)(c * 1000), new c(uoc));
             }
             GifshowActivity gifshowActiv = uoc.b.get();
             if (gifshowActiv != null && !uoc.i(gifshowActiv)) {
                uoc.v.show(gifshowActiv.getSupportFragmentManager(), "runner");
             }
          }
       }
    label_011c :
       return;
    }
    public c$e g(boolean p0,Object p1){
       ExportTask uExportTask;
       f$c uoc = f$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, uoc, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 instanceof VideoContext) {
          uoc = this.a;
          Objects.requireNonNull(uoc);
          d uod = d.class;
          if (PatchProxy.isSupport(uod)) {
             uExportTask = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, uoc, uod, "3");
             if (uExportTask != PatchProxyResult.class) {
             label_0042 :
                return new b$c(uExportTask);
             }
          }
          k1.c();
          uExportTask = uoc.a(p0, p1);
          goto label_0042 ;
       }else {
          throw new IllegalArgumentException("saveVideo  Object must be  com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext");
       }
    }
}
