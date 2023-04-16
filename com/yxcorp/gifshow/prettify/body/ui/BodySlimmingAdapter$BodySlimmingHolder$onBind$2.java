package com.yxcorp.gifshow.prettify.body.ui.BodySlimmingAdapter$BodySlimmingHolder$onBind$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.prettify.body.ui.a$a;
import com.yxcorp.gifshow.prettify.body.model.BodySlimmingPanelItem;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import android.widget.ImageView;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.prettify.body.ui.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class BodySlimmingAdapter$BodySlimmingHolder$onBind$2 extends Lambda implements l	// class@001136
{
    public final BodySlimmingPanelItem $panelItem;
    public final a$a this$0;

    public void BodySlimmingAdapter$BodySlimmingHolder$onBind$2(a$a p0,BodySlimmingPanelItem p1){
       this.this$0 = p0;
       this.$panelItem = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(BodySlimmingAdapter$BodySlimmingHolder$onBind$2.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BodySlimmingAdapter$BodySlimmingHolder$onBind$2.class, "1")) {
          return;
       }
       ImageView imageView = this.this$0.a();
       Integer integer = null;
       Integer integer1 = (imageView != null)? Integer.valueOf(imageView.getVisibility()): integer;
       ImageView imageView1 = this.this$0.a();
       if (imageView1 != null) {
          int i = (p0)? 0: 8;
          imageView1.setVisibility(i);
       }
       ImageView imageView2 = this.this$0.a();
       if (imageView2 != null) {
          integer = Integer.valueOf(imageView2.getVisibility());
       }
       if (a.g(integer1, integer) ^ 0x01) {
          a$a h = this.this$0.h;
          h.l0(h.L0(this.$panelItem));
       }
       return;
    }
}
