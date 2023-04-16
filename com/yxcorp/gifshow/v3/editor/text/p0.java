package com.yxcorp.gifshow.v3.editor.text.p0;
import io.reactivex.g;
import com.yxcorp.gifshow.v3.editor.text.ReEditCoverPresenter;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.encode.EncodeRequest$a;
import com.yxcorp.gifshow.encode.EncodeRequest;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import java.io.File;
import laa.m0;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import k2b.u1;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.util.Objects;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.activity.preview.f;
import tkd.b;
import tkd.d;
import f0c.t;
import com.kwai.feature.post.api.feature.encode.model.AtlasInfo;
import b26.c;
import pca.d0;
import com.yxcorp.gifshow.v3.editor.text.p0$a;
import c26.d;
import c26.b;
import b26.d;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;

public class p0 implements g	// class@00147f
{
    public final ReEditCoverPresenter b;

    public void p0(ReEditCoverPresenter p0){
       this.b = p0;
       super();
    }
    public void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p0.class, "1")) {
          return;
       }
       EncodeRequest$a uoa = EncodeRequest.newBuilder().C(this.b.p.v());
       uoa.D(this.b.p.f0());
       uoa.x(this.b.p.d1());
       uoa.u(u1.f());
       Workspace workspace = this.b.p.v();
       Objects.requireNonNull(workspace);
       File uFile = DraftFileManager.E().J(workspace);
       File parentFile = uFile.getParentFile();
       if (!parentFile.exists()) {
          parentFile.mkdirs();
       }
       uoa.r(uFile.getAbsolutePath());
       uoa.e(f.g(Workspace$Type.SINGLE_PICTURE, Workspace$Source.REEDIT, this.b.p.d1()));
       uoa.b(d.a(-273232199).xr(this.b.p.v(), this.b.p.f0()));
       uoa.k(true);
       uoa.n(false);
       uoa.m(false);
       uoa.h(false);
       uoa.o(false);
       EncodeRequest uEncodeReque = uoa.a();
       d.a(0x66204fb9).E5(new p0$a(this, p0));
       int i = d.a(0x2e6e89ac).r7(uEncodeReque);
       PostLogger postLogger = new PostLogger().c("ReEditCoverPresenter");
       postLogger.k(uEncodeReque.getSessionId());
       PostLogger postLogger1 = postLogger.h(PostSubTaskEvent.ENCODE_EVENT);
       postLogger1.j(PostLogger$Status.BEGIN).i(String.valueOf(i)).f("exportSinglePicture").g("∑‚√Ê‘Ÿ±‡º≠").d();
       d.a(0x66204fb9).Oy(i);
       return;
    }
}
