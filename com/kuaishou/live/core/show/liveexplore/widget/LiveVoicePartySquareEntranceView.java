package com.kuaishou.live.core.show.liveexplore.widget.LiveVoicePartySquareEntranceView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import lnc.a1;
import com.kuaishou.live.core.show.liveexplore.widget.LiveVoicePartySquareEntranceView$b;
import java.util.List;
import com.yxcorp.utility.n;
import java.lang.Math;
import android.widget.ImageView;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig$LiveSquareEntrance;
import com.kuaishou.live.core.show.liveexplore.widget.LiveVoicePartySquareEntranceView$a;
import android.view.View$OnClickListener;
import ekd.j;
import wa2.d;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Runnable;

public class LiveVoicePartySquareEntranceView extends LinearLayout	// class@000c80
{
    public final float b;
    public final int c;
    public KwaiImageView[] d;
    public LiveVoicePartySquareEntranceView$b e;
    public static final int f;

    public void LiveVoicePartySquareEntranceView(Context p0){
       super(p0, null);
    }
    public void LiveVoicePartySquareEntranceView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveVoicePartySquareEntranceView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0x3f91745d;
       this.c = 4;
       KwaiImageView[] kwaiImageVie = new KwaiImageView[4];
       this.d = kwaiImageVie;
       if (PatchProxy.applyVoid(null, this, LiveVoicePartySquareEntranceView.class, "1")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d0e77, this);
          kwaiImageVie[0] = this.findViewById(0x7f0a25c5);
          kwaiImageVie[1] = this.findViewById(0x7f0a25c6);
          kwaiImageVie[2] = this.findViewById(0x7f0a25c7);
          kwaiImageVie[3] = this.findViewById(0x7f0a25c8);
          this.setPadding(a1.d(R.dimen.arg_RES_7f0702ab), a1.d(R.dimen.arg_RES_7f070295), a1.d(R.dimen.arg_RES_7f0702ab), a1.d(R.dimen.arg_RES_7f070295));
       }
       return;
    }
    public void setOnEntranceViewClickListener(LiveVoicePartySquareEntranceView$b p0){
       this.e = p0;
    }
    public void setSquareEntranceList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartySquareEntranceView.class, "2")) {
          return;
       }
       n.Z(8, this.d);
       int i = 0;
       while (i < Math.min(p0.size(), 4)) {
          this.d[i].setVisibility(0);
          LiveVoicePartyCommonConfig$LiveSquareEntrance liveSquareEn = p0.get(i);
          this.d[i].setOnClickListener(new LiveVoicePartySquareEntranceView$a(this, liveSquareEn, i));
          object oobject = this.d[i];
          LiveVoicePartyCommonConfig$LiveSquareEntrance mEntranceIco = liveSquareEn.mEntranceIconUrls;
          LiveVoicePartyCommonConfig$LiveSquareEntrance mEntranceSta = liveSquareEn.mEntranceStartColor;
          liveSquareEn = liveSquareEn.mEntranceEndColor;
          if (!PatchProxy.applyVoidFourRefs(oobject, mEntranceIco, mEntranceSta, liveSquareEn, this, LiveVoicePartySquareEntranceView.class, "3") && !j.h(mEntranceIco)) {
             d uod = new d(this, oobject, mEntranceSta, liveSquareEn, mEntranceIco);
             oobject.post(v10);
          }
          i = i + 1;
       }
       return;
    }
}
