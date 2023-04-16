package nfd.z0;
import java.lang.Object;
import com.yxcorp.plugin.search.entity.SearchItem;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateLiveFeed;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.search.entity.template.aggregate.PhotoSourceMeta;
import tl8.d;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateCommodityFeed;
import java.lang.Boolean;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplatePhotoFeed;
import com.yxcorp.plugin.search.response.SearchResultResponse;
import java.util.ArrayList;
import com.yxcorp.plugin.search.response.BaseSearchResultResponse;
import com.yxcorp.gifshow.util.rx.RxBus;
import jsa.c;

public class z0	// class@001e2b
{

    public void z0(){
       super();
    }
    public static void a(SearchItem p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, z0.class, "7")) {
          return;
       }
       if (!q.f(p0.mPhotos)) {
          p1.addAll(p0.mPhotos);
       }
       SearchItem mPhoto = p0.mPhoto;
       if (mPhoto != null) {
          p1.add(mPhoto);
       }
       if (!q.f(p0.mKBoxBaseItems)) {
          Iterator iterator = p0.mKBoxBaseItems.iterator();
          while (iterator.hasNext()) {
             KBoxItem kBoxItem = iterator.next();
             if (!PatchProxy.applyVoidTwoRefs(kBoxItem, p1, null, z0.class, "8") && !q.f(kBoxItem.mKBoxFeeds)) {
                Iterator iterator1 = kBoxItem.mKBoxFeeds.iterator();
                while (iterator1.hasNext()) {
                   TemplateBaseFeed templateBase = iterator1.next();
                   if (templateBase instanceof TemplateLiveFeed) {
                      TemplateLiveFeed mQphoto = templateBase.mQphoto;
                      if (mQphoto != null) {
                         p1.add(mQphoto);
                      }else {
                         continue ;
                      }
                   }else {
                      continue ;
                   }
                }
             }
          }
       }
       return;
    }
    public static String b(TemplateBaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, z0.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || p0.a(PhotoSourceMeta.class) == null) {
          return "";
       }
       return p0.a(PhotoSourceMeta.class).mSourceType;
    }
    public static QPhoto c(TemplateBaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, z0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.a(QPhoto.class);
    }
    public static boolean d(TemplateBaseFeed p0){
       return p0 instanceof TemplateCommodityFeed;
    }
    public static boolean e(TemplateBaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, z0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 instanceof TemplatePhotoFeed) {
          TemplatePhotoFeed mQphoto = p0.mQphoto;
          if (mQphoto != null && mQphoto.isImageType()) {
             b = true;
          }
       }
       return b;
    }
    public static boolean f(TemplateBaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, z0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 instanceof TemplateLiveFeed) {
          TemplateLiveFeed mQphoto = p0.mQphoto;
          if (mQphoto != null && mQphoto.isLiveStream()) {
             b = true;
          }
       }
       return b;
    }
    public static boolean g(TemplateBaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, z0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 instanceof TemplatePhotoFeed) {
          TemplatePhotoFeed mQphoto = p0.mQphoto;
          if (mQphoto != null && mQphoto.isVideoType()) {
             b = true;
          }
       }
       return b;
    }
    public static void h(SearchResultResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, z0.class, "6")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       if (!q.f(p0.mNormalItems)) {
          Iterator iterator = p0.mNormalItems.iterator();
          while (iterator.hasNext()) {
             z0.a(iterator.next(), uArrayList);
          }
       }
       if (!q.f(p0.mRecoItems)) {
          Iterator iterator1 = p0.mRecoItems.iterator();
          while (iterator1.hasNext()) {
             z0.a(iterator1.next(), uArrayList);
          }
       }
       RxBus.f.b(new c(uArrayList, null, 20, 7));
       return;
    }
}
