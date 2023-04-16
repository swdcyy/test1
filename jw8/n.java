package jw8.n;
import erd.o;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.Workspace;
import y26.b$a;
import java.lang.Object;
import com.yxcorp.gifshow.encode.EncodeRequest;
import tkd.b;
import tkd.d;
import f0c.t;
import com.yxcorp.gifshow.postwork.a;
import com.kwai.framework.model.user.QCurrentUser;
import f0c.w0;
import r26.b;
import com.yxcorp.gifshow.activity.preview.f;
import r26.a;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import qaa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Cover;
import com.kuaishou.edit.draft.VideoCoverParam;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.kuaishou.edit.draft.CropOptions;
import com.yxcorp.gifshow.upload.UploadRequest$a;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import com.yxcorp.gifshow.upload.UploadRequest;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest;
import y26.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gq.a;
import java.lang.StringBuilder;
import java.lang.System;
import q87.c;

public final class n implements o	// class@0029c5
{
    public final Workspace$Type b;
    public final c c;
    public final Workspace d;
    public final b$a e;
    public final long f;

    public void n(Workspace$Type p0,c p1,Workspace p2,b$a p3,long p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final Object apply(Object p0){
       n tc = this.c;
       n td = this.d;
       n te = this.e;
       n tf = this.f;
       a uoa = d.a(-273232199).a20();
       QCurrentUser qCurrentUser = QCurrentUser.me();
       int i = uoa.q0(new w0(p0));
       if (!f.j(this.b) && uoa.h4(uoa.L0(i).getEncodeInfo(), null)) {
          Cover uCover = tc.s0().v();
          Size size = (uCover != null && !TextUtils.x(uCover.getVideoCoverParam().getVideoCoverRatio()))? new Size(uCover.getVideoCoverParam().getCropOptions().getWidth(), uCover.getVideoCoverParam().getCropOptions().getHeight()): null;
          UploadRequest$a uoa1 = new UploadRequest$a();
          uoa1.I(p0.mSessionId);
          uoa1.U(qCurrentUser.getId());
          uoa1.b(qCurrentUser.getName());
          File uFile = (f.l(td))? DraftFileManager.E().u(tc): null;
          UploadRequest$a uoa2 = uoa1.f(uFile);
          File uFile1 = (f.l(td))? DraftFileManager.E().G(tc.s0()): null;
          UploadRequest$a uoa3 = uoa2.B(uFile1);
          uoa3.g(size);
          uoa3.o(true);
          uoa3.P(2);
          uoa3.j(p0.mOutputPath);
          uoa.X3(uoa1.a(), i);
       }
       te.C(i);
       p0 = PatchProxy.applyOneRefs(te, null, b.class, "3");
       if (p0 != PatchProxyResult.class) {
       }else {
          p0 = new b$a(te);
       }
       Object[] objArray = new Object[0];
       a.D().s("EditCost", "编码开始，准备过程耗时 "+(System.currentTimeMillis() - tf), objArray);
       return p0;
    }
}
