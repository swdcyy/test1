package com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableTaskPresenter$d;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableTaskPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.turntable.LiveGzoneTurntableLogger;

public class LiveGzoneTurntableTaskPresenter$d implements ViewTreeObserver$OnGlobalLayoutListener	// class@000e52
{
    public final LiveGzoneTurntableTaskPresenter b;

    public void LiveGzoneTurntableTaskPresenter$d(LiveGzoneTurntableTaskPresenter p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneTurntableTaskPresenter$d.class, "1")) {
          return;
       }
       this.b.B.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       View view = this.b.m8();
       int[] ointArray = new int[2];
       view.getLocationOnScreen(ointArray);
       int i = view.getHeight() + ointArray[1];
       this.b.B.getLocationOnScreen(ointArray);
       int i1 = ointArray[1] + this.b.B.getHeight();
       if (this.b.B.getHeight() > 0 && (ointArray[1] > 0 && i1 < i)) {
          this.b.s.k();
       }
    label_0054 :
       return;
    }
}
