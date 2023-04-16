package com.yxcorp.gifshow.v3.editor.segment.SegmentDraftPresenter$a;
import voc.y;
import com.yxcorp.gifshow.v3.editor.segment.SegmentDraftPresenter;
import java.lang.Object;
import voc.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Workspace$b;
import ooc.g1;
import java.lang.Boolean;
import im8.f;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.v3.editor.k;
import lwc.h;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import xvc.b;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.v3.f;
import qaa.a;
import wba.m;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import java.util.Objects;
import java.util.Map;
import nwc.c;
import t36.f;
import com.yxcorp.gifshow.v3.editor.segment.u;
import t36.f$a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import voc.o;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.i;
import qr4.m$k0;
import w46.b;
import com.yxcorp.gifshow.v3.editor.segment.SegmentDraftPresenter$LocalIntelligenceAlbumNPE;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.Asset$Type;
import qr4.m$r;
import tkd.b;
import tkd.d;
import uxb.i;
import wyb.a;
import uxb.l;
import maa.a;
import com.yxcorp.gifshow.v3.editor.segment.model.VideoSegmentsModel;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kuaishou.edit.draft.Workspace;
import h69.j;
import lnc.i1;
import qr4.m$b;
import w69.s0;
import kotlin.jvm.internal.a;

public class SegmentDraftPresenter$a implements y	// class@0011bf
{
    public final SegmentDraftPresenter b;

    public void SegmentDraftPresenter$a(SegmentDraftPresenter p0){
       this.b = p0;
       super();
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
       if (PatchProxy.applyVoid(null, this, SegmentDraftPresenter$a.class, "2")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("SegmentDraftPresenter", "discardEditChanges", objArray);
       this.b.t.c(i);
       if (this.b.r.D()) {
          this.b.r.j();
       }
       if (this.b.u.D()) {
          this.b.u.j();
       }
       if (this.b.x.D()) {
          this.b.x.j();
       }
       if (this.b.q.v() != null) {
          this.b.q.n(i).m(this.b.D);
       }
       g1.r("click_edit_photo_segment_close");
       Boolean fALSE = Boolean.FALSE;
       this.b.z.set(fALSE);
       this.b.A.set(fALSE);
       this.b.B.set(Boolean.TRUE);
       if (this.b.t.k() != null) {
          k.f().k(this.b.t.k());
       }
       this.b.P8();
       this.b.t.l().t0(new EditSdkAction());
       return;
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       SegmentDraftPresenter$a tb1;
       m$k0 l;
       int i1;
       SegmentDraftPresenter segmentDraft = SegmentDraftPresenter.class;
       if (PatchProxy.applyVoid(null, this, SegmentDraftPresenter$a.class, "1")) {
          return;
       }
       boolean b = true;
       this.b.t.c(b);
       g1.r("click_edit_photo_segment_finish");
       String str = "SegmentDraftPresenter";
       if (this.b.z.get().booleanValue() || this.b.A.get().booleanValue()) {
          EditorSdk2V2$VideoEditorProject videoProject = f.q(this.b.t).getVideoProject();
          SegmentDraftPresenter$a tb = this.b;
          m.a(tb.u, tb.z.get().booleanValue(), false);
          tb = this.b;
          EditorDelegate uEditorDeleg = tb.C.kh();
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(uEditorDeleg, tb, segmentDraft, "4") && uEditorDeleg != null) {
             f.p0(uEditorDeleg.u(), c.class).s0(u.a);
          }
          tb = this.b;
          SegmentDraftPresenter r = tb.r;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(r, tb, segmentDraft, "5") && tb.q.a1() == Workspace$Type.ALBUM_MOVIE) {
             l = tb.t.f().x().e().F().b.L;
             if (l == null) {
                Object[] objArray1 = new Object[false];
                a.D().t(str, "updatePhotoMeta localIntelligenceAlbum is null", objArray1);
                ExceptionHandler.handleCaughtException(new SegmentDraftPresenter$LocalIntelligenceAlbumNPE(tb, null));
             }else {
                Iterator iterator = r.z().iterator();
                int i = 0;
                i1 = 0;
                while (iterator.hasNext()) {
                   Asset uAsset = iterator.next();
                   if (uAsset.getType() == Asset$Type.PICTURE) {
                      i = i + 1;
                   }else if(uAsset.getType() == Asset$Type.VIDEO){
                      i1 = i1 + 1;
                   }
                }
                l.c = i;
                l.d = i1;
             }
          }
          d.a(-2050057825).kq();
          k.f().k(videoProject);
          Object[] objArray = new Object[false];
          a.D().w(str, "saveEditorChanges timeline changed", objArray);
          l.g().K0(this.b.t.f(), l.g().x5(f.q(this.b.t).getVideoLength()));
          tb1 = this.b;
          tb1.p.refreshTrackAsset(tb1.r);
          if (DraftUtils.i0(this.b.q) && (this.b.z.get().booleanValue() && this.b.q.v() != null)) {
             this.b.q.n(false).m(b);
          }
       }
    label_0174 :
       this.b.r.f();
       this.b.u.f();
       this.b.x.f();
       Boolean fALSE = Boolean.FALSE;
       this.b.z.set(fALSE);
       this.b.A.set(fALSE);
       this.b.B.set(Boolean.TRUE);
       tb1 = this.b;
       Objects.requireNonNull(tb1);
       if (!PatchProxy.applyVoid(null, tb1, segmentDraft, "3") && j.i(tb1.q.v())) {
          m$k0 r1 = tb1.q.d1().F().b.R;
          if (r1 == null) {
             i1.a(str, "videoInfo.annualIntelligenceAlbum is null");
          }else {
             r1.b = tb1.p.getDeleteCount();
             r1.e = tb1.p.getAddCount();
             VideoContext videoContext = tb1.q.d1();
             if (!PatchProxy.applyVoidOneRefs(videoContext, null, s0.class, "3")) {
                a.p(videoContext, "videoContext");
                i b1 = videoContext.F().b;
                if (b1 != null) {
                   r1 = b1.R;
                   if (r1 != null) {
                      r1.f = s0.a;
                      r1.g = s0.b;
                      r1.h = s0.c;
                      r1.i = s0.d;
                      r1.j = s0.e;
                   }
                }
             }
          }
       }
       this.b.t.l().t0(new EditSdkAction());
       return;
    }
    public void z2(){
       x.c(this);
    }
}
