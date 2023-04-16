package com.yxcorp.gifshow.profile.presenter.profile.header.background.MyProfileBackgroundEditPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.MyProfileBackgroundEditPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.MyProfileBackgroundEditPresenter$mImageListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import xl8.b;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.t;
import j5c.c;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.MyProfileBackgroundEditPresenter$c;
import erd.g;
import z5c.l0;
import crd.b;
import s1c.a;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.MyProfileBackgroundEditPresenter$d;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$c;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.MyProfileBackgroundEditPresenter$mImageListener$2$a;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$d;
import com.kwai.robust.PatchProxyResult;
import z5c.y1;
import java.lang.Boolean;
import k2b.h;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import z5c.b0;
import k2b.e0;
import com.kwai.framework.model.user.UserProfile;
import z5c.d3;
import m4c.a;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import u3c.i;
import android.app.Activity;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPreviewSelectActivity;
import s1c.v;
import t2c.f;
import java.lang.Long;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPreviewSelectActivity$a;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.io.File;
import k2b.f3;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$c;
import mz6.a;
import mz6.a$a;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier;
import lnc.a1;
import java.lang.CharSequence;
import qrd.l1;
import mz6.b$d;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.MyProfileBackgroundEditPresenter$e;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$b;
import android.view.View;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.MyProfileBackgroundEditPresenter$b;
import com.yxcorp.gifshow.widget.m;
import ekd.m1;
import android.view.ViewStub;
import java.lang.Number;

public final class MyProfileBackgroundEditPresenter extends PresenterV2	// class@00149d
{
    public ViewStub p;
    public v q;
    public User r;
    public ProfileParam s;
    public BaseFragment t;
    public c u;
    public b v;
    public int w;
    public View x;
    public final p y;
    public static final MyProfileBackgroundEditPresenter$a z;

    static {
       MyProfileBackgroundEditPresenter.z = new MyProfileBackgroundEditPresenter$a(null);
    }
    public void MyProfileBackgroundEditPresenter(){
       super();
       this.w = 5;
       this.y = s.c(new MyProfileBackgroundEditPresenter$mImageListener$2(this));
    }
    public static final b P8(MyProfileBackgroundEditPresenter p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("mBackgroundStatus");
       }
       return p0;
    }
    public static final BaseFragment R8(MyProfileBackgroundEditPresenter p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public static final ProfileParam S8(MyProfileBackgroundEditPresenter p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mParam");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MyProfileBackgroundEditPresenter.class, "4")) {
          return;
       }
       MyProfileBackgroundEditPresenter tu = this.u;
       if (tu == null) {
          a.S("mLoadState");
       }
       this.X7(tu.e().subscribe(new MyProfileBackgroundEditPresenter$c(this), l0.a("MyProfileBackgroundEditPresenter")));
       tu = this.q;
       if (tu == null) {
          a.S("mCallerContext");
       }
       this.X7(tu.d.f("PROFILE_HEAD_BG_IMAGE_EDIT").subscribe(new MyProfileBackgroundEditPresenter$d(this)));
       ProfileBackgroundPublishManager.j.a().a(this.V8());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MyProfileBackgroundEditPresenter.class, "5")) {
          return;
       }
       ProfileBackgroundPublishManager.j.a().p(this.V8());
       return;
    }
    public final MyProfileBackgroundEditPresenter$mImageListener$2$a V8(){
       Object obj = PatchProxy.apply(null, this, MyProfileBackgroundEditPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.y.getValue();
    }
    public final void W8(){
       String str;
       ProfileBgVideoInfo profileBgVid;
       ArrayList uArrayList;
       boolean i;
       ProfileBackgroundPreviewSelectActivity$a a;
       long l;
       ProfileBackgroundPreviewSelectActivity$a a1;
       a uoa1;
       ImageSelectSupplier$c uoc1;
       Object obj = this;
       y1 oy1 = y1.class;
       if (PatchProxy.applyVoid(null, obj, MyProfileBackgroundEditPresenter.class, "8")) {
          return;
       }
       MyProfileBackgroundEditPresenter t = obj.t;
       if (t == null) {
          a.S("mFragment");
       }
       MyProfileBackgroundEditPresenter s = obj.s;
       if (s == null) {
          a.S("mParam");
       }
       ProfileParam mIsBackgroun = s.mIsBackgroundDefault;
       MyProfileBackgroundEditPresenter r = obj.r;
       if (r == null) {
          a.S("mUser");
       }
       if (PatchProxy.isSupport(oy1)) {
          str = 1;
          if (PatchProxy.applyVoidFourRefs(t, "multiple_one", Boolean.valueOf(mIsBackgroun), r, null, y1.class, "43")) {
          label_006f :
             t = obj.s;
             if (t == null) {
                a.S("mParam");
             }
             if (t.mUserProfile != null) {
                t = obj.r;
                if (t == null) {
                   a.S("mUser");
                }
                s = obj.s;
                if (s == null) {
                   a.S("mParam");
                }
                if (!d3.c(t, s.mUserProfile)) {
                   t = obj.v;
                   String str1 = "mBackgroundStatus";
                   if (t == null) {
                      a.S(str1);
                   }
                   MyProfileBackgroundEditPresenter myProfileBac = 3;
                   if (t.a().d() == myProfileBac) {
                      t = obj.v;
                      if (t == null) {
                         a.S(str1);
                      }
                      profileBgVid = t.a().e();
                      if (profileBgVid != null && profileBgVid.getStatus() == str) {
                         return;
                      }
                   }
                label_00c2 :
                   t = obj.s;
                   if (t == null) {
                      a.S("mParam");
                   }
                   ProfileParam mUserProfile = t.mUserProfile;
                   String str2 = "mParam.mUserProfile";
                   a.o(mUserProfile, str2);
                   if (i.b(mUserProfile)) {
                      uArrayList = 2;
                      if (obj.w != uArrayList) {
                         Activity activity = this.getActivity();
                         if (activity != null) {
                            a.o(activity, "activity ?: return");
                            t = obj.v;
                            if (t == null) {
                               a.S(str1);
                            }
                            i = t.a().d();
                            if (i) {
                               if (i == myProfileBac) {
                                  t = obj.v;
                                  if (t == null) {
                                     a.S(str1);
                                  }
                                  ProfileBgVideoInfo profileBgVid1 = t.a().e();
                                  if (profileBgVid1 != null) {
                                     a = ProfileBackgroundPreviewSelectActivity.A;
                                     t = obj.r;
                                     if (t == null) {
                                        a.S("mUser");
                                     }
                                     String id = t.getId();
                                     t = obj.q;
                                     if (t == null) {
                                        a.S("mCallerContext");
                                     }
                                     v s1 = t.s;
                                     if (s1 != null) {
                                        Long value = s1.getValue();
                                        if (value != null) {
                                           l = value.longValue();
                                        label_013b :
                                           a.c(activity, profileBgVid1, true, id, l);
                                        }
                                     }
                                     l = 0;
                                     goto label_013b ;
                                  }
                               }
                            }else {
                               t = obj.v;
                               if (t == null) {
                                  a.S(str1);
                               }
                               profileBgVid = t.a().e();
                               if (profileBgVid != null) {
                                  if (profileBgVid.getLocalVideo()) {
                                     a1 = ProfileBackgroundPreviewSelectActivity.A;
                                     str1 = profileBgVid.getPath();
                                     myProfileBac = obj.r;
                                     if (myProfileBac == null) {
                                        a.S("mUser");
                                     }
                                     a1.d(activity, str1, myProfileBac.mId, profileBgVid.getFeed());
                                  }else if(profileBgVid.getCoverUrls() != null){
                                     a = ProfileBackgroundPreviewSelectActivity.A;
                                     ArrayList uArrayList1 = new ArrayList(profileBgVid.getCoverUrls());
                                     myProfileBac = obj.v;
                                     if (myProfileBac == null) {
                                        a.S(str1);
                                     }
                                     boolean b = myProfileBac.a().a();
                                     s = obj.r;
                                     if (s == null) {
                                        a.S("mUser");
                                     }
                                     a.e(activity, uArrayList1, b, true, s.getId(), profileBgVid.getFeed(), profileBgVid.getUser());
                                  }
                                  return;
                               }else {
                                  t = obj.v;
                                  if (t == null) {
                                     a.S(str1);
                                  }
                                  File uFile = t.a().c();
                                  if (uFile != null) {
                                     String absolutePath = uFile.getAbsolutePath();
                                     a.o(absolutePath, "absolutePath");
                                     ProfileBackgroundPreviewSelectActivity.A.d(activity, absolutePath, null, null);
                                     return;
                                  }else {
                                     t = obj.v;
                                     if (t == null) {
                                        a.S(str1);
                                     }
                                     ArrayList uArrayList2 = t.a().b();
                                     if (uArrayList2 != null) {
                                        a = ProfileBackgroundPreviewSelectActivity.A;
                                        t = obj.v;
                                        if (t == null) {
                                           a.S(str1);
                                        }
                                        ProfileBackgroundPreviewSelectActivity$a.f(a, activity, uArrayList2, t.a().a(), true, null, null, null, 112, null);
                                     }
                                  }
                               }
                            }
                         }
                      label_020d :
                         return;
                      }
                   }else {
                      uArrayList = 2;
                   }
                   t = obj.t;
                   if (t == null) {
                      a.S("mFragment");
                   }
                   if (!PatchProxy.applyVoidOneRefs(t, null, oy1, "104")) {
                      f3.j("BACKGROUND_PICTURE_POPUP").h(t);
                   }
                   t = obj.s;
                   if (t == null) {
                      a.S("mParam");
                   }
                   mUserProfile = t.mUserProfile;
                   a.o(mUserProfile, str2);
                   i = i.b(mUserProfile);
                   MyProfileBackgroundEditPresenter v = obj.v;
                   if (v == null) {
                      a.S(str1);
                   }
                   if (v.a().d() != uArrayList) {
                      ImageSelectSupplier$c uoc = ImageSelectSupplier$c.a();
                      uArrayList = new ArrayList();
                      MyProfileBackgroundEditPresenter v1 = obj.v;
                      if (v1 == null) {
                         a.S(str1);
                      }
                      if (v1.a().d() == myProfileBac) {
                         myProfileBac = obj.v;
                         if (myProfileBac == null) {
                            a.S(str1);
                         }
                         ProfileBgVideoInfo profileBgVid2 = myProfileBac.a().e();
                         if (profileBgVid2 != null && profileBgVid2.getStatus() == 4) {
                         label_02ba :
                            uoa1 = a.z.a();
                            uoa1.g(R.string.arg_RES_7f103fe9);
                            uArrayList.add(uoa1.a());
                            uoc.c(uArrayList);
                            uoc.b(new MyProfileBackgroundEditPresenter$e(obj));
                            uoc1 = uoc;
                         }
                      }
                   label_0282 :
                      a$a z = a.z;
                      a uoa = z.a();
                      uoa.g(ImageSelectSupplier.p);
                      if (i) {
                         uoa.i(str);
                         String str3 = a1.p(R.string.arg_RES_7f103efe);
                         a.o(str3, "CommonUtil.string\(R.stri¡­ofile_gallery_video_tips\)");
                         uoa.j(str3);
                      }
                      uArrayList.add(uoa.a());
                      uoa1 = z.a();
                      uoa1.g(ImageSelectSupplier.q);
                      uArrayList.add(uoa1.a());
                      goto label_02ba ;
                   }else {
                      uoc1 = null;
                   }
                   Activity activity1 = this.getActivity();
                   if (!activity1 instanceof GifshowActivity) {
                      activity1 = null;
                   }
                   if (activity1 != null) {
                      ProfileBackgroundPublishManager.j.a().v(new ProfileBackgroundPublishManager$b(i, str, uoc1), activity1);
                   }
                   t = obj.t;
                   if (t == null) {
                      a.S("mFragment");
                   }
                   MyProfileBackgroundEditPresenter r1 = obj.r;
                   if (r1 == null) {
                      a.S("mUser");
                   }
                   if (!PatchProxy.applyVoidTwoRefs(t, r1, null, oy1, "42")) {
                      h oh = h.j(0x7784);
                      oh.c(b0.f(r1.getId()));
                      oh.i(t);
                   }
                }
             }
          label_0324 :
             return;
          }
       }else {
          str = 1;
       }
       h oh1 = h.j(0x777b);
       oh1.e("multiple_one");
       int i1 = (mIsBackgroun != null)? 1: 2;
       oh1.d(i1);
       oh1.c(b0.f(r.getId()));
       oh1.i(t);
       goto label_006f ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfileBackgroundEditPresenter.class, "2")) {
          return;
       }
       a.p(p0, "view");
       m1.b(p0, new MyProfileBackgroundEditPresenter$b(this), R.id.background);
       this.p = m1.f(p0, 0x7f0a325d);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MyProfileBackgroundEditPresenter.class, "3")) {
          return;
       }
       Object obj = this.q8(v.class);
       a.o(obj, "inject\(ProfileCallerContext::class.java\)");
       this.q = obj;
       obj = this.q8(User.class);
       a.o(obj, "inject\(User::class.java\)");
       this.r = obj;
       obj = this.q8(ProfileParam.class);
       a.o(obj, "inject\(ProfileParam::class.java\)");
       this.s = obj;
       obj = this.r8("PROFILE_FRAGMENT");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_FRAGMENT\)");
       this.t = obj;
       obj = this.r8("PROFILE_LOAD_STATE");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_LOAD_STATE\)");
       this.u = obj;
       obj = this.r8("PROFILE_BACKGROUND_STYLE");
       a.o(obj, "inject\(com.yxcorp.gifsho¡­PROFILE_BACKGROUND_STYLE\)");
       this.v = obj;
       obj = this.r8("PROFILE_STYLE");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_STYLE\)");
       this.w = obj.intValue();
       return;
    }
}
