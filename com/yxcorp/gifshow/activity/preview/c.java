package com.yxcorp.gifshow.activity.preview.c;
import erd.o;
import com.kuaishou.edit.draft.Workspace;
import com.yxcorp.gifshow.encode.EncodeRequest$a;
import java.io.File;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.Encode;
import java.lang.String;
import lnc.i1;
import com.yxcorp.gifshow.activity.preview.f;
import java.util.Map;
import com.kwai.feature.post.api.feature.encode.model.VideoEncodeSDKInfo;
import wba.d0;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import tkd.b;
import tkd.d;
import za9.c;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import jw8.h;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;

public final class c implements o	// class@001361
{
    public final Workspace b;
    public final EncodeRequest$a c;
    public final File d;
    public final Workspace$Type e;
    public final Workspace$Source f;
    public final VideoContext g;
    public final c h;
    public final boolean i;

    public void c(Workspace p0,EncodeRequest$a p1,File p2,Workspace$Type p3,Workspace$Source p4,VideoContext p5,c p6,boolean p7){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
    }
    public final Object apply(Object p0){
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       c te = this.e;
       c tf = this.f;
       c tg = this.g;
       c th = this.h;
       c ti = this.i;
       List assetsList = tb.getAssetsList();
       if (assetsList != null) {
          ArrayList uArrayList = new ArrayList(assetsList.size());
          Iterator iterator = assetsList.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().getEncodeInfo().getParamsKey());
          }
          tc.g(uArrayList);
       }else {
          i1.a("PreviewEncodeUtil", "read EncodeProfiles with empty assets");
       }
       tc.r(td.getAbsolutePath());
       tc.e(f.g(te, tf, tg));
       tc.y(f.b(th, p0, null));
       tc.B(d0.m(p0, th));
       tc.j(d0.k(p0, th));
       boolean b = true;
       tc.k(b);
       boolean b1 = (te == Workspace$Type.PHOTO_MOVIE || (te == Workspace$Type.KTV_SONG && !th.d1().H()))? true: false;
       tc.n(b1);
       b1 = (tf != Workspace$Source.IMPORT && (!DraftUtils.n0(tf) && (tf != Workspace$Source.IMPORT_CLIP && (tf != Workspace$Source.SHARE && (tb.getType() == Workspace$Type.ALBUM_MOVIE || tb.getType() == Workspace$Type.AI_CUT)))))? true: false;
       tc.m(b1);
       if (ti == null || !f.k(tb)) {
          b = false;
       }
       tc.o(b);
       if (te == Workspace$Type.KTV_MV || te == Workspace$Type.KTV_SONG) {
          b = d.a(0x2f45bb3a).rn(th);
          tc.p(b);
          if (te == Workspace$Type.KTV_SONG) {
             b = t.fromCallable(new h(tc, b)).subscribeOn(d.c).observeOn(d.a);
          label_00f5 :
             return b;
          }
       }
       b = t.just(tc);
       goto label_00f5 ;
    }
}
