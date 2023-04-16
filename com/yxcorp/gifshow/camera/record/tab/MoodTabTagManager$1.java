package com.yxcorp.gifshow.camera.record.tab.MoodTabTagManager$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.camera.record.tab.MoodTabTagManager;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import n2.a;

public class MoodTabTagManager$1 implements DefaultLifecycleObserver	// class@000f44
{
    public final MoodTabTagManager b;

    public void MoodTabTagManager$1(MoodTabTagManager p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTabTagManager$1.class, "1")) {
          return;
       }
       this.b.b.V3(this);
       MoodTabTagManager$1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, MoodTabTagManager.class, "4")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.name = "MOOD_UP_TEXT_TIPS";
          u1.D0("", tb.b.o0(), 6, uElementPack, null, null);
       }
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       a.d(this, p0);
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
