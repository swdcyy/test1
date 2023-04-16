package com.yxcorp.gifshow.follow.stagger.post.b;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.post.g;
import r26.a;
import com.yxcorp.gifshow.postwork.PostStatus;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.util.Map;
import h8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import tkd.b;
import tkd.d;
import qw5.a;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.PhotoMeta;
import kp.r1;
import w26.c;
import lnc.x6;
import lnc.y6;
import android.content.Context;
import lnc.a1;
import java.util.List;
import com.yxcorp.gifshow.follow.stagger.post.g$c;
import java.lang.Enum;
import e17.i;
import java.lang.Boolean;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import bja.w;
import erd.a;
import bja.z;
import com.yxcorp.gifshow.follow.stagger.post.e;
import crd.b;

public final class b implements g	// class@0011d8
{
    public final g b;
    public final a c;
    public final PostStatus d;

    public void b(g p0,a p1,PostStatus p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       int i;
       b tb = this.b;
       b tc = this.c;
       b td = this.d;
       g og = g.class;
       if (tb.e(tc) && tc.getStatus() == PostStatus.UPLOAD_COMPLETE) {
          tb.i.remove(tc.getCacheId());
       }else {
          tb.i.put(tc.getCacheId(), p0);
       }
       PostStatus uPLOAD_COMPL = PostStatus.UPLOAD_COMPLETE;
       if (tc.getStatus() == uPLOAD_COMPL && !tb.e(tc)) {
          i = 0;
          Object[] objArray = new Object[i];
          a.C().w("MockFeedRepoImp", "onStatusChanged on complete PhotoId="+p0.getPhotoId()+" getCacheId="+tc.getCacheId(), objArray);
          tb.k.put(tc.getCacheId(), p0);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, og, "5")) {
             Object[] objArray1 = new Object[i];
             a.C().w("MockFeedRepoImp", "setLastCompleteFriendTabMockFeed\(\) photo.isPublic="+p0.isPublic(), objArray1);
             tb.l = (p0.isPublic())? p0: null;
          }
       }
    label_00a2 :
       if (td == uPLOAD_COMPL) {
          boolean b = true;
          if (KwaiOp.MOMENT == tc.getShareOption()) {
             d.a(0x27ae02e4).qg(ActivityContext.g().e(), b, tc.getUploadInfo());
          }else {
             KwaiOp shareOption = tc.getShareOption();
             if (PatchProxy.applyVoidTwoRefs(p0, shareOption, tb, og, "26") || (r1.u1(p0.mEntity) != null && shareOption != KwaiOp.NONE)) {
                c uoc = y6.r(c.class);
                if (uoc != null && uoc.VQ(a1.c()).contains(shareOption)) {
                   int i1 = g$c.a[shareOption.ordinal()];
                   int i2 = 0x7f11066a;
                   if (i1 != b && i1 != 2) {
                      if (i1 != 3 && i1 != 4) {
                         if (i1 == 5) {
                            i.a(i2, R.string.arg_RES_7f103def);
                         }
                      }else {
                         i.a(i2, R.string.arg_RES_7f103dec);
                      }
                   }else {
                      i.a(i2, R.string.arg_RES_7f103dee);
                   }
                   tb.b();
                   tb.c = t.just(Boolean.TRUE).delay(3000, TimeUnit.MILLISECONDS).observeOn(d.a).doFinally(new w(tb)).subscribe(new z(p0, shareOption), e.b);
                }
             }
          }
       }
       return;
    }
}
