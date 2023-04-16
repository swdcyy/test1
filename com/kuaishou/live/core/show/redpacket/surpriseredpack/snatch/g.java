package com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.g;
import ki2.a;
import android.view.ViewGroup;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.a$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.LiveRedPackRainTopLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import ki2.g;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import d61.c0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.net.Uri;

public class g extends a	// class@000fb8
{
    public View c;
    public LiveRedPackRainTopLayout d;
    public KwaiImageView e;
    public KwaiImageView f;
    public KwaiImageView g;
    public a$a h;
    public Animation i;
    public ObjectAnimator j;

    public void g(ViewGroup p0,a$a p1){
       super(p0);
       this.h = p1;
       View view = this.b();
       if (PatchProxy.applyVoidOneRefs(view, this, g.class, "1")) {
       }else if(view == null){
          this.d = m1.f(view, 0x7f0a267d);
          this.c = m1.f(view, 0x7f0a2683);
          this.e = m1.f(view, 0x7f0a2669);
          this.f = m1.f(view, 0x7f0a267f);
          this.g = m1.f(view, 0x7f0a2681);
          this.f.setOnClickListener(new g(this));
          c0 a = c0.a;
          this.f.L(a.b("/udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_snatch_coin.webp"));
          this.e.setImageURI(a.a("udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_redbag_down.webp"));
          m1.f(view, R.id.live_surprise_red_pack_top_img).setImageURI(a.a("udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_redbag_up.webp"));
          m1.f(view, R.id.live_surprise_red_pack_topic_img).setImageURI(a.a("udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_logo.png"));
       }
       return;
    }
    public int a(){
       return 0x7f0d0e02;
    }
}
