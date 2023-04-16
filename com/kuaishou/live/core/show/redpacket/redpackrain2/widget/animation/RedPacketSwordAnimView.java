package com.kuaishou.live.core.show.redpacket.redpackrain2.widget.animation.RedPacketSwordAnimView;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import d61.c0;
import android.net.Uri;
import com.kuaishou.live.common.core.component.redpacket.LiveNewRedPacketLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.animation.RedPacketSwordAnimView$a;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import android.widget.ImageView;
import java.lang.Math;

public class RedPacketSwordAnimView extends FrameLayout	// class@000f36
{
    public boolean b;
    public boolean c;
    public Pair d;
    public final KwaiImageView e;
    public final KwaiImageView f;
    public final KwaiImageView g;
    public final KwaiImageView h;
    public final KwaiImageView i;
    public final KwaiImageView j;
    public HashMap k;

    public void RedPacketSwordAnimView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void RedPacketSwordAnimView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void RedPacketSwordAnimView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d0db1, this, true);
       View view = this.findViewById(R.id.live_sword_1);
       a.o(view, "findViewById\(R.id.live_sword_1\)");
       View view1 = view;
       this.e = view1;
       view = this.findViewById(R.id.live_sword_2);
       a.o(view, "findViewById\(R.id.live_sword_2\)");
       this.f = view;
       view = this.findViewById(R.id.live_sword_3);
       a.o(view, "findViewById\(R.id.live_sword_3\)");
       this.g = view;
       view = this.findViewById(R.id.live_sword_4);
       a.o(view, "findViewById\(R.id.live_sword_4\)");
       this.h = view;
       view = this.findViewById(R.id.live_sword_5);
       a.o(view, "findViewById\(R.id.live_sword_5\)");
       this.i = view;
       view = this.findViewById(R.id.live_sword_6);
       a.o(view, "findViewById\(R.id.live_sword_6\)");
       this.j = view;
       Uri uri = c0.a.a("udata/pkg/kwai-client-image/live_red_packet_rain/live_red_packet_anim_sword.png");
       b.c0(LiveNewRedPacketLogTag.LIVE_NORMAL_RED_PACKET, "[SwordAnimView]Load Image Start:", "uri", uri);
       view1.E(uri, null, 0, 0, new RedPacketSwordAnimView$a(this, uri));
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(RedPacketSwordAnimView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, RedPacketSwordAnimView.class, "1")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0 && (this.getWidth() > 0 && (this.getHeight() > 0 && this.b == null))) {
          this.b = true;
          if (!PatchProxy.applyVoid(null, this, RedPacketSwordAnimView.class, "2")) {
             this.e.setTranslationX((((float)(- this.getWidth()) / 2.00f) - ((float)this.e.getWidth() / 2.00f)));
             this.e.setTranslationY((((float)(- this.getHeight()) / 2.00f) - ((float)this.e.getHeight() / 2.00f)));
             this.h.setTranslationX((((float)this.getWidth() / 2.00f) + ((float)this.h.getWidth() / 2.00f)));
             this.h.setTranslationY((((float)this.getHeight() / 2.00f) + ((float)this.h.getHeight() / 2.00f)));
             this.f.setTranslationX((((float)this.getWidth() / 2.00f) + ((float)this.f.getWidth() / 2.00f)));
             this.f.setTranslationY((((float)(- this.getHeight()) / 2.00f) - ((float)this.f.getHeight() / 2.00f)));
             this.i.setTranslationX((((float)(- this.getWidth()) / 2.00f) - ((float)this.i.getWidth() / 2.00f)));
             this.i.setTranslationY((((float)this.getHeight() / 2.00f) + ((float)this.i.getHeight() / 2.00f)));
             this.g.setTranslationX((((float)this.getWidth() / 2.00f) + ((float)this.g.getWidth() / 2.00f)));
             RedPacketSwordAnimView tg = this.g;
             double d = (double)10.00f;
             tg.setTranslationY((((float)(- tg.getWidth()) * (float)Math.tan(d)) - ((float)this.g.getHeight() / 2.00f)));
             this.j.setTranslationX((((float)(- this.getWidth()) / 2.00f) - ((float)this.j.getWidth() / 2.00f)));
             tg = this.j;
             tg.setTranslationY((((float)tg.getWidth() * (float)Math.tan(d)) + ((float)this.j.getHeight() / 2.00f)));
             this.e.setRotation(-18.00f);
             this.h.setRotation(-18.00f);
             this.f.setRotation(29.00f);
             this.i.setRotation(29.00f);
             this.g.setRotation(80.00f);
             this.j.setRotation(80.00f);
          }
       }
    label_0188 :
       return;
    }
}
