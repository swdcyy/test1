package com.yxcorp.gifshow.camera.record.tab.MoodTabTagManager;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroup;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.tab.MoodTabTagManager$1;
import android.view.View;
import android.view.ViewGroup;
import com.kwai.library.widget.textview.SizeAdjustableTextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.tab.CameraTab;
import eh9.n;
import com.yxcorp.utility.n;

public class MoodTabTagManager	// class@000f45
{
    public SizeAdjustableTextView a;
    public CameraActivity b;
    public Pair c;
    public DefaultLifecycleObserver d;

    public void MoodTabTagManager(CameraScrollTabViewGroup p0){
       super();
       this.c = null;
       this.d = new MoodTabTagManager$1(this);
       this.a = p0.findViewById(0x7f0a2bee);
    }
    public void a(int p0){
       MoodTabTagManager moodTabTagMa = MoodTabTagManager.class;
       if (PatchProxy.isSupport(moodTabTagMa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, moodTabTagMa, "3")) {
          return;
       }
       if (p0 == CameraTab.CAMERA_TAB_MOOD.getTextViewId()) {
          n.Y(this.a, 8, false);
       }
       return;
    }
}
