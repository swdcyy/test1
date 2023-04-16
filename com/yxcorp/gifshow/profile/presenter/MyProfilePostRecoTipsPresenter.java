package com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter$a;
import nsd.u;
import o79.i;
import com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter$mIdleHandler$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter$mPageListObserver$2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.http.l;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qvb.q;
import qvb.a;
import android.os.MessageQueue$IdleHandler;
import z5c.n2;
import com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter$b;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.yxcorp.gifshow.profile.model.ProfilePostRecoTip;
import android.view.View;
import java.lang.CharSequence;
import android.widget.TextView;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import s1c.q;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import q87.c;
import k2b.e0;
import z5c.y1;
import java.util.List;
import java.util.Collection;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.Objects;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter$c;
import g26.d;
import com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter$d;
import com.kwai.sdk.switchconfig.a;
import ekd.q;
import java.util.ArrayList;
import fg6.a;
import com.yxcorp.gifshow.profile.model.ProfilePostRecoExtraParams;
import com.google.gson.Gson;
import com.yxcorp.gifshow.profile.model.ProfilePostRecoAlbumInfo;
import z26.c;
import lnc.x6;
import lnc.y6;
import brd.t;
import i4c.d0;
import i4c.e0;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter$f;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter$e;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils;
import java.lang.Boolean;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import com.yxcorp.gifshow.profile.model.ProfileTips;
import x3c.c;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import v2c.e;
import v2c.g;
import s1c.o;
import qvb.n0;
import com.yxcorp.gifshow.model.response.ProfileFeedResponse;
import com.yxcorp.gifshow.model.ProfileTubeCardInfo;
import com.yxcorp.gifshow.profile.model.response.UserProfileResponseMeta;
import lnc.s6;
import o56.c;
import o56.a;
import xf6.l;
import com.kwai.framework.abtest.f;
import java.lang.Integer;
import com.yxcorp.gifshow.profile.model.ProfileAnnualAlbumTipInterval;
import java.lang.reflect.Type;
import java.lang.System;
import android.content.Context;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.ViewParent;
import android.view.ViewGroup;
import q46.l;
import java.lang.Number;
import android.content.SharedPreferences;
import ekd.k1;
import com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter$CloseClickInfo;
import km8.b;
import c16.c;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class MyProfilePostRecoTipsPresenter extends PresenterV2	// class@001434
{
    public ImageView A;
    public List B;
    public KwaiImageView C;
    public boolean D;
    public final p E;
    public final p F;
    public final int p;
    public final int q;
    public final int r;
    public BaseFragment s;
    public RecyclerFragment t;
    public l u;
    public ProfileParam v;
    public View w;
    public KwaiImageView x;
    public TextView y;
    public SelectShapeTextView z;
    public static final MyProfilePostRecoTipsPresenter$a G;

    static {
       MyProfilePostRecoTipsPresenter.G = new MyProfilePostRecoTipsPresenter$a(null);
    }
    public void MyProfilePostRecoTipsPresenter(){
       super();
       this.p = i.c(0x7f07030d);
       this.q = i.c(0x7f070319);
       this.r = i.c(0x7f07031b);
       this.E = s.c(new MyProfilePostRecoTipsPresenter$mIdleHandler$2(this));
       this.F = s.c(new MyProfilePostRecoTipsPresenter$mPageListObserver$2(this));
    }
    public static final BaseFragment P8(MyProfilePostRecoTipsPresenter p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mBaseFragment");
       }
       return p0;
    }
    public static final l R8(MyProfilePostRecoTipsPresenter p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mPageList");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MyProfilePostRecoTipsPresenter.class, "4")) {
          return;
       }
       MyProfilePostRecoTipsPresenter tu = this.u;
       if (tu == null) {
          a.S("mPageList");
       }
       tu.h(this.Y8());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MyProfilePostRecoTipsPresenter.class, "5")) {
          return;
       }
       MyProfilePostRecoTipsPresenter tu = this.u;
       if (tu == null) {
          a.S("mPageList");
       }
       tu.f(this.Y8());
       MessageQueue$IdleHandler idleHandler = this.X8();
       if (idleHandler != null) {
          n2.a(idleHandler);
       }
       return;
    }
    public final void S8(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, MyProfilePostRecoTipsPresenter.class, "22")) {
          return;
       }
       MyProfilePostRecoTipsPresenter tA = this.A;
       if (tA != null) {
          tA.setOnClickListener(new MyProfilePostRecoTipsPresenter$b(this, p0, p1, p2));
       }
       return;
    }
    public final void V8(ProfilePostRecoTip p0){
       MyProfilePostRecoTipsPresenter tw;
       int i;
       String str5;
       List icon;
       CDNUrl[] uCDNUrlArray;
       Object[] objArray;
       a$a uoa;
       ProfilePostRecoTip profilePostR2;
       MyProfilePostRecoTipsPresenter myProfilePos = MyProfilePostRecoTipsPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, myProfilePos, "12")) {
          return;
       }
       if (p0 == null) {
          tw = this.w;
          if (tw != null) {
             this.c9(tw);
          }
          return;
       }else {
          String str = 3;
          if (p0.getType() != str) {
             MyProfilePostRecoTipsPresenter ty = this.y;
             if (ty != null) {
                ty.setText(p0.getTitle());
             }
             ty = this.z;
             if (ty != null) {
                ty.setText(p0.getActionBtnTitle());
             }
             ty = this.C;
             if (ty != null) {
                ty.setPlaceHolderImage(new ColorDrawable(i.a(R.color.arg_RES_7f06084d)));
             }
          }
          int type = p0.getType();
          String str1 = ":ks-features:ft-social:profile";
          String str2 = "null cannot be cast to non-null type kotlin.Array<T>";
          String str3 = "mBaseFragment";
          ProfilePostRecoTip profilePostR = null;
          i = 1;
          if (type != i) {
             if (type != 2) {
                if (type != str) {
                   if (type != 4) {
                      if (type != 5) {
                         q.C().e("MyProfilePostRecoTipsPresenter", "bindTipsView\(\) type is not correct: type="+p0.getType(), new IllegalArgumentException());
                         tw = this.w;
                         if (tw != null) {
                            this.c9(tw);
                         }
                      }else if(!this.a9()){
                         tw = this.w;
                         if (tw != null) {
                            this.c9(tw);
                         }
                         return;
                      }else {
                         String str4 = "";
                         str5 = "annual_album";
                         this.S8(str4, str4, str5);
                         MyProfilePostRecoTipsPresenter ts = this.s;
                         if (ts == null) {
                            a.S(str3);
                         }
                         y1.S(ts, str4, str4, str5);
                         icon = p0.getIcon();
                         if (icon != null && !icon.isEmpty()) {
                            i = 0;
                         }
                         if (!i) {
                            myProfilePos = this.x;
                            if (myProfilePos != null) {
                               uCDNUrlArray = new CDNUrl[0];
                               objArray = p0.getIcon().toArray(uCDNUrlArray);
                               Objects.requireNonNull(objArray, str2);
                               uoa = a.d();
                               uoa.b(str1);
                               myProfilePos.W(objArray, this.p, this.p, uoa.a());
                            }
                         }
                         myProfilePos = this.w;
                         if (myProfilePos != null) {
                            myProfilePos.setOnClickListener(new MyProfilePostRecoTipsPresenter$c(this, p0));
                         }
                      }
                   }else if(!d.b() || this.Z8(p0.getMaterialId(), "template")){
                      tw = this.w;
                      if (tw != null) {
                         this.c9(tw);
                      }
                      return;
                   }else {
                      this.S8(p0.getMaterialId(), p0.getMaterialName(), "template");
                      myProfilePos = this.s;
                      if (myProfilePos == null) {
                         a.S(str3);
                      }
                      y1.S(myProfilePos, p0.getMaterialId(), p0.getMaterialName(), "template");
                      icon = p0.getIcon();
                      if (icon != null && !icon.isEmpty()) {
                         i = 0;
                      }
                      if (!i) {
                         myProfilePos = this.x;
                         if (myProfilePos != null) {
                            uCDNUrlArray = new CDNUrl[0];
                            objArray = p0.getIcon().toArray(uCDNUrlArray);
                            Objects.requireNonNull(objArray, str2);
                            uoa = a.d();
                            uoa.b(str1);
                            myProfilePos.W(objArray, this.p, this.p, uoa.a());
                         }
                      }
                      myProfilePos = this.w;
                      if (myProfilePos != null) {
                         myProfilePos.setOnClickListener(new MyProfilePostRecoTipsPresenter$d(this, p0));
                      }
                   }
                }else {
                   str = "bindTipsView\(\) no smart album and no next tip";
                   if (a.t().d("disableProfileSmartAlbumReco", 0)) {
                      tw = this.B;
                      a.m(tw);
                      if (tw.size() < 2) {
                         q.C().e("MyProfilePostRecoTipsPresenter", str, new IllegalArgumentException());
                         tw = this.w;
                         if (tw != null) {
                            this.c9(tw);
                         }
                         return;
                      }else {
                         this.V8(q.d(this.B, i));
                      }
                   }else if(PatchProxy.applyVoidOneRefs(p0, this, myProfilePos, "14")){
                      if (!this.a9()) {
                         myProfilePos = this.B;
                         a.m(myProfilePos);
                         if (myProfilePos.size() < 2) {
                            q.C().e("MyProfilePostRecoTipsPresenter", str, new IllegalArgumentException());
                            tw = this.w;
                            if (tw != null) {
                               this.c9(tw);
                            }
                         }else {
                            myProfilePos = this.B;
                            if (myProfilePos != null) {
                               profilePostR = myProfilePos.get(i);
                            }
                            this.V8(profilePostR);
                         }
                      }
                      ArrayList uArrayList = new ArrayList();
                      if (p0.getExtParams() != null) {
                         ProfilePostRecoExtraParams profilePostR1 = a.a.h(p0.getExtParams(), ProfilePostRecoExtraParams.class);
                         if (profilePostR1.getAlbumInfo() != null) {
                            uArrayList = profilePostR1.getAlbumInfo().getAlbumIds();
                            Object[] objArray1 = new Object[0];
                            q.C().w("MyProfilePostRecoTipsPresenter", "bindSmartAlbumTip\(\) publishedIds size="+uArrayList.size(), objArray1);
                         }
                      }
                      c uoc = y6.r(c.class);
                      if (uoc == null) {
                         tw = this.B;
                         a.m(tw);
                         if (tw.size() < 2) {
                            q.C().e("MyProfilePostRecoTipsPresenter", "bindTipsView\(\) no smart album plugin", new IllegalArgumentException());
                            tw = this.w;
                            if (tw != null) {
                               this.c9(tw);
                            }
                         }else {
                            this.V8(q.d(this.B, i));
                         }
                      }else {
                         uoc.gh(uArrayList).subscribe(new d0(this, p0, uoc), new e0(this));
                      }
                   }
                }
             }else if(!d.b()){
                tw = this.w;
                if (tw != null) {
                   this.c9(tw);
                }
                return;
             }else {
                this.S8(p0.getMaterialId(), p0.getMaterialName(), "template");
                myProfilePos = this.s;
                if (myProfilePos == null) {
                   a.S(str3);
                }
                y1.S(myProfilePos, p0.getMaterialId(), p0.getMaterialName(), "template");
                icon = p0.getIcon();
                if (icon != null && !icon.isEmpty()) {
                   i = 0;
                }
                if (!i) {
                   myProfilePos = this.x;
                   if (myProfilePos != null) {
                      uCDNUrlArray = new CDNUrl[0];
                      objArray = p0.getIcon().toArray(uCDNUrlArray);
                      Objects.requireNonNull(objArray, str2);
                      uoa = a.d();
                      uoa.b(str1);
                      myProfilePos.W(objArray, this.p, this.p, uoa.a());
                   }
                }
                myProfilePos = this.w;
                if (myProfilePos != null) {
                   myProfilePos.setOnClickListener(new MyProfilePostRecoTipsPresenter$f(this, p0));
                }
             }
          }else {
             str = "magic";
             this.S8(p0.getMaterialId(), p0.getMaterialName(), str);
             myProfilePos = this.s;
             if (myProfilePos == null) {
                a.S(str3);
             }
             y1.S(myProfilePos, p0.getMaterialId(), p0.getMaterialName(), str);
             icon = p0.getIcon();
             if (icon != null && !icon.isEmpty()) {
                i = 0;
             }
             if (!i) {
                myProfilePos = this.x;
                if (myProfilePos != null) {
                   uCDNUrlArray = new CDNUrl[0];
                   objArray = p0.getIcon().toArray(uCDNUrlArray);
                   Objects.requireNonNull(objArray, str2);
                   uoa = a.d();
                   uoa.b(str1);
                   myProfilePos.W(objArray, this.q, this.q, uoa.a());
                }
                myProfilePos = this.x;
                ViewGroup$LayoutParams layoutParams = (myProfilePos != null)? myProfilePos.getLayoutParams(): profilePostR;
                if (layoutParams != null) {
                   layoutParams.height = this.q;
                }
                if (layoutParams) {
                   layoutParams.width = this.q;
                }
                myProfilePos = this.x;
                layoutParams = (myProfilePos != null)? myProfilePos.getLayoutParams(): profilePostR;
                str5 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
                Objects.requireNonNull(layoutParams, str5);
                layoutParams.setMargins(0, this.r, 0, this.r);
                myProfilePos = this.y;
                if (myProfilePos != null) {
                   profilePostR = myProfilePos.getLayoutParams();
                }
                Objects.requireNonNull(profilePostR, str5);
                profilePostR.setMargins(i.c(R.dimen.arg_RES_7f07034b), 0, 0, 0);
             }
             myProfilePos = this.w;
             if (myProfilePos != null) {
                myProfilePos.setOnClickListener(new MyProfilePostRecoTipsPresenter$e(this, p0));
             }
          }
       label_037c :
          return;
       }
    }
    public final void W8(){
       MyProfilePostRecoTipsPresenter tu;
       Object[] objArray1;
       boolean b1;
       MyProfilePostRecoTipsPresenter tw;
       Object[] objArray2;
       int i1;
       float f;
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MyProfilePostRecoTipsPresenter myProfilePos = MyProfilePostRecoTipsPresenter.class;
       Object[] objArray = null;
       String str = "6";
       if (PatchProxy.applyVoid(objArray, this, myProfilePos, str)) {
          return;
       }
       String str1 = "mPageList";
       String str2 = "MyProfilePostRecoTipsPresenter";
       boolean b = true;
       if (ProfilePostEmptyCardUtils.e.d()) {
          tu = this.u;
          if (tu == null) {
             a.S(str1);
          }
          if (!tu.getCount()) {
             objArray1 = new Object[0];
             q.C().w(str2, "disable by empty post card", objArray1);
             this.D = b;
             return;
          }
       }
       ProfileParam obj = PatchProxy.apply(objArray, this, myProfilePos, "18");
       String str3 = "mParam";
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else {
          tu = this.v;
          if (tu == null) {
             a.S(str3);
          }
          obj = tu.mUserProfileResponse;
          if (obj != null) {
             ProfileTips profileTips = c.c(obj);
             if (profileTips != null) {
                b1 = profileTips.getMEnablePhotoExpirationTip();
             label_005f :
                g.e(KsLogProfileTag.OVERDUE_PHOTO_TIP.appendTag("MyProfileOverduePhotoTipPresenter"), "showTips: "+b1);
                if (b1 && !o.b()) {
                   b1 = true;
                }else {
                   b1 = false;
                }
             }
          }
          b1 = false;
          goto label_005f ;
       }
       if (!b1) {
          obj = PatchProxy.apply(objArray, this, myProfilePos, "19");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
             tu = this.u;
             if (tu == null) {
                a.S(str1);
             }
             ProfileFeedResponse profileFeedR = tu.L0();
             if (profileFeedR != null) {
                ProfileTubeCardInfo profileTubeC = profileFeedR.getProfileTubeCardInfo();
                if (profileTubeC != null) {
                   profileTubeC = profileTubeC.mProfileTubeCards;
                   if (profileTubeC != null && (profileTubeC.isEmpty() ^ b) == b) {
                      b1 = true;
                   }
                }
             }
             b1 = false;
          }
          if (!b1) {
             this.D = false;
             tu = this.v;
             if (tu == null) {
                a.S(str3);
             }
             obj = tu.mUserProfileResponse;
             a.o(obj, "mParam.mUserProfileResponse");
             UserProfileResponseMeta userProfileR = PatchProxy.applyOneRefs(obj, objArray, c.class, str);
             if (userProfileR != patchProxyRe) {
             }else {
                a.p(obj, "$this$mProfilePostRecoTipList");
                userProfileR = c.d(obj);
                userProfileR = (userProfileR != null)? userProfileR.mProfilePostRecoTipList: objArray;
             }
             this.B = userProfileR;
             str = (userProfileR == null || userProfileR.isEmpty())? 1: null;
             if (str) {
                objArray1 = new Object[0];
                q.C().w(str2, "checkAndShowPostRecoTipsView\(\) no profile tip list", objArray1);
                return;
             }else {
                MyProfilePostRecoTipsPresenter obj1 = PatchProxy.apply(objArray, this, myProfilePos, "20");
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                }else {
                   str = "profilepostshowday";
                   String str4 = 5;
                   if (a.a().c()) {
                      int i = l.e("profileRecoInterval", 0);
                      if (i) {
                         if (i != b) {
                            if (i != 2) {
                               i1 = 3;
                               if (i != i1) {
                                  if (i != 4) {
                                     if (i != str4) {
                                     label_0146 :
                                        i1 = f.e(str);
                                     }else {
                                        i1 = 5;
                                     }
                                  }
                               }else {
                                  i1 = 1;
                               }
                            }else {
                               i1 = -1;
                            }
                         }else {
                            i1 = 0;
                         }
                      }else {
                         i1 = f.e(str);
                      }
                   }else {
                      goto label_0146 ;
                   }
                   f = (float)i1;
                   if (f - 0xbf800000) {
                      if (f) {
                         ProfilePostRecoTip profilePostR = q.d(this.B, 0);
                         Integer integer = (profilePostR != null)? Integer.valueOf(profilePostR.getType()): objArray;
                         l = 0x3f800000;
                         if (integer != null && integer.intValue() == str4) {
                            ProfileAnnualAlbumTipInterval value = a.t().getValue("profileAnnualAlbumTipFrequency", ProfileAnnualAlbumTipInterval.class, objArray);
                            float goAlbumInter = (value != null)? value.getGoAlbumInterval(): 0x3f800000;
                            if (value != null) {
                               l = value.getCancelInterval();
                            }
                            if (o.k()) {
                               goAlbumInter = l;
                            }
                            if ((float)(System.currentTimeMillis() - o.l()) - (goAlbumInter * (float)0x5265c00) < 0) {
                            label_01b1 :
                               b = false;
                            }
                         }else if(!o.k()){
                            f = 0x3f800000;
                         }
                         if ((float)(System.currentTimeMillis() - o.l()) - (f * (float)0x5265c00) < 0) {
                         }
                      }
                   }
                }
             label_01cc :
                if (!b) {
                   return;
                }else if(PatchProxy.applyVoid(objArray, this, myProfilePos, "7")){
                   if (this.w == null) {
                      View view = a.a(this.getContext(), R.layout.arg_RES_7f0d1259);
                      this.w = view;
                      KwaiImageView kwaiImageVie = (view != null)? view.findViewById(R.id.icon): objArray;
                      this.x = kwaiImageVie;
                      tw = this.w;
                      TextView textView = (tw != null)? tw.findViewById(R.id.title): objArray;
                      this.y = textView;
                      tw = this.w;
                      SelectShapeTextView selectShapeT = (tw != null)? tw.findViewById(R.id.action_btn): objArray;
                      this.z = selectShapeT;
                      tw = this.w;
                      ImageView imageView = (tw != null)? tw.findViewById(R.id.close_btn): objArray;
                      this.A = imageView;
                      tw = this.w;
                      kwaiImageVie = (tw != null)? tw.findViewById(R.id.icon_placeholder): objArray;
                      this.C = kwaiImageVie;
                   }
                   tw = this.t;
                   if (tw == null) {
                      a.S("mProfilePhotoFragment");
                   }
                   d uod = tw.ia();
                   if (uod != null && !uod.U0(this.w)) {
                      obj1 = this.w;
                      a.m(obj1);
                      if (!PatchProxy.applyVoidTwoRefs(uod, obj1, this, myProfilePos, "8")) {
                         if (uod.U0(obj1)) {
                            uod.m1(obj1);
                         }
                         if (!uod.U0(obj1)) {
                            if (!PatchProxy.applyVoidOneRefs(obj1, this, myProfilePos, "9")) {
                               ViewParent parent = obj1.getParent();
                               if (parent instanceof ViewGroup) {
                                  objArray = parent;
                               }
                               if (objArray != null) {
                                  objArray.removeView(obj1);
                               }
                            }
                            uod.P0(obj1);
                         }
                      }
                   }
                   this.V8(q.d(this.B, 0));
                }
                return;
             }
          }
       }
       objArray1 = new Object[0];
       q.C().w(str2, "checkAndShowPostRecoTipsView\(\) has other tip, skip post reco tip", objArray1);
       return;
    }
    public final MessageQueue$IdleHandler X8(){
       Object obj = PatchProxy.apply(null, this, MyProfilePostRecoTipsPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.E.getValue();
    }
    public final q Y8(){
       Object obj = PatchProxy.apply(null, this, MyProfilePostRecoTipsPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.F.getValue();
    }
    public final boolean Z8(String p0,String p1){
       Object[] objArray;
       long l;
       boolean b;
       MyProfilePostRecoTipsPresenter myProfilePos = MyProfilePostRecoTipsPresenter.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, myProfilePos, "15");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       String str = 1;
       String str1 = (p0 == null || !p0.length())? 1: null;
       if (str1) {
          objArray = new Object[0];
          q.C().t("MyProfilePostRecoTipsPresenter", "isClickedExit:type="+p1+" id = "+p0, objArray);
          return 0;
       }else {
          Object obj1 = null;
          if (f.a("PMaterialExitClick")) {
             Object obj2 = PatchProxy.applyTwoRefs(p0, p1, obj1, l.class, "6");
             l = (obj2 != patchProxyRe)? obj2.longValue(): l.a.getLong("key_click_time_"+p1+"_"+p0, 0);
             if (k1.t(l) - 0x48190800 <= 0) {
                str1 = 1;
             label_0093 :
                if (str1) {
                   objArray = new Object[0];
                   q.C().w("MyProfilePostRecoTipsPresenter", "isClickedExit: is clicked ,type="+p1+" id="+p0, objArray);
                   return str;
                }else {
                   MyProfilePostRecoTipsPresenter$CloseClickInfo obj3 = PatchProxy.applyTwoRefs(p0, p1, this, myProfilePos, "24");
                   if (obj3 != patchProxyRe) {
                      b = obj3.booleanValue();
                   }else {
                      obj3 = MyProfilePostRecoTipsPresenter$CloseClickInfo.class;
                      String str2 = o.a.getString(b.d("user")+"profile_post_reco_tips_last_close_info", "null");
                      if (str2 != null && str2 != "") {
                         obj1 = b.a(str2, obj3);
                      }
                      if (obj1 == null) {
                         Object[] objArray1 = new Object[0];
                         q.C().w("MyProfilePostRecoTipsPresenter", "isCloseClicked: no info", objArray1);
                      }else {
                         str2 = obj1.getId();
                         long clickTime = obj1.getClickTime();
                         if (a.g(obj1.getType(), p1) && (a.g(str2, p0) && k1.t(clickTime) - 0x19bfcc00 <= 0)) {
                            b = true;
                         }
                      }
                      b = false;
                   }
                   if (b) {
                      objArray = new Object[0];
                      q.C().w("MyProfilePostRecoTipsPresenter", "isClickedExit: is close clicked,type="+p1+" id="+p0, objArray);
                      return str;
                   }else {
                      return 0;
                   }
                }
             }
          }
          str1 = null;
          goto label_0093 ;
       }
    }
    public final boolean a9(){
       Object obj = PatchProxy.apply(null, this, MyProfilePostRecoTipsPresenter.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (c.d())? true: false;
       return b;
    }
    public final void b9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfilePostRecoTipsPresenter.class, "13")) {
          return;
       }
       Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(p0));
       MyProfilePostRecoTipsPresenter ts = this.s;
       if (ts == null) {
          a.S("mBaseFragment");
       }
       FragmentActivity activity = ts.getActivity();
       if (activity == null) {
          q.C().e("MyProfilePostRecoTipsPresenter", "launchByScheme\(\) failed to launch, no activity, scheme="+p0, new IllegalArgumentException());
          return;
       }else {
          activity.startActivity(intent);
          return;
       }
    }
    public final void c9(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfilePostRecoTipsPresenter.class, "10")) {
          return;
       }
       MyProfilePostRecoTipsPresenter tt = this.t;
       if (tt == null) {
          a.S("mProfilePhotoFragment");
       }
       d uod = tt.ia();
       if (uod != null && uod.U0(p0)) {
          uod.m1(p0);
       }
       return;
    }
    public final void d9(boolean p0){
       MyProfilePostRecoTipsPresenter myProfilePos = MyProfilePostRecoTipsPresenter.class;
       if (PatchProxy.isSupport(myProfilePos) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, myProfilePos, "11")) {
          return;
       }
       SharedPreferences a = o.a;
       SharedPreferences$Editor uEditor = a.edit();
       uEditor.putBoolean(b.d("user")+"profile_post_reco_tips_last_click_cancel", p0);
       g.a(uEditor);
       SharedPreferences$Editor uEditor1 = a.edit();
       uEditor1.putLong(b.d("user")+"profile_post_reco_tips_last_shown_time", System.currentTimeMillis());
       g.a(uEditor1);
       MyProfilePostRecoTipsPresenter tw = this.w;
       if (tw != null) {
          this.c9(tw);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MyProfilePostRecoTipsPresenter.class, "3")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.t = obj;
       obj = this.r8("PROFILE_FRAGMENT");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_FRAGMENT\)");
       this.s = obj;
       obj = this.r8("PAGE_LIST");
       a.o(obj, "inject\(PageAccessIds.PAGE_LIST\)");
       this.u = obj;
       obj = this.q8(ProfileParam.class);
       a.o(obj, "inject\(ProfileParam::class.java\)");
       this.v = obj;
       return;
    }
}
