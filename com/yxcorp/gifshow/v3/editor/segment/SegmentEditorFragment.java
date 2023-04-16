package com.yxcorp.gifshow.v3.editor.segment.SegmentEditorFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.editor.segment.SegmentEditorFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import etc.l;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$d;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import java.lang.Number;
import i2b.a;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import androidx.fragment.app.Fragment;

public class SegmentEditorFragment extends BaseEditorFragment	// class@0011c2
{
    public final SegmentEditorFragment$a G;
    public l H;

    public void SegmentEditorFragment(){
       super();
       this.G = new SegmentEditorFragment$a(this);
    }
    public void fh(){
       if (PatchProxy.applyVoid(null, this, SegmentEditorFragment.class, "4")) {
          return;
       }
       boolean b = PostExperimentUtils.U();
       l ol = new l(b, (b ^ 0x01));
       this.H = ol;
       ol.f(this.q);
       Object[] objArray = new Object[]{this.G,this.hh()};
       this.H.i(objArray);
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SegmentEditorFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(SegmentEditorFragment.class, null);
       return objectsByTag;
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, SegmentEditorFragment.class, "5")) {
          return;
       }
       SegmentEditorFragment tH = this.H;
       if (tH != null) {
          tH.destroy();
          this.H = null;
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SegmentEditorFragment.class, "1");
       if (p2 != patchProxyRe) {
          return p2;
       }
       p2 = PatchProxy.apply(null, this, SegmentEditorFragment.class, "2");
       if (p2 != patchProxyRe) {
          i = p2.intValue();
       }else if(PostExperimentUtils.U()){
          i = 0x7f0d04c1;
       }else {
          i = 0x7f0d04c0;
       }
       View view = a.g(p0, i, p1, false);
       this.q = view;
       return view;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SegmentEditorFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       SegmentEditorFragment tG = this.G;
       tG.c = this;
       tG.e = this.getString(0x7f100c90);
       if (PostExperimentUtils.U()) {
          tG.e = this.getString(0x7f100c55);
       }
       this.fh();
       return;
    }
}
