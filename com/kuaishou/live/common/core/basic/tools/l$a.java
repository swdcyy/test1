package com.kuaishou.live.common.core.basic.tools.l$a;
import ub.a;
import com.kuaishou.live.core.basic.widget.LiveKwaiImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.graphics.drawable.Animatable;
import bd.f;

public class l$a extends a	// class@000ef9
{
    public final LiveKwaiImageView b;
    public final CDNUrl[] c;

    public void l$a(LiveKwaiImageView p0,CDNUrl[] p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l$a.class, "2")) {
          return;
       }
       this.b.setTag(null);
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, l$a.class, "1")) {
       }else {
          this.b.setTag(this.c[0].getUrl());
       }
       return;
    }
    public void onIntermediateImageFailed(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l$a.class, "3")) {
          return;
       }
       this.b.setTag(null);
       return;
    }
}
