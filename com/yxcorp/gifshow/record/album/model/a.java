package com.yxcorp.gifshow.record.album.model.a;
import erd.o;
import com.yxcorp.gifshow.publish.ShareProject;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.io.File;
import java.lang.String;
import com.yxcorp.gifshow.record.album.model.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Asset$Type;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Asset$b;
import wba.n0;
import com.yxcorp.gifshow.model.j;
import com.yxcorp.gifshow.localwork.model.LongVideoLocalProject;
import com.kuaishou.edit.draft.TimeRange;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import qaa.a;
import com.kuaishou.edit.draft.Cover$b;
import com.kuaishou.edit.draft.Cover$Type;
import com.kuaishou.edit.draft.VideoCoverParam$b;
import com.kuaishou.edit.draft.VideoCoverParam;
import com.yxcorp.gifshow.edit.draft.model.VideoContextDraftHelper;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import brd.t;
import m8c.a;
import erd.a;

public final class a implements o	// class@00173c
{
    public final ShareProject b;
    public final long c;

    public void a(ShareProject p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       boolean b;
       a tb = this.b;
       a tc = this.c;
       Object obj = p0;
       long l = new File(tb.f()).lastModified();
       if (PatchProxy.applyVoidTwoRefs(tb, obj, null, b.class, "2")) {
       }else {
          p0 = obj.o0();
          b = true;
          if (p0 != null) {
             p0.c0();
             Asset$Type vIDEO = (obj.a1() == Workspace$Type.VIDEO)? Asset$Type.VIDEO: Asset$Type.PICTURE;
             Asset$b uob = p0.b();
             uob.w(vIDEO);
             uob.k(p0.R(tb.f(), b));
             uob.m(n0.e(tb.f()));
             if (vIDEO == Asset$Type.VIDEO) {
                uob = 0;
                float f = (tb instanceof j)? (float)tb.l(): 0;
                float f1 = (f - (float)LongVideoLocalProject.e(false) > 0)? (float)LongVideoLocalProject.e(false): f;
                if (f1 - uob > 0) {
                   uob = p0.k();
                   uob.s(DraftUtils.k(0, (double)(f1 / 1000.00f)));
                   uob.i((double)f);
                }
             }
             p0.g(false);
          }
          if (obj.a1() == Workspace$Type.VIDEO) {
             p0 = BitmapUtil.s(tb.f());
             if (p0 != null) {
                tb = obj.s0();
                if (tb != null) {
                   tb.c0();
                   Cover$b uob1 = tb.b();
                   uob1.h(Cover$Type.VIDEO);
                   VideoCoverParam$b uob2 = VideoCoverParam.newBuilder();
                   uob2.a(0);
                   uob1.i(uob2);
                   uob1.d(tb.M(p0));
                   tb.g(false);
                }
             }
          }
          VideoContextDraftHelper.b(obj, b);
       }
       a uoa = new a(obj, l, tc);
       return DraftFileManager.E().b(obj).doOnComplete(tb);
    }
}
