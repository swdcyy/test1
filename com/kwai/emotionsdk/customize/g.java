package com.kwai.emotionsdk.customize.g;
import android.view.View$OnClickListener;
import com.kwai.emotionsdk.customize.CustomizeEmotionPreviewFragment;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import android.os.SystemClock;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import fk5.i;
import java.util.concurrent.Callable;
import brd.t;
import jl5.m;
import brd.z;
import fk5.g;
import android.app.Activity;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import crd.a;

public final class g implements View$OnClickListener	// class@000da9
{
    public final CustomizeEmotionPreviewFragment b;

    public void g(CustomizeEmotionPreviewFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if ((SystemClock.elapsedRealtime() - tb.c) - 500 < 0) {
       }else {
          tb.c = SystemClock.elapsedRealtime();
          if (!PatchProxy.applyVoid(null, tb, CustomizeEmotionPreviewFragment.class, "7")) {
             FragmentActivity activity = tb.getActivity();
             if (activity != null) {
                tb.p.c(t.fromCallable(new i(tb)).subscribeOn(m.c).observeOn(m.a).subscribe(new g(tb, activity), Functions.d()));
             }
          }
       }
       return;
    }
}
