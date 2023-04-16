package com.yxcorp.gifshow.encode.j;
import pca.m0;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import c26.d;
import q6b.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import dq.a;
import java.lang.StringBuilder;
import q87.c;
import crd.b;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.media.builder.MediaEncoderParams;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.media.builder.MediaEncoderParams$AtlasParams;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.media.builder.MediaEncoderParams$AtlasParams$AtlasType;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.c;
import wba.h;
import java.lang.Throwable;
import java.lang.Boolean;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$Status;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import ekd.k1;
import pca.q;
import java.lang.Runnable;
import pca.r;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.kuaishou.edit.draft.Workspace;
import java.io.File;
import brd.t;
import java.util.List;
import pca.s;
import pca.l;
import javax.inject.Provider;
import com.yxcorp.gifshow.encode.x0$a;
import com.yxcorp.gifshow.encode.x0;
import w46.b;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import com.kwai.feature.post.api.feature.encode.model.AtlasInfo;
import com.yxcorp.gifshow.encode.s0;
import pca.m;
import erd.a;
import pca.n;
import pca.o;
import pca.p;
import erd.g;
import java.lang.IllegalStateException;

public class j extends m0	// class@000d2a
{
    public final int f;
    public long g;
    public final a h;
    public b i;

    public void j(PostEncodeInfo p0,d p1){
       super(p0, p1);
       this.f = 1;
       this.g = 0;
       this.h = new a();
    }
    public void a(int p0){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, j.class, "1")) {
          return;
       }
       super.a(p0);
       Object[] objArray = new Object[0];
       a.D().w("AtlasEncodeTask", "cancel, trigger: "+p0, objArray);
       j ti = this.i;
       if (ti != null && !ti.isDisposed()) {
          this.i.dispose();
          this.i = null;
       }
       return;
    }
    public final MediaEncoderParams b(c p0){
       MediaEncoderParams obj = PatchProxy.applyOneRefs(p0, this, j.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MediaEncoderParams();
       if (p0 == null) {
          return obj;
       }
       MediaEncoderParams$AtlasParams uAtlasParams = new MediaEncoderParams$AtlasParams();
       obj.n = uAtlasParams;
       Workspace$Type lONG_PICTURE = Workspace$Type.LONG_PICTURE;
       MediaEncoderParams$AtlasParams$AtlasType vERTICAL = (p0.a1() == lONG_PICTURE)? MediaEncoderParams$AtlasParams$AtlasType.VERTICAL: MediaEncoderParams$AtlasParams$AtlasType.HORIZONTAL;
       uAtlasParams.a = vERTICAL;
       if (p0.o0() != null) {
          obj.n.b = p0.o0().p();
          if (p0.a1() == lONG_PICTURE) {
             int i = p0.o0().p();
             int i1 = 0;
             int i2 = 0;
             while (i1 < i) {
                int i3 = h.b(p0.o0().y(i1));
                i2 = (i3 > 0)? i2 + i3: i2 + 1;
                i1 = i1 + 1;
             }
             obj.n.b = i2;
          }
       }
       obj.n.c = p0.V0();
       return obj;
    }
    public final void c(boolean p0,c p1,Throwable p2){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, j.class, "4")) {
          return;
       }
       if (this.d != null) {
          p0.mStatus = EncodeInfo$Status.CANCELED;
       }else if(p0){
          m0 tb = this.b;
          tb.mStatus = EncodeInfo$Status.COMPLETE;
          tb.mProgress = 0x3f800000;
          Object[] objArray = new Object[0];
          a.D().s("AtlasEncodeTask", "encodeStatusChanged complete time elapsed: "+k1.t(this.g), objArray);
       }else {
          this.b.setThrowable(p2);
          p0.mStatus = EncodeInfo$Status.FAILED;
       }
       this.e(p1);
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, j.class, "6")) {
          return;
       }
       k1.o(new q(this));
       return;
    }
    public final void e(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "5")) {
          return;
       }
       k1.o(new r(this, p0));
       return;
    }
    public void run(){
       boolean b1;
       String str = "AtlasEncodeTask";
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "2")) {
          return;
       }
       boolean b = false;
       try{
          this.g = k1.i();
          c uoc = DraftFileManager.E().y(this.b.mWorkspace.getIdentifier());
          if (uoc == null) {
             uoc = DraftFileManager.E().X(this.b.mWorkspaceDirectory).blockingSingle();
          }
          this.h.e(this.b(uoc), "");
          if (this.d != null) {
             this.b.mStatus = EncodeInfo$Status.CANCELED;
             this.e(uoc);
             return;
          }else {
             this.b.mStatus = EncodeInfo$Status.ENCODING;
             this.e(uoc);
             b1 = x0.b(uoc, this.b.getOutputAtlasFiles(), new s(this), new l(this), b);
             Object[] objArray3 = new Object[b];
             a.D().w(str, "exportImage result: "+b1, objArray3);
          label_00a3 :
             if (this.d == null && (b1 && this.b.mWorkspace.getMusicsCount())) {
                if (!PatchProxy.applyVoidOneRefs(uoc, this, j.class, "3")) {
                   PostLogger postLogger = new PostLogger().c(str);
                   postLogger.k(this.b.getSessionId());
                   postLogger.h(PostSubTaskEvent.ENCODE_CLIP_MUSIC).j(PostLogger$Status.BEGIN).d();
                   if (this.b.getAtlasInfo() != null) {
                      if (this.b.getAtlasInfo().mMusicFilePath != null) {
                         Object[] objArray2 = new Object[b];
                         a.D().w(str, "clipMusic getMusicFilePath by encodeInfo", objArray2);
                         m0 tb = this.b;
                         this.i = s0.f(tb.mWorkspace, tb.mWorkspaceDirectory, new File(this.b.getAtlasInfo().mMusicFilePath)).doFinally(new m(this)).doOnDispose(new n(this, uoc)).subscribe(new o(this, uoc), new p(this, uoc));
                      }else {
                         throw new IllegalStateException("clipMusic mEncodeInfo.getAtlasInfo.mMusicFilePath is null or");
                      }
                   }else {
                      throw new IllegalStateException("clipMusic mEncodeInfo.getAtlasInfo is null or");
                   }
                }
             }else {
                this.c(b1, uoc, objArray);
             }
             return;
          }
       }catch(com.yxcorp.gifshow.encode.EncodeException e3){
       }catch(java.lang.RuntimeException e3){
       }catch(com.yxcorp.gifshow.postwork.PostWorkErrorTips$NoSpaceLeftException e3){
       }catch(com.yxcorp.gifshow.encode.EncodeException e2){
       }catch(java.lang.RuntimeException e2){
       }catch(com.yxcorp.gifshow.postwork.PostWorkErrorTips$NoSpaceLeftException e2){
       }
       Object[] objArray1 = new Object[b];
       a.D().u(str, objArray, objArray1);
       b1 = false;
       goto label_00a3 ;
    }
}
