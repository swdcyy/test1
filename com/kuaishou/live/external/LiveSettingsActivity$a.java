package com.kuaishou.live.external.LiveSettingsActivity$a;
import java.lang.Runnable;
import com.kuaishou.live.external.LiveSettingsActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import lnc.i9;
import oe6.e;

public class LiveSettingsActivity$a implements Runnable	// class@001b69
{
    public final LiveSettingsActivity b;

    public void LiveSettingsActivity$a(LiveSettingsActivity p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, LiveSettingsActivity$a.class, "1")) {
          return;
       }
       if (!i9.a(a.a().a())) {
          e.i0(false);
          this.b.u3();
       }
       return;
    }
}
