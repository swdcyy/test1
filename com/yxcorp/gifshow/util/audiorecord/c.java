package com.yxcorp.gifshow.util.audiorecord.c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecordPanel;
import java.lang.Object;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.res.Resources;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.graphics.drawable.Animatable;
import com.yxcorp.gifshow.util.audiorecord.a;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder$Status;
import r6b.d;
import com.yxcorp.gifshow.util.audiorecord.f;
import java.lang.Runnable;
import java.util.concurrent.Executor;

public final class c implements View$OnClickListener	// class@001f53
{
    public final FragmentAudioRecordPanel b;

    public void c(FragmentAudioRecordPanel p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c tb = this.b;
       Drawable drawable = tb.getActivity().getResources().getDrawable(R.drawable.arg_RES_7f082364);
       tb.f.setImageDrawable(drawable);
       if (drawable instanceof Animatable) {
          drawable.start();
       }
       tb.j.a().stop();
       tb.e.setSelected(false);
       tb.g.setEnabled(false);
       tb.e.setEnabled(false);
       tb.d.setEnabled(false);
       FragmentAudioRecordPanel j = tb.j;
       FragmentAudioRecorder n = j.n;
       if (n == FragmentAudioRecorder$Status.PAUSE || n == FragmentAudioRecorder$Status.INIT) {
          j.n = FragmentAudioRecorder$Status.STOP;
          j.h.stopRecording();
          j.e.execute(new f(j));
       }
       return;
    }
}
