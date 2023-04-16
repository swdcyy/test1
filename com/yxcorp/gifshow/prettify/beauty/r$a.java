package com.yxcorp.gifshow.prettify.beauty.r$a;
import com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper$b;
import com.yxcorp.gifshow.prettify.beauty.r;
import com.kwai.library.widget.progressbar.DownloadProgressBar;
import t16.b;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;
import e17.i;
import android.widget.ProgressBar;
import t16.f;
import boc.b;
import java.util.List;
import p0c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import xyb.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Float;

public class r$a implements ResourceDownloadProgressHelper$b	// class@001118
{
    public final DownloadProgressBar a;
    public final int b;
    public final b c;
    public final View d;
    public final View e;
    public final r f;

    public void r$a(r p0,DownloadProgressBar p1,int p2,b p3,View p4,View p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public void a(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r$a.class, "4")) {
          return;
       }
       int i = 0x7f110668;
       if (!p0.C(a.a().a())) {
          i.a(i, R.string.arg_RES_7f1038e5);
       }else {
          i.a(i, R.string.arg_RES_7f105256);
       }
       if (!this.d.isSelected()) {
          return;
       }else {
          r$a te = this.e;
          if (te != null) {
             te.setVisibility(0);
          }
          this.a.setVisibility(8);
          f.c(this.c, "downloadFailure");
          return;
       }
    }
    public void h(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$a.class, "3")) {
          return;
       }
       if (!this.f.k.k().isEmpty() && this.f.i1().isEmpty()) {
          r$a tf = this.f;
          tf.l0(tf.i);
       }
       Object[] objArray = new Object[0];
       a.D().w("BeautyCategoryAdapter", "onCategoryDownloaded : "+p0.getResourceName()+"---"+this.f.i1().isEmpty(), objArray);
       return;
    }
    public void onCompleted(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("BeautyCategoryAdapter", " onComplete refresh", objArray);
       r$a tf = this.f;
       tf.l0(tf.i);
       f.c(this.c, "downloadSuccess");
       return;
    }
    public void onProgress(String p0,float p1){
       r$a uoa = r$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p1 - 0xbf800000) {
          this.a.setProgress((int)(p1 * (float)this.b));
       }
       return;
    }
}
