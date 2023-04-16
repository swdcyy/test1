package com.yxcorp.gifshow.v3.editor.segment.SegmentDraftPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.editor.segment.SegmentDraftPresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Workspace;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.util.Iterator;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.Workspace$Source;
import maa.a;
import com.yxcorp.gifshow.v3.editor.segment.model.VideoSegmentsModel;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.v3.f;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Set;
import h69.j;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.i;
import qr4.m$k0;
import lnc.i1;
import qr4.m$b;
import w69.s0;
import kotlin.jvm.internal.a;
import qaa.a;
import eba.a;
import hba.a;
import raa.a;
import jba.a;
import im8.f;
import com.yxcorp.gifshow.v3.editor.segment.SegmentEditorFragment;

public class SegmentDraftPresenter extends PresenterV2	// class@0011c0
{
    public f A;
    public f B;
    public SegmentEditorFragment C;
    public boolean D;
    public y E;
    public VideoSegmentsModel p;
    public c q;
    public a r;
    public Set s;
    public i t;
    public a u;
    public a v;
    public a w;
    public a x;
    public a y;
    public f z;

    public void SegmentDraftPresenter(){
       super();
       this.E = new SegmentDraftPresenter$a(this);
    }
    public void E8(){
       SegmentDraftPresenter segmentDraft = SegmentDraftPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, segmentDraft, "6")) {
          return;
       }
       if (!this.r.D()) {
          this.r.c0();
       }
       if (!this.u.D()) {
          this.u.c0();
       }
       if (!this.x.D()) {
          this.x.c0();
       }
       if (this.q.v() != null) {
          this.D = this.q.v().getIsAssetEditedByUser();
       }
       if (!PatchProxy.applyVoid(objArray, this, segmentDraft, "8")) {
          List list = this.r.z();
          c uoc = this.t.f().N();
          Iterator iterator = list.iterator();
          boolean b = false;
          while (iterator.hasNext()) {
             Asset uAsset = iterator.next();
             SegmentDraftPresenter tp = this.p;
             SegmentDraftPresenter tr = this.r;
             if (uoc.T0() != Workspace$Source.ANNUAL_ALBUM_MOVIE) {
                b = true;
             }
             tp.addSingleSegmentInfo(tr, uAsset, b);
          }
          double displayDurat = EditorSdk2UtilsV2.getDisplayDuration(f.p(this.t));
          this.p.setVideoDuration(displayDurat);
          this.p.notifyChanged();
          this.P8();
          StringBuilder str = "initSegmentData computedDuration:"+displayDurat;
          objArray = new Object[b];
          a.D().w("SegmentDraftPresenter", str+", trackAssetSize:"+list.size(), objArray);
       }
       this.s.add(this.E);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, SegmentDraftPresenter.class, "7")) {
          return;
       }
       this.s.remove(this.E);
       return;
    }
    public void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SegmentDraftPresenter.class, "2")) {
          return;
       }
       if (j.i(this.q.v())) {
          m$k0 r = this.q.d1().F().b.R;
          if (r == null) {
             i1.a("SegmentDraftPresenter", "videoInfo.annualIntelligenceAlbum is null");
             return;
          }else {
             this.p.initAddDeleteCount(r.e, r.b);
             VideoContext videoContext = this.q.d1();
             if (!PatchProxy.applyVoidOneRefs(videoContext, objArray, s0.class, "1")) {
                a.p(videoContext, "videoContext");
                i b = videoContext.F().b;
                if (b != null) {
                   r = b.R;
                   if (r != null) {
                      s0.a = r.f;
                      s0.b = r.g;
                      s0.c = r.h;
                      s0.d = r.i;
                      s0.e = r.j;
                   }
                }
             }
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SegmentDraftPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("segment_video_model");
       this.q = this.r8("WORKSPACE");
       this.r = this.r8("ASSET");
       this.s = this.r8("EDITOR_VIEW_LISTENERS");
       this.t = this.r8("EDITOR_HELPER_CONTRACT");
       this.u = this.r8("COVER");
       this.v = this.r8("STICKER");
       this.w = this.r8("TEXT");
       this.x = this.r8("AE_MAGIC_EFFECT");
       this.y = this.r8("TTS");
       this.z = this.x8("SEGMENT_IS_CHANGED");
       this.A = this.x8("SEGMENT_ROTATE_CHANGED");
       this.C = this.r8("FRAGMENT");
       this.B = this.x8("segment_from_edit_page");
       return;
    }
}
