package com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter$e;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter;
import java.lang.Object;
import fx9.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fx9.c$a;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import ou5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.entity.QPhoto;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import uw9.o;
import q87.c;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.comment.utils.e;
import k2b.e0;
import yk9.d;
import fx9.c$c;
import java.lang.CharSequence;
import com.yxcorp.gifshow.widget.EmojiTextView;
import qd5.a;
import lnc.a1;
import android.content.DialogInterface$OnDismissListener;
import fx9.c$e;
import g7a.s;
import uid.e;
import fx9.c$b;
import java.lang.StringBuilder;
import android.widget.TextView;
import java.lang.Number;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import r7a.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;
import fx9.c$f;
import kotlin.text.StringsKt__StringsKt;
import android.text.TextUtils;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.yxcorp.gifshow.models.QMedia;
import e17.i$b;
import e17.i;
import hl9.c;
import g7a.p;
import com.yxcorp.gifshow.comment.utils.b$a;
import com.yxcorp.gifshow.comment.utils.b;
import fx9.c$d;
import fx9.c$g;
import java.util.List;
import java.util.Collection;
import ekd.q;
import m9a.t$c;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import g7a.r;

public final class NasaCommentExternalEditorPresenter$e implements g	// class@001851
{
    public final NasaCommentExternalEditorPresenter b;

    public void NasaCommentExternalEditorPresenter$e(NasaCommentExternalEditorPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       QCurrentUser mE;
       b uob;
       Activity activity;
       NasaCommentExternalEditorPresenter q;
       String fullSource;
       String str4;
       NasaCommentExternalEditorPresenter q1;
       CharSequence text;
       String str5;
       ClientEvent$ElementPackage obj2;
       String str6;
       String str7;
       c$b a;
       NasaCommentExternalEditorPresenter t2;
       Object obj = this;
       NasaCommentExternalEditorPresenter$e obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       NasaCommentExternalEditorPresenter nasaCommentE = NasaCommentExternalEditorPresenter.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, NasaCommentExternalEditorPresenter$e.class, "1")) {
       }else {
          String str = "mFragment";
          String str1 = "mCommentLogger";
          int i = 0x7f103078;
          String str2 = "QCurrentUser.ME";
          int i1 = 0;
          String str3 = "mEditHolderHelper";
          Object[] objArray = null;
          if (obj1 instanceof c$a) {
             obj1 = obj.b;
             Objects.requireNonNull(obj1);
             if (!PatchProxy.applyVoid(objArray, obj1, nasaCommentE, "8")) {
                mE = QCurrentUser.ME;
                a.o(mE, str2);
                if (!mE.isLogined()) {
                   uob = d.a(-1712118428);
                   activity = obj1.getActivity();
                   q = obj1.q;
                   if (q == null) {
                      a.S("mPhoto");
                   }
                   fullSource = q.getFullSource();
                   str4 = a.B.getString(i);
                   q1 = obj1.q;
                   if (q1 == null) {
                      a.S("mPhoto");
                   }
                   uob.ne(activity, fullSource, "photo_comment", 10, str4, q1.mEntity, null, null, null).h();
                }else {
                   Object[] objArray1 = new Object[i1];
                   o.C().w("NasaCommentExternalEditorPresenter", "onAtButtonClick: showEditorAndAtFloatPanel", objArray1);
                   q = obj1.t;
                   if (q == null) {
                      a.S(str3);
                   }
                   q.z(obj1.p);
                   q = obj1.t;
                   if (q == null) {
                      a.S(str3);
                   }
                   nasaCommentE = obj1.t;
                   if (nasaCommentE == null) {
                      a.S(str3);
                   }
                   q.F(nasaCommentE.k());
                   q = obj1.r;
                   if (q == null) {
                      a.S(str1);
                   }
                   q1 = obj1.x;
                   if (q1 == null) {
                      a.S(str);
                   }
                   q.x(q1);
                }
             }
          }else if(obj1 instanceof c$c){
             obj1 = obj.b;
             Objects.requireNonNull(obj1);
             if (!PatchProxy.applyVoid(objArray, obj1, nasaCommentE, "9")) {
                NasaCommentExternalEditorPresenter t = obj1.t;
                if (t == null) {
                   a.S(str3);
                }
                t.z(obj1.p);
                NasaCommentExternalEditorPresenter t1 = obj1.t;
                if (t1 == null) {
                   a.S(str3);
                }
                t = obj1.D;
                if (t != null) {
                   text = t.getText();
                   if (text != null) {
                      str5 = text.toString();
                   label_00f8 :
                      obj2 = PatchProxy.apply(objArray, obj1, nasaCommentE, "11");
                      if (obj2 != patchProxyRe) {
                         str6 = obj2;
                      }else {
                         q = obj1.q;
                         if (q == null) {
                            a.S("mPhoto");
                         }
                         str7 = a.a(q);
                         if (str7 == null) {
                            str7 = a1.p(R.string.arg_RES_7f103836);
                            a.o(str7, "CommonUtil.string\(R.string.nasa_comment_hint\)");
                         }
                         str6 = str7;
                      }
                      t1.D(str5, true, null, Integer.MAX_VALUE, str6);
                      q = obj1.r;
                      if (q == null) {
                         a.S(str1);
                      }
                      q1 = obj1.x;
                      if (q1 == null) {
                         a.S(str);
                      }
                      q.B(q1);
                   }
                }
                str5 = objArray;
                goto label_00f8 ;
             }
          }else if(obj1 instanceof c$e){
             obj1 = obj.b;
             Objects.requireNonNull(obj1);
             if (!PatchProxy.applyVoid(objArray, obj1, nasaCommentE, "10")) {
                e.c(obj1.getActivity(), new s(obj1));
             }
          }else {
             int i2 = 1;
             if (obj1 instanceof c$b) {
                NasaCommentExternalEditorPresenter$e b = obj.b;
                Objects.requireNonNull(b);
                if (!PatchProxy.applyVoidOneRefs(obj1, b, nasaCommentE, "12")) {
                   if (obj1 != null) {
                      a = obj1.a;
                      if (a != null) {
                         t2 = b.t;
                         if (t2 == null) {
                            a.S(str3);
                         }
                         StringBuilder str8 = "";
                         NasaCommentExternalEditorPresenter t3 = b.t;
                         if (t3 == null) {
                            a.S(str3);
                         }
                         t2.A(str8+t3.k()+a);
                      }
                   }
                   q1 = b.t;
                   if (q1 == null) {
                      a.S(str3);
                   }
                   q1.z(b.p);
                   q1 = b.t;
                   if (q1 == null) {
                      a.S(str3);
                   }
                   t2 = b.D;
                   if (t2 != null) {
                      CharSequence hint = t2.getHint();
                      if (hint != null) {
                         str1 = hint.toString();
                      label_01c2 :
                         q1.C(str1);
                         q1 = b.q;
                         if (q1 == null) {
                            a.S("mPhoto");
                         }
                         obj2 = PatchProxy.apply(objArray, b, nasaCommentE, "13");
                         if (obj2 != patchProxyRe) {
                            i1 = obj2.intValue();
                         }else {
                            q = b.C;
                            if (q != null) {
                               i1 = q.q(b.v);
                            }
                         }
                         str7 = "mEditorHolderText.hint.toString\(\)";
                         if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(q1, Integer.valueOf(i1), str7, null, a.class, "2")) {
                            obj2 = new ClientEvent$ElementPackage();
                            obj2.action2 = "COMMENT_INPUT";
                            obj2.params = a.a(str7);
                            ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                            uContentPack.photoPackage = w1.g(q1.getEntity(), (i1 + i2));
                            u1.B(new ClickMetaData().setType(i2).setElementPackage(obj2).setContentPackage(uContentPack).setFeedLogCtx(q1.getFeedLogCtx()));
                         }
                      }
                   }
                   Object[] objArray2 = objArray;
                   goto label_01c2 ;
                }
             }else if(obj1 instanceof c$f){
                obj1 = obj.b;
                Objects.requireNonNull(obj1);
                if (!PatchProxy.applyVoid(objArray, obj1, nasaCommentE, "17")) {
                   mE = QCurrentUser.ME;
                   a.o(mE, str2);
                   if (mE.isLogined()) {
                      q = obj1.t;
                      if (q == null) {
                         a.S(str3);
                      }
                      str7 = q.k();
                      a.o(str7, "mEditHolderHelper.text");
                      Objects.requireNonNull(str7, "null cannot be cast to non-null type kotlin.CharSequence");
                      if (TextUtils.isEmpty(StringsKt__StringsKt.o5(str7).toString())) {
                         q = obj1.t;
                         if (q == null) {
                            a.S(str3);
                         }
                         if (q.f() == null) {
                            q = obj1.t;
                            if (q == null) {
                               a.S(str3);
                            }
                            if (q.i() == null) {
                               i$b uob1 = i.m();
                               uob1.x(R.string.arg_RES_7f104252);
                               uob1.l(i2);
                               a.o(i.c(R.style.arg_RES_7f11066a, uob1), "KSToast.applyStyle\(R.sty¡­tyle_toast_text, builder\)");
                            }
                         }
                      }
                   label_02b7 :
                      q = obj1.t;
                      if (q == null) {
                         a.S(str3);
                      }
                      if (!c.a(q.k()) && !PatchProxy.applyVoid(objArray, obj1, nasaCommentE, "16")) {
                         NasaCommentExternalEditorPresenter f = obj1.F;
                         if (f != null) {
                            q = obj1.t;
                            if (q == null) {
                               a.S(str3);
                            }
                            if (f.i("commentKeywordActionConfiguration", q.k(), null, new p(obj1), "HUMANISTIC_CARE") == i2) {
                               i1 = 1;
                            }
                         }
                         if (!i1) {
                            obj1.V8();
                         }
                      }
                   }else {
                      uob = d.a(-1712118428);
                      activity = obj1.getActivity();
                      q = obj1.q;
                      if (q == null) {
                         a.S("mPhoto");
                      }
                      fullSource = q.getFullSource();
                      str4 = obj1.n8(R.string.arg_RES_7f103076);
                      q1 = obj1.q;
                      if (q1 == null) {
                         a.S("mPhoto");
                      }
                      uob.ne(activity, fullSource, "photo_comment", 8, str4, q1.mEntity, null, null, null).h();
                   }
                }
             }else if(obj1 instanceof c$d){
                obj1 = obj.b;
                Objects.requireNonNull(obj1);
                if (!PatchProxy.applyVoid(objArray, obj1, nasaCommentE, "14")) {
                   q1 = obj1.t;
                   if (q1 == null) {
                      a.S(str3);
                   }
                   q1.m();
                }
             }else if(obj1 instanceof c$g){
                NasaCommentExternalEditorPresenter$e b1 = obj.b;
                Objects.requireNonNull(b1);
                if (!PatchProxy.applyVoidOneRefs(obj1, b1, nasaCommentE, "20") && !q.f(obj1.a())) {
                   c$g b2 = obj1.b;
                   List list = obj1.a();
                   if (PatchProxy.isSupport(nasaCommentE) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(b2), list, b1, nasaCommentE, "21") && (list != null && (list.size() > b2 && list.get(b2) instanceof t$c)))) {
                      Object obj3 = list.get(b2);
                      Objects.requireNonNull(obj3, "null cannot be cast to non-null type com.yxcorp.gifshow.detail.util.NasaQuickCommentEmotionsDataUtil.QuickCommentEmotion");
                      QCurrentUser qCurrentUser = QCurrentUser.me();
                      a.o(qCurrentUser, "QCurrentUser.me\(\)");
                      if (!qCurrentUser.isLogined()) {
                         LoginParams$a uoa = new LoginParams$a();
                         uoa.d(a1.p(i));
                         d.a(-1712118428).x00(b1.getActivity(), i1, uoa.a(), new r(b1, b2, obj3));
                      }else {
                         b1.W8(b2, obj3);
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
