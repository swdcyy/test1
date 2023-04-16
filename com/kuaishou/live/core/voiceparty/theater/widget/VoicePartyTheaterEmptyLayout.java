package com.kuaishou.live.core.voiceparty.theater.widget.VoicePartyTheaterEmptyLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jx2.a;
import android.view.View$OnClickListener;

public class VoicePartyTheaterEmptyLayout extends LinearLayout	// class@001a50
{
    public boolean b;
    public View$OnClickListener c;

    public void VoicePartyTheaterEmptyLayout(Context p0){
       super(p0, null);
    }
    public void VoicePartyTheaterEmptyLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void VoicePartyTheaterEmptyLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a.c(p0, R.layout.arg_RES_7f0d16e5, this);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.g6, p2, 0);
       this.b = typedArray.getBoolean(0, 0);
       typedArray.recycle();
    }
    public void onFinishInflate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VoicePartyTheaterEmptyLayout.class, "1")) {
          return;
       }
       super.onFinishInflate();
       if (!PatchProxy.applyVoid(objArray, this, VoicePartyTheaterEmptyLayout.class, "2")) {
          View view = this.findViewById(R.id.voice_party_theater_select_subtitle);
          View view1 = this.findViewById(R.id.voice_party_theater_select_button);
          int i = 8;
          int i1 = (this.b != null)? 0: 8;
          view.setVisibility(i1);
          if (this.b != null) {
             i = 0;
          }
          view1.setVisibility(i);
          view1.setOnClickListener(new a(this));
       }
       return;
    }
    public void setOnSelectButtonClickListener(View$OnClickListener p0){
       this.c = p0;
    }
}
