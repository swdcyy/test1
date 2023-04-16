package com.kuaishou.live.audience.component.pendant.carousel.LiveCarouseItemView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class LiveCarouseItemView extends FrameLayout	// class@000bb8
{
    public KwaiImageView b;
    public HashMap c;

    public void LiveCarouseItemView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveCarouseItemView.class, "1")) {
       }else {
          a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d0a9f, this, true);
          View view = this.findViewById(R.id.live_carouse_item_image_view);
          a.o(view, "findViewById\(R.id.live_carouse_item_image_view\)");
          this.b = view;
       }
       return;
    }
}
