package com.yxcorp.gifshow.edit.previewer.loaderv2.p;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import uaa.a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace$Source;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Karaoke;
import com.kuaishou.edit.draft.KaraokeAsset;
import com.kuaishou.edit.draft.OnlineMusicParam;
import com.kuaishou.edit.draft.KaraokeGeneral;
import com.kuaishou.edit.draft.KaraokeClip;
import com.kuaishou.edit.draft.TimeRange;
import com.yxcorp.gifshow.edit.previewer.utils.KtvEditUtils;
import com.kuaishou.edit.draft.Workspace;
import com.kwai.video.editorsdk2.EditorSdk2Utils$PreviewSizeLimitation;
import wba.d0;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import mca.a;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.lang.Exception;
import taa.a;
import com.kuaishou.edit.draft.Preview;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.util.Iterator;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import wba.b;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import java.lang.Math;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.yxcorp.gifshow.edit.previewer.loaderv2.PreviewLoaderException;

public class p extends a	// class@001b48
{
    public a h;
    public a i;

    public void p(){
       super();
    }
    public void c(a$a p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p.class, "1")) {
          return;
       }
       this.h = this.a.o0();
       this.i = this.a.E0();
       return;
    }
    public void d(){
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, p.class, "2")) {
          return;
       }
       Workspace$Type type = obj.a.a1();
       Workspace$Type kTV_MV = Workspace$Type.KTV_MV;
       if (type != kTV_MV && (type != Workspace$Type.KTV_SONG || obj.h.p() <= 0)) {
          return;
       }
       if (obj.a.T0() == Workspace$Source.REEDIT) {
          return;
       }
       Karaoke karaoke = obj.i.v();
       if (karaoke == null || (!karaoke.hasAsset() || (!karaoke.getAsset().hasAccompany() || !karaoke.getAsset().getAccompany().hasSong()))) {
          throw new PreviewLoaderException("No karaoke asset.");
       }
       double d = (karaoke.hasGeneral())? 0 - karaoke.getGeneral().getVoiceOffset(): 0;
       if (type == Workspace$Type.KTV_SONG && karaoke.hasClip()) {
          d = d + karaoke.getClip().getSelectedRange().getStart();
       }
       float f = 0x3f800000;
       if (obj.h.p() <= 1 && (KtvEditUtils.c(obj.a) || (type == kTV_MV && (karaoke.getAsset().getLyricAssetsCount() > 0 || karaoke.getAsset().getKtvLyricCount() > 0)))) {
          EditorSdk2Utils$PreviewSizeLimitation previewSizeL = d0.g(obj.a.v());
          int i = a.s(obj.b);
          if (!i) {
             try{
                i = a.s(EditorSdk2UtilsV2.loadProjectWithSizeLimitation(obj.b, previewSizeL));
             }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
                e0.printStackTrace();
             }
          }
       }
    label_010c :
       Iterator iterator = obj.b.animatedSubAssets().iterator();
       while (iterator.hasNext()) {
          EditorSdk2V2$AnimatedSubAsset uAnimatedSub = iterator.next();
          if (b.s(uAnimatedSub.opaque())) {
             double d1 = uAnimatedSub.displayRange().duration();
             double d2 = uAnimatedSub.displayRange().start() - d;
             if (d2 < 0) {
                d1 = d1 + d2;
                d1 = Math.max(d1, 0);
                d2 = 0;
             }
             if (obj.h.p() <= 1 && (obj.a.a1() == Workspace$Type.KTV_SONG && !d2)) {
                d1 = d1 - 0x3ff0000000000000;
                d1 = Math.max(d1, 0);
                d2 = 0x3ff0000000000000;
             }
          label_0165 :
             uAnimatedSub.setDisplayRange(EditorSdk2Utils.createTimeRange(d2, d1));
             b.y(uAnimatedSub, f);
          }
       }
       return;
    }
    public int g(){
       return 1;
    }
}
