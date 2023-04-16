package cy1.e;
import lf3.g;
import com.kuaishou.live.common.core.component.topbar.topuser.i;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveWatchingList;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.watchingcount.updater.WatchingCountData;
import com.kuaishou.live.common.core.component.watchingcount.updater.WatchingCountData$SourceType;
import java.util.LinkedList;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$WatchingListUserInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserExtraInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Collection;
import java.lang.Long;
import java.lang.Boolean;
import lf3.f;

public final class e implements g	// class@001eae
{
    public final i b;

    public void e(i p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       int i;
       e tb = this.b;
       Objects.requireNonNull(tb);
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, oi, "14")) {
       }else {
          tb.t9(new WatchingCountData(WatchingCountData$SourceType.SC_LIVE_WATCHING_LIST, p0.watchingCount, p0.displayWatchingCount));
          LinkedList linkedList = new LinkedList();
          i = 0;
          LiveStreamMessages$SCLiveWatchingList watchingUser = p0.watchingUser;
          while (i < watchingUser.length) {
             object oobject = watchingUser[i];
             UserInfo userInfo = PatchProxy.applyOneRefs(oobject, null, oi, "25");
             if (userInfo != PatchProxyResult.class) {
             }else {
                userInfo = UserInfo.convertFromProto(oobject.user);
                if (userInfo.mExtraInfo == null) {
                   userInfo.mExtraInfo = new UserExtraInfo();
                }
                UserInfo mExtraInfo = userInfo.mExtraInfo;
                mExtraInfo.mOffline = oobject.offline;
                mExtraInfo.mIsTopPayingUser = oobject.tuhao;
                mExtraInfo.mAssistantType = oobject.liveAssistantType;
                userInfo.mExtraInfo.mDisplayScore = (!TextUtils.x(oobject.displayScore))? oobject.displayScore: oobject.displayKsCoin;
                userInfo.mExtraInfo.mDisplayWatchDuration = oobject.displayWatchDuration;
                b.Z(LiveLogTag.TOP_USER, "fromLiveWatchingListFeed user: "+userInfo.mName+" disPlayKsCoin: "+oobject.displayKsCoin);
             }
             linkedList.add(userInfo);
             i = i + 1;
          }
          if (!PatchProxy.applyVoidOneRefs(linkedList, tb, oi, "21")) {
             LiveLogTag tOP_USER = LiveLogTag.TOP_USER;
             b.Z(tOP_USER, "onWatchingListUpdatedFromFeed");
             if (tb.V8()) {
                tb.B.clear();
                tb.B.addAll(linkedList);
                tb.h9();
             }
             b.d0(tOP_USER, "reschedule delayed task to fetch watcher list from API in ", "mNextDuration", Long.valueOf(tb.D), "mHttpFetching", Boolean.valueOf(tb.p));
             if (tb.p == null && tb.b9()) {
                tb.o9("onWatchingListUpdatedFromFeed");
                tb.S8();
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
