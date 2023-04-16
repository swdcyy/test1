package com.yxcorp.gifshow.edit.previewer.loaderv2.x;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import iba.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.Workspace$Type;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Theme;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import wba.m0;
import kotlin.jvm.internal.a;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.yxcorp.gifshow.edit.previewer.loaderv2.MusicLoaderV2;
import com.yxcorp.gifshow.edit.previewer.loaderv2.n;

public class x extends a	// class@001b55
{
    public a$a h;
    public a i;

    public void x(){
       super();
    }
    public void c(a$a p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, x.class, "1")) {
          return;
       }
       this.h = p0;
       this.i = this.a.X0();
       return;
    }
    public void d(){
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, x.class, str)) {
          return;
       }
       Theme theme = this.i.v();
       if (this.a.a1() != Workspace$Type.PHOTO_MOVIE) {
          return;
       }
       if (this.b.isKwaiPhotoMovie()) {
          a tb = this.b;
          if (!PatchProxy.applyVoidOneRefs(tb, objArray, m0.class, str)) {
             a.p(tb, "project");
             ImmutableArray immutableArr = tb.trackAssets();
             if (immutableArr != null) {
                Iterator iterator = immutableArr.iterator();
                while (iterator.hasNext()) {
                   iterator.next().setClippedRange(EditorSdk2UtilsV2.createTimeRange(0, 2.00f));
                }
             }
          }
       }
       if (theme == null) {
          return;
       }else {
          int i = 0;
          if (theme.getUsingMusics()) {
             MusicLoaderV2 musicLoaderV = new MusicLoaderV2();
             Object[] objArray1 = new Object[i];
             musicLoaderV.b(this.h, objArray1);
             musicLoaderV.d();
          }
          if (theme.getUsingFilters()) {
             n on = new n();
             objArray = new Object[i];
             on.b(this.h, objArray);
             on.d();
          }
          return;
       }
    }
    public int g(){
       return 1;
    }
}
