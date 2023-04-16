package com.yxcorp.gifshow.widget.banner.KwaiBannerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$ViewHolder$imageView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$ViewHolder$itemNameTv$2;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$ViewHolder$itemNameBg$2;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;
import android.widget.TextView;

public final class KwaiBannerView$ViewHolder extends RecyclerView$ViewHolder	// class@00193c
{
    public final p a;
    public final p b;
    public final p c;

    public void KwaiBannerView$ViewHolder(View p0){
       a.p(p0, "item");
       super(p0);
       this.a = s.c(new KwaiBannerView$ViewHolder$imageView$2(this));
       this.b = s.c(new KwaiBannerView$ViewHolder$itemNameTv$2(this));
       this.c = s.c(new KwaiBannerView$ViewHolder$itemNameBg$2(this));
    }
    public final KwaiImageView a(){
       Object obj = PatchProxy.apply(null, this, KwaiBannerView$ViewHolder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final FrameLayout b(){
       Object obj = PatchProxy.apply(null, this, KwaiBannerView$ViewHolder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public final TextView c(){
       Object obj = PatchProxy.apply(null, this, KwaiBannerView$ViewHolder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
}
