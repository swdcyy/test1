package com.yxcorp.gifshow.music.cloudmusic.widget.MusicSmoothPagerSlidingTabStrip;
import com.yxcorp.gifshow.music.cloudmusic.widget.BaseMusicSmoothPagerSlidingTabStrip;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import t46.a0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.music.cloudmusic.widget.MusicTabGroupWithIndicator;
import java.util.List;
import com.yxcorp.gifshow.music.cloudmusic.widget.BaseMusicSmoothPagerSlidingTabStrip$c;
import android.view.View;
import android.widget.TextView;
import android.text.TextPaint;
import java.lang.CharSequence;
import android.widget.HorizontalScrollView;
import com.yxcorp.utility.n;

public class MusicSmoothPagerSlidingTabStrip extends BaseMusicSmoothPagerSlidingTabStrip	// class@00204a
{
    public static final int v;
    public static final int w;
    public static final int x;

    static {
       MusicSmoothPagerSlidingTabStrip.v = a1.d(0x7f070bd7);
       MusicSmoothPagerSlidingTabStrip.w = a1.d(0x7f070bd6);
       MusicSmoothPagerSlidingTabStrip.x = a1.d(0x7f070bd5);
    }
    public void MusicSmoothPagerSlidingTabStrip(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void MusicSmoothPagerSlidingTabStrip(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public a0 a(Context p0){
       MusicTabGroupWithIndicator obj = PatchProxy.applyOneRefs(p0, this, MusicSmoothPagerSlidingTabStrip.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MusicTabGroupWithIndicator(p0);
       this.t = obj;
       return obj;
    }
    public void y(){
       float f3;
       if (PatchProxy.applyVoid(null, this, MusicSmoothPagerSlidingTabStrip.class, "1")) {
          return;
       }
       int i = this.u.size();
       float[] uofloatArray = new float[i];
       int i1 = 0;
       int i2 = 0;
       float f = 0;
       for (int i3 = 0; i3 < i; i3 = i3 + 1) {
          TextView textView = this.u.get(i3).j.findViewById(R.id.tab_text);
          TextPaint paint = textView.getPaint();
          float f1 = paint.measureText(textView.getText());
          f1 = f1 + (float)MusicSmoothPagerSlidingTabStrip.x;
          f1 = f1 + (float)MusicSmoothPagerSlidingTabStrip.w;
          int i4 = MusicSmoothPagerSlidingTabStrip.v * 2;
          f1 = f1 + (float)i4;
          uofloatArray[i3] = f1;
          f = f + uofloatArray[i3];
       }
       float f2 = (float)n.z(this.getContext());
       if (f - f2 > 0) {
          i3 = i - 1;
          if ((f - f2) - (uofloatArray[i3] / 2.00f) < 0) {
             i2 = uofloatArray[i3] / 2.00f;
          }
       }else {
          f3 = f2 - f;
       }
       f3 = i2 / (float)i;
       for (; i1 < i; i1 = i1 + 1) {
          f = uofloatArray[i1] + f3;
          this.u.get(i1).m = (int)f;
       }
       return;
    }
}
