package mu1.h;
import lf3.g;
import mu1.i;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LivePkMessages$SCLivePkState;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import mu1.j;
import java.util.Iterator;
import java.util.Set;
import mu1.i$a;
import java.lang.StringBuilder;
import com.kuaishou.livestream.message.nano.LivePkMessages$PkPlayerState;
import ya1.n0;
import com.kuaishou.protobuf.livestream.nano.ChatWishList;
import com.kuaishou.protobuf.livestream.nano.ChatWishListEntry;
import lf3.f;

public final class h implements g	// class@003221
{
    public final i b;

    public void h(i p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       boolean b1;
       boolean b2;
       Iterator iterator1;
       int len;
       int i;
       object oobject;
       LivePkMessages$PkPlayerState chatWishList;
       LivePkMessages$SCLivePkState sCLivePkStat;
       h b = this.b;
       Object obj = p0;
       Objects.requireNonNull(b);
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(obj, b, oi, "2")) {
       }else {
          Object obj1 = PatchProxy.applyOneRefs(obj, b, oi, "3");
          if (obj1 != PatchProxyResult.class) {
             b1 = obj1.booleanValue();
          }else {
             List h = i.h;
             b.P(h, " [onReceivePkWishListMessage] has receiveMessage");
             if (obj == null) {
                b.P(h, " [onReceivePkWishListMessage]: livePkWishListMessage is null");
             }else if(TextUtils.x(b.d)){
                b.P(h, " [onReceivePkWishListMessage]: mPkId is null");
             }else if(!TextUtils.n(obj.pkId, b.d)){
                b.T(h, " [onReceivePkWishListMessage]:pkId is error", "current pkId:", b.d, "livePkWishListMessage.pkId", obj.pkId);
             }else {
                b1 = true;
             }
             b1 = false;
          }
          if (b1) {
             b.g = obj;
             if (!PatchProxy.applyVoidOneRefs(obj, b, oi, "1")) {
                Iterator iterator = b.b.iterator();
                while (iterator.hasNext()) {
                   i$a uoa = iterator.next();
                   i$a a = uoa.a;
                   LivePkMessages$SCLivePkState obj2 = PatchProxy.applyTwoRefs(obj, a, null, j.class, "2");
                   if (obj2 != PatchProxyResult.class) {
                      b2 = obj2.booleanValue();
                   }else {
                      obj2 = obj.playerState;
                      if (obj2.length) {
                         len = obj2.length;
                         i = 0;
                         while (true) {
                            if (i < len) {
                               oobject = obj2[i];
                               if (oobject == null) {
                                  b.P(j.a, " [isOpenWishEntry]: pkPlayerState is null");
                                  sCLivePkStat = obj2;
                               }else {
                                  sCLivePkStat = obj2;
                                  if (a.equals(oobject.playerId+"")) {
                                     b2 = oobject.openWishList;
                                     break ;
                                  }
                               }
                               i = i + 1;
                               obj2 = sCLivePkStat;
                               chatWishList = null;
                            }
                         }
                      }
                      b2 = false;
                   }
                   i$a a1 = uoa.a;
                   String obj3 = null;
                   obj2 = PatchProxy.applyTwoRefs(obj, a1, obj3, j.class, "3");
                   if (obj2 != PatchProxyResult.class) {
                      obj3 = obj2;
                   label_00e4 :
                      iterator1 = iterator;
                      p0 = obj;
                      iterator = null;
                   }else {
                      obj2 = obj.playerState;
                      if (!obj2.length) {
                         goto label_00e4 ;
                      }else {
                         len = obj2.length;
                         i = 0;
                         while (true) {
                            if (i < len) {
                               oobject = obj2[i];
                               if (oobject == null) {
                                  b.P(j.a, " [WishListItemConfig]: pkPlayerState is null");
                               }else {
                                  chatWishList = oobject.chatWishList;
                                  if (chatWishList == null) {
                                     b.P(j.a, " [WishListItemConfig]: pkPlayerState.chatWishList is null");
                                  }else {
                                     ChatWishList entryList = chatWishList.entryList;
                                     if (entryList == null) {
                                        b.P(j.a, " [WishListItemConfig]: pkPlayerState.chatWishList.entryList is null");
                                     }else if(!entryList.length){
                                        b.P(j.a, " [WishListItemConfig]: pkPlayerState.chatWishList.entryList size = 0 ");
                                     }else {
                                        iterator1 = iterator;
                                        if (!a1.equals(oobject.playerId+"")) {
                                        label_0139 :
                                           i = i + 1;
                                           iterator = iterator1;
                                           obj3 = null;
                                        }else {
                                           ChatWishList entryList1 = oobject.chatWishList.entryList;
                                           int i1 = 0;
                                           p0 = obj;
                                           n0 on0 = new n0(entryList1[i1].expectCount, entryList1[i1].currentCount, entryList1[i1].displayExpectCount, entryList1[i1].displayCurrentCount, entryList1[i1].color, entryList1[i1].giftId);
                                        }
                                     }
                                  }
                               }
                               iterator1 = iterator;
                               goto label_0139 ;
                            }else {
                               iterator1 = iterator;
                               p0 = obj;
                               obj3 = null;
                            }
                         }
                      }
                   }
                   uoa.a(b2, obj3);
                   obj = p0;
                   iterator = iterator1;
                }
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
