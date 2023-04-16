package com.yxcorp.gifshow.music.MusicRankLabelViewGroup;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.music.MusicRankLabelView;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class MusicRankLabelViewGroup extends LinearLayout	// class@001fd3
{
    public MusicRankLabelView b;
    public MusicRankLabelView c;
    public final int d;
    public final int e;

    public void MusicRankLabelViewGroup(Context p0){
       super(p0, null);
    }
    public void MusicRankLabelViewGroup(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void MusicRankLabelViewGroup(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       int i = a1.e(20.00f);
       this.d = i;
       p2 = a1.e(5.00f);
       this.e = p2;
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicRankLabelViewGroup.class, "1")) {
       }else {
          LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, i);
          layoutParams.leftMargin = p2;
          this.setGravity(16);
          this.setOrientation(0);
          this.setLayoutParams(layoutParams);
          this.b = new MusicRankLabelView(p0);
          this.c = new MusicRankLabelView(p0);
          this.b.setBackgroundResource(R.drawable.arg_RES_7f0818e6);
          this.c.setBackgroundResource(R.drawable.arg_RES_7f0818e5);
          this.addView(this.c);
          this.addView(this.b);
       }
       return;
    }
    public int getLeftMargin(){
       return this.e;
    }
    public int getPreMeasureHeight(){
       return this.d;
    }
    public int getPreMeasureWidth(){
       Object obj = PatchProxy.apply(null, this, MusicRankLabelViewGroup.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)((float)this.b.getPreWidth() + (float)this.c.getPreWidth());
    }
}
