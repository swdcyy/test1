package com.kuaishou.live.common.core.component.voiceparty.theater.tube.widget.LiveVoicePartyTheaterPlayListPendantView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;

public class LiveVoicePartyTheaterPlayListPendantView extends LinearLayout	// class@0017c4
{

    public void LiveVoicePartyTheaterPlayListPendantView(Context p0){
       super(p0, null, 0);
    }
    public void LiveVoicePartyTheaterPlayListPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveVoicePartyTheaterPlayListPendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyTheaterPlayListPendantView.class, "1")) {
       }else {
          a.g(p0.getSystemService("layout_inflater"), R.layout.arg_RES_7f0d0a66, this, true);
          this.setLayoutParams(new LinearLayout$LayoutParams(-2, -2));
       }
       return;
    }
}
