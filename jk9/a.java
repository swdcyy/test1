package jk9.a;
import jk9.a$a;
import nsd.u;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import jk9.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.config.CommentAtTailEasterEggConfig;
import wkd.b;
import com.kwai.component.bifrost.BifrostActivityManager;
import com.kwai.component.bifrost.BifrostFeatureActivityEntry;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.comment.config.OldCommentAtTailEasterEggConfig;
import java.lang.reflect.Type;
import java.lang.Boolean;
import com.yxcorp.gifshow.comment.config.CommentAtTailEasterEggDemotionConfig;
import java.lang.Number;
import java.lang.Integer;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.kwai.component.bifrost.res.BifrostImageResourceEntry;
import mrd.a;
import com.kwai.component.bifrost.res.BifrostCommonResourceEntry;
import ek9.m1;
import java.lang.StringBuilder;
import q87.c;
import yca.a;
import yca.a$a;
import java.util.Map;
import jk9.a$b;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import jk9.a$c;
import erd.g;
import crd.b;
import android.content.res.Resources;
import cw9.c;
import uc.d;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import jk9.a$d;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;

public final class a	// class@002af4
{
    public final HashMap a;
    public final CommentAtTailEasterEggConfig b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public static final String f;
    public static final int g;
    public static final a$a h;

    static {
       a.h = new a$a(null);
       a.f = "feed_comment_at_tail";
       a.g = 0x7f070295;
    }
    public void a(QPhoto p0){
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       String str = "photo";
       a.p(p0, str);
       super();
       this.a = new HashMap();
       Object obj = null;
       BifrostFeatureActivityEntry uBifrostFeat = PatchProxy.applyOneRefs(p0, obj, og, "5");
       if (uBifrostFeat != patchProxyRe) {
       }else {
          a.p(p0, str);
          uBifrostFeat = b.a(-1568263472).d("COMMENT_AT_IMAGE_TAIL", p0, CommentAtTailEasterEggConfig.class);
          if (uBifrostFeat == null) {
             OldCommentAtTailEasterEggConfig value = a.t().getValue("commentAtEasterEggConfig", OldCommentAtTailEasterEggConfig.class, obj);
             uBifrostFeat = (value != null)? value.build(p0): obj;
          }
       }
       this.b = uBifrostFeat;
       p0 = PatchProxy.applyOneRefs(uBifrostFeat, obj, og, "2");
       if (p0 != patchProxyRe) {
          b = p0.booleanValue();
       }else if(uBifrostFeat == null){
          b = false;
       }else {
          b = uBifrostFeat.isEffective();
       }
       this.c = b;
       CommentAtTailEasterEggDemotionConfig uCommentAtTa = PatchProxy.apply(obj, obj, og, "6");
       if (uCommentAtTa != patchProxyRe) {
       }else {
          uCommentAtTa = a.t().getValue("commentAtEasterEggDemotionConfig", CommentAtTailEasterEggDemotionConfig.class, obj);
       }
       this.d = g.a(uCommentAtTa);
       Object obj1 = PatchProxy.applyOneRefs(uCommentAtTa, obj, og, "4");
       if (obj1 != patchProxyRe) {
          b = obj1.intValue();
       }else if(uCommentAtTa == null){
          b = 1;
       }else {
          b = g.b(uCommentAtTa.mEnableWolverine, uCommentAtTa.mMidPhoneCommonPerf, Integer.valueOf(uCommentAtTa.mLowPhoneAnimFrameInterval), Integer.valueOf(uCommentAtTa.mMidPhoneAnimFrameInterval), Integer.valueOf(uCommentAtTa.mAnimFrameInterval)).intValue();
       }
       this.e = b;
       return;
    }
    public final Drawable a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       Drawable drawable = ContextCompat.getDrawable(p0, R.drawable.arg_RES_7f080a52);
       a.m(drawable);
       a.o(drawable, "ContextCompat.getDrawabl¡­comment_61surprised_16\)!!");
       drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
       return drawable;
    }
    public final a b(Context p0,BifrostImageResourceEntry p1){
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       a.p(p1, "res");
       String url = p1.getUrl();
       a.m(url);
       obj = this.a.get(url);
       if (obj != null) {
          Object[] objArray = new Object[0];
          m1.C().w("COMMENT_AT_TAIL_TAG", "showCacheImage:"+p1, objArray);
          if (a.g("", p1.getUrl())) {
             a.d.b("comment_tail_image", "image_download_error", "");
          }
          a.o(obj, "it");
          return obj;
       }else {
          obj = a.g();
          a.o(obj, "BehaviorSubject.create<Drawable>\(\)");
          String url1 = p1.getUrl();
          a.m(url1);
          a.o(url1, "res.url!!");
          this.a.put(url1, obj);
          if (p1.isAlreadyWarmup()) {
             t.fromCallable(new a$b(this, p0, p1)).subscribeOn(d.c).observeOn(d.a).subscribe(new a$c(obj));
          }else if(p1.mWarmUpNecessary == null){
             int i = c.b(p0.getResources(), a.g);
             ImageRequestBuilder imageRequest = ImageRequestBuilder.k(Uri.parse(p1.getUrl()));
             imageRequest.v(new d(i, i));
             ImageRequest imageRequest1 = imageRequest.a();
             a$d uod = new a$d(this, i, obj, p1, p0);
             a.d(imageRequest1, v8);
          }
          return obj;
       }
    }
    public final CommentAtTailEasterEggConfig c(){
       return this.b;
    }
    public final boolean d(){
       return this.c;
    }
}
