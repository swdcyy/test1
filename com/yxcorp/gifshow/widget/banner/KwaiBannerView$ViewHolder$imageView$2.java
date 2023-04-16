package com.yxcorp.gifshow.widget.banner.KwaiBannerView$ViewHolder$imageView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$ViewHolder;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import java.util.Objects;

public final class KwaiBannerView$ViewHolder$imageView$2 extends Lambda implements a	// class@001939
{
    public final KwaiBannerView$ViewHolder this$0;

    public void KwaiBannerView$ViewHolder$imageView$2(KwaiBannerView$ViewHolder p0){
       this.this$0 = p0;
       super(0);
    }
    public final KwaiImageView invoke(){
       View obj = PatchProxy.apply(null, this, KwaiBannerView$ViewHolder$imageView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.itemView.findViewById(R.id.banner_item);
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.image.KwaiImageView");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
