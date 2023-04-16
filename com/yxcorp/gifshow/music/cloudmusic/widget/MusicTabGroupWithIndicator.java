package com.yxcorp.gifshow.music.cloudmusic.widget.MusicTabGroupWithIndicator;
import com.yxcorp.gifshow.music.cloudmusic.widget.BaseTabGroupWithIndicator;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.music.cloudmusic.widget.BaseTabIndicatorView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Math;

public class MusicTabGroupWithIndicator extends BaseTabGroupWithIndicator	// class@00204d
{

    public void MusicTabGroupWithIndicator(Context p0){
       super(p0, null, 0);
    }
    public void MusicTabGroupWithIndicator(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void MusicTabGroupWithIndicator(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public BaseTabIndicatorView g(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MusicTabGroupWithIndicator.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BaseTabIndicatorView(p0);
    }
    public void h(View p0,View p1,float p2){
       int[] this;
       int[] ointArray;
       if (PatchProxy.isSupport(MusicTabGroupWithIndicator.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), this, MusicTabGroupWithIndicator.class, "2")) {
          return;
       }
       Integer tag = p0.getTag(R.id.tab_color);
       Object tag1 = p1.getTag(R.id.tab_color);
       if (tag == null || tag1 == null) {
          this.c.setGradientColor(null);
          return;
       }else {
          tag = tag.intValue();
          int i = tag1.intValue();
          Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MusicTabGroupWithIndicator.class, "3");
          this = 0x3f800000;
          float f = (obj != PatchProxyResult.class)? obj.floatValue(): (((float)this.c.getWidth() * this.c.getScaleX()) * this) / (float)Math.abs((((this.getParentView().getLeft() + p0.getLeft()) + (p0.getWidth() / 2)) - ((this.getParentView().getLeft() + p1.getLeft()) + (p1.getWidth() / 2))));
          f = f / 2.00f;
          float f1 = p2 - f;
          p2 = p2 + f;
          if (p2 - this >= 0) {
             ointArray = new int[]{this.i(f1, tag, i),i};
             this.c.setGradientColor(ointArray);
          }else if(f1 <= 0){
             ointArray = new int[]{tag,this.i(p2, tag, i)};
             this.c.setGradientColor(ointArray);
          }else {
             this = new int[]{this.i(f1, tag, i),this.i(p2, tag, i)};
             this.c.setGradientColor(this);
          }
          return;
       }
    }
    public final int i(float p0,int p1,int p2){
       int i = (p1 >> 24) & 0x00ff;
       int i1 = (p1 >> 16) & 0x00ff;
       int i2 = (p1 >> 8) & 0x00ff;
       p1 = p1 & 0x00ff;
       return (((((i + (int)((float)(((p2 >> 24) & 0x00ff) - i) * p0)) << 24) | ((i1 + (int)((float)(((p2 >> 16) & 0x00ff) - i1) * p0)) << 16)) | ((i2 + (int)((float)(((p2 >> 8) & 0x00ff) - i2) * p0)) << 8)) | (p1 + (int)(p0 * (float)((p2 & 0x00ff) - p1))));
    }
}
