package com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplatePanelDetachAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.v3.editor.i;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import yaa.c;
import lba.a;
import qaa.a;
import maa.a;
import vaa.a;
import oaa.a;
import naa.a;
import xaa.a;
import raa.i;
import raa.g;
import raa.c;
import raa.a;
import cba.a;
import kba.a;
import taa.a;
import raa.e;
import lnc.g7;
import com.kuaishou.edit.draft.Workspace$Type;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Workspace$b;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Kuaishan;
import com.kuaishou.edit.draft.AICutTheme;
import com.kuaishou.edit.draft.FeatureId;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import k36.c;
import h36.a;
import k36.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Music;
import xvc.c;
import com.yxcorp.gifshow.v3.vm.MusicIconViewModel;
import xoc.b;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import tkd.b;
import tkd.d;
import h69.b;
import java.lang.System;
import java.util.Objects;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import i69.f;
import h69.j;
import com.kuaishou.android.model.music.Music;
import androidx.lifecycle.ViewModel;
import java.lang.Integer;
import androidx.lifecycle.MutableLiveData;
import xoc.c;
import voc.o;
import com.yxcorp.gifshow.widget.adv.model.f;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.k;
import com.yxcorp.gifshow.aicut.api.AICutMusicInfo;
import android.content.Intent;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public final class VideoTemplatePanelDetachAction extends EditSdkAction	// class@001b8c
{
    public final i editorHelper;
    public final String originTemplateId;
    public final boolean saveChanges;
    public final long startTime;

    public void VideoTemplatePanelDetachAction(i p0,long p1,boolean p2,String p3){
       a.p(p0, "editorHelper");
       a.p(p3, "originTemplateId");
       super();
       this.editorHelper = p0;
       this.startTime = p1;
       this.saveChanges = p2;
       this.originTemplateId = p3;
    }
    public void VideoTemplatePanelDetachAction(i p0,long p1,boolean p2,String p3,int p4,u p5){
       if (p4 & 0x08) {
          p3 = "-1";
       }
       super(p0, p1, p2, p3);
       return;
    }
    public final void discardDraft(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoTemplatePanelDetachAction.class, "2")) {
          return;
       }
       a uoa = p0.n0();
       if (uoa != null) {
          uoa.j();
       }
       c uoc = p0.J0();
       if (uoc != null) {
          uoc.j();
       }
       uoa = p0.g1();
       if (uoa != null) {
          uoa.j();
       }
       uoa = p0.s0();
       if (uoa != null) {
          uoa.j();
       }
       uoa = p0.o0();
       if (uoa != null) {
          uoa.j();
       }
       uoa = p0.F0();
       if (uoa != null) {
          uoa.j();
       }
       uoa = p0.v0();
       if (uoa != null) {
          uoa.j();
       }
       uoa = p0.u0();
       if (uoa != null) {
          uoa.j();
       }
       uoa = p0.w0();
       if (uoa != null) {
          uoa.j();
       }
       i oi = p0.f1();
       if (oi != null) {
          oi.j();
       }
       g og = p0.Y0();
       if (og != null) {
          og.j();
       }
       uoc = p0.z0();
       if (uoc != null) {
          uoc.j();
       }
       uoa = p0.m0();
       if (uoa != null) {
          uoa.j();
       }
       uoa = p0.R0();
       if (uoa != null) {
          uoa.j();
       }
       uoa = p0.c1();
       if (uoa != null) {
          uoa.j();
       }
       uoa = p0.P0();
       if (uoa != null) {
          uoa.j();
       }
       e uoe = p0.C0();
       if (uoe != null) {
          uoe.j();
       }
       this.discardWorkspaceType(p0);
       return;
    }
    public final void discardWorkspaceType(c p0){
       GeneratedMessageLite$Builder uBuilder;
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoTemplatePanelDetachAction.class, "3")) {
          return;
       }
       boolean b = g7.a(p0);
       String str = "ensureFirstBuilder\(\)";
       if (b) {
          Workspace$Type pHOTO_MOVIE = Workspace$Type.PHOTO_MOVIE;
          if (p0.a1() == pHOTO_MOVIE) {
             uBuilder = p0.k();
             a.o(uBuilder, str);
             uBuilder.t(pHOTO_MOVIE);
          }else {
          label_0029 :
             a uoa = p0.F0();
             String str1 = null;
             Kuaishan kuaishan = (uoa != null)? uoa.v(): str1;
             if (kuaishan != null) {
                uBuilder = p0.k();
                a.o(uBuilder, str);
                uBuilder.t(Workspace$Type.KUAISHAN);
             }else {
                uoa = p0.n0();
                AICutTheme uAICutTheme = (uoa != null)? uoa.v(): str1;
                if (uAICutTheme != null) {
                   uoa = p0.n0();
                   if (uoa != null) {
                      uAICutTheme = uoa.v();
                      if (uAICutTheme != null) {
                         FeatureId featureId = uAICutTheme.getFeatureId();
                         if (featureId != null) {
                            str1 = featureId.getExternal();
                         }
                      }
                   }
                   if (a.g(str1, "-1") || a.g(str1, "")) {
                      if (p0.b1() != Workspace$Type.UNKNOWN) {
                         uBuilder = p0.k();
                         a.o(uBuilder, str);
                         uBuilder.t(p0.b1());
                      }
                   }else {
                      pHOTO_MOVIE = Workspace$Type.ALBUM_MOVIE;
                      if (p0.b1() == pHOTO_MOVIE) {
                         uBuilder = p0.k();
                         a.o(uBuilder, str);
                         uBuilder.t(pHOTO_MOVIE);
                      }else if(b){
                         Workspace$Type pHOTO_MOVIE1 = Workspace$Type.PHOTO_MOVIE;
                         if (p0.b1() == pHOTO_MOVIE1) {
                            uBuilder = p0.k();
                            a.o(uBuilder, str);
                            uBuilder.t(pHOTO_MOVIE1);
                         }
                      }
                      uBuilder = p0.k();
                      a.o(uBuilder, str);
                      uBuilder.t(Workspace$Type.AI_CUT);
                   }
                }else if(p0.b1() != Workspace$Type.UNKNOWN){
                   uBuilder = p0.k();
                   a.o(uBuilder, str);
                   uBuilder.t(p0.b1());
                }
             }
          }
       }else {
          goto label_0029 ;
       }
       Object[] objArray = new Object[0];
       a.D().w("VideoTemplatePanelDtcAct", "backWorkspaceType:"+p0.a1(), objArray);
       return;
    }
    public final String getOriginTemplateId(){
       return this.originTemplateId;
    }
    public final boolean getSaveChanges(){
       return this.saveChanges;
    }
    public final long getStartTime(){
       return this.startTime;
    }
    public final void handleFlyWheelEvent(c p0){
       String external;
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoTemplatePanelDetachAction.class, "7")) {
          return;
       }
       a uoa = p0.n0();
       if (uoa != null) {
          AICutTheme uAICutTheme = uoa.v();
          if (uAICutTheme != null) {
             FeatureId featureId = uAICutTheme.getFeatureId();
             if (featureId != null) {
                external = featureId.getExternal();
                if (external != null) {
                label_0028 :
                   if (uoa != null && (p0.a1() == Workspace$Type.AI_CUT && (a.g(external, "-1") ^ 0x01))) {
                      AICutTheme uAICutTheme1 = uoa.v();
                      String name = (uAICutTheme1 != null)? uAICutTheme1.getName(): null;
                      c.d().g(new a(null, external, name));
                   }else {
                      c.d().g(new a());
                   }
                   return;
                }
             }
          }
       }
       external = "";
       goto label_0028 ;
    }
    public final boolean musicChanged(c p0){
       String external;
       String obj = PatchProxy.applyOneRefs(p0, this, VideoTemplatePanelDetachAction.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.K0();
       p0 = p0.J0();
       if (p0 != null) {
          Music music = p0.t();
          if (music != null) {
             FeatureId featureId = music.getFeatureId();
             if (featureId != null) {
                external = featureId.getExternal();
             label_0031 :
                return (a.g(obj, external) ^ 0x01);
             }
          }
       }
       external = null;
       goto label_0031 ;
    }
    public void performAction(c p0,c p1){
       boolean b;
       b a;
       Music music;
       MusicIconViewModel musicIconVie = MusicIconViewModel.class;
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoTemplatePanelDetachAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       VideoTemplatePanelDetachAction videoTemplat = null;
       String str = 6;
       String str1 = "time_duration";
       int i = 0;
       if (this.saveChanges != null) {
          b = this.musicChanged(p0);
          this.editorHelper.c(true);
          this.saveDraft(p0);
          b uob1 = d.a(-873393519);
          uob1.jv(p0);
          a = b.a;
          long l = System.currentTimeMillis() - this.startTime;
          Objects.requireNonNull(a);
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), a, uob, "3")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CONFIRM_EDIT_CUT_STYLE";
             JsonObject jsonObject = new JsonObject();
             jsonObject.a0(str1, Long.valueOf(l));
             uElementPack.params = jsonObject.toString();
             u1.u(str, uElementPack, videoTemplat);
          }
          this.editorHelper.f().w();
          f project = uob1.getProject();
          a.m(project);
          this.setShareActivityParam(project, this.editorHelper);
          if (b) {
             Object[] objArray = new Object[i];
             a.D().w("VideoTemplatePanelDtcAct", "musicChanged update icon status", objArray);
             music = uob1.X40(j.d(p0, true));
             MusicIconViewModel musicIconVie1 = this.editorHelper.f().s(musicIconVie);
             Objects.requireNonNull(musicIconVie1);
             int i1 = 3;
             if (!PatchProxy.isSupport(musicIconVie) || !PatchProxy.applyVoidTwoRefs(music, Integer.valueOf(i1), musicIconVie1, musicIconVie, "12")) {
                musicIconVie1.a.setValue(music);
                musicIconVie1.e = i1;
             }
             if (music == null) {
                i1 = 1;
             }
             musicIconVie1.p0(music, i1);
          }
          music = c.a;
          EditorDelegate uEditorDeleg = this.editorHelper.f();
          a.o(uEditorDeleg, "editorHelper.editorDelegate");
          Objects.requireNonNull(music);
          if (!PatchProxy.applyVoidOneRefs(uEditorDeleg, music, c.class, "7")) {
             a.p(uEditorDeleg, "editorDelegate");
             Objects.requireNonNull(j.d);
             if (j.c) {
                music = uEditorDeleg.N();
                a.o(music, "editorDelegate.workspaceDraft");
                if (j.l(music)) {
                   o oo = uEditorDeleg.x();
                   a.o(oo, "editorDelegate.editorContext");
                   oo.d().g.clear();
                   j.c = i;
                }
             }
          }
          k.f().a(true);
       }else {
          this.editorHelper.c(i);
          this.discardDraft(p0);
          b a1 = b.a;
          long l1 = System.currentTimeMillis() - this.startTime;
          Objects.requireNonNull(a1);
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l1), a1, uob, "2")) {
             ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
             uElementPack1.action2 = "CANCEL_EDIT_CUT_STYLE";
             JsonObject jsonObject1 = new JsonObject();
             jsonObject1.a0(str1, Long.valueOf(l1));
             uElementPack1.params = jsonObject1.toString();
             u1.u(str, uElementPack1, videoTemplat);
          }
          this.handleFlyWheelEvent(p0);
          this.editorHelper.f().w();
       }
       return;
    }
    public final void saveDraft(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoTemplatePanelDetachAction.class, "4")) {
          return;
       }
       a uoa = p0.n0();
       if (uoa != null) {
          uoa.f();
       }
       c uoc = p0.J0();
       if (uoc != null) {
          uoc.f();
       }
       uoa = p0.g1();
       if (uoa != null) {
          uoa.f();
       }
       uoa = p0.s0();
       if (uoa != null) {
          uoa.f();
       }
       uoa = p0.o0();
       if (uoa != null) {
          uoa.f();
       }
       uoa = p0.F0();
       if (uoa != null) {
          uoa.f();
       }
       uoa = p0.v0();
       if (uoa != null) {
          uoa.f();
       }
       uoa = p0.u0();
       if (uoa != null) {
          uoa.f();
       }
       uoa = p0.w0();
       if (uoa != null) {
          uoa.f();
       }
       i oi = p0.f1();
       if (oi != null) {
          oi.f();
       }
       g og = p0.Y0();
       if (og != null) {
          og.f();
       }
       uoc = p0.z0();
       if (uoc != null) {
          uoc.f();
       }
       uoa = p0.m0();
       if (uoa != null) {
          uoa.f();
       }
       uoa = p0.R0();
       if (uoa != null) {
          uoa.f();
       }
       uoa = p0.c1();
       if (uoa != null) {
          uoa.f();
       }
       uoa = p0.P0();
       if (uoa != null) {
          uoa.f();
       }
       e uoe = p0.C0();
       if (uoe != null) {
          uoe.f();
       }
       return;
    }
    public final void setShareActivityParam(f p0,i p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoTemplatePanelDetachAction.class, "5")) {
          return;
       }
       if (!p0.t()) {
          return;
       }
       AICutMusicInfo music = p0.getMusic();
       a uoa = a.D();
       StringBuilder str = "setShareActivityParam: music=";
       String mName = (music != null)? music.getMName(): null;
       Object[] objArray = new Object[0];
       uoa.w("VideoTemplatePanelDtcAct", str+mName, objArray);
       EditorDelegate uEditorDeleg = p1.f();
       a.o(uEditorDeleg, "editorHelper.editorDelegate");
       o oo = uEditorDeleg.x();
       a.o(oo, "editorHelper.editorDelegate.editorContext");
       Intent intent = oo.c();
       if (music != null) {
          a.o(SerializableHook.putExtra(intent, "music", music), "intent.putExtra\(TagParams.KEY_MUSIC, music\)");
       }else {
          intent.removeExtra("music");
       }
       return;
    }
}
