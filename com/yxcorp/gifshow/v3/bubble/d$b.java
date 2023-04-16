package com.yxcorp.gifshow.v3.bubble.d$b;
import voc.s;
import com.yxcorp.gifshow.v3.bubble.d;
import java.lang.Object;
import ooc.g;
import voc.r;
import com.kuaishou.android.model.music.Music;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.BubbleType;
import android.view.View;
import java.util.List;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import java.util.Objects;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.v3.bubble.i;
import androidx.recyclerview.widget.RecyclerView$r;
import faa.a;
import q87.c;
import im8.f;
import com.yxcorp.gifshow.v3.EditorManager;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import com.yxcorp.gifshow.v3.bubble.d$b$a;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import w46.b;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import poc.v;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.v3.bubble.EditBubbleItem;
import com.yxcorp.gifshow.bubble.b;
import poc.o;
import com.yxcorp.gifshow.bubble.b$c;
import poc.p;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import android.content.Intent;
import ekd.j0;
import ra9.c;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import com.yxcorp.gifshow.v3.bubble.c;
import com.yxcorp.gifshow.bubble.b$b;
import poc.j;
import android.view.Window;
import android.widget.Button;
import poc.i;
import com.yxcorp.gifshow.v3.bubble.b;
import com.kwai.robust.PatchProxyResult;
import poc.s;
import poc.q;
import com.yxcorp.gifshow.model.VisibilityExpirationConfig;
import java.lang.reflect.Type;
import oa0.a;
import poc.h;
import poc.n;
import com.yxcorp.gifshow.v3.bubble.d$c;
import java.lang.Enum;
import lnc.a1;
import poc.m;
import u80.d;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import poc.t;
import com.yxcorp.gifshow.v3.bubble.e;
import com.yxcorp.gifshow.v3.bubble.f;
import poc.r;
import ooc.c;
import com.kwai.sdk.switchconfig.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import kb.c;

public class d$b implements s	// class@000d31
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public g a(){
       return r.c(this);
    }
    public void b(Music p0,int p1,String p2){
       r.g(this, p0, p1, p2);
    }
    public void c(int p0){
       d$b uob = d$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "2")) {
          return;
       }
       if (p0 == 1) {
          this.a.R8(BubbleType.TYPE_WITH_EDIT_ACTION);
       }
       return;
    }
    public void d(boolean p0){
       r.f(this, p0);
    }
    public void e(){
       r.a(this);
    }
    public void f(View p0,List p1,List p2){
       int this;
       b uob1;
       EditBubbleItem pIC_TEMPLATE;
       EditBubbleItem rELAY_PHOTO_;
       Object[] this1;
       Object[] objArray1;
       d uod = d.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d$b.class, "1")) {
          return;
       }
       d$b ta = this.a;
       ta.A.o(ta.C);
       ta = this.a;
       Objects.requireNonNull(ta);
       EditBubbleItem uEditBubbleI = 1;
       String str = "BubbleTipPresenter";
       this = 0;
       if (!PatchProxy.applyVoidTwoRefs(p1, p2, ta, uod, "5")) {
          if (p1.size() != uEditBubbleI) {
             String str2 = "initScrollListener recyclerViews.size\(\) != 1";
             PostUtils.D(str, str2, new IllegalStateException(str2));
          }else {
             p1.get(this).addOnScrollListener(new i(ta, p2));
          }
       }
       Object[] objArray = new Object[this];
       a.D().s(str, "onBottomEditorLayoutPrepared", objArray);
       if (this.a.w.get() != null && this.a.w.get().s()) {
          return;
       }else {
          Workspace workspace = this.a.u.v();
          if (workspace == null) {
             return;
          }else {
             this.a.A.m(new d$b$a(this));
             d$b ta1 = this.a;
             Activity activity = ta1.getActivity();
             Objects.requireNonNull(ta1);
             if (!PatchProxy.applyVoidOneRefs(activity, ta1, uod, "16")) {
                if (activity == null) {
                   objArray1 = new Object[this];
                   a.D().t(str, "handleEditProgressGuideBubble\(\) activity is null", objArray1);
                }else if(ta1.u == null){
                   objArray1 = new Object[this];
                   a.D().t(str, "handleEditProgressGuideBubble\(\) draft is null", objArray1);
                }else if(!PostExperimentUtils.W0()){
                   ta1.A.n(new v(ta1, activity));
                }
             }
             ta1 = this.a;
             ta1.A.n(ta1.P8(p1, p2, EditBubbleItem.STICKER_PLC).l(new o(this)));
             ta1 = this.a;
             ta1.A.n(ta1.P8(p1, p2, EditBubbleItem.RELAY_STICKER_BUBBLE).l(new p(this)));
             ta1 = this.a;
             Objects.requireNonNull(ta1);
             if (!PatchProxy.applyVoidOneRefs(p1, ta1, uod, "15")) {
                d u1 = ta1.u;
                if (u1 == null) {
                   objArray1 = new Object[this];
                   a.D().t(str, "handleCoverAutoCropBubble: mWorkspaceDraft is null", objArray1);
                }else if(ta1.z == null){
                   if (!f.E(u1.a1())) {
                      objArray1 = new Object[this];
                      a.D().t(str, "handleCoverAutoCropBubble: mVideoSDKPlayerView is null", objArray1);
                   }
                }else {
                   b uob3 = new b(EditBubbleItem.VIDEO_COVER_AUTO_CROP);
                   uob3.b(ta1.S8(p1, EditorItemFunc.COVER_VIDEO));
                   uob3.k(c.a);
                   uob3.l(new j(ta1, ("cover_edit").equals(j0.f(ta1.w.get().m().getIntent(), "SOURCE"))));
                   ta1.A.n(uob3);
                }
             }
             ta1 = this.a;
             activity = ta1.getActivity();
             Objects.requireNonNull(ta1);
             if (!PatchProxy.applyVoidOneRefs(activity, ta1, uod, "14")) {
                if (activity == null) {
                   this1 = new Object[this];
                   a.D().t(str, "getPhotoVisibilityBubble: activity is null", this1);
                }else {
                   View view = activity.getWindow().getDecorView().findViewById(0x1020002);
                   if (view == null) {
                      this1 = new Object[this];
                      a.D().t(str, "getPhotoVisibilityBubble: rootView is null", this1);
                   }else {
                      Button uButton = view.findViewById(R.id.photo_visibility_btn);
                      if (uButton == null) {
                         this1 = new Object[this];
                         a.D().t(str, "getPhotoVisibilityBubble: rightBtn is null", this1);
                      }else {
                         super(EditBubbleItem.PHOTO_VISIBILITY);
                         this.b(uButton);
                         this.l(new i(ta1));
                         this.k(b.a);
                         ta1.A.n(this);
                      }
                   }
                }
             }
             ta1 = this.a;
             Objects.requireNonNull(ta1);
             EditBubbleItem uEditBubbleI1 = PatchProxy.applyOneRefs(workspace, ta1, uod, "13");
             if (uEditBubbleI1 != PatchProxyResult.class) {
             }else if(f.E(workspace.getType())){
                rELAY_PHOTO_ = (ta1.E != null)? EditBubbleItem.RELAY_PHOTO_NEW: EditBubbleItem.RELAY_PHOTO;
             }else if(ta1.D != null){
                rELAY_PHOTO_ = EditBubbleItem.RELAY_VIDEO_NEW;
             }else {
                rELAY_PHOTO_ = EditBubbleItem.RELAY_VIDEO;
             }
             uEditBubbleI1 = rELAY_PHOTO_;
             if (uEditBubbleI1 == EditBubbleItem.RELAY_PHOTO_NEW || uEditBubbleI1 == EditBubbleItem.RELAY_VIDEO_NEW) {
                this.a.F.add(uEditBubbleI1);
             }else {
                ta1 = this.a;
                ta1.A.n(ta1.P8(p1, p2, uEditBubbleI1));
             }
             ta1 = this.a;
             ta1.A.n(ta1.P8(p1, p2, EditBubbleItem.AUTO_SUBTITLE).l(new s(this)));
             ta1 = this.a;
             ta1.A.n(ta1.P8(p1, p2, EditBubbleItem.SUBTITLE).l(new q(this)));
             ta1 = this.a;
             d u = ta1.u;
             Objects.requireNonNull(ta1);
             if (!PatchProxy.applyVoidOneRefs(u, ta1, uod, "12")) {
                VisibilityExpirationConfig visibilityEx = a.E0(VisibilityExpirationConfig.class);
                if (visibilityEx != null) {
                   visibilityEx = visibilityEx.bubble1;
                   if (visibilityEx != null) {
                      b uob2 = new b(EditBubbleItem.VISIBILITY_EXPIRATION.setContent(visibilityEx));
                      uob2.b(ta1.p);
                      uob2.l(new h(u));
                      ta1.A.n(uob2);
                   }
                }
             }
             b uob = new b(EditBubbleItem.POST_DIRECTLY);
             uob.b(this.a.p);
             uob.l(new n(workspace));
             this.a.A.n(uob);
             int i = d$c.a[workspace.getType().ordinal()];
             if (i != uEditBubbleI) {
                if (i != 2) {
                   if (i == 3) {
                      pIC_TEMPLATE = EditBubbleItem.PIC_TEMPLATE_V2;
                      pIC_TEMPLATE.setContent(a1.p(R.string.arg_RES_7f103c66));
                      uob1 = new b(pIC_TEMPLATE);
                      uob1.b(this.a.S8(p1, EditorItemFunc.PIC_TEMPLATE_V2));
                      this.a.A.n(uob1);
                   }
                }else {
                   pIC_TEMPLATE = EditBubbleItem.PIC_TEMPLATE_V2;
                   pIC_TEMPLATE.setContent(a1.p(R.string.arg_RES_7f103c67));
                   uob1 = new b(pIC_TEMPLATE);
                   uob1.b(this.a.S8(p1, EditorItemFunc.PIC_TEMPLATE_V2));
                   this.a.A.n(uob1);
                }
             }else {
                uob = new b(EditBubbleItem.PIC_TEMPLATE_V2);
                uob.b(this.a.S8(p1, EditorItemFunc.PIC_TEMPLATE_V2));
                this.a.A.n(uob);
             }
             uob = new b(EditBubbleItem.SEGMENT);
             uob.b(this.a.S8(p1, EditorItemFunc.SEGMENT));
             uob.l(new m(workspace));
             this.a.A.n(uob);
             d z = this.a.z;
             z = (z == null)? null: z.getEditingKuaiShanProject();
             uob1 = new b(EditBubbleItem.KUAISHAN_SEGMENT);
             uob1.b(this.a.S8(p1, EditorItemFunc.KUAISHAN_SEGMENT));
             uob1.l(new t(this, z));
             this.a.A.n(uob1);
             uob = new b(EditBubbleItem.COPY_TEXT_OLD_TEXT);
             uob.b(this.a.S8(p1, EditorItemFunc.TEXT));
             uob.l(e.a);
             this.a.A.n(uob);
             uob = new b(EditBubbleItem.COPY_TEXT_NEW_TEXT);
             uob.b(this.a.S8(p1, EditorItemFunc.TEXT_V2));
             uob.l(f.a);
             this.a.A.n(uob);
             uob = new b(EditBubbleItem.AE_TEXT);
             uob.b(this.a.S8(p1, EditorItemFunc.TEXT_V3));
             this.a.A.n(uob);
             ta = this.a;
             ta.A.n(ta.P8(p1, p2, EditBubbleItem.FRAME_FULL_SCREEN).l(new r(this)));
             if (c.a()) {
                String str1 = a.t().c("coverBubbleImageUrl", "");
                if (!TextUtils.x(str1)) {
                   Fresco.getImagePipeline().prefetchToDiskCache(ImageRequestBuilder.k(Uri.parse(str1)).a(), null);
                }
             }
             return;
          }
       }
    }
    public void g(boolean p0){
       r.h(this, p0);
    }
    public void h(){
       r.b(this);
    }
}
