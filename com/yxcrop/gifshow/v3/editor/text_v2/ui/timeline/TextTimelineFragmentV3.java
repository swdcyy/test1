package com.yxcrop.gifshow.v3.editor.text_v2.ui.timeline.TextTimelineFragmentV3;
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
import tnd.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.util.List;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.timeline.TextTimelineViewBinderV3;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import yld.d;
import msd.a;

public final class TextTimelineFragmentV3 extends DecorationTimelineFragment	// class@000b59
{
    public final boolean w;
    public HashMap x;

    public void TextTimelineFragmentV3(boolean p0){
       super();
       this.w = p0;
    }
    public void eh(){
       if (PatchProxy.applyVoid(null, this, TextTimelineFragmentV3.class, "4")) {
          return;
       }
       TextTimelineFragmentV3 tx = this.x;
       if (tx != null) {
          tx.clear();
       }
       return;
    }
    public int hh(){
       return 0x7f0d15e9;
    }
    public c lh(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextTimelineFragmentV3.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "fragment");
       return b.c(p0, this.w);
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       TextTimelineViewBinderV3 obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, TextTimelineFragmentV3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "inflater");
       obj = new TextTimelineViewBinderV3(this, this.kh(), this.u1(), this.fh(), this.w);
       this.jh().add(p2);
       d uod = new d(this.kh(), this, this.u1(), this.gh(), false);
       this.jh().add(p2);
       return super.onCreateView(p0, p1, p2);
    }
    public void onDestroyView(){
       super.onDestroyView();
       this.eh();
    }
}
