package com.yxcorp.gifshow.widget.banner.KwaiBannerView$ViewHolder$itemNameBg$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$ViewHolder;
import android.widget.FrameLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import java.util.Objects;

public final class KwaiBannerView$ViewHolder$itemNameBg$2 extends Lambda implements a	// class@00193a
{
    public final KwaiBannerView$ViewHolder this$0;

    public void KwaiBannerView$ViewHolder$itemNameBg$2(KwaiBannerView$ViewHolder p0){
       this.this$0 = p0;
       super(0);
    }
    public final FrameLayout invoke(){
       View obj = PatchProxy.apply(null, this, KwaiBannerView$ViewHolder$itemNameBg$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.itemView.findViewById(R.id.item_name_bg);
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.widget.FrameLayout");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
