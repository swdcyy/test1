package com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.timeline.SubtitleTimelineFragment;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import androidx.fragment.app.Fragment;
import amd.c;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import hnd.f;
import gnd.b;
import tvc.f;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import androidx.lifecycle.Observer;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import voc.o;
import bvc.b;
import lnc.a1;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import fnd.c;
import java.util.Objects;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import fnd.b;
import msd.a;

public final class SubtitleTimelineFragment extends DecorationTimelineFragment	// class@000afd
{
    public boolean w;
    public HashMap x;

    public void SubtitleTimelineFragment(){
       super();
       this.w = true;
    }
    public void eh(){
       if (PatchProxy.applyVoid(null, this, SubtitleTimelineFragment.class, "6")) {
          return;
       }
       SubtitleTimelineFragment tx = this.x;
       if (tx != null) {
          tx.clear();
       }
       return;
    }
    public int hh(){
       return 0x7f0d157e;
    }
    public c lh(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SubtitleTimelineFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "fragment");
       return b.a(p0);
    }
    public void nh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SubtitleTimelineFragment.class, "3")) {
          return;
       }
       this.kh().r0().removeObserver(this.u);
       Iterator iterator = this.jh().iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       FragmentActivity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          objArray.l3(this);
       }
       o oo = this.fh().x();
       a.o(oo, "editorDelegate.editorContext");
       oo.b().h(false);
       EditorDelegate uEditorDeleg = this.fh();
       int i = (this.w != null)? a1.d(R.dimen.arg_RES_7f0703a5): 0;
       uEditorDeleg.M(i, false, false, true);
       this.w = true;
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       c obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, SubtitleTimelineFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "inflater");
       obj = this.kh();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.subtitle_v2.vm.SubtitleViewModelV2");
       c uoc = obj;
       View view = this.fh().z();
       Objects.requireNonNull(view, "null cannot be cast to non-null type com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView");
       View view1 = view;
       o oo = this.fh().x();
       a.o(oo, "editorDelegate.editorContext");
       obj = new c(this, uoc, this.u1(), view1, oo);
       this.jh().add(p2);
       this.jh().add(new b(this, this.u1(), this.fh(), this.gh()));
       return super.onCreateView(p0, p1, p2);
    }
    public void onDestroyView(){
       super.onDestroyView();
       this.eh();
    }
}
