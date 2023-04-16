package com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecordPanel$c;
import android.view.animation.Animation$AnimationListener;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecordPanel;
import java.lang.Object;
import android.view.animation.Animation;
import nnc.q;
import java.lang.Runnable;
import android.view.View;

public class FragmentAudioRecordPanel$c implements Animation$AnimationListener	// class@001f3c
{
    public final FragmentAudioRecordPanel b;

    public void FragmentAudioRecordPanel$c(FragmentAudioRecordPanel p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       this.b.b.post(new q(this));
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
    }
}
