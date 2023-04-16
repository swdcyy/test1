package com.yxcorp.gifshow.v3.editor.item.BackgroundIcon;
import com.yxcorp.gifshow.v3.editor.item.EditIcon;
import ooc.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import yvc.a;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import soc.j$b;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.item.PostBaseIcon;
import android.widget.RelativeLayout;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import vaa.a;
import haa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Kuaishan;
import com.kuaishou.edit.draft.MediaSceneBackground;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import faa.a;
import q87.c;
import android.graphics.Bitmap;
import android.widget.ImageView$ScaleType;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.StringBuilder;
import android.net.Uri;
import com.yxcorp.image.request.a;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import lnc.a1;
import s0d.a;
import hd.d;
import jd.c;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import ac.a;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import s0d.e;
import com.facebook.drawee.controller.AbstractDraweeController;

public final class BackgroundIcon extends EditIcon	// class@000fae
{

    public void BackgroundIcon(g p0,int p1,int p2){
       a.p(p0, "model");
       super(p0, p1, p2);
    }
    public void bindIconView(a p0,EditorItemFunc p1,j$b p2,EditorDelegate p3,Context p4){
       Object[] objArray;
       String mediaSceneBa1;
       j$b g;
       int i = 1;
       if (PatchProxy.isSupport(BackgroundIcon.class)) {
          objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, BackgroundIcon.class, "1")) {
             return;
          }
       }
       a.p(p0, "item");
       a.p(p1, "model");
       a.p(p2, "holder");
       a.p(p3, "editorDelegate");
       a.p(p4, "context");
       super.bindIconView(p0, p1, p2, p3, p4);
       j$b f = p2.f;
       a.o(f, "holder.musicCoverLayout");
       f.setVisibility(0);
       f = p2.b;
       a.o(f, "holder.iconView");
       f.setVisibility(8);
       p2.g.setPlaceHolderImage(R.drawable.arg_RES_7f081e34);
       c uoc = p3.N();
       a.o(uoc, "editorDelegate.workspaceDraft");
       uoc = a.m(uoc);
       Kuaishan kuaishan = uoc.v();
       String str = null;
       if (kuaishan != null) {
          MediaSceneBackground mediaSceneBa = kuaishan.getMediaSceneBackground();
          if (mediaSceneBa != null) {
             mediaSceneBa1 = mediaSceneBa.getMediaSceneBackgroundCover();
          label_0081 :
             File uFile = DraftFileManager.E().B(mediaSceneBa1, uoc);
             if (uFile == null) {
                objArray = new Object[i];
                objArray[0] = "coverFile is null";
                a.D().A("BackgroundIcon", "bindIconView", objArray);
                DraftFileManager uDraftFileMa = DraftFileManager.E();
                Kuaishan kuaishan1 = uoc.v();
                if (kuaishan1 != null) {
                   MediaSceneBackground mediaSceneBa2 = kuaishan1.getMediaSceneBackground();
                   if (mediaSceneBa2 != null) {
                      str = mediaSceneBa2.getMediaSceneBackgroundCover();
                   }
                }
                Bitmap uBitmap = uDraftFileMa.z(str, uoc);
                if (uBitmap != null) {
                   Object[] objArray1 = new Object[0];
                   a.D().w("BackgroundIcon", "update icon with bitmap", objArray1);
                   g = p2.g;
                   a.o(g, "holder.musicCoverImageView");
                   g.setScaleType(ImageView$ScaleType.CENTER_CROP);
                   p2.g.setImageBitmap(uBitmap);
                }
             }else {
                objArray = new Object[0];
                a.D().w("BackgroundIcon", "update icon with file="+uFile.getAbsoluteFile(), objArray);
                uoc = a.t(Uri.fromFile(uFile));
                a.o(uoc, "KwaiImageRequestBuilder.бн\(Uri.fromFile\(coverFile\)\)");
                g = p2.g;
                a.o(g, "holder\n            .musicCoverImageView");
                if (!PatchProxy.applyVoidTwoRefs(uoc, g, this, BackgroundIcon.class, "2")) {
                   a hierarchy = g.getHierarchy();
                   a.o(hierarchy, "imageView.hierarchy");
                   hierarchy.u(t$b.i);
                   d uod = Fresco.newDraweeControllerBuilder();
                   uod.y(g.getController());
                   uod.w(uoc.o(a1.d(R.dimen.arg_RES_7f0702c5), a1.d(R.dimen.arg_RES_7f0702c5)).l(new d()).q());
                   g.setController(uod.e());
                }
             }
             return;
          }
       }
       mediaSceneBa1 = str;
       goto label_0081 ;
    }
}
