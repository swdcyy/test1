package com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$a;
import androidx.lifecycle.Observer;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;
import android.widget.ImageView;
import pi9.e;
import pm6.l;
import lnc.s6;
import lnc.a1;
import com.facebook.drawee.generic.RoundingParams;
import kotlin.jvm.internal.a;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import mq4.e;
import java.io.File;
import android.net.Uri;
import ekd.w0;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ub.b;

public final class MoodTemplateViewBinder$a implements Observer	// class@000b59
{
    public final MoodTemplateViewBinder b;

    public void MoodTemplateViewBinder$a(MoodTemplateViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       MoodTemplateViewBinder k;
       int i1;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MoodTemplateViewBinder$a.class, "1")) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().w("MoodTemplateViewBinder", "mCurrentFirstAlbumPicture it:"+p0+", mImageRequest:"+this.b.E, objArray);
          this.b.j.setVisibility(i);
          if (e.e()) {
             k = this.b.k;
             if (k != null) {
                k.setVisibility(4);
             }
             i1 = l.a();
          }else if(s6.m()){
             k = this.b.k;
             if (k != null) {
                k.setImageResource(R.drawable.arg_RES_7f081bd7);
             }
             i1 = a1.d(R.dimen.arg_RES_7f070313);
             RoundingParams roundingPara = RoundingParams.c((float)a1.e(0x3f800000));
             a.o(roundingPara, "RoundingParams.fromCorne¡­til.dip2px\(1f\).toFloat\(\)\)");
             a hierarchy = this.b.j.getHierarchy();
             a.o(hierarchy, "mBackgroundImageView.hierarchy");
             hierarchy.L(roundingPara);
             this.b.j.setPadding(a1.e(12.00f), a1.e(6.00f), a1.e(3.00f), a1.e(6.00f));
          }else {
             k = this.b.k;
             if (k != null) {
                k.setImageResource(R.drawable.arg_RES_7f081bf7);
             }
             i1 = e.a;
          }
          int i2 = i1;
          Uri uri = w0.c(new File(p0));
          a.o(uri, "SafetyUriCalls.getUriFromFile\(File\(it\)\)");
          p0 = this.b;
          k = p0.E;
          p0.E = (k != null)? p0.j.h0(uri, i2, i2, k): p0.j.C(uri, i2, i2, true, null);
          PatchProxy.onMethodExit(MoodTemplateViewBinder$a.class, "1");
       }
       return;
    }
}
