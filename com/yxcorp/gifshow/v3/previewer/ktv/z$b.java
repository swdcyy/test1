package com.yxcorp.gifshow.v3.previewer.ktv.z$b;
import com.yxcorp.gifshow.fragment.d;
import com.yxcorp.gifshow.v3.previewer.ktv.z;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import java.lang.Object;
import java.lang.Void;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b$a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b;
import qba.d;
import com.yxcorp.gifshow.activity.preview.f;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.Loader;
import ekd.q;
import com.yxcorp.gifshow.models.QMedia;
import ekd.b0;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import voc.o;
import java.util.Objects;
import qr4.i;
import qr4.m$k0;
import qr4.m$a0;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.io.File;
import com.yxcorp.gifshow.v3.previewer.ktv.p;
import com.kwai.gifshow.post.api.core.camerasdk.model.ExifInfo;
import km6.a;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.widget.adv.model.f;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import android.util.Pair;
import im8.f;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.Integer;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Preview$b;
import androidx.fragment.app.Fragment;
import lwc.h;
import com.yxcorp.gifshow.v3.f;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class z$b extends d	// class@0015d9
{
    public final List y;
    public final z z;

    public void z$b(z p0,FragmentActivity p1,List p2){
       this.z = p0;
       this.y = p2;
       super(p1);
    }
    public Object b(Object[] p0){
       b$a uoa;
       try{
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          uoa = PatchProxy.applyOneRefs(p0, this, z$b.class, "1");
          if (uoa != patchProxyRe) {
          }else {
             uoa = null;
             Loader[] loaderArray = new Loader[]{Loader.Karaoke,Loader.TextStickerLyric,Loader.KaraokeLyric,Loader.Beauty,Loader.Makeup,Loader.Filter};
             int i = 4;
             b$a uoa1 = new b(this.z.t, f.h()).c(q.a(loaderArray));
             b0 uob0 = BitmapUtil.E(this.y.get(0).path);
             if (this.y.size() == 1) {
                Size size = new Size(uob0.a, uob0.b);
                Size[] sizeArray = new Size[]{size};
                Size[] sizeArray1 = new Size[]{size};
                this.z.z.e().r0(i, sizeArray, sizeArray1);
                VideoContext videoContext = this.z.z.e();
                Objects.requireNonNull(videoContext);
                if (PatchProxy.apply(uoa, videoContext, VideoContext.class, "130") != patchProxyRe) {
                }else {
                   VideoContext.b();
                   videoContext.b0();
                   videoContext.a.b.u.a = 0;
                }
             }else {
                this.z.z.e().l0();
                if (uoa1.getProject() != null) {
                   this.z.z.e().A1(uoa1.getProject().trackAssetsSize());
                }
             }
             if (this.y.size() == 1 && (this.y.get(0).path).startsWith(p.d().getAbsolutePath())) {
                this.z.z.e().U0(ExifInfo.parseFromFile(new File(this.y.get(0).path)));
                this.z.z.e().F().b.E = uoa;
             }else {
                this.z.z.e().U0(uoa);
                a.b(this.z.z.e().F(), this.y);
             }
             uoa = uoa1;
          }
       }catch(java.lang.Exception e0){
          PostUtils.D("KtvSongCoverPresenter", "doInBackground", e0);
       }
       return uoa;
    }
    public void j(Object p0){
       z c;
       int b;
       if (PatchProxy.applyVoidOneRefs(p0, this, z$b.class, "2")) {
       }else {
          super.j(p0);
          if (p0 != null && p0.getProject() != null) {
             int i = 1;
             f.m = p0.i() + i;
             if (p0.j() > 0x2710) {
                f.n = p0.j() + i;
             }
             try{
                this.z.P8(p0.getProject());
                this.z.y.Bh(false, 0, null, false, false);
                c = this.z.C;
                Size size = new Size(p0.getProject().projectOutputWidth(), p0.getProject().projectOutputHeight());
                b = false;
                if (this.y.size() == i && this.z.F.get().booleanValue()) {
                label_007d :
                   c.onNext(new Pair(size, Boolean.valueOf(i)));
                   this.z.r.sendChangeToPlayer(b);
                   this.z.r.play();
                   z e = this.z.E;
                   Boolean tRUE = Boolean.TRUE;
                   try{
                      e.onNext(tRUE);
                      this.z.r.reloadThumbnailGenerator();
                   }catch(java.lang.Exception e0){
                      PostUtils.D("KtvSongCoverPresenter", "onPostExecute", e0);
                   }
                }else {
                   i = false;
                   goto label_007d ;
                }
             }catch(java.lang.Exception e0){
                PostUtils.D("ktv_log", "reloadVideoProject fail.", e0);
                ExceptionHandler.handleCaughtException(e0);
                this.z.E.onNext(Boolean.FALSE);
             }
             z$b tz = this.z;
             i = p0.getProject().projectOutputWidth();
             b = p0.getProject().projectOutputHeight();
             Objects.requireNonNull(tz);
             c = z.class;
             if (!PatchProxy.isSupport(c) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(b), tz, c, "7")) {
                tz.x.c0();
                Preview$b uob = tz.x.k();
                uob.g(i);
                uob.d(b);
                tz.x.f();
             }
             this.z.z.d().e(p0.getProject());
             z$b tz1 = this.z;
             f.l(this.z.y).J0(this.z.getActivity(), tz1.t, tz1.z.f());
          }
       }
       return;
    }
}
