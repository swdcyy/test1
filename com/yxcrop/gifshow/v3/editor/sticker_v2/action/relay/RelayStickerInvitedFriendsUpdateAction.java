package com.yxcrop.gifshow.v3.editor.sticker_v2.action.relay.RelayStickerInvitedFriendsUpdateAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import eba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Sticker;
import com.kuaishou.edit.draft.Sticker$Type;
import kotlin.Pair;
import java.lang.Integer;
import com.kuaishou.edit.draft.RelayStickerParam;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.RelayStickerParam$b;
import com.yxcorp.gifshow.record.interactive.RelayUserInfo;
import com.kuaishou.edit.draft.Friend;
import com.kuaishou.edit.draft.Friend$b;
import java.lang.Number;
import com.kuaishou.edit.draft.Sticker$b;

public final class RelayStickerInvitedFriendsUpdateAction extends EditDraftAction	// class@000a64
{
    public final boolean isInvited;
    public final boolean isReplaceAll;
    public final boolean needCommit;
    public final List newFriends;

    public void RelayStickerInvitedFriendsUpdateAction(List p0,boolean p1,boolean p2,boolean p3){
       a.p(p0, "newFriends");
       super(false, 1, null);
       this.newFriends = p0;
       this.isReplaceAll = p1;
       this.isInvited = p2;
       this.needCommit = p3;
    }
    public final boolean getNeedCommit(){
       return this.needCommit;
    }
    public final List getNewFriends(){
       return this.newFriends;
    }
    public final boolean isInvited(){
       return this.isInvited;
    }
    public final boolean isReplaceAll(){
       return this.isReplaceAll;
    }
    public void performAction(c p0,c p1){
       Pair pair;
       List friendsList;
       Iterator iterator1;
       int i1;
       Object obj2;
       Object obj3;
       Pair pair1;
       Pair pair2;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RelayStickerInvitedFriendsUpdateAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.U0();
       if (uoa != null) {
          if (!uoa.D()) {
             uoa.c0();
          }
          List list = uoa.z();
          a.o(list, "messages");
          Iterator iterator = list.iterator();
          int i = 0;
          while (true) {
             if (iterator.hasNext()) {
                Iterator obj = iterator.next();
                RelayUserInfo obj1 = obj;
                a.o(obj1, "it");
                boolean b = (obj1.getStickerType() == Sticker$Type.RELAY_STICKER)? true: false;
                if (b) {
                   pair = new Pair(Integer.valueOf(i), obj);
                label_0065 :
                   if (pair != null) {
                      RelayStickerParam$b second = pair.getSecond();
                      a.o(second, "stickerPair.second");
                      second = second.getRelayStickerParam().toBuilder();
                      if (this.isReplaceAll != null) {
                         second.copyOnWrite();
                         second.instance.clearFriends();
                      }
                      obj = this.newFriends.iterator();
                      while (obj.hasNext()) {
                         obj1 = obj.next();
                         String str = "paramBuilder.friendsList";
                         String str1 = "paramBuilder";
                         if (this.isInvited != null) {
                            a.o(second, str1);
                            friendsList = second.getFriendsList();
                            a.o(friendsList, str);
                            iterator1 = friendsList.iterator();
                            i1 = 0;
                            while (true) {
                               if (iterator1.hasNext()) {
                                  obj2 = iterator1.next();
                                  obj3 = obj2;
                                  a.o(obj3, "it");
                                  if (a.g(obj3.getId(), obj1.getId())) {
                                     pair1 = new Pair(Integer.valueOf(i1), obj2);
                                  label_00df :
                                     Friend$b uob = Friend.newBuilder();
                                     uob.b(obj1.getId());
                                     str1 = obj1.getProfileUrl();
                                     if (str1 != null) {
                                        uob.a(str1);
                                     }
                                     String profileLocal = obj1.getProfileLocalPath();
                                     if (profileLocal != null) {
                                        uob.a(uoa.Q(profileLocal));
                                     }
                                     if (pair1 != null) {
                                        second.copyOnWrite();
                                        second.instance.setFriends(pair1.getFirst().intValue(), uob);
                                     }else {
                                        second.copyOnWrite();
                                        second.instance.addFriends(uob);
                                        continue ;
                                     }
                                  }else {
                                     i1 = i1 + 1;
                                  }
                               }else {
                                  pair1 = null;
                                  goto label_00df ;
                               }
                            }
                         }else {
                            a.o(second, str1);
                            friendsList = second.getFriendsList();
                            a.o(friendsList, str);
                            iterator1 = friendsList.iterator();
                            i1 = 0;
                            while (true) {
                               if (iterator1.hasNext()) {
                                  obj2 = iterator1.next();
                                  obj3 = obj2;
                                  a.o(obj3, "it");
                                  if (a.g(obj3.getId(), obj1.getId())) {
                                     pair2 = new Pair(Integer.valueOf(i1), obj2);
                                  label_015f :
                                     if (pair2 != null) {
                                        second.copyOnWrite();
                                        second.instance.removeFriends(pair2.getFirst().intValue());
                                        continue ;
                                     }else {
                                        continue ;
                                     }
                                  }else {
                                     i1 = i1 + 1;
                                  }
                               }else {
                                  pair2 = null;
                                  goto label_015f ;
                               }
                            }
                         }
                      }
                      uoa.n(pair.getFirst().intValue()).g(second);
                   }
                   if (this.needCommit != null) {
                      uoa.g(true);
                      break ;
                   }
                }else {
                   i = i + 1;
                }
             }else {
                pair = null;
                goto label_0065 ;
             }
          }
       }
       return;
    }
}
