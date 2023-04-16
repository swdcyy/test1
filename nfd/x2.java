package nfd.x2;
import erd.o;
import com.yxcorp.plugin.search.utils.f0;
import com.yxcorp.plugin.search.entity.SearchItem;
import java.lang.Object;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.lang.Boolean;
import com.yxcorp.plugin.search.entity.SearchItem$SearchItemType;
import wkd.b;
import ip.b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Collection;
import ekd.q;
import com.yxcorp.plugin.search.entity.ExtInfo;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$NegativeReason;
import com.yxcorp.plugin.search.entity.SearchFeedBackEntity;
import com.kuaishou.android.model.mix.QRecoTag;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class x2 implements o	// class@001e23
{
    public final f0 b;
    public final SearchItem c;

    public void x2(f0 p0,SearchItem p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       boolean b;
       x2 tb = this.b;
       x2 tc = this.c;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = PatchProxy.applyTwoRefs(p0, tc, tb, f0.class, "7");
       if (str != patchProxyRe) {
       }else {
          str = null;
          FeedNegativeFeedback$NegativeReason obj = PatchProxy.applyOneRefs(tc, tb, f0.class, "8");
          int i = 0;
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(tc.mItemType != SearchItem$SearchItemType.PHOTO){
             Object obj1 = PatchProxy.applyOneRefs(tc, tb, f0.class, "10");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else if(tc.mItemType == SearchItem$SearchItemType.AD_PHOTO && b.a(-570058679).n(tc.getCurrentPhoto())){
                b = true;
             }else {
                b = false;
             }
             if (!b) {
                SearchItem mItemType1 = tc.mItemType;
                if (mItemType1 == SearchItem$SearchItemType.KBOX || (mItemType1 != SearchItem$SearchItemType.TYPE_COLLECTION && mItemType1 != SearchItem$SearchItemType.TYPE_COLLECTION_PUZZLE)) {
                   b = false;
                }
             }
          }
       label_006f :
          b = true;
          if (b) {
             FeedNegativeFeedback mPhotoReason = p0.mPhotoReasons;
             if (!PatchProxy.applyVoidTwoRefs(mPhotoReason, tc, tb, f0.class, "9") && !q.f(mPhotoReason)) {
                SearchItem mExtInfo = tc.mExtInfo;
                if (mExtInfo != null && mExtInfo.mSearchFeedBackEntity != null) {
                   ArrayList uArrayList = new ArrayList();
                   obj = new FeedNegativeFeedback$NegativeReason();
                   obj.mDetailReason = tc.mExtInfo.mSearchFeedBackEntity.mUnInterestList;
                   FeedNegativeFeedback$NegativeReason negativeReas = new FeedNegativeFeedback$NegativeReason();
                   SearchFeedBackEntity mContentList = tc.mExtInfo.mSearchFeedBackEntity.mContentList;
                   ArrayList uArrayList1 = new ArrayList();
                   if (!q.f(mContentList)) {
                      uArrayList1.addAll(mContentList);
                   }
                   SearchFeedBackEntity mOtherConten = tc.mExtInfo.mSearchFeedBackEntity.mOtherContent;
                   if (mOtherConten != null) {
                      mOtherConten.mIsEditTag = true;
                      uArrayList1.add(mOtherConten);
                   }
                   negativeReas.mDetailReason = uArrayList1;
                   uArrayList.add(obj);
                   uArrayList.add(negativeReas);
                   if (mPhotoReason.size() == uArrayList.size()) {
                      while (i < mPhotoReason.size()) {
                         if (!q.f(uArrayList.get(i).mDetailReason)) {
                            mPhotoReason.get(i).mDetailReason = uArrayList.get(i).mDetailReason;
                         }
                         i = i + 1;
                      }
                   }
                }
             }
             p0 = p0.mPhotoReasons;
          }else {
             SearchItem mItemType = tc.mItemType;
             if (mItemType == SearchItem$SearchItemType.LIVE_STREAM) {
                p0 = p0.mLiveReasons;
             }else if(mItemType == SearchItem$SearchItemType.RELATION_SEARCH){
                p0 = p0.mRsReasons;
             }else if(q.f(str) || PatchProxy.applyVoidOneRefs(str, tb, f0.class, "13")){
                p0 = str.iterator();
                while (p0.hasNext()) {
                   if (TextUtils.x(p0.next().mTitle)) {
                      p0.remove();
                   }
                }
             }
          }
          str = p0;
          goto label_0112 ;
       }
       return str;
    }
}
