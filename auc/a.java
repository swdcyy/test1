package auc.a;
import java.lang.Object;
import androidx.lifecycle.ViewModelProvider;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import uwc.c;
import androidx.lifecycle.ViewModel;
import java.util.Map;
import uwc.a;
import qsc.e;
import t36.f;
import auc.a$a;
import t36.f$a;
import eba.a;
import com.kuaishou.edit.draft.Sticker;
import java.lang.Integer;
import com.kuaishou.edit.draft.StickerResult;
import java.lang.Float;
import java.lang.Number;
import java.lang.Double;
import android.graphics.RectF;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.io.File;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.kwai.feature.post.api.core.model.GSConfig;
import java.lang.Boolean;
import uwc.b;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import androidx.lifecycle.LiveData;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import auc.a$b;
import java.util.Objects;
import swc.f;
import swc.c;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import swc.a;

public final class a	// class@0002cd
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void a(ViewModelProvider p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       a.p(p0, "vmp");
       ViewModel viewModel = p0.get(c.class);
       a.o(viewModel, "get\(T::class.java\)");
       f.p0(viewModel.t0(), e.class).s0(a$a.a);
       return;
    }
    public final void b(a p0,Sticker p1,int p2,int p3){
       Paint paint;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, a.class, "4")) {
          return;
       }
       StickerResult result = p1.getResult();
       String str = "sticker.result";
       a.o(result, str);
       Float uFloat = Float.valueOf(result.getScale());
       int i = 0;
       StickerResult stickerResul = (uFloat.floatValue() - (float)i > 0)? 1: null;
       if (!stickerResul) {
          uFloat = null;
       }
       if (uFloat != null) {
          float f = uFloat.floatValue();
          stickerResul = p1.getResult();
          a.o(stickerResul, str);
          Double uDouble = Double.valueOf(stickerResul.getResourceWidth());
          double d = (double)i;
          double d1 = (uDouble.doubleValue() - d > 0)? Double.MIN_VALUE: 0;
          if (!d1) {
             paint = null;
          }
          if (uDouble != null) {
             d1 = uDouble.doubleValue();
             stickerResul = p1.getResult();
             a.o(stickerResul, str);
             uDouble = Double.valueOf(stickerResul.getResourceHeight());
             if (uDouble.doubleValue() - d > 0) {
                i = 1;
             }
             if (!i) {
                paint = null;
             }
             if (uDouble != null) {
                RectF rectF = new RectF(0, 0, ((float)p2 / f), ((float)p3 / f));
                RectF rectF1 = new RectF(0, 0, (float)d1, (float)uDouble.doubleValue());
                stickerResul = p1.getResult();
                a.o(stickerResul, str);
                float f1 = 2.00f;
                StickerResult result1 = p1.getResult();
                a.o(result1, str);
                rectF1.offsetTo(((rectF.width() * stickerResul.getCenterX()) - (rectF1.width() / f1)), ((rectF.height() * result1.getCenterY()) - (rectF1.height() / f1)));
                if (rectF.contains(rectF1)) {
                   return;
                }else {
                   File uFile = DraftUtils.t(p1.getResult(), p0);
                   if (uFile != null) {
                      a.o(uFile, "DraftUtils.getEffectiveS\x20\x02, stickerDraft\) ?: return\x00");
                      Bitmap uBitmap = BitmapUtil.q(uFile);
                      a.o(uBitmap, "decodeStickerBitmap");
                      Bitmap uBitmap1 = Bitmap.createBitmap(uBitmap.getWidth(), uBitmap.getHeight(), uBitmap.getConfig());
                      Canvas uCanvas = new Canvas(uBitmap1);
                      StickerResult result2 = p1.getResult();
                      a.o(result2, str);
                      StickerResult result3 = p1.getResult();
                      a.o(result3, str);
                      uCanvas.translate((- ((rectF.width() * result2.getCenterX()) - (rectF1.width() / f1))), (- ((rectF.height() * result3.getCenterY()) - (rectF1.height() / f1))));
                      uCanvas.clipRect(rectF);
                      uCanvas.drawBitmap(uBitmap, rectF1.left, rectF1.top, null);
                      BitmapUtil.O(uBitmap1, uFile.getPath(), GSConfig.j());
                      uBitmap.recycle();
                      uBitmap1.recycle();
                      return;
                   }
                }
             }
          }
       }
    label_016f :
       return;
    }
    public final void c(ViewModelProvider p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "6")) {
          return;
       }
       a.p(p0, "vmp");
       ViewModel viewModel = p0.get(b.class);
       a.o(viewModel, "get\(T::class.java\)");
       if (viewModel.t0().getValue() != Workspace$Type.SINGLE_PICTURE || PostExperimentUtils.w()) {
          ViewModel viewModel1 = p0.get(c.class);
          a.o(viewModel1, "get\(T::class.java\)");
          f.p0(viewModel1.t0(), e.class).s0(new a$b(p1));
       }
       return;
    }
    public final void d(ViewModelProvider p0,boolean p1){
       a uoa = a.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "5")) {
          return;
       }
       a.p(p0, "vmp");
       int i = 4;
       String str = "get\(T::class.java\)";
       if (p1) {
          ViewModel viewModel = p0.get(uob);
          a.o(viewModel, str);
          if (viewModel.t0().getValue() != Workspace$Type.SINGLE_PICTURE) {
          label_003a :
             ViewModel viewModel1 = p0.get(uob);
             a.o(viewModel1, str);
             Objects.requireNonNull(viewModel1);
             if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), viewModel1, uob, "15")) {
                Workspace$Type type = viewModel1.x0().q().a1();
                a.o(type, "picturesRepo.workspaceDraft.type");
                viewModel1.D0(type, i);
             }
             return;
          }
       }
       i = -10010;
       goto label_003a ;
    }
}
