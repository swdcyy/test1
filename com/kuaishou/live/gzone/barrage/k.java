package com.kuaishou.live.gzone.barrage.k;
import java.lang.Runnable;
import com.kuaishou.live.gzone.barrage.l;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewParent;
import android.view.ViewGroup;
import b53.d0;
import android.view.View$OnLayoutChangeListener;

public final class k implements Runnable	// class@001c3c
{
    public final l b;

    public void k(l p0){
       this.b = p0;
    }
    public final void run(){
       k tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, l.class, "6")) {
       }else {
          ViewGroup parent = tb.m8().getParent();
          if (parent != null) {
             d0 uod0 = new d0(tb, parent);
             tb.F = uod0;
             parent.addOnLayoutChangeListener(uod0);
          }
       }
       return;
    }
}
