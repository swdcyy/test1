package com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$q;
import erd.o;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject;
import java.lang.Object;
import com.yxcorp.gifshow.aicut.VideoTemplateResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import o69.c;
import com.yxcorp.gifshow.aicut.KwaiAICutStyle;
import com.yxcorp.gifshow.kuaishan.model.TemplateMusic;
import com.yxcorp.gifshow.aicut.KwaiAICutStyle$KWaiAiCutMusic;
import l69.t;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.aicut.api.AICutMusicInfo;
import java.util.List;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.aicut.VideoTemplateGroupInfo;
import ssd.e;
import java.util.Collection;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import h69.g;
import java.lang.StringBuilder;
import q87.c;

public final class AICutAnnualMemoryProject$q implements o	// class@001961
{
    public final AICutAnnualMemoryProject b;

    public void AICutAnnualMemoryProject$q(AICutAnnualMemoryProject p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       TemplateMusic templateMusi;
       TemplateMusic mMusic1;
       VideoTemplate videoTemplat = PatchProxy.applyOneRefs(p0, this, AICutAnnualMemoryProject$q.class, "1");
       if (videoTemplat != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          this.b.S0(p0);
          this.b.X0();
          int i = 0;
          AICutAnnualMemoryProject$q oq = ((this.b.S()).length() > 0)? 1: null;
          String str = null;
          if (oq) {
             oq = this.b;
             VideoTemplate videoTemplat1 = oq.L0(oq.S());
             if (videoTemplat1 != null) {
                KwaiAICutStyle mTemplateMus = videoTemplat1.getAiCutStyle().mTemplateMusic;
                if (mTemplateMus != null) {
                   templateMusi = mTemplateMus.getTemplateMusicById(this.b.Q());
                   if (templateMusi != null) {
                      TemplateMusic mMusic = templateMusi.mMusic;
                      a.o(mMusic, "templateMusic.mMusic");
                      this.b.s0(t.a.a(mMusic));
                      this.b.a1(videoTemplat1.getId(), this.b.P(), templateMusi.mClipPoint);
                   }
                }
                if (this.b.P() == null) {
                   templateMusi = this.b.U0(videoTemplat1.getAiCutStyle());
                   if (templateMusi != null) {
                      mMusic1 = templateMusi.mMusic;
                      if (mMusic1 != null) {
                         this.b.s0(t.a.a(mMusic1));
                         this.b.a1(videoTemplat1.getId(), this.b.P(), templateMusi.mClipPoint);
                      }
                   }
                }
             }else {
                videoTemplat1 = str;
             }
          label_00ad :
             oq.R0(videoTemplat1);
          }
          p0 = p0.getTemplateGroups();
          if (p0 != null) {
             p0 = CollectionsKt___CollectionsKt.p2(p0);
             if (p0 != null) {
                p0 = p0.getTemplates();
             label_00c4 :
                if (this.b.J0() == null) {
                   oq = this.b;
                   if (p0 != null) {
                      p0 = CollectionsKt___CollectionsKt.v4(p0, e.b);
                      if (p0 != null) {
                         templateMusi = this.b.U0(p0.getAiCutStyle());
                         if (templateMusi != null) {
                            mMusic1 = templateMusi.mMusic;
                            if (mMusic1 != null) {
                               this.b.s0(t.a.a(mMusic1));
                               this.b.a1(p0.getId(), this.b.P(), templateMusi.mClipPoint);
                            }
                         }
                      }else {
                      label_0109 :
                         p0 = str;
                      }
                   }else {
                      goto label_0109 ;
                   }
                   oq.R0(p0);
                   if (this.b.J0() == null) {
                      PostUtils.D("AICutAnnualMemoryProject", "observableGetTemplates:", new RuntimeException(" template is empty"));
                      p0 = this.b;
                      p0.R0(p0.H0());
                   }
                }
                p0 = g.D();
                StringBuilder str1 = "observableGetTemplates: use id=";
                VideoTemplate videoTemplat2 = this.b.J0();
                if (videoTemplat2 != null) {
                   str = videoTemplat2.getId();
                }
                Object[] objArray = new Object[i];
                p0.w("AICutAnnualMemoryProject", str1+str, objArray);
                videoTemplat = this.b.J0();
             }
          }
          p0 = str;
          goto label_00c4 ;
       }
       return videoTemplat;
    }
}
