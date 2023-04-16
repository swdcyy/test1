package com.yxcorp.gifshow.visible.ShareVisibleViewModel;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.visible.ShareVisibleViewModel$a;
import nsd.u;
import com.yxcorp.gifshow.visible.ShareVisibleRepo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.visible.ShareVisibleViewModel$photoVisibilityInfo$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.visible.ShareVisibleViewModel$label$2;
import com.yxcorp.gifshow.visible.ShareVisibleViewModel$entranceLabel$2;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import rxc.k;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import lq.i;
import java.util.Collection;
import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.model.ContactTargetItem;
import java.lang.Number;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.SelectUsersBundle;
import org.json.JSONObject;
import org.json.JSONException;
import lnc.a1;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.visible.ShareVisibleViewModel$b;
import java.util.LinkedHashSet;
import tkd.b;
import tkd.d;
import wu5.a;
import com.yxcorp.gifshow.visible.ShareVisibleViewModel$c;
import android.app.Activity;
import n3d.a;
import com.yxcorp.gifshow.visible.ShareVisibleViewModel$d;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import java.lang.Integer;
import q87.c;
import java.util.Objects;
import rxc.i;
import java.lang.Enum;
import com.kuaishou.edit.draft.FriendVisiableInfo$Type;
import com.kuaishou.edit.draft.Privacy$Type;
import com.kuaishou.edit.draft.Privacy$b;
import com.kuaishou.edit.draft.Privacy;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.FriendVisiableInfo$b;
import com.kuaishou.edit.draft.FriendVisiableInfo;
import com.kwai.framework.model.user.User;
import com.kuaishou.edit.draft.FriendVisiableInfo$User$a;
import com.kuaishou.edit.draft.FriendVisiableInfo$User;
import com.kwai.framework.model.user.User$FollowStatus;
import com.kuaishou.edit.draft.FriendVisiableInfo$User$HeadUrlInfo$a;
import com.kuaishou.edit.draft.FriendVisiableInfo$User$HeadUrlInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Iterable;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Publish;
import com.kuaishou.edit.draft.Publish$b;
import com.kuaishou.edit.draft.Workspace$Type;
import bba.b;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import brd.t;
import t45.d;
import brd.z;
import rxc.j;
import erd.g;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.CharSequence;
import w26.a;
import w26.c;
import sw8.a;
import o36.g;
import k36.c;
import sw8.a$b;
import k36.f;

public final class ShareVisibleViewModel extends ViewModel	// class@0016c2
{
    public MutableLiveData a;
    public final p b;
    public final p c;
    public final p d;
    public MutableLiveData e;
    public final ShareVisibleRepo f;
    public static final ShareVisibleViewModel$a g;

    static {
       ShareVisibleViewModel.g = new ShareVisibleViewModel$a(null);
    }
    public void ShareVisibleViewModel(ShareVisibleRepo p0){
       a.p(p0, "mRepo");
       super();
       this.f = p0;
       this.a = new MutableLiveData();
       this.b = s.c(new ShareVisibleViewModel$photoVisibilityInfo$2(this));
       this.c = s.c(new ShareVisibleViewModel$label$2(this));
       this.d = s.c(new ShareVisibleViewModel$entranceLabel$2(this));
       this.e = new MutableLiveData();
    }
    public static void y0(ShareVisibleViewModel p0,PhotoVisibility p1,List p2,boolean p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = null;
       }
       if (p4 & 0x04) {
          p3 = false;
       }
       p0.x0(p1, p2, p3);
       return;
    }
    public final boolean o0(){
       Object obj1;
       Object[] objArray = null;
       k obj = PatchProxy.apply(objArray, this, ShareVisibleViewModel.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = k.a;
       ShareVisibleRepo i = this.f.i;
       if (i != null) {
          objArray = i.T0();
       }
       boolean b = false;
       boolean b1 = obj.a(objArray, b);
       if (i.h()) {
          obj1 = i.m().z("intimateFriendList");
          if (obj1 instanceof List && (obj1.isEmpty() ^ 1)) {
             obj1 = 1;
          label_0046 :
             if (b1 && obj1) {
                b = true;
             }
             return b;
          }
       }
       obj1 = 0;
       goto label_0046 ;
    }
    public final MutableLiveData p0(){
       return this.e;
    }
    public final MutableLiveData q0(){
       return this.a;
    }
    public final MutableLiveData r0(){
       Object obj = PatchProxy.apply(null, this, ShareVisibleViewModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public final MutableLiveData s0(){
       Object obj = PatchProxy.apply(null, this, ShareVisibleViewModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final List t0(Set p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, ShareVisibleViewModel.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          ContactTargetItem obj1 = iterator.next();
          if (!obj1 instanceof ContactTargetItem) {
             continue ;
          }else {
             obj1 = obj1.mUser;
             if (obj1 == null) {
                continue ;
             }else {
                a.o(obj1, "item.mUser");
                obj.add(obj1);
             }
          }
       }
       return obj;
    }
    public final int u0(){
       Object obj = PatchProxy.apply(null, this, ShareVisibleViewModel.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.f.d().size();
    }
    public final void v0(GifshowActivity p0){
       SelectUsersBundle selectUsersB;
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareVisibleViewModel.class, "9")) {
          return;
       }
       a.p(p0, "activity");
       try{
          selectUsersB = new SelectUsersBundle();
          str = new JSONObject().put("extra_info", "limit").toString();
          a.o(str, "JSONObject\(\).put\(EXTRA_INFO, LIMIT\).toString\(\)");
       }catch(org.json.JSONException e1){
          e1.printStackTrace();
          str = "";
       }
       selectUsersB.setBizId(4001).setLogExtraParams(str).setNeedUseCache(false).setLimitToast(R.string.arg_RES_7f10477d).setTitle(a1.p(R.string.arg_RES_7f104780)).setLimitNum(100);
       ShareVisibleViewModel$b value = this.s0().getValue();
       PhotoVisibility photoVisibil = (value != null)? value.b(): null;
       if (photoVisibil == PhotoVisibility.PART_INVISIBLE) {
          selectUsersB.setCheckedUsers(new LinkedHashSet(this.f.d()));
       }
       d.a(0x6de3c81e).qE(p0, selectUsersB, new ShareVisibleViewModel$c(this));
       return;
    }
    public final void w0(GifshowActivity p0){
       SelectUsersBundle selectUsersB;
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareVisibleViewModel.class, "8")) {
          return;
       }
       a.p(p0, "activity");
       try{
          selectUsersB = new SelectUsersBundle();
          str = new JSONObject().put("extra_info", "part").toString();
          a.o(str, "JSONObject\(\).put\(EXTRA_I¡­ntroller.PART\).toString\(\)");
       }catch(org.json.JSONException e1){
          e1.printStackTrace();
          str = "";
       }
       selectUsersB.setBizId(4001).setLogExtraParams(str).setNeedUseCache(false).setLimitToast(R.string.arg_RES_7f10477d).setTitle(a1.p(R.string.arg_RES_7f104783)).setLimitNum(100);
       ShareVisibleViewModel$b value = this.s0().getValue();
       PhotoVisibility photoVisibil = (value != null)? value.b(): null;
       if (photoVisibil == PhotoVisibility.PART_VISIBLE) {
          value = this.s0().getValue();
          if (value != null && !value.a()) {
             selectUsersB.setCheckedUsers(new LinkedHashSet(this.f.d()));
          }
       }
       d.a(0x6de3c81e).qE(p0, selectUsersB, new ShareVisibleViewModel$d(this));
       return;
    }
    public final void x0(PhotoVisibility p0,List p1,boolean p2){
       int i;
       String str2;
       int b1;
       int i1;
       FriendVisiableInfo$Type dEFAULT;
       Privacy$Type pRIVATE;
       ShareVisibleRepo d;
       boolean b2;
       FriendVisiableInfo$Type dEFAULT1;
       Publish uArrayList1;
       String str3;
       int i4;
       Publish$b uArrayList1;
       Object[] uArrayList11;
       ShareVisibleViewModel shareVisible = this;
       Object obj = p0;
       ArrayList obj1 = p1;
       boolean b = p2;
       if (PatchProxy.isSupport(ShareVisibleViewModel.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, ShareVisibleViewModel.class, "7")) {
          return;
       }
       String str = "photoVisibility";
       a.p(obj, str);
       i oi = a.b();
       String str1 = "sync photoVisibility "+obj+"  users size ";
       Integer integer = (obj1)? Integer.valueOf(p1.size()): null;
       Object[] objArray = new Object[0];
       oi.w("ShareVisibleViewModel", str1+integer, objArray);
       ShareVisibleViewModel f = shareVisible.f;
       Objects.requireNonNull(f);
       if (PatchProxy.isSupport(ShareVisibleRepo.class)) {
          i = 1;
          str2 = 2;
          if (PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), f, ShareVisibleRepo.class, "5")) {
             obj1 = 0;
          label_0435 :
             this.s0().postValue(new ShareVisibleViewModel$b(shareVisible.f.c(), b, true));
             ShareVisibleViewModel f1 = shareVisible.f;
             this.r0().postValue(f1.b(f1.c(), shareVisible.f.d(), 2, b));
             MutableLiveData mutableLiveD = PatchProxy.apply(null, shareVisible, ShareVisibleViewModel.class, "4");
             if (mutableLiveD == PatchProxyResult.class) {
                mutableLiveD = shareVisible.d.getValue();
             }
             f1 = shareVisible.f;
             mutableLiveD.postValue(f1.b(f1.c(), shareVisible.f.d(), 6, b));
             a uoa = d.a(0x27e26f6e);
             b1 = (obj != PhotoVisibility.PUBLIC)? true: false;
             uoa.oJ(b1);
             if (!PatchProxy.applyVoidOneRefs(obj, null, a.class, "1") && g.a) {
                c.d().g(new a$b(obj.mType));
             }
             return;
          }
       }else {
          i = 1;
          str2 = 2;
       }
       a.p(obj, str);
       f.d = obj;
       if (!(a.g(obj1, f.b) ^ i)) {
          obj1 = null;
       }
       if (obj1 != null) {
          f.b.clear();
          f.b.addAll(obj1);
          i1 = i.a[p0.ordinal()];
          if (i1 != i) {
             if (i1 != str2) {
                dEFAULT = FriendVisiableInfo$Type.DEFAULT;
             }else if(b){
                dEFAULT = FriendVisiableInfo$Type.INTIMATE;
             }else {
                dEFAULT = FriendVisiableInfo$Type.WHITE_LIST;
             }
          }else {
             dEFAULT = FriendVisiableInfo$Type.BLACK_LIST;
          }
          f.c = dEFAULT;
       }
       if (!PatchProxy.isSupport(ShareVisibleRepo.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p2), f, ShareVisibleRepo.class, "7")) {
          objArray = new Object[0];
          str1 = "ShareVisibleRepo";
          a.b().w(str1, "commitToDraft", objArray);
          if (f.a != null) {
             Object[] objArray1 = new Object[0];
             a.b().w(str1, "commitToDraft photoVisibility "+f.d, objArray1);
             i1 = i.b[f.d.ordinal()];
             if (i1 != i) {
                if (i1 != str2 && (i1 != 3 && i1 != 4)) {
                   pRIVATE = (i1 != 5)? Privacy$Type.PRIVATE: Privacy$Type.PRIVATE;
                }else {
                   pRIVATE = Privacy$Type.FRIENDS;
                }
             }else {
                pRIVATE = Privacy$Type.PUBLIC;
             }
             Privacy$b uob = Privacy.newBuilder();
             uob.a(pRIVATE);
             Privacy privacy = uob.build();
             FriendVisiableInfo$b uob1 = FriendVisiableInfo.newBuilder();
             uob1.a(FriendVisiableInfo$Type.DEFAULT);
             FriendVisiableInfo uFriendVisia = uob1.build();
             ArrayList uArrayList = new ArrayList();
             d = f.d;
             if (d != PhotoVisibility.FRIENDS && (d == PhotoVisibility.PART_INVISIBLE || d == PhotoVisibility.PART_VISIBLE)) {
                Iterator iterator = f.b.iterator();
                while (iterator.hasNext()) {
                   User user = iterator.next();
                   FriendVisiableInfo$User$a user$a = FriendVisiableInfo$User.newBuilder();
                   a.o(user$a, "friendUserBuilder");
                   user$a.copyOnWrite();
                   user$a.instance.setName(user.mName);
                   user$a.copyOnWrite();
                   user$a.instance.setId(user.mId);
                   user$a.copyOnWrite();
                   user$a.instance.setHeadUrl(user.mAvatar);
                   b2 = (user.mFollowStatus == User$FollowStatus.FOLLOWING)? true: false;
                   user$a.copyOnWrite();
                   user$a.instance.setIsFollowing(b2);
                   user$a.copyOnWrite();
                   user$a.instance.setVisitorBeFollowed(user.mVisitorBeFollowed);
                   obj1 = new ArrayList();
                   User mAvatars = user.mAvatars;
                   if (mAvatars != null) {
                      a.o(mAvatars, "user.mAvatars");
                      int i2 = (!mAvatars.length)? 1: 0;
                      i2 = i2 ^ i;
                      if (i2) {
                         user = user.mAvatars;
                         i2 = user.length;
                         b1 = 0;
                         while (b1 < i2) {
                            object oobject = user[b1];
                            FriendVisiableInfo$User$HeadUrlInfo$a user$HeadUrl = FriendVisiableInfo$User$HeadUrlInfo.newBuilder();
                            a.o(user$HeadUrl, "headUrlInfoBuilder");
                            a.o(oobject, "cdnUrl");
                            user$HeadUrl.copyOnWrite();
                            user$HeadUrl.instance.setCdn(oobject.getCdn());
                            user$HeadUrl.copyOnWrite();
                            user$HeadUrl.instance.setUrl(oobject.getUrl());
                            GeneratedMessageLite generatedMes = user$HeadUrl.build();
                            a.o(generatedMes, "headUrlInfoBuilder.build\(\)");
                            obj1.add(generatedMes);
                            b1 = b1 + 1;
                            iterator = iterator;
                            i2 = i2;
                            oobject = 1;
                         }
                      }
                   }
                   user$a.copyOnWrite();
                   user$a.instance.addAllHeadUrls(obj1);
                   uArrayList.add(user$a.build());
                   iterator = iterator;
                   i = 1;
                   str2 = 2;
                }
                int i3 = i.c[f.d.ordinal()];
                if (i3 != 1) {
                   dEFAULT1 = (i3 != 2)? FriendVisiableInfo$Type.DEFAULT: FriendVisiableInfo$Type.BLACK_LIST;
                }else if(b){
                   dEFAULT1 = FriendVisiableInfo$Type.INTIMATE;
                }else {
                   dEFAULT1 = FriendVisiableInfo$Type.WHITE_LIST;
                }
                FriendVisiableInfo$b uob2 = FriendVisiableInfo.newBuilder();
                uob2.a(dEFAULT1);
                uob2.copyOnWrite();
                uob2.instance.addAllUserList(uArrayList);
                uFriendVisia = uob2.build();
             }
             if (f.a.v() != null) {
                uArrayList1 = f.a.v();
                a.m(uArrayList1);
                str3 = "publishDraft.firstMessage!!";
                a.o(uArrayList1, str3);
                i4 = 1;
                if (!(a.g(privacy, uArrayList1.getPrivacy()) ^ i4)) {
                   uArrayList1 = f.a.v();
                   a.m(uArrayList1);
                   a.o(uArrayList1, str3);
                   if (!(a.g(uFriendVisia, uArrayList1.getFriendVisiableInfo()) ^ i4)) {
                   }
                }
             }
             Object[] objArray2 = new Object[0];
             a.b().s("share_draft_tag", "updatePrivacy: clear draft", objArray2);
             f.a.c0();
             uArrayList1 = f.a.k();
             uArrayList1.i(privacy);
             a.o(uArrayList1, "publishDraft.ensureFirst¡­der\(\).setPrivacy\(privacy\)");
             uArrayList1.f(uFriendVisia);
             f.a.g(false);
             a.o(privacy, "privacy");
             a.o(uFriendVisia, "visibleInfo");
             if (PatchProxy.applyVoidTwoRefs(privacy, uFriendVisia, f, ShareVisibleRepo.class, "12")) {
             }else if(!i.h()){
                uArrayList11 = new Object[0];
                a.b().t(str1, "syncAllPublishDraftIfNeed postSession is not available", uArrayList11);
             }else {
                i String uArrayList12 = i.m();
                str3 = "PostSession.current\(\)";
                a.o(uArrayList12, str3);
                if (uArrayList12.y().isEmpty()) {
                   uArrayList12 = null;
                   i4 = 0;
                }else {
                   uArrayList12 = i.m();
                   a.o(uArrayList12, str3);
                   i4 = 0;
                   uArrayList12 = uArrayList12.y().get(i4);
                }
                if (uArrayList12 == null) {
                   objArray = new Object[i4];
                   a.b().t(str1, "syncAllPublishDraftIfNeed empty Draft", objArray);
                }else if(uArrayList12.a1() != Workspace$Type.ATLAS && (uArrayList12.a1() != Workspace$Type.LONG_PICTURE && uArrayList12.a1() != Workspace$Type.PHOTO_MOVIE)){
                   uArrayList11 = new Object[0];
                   a.b().w(str1, "syncAllPublishDraftIfNeed not picturesType ", uArrayList11);
                }else {
                   uArrayList12 = i.m();
                   a.o(uArrayList12, str3);
                   List Iterator uArrayList121 = uArrayList12.y();
                   a.o(uArrayList121, "PostSession.current\(\).drafts");
                   uArrayList121 = uArrayList121.iterator();
                   while (uArrayList121.hasNext()) {
                      c uoc = uArrayList121.next();
                      a.o(uoc, "workspaceDraft");
                      if (uoc.Q0() != null) {
                         b uob3 = uoc.Q0();
                         String str4 = "workspaceDraft.publishDraft";
                         a.o(uob3, str4);
                         if (uob3.v() != null) {
                            uob3 = uoc.Q0();
                            a.o(uob3, str4);
                            Publish publish = uob3.v();
                            a.m(publish);
                            str = "workspaceDraft.publishDraft.firstMessage!!";
                            a.o(publish, str);
                            i = 1;
                            i4 = a.g(privacy, publish.getPrivacy()) ^ i;
                            if (!i4) {
                               uob3 = uoc.Q0();
                               a.o(uob3, str4);
                               publish = uob3.v();
                               a.m(publish);
                               a.o(publish, str);
                               i4 = a.g(uFriendVisia, publish.getFriendVisiableInfo()) ^ i;
                               if (!i4) {
                               }
                            }
                         }
                         Object[] objArray3 = new Object[0];
                         a.b().w(str1, "syncAllPublishDraftIfNeed sync "+uoc, objArray3);
                         if (!uoc.D()) {
                            DraftFileManager.E().m0(uoc).observeOn(d.a).doOnNext(new j(uoc));
                         }
                         uoc.Q0().c0();
                         Publish$b uob4 = uoc.Q0().k();
                         uob4.i(privacy);
                         a.o(uob4, "workspaceDraft.publishDr¡­der\(\).setPrivacy\(privacy\)");
                         uob4.f(uFriendVisia);
                         b2 = false;
                         uoc.Q0().g(b2);
                         f.a(uoc.d1(), b2);
                      }
                   }
                label_00e4 :
                   obj1 = 0;
                   f.a(f.j, b);
                   goto label_0435 ;
                }
             }
          }
       }
    }
}
