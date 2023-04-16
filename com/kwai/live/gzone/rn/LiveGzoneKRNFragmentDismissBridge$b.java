package com.kwai.live.gzone.rn.LiveGzoneKRNFragmentDismissBridge$b;
import java.lang.Runnable;
import com.kwai.live.gzone.rn.LiveGzoneKRNFragmentDismissBridge;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.ReactApplicationContext;
import android.app.Activity;
import com.facebook.react.bridge.ReactContext;
import androidx.fragment.app.FragmentActivity;
import tkd.b;
import tkd.d;
import f37.y;
import java.util.Objects;
import androidx.fragment.app.c;
import com.kwai.live.gzone.rn.LiveGzoneKRNFragmentDismissBridge$b$a;
import f37.y$a;

public final class LiveGzoneKRNFragmentDismissBridge$b implements Runnable	// class@000dee
{
    public final LiveGzoneKRNFragmentDismissBridge b;

    public void LiveGzoneKRNFragmentDismissBridge$b(LiveGzoneKRNFragmentDismissBridge p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneKRNFragmentDismissBridge$b.class, "1")) {
          return;
       }
       if (this.b.getReactContext().getCurrentActivity() instanceof FragmentActivity) {
          Activity currentActiv = this.b.getReactContext().getCurrentActivity();
          Objects.requireNonNull(currentActiv, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
          d.a(0x6fa7b5d6).GL(currentActiv.getSupportFragmentManager(), new LiveGzoneKRNFragmentDismissBridge$b$a());
       }
       return;
    }
}
