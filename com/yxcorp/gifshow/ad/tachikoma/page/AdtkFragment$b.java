package com.yxcorp.gifshow.ad.tachikoma.page.AdtkFragment$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout;
import java.util.Objects;
import java.lang.Integer;
import java.lang.StringBuilder;
import yx.j0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;

public final class AdtkFragment$b implements Runnable	// class@00183c
{
    public final AdtkFragment b;
    public final int c;

    public void AdtkFragment$b(AdtkFragment p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdtkFragment$b.class, "1")) {
          return;
       }
       AdtkFragment l = this.b.l;
       if (l != null) {
          int i = 0;
          AdtkFragment uAdtkFragmen = 1;
          if (l.getDragStatus() == uAdtkFragmen) {
             uAdtkFragmen = null;
          }
          if (uAdtkFragmen) {
             objArray = l;
          }
          if (objArray != null) {
             AdtkFragment$b tb = this.b;
             AdtkFragment$b tc = this.c;
             Objects.requireNonNull(tb);
             if (!PatchProxy.isSupport(AdtkFragment.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(tc), tb, AdtkFragment.class, "7")) {
                Object[] objArray1 = new Object[i];
                j0.f("AdtkFragment", " close reason : "+tc, objArray1);
                FragmentActivity activity = tb.getActivity();
                if (activity != null) {
                   activity.finish();
                }
             }
          }
       }
    label_0060 :
       return;
    }
}
