package com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.vb.c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.vb.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import yoc.m;
import k2b.s;
import java.util.Objects;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.action.ReorderOpenAlbumAction;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.vb.a;
import msd.l;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public class c extends m	// class@000e0f
{
    public final b c;

    public void c(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "VideoReorderPanelViewBinder";
       a.D().w(str, "click add button", objArray);
       objArray = null;
       if (!PatchProxy.applyVoid(objArray, objArray, m.class, "6")) {
          s.h("VIDEO_SORT_ADD");
       }
       c tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(objArray, tc, b.class, "9")) {
          Object[] objArray1 = new Object[i];
          a.D().w(str, "doAdd", objArray1);
          tc.q.t0(new ReorderOpenAlbumAction((float)(b.C - (long)(tc.s.getDisplayDuration() * 0x408f400000000000)), new a(tc)));
       }
       return;
    }
}
