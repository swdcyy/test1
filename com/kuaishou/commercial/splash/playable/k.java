package com.kuaishou.commercial.splash.playable.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import nl9.h0;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.SplashInfo;
import tw.l;
import com.kuaishou.android.model.ads.SplashInfo$SplashPlayableInfo;
import com.kuaishou.android.model.ads.SplashInfo$PlayablePopupInfo;
import android.widget.CheckBox;
import ez.k0;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.View;
import ekd.m1;
import androidx.appcompat.widget.AppCompatCheckBox;
import im8.f;

public class k extends PresenterV2	// class@0015c5
{
    public BaseFeed p;
    public f q;
    public SplashInfo$PlayablePopupInfo r;
    public AppCompatCheckBox s;

    public void k(){
       super();
    }
    public void E8(){
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "3")) {
          return;
       }
       if (!d.a(-536296199).bY(this.p)) {
          return;
       }
       SplashInfo splashInfo = l.e(this.p);
       if (l.i(splashInfo)) {
          return;
       }
       this.r = splashInfo.mPlayableInfo.mPlayablePopupInfo;
       if (!PatchProxy.applyVoid(objArray, this, ok, "4")) {
          if (this.r.mHideAudioButton != null) {
             this.s.setVisibility(8);
          }else {
             this.s.setVisibility(0);
             this.s.setClickable(true);
             this.s.setOnCheckedChangeListener(new k0(this));
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a316a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.p = this.s8(BaseFeed.class);
       this.q = this.x8("SPLASH_VIDEO_PLAYER");
       return;
    }
}
