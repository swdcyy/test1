package com.yxcorp.gifshow.visible.ShareVisibleRepo;
import com.yxcorp.gifshow.visible.ShareVisibleRepo$a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import java.lang.Boolean;
import java.lang.Object;
import bba.b;
import haa.a;
import java.util.ArrayList;
import com.kuaishou.edit.draft.FriendVisiableInfo$Type;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import wba.f0;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import lnc.a1;
import crd.a;
import rxc.k;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.visible.ShareVisibleRepo$disposable$1;
import msd.a;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import qr4.i;
import qr4.e$h;
import qr4.m$y;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext$a;
import java.lang.Enum;
import java.util.Iterator;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import java.lang.Integer;
import rxc.i;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.visible.ShareVisibleViewModel;
import java.util.Objects;
import com.yxcorp.gifshow.visible.ShareVisibleViewModel$a;
import com.yxcorp.utility.TextUtils;
import nsd.r0;
import java.util.Arrays;
import ra6.a;
import com.kuaishou.edit.draft.FriendVisiableInfo;
import qw8.o;
import f66.i;
import jq.a;
import q87.c;
import lq.i;
import java.util.Collection;
import java.lang.Iterable;
import trd.u;
import com.kuaishou.edit.draft.FriendVisiableInfo$User;
import com.kuaishou.edit.draft.FriendVisiableInfo$User$HeadUrlInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.visible.ShareVisibleViewModel$b;

public final class ShareVisibleRepo	// class@0016ba
{
    public final b a;
    public final List b;
    public FriendVisiableInfo$Type c;
    public PhotoVisibility d;
    public MutableLiveData e;
    public final MutableLiveData f;
    public MutableLiveData g;
    public final a h;
    public final c i;
    public final VideoContext j;
    public final Boolean k;
    public static final ShareVisibleRepo$a l;

    static {
       ShareVisibleRepo.l = new ShareVisibleRepo$a(null);
    }
    public void ShareVisibleRepo(c p0,VideoContext p1,KtvInfo p2){
       super(p0, p1, p2, Boolean.FALSE);
    }
    public void ShareVisibleRepo(c p0,VideoContext p1,KtvInfo p2,Boolean p3){
       k a;
       super();
       this.i = p0;
       this.j = p1;
       this.k = p3;
       b uob = (p0 == null)? null: a.p(p0);
       this.a = uob;
       this.b = new ArrayList();
       this.c = FriendVisiableInfo$Type.DEFAULT;
       if (p2 != null) {
          p2 = p2.mKtvVisibility;
          if (p2 != null) {
          label_002f :
             this.d = p2;
             this.e = new MutableLiveData(a1.p(0x7f10508b));
             this.f = new MutableLiveData(a1.p(0x7f10508b));
             this.g = new MutableLiveData();
             a uoa = new a();
             this.h = uoa;
             a = k.a;
             Workspace$Source source = (p0 != null)? p0.T0(): null;
             if (k.b(a, source, false, 2, null)) {
                b uob1 = a.c(new ShareVisibleRepo$disposable$1(this), false);
                if (uob1 != null) {
                   uoa.c(uob1);
                }
             }else {
                this.f();
             }
             return;
          }
       }
       PhotoVisibility photoVisibil = f0.a(uob);
       a.o(photoVisibil, "PublishDraftUtils.getPrivacy\(publishDraft\)");
       goto label_002f ;
    }
    public final void a(VideoContext p0,boolean p1){
       ArrayList uArrayList;
       ShareVisibleRepo shareVisible = ShareVisibleRepo.class;
       if (PatchProxy.isSupport(shareVisible) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, shareVisible, "6")) {
          return;
       }
       if (p0 != null) {
          p0.B1(this.d, this.b, p1);
       }
       if (a.g(this.k, Boolean.TRUE) && p0 != null) {
          shareVisible = this.d;
          ShareVisibleRepo tb = this.b;
          if (PatchProxy.isSupport(VideoContext.class) && PatchProxy.applyThreeRefs(shareVisible, tb, Boolean.valueOf(p1), p0, VideoContext.class, "206") != PatchProxyResult.class) {
          }else {
             VideoContext.b();
             if (shareVisible != PhotoVisibility.FRIENDS && (shareVisible != PhotoVisibility.PART_INVISIBLE && (shareVisible != PhotoVisibility.PART_VISIBLE && (shareVisible == PhotoVisibility.PUBLIC || shareVisible == PhotoVisibility.PRIVATE)))) {
                m$y oy = new m$y();
                int i = VideoContext$a.a[shareVisible.ordinal()];
                boolean b = 4;
                if (i != 1) {
                   if (i != 2) {
                      uArrayList = 3;
                      if (i != uArrayList) {
                         oy.a = (i != b)? 0: uArrayList;
                      }else {
                         oy.a = 2;
                      }
                   }else {
                      oy.a = 1;
                      oy.c = (p1)? true: false;
                   }
                }else {
                   oy.a = b;
                }
                uArrayList = new ArrayList();
                if (tb != null && !tb.isEmpty()) {
                   Iterator iterator = tb.iterator();
                   while (iterator.hasNext()) {
                      uArrayList.add(iterator.next().getId());
                   }
                   String[] stringArray = new String[0];
                   oy.b = uArrayList.toArray(stringArray);
                }else {
                   String[] stringArray1 = new String[0];
                   oy.b = stringArray1;
                }
                p0.S = oy;
             }else {
                p0.S = null;
             }
          }
       }
       return;
    }
    public final CharSequence b(PhotoVisibility p0,List p1,int p2,boolean p3){
       String str;
       if (PatchProxy.isSupport(ShareVisibleRepo.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, ShareVisibleRepo.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "photoVisibility");
       int i = i.e[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i != 5) {
                      str = "";
                   }else {
                      str = a1.p(R.string.arg_RES_7f10508d);
                      a.o(str, "CommonUtil.string\(R.string.visibility_self\)");
                   }
                }else {
                   str = a1.p(R.string.arg_RES_7f10508b);
                   a.o(str, "CommonUtil.string\(R.string.visibility_all_des\)");
                }
             }else if(p3){
                str = a1.p(R.string.arg_RES_7f101716);
             }else {
                str = this.e(p1, p2)+a1.p(0x7f104784);
             }
             a.o(str, "if \(onlyIntimateVisible\)¡­ible_title_key\)\n        }");
          }else {
             str = this.e(p1, p2)+a1.p(0x7f104781);
          }
       }else {
          str = a1.p(R.string.arg_RES_7f1047cd);
          a.o(str, "CommonUtil.string\(R.stri¡­bility_title_friends_opt\)");
       }
       return str;
    }
    public final PhotoVisibility c(){
       return this.d;
    }
    public final List d(){
       return this.b;
    }
    public final String e(List p0,int p1){
       String obj;
       Object[] obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ShareVisibleRepo shareVisible = ShareVisibleRepo.class;
       if (PatchProxy.isSupport(shareVisible)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, shareVisible, "15");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = "";
       if (p0 != null && !p0.isEmpty()) {
          String name = p0.get(0).getName();
          ShareVisibleViewModel$a g = ShareVisibleViewModel.g;
          Objects.requireNonNull(g);
          if (PatchProxy.isSupport(ShareVisibleViewModel$a.class)) {
             obj1 = PatchProxy.applyTwoRefs(name, Integer.valueOf(p1), g, ShareVisibleViewModel$a.class, "1");
             if (obj1 != patchProxyRe) {
                name = obj1;
             }else if(TextUtils.x(name) || p1 >= TextUtils.f(name)){
                name = TextUtils.A(name, p1)+"...";
             }
          }else {
             goto label_004d ;
          }
          if (name != null) {
             obj = name;
          }
          if (p0.size() != 1) {
             String str = a1.p(R.string.arg_RES_7f10477c);
             a.o(str, "CommonUtil.string\(R.stri¡­t_more_then_one_key_fora\)");
             obj1 = new Object[]{obj,Integer.valueOf(p0.size())};
             String str1 = String.format(str, Arrays.copyOf(obj1, 2));
             a.o(str1, "java.lang.String.format\(format, *args\)");
             if (a.e()) {
                str1 = str1+' ';
             }
             obj = str1;
          }
       }
    label_00bd :
       return obj;
    }
    public final void f(){
       int b;
       Object[] objArray2;
       k a;
       PhotoVisibility photoVisibil = this;
       ShareVisibleRepo shareVisible = ShareVisibleRepo.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, photoVisibil, shareVisible, "13")) {
          return;
       }
       ShareVisibleRepo d = photoVisibil.d;
       int i = 1;
       int i1 = 0;
       int i2 = (d == PhotoVisibility.FRIENDS || d == PhotoVisibility.PART_VISIBLE)? 1: 0;
       if (!i2) {
          d = objArray;
       }
       String str = 2;
       if (d != null) {
          FriendVisiableInfo uFriendVisia = o.a(photoVisibil.a);
          FriendVisiableInfo$Type type = (uFriendVisia != null)? uFriendVisia.getType(): objArray;
          if (type == null) {
          label_0049 :
             i oi = a.b();
             StringBuilder str1 = "initPhotoVisibilityAndLabel: friendVisibleInfo.type = ";
             FriendVisiableInfo$Type type1 = (uFriendVisia != null)? uFriendVisia.getType(): objArray;
             Object[] objArray1 = new Object[i1];
             oi.w("ShareVisibleRepo", str1+type1, objArray1);
          }else {
             b = i.d[type.ordinal()];
             if (b != i) {
                if (b != str) {
                   if (b != 3) {
                      goto label_0049 ;
                   }else {
                      photoVisibil.d = PhotoVisibility.PART_VISIBLE;
                      photoVisibil.c = FriendVisiableInfo$Type.INTIMATE;
                      a = k.a;
                      ShareVisibleRepo b1 = photoVisibil.i;
                      Workspace$Source source = (b1 != null)? b1.T0(): objArray;
                      if (k.b(a, source, i1, str, objArray) && i.h()) {
                         Object[] obj2 = i.m().z("intimateFriendList");
                         if (obj2 instanceof List && (obj2.isEmpty() ^ i)) {
                            b = true;
                         label_00a4 :
                            Object[] objArray4 = new Object[i1];
                            a.b().w("ShareVisibleRepo", "initPhotoVisibilityAndLabel: isOnlyIntimateVisible = "+b, objArray4);
                         label_00d1 :
                            if (uFriendVisia != null) {
                               b1 = photoVisibil.b;
                               ArrayList uArrayList = PatchProxy.applyOneRefs(uFriendVisia, photoVisibil, shareVisible, "9");
                               if (uArrayList != PatchProxyResult.class) {
                               }else {
                                  List userListList = uFriendVisia.getUserListList();
                                  if (userListList != null) {
                                     int i3 = 10;
                                     ArrayList uArrayList1 = new ArrayList(u.Y(userListList, i3));
                                     Iterator iterator = userListList.iterator();
                                     while (iterator.hasNext()) {
                                        FriendVisiableInfo$User user = iterator.next();
                                        String str2 = "item";
                                        a.o(user, str2);
                                        User user1 = PatchProxy.applyOneRefs(user, photoVisibil, shareVisible, "8");
                                        if (user1 != PatchProxyResult.class) {
                                        }else {
                                           String id = user.getId();
                                           String name = user.getName();
                                           String headUrl = user.getHeadUrl();
                                           List headUrlsList = user.getHeadUrlsList();
                                           if (headUrlsList != null) {
                                              ArrayList uArrayList2 = new ArrayList(u.Y(headUrlsList, i3));
                                              Iterator iterator1 = headUrlsList.iterator();
                                              while (iterator1.hasNext()) {
                                                 FriendVisiableInfo$User$HeadUrlInfo user$HeadUrl = iterator1.next();
                                                 a.o(user$HeadUrl, str2);
                                                 CDNUrl uCDNUrl = PatchProxy.applyOneRefs(user$HeadUrl, photoVisibil, shareVisible, "11");
                                                 if (uCDNUrl != PatchProxyResult.class) {
                                                 }else {
                                                    uCDNUrl = new CDNUrl();
                                                    uCDNUrl.mCdn = user$HeadUrl.getCdn();
                                                    uCDNUrl.mUrl = user$HeadUrl.getUrl();
                                                 }
                                                 uArrayList2.add(uCDNUrl);
                                                 String str3 = 10;
                                              }
                                              CDNUrl[] uCDNUrlArray = new CDNUrl[0];
                                              objArray = uArrayList2.toArray(uCDNUrlArray);
                                              Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
                                              objArray2 = objArray;
                                           }else {
                                              objArray2 = null;
                                           }
                                           User user2 = new User(id, name, "", headUrl, objArray2);
                                        }
                                        uArrayList1.add(user1);
                                        i3 = 10;
                                     }
                                     uArrayList = uArrayList1;
                                  }else {
                                     userListList = CollectionsKt__CollectionsKt.E();
                                  }
                                  if (uFriendVisia.getType() == FriendVisiableInfo$Type.INTIMATE) {
                                     ArrayList obj = PatchProxy.applyOneRefs(uArrayList, photoVisibil, shareVisible, "10");
                                     if (obj != PatchProxyResult.class) {
                                        userListList = obj;
                                     }else if(i.h()){
                                        obj = i.m().z("intimateFriendList");
                                     }else {
                                        obj = new ArrayList();
                                     }
                                     if (obj instanceof List && (obj.isEmpty() ^ 1)) {
                                        uArrayList = new ArrayList();
                                        Iterator iterator2 = obj.iterator();
                                        while (iterator2.hasNext()) {
                                           Object obj1 = iterator2.next();
                                           if (obj1 instanceof User && !uArrayList.contains(obj1)) {
                                              uArrayList.add(obj1);
                                           }
                                        }
                                        Object[] objArray3 = new Object[0];
                                        a.b().w("ShareVisibleRepo", "getAvailableIntimateUserList: intimateUser size = "+uArrayList.size(), objArray3);
                                     }else {
                                        objArray = new Object[0];
                                        a.b().w("ShareVisibleRepo", "getAvailableIntimateUserList: has no intimate friend now", objArray);
                                     }
                                  }
                               }
                               b1.addAll(uArrayList);
                            }
                         }
                      }
                      b = false;
                      goto label_00a4 ;
                   }
                }else {
                   photoVisibil.d = PhotoVisibility.PART_VISIBLE;
                   photoVisibil.c = FriendVisiableInfo$Type.WHITE_LIST;
                }
             }else {
                photoVisibil.d = PhotoVisibility.PART_INVISIBLE;
                photoVisibil.c = FriendVisiableInfo$Type.BLACK_LIST;
             }
          }
          b = false;
          goto label_00d1 ;
       }else {
          b = false;
       }
       if (!PostExperimentUtils.U0()) {
          shareVisible = photoVisibil.d;
          if (shareVisible == PhotoVisibility.PART_INVISIBLE || shareVisible == PhotoVisibility.PART_VISIBLE) {
             photoVisibil.d = PhotoVisibility.PUBLIC;
             photoVisibil.b.clear();
          }
       }
       photoVisibil.e.postValue(photoVisibil.b(photoVisibil.d, photoVisibil.b, 2, b));
       photoVisibil.f.postValue(photoVisibil.b(photoVisibil.d, photoVisibil.b, 6, false));
       photoVisibil.g.setValue(new ShareVisibleViewModel$b(photoVisibil.d, b, false));
       return;
    }
}
