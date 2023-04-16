package com.yxcorp.gifshow.v3.previewer.ktv.KtvMvEditPreviewFragment$a;
import voc.v;
import com.yxcorp.gifshow.v3.previewer.ktv.KtvMvEditPreviewFragment;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.previewer.ktv.KtvBaseEditPreviewFragment;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import android.content.Intent;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import ekd.j0;
import voc.u;

public class KtvMvEditPreviewFragment$a implements v	// class@0015ab
{
    public final EditorItemFunc a;
    public final KtvMvEditPreviewFragment b;

    public void KtvMvEditPreviewFragment$a(KtvMvEditPreviewFragment p0,EditorItemFunc p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean G0(){
       KtvMvEditPreviewFragment$a obj = PatchProxy.apply(null, this, KtvMvEditPreviewFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       KtvBaseEditPreviewFragment q1 = obj.Q1;
       boolean b = false;
       if (q1.mChorusMode == 2 && (q1.mSameFrameAvailableLayoutInMode == null && (j0.a(obj.Qh(), "same_frame_layout_in_mode", b) || this.a != EditorItemFunc.KTV_LYRIC))) {
          b = true;
       }
       return b;
    }
    public boolean a(){
       return u.c(this);
    }
    public String b(){
       return u.a(this);
    }
}
