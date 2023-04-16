package com.kuaishou.live.gzone.v2.imagepreview.GzoneImageView;
import com.yxcorp.gifshow.image.KwaiZoomImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.image.request.a;
import uc.d;
import s0d.a;
import s0d.e;

public class GzoneImageView extends KwaiZoomImageView	// class@001cc5
{

    public void GzoneImageView(Context p0){
       super(p0);
    }
    public void GzoneImageView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void GzoneImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public final ImageRequest p0(Uri p0,int p1,int p2){
       if (PatchProxy.isSupport(GzoneImageView.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, GzoneImageView.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a uoa = a.t(p0);
       if (p1 > 0 && p2 > 0) {
          uoa.p(new d(p1, p2, 20000.00f));
       }
       return uoa.q();
    }
}
