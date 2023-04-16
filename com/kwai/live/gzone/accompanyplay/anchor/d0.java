package com.kwai.live.gzone.accompanyplay.anchor.d0;
import erd.g;
import com.kwai.live.gzone.accompanyplay.anchor.b0;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetInfo;
import java.lang.System;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.widget.TextView;

public class d0 implements g	// class@000b02
{
    public final b0 b;

    public void d0(b0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "1")) {
       }else if(!this.b.P8()){
          p0 = this.b.v;
          long l = ((this.b.v.mAnchorCancelFrozenTime * 1000) - ((System.currentTimeMillis() - p0.mLocalTimeDiff) - p0.mRoundStartTimestamp)) / 1000;
          StringBuilder str = 10;
          long l1 = 60;
          p0 = "\'";
          if (l - l1 < 0) {
             if (l - str < 0) {
                p0 = "00\"0"+l+p0;
             }else {
                p0 = "00\""+l+p0;
             }
          }else {
             long l2 = l / l1;
             l = l % l1;
             String str1 = "\"";
             str1 = (l2 - str < 0)? "0"+l2+str1: l2+str1;
             if (l - str < 0) {
                p0 = str1+"0"+l+p0;
             }else {
                p0 = str1+l+p0;
             }
          }
          this.b.r.setText(p0);
       }else {
          this.b.q.setVisibility(8);
          this.b.r.setVisibility(8);
       }
       this.b.Y8();
       return;
    }
}
