package com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter$i;
import java.lang.Runnable;
import com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionState;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import am0.b;
import android.view.View;
import com.kuaishou.live.ad.social.u;
import java.util.Objects;
import android.view.ViewGroup;
import am0.b$a;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;

public final class LiveAdAudienceBellCardPresenter$i implements Runnable	// class@0009f5
{
    public final LiveAdAudienceBellCardPresenter b;
    public final LiveAdSocialMessages$LiveAdSocialConversionState c;

    public void LiveAdAudienceBellCardPresenter$i(LiveAdAudienceBellCardPresenter p0,LiveAdSocialMessages$LiveAdSocialConversionState p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, LiveAdAudienceBellCardPresenter$i.class, "1")) {
          return;
       }
       b uob = this.b.R8();
       LiveAdAudienceBellCardPresenter t = this.b.t;
       if (t != null) {
          objArray = t.m();
       }
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoidOneRefs(objArray, uob, b.class, "6")) {
          b c = uob.c;
          int i = 0;
          if (c != null) {
             ViewGroup viewGroup = c.a();
             if (viewGroup != null) {
                viewGroup.setVisibility(i);
             }
          }
          uob.d(objArray);
          uob = uob.c;
          if (uob != null) {
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0,0x3f800000})};
             ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(uob.a(), propertyValu);
             if (objectAnimat != null) {
                objectAnimat.setDuration(240);
                objectAnimat.start();
             }
          }
       }
    label_007d :
       PatchProxy.onMethodExit(LiveAdAudienceBellCardPresenter$i.class, "1");
       return;
    }
}
