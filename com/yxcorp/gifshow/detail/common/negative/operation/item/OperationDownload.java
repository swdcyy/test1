package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDownload;
import mf5.w0;
import v6a.m0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDownload$1;
import msd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.entity.QPhoto;
import kf5.g;
import mhc.l2;
import brd.a0;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDownload$a;
import erd.r;
import brd.m;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDownload$b;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class OperationDownload extends w0	// class@00147d
{
    public final GifshowActivity C;
    public final BaseFragment D;
    public final QPhoto E;
    public final m0 F;

    public void OperationDownload(m0 p0){
       a a;
       a.p(p0, "callerContext");
       super("download");
       this.F = p0;
       a = p0.a;
       Objects.requireNonNull(a, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       this.C = a;
       this.D = p0.b;
       this.E = p0.c.mPhoto;
       this.L(R.drawable.arg_RES_7f08052e);
       this.T(R.string.arg_RES_7f100f19);
       this.O(new OperationDownload$1(this));
       this.V(R.drawable.arg_RES_7f080aeb);
       this.J(false);
    }
    public int C(){
       return 3;
    }
    public boolean D(){
       QCurrentUser obj = PatchProxy.apply(null, this, OperationDownload.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = QCurrentUser.ME;
       a.o(obj, "QCurrentUser.ME");
       return obj.isLogined();
    }
    public boolean E(){
       boolean b;
       OperationDownload obj = PatchProxy.apply(null, this, OperationDownload.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.E;
       a.o(obj, "photo");
       if (obj.isAllowPhotoDownload()) {
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          if (mE.isLogined()) {
             b = true;
          label_0031 :
             return b;
          }
       }
       b = false;
       goto label_0031 ;
    }
    public void d(w0 p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OperationDownload.class, "3")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       this.e(l2.a.a().t(OperationDownload$a.b).y(new OperationDownload$b(this, p1), Functions.d()));
       return;
    }
    public void onShow(){
    }
}
