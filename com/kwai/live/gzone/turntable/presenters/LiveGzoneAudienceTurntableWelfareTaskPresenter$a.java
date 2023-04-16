package com.kwai.live.gzone.turntable.presenters.LiveGzoneAudienceTurntableWelfareTaskPresenter$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneAudienceTurntableWelfareTaskPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.turntable.LiveGzoneTurntableLogger;

public class LiveGzoneAudienceTurntableWelfareTaskPresenter$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@000e4c
{
    public final LiveGzoneAudienceTurntableWelfareTaskPresenter b;

    public void LiveGzoneAudienceTurntableWelfareTaskPresenter$a(LiveGzoneAudienceTurntableWelfareTaskPresenter p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceTurntableWelfareTaskPresenter$a.class, "1")) {
          return;
       }
       this.b.z.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       View view = this.b.m8();
       int[] ointArray = new int[2];
       view.getLocationOnScreen(ointArray);
       int i = view.getHeight() + ointArray[1];
       this.b.z.getLocationOnScreen(ointArray);
       int i1 = ointArray[1] + this.b.z.getHeight();
       if (this.b.z.getHeight() > 0 && (ointArray[1] > 0 && i1 < i)) {
          this.b.r.p();
       }
    label_0054 :
       return;
    }
}
