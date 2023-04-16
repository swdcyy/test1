package com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.vb.SubtitlePanelOperatorVB;
import and.a;
import voc.y;
import ei0.a;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import hnd.f;
import gnd.b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.vb.SubtitlePanelOperatorVB$1;
import android.view.View$OnClickListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleAttachAction;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import zmd.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import java.lang.Integer;
import xvc.b;
import voc.x;
import xld.a;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleDetachActionV3;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleDetachAction;
import wnd.b;

public final class SubtitlePanelOperatorVB extends a implements a, y	// class@000afc
{
    public final f c;
    public final View d;
    public final EditDecorationContainerViewV2 e;
    public final Fragment f;

    public void SubtitlePanelOperatorVB(Fragment p0,View p1,Fragment p2){
       a.p(p0, "fragment");
       a.p(p1, "rootView");
       a.p(p2, "previewFragment");
       super(p1);
       this.f = p0;
       this.c = b.a(p0);
       View view = p1.findViewById(R.id.subtitle_clear);
       a.o(view, "rootView.findViewById\(R.id.subtitle_clear\)");
       this.d = view;
       p1 = p2.requireView().findViewById(R.id.new_text_decoration_editor_view);
       a.o(p1, "previewFragment.requireV¡­t_decoration_editor_view\)");
       this.e = p1;
       view.setOnClickListener(new SubtitlePanelOperatorVB$1(this));
    }
    public void B(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SubtitlePanelOperatorVB.class, "1")) {
          return;
       }
       SubtitlePanelOperatorVB tc = this.c;
       DraftTextStyleInfo uDraftTextSt = tc.o0().D();
       String str = (uDraftTextSt != null)? uDraftTextSt.j(): objArray;
       DraftTextStyleInfo uDraftTextSt1 = this.c.o0().D();
       String str1 = (uDraftTextSt1 != null)? uDraftTextSt1.f(): objArray;
       DraftTextStyleInfo uDraftTextSt2 = this.c.o0().D();
       Integer integer = (uDraftTextSt2 != null)? Integer.valueOf(uDraftTextSt2.d()): objArray;
       DraftTextStyleInfo uDraftTextSt3 = this.c.o0().D();
       if (uDraftTextSt3 != null) {
          objArray = Integer.valueOf(uDraftTextSt3.c());
       }
       tc.t0(new SubtitleAttachAction(str, str1, integer, objArray));
       return;
    }
    public final Fragment D(){
       return this.f;
    }
    public void Md(){
       x.g(this);
    }
    public void N0(){
       x.f(this);
    }
    public void O(){
       x.e(this);
    }
    public void O7(a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SubtitlePanelOperatorVB.class, "4")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       return;
    }
    public void c2(){
       x.d(this);
    }
    public void o4(){
       x.h(this);
    }
    public void onRestart(){
       x.i(this);
    }
    public void rd(){
       if (PatchProxy.applyVoid(null, this, SubtitlePanelOperatorVB.class, "3")) {
          return;
       }
       x.a(this);
       if (PostExperimentUtils.G((this.c.o0().u() ^ 0x01))) {
          this.c.t0(new SubtitleDetachActionV3(false));
       }else {
          this.c.t0(new SubtitleDetachAction(false));
       }
       return;
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       if (PatchProxy.applyVoid(null, this, SubtitlePanelOperatorVB.class, "2")) {
          return;
       }
       x.j(this);
       b.d(this.e, this.c, true, true);
       if (PostExperimentUtils.G((this.c.o0().u() ^ true))) {
          this.c.t0(new SubtitleDetachActionV3(true));
       }else {
          this.c.t0(new SubtitleDetachAction(true));
       }
       return;
    }
    public void z2(){
       x.c(this);
    }
}
