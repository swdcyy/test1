package cnd.a$a;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter$c;
import cnd.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import zmd.a;
import com.yxcorp.gifshow.v3.framework.player.UpdatePlayerStateAction;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;
import xvc.b;
import xld.a;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcrop.gifshow.v3.editor.text_v3.action.TextPanelOpenActionV3;
import wnd.j;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleItemClickAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import kotlin.jvm.internal.a;
import mod.a;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleItemTimeClickAction;
import com.kwai.robust.PatchProxyResult;
import gnd.b;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitlePanelFragment;
import java.util.Objects;
import qrd.p;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.timeline.SubtitleTimelineFragment;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment;
import vmd.c;
import k2b.e0;
import java.lang.RuntimeException;

public final class a$a implements SubtitleTextAdapter$c	// class@00033f
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (!this.a.c.o0().E()) {
          return;
       }
       if (this.a.c.o0().z() == p0) {
          this.a.c.t0(new UpdatePlayerStateAction(false, UpdateTo.PLAYER));
          if (PostExperimentUtils.G((this.a.c.o0().u() ^ 0x01))) {
             a c = this.a.c;
             c.t0(new TextPanelOpenActionV3(c.o0().o()));
          }else {
             j.a.c(this.a.D(), this.a.e.getSelectDrawer());
          }
          return;
       }else {
          this.a.c.t0(new SubtitleItemClickAction(p0));
          return;
       }
    }
    public void b(int p0,NewTextBaseElementData p1){
       c a;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       a.p(p1, "textElementData");
       a uoa1 = this.a.c.o0();
       if (!uoa1.E() || uoa1.C().f()) {
          return;
       }
       this.a.c.t0(new SubtitleItemTimeClickAction(p1));
       Fragment uFragment = this.a.D();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = null;
       if (!PatchProxy.applyVoidOneRefs(uFragment, obj, uob, "4")) {
          String str = "childFragment";
          a.p(uFragment, str);
          Fragment uFragment2 = PatchProxy.applyOneRefs(uFragment, obj, uob, "3");
          if (uFragment2 != patchProxyRe) {
          }else {
             a.p(uFragment, str);
             while (true) {
                if (uFragment == null) {
                   throw new RuntimeException("subtitle panel fragment failed");
                }
                if (uFragment instanceof SubtitlePanelFragment) {
                   uFragment2 = uFragment;
                }else {
                   uFragment = uFragment.getParentFragment();
                }
             }
          }
          Objects.requireNonNull(uFragment2);
          if (!PatchProxy.applyVoid(obj, uFragment2, SubtitlePanelFragment.class, "11")) {
             SubtitleTimelineFragment subtitleTime = PatchProxy.apply(obj, uFragment2, SubtitlePanelFragment.class, "3");
             if (subtitleTime == patchProxyRe) {
                subtitleTime = uFragment2.J.getValue();
             }
             subtitleTime.show();
          }
       }
       a = c.a;
       Fragment uFragment1 = this.a.D();
       Objects.requireNonNull(uFragment1, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(uFragment1, a, c.class, "5")) {
          a.p(uFragment1, "iLogPage");
          a.b(uFragment1, "LIST_SUBTITLE_DURATION");
       }
       return;
    }
    public void c(int p0,NewTextBaseElementData p1){
       a c;
       c a;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "3")) {
          return;
       }
       a.p(p1, "textElementData");
       if (!this.a.c.o0().E()) {
          return;
       }
       this.a.c.t0(new UpdatePlayerStateAction(false, UpdateTo.PLAYER));
       if (PostExperimentUtils.G((this.a.c.o0().u() ^ 0x01))) {
          c = this.a.c;
          c.t0(new TextPanelOpenActionV3(c.o0().o()));
       }else {
          j.a.c(this.a.D(), this.a.e.getSelectDrawer());
       }
       a = c.a;
       Fragment uFragment = this.a.D();
       Objects.requireNonNull(uFragment, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(uFragment, a, c.class, "6")) {
          a.p(uFragment, "iLogPage");
          a.b(uFragment, "LIST_SUBTITLE_TEXT");
       }
       return;
    }
}
