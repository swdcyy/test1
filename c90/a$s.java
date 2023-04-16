package c90.a$s;
import io.reactivex.g;
import c90.a;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import z80.c;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import brd.g;
import com.kwai.feature.post.api.mediascene.MediaSceneConfig;
import java.lang.CharSequence;
import a90.a;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaiShanAssetTag;
import com.yxcorp.gifshow.util.DateUtils;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.feature.post.api.mediascene.MediaSceneAssetContent;
import java.util.Objects;
import java.io.File;
import qkd.b;
import java.lang.Integer;

public final class a$s implements g	// class@000cf7
{
    public final a b;

    public void a$s(a p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       String str1;
       String[] stringArray;
       List list;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$s.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       o1 oo1 = c.j.t();
       if (oo1 == null) {
          p0.onError(new IllegalStateException("mKuaiShanProject is null"));
          return;
       }else {
          String profileImage = this.b.e.getProfileImage();
          int i = 0;
          a uoa = (profileImage == null || !profileImage.length())? 1: null;
          if (!uoa) {
             a.b.b(KuaiShanAssetTag.PRIMARY_IMAGE.getAssetTag(), profileImage, oo1);
          }
          String str = null;
          if (this.b.e.getReplaceableTimestamp() - str > 0) {
             str1 = DateUtils.j(this.b.e.getReplaceableTimestamp(), "/");
             a.o(str1, "DateUtils.formatTimeYear¡­stamp, DEFAULT_SEPARATOR\)");
             stringArray = new String[]{"/"};
             list = StringsKt__StringsKt.H4(str1, stringArray, false, 0, 6, null);
          }else if(this.b.e.getReplaceableTimestamp() - str < 0){
             str1 = DateUtils.m();
             a.o(str1, "DateUtils.getCurrentYearMonthDay\(\)");
             stringArray = new String[]{"."};
             list = StringsKt__StringsKt.H4(str1, stringArray, false, 0, 6, null);
          }else {
             list = CollectionsKt__CollectionsKt.E();
          }
          if ((list.isEmpty() ^ 1) && list.size() == 3) {
             this.b.h(KuaiShanAssetTag.DATE_YEAR.getAssetTag(), list.get(i), oo1);
             this.b.h(KuaiShanAssetTag.DATE_MONTH.getAssetTag(), list.get(1), oo1);
             this.b.h(KuaiShanAssetTag.DATE_DAY.getAssetTag(), list.get(2), oo1);
          }
          profileImage = this.b.e.getCityName();
          if (profileImage == null || !profileImage.length()) {
             i = 1;
          }
          if (!i) {
             String cityName = this.b.e.getCityName();
             a.m(cityName);
             this.b.h(KuaiShanAssetTag.LOCATION.getAssetTag(), cityName, oo1);
          }
          Iterator iterator = this.b.e.getAssetContents().entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             Object obj = uEntry.getKey();
             MediaSceneAssetContent mAssetType = uEntry.getValue().mAssetType;
             MediaSceneAssetContent mContent = uEntry.getValue().mContent;
             profileImage = "assetContent";
             if (mAssetType != 1) {
                if (mAssetType != 2) {
                   if (mAssetType != 3) {
                      if (mAssetType != 4) {
                         if (mAssetType != 5) {
                            continue ;
                         }
                      }
                   }
                   a.o(mContent, profileImage);
                   a.b.b(obj, mContent, oo1);
                }else {
                   a$s tb = this.b;
                   a.o(mContent, profileImage);
                   Objects.requireNonNull(tb);
                   if (PatchProxy.applyVoidThreeRefs(obj, mContent, oo1, tb, a.class, "8")) {
                      continue ;
                   }else {
                      profileImage = tb.c.get(mContent);
                      if (profileImage != null && b.S(new File(profileImage))) {
                         a.b.b(obj, profileImage, oo1);
                      }
                   }
                }
             }
             a.o(mContent, profileImage);
             this.b.h(obj, mContent, oo1);
          }
          p0.onNext(Integer.valueOf(100));
          p0.onComplete();
          return;
       }
    }
}
