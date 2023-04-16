package androidx.recyclerview.widget.SlideVerticalAtlasPlayer$b$a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewGroup;
import com.kwai.component.photo.detail.core.atlas.SlideAtlasItemView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer$b$a$e;
import android.view.View$OnLayoutChangeListener;
import android.widget.FrameLayout;
import java.lang.Integer;
import java.lang.Number;
import android.view.ViewParent;
import java.util.Objects;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import java.lang.Float;
import id5.t;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer$b$a$a;
import java.lang.Runnable;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer$b$a$b;
import com.yxcorp.gifshow.entity.QPhoto;
import ud5.c;
import ud5.d;
import id5.v;
import q87.c;
import com.kuaishou.android.model.feed.ImageFeed;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer$b$a$c;
import ub.b;
import java.util.List;
import com.kuaishou.android.model.mix.ImageMeta;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer$b$a$d;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.facebook.drawee.view.DraweeView;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import s0d.f;
import java.util.Collection;
import s0d.a;
import s0d.e;
import com.facebook.imagepipeline.request.ImageRequest;
import pb.d;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.android.model.mix.ImageMeta$Atlas;
import ekd.j;
import jd5.b;

public final class SlideVerticalAtlasPlayer$b$a extends RecyclerView$ViewHolder	// class@0008c8
{
    public final View$OnLayoutChangeListener a;
    public ImageMeta$AtlasCoverSize b;
    public final ViewGroup c;
    public final SlideAtlasItemView d;

    public void SlideVerticalAtlasPlayer$b$a(ViewGroup p0,SlideAtlasItemView p1){
       a.p(p0, "container");
       a.p(p1, "view");
       super(p1);
       this.c = p0;
       this.d = p1;
       SlideVerticalAtlasPlayer$b$a$e uob$a$e = new SlideVerticalAtlasPlayer$b$a$e(this);
       this.a = uob$a$e;
       p1.addOnLayoutChangeListener(uob$a$e);
    }
    public final void a(){
       int i;
       Float uFloat;
       SlideVerticalAtlasPlayer$b$a tc = this.c;
       int measuredWidt = tc.getMeasuredWidth();
       Integer integer = Integer.valueOf(tc.getMeasuredHeight());
       Integer integer1 = Integer.valueOf(0);
       float f = (integer.intValue() > 0)? Float.MIN_VALUE: 0;
       String str = null;
       if (!f) {
          integer = str;
       }
       if (integer != null) {
          i = integer.intValue();
       }else {
          ViewParent parent = tc.getParent();
          Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
          i = parent.getMeasuredHeight();
       }
       SlideVerticalAtlasPlayer$b$a tb = this.b;
       if (tb != null) {
          uFloat = Float.valueOf(tb.mWidth);
          SlideVerticalAtlasPlayer$b$a uob$a = (uFloat.floatValue() - (float)0 > 0)? 1: null;
          if (!uob$a) {
             uFloat = str;
          }
          if (uFloat != null) {
          label_0056 :
             int i1 = uFloat.intValue();
             uob$a = this.b;
             if (uob$a != null) {
                Float uFloat1 = Float.valueOf(uob$a.mHeight);
                String str1 = (uFloat1.floatValue() - (float)0 > 0)? 1: null;
                if (str1) {
                   str = uFloat1;
                }
                if (str != null) {
                   integer1 = str;
                }
             }
             int i2 = integer1.intValue();
             t ot = (measuredWidt > 0 && (i > 0 && (i1 > 0 && (i2 > 0 && t.b(measuredWidt, i)))))? 1: null;
             if (!ot) {
                ViewGroup$LayoutParams layoutParams = this.d.getImageView().getLayoutParams();
                if (layoutParams.width != -1 || layoutParams.height != -2) {
                   layoutParams.width = -1;
                   layoutParams.height = -2;
                }
                this.d.post(new SlideVerticalAtlasPlayer$b$a$a(this));
                Log.b("VerticalAtlasPlayer", "adjustCoverSize "+this.getAbsoluteAdapterPosition()+" by default");
             }else {
                int[] ointArray = new int[]{i1,i2};
                int[] ointArray1 = new int[]{measuredWidt,i};
                Integer[] integerArray = t.a.a(ointArray, ointArray1);
                ViewGroup$LayoutParams layoutParams1 = this.d.getImageView().getLayoutParams();
                layoutParams1.width = integerArray[0].intValue();
                layoutParams1.height = integerArray[1].intValue();
                this.d.post(new SlideVerticalAtlasPlayer$b$a$b(this));
                Log.b("VerticalAtlasPlayer", "adjustCoverSize "+this.getAbsoluteAdapterPosition()+" by fold : cover:  "+integerArray[0].intValue()+' '+integerArray[1].intValue()+' ');
             }
             return;
          }
       }
       uFloat = integer1;
       goto label_0056 ;
    }
    public final void b(QPhoto p0,int p1,c p2,d p3){
       a.p(p0, "photo");
       Object[] objArray = new Object[0];
       v.C().s("VerticalAtlasPlayer", "bind: "+p1, objArray);
       QPhoto mEntity = p0.mEntity;
       Objects.requireNonNull(mEntity, "null cannot be cast to non-null type com.kuaishou.android.model.feed.ImageFeed");
       this.c(mEntity, p1, new SlideVerticalAtlasPlayer$b$a$c(p1, p2, p3));
       p0 = p0.mEntity;
       Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kuaishou.android.model.feed.ImageFeed");
       this.e(p0, p1);
    }
    public final void c(ImageFeed p0,int p1,b p2){
       float f1;
       List atlasPhotosC = p0.mImageModel.getAtlasPhotosCdn(p1);
       ImageMeta$AtlasCoverSize atlasSize = p0.mImageModel.getAtlasSize(p1);
       this.b = atlasSize;
       this.a();
       ViewTreeObserver viewTreeObse = this.d.getImageView().getViewTreeObserver();
       if (viewTreeObse != null) {
          viewTreeObse.addOnGlobalLayoutListener(new SlideVerticalAtlasPlayer$b$a$d(this));
       }
       if (atlasPhotosC != null && atlasSize != null) {
          ImageMeta$AtlasCoverSize mWidth = atlasSize.mWidth;
          float f = 0;
          if (mWidth - f) {
             atlasSize = atlasSize.mHeight;
             if (atlasSize - f) {
                f1 = mWidth / atlasSize;
             label_003a :
                this.d.getImageView().setAspectRatio(f1);
                int measuredWidt = this.c.getMeasuredWidth();
                a$a uoa = a.d();
                uoa.d(ImageSource.DETAIL_ATLAS);
                e[] uoeArray = f.x().q(atlasPhotosC).o(measuredWidt, (int)((float)measuredWidt / f1)).w();
                a.o(uoeArray, "KwaiImageRequestGroupBui¡­         .buildRequests\(\)");
                KwaiImageView imageView = this.d.getImageView();
                d uod = this.d.getImageView().g0(p2, uoa.a(), uoeArray);
                AbstractDraweeController uAbstractDra = (uod != null)? uod.e(): null;
                imageView.setController(uAbstractDra);
             }
          }
          f1 = 0x3f800000;
          goto label_003a ;
       }
       return;
    }
    public final SlideAtlasItemView d(){
       return this.d;
    }
    public final void e(ImageFeed p0,int p1){
       ImageMeta imageMeta = r1.W0(p0);
       if (imageMeta != null) {
          a.o(imageMeta, "FeedExt.getImageBean\(photo\) ?: return");
          ImageMeta mAtlas = imageMeta.mAtlas;
          if (mAtlas == null || (!j.h(mAtlas.mList) && p1 == (imageMeta.mAtlas.mList.length - 1))) {
             b.a(imageMeta, 0, 3);
          }
       }
       return;
    }
}
