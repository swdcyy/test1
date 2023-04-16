package hl2.a;
import lf3.g;
import com.kuaishou.live.core.show.template.a;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.j;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import d61.y;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.livestream.message.nano.LiveActivityEnterRoomTip;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.lang.Long;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import lf3.f;

public final class a implements g	// class@002dbb
{
    public final a b;

    public void a(a p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, a.class, "6")) {
       }else if(p0 == null || j.h(p0.liveActivityEnterRoomTip)){
          if (a1.i(tb.getActivity()) && y.e(tb.getActivity())) {
             b.Z(LiveLogTag.LIVE_ACTIVITY_TEMPLATE_ENTER_ROOM, "Landscape, do not show enter room view");
          }else {
             SCActionSignal liveActivity = p0.liveActivityEnterRoomTip;
             int len = liveActivity.length;
             int i = 0;
             while (i < len) {
                object oobject = liveActivity[i];
                if (oobject != null) {
                   LiveActivityEnterRoomTip user = oobject.user;
                   if (user != null && oobject.displayType != null) {
                      if (TextUtils.equals(Long.toString(user.userId), QCurrentUser.me().getId())) {
                         b.Z(LiveLogTag.LIVE_ACTIVITY_TEMPLATE_ENTER_ROOM, "LiveEnterRoomPresenter receive own message , pass");
                      }else {
                         b.h0(LiveLogTag.LIVE_ACTIVITY_TEMPLATE_ENTER_ROOM, "enterroom message", ImmutableMap.of("userId", Long.valueOf(oobject.user.userId), "type", Integer.valueOf(oobject.displayType)));
                         tb.S8(oobject);
                      }
                   }
                }
                i = i + 1;
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
