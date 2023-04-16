package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftItemLabelView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIMarkLabel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIStaticTextLabel;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIText;
import java.lang.CharSequence;
import rm1.c;
import rm1.c$a;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIImageLabel;
import android.widget.ImageView;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIImage;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.Boolean;

public final class LiveGiftItemLabelView extends FrameLayout	// class@00121f
{
    public final KwaiImageView b;
    public final TextView c;
    public UIMarkLabel d;
    public HashMap e;

    public void LiveGiftItemLabelView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveGiftItemLabelView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveGiftItemLabelView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       View view = LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d0b36, this);
       View view1 = view.findViewById(R.id.v_image_label);
       a.o(view1, "view.findViewById\(R.id.v_image_label\)");
       this.b = view1;
       view = view.findViewById(R.id.tv_text_label);
       a.o(view, "view.findViewById\(R.id.tv_text_label\)");
       this.c = view;
    }
    public void LiveGiftItemLabelView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void a(UIMarkLabel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftItemLabelView.class, "1")) {
          return;
       }
       a.p(p0, "marKLabel");
       int i = (this.isSelected())? 8: 0;
       this.setVisibility(i);
       this.d = p0;
       if (p0.e() == 3) {
          UIStaticTextLabel uIStaticText = p0.f();
          if (uIStaticText != null) {
             this.c.setText(uIStaticText.a().b());
             this.c.setTextSize((float)uIStaticText.a().c());
             this.c.setTextColor(c.a.a(uIStaticText.a().a()));
          }else {
             this.c.setText("");
          }
          UIImageLabel uIImageLabel = p0.d();
          if (uIImageLabel != null) {
             this.b.setVisibility(0);
             this.b.P(uIImageLabel.a().a());
          }else {
             this.b.setVisibility(8);
             this.b.i0();
          }
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, LiveGiftItemLabelView.class, "3")) {
          return;
       }
       this.d = null;
       this.setVisibility(8);
       return;
    }
    public void setSelected(boolean p0){
       if (PatchProxy.isSupport(LiveGiftItemLabelView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveGiftItemLabelView.class, "2")) {
          return;
       }
       super.setSelected(p0);
       LiveGiftItemLabelView td = this.d;
       if (td != null) {
          this.a(td);
       }
       return;
    }
}
