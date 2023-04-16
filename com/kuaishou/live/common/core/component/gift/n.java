package com.kuaishou.live.common.core.component.gift.n;
import xz6.b;
import xz6.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.TextView;
import xz6.d;
import java.util.Map$Entry;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$l;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.live.core.show.gift.GiftMessage;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kwai.framework.model.user.UserInfo;
import java.lang.CharSequence;
import b61.b;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;

public class n extends b	// class@001322
{
    public List f;

    public void n(){
       super();
    }
    public void g(int p0,e p1){
       boolean b;
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, n.class, "3")) {
          return;
       }
       p1 = p1.b;
       Map$Entry item = this.getItem(p0);
       String key = item.getKey();
       long l = item.getValue().longValue();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       GiftAnimContainerView$l ol = PatchProxy.applyOneRefs(key, this, n.class, "4");
       if (ol != patchProxyRe) {
       }else {
          n on = null;
          Iterator iterator = this.f.iterator();
          int i = 0;
          int i1 = 0;
          while (true) {
             if (iterator.hasNext()) {
                GiftMessage giftMessage = iterator.next();
                if (!key.equals(giftMessage.mMergeKey)) {
                   continue ;
                }else {
                   GiftMessage obj = PatchProxy.applyOneRefs(giftMessage, this, n.class, "5");
                   if (obj != patchProxyRe) {
                      b = obj.booleanValue();
                   }else if(QCurrentUser.me() != null && (giftMessage.mUser != null && (QCurrentUser.me().getId()).equals(giftMessage.mUser.mId))){
                      b = true;
                   }else {
                      b = false;
                   }
                   if (b) {
                      ol = new GiftAnimContainerView$l(giftMessage, giftMessage.mComboCount, giftMessage.mComboCount);
                   }else if(i == null || giftMessage.mComboCount < i){
                      i = giftMessage.mComboCount;
                   }
                   if (i1 == null || giftMessage.mComboCount > i1) {
                      i1 = giftMessage.mComboCount;
                   }
                   obj = giftMessage;
                }
             }else {
                ol = new GiftAnimContainerView$l(on, i, i1);
             }
          }
       }
       String str = "δ֪";
       if (ol == null) {
          p1.setText(str);
          return;
       }else {
          key = b.c(ol.a.mUser);
          Gift gift = a.a(ol.a.mGiftId);
          if (gift != null) {
             str = gift.mName;
          }
          Object[] objArray = new Object[]{key,str,Integer.valueOf(ol.b),Integer.valueOf(ol.c),Long.valueOf(l),Integer.valueOf(ol.a.mDisplayDuration)};
          p1.setText(String.format("\(%s, %s, %d, %d\), rankSum=%d, display=%dms", objArray));
          return;
       }
    }
    public e h(int p0,ViewGroup p1){
       if (PatchProxy.isSupport(n.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, n.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new e(a.i(p1, 0x7f0d054c));
    }
}
