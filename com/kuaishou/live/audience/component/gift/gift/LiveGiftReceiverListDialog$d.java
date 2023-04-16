package com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog$d;
import qvb.f;
import com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog;
import java.lang.String;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import az0.b;
import ok.x;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import az0.n;
import erd.g;
import java.util.List;
import com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListResponse;
import la6.b;
import java.util.Iterator;
import com.kuaishou.live.common.core.component.gift.gift.audience.LiveGiftReceiver;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.ArrayList;
import lnc.a1;

public class LiveGiftReceiverListDialog$d extends f	// class@000ae6
{
    public String p;
    public String q;
    public final LiveGiftReceiverListDialog r;

    public void LiveGiftReceiverListDialog$d(LiveGiftReceiverListDialog p0,String p1,String p2){
       this.r = p0;
       super();
       this.p = p1;
       this.q = p2;
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, LiveGiftReceiverListDialog$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a.get().a(this.p, this.q).map(new e()).observeOn(d.c).doOnNext(new n(this)).observeOn(d.a);
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(LiveGiftReceiverListResponse p0,List p1){
       LiveGiftReceiverListDialog$d uod = LiveGiftReceiverListDialog$d.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uod, "2")) {
          return;
       }
       super.d2(p0, p1);
       Iterator iterator = p1.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (TextUtils.n(iterator.next().mUserInfo.mId, QCurrentUser.ME.getId())) {
                iterator.remove();
             }
          }
          if (this.r.H != null && !PatchProxy.applyVoidOneRefs(p1, this, uod, "3")) {
             if (p1.size() <= 0) {
                b.Z(this.r.B, "onLoadItemFromResponse : the response item that except self is null");
                break ;
             }else {
                LiveGiftReceiver liveGiftRece = new LiveGiftReceiver();
                liveGiftRece.mAllReceiverRes = 0x7f08053a;
                liveGiftRece.mIsSendToAll = true;
                ArrayList uArrayList = new ArrayList();
                Iterator iterator1 = p1.iterator();
                while (iterator1.hasNext()) {
                   uArrayList.add(iterator1.next().mUserInfo);
                }
                liveGiftRece.mMultipleReceiverList = uArrayList;
                UserInfo userInfo = new UserInfo();
                userInfo.mName = a1.p(0x7f103519);
                userInfo.mId = "0";
                liveGiftRece.mUserInfo = userInfo;
                p1.add(0, liveGiftRece);
             }
          }
          break ;
       }
       return;
    }
}
