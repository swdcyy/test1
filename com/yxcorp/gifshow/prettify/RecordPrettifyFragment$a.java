package com.yxcorp.gifshow.prettify.RecordPrettifyFragment$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.prettify.RecordPrettifyFragment;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import android.content.Context;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.prettify.RecordPrettifyFragment$c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import o0c.h;
import com.yxcorp.gifshow.prettify.base.PrettifyBaseFragment;

public class RecordPrettifyFragment$a extends AnimatorListenerAdapter	// class@0010e3
{
    public final RecordPrettifyFragment a;

    public void RecordPrettifyFragment$a(RecordPrettifyFragment p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordPrettifyFragment$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       Object[] objArray = new Object[0];
       a.D().s("RecordPrettifyFragment", "hideFragment onAnimationEnd", objArray);
       RecordPrettifyFragment$a ta = this.a;
       RxBus.f.b(new PanelShowEvent(ta.A, PanelShowEvent$PanelType.PRETTIFY, ta.getActivity(), 0));
       this.a.dismissAllowingStateLoss();
       RecordPrettifyFragment h = this.a.H;
       if (h != null) {
          h.a(0);
       }
       Iterator iterator = new ArrayList(this.a.F).iterator();
       while (iterator.hasNext()) {
          iterator.next().O();
       }
       h = this.a.C;
       if (h instanceof PrettifyBaseFragment) {
          h.fh(0);
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordPrettifyFragment$a.class, "2")) {
          return;
       }
       super.onAnimationStart(p0);
       Object[] objArray = new Object[0];
       a.D().s("RecordPrettifyFragment", "hideFragment onAnimationStart", objArray);
       RecordPrettifyFragment$a ta = this.a;
       RxBus.f.b(new PanelShowEvent(ta.A, PanelShowEvent$PanelType.PRETTIFY, ta.getActivity(), 0));
       Iterator iterator = new ArrayList(this.a.F).iterator();
       while (iterator.hasNext()) {
          iterator.next().N0();
       }
       return;
    }
}
