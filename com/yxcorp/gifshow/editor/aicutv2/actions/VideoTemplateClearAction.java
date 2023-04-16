package com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateClearAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import h69.j;
import tkd.b;
import tkd.d;
import h69.b;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.edit.draft.Workspace$Type;
import vaa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import fba.a;
import taa.a;
import yaa.c;
import yaa.a;
import xoc.c;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import wba.u;
import com.kuaishou.edit.draft.Music$b;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.MusicDraftUtilsKt;

public final class VideoTemplateClearAction extends EditSdkAction	// class@001b7c
{

    public void VideoTemplateClearAction(){
       super();
    }
    public void performAction(c p0,c p1){
       a uoa;
       c a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoTemplateClearAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       boolean b = false;
       Music music = d.a(-873393519).X40(j.d(p0, b));
       if (p0.a1() == Workspace$Type.PHOTO_MOVIE) {
          uoa = p0.F0();
          if (uoa != null) {
             uoa.d();
          }
          uoa = p0.n0();
          if (uoa != null) {
             uoa.d();
          }
          uoa = p0.P0();
          if (uoa != null) {
             uoa.d();
          }
          uoa = p0.J0();
          if (uoa != null) {
             uoa = uoa.f0();
             if (uoa != null) {
                uoa.d();
             }
          }
          this.saveTransPoints(p0, music);
          return;
       }else {
          a = c.a;
          VideoTemplate videoTemplat = a.b(p0);
          if (a.g(videoTemplat.getId(), "-1")) {
             a.c(p0, videoTemplat, b);
             b = p0.J0();
             if (b != null) {
                uoa = b.f0();
                if (uoa != null) {
                   uoa.d();
                }
             }
             this.saveTransPoints(p0, music);
          }
          return;
       }
    }
    public final void saveTransPoints(c p0,Music p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoTemplateClearAction.class, "2")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       c uoc = p0.J0();
       if (uoc != null) {
          a.o(uoc, "workspaceDraft.musicDraft ?: return");
          Music$b uob = u.a.b(uoc);
          if (uob != null) {
             MusicDraftUtilsKt.v(p1, uob, p0);
          }
       }
       return;
    }
}
