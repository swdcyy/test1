package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationExtractText;
import mf5.w0;
import v6a.m0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationExtractText$1;
import msd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import xx9.a;
import kf5.g;
import com.yxcorp.gifshow.detail.ocrtext.OcrFragment;
import com.yxcorp.gifshow.detail.ocrtext.OcrFragment$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import ez9.b;

public final class OperationExtractText extends w0	// class@00147f
{
    public final QPhoto C;
    public final GifshowActivity D;
    public final BaseFragment E;
    public final m0 F;

    public void OperationExtractText(m0 p0){
       a a;
       a.p(p0, "callerContext");
       super("atlasText");
       this.F = p0;
       this.C = p0.c.mPhoto;
       a = p0.a;
       Objects.requireNonNull(a, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       this.D = a;
       this.E = p0.b;
       this.L(R.drawable.arg_RES_7f080b08);
       this.T(R.string.arg_RES_7f100ef6);
       this.O(new OperationExtractText$1(this));
    }
    public boolean E(){
       boolean b;
       m0 obj = PatchProxy.apply(null, this, OperationExtractText.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.C.hasAtlasText()) {
          obj = this.F.r;
          if (obj == null || !obj.c()) {
             b = true;
          label_002b :
             return b;
          }
       }
       b = false;
       goto label_002b ;
    }
    public void d(w0 p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OperationExtractText.class, "2")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       OperationExtractText tC = this.C;
       a.o(tC, "mPhoto");
       OcrFragment ocrFragment = OcrFragment.N.a(tC);
       ocrFragment.Kh(this.E);
       p1.a();
       OperationExtractText tC1 = this.C;
       a.o(tC1, "mPhoto");
       tC = this.E;
       a.o(tC, "mFragment");
       b.a.a(tC1, tC, "TEXT_EXTRACTION");
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, OperationExtractText.class, "3")) {
          return;
       }
       OperationExtractText tC = this.C;
       a.o(tC, "mPhoto");
       OperationExtractText tE = this.E;
       a.o(tE, "mFragment");
       b.a.b(tC, tE, "TEXT_EXTRACTION");
       return;
    }
}
