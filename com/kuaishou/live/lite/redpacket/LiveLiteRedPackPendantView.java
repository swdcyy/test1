package com.kuaishou.live.lite.redpacket.LiveLiteRedPackPendantView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.HashSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import ha1.b;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kuaishou.live.widget.LivePkShimmerLayout;
import bld.b;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import com.yxcorp.gifshow.model.CDNUrl;
import ud3.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class LiveLiteRedPackPendantView extends LinearLayout	// class@000b0c
{
    public LivePkShimmerLayout b;
    public KwaiImageView c;
    public TextView d;
    public HashSet e;

    public void LiveLiteRedPackPendantView(Context p0){
       super(p0, null);
    }
    public void LiveLiteRedPackPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveLiteRedPackPendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = new HashSet();
       if (PatchProxy.applyVoid(null, this, LiveLiteRedPackPendantView.class, "1")) {
       }else {
          View view = b.d(this, R.layout.live_lite_red_pack_pendant_layout, true);
          this.c = view.findViewById(0x7f0a180b);
          this.d = view.findViewById(0x7f0a180a);
          LivePkShimmerLayout livePkShimme = view.findViewById(R.id.lite_red_pack_simmer_view);
          this.b = livePkShimme;
          b uob = new b();
          uob.v(a.a().a().getResources().getColor(R.color.arg_RES_7f060846));
          uob.g(KwaiRadiusStyles.FULL);
          livePkShimme.setBackground(uob.a());
       }
       return;
    }
    public View getAnchorView(){
       return this.c;
    }
    public LivePkShimmerLayout getShimmerView(){
       return this.b;
    }
    public void setContextText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteRedPackPendantView.class, "3")) {
          return;
       }
       this.d.setText(p0);
       return;
    }
    public void setIconUrl(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteRedPackPendantView.class, "2")) {
          return;
       }
       if (b.a(p0, this.e)) {
          this.c.U(p0);
          b.b(p0, this.e);
       }
       return;
    }
}
