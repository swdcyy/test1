package nfd.c3;
import java.lang.Object;
import android.widget.ImageView;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.ImageMeta;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import b06.e;
import com.kwai.components.feedmodel.feed.KaraokeModel$KaraokeInfo;
import com.kuaishou.android.model.mix.ImageMetaExt;
import kp.w1;
import com.kwai.component.imageextension.util.ImageMetaImagePrefetchUtil;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateIcon;
import com.yxcorp.gifshow.model.CDNUrl;
import ekd.j;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.plugin.search.entity.TemplateText;
import java.lang.CharSequence;
import nfd.o3;
import android.app.Activity;
import android.view.View;
import java.lang.Runnable;
import com.yxcorp.utility.TextUtils;
import nfd.c3$a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.kuaishou.android.model.feed.SearchParams;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import nfd.q2$a;
import com.yxcorp.gifshow.model.config.ActivityInfo;
import flb.a;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import gw8.a;
import com.yxcorp.plugin.search.entity.SearchItem$SearchItemType;

public final class c3	// class@001d98
{

    public void c3(){
       super();
    }
    public static void a(ImageView p0,QPhoto p1,PhotoMeta p2,ImageMeta p3,BaseFeed p4){
       int i;
       c3 uoc3 = c3.class;
       if (PatchProxy.isSupport(uoc3)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uoc3, "7")) {
             return;
          }
       }
       if (p2 == null) {
       label_0026 :
          i = 0;
       }else {
          Object obj = PatchProxy.applyThreeRefs(p1, p2, p3, null, c3.class, "8");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else if(p1.isChorus()){
             i = e.a();
          }else if(p2.getKaraokeInfo() != null){
             i = 0x7f08099d;
          }else if(p1.isArticle()){
             i = 0x7f08099b;
          }else if(p3 == null){
             goto label_0026 ;
          }else if(ImageMetaExt.isAtlasPhotos(p3)){
             i = 0x7f080dbb;
          }else if(ImageMetaExt.isLongPhotos(p3)){
             i = 0x7f080dc0;
          }else {
             goto label_0026 ;
          }
       }
       if (i) {
          p0.setVisibility(0);
          p0.setImageResource(i);
       }else {
          p0.setVisibility(8);
       }
       if (p3 != null && (ImageMetaExt.isAtlasPhotos(p3) || ImageMetaExt.isLongPhotos(p3))) {
          ImageMetaImagePrefetchUtil.prefetchAtlas(p3, w1.m(p4), 0, 1);
       }
       return;
    }
    public static void b(KwaiImageView p0,TextView p1,TemplateIcon p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, c3.class, "12")) {
          return;
       }
       if (p2 == null || j.h(p2.getIconUrls())) {
          if (p0 != null) {
             p0.setVisibility(8);
          }
       }else if(p0 != null){
          p0.setVisibility(0);
          p0.U(p2.getIconUrls());
       }
       if (p2 != null) {
          TemplateIcon mAladdinText = p2.mAladdinText;
          if (mAladdinText != null) {
             o3.G(p1, mAladdinText.mText);
          }else if(p1 != null){
             p1.setVisibility(8);
          }
       }else {
          goto label_003d ;
       }
       return;
    }
    public static void c(Activity p0,View p1,String p2,Runnable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, c3.class, "4")) {
          return;
       }
       if (p0 == null || TextUtils.x(p2)) {
          p1.setOnClickListener(null);
          return;
       }else {
          p1.setOnClickListener(new c3$a(p3, p0, p2));
          return;
       }
    }
    public static q2$a d(QPhoto p0,SearchItem p1,SearchParams p2,View p3,BaseFragment p4){
       q2$a obj;
       c3 uoc3 = c3.class;
       if (PatchProxy.isSupport(uoc3)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, null, uoc3, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new q2$a();
       obj.d(p0);
       obj.e(p1);
       obj.i = p0.getLiveStreamId();
       obj.f(p2);
       obj.b(p3);
       obj.h(p3.getMeasuredWidth());
       obj.g(p3.getMeasuredHeight());
       obj.c(p4);
       return obj;
    }
    public static ActivityInfo e(String p0){
       c3 uoc3 = c3.class;
       Object obj = null;
       List obj1 = PatchProxy.applyOneRefs(p0, obj, uoc3, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = a.e.a();
       if (!PatchProxy.applyVoidOneRefs(obj1, obj, uoc3, "3") && !q.f(obj1)) {
          Iterator iterator = obj1.iterator();
          while (iterator.hasNext()) {
             if (iterator.next() == null) {
                iterator.remove();
             }
          }
       }
       return a.b(obj1, p0);
    }
    public static boolean f(SearchItem p0){
       boolean b = (p0.mItemType == SearchItem$SearchItemType.KBOX)? true: false;
       return b;
    }
}
