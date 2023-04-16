package com.yxcorp.gifshow.encode.EncodeRequest$a;
import java.lang.Object;
import com.yxcorp.gifshow.encode.EncodeRequest;
import java.lang.String;
import com.kwai.feature.post.api.feature.encode.model.VideoEncodeSDKInfo;
import com.kuaishou.edit.draft.Workspace;
import java.io.File;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import um6.a;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import com.kwai.feature.post.api.feature.encode.model.AtlasInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.Kuaishan;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import lnc.g7;
import h69.j;
import com.kuaishou.edit.draft.AICutTheme;
import wba.n0;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.kuaishou.edit.draft.AICutTheme$DpiType;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.CropOptions;
import haa.f;
import q87.c;
import n16.a;
import c26.c;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;
import android.content.Intent;

public class EncodeRequest$a	// class@000d06
{
    public KtvInfo A;
    public boolean B;
    public boolean C;
    public List D;
    public String E;
    public int F;
    public int G;
    public String H;
    public String I;
    public String J;
    public boolean K;
    public c L;
    public boolean M;
    public byte[] N;
    public AtlasInfo O;
    public String P;
    public boolean Q;
    public int R;
    public int S;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public float i;
    public float j;
    public String k;
    public VideoEncodeSDKInfo l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public Intent t;
    public boolean u;
    public String v;
    public Workspace w;
    public File x;
    public VideoContext y;
    public boolean z;

    public void EncodeRequest$a(){
       super();
       this.g = -1;
       this.h = -1;
       this.C = true;
    }
    public void EncodeRequest$a(EncodeRequest p0){
       super();
       this.g = -1;
       this.h = -1;
       this.C = true;
       if (p0 == null) {
          return;
       }
       this.a = p0.getOutputPath();
       this.b = p0.getCoverPath();
       this.c = p0.getAudioOutputPath();
       this.d = p0.getComment();
       this.e = p0.getVideoBufferPath();
       this.f = p0.getForegroundAudioPath();
       this.g = p0.getForegroundAudioClipStartTime();
       this.h = p0.getForegroundAudioClipEndTime();
       this.i = p0.getForegroundAudioVolume();
       this.j = p0.getBackgroundAudioVolume();
       this.k = p0.getBackgroundAudioPath();
       this.l = p0.getVideoEncodeSDKInfo();
       this.m = p0.getCount();
       this.n = p0.getWidth();
       this.o = p0.getHeight();
       this.p = p0.getFrameIntervalMs();
       this.q = p0.getBackgroundAudioRepeat();
       this.r = p0.isCrashInEncodingAndGiveUpWorkspace();
       this.s = p0.mHidden;
       this.t = p0.mPreviewIntent;
       this.u = p0.isPhotoMovie();
       this.v = p0.getSessionId();
       this.w = p0.getWorkspace();
       this.x = p0.getWorkspaceDirectory();
       this.y = p0.getVideoContext();
       this.z = p0.isImport();
       this.A = p0.getKtvInfo();
       this.B = p0.isPipelineSupported();
       this.C = p0.isExportTaskInQueueing();
       this.D = p0.mEncodeProfiles;
       this.E = p0.mEncodedFileOutputTempPath;
       this.F = p0.getVideoBitrate();
       this.G = p0.getVideoGopSiz();
       this.H = p0.getX264Preset();
       this.I = p0.getX264Params();
       this.J = p0.getAudioProfile();
       this.K = p0.isOverrideParams();
       this.L = p0.mResult;
       this.M = p0.isHdExport();
       this.N = p0.getExtraInfoInSEI();
       this.O = p0.getAtlasInfo();
       this.P = p0.getActivityKey();
       this.Q = p0.isDisableTranscodeDegrade();
       this.S = p0.getVideoType();
       this.R = p0.getTemplateGrade();
       return;
    }
    public EncodeRequest$a A(int p0){
       this.S = p0;
       return this;
    }
    public EncodeRequest$a B(int p0){
       this.n = p0;
       return this;
    }
    public EncodeRequest$a C(Workspace p0){
       Object[] objArray;
       int i2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KSTemplateDetailInfo obj = PatchProxy.applyOneRefs(p0, this, EncodeRequest$a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       this.w = p0;
       if (p0 != null) {
          obj = g7.g(p0.getKuaishan().getExtraInfo());
          int i = 0;
          obj = (obj != null)? obj.mTemplateGrade: 0;
          this.R = obj;
          if (j.i(p0) && p0.getAiCutThemesCount() > 0) {
             AICutTheme aiCutThemes = p0.getAiCutThemes(i);
             Size size = PatchProxy.applyOneRefs(p0, null, n0.class, "23");
             if (size != patchProxyRe) {
             }else {
                AICutTheme$DpiType d_720 = AICutTheme$DpiType.D_720;
                AICutTheme$DpiType dpi = (p0.getAiCutThemesCount() > 0)? p0.getAiCutThemes(i).getDpi(): d_720;
                if (dpi == d_720) {
                   size = new Size(720, 1280);
                }else {
                   Iterator iterator = p0.getAssetsList().iterator();
                   int i1 = 0;
                   while (iterator.hasNext()) {
                      Asset uAsset = iterator.next();
                      int width = uAsset.getCropOptions().getWidth();
                      int height = uAsset.getCropOptions().getHeight();
                      if (width && (height && (width < 1080 || height < 1080))) {
                         i1 = i1 + 1;
                      }
                   }
                   String str = "TrackAssetDraftUtil";
                   if (i1 > 0) {
                      objArray = new Object[i];
                      f.D().w(str, "calculatePreviewSize: force 720", objArray);
                      size = new Size(720, 1280);
                   }else {
                      objArray = new Object[i];
                      f.D().w(str, "calculatePreviewSize: dpi use 1080", objArray);
                      size = new Size(1080, 1920);
                   }
                }
             }
             this.R = a.b;
             if (aiCutThemes != null) {
                if (aiCutThemes.getDpi() == AICutTheme$DpiType.D_1080 && size.c == 1920) {
                   this.R = a.c;
                }else {
                   this.R = a.b;
                }
             }
          }
       }
    label_00d9 :
       return this;
    }
    public EncodeRequest$a D(File p0){
       this.x = p0;
       return this;
    }
    public EncodeRequest$a E(String p0){
       this.I = p0;
       return this;
    }
    public EncodeRequest$a F(String p0){
       this.H = p0;
       return this;
    }
    public EncodeRequest a(){
       Object obj = PatchProxy.apply(null, this, EncodeRequest$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new EncodeRequest(this);
    }
    public EncodeRequest$a b(AtlasInfo p0){
       this.O = p0;
       return this;
    }
    public EncodeRequest$a c(String p0){
       this.c = p0;
       return this;
    }
    public EncodeRequest$a d(String p0,String p1,float p2,float p3,boolean p4){
       this.f = p0;
       this.k = null;
       this.i = p2;
       this.j = p3;
       this.q = p4;
       return this;
    }
    public EncodeRequest$a e(String p0){
       this.d = p0;
       return this;
    }
    public EncodeRequest$a f(boolean p0){
       this.Q = p0;
       return this;
    }
    public EncodeRequest$a g(List p0){
       this.D = p0;
       return this;
    }
    public EncodeRequest$a h(boolean p0){
       this.C = p0;
       return this;
    }
    public EncodeRequest$a i(byte[] p0){
       this.N = p0;
       return this;
    }
    public EncodeRequest$a j(int p0){
       this.o = p0;
       return this;
    }
    public EncodeRequest$a k(boolean p0){
       this.s = p0;
       return this;
    }
    public EncodeRequest$a l(boolean p0){
       this.M = p0;
       return this;
    }
    public EncodeRequest$a m(boolean p0){
       this.z = p0;
       return this;
    }
    public EncodeRequest$a n(boolean p0){
       this.u = p0;
       return this;
    }
    public EncodeRequest$a o(boolean p0){
       this.B = p0;
       return this;
    }
    public EncodeRequest$a p(KtvInfo p0){
       this.A = p0;
       return this;
    }
    public EncodeRequest$a q(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EncodeRequest$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.L = p0;
       if (this.R > null && (p0 != null && p0.g() != null)) {
          this.n = this.L.g().getVideoWidth();
          this.o = this.L.g().getVideoHeight();
       }
    label_0035 :
       return this;
    }
    public EncodeRequest$a r(String p0){
       this.a = p0;
       return this;
    }
    public EncodeRequest$a s(boolean p0){
       this.K = p0;
       return this;
    }
    public EncodeRequest$a t(Intent p0){
       this.t = p0;
       return this;
    }
    public EncodeRequest$a u(String p0){
       this.v = p0;
       return this;
    }
    public EncodeRequest$a v(int p0){
       this.F = p0;
       return this;
    }
    public EncodeRequest$a w(String p0){
       this.e = p0;
       return this;
    }
    public EncodeRequest$a x(VideoContext p0){
       this.y = p0;
       return this;
    }
    public EncodeRequest$a y(VideoEncodeSDKInfo p0){
       this.l = p0;
       return this;
    }
    public EncodeRequest$a z(int p0){
       this.G = p0;
       return this;
    }
}
