package nfd.y1;
import erd.o;
import com.yxcorp.plugin.search.utils.SearchLiveDanmakuHelper;
import java.lang.Object;
import com.yxcorp.plugin.search.result.danmu.SearchLiveCommentBulletsResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.yxcorp.plugin.search.result.danmu.SearchLiveCommentBulletsResponse$Comment;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.plugin.search.entity.result.SpecialDanmuku;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.j;

public final class y1 implements o	// class@001e27
{
    public final SearchLiveDanmakuHelper b;

    public void y1(SearchLiveDanmakuHelper p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       SearchLiveCommentBulletsResponse$Comment uComment;
       y1 tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.mComments;
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, tb, SearchLiveDanmakuHelper.class, "9");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = Lists.b();
          if (tb.r != null) {
             uComment = new SearchLiveCommentBulletsResponse$Comment();
             UserInfo userInfo = new UserInfo();
             SearchLiveDanmakuHelper r = tb.r;
             userInfo.mHeadUrls = r.mCDNUrls;
             uComment.mUserInfo = userInfo;
             uComment.mContent = r.mText;
             uComment.isRedBackground = true;
             uArrayList.add(uComment);
          }
          if (p0 != null) {
             p0 = p0.iterator();
             while (p0.hasNext()) {
                SearchLiveCommentBulletsResponse$Comment uComment1 = p0.next();
                if (uComment1 != null && !TextUtils.x(uComment1.mContent)) {
                   uComment = uComment1.mUserInfo;
                   if (uComment != null && !j.h(uComment.mHeadUrls)) {
                      uArrayList.add(uComment1);
                   }
                }
             }
          }
       }
       return uArrayList;
    }
}
