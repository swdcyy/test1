package com.yxcorp.gifshow.camera.record.widget.RecordButton$b;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.camera.record.widget.RecordButton;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class RecordButton$b extends AnimatorListenerAdapter	// class@000fd0
{
    public final View a;
    public final RecordButton b;

    public void RecordButton$b(RecordButton p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordButton$b.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.setVisibility(0);
       return;
    }
}
