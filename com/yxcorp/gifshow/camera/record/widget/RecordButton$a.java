package com.yxcorp.gifshow.camera.record.widget.RecordButton$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.camera.record.widget.RecordButton;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class RecordButton$a extends AnimatorListenerAdapter	// class@000fcf
{
    public final RecordButton a;

    public void RecordButton$a(RecordButton p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordButton$a.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.t.setVisibility(0);
       return;
    }
}
