package com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateViewBinder$d;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateViewBinder;
import java.lang.Object;
import cca.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import kotlin.jvm.internal.a;
import faa.a;
import q87.c;
import lnc.a1;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;
import java.util.Map;
import com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener;
import t36.f;
import com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener$CHANGE_TYPE;
import com.yxcorp.gifshow.v3.f;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import androidx.fragment.app.DialogFragment;
import java.lang.CharSequence;
import dca.p;
import android.view.View$OnClickListener;
import android.view.View;
import ei0.a;
import dca.q;
import java.lang.Runnable;
import zba.a;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.yxcorp.gifshow.bubble.b;
import com.yxcorp.gifshow.v3.bubble.EditBubbleItem;
import ra9.c;
import dca.r;
import com.yxcorp.gifshow.bubble.b$c;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;

public final class VideoTemplateViewBinder$d implements Observer	// class@001b95
{
    public final VideoTemplateViewBinder b;

    public void VideoTemplateViewBinder$d(VideoTemplateViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       Object[] objArray;
       VideoTemplateViewBinder videoTemplat = VideoTemplateViewBinder.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoTemplateViewBinder$d.class, str)) {
       }else {
          b uob = this.b.l.u0();
          int i = 0;
          if (a.g(uob.h(), p0.h()) ^ 0x01) {
             objArray = new Object[i];
             a.D().w("VideoTemplateViewBinder", "performAction: notifyFrameChange", objArray);
             int i1 = (p0.b != null)? a1.d(R.dimen.arg_RES_7f070387): 0;
             EditorDelegate uEditorDeleg = this.b.m.f();
             a.o(uEditorDeleg, "editorHelperContract.editorDelegate");
             f.J(f.p0(uEditorDeleg.u(), VideoFrameChangeListener.class), VideoFrameChangeListener$CHANGE_TYPE.AI_CUT, p0.h(), i1);
          }
          if (p0.i() != uob.i()) {
             if (p0.i()) {
                VideoTemplateViewBinder$d tb = this.b;
                Objects.requireNonNull(tb);
                objArray = null;
                if (!PatchProxy.applyVoid(objArray, tb, videoTemplat, "11")) {
                   if (tb.h == null) {
                      AttrAnimProgressFragment uAttrAnimPro = PatchProxy.apply(objArray, tb, videoTemplat, str);
                      if (uAttrAnimPro != PatchProxyResult.class) {
                      }else {
                         uAttrAnimPro = new AttrAnimProgressFragment();
                         uAttrAnimPro.setCancelable(i);
                         uAttrAnimPro.sh(a1.p(R.string.cancel));
                         uAttrAnimPro.th(new p(tb));
                      }
                      tb.h = uAttrAnimPro;
                   }
                   tb.A().postDelayed(new q(tb), 260);
                }
             }else {
                this.b.H();
             }
          }
          VideoTemplateViewBinder$d tb1 = this.b;
          a.o(p0, "newState");
          Objects.requireNonNull(tb1);
          if (!PatchProxy.applyVoidOneRefs(p0, tb1, videoTemplat, "9") && p0.m == a.b.a()) {
             p0.m = i;
             b uob1 = new b(EditBubbleItem.AI_CUT_ORIGIN);
             uob1.b(tb1.A().findViewById(R.id.origin_theme));
             uob1.l(r.a);
             PostBubbleManager.d(tb1.k).n(uob1);
          }
          if (p0.c() != uob.c()) {
             p0 = this.b.m.j();
             if (p0 != null) {
                p0.seekToStart();
             }
          }
       }
       return;
    }
}
