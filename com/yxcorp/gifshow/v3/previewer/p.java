package com.yxcorp.gifshow.v3.previewer.p;
import erd.o;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import java.util.ArrayList;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import faa.a;
import q87.c;
import com.kuaishou.edit.draft.Workspace$Type;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.HashMap;
import com.yxcorp.gifshow.model.MultiplePhotosProject;
import android.content.Intent;
import com.yxcorp.gifshow.v3.constructor.WorkspaceConstructor;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.EditAbilityConfig;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import lwc.p0;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.v3.previewer.q;
import lwc.c0;
import java.util.List;
import lq.a;
import haa.a;
import pwc.a;
import lwc.o0;
import lwc.y;
import erd.g;
import lwc.z;

public final class p implements o	// class@0015e9
{
    public final PhotosEditPreviewV3Fragment b;
    public final ArrayList c;
    public final ArrayList d;

    public void p(PhotosEditPreviewV3Fragment p0,ArrayList p1,ArrayList p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       p tb = this.b;
       p tc = this.c;
       p td = this.d;
       Objects.requireNonNull(tb);
       Object[] obj = PatchProxy.applyThreeRefs(p0, tc, td, tb, PhotosEditPreviewV3Fragment.class, "59");
       if (obj != PatchProxyResult.class) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          String str = "PhotosEditPreviewV3Fragment";
          a.D().w(str, "constructWorkspace\(\) called", objArray);
          if (tb.V0 == Workspace$Type.SINGLE_PICTURE) {
             p0 = PatchProxy.applyTwoRefs(tc, td, tb, PhotosEditPreviewV3Fragment.class, "60");
             if (p0 != PatchProxyResult.class) {
                obj = p0;
             }else if(tb.Y.o0() != null && tb.Y.o0().E()){
                p0 = new HashMap();
                p0.put("CONSTRUCTOR_PHOTO_PROJECT", new MultiplePhotosProject(""));
                tb.W0 = WorkspaceConstructor.a(tb.Fh(), tb.Y, p0);
                if (EditAbilityConfig.photosInMemory(i.g())) {
                   if (EditAbilityConfig.photosInMemoryBlock(i.g())) {
                      obj = new Object[i];
                      a.D().w(str, "constructSinglePictureWorkspace in memory block", obj);
                      p0 = DraftFileManager.E().k0(tb.Y, i);
                   }else {
                      p0 = t.fromCallable(new p0(tb));
                   }
                }else {
                   p0 = DraftFileManager.E().j0(tb.Y, i);
                }
             }else {
                p0 = t.just(tb.Y);
             }
             obj = p0.observeOn(d.c).flatMap(q.b).observeOn(d.a).flatMap(new c0(tb, tc, td));
          }else {
             MultiplePhotosProject multiplePhot = i.m().p().k();
             if (!(a.c(p0).E() ^ 0x01) && (multiplePhot == null || ("cover_edit").equals(tb.J))) {
                obj = t.fromCallable(new o0(p0)).subscribeOn(d.c).observeOn(d.a).doOnNext(new y(tc, td)).map(new z(p0));
             }else {
                a.b(td, tc, multiplePhot);
                p0 = new HashMap();
                p0.put("CONSTRUCTOR_PHOTO_PROJECT", multiplePhot);
                tb.W0 = WorkspaceConstructor.a(tb.Fh(), tb.Y, p0);
                obj = DraftFileManager.E().j0(tb.Y, i).observeOn(d.a);
             }
          }
       }
       return obj;
    }
}
