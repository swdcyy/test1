package com.yxcorp.gifshow.music.cloudmusic.widget.MusicSubSmoothPagerSlidingTabStrip;
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
import com.yxcorp.gifshow.music.cloudmusic.widget.MusicSubSmoothPagerSlidingTabStrip$1;

public class MusicSubSmoothPagerSlidingTabStrip extends BaseMusicSmoothPagerSlidingTabStrip	// class@00204c
{
    public static final int v;
    public static final int w;

    static {
       MusicSubSmoothPagerSlidingTabStrip.v = a1.a(0x7f0607de);
       MusicSubSmoothPagerSlidingTabStrip.w = a1.a(0x7f0607de);
    }
    public void MusicSubSmoothPagerSlidingTabStrip(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void MusicSubSmoothPagerSlidingTabStrip(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public a0 a(Context p0){
       MusicSubSmoothPagerSlidingTabStrip$1 obj = PatchProxy.applyOneRefs(p0, this, MusicSubSmoothPagerSlidingTabStrip.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MusicSubSmoothPagerSlidingTabStrip$1(this, p0);
       this.t = obj;
       return obj;
    }
    public void y(){
       PatchProxy.applyVoid(null, this, MusicSubSmoothPagerSlidingTabStrip.class, "2");
    }
}
