package com.kwai.component.photo.detail.core.atlas.AtlasScrollPlayerView$c;
import y8c.g;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.photo.detail.core.atlas.AtlasScrollPlayerView$e;
import java.util.List;
import g9c.a;
import android.view.ViewGroup;
import y8c.f;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import yb.b;
import android.content.res.Resources;
import xb.t$b;
import yb.a;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import com.kwai.component.photo.detail.core.atlas.AtlasScrollPlayerView$d;
import android.view.View;
import ml8.c;

public class AtlasScrollPlayerView$c extends g	// class@000a12
{
    public Context w;

    public void AtlasScrollPlayerView$c(Context p0){
       super();
       this.w = p0;
    }
    public Object N0(int p0){
       Object obj;
       AtlasScrollPlayerView$c uoc = AtlasScrollPlayerView$c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
          label_0029 :
             return obj;
          }
       }
       obj = super.N0((p0 % this.Q0().size()));
       goto label_0029 ;
    }
    public int getItemCount(){
       return 0x7ffffffe;
    }
    public f h1(ViewGroup p0,int p1){
       AtlasScrollPlayerView$c uoc = AtlasScrollPlayerView$c.class;
       if (PatchProxy.isSupport(uoc)) {
          p0 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "2");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       KwaiImageView kwaiImageVie = new KwaiImageView(this.w);
       kwaiImageVie.setLayoutParams(new RecyclerView$LayoutParams(-1, -2));
       b uob = new b(this.w.getResources());
       uob.j(t$b.i);
       uob.r(R.color.arg_RES_7f062057);
       uob.m(0);
       kwaiImageVie.setHierarchy(uob.a());
       return new f(kwaiImageVie, new AtlasScrollPlayerView$d());
    }
}
