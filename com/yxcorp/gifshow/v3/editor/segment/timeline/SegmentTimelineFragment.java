package com.yxcorp.gifshow.v3.editor.segment.timeline.SegmentTimelineFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.editor.segment.timeline.SegmentTimelineFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.segment.timeline.k;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import ftc.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import etc.e0;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$d;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.v3.f;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import java.lang.Number;
import i2b.a;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import androidx.fragment.app.Fragment;

public class SegmentTimelineFragment extends BaseEditorFragment	// class@0011e3
{
    public SegmentTimelineFragment$a G;
    public k H;

    public void SegmentTimelineFragment(){
       super();
       this.G = new SegmentTimelineFragment$a(this);
    }
    public void fh(){
       if (PatchProxy.applyVoid(null, this, SegmentTimelineFragment.class, "4")) {
          return;
       }
       this.H = new k();
       if (PostExperimentUtils.U()) {
          this.H.U7(new a());
          this.H.U7(new e0());
       }
       this.H.f(this.q);
       Object[] objArray = new Object[]{this.G,this.hh()};
       this.H.i(objArray);
       f.n(this.t).setDisableAERender(1);
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SegmentTimelineFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(SegmentTimelineFragment.class, null);
       return objectsByTag;
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, SegmentTimelineFragment.class, "5")) {
          return;
       }
       f.n(this.t).setDisableAERender(false);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SegmentTimelineFragment.class, "1");
       if (p2 != patchProxyRe) {
          return p2;
       }
       p2 = PatchProxy.apply(null, this, SegmentTimelineFragment.class, "2");
       if (p2 != patchProxyRe) {
          i = p2.intValue();
       }else if(PostExperimentUtils.U()){
          i = 0x7f0d050e;
       }else {
          i = 0x7f0d050d;
       }
       View view = a.g(p0, i, p1, false);
       this.q = view;
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, SegmentTimelineFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       Object[] objArray = new Object[0];
       a.D().s("SegmentTimelineFragment", "onDestroyView", objArray);
       this.gh();
       SegmentTimelineFragment tH = this.H;
       if (tH != null) {
          tH.destroy();
          this.H = null;
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SegmentTimelineFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       SegmentTimelineFragment tG = this.G;
       tG.b = this;
       tG.d = this.getString(0x7f1045fd);
       this.fh();
       return;
    }
}
