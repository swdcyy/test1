package hg9.x;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.photo.m;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.feature.post.api.util.PostPermission;
import android.content.Context;
import com.kwai.feature.post.api.util.PostPermissionUtils;
import android.app.Activity;
import brd.t;
import crd.b;
import com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController;
import j8c.a;
import q87.c;
import com.kwai.horae.a;
import com.yxcorp.gifshow.camera.record.photo.m$c;
import com.kwai.horae.b;
import kuaishou.perf.page.impl.d;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import ig9.b;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import zb9.p0;
import zb9.p0$a;
import com.yxcorp.gifshow.camera.record.CameraLogger$VideoRecStartType;
import wc9.v;
import ce9.l;
import com.kwai.camerasdk.videoCapture.CameraController;
import ji9.a;
import com.yxcorp.gifshow.camera.record.photo.e;
import zb9.k;
import zb9.k$a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Boolean;
import k2b.e0;
import wc9.e;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import com.yxcorp.gifshow.util.rx.RxBus;
import lm6.h;
import com.yxcorp.gifshow.widget.m;

public final class x implements View$OnClickListener	// class@002680
{
    public final m b;

    public void x(m p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       Object[] objArray;
       String str;
       String str1;
       d uod;
       String str2;
       Object[] objArray1;
       int i;
       l ol;
       x tb = this.b;
       Objects.requireNonNull(tb);
       m om = m.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, om, "19")) {
       }else {
          PostPermission aLBUM = PostPermission.ALBUM;
          if (!PostPermissionUtils.c(tb.e, aLBUM)) {
             tb.g2(PostPermissionUtils.d(tb.e, aLBUM).subscribe());
          }else {
             boolean b = false;
             if (!tb.h2()) {
                tb.l2(b);
             }else if(tb.O != null && tb.c1()){
                if (tb.O.h2()) {
                   tb.O.r2();
                }else if(tb.O.n2()){
                }
             }else {
             }
          }
       }
       return;
    }
}
