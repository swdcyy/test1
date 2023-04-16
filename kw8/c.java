package kw8.c;
import erd.g;
import com.yxcorp.gifshow.activity.share.ShareActivity;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.app.Activity;
import ekd.k1;
import ow8.a;
import xw8.d;
import f66.i;
import jq.a;
import q87.c;
import ekd.j0;
import android.os.Parcelable;
import org.parceler.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.SerialArg;
import com.kuaishou.android.post.PostPageArg;
import android.net.Uri;
import android.content.ContentResolver;
import xkd.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.Serializable;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.android.post.LocationArg;
import com.kuaishou.android.model.mix.Location;
import xw8.p0;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.StringBuilder;
import k2b.u1;
import lq.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kuaishou.edit.draft.Workspace$Type;
import ow8.c;
import a26.a;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.util.List;
import bba.b;
import haa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Publish$b;
import java.util.Iterator;
import com.kuaishou.android.model.mix.PhotoKgTag;
import com.kuaishou.edit.draft.CaptionTopic$b;
import com.kuaishou.edit.draft.CaptionTopic;
import com.kuaishou.edit.draft.CaptionTopic$TopicType;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.android.post.BoolArg;
import com.kuaishou.edit.draft.Publish;
import com.kuaishou.edit.draft.Attributes;
import com.google.protobuf.Timestamp;
import lnc.la;
import lnc.a1;
import java.lang.Integer;
import com.kuaishou.android.post.StrArg;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.upload.SameFrameShareConfig;
import java.util.HashMap;
import lq.e;
import lq.e$c;
import java.util.Collection;
import ekd.q;
import com.kwai.framework.model.user.User;
import com.kwai.gifshow.post.api.core.camerasdk.model.b;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import wba.u;
import yaa.c;
import com.kuaishou.edit.draft.Song;
import java.util.ArrayList;
import java.lang.Iterable;
import com.google.common.collect.Lists;
import com.kuaishou.android.post.topic.TagSourceUtils;
import java.util.Set;
import java.util.Collections;
import lnc.r5;
import com.yxcorp.gifshow.encode.EncodeRequest;
import com.kuaishou.edit.draft.Workspace;
import java.io.File;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import vaa.a;
import qw8.o;
import com.kuaishou.edit.draft.EditConfig;
import fg6.a;
import qr4.i;
import qr4.m$k0;
import qr4.m$d;
import com.kwai.feature.post.api.feature.publish.model.ConversionTaskList$TaskInfo;
import qr4.m$c;
import com.kwai.feature.post.api.feature.publish.model.ConversionTaskList;
import com.google.gson.Gson;
import lnc.d7;
import com.kwai.feature.post.api.feature.tuna.UpdateShareBusinessLinkModel;
import com.kuaishou.android.model.mix.HotspotParams;
import bx8.p;
import bx8.k;
import ax8.f;
import kw8.d;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import ex8.d;
import androidx.lifecycle.ViewModel;
import android.text.TextUtils;
import zw8.v1;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.b5;
import io.reactivex.subjects.PublishSubject;

public final class c implements g	// class@002c29
{
    public final ShareActivity b;

    public void c(ShareActivity p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c this;
       PatchProxyResult patchProxyRe1;
       String str5;
       String str6;
       long l1;
       int i;
       String str7;
       Object[] objArray1;
       Object[] objArray2;
       int b1;
       boolean b3;
       Object[] objArray5;
       Object[] objArray6;
       VideoContext videoContext;
       c uoc1;
       PatchProxyResult patchProxyRe2;
       Object[] str101;
       boolean str101;
       String str11;
       List list;
       Iterator iterator;
       d g;
       Gson a;
       d f;
       Object[] objArray9;
       i obj;
       Object obj1;
       HotspotParams hotspotParam;
       Gson a1;
       UpdateShareBusinessLinkModel updateShareB;
       UpdateShareBusinessLinkModel mSupportPost;
       p0 a2;
       VideoContext a3;
       m$k0 v;
       m$d a4;
       ArrayList uArrayList1;
       m$d a5;
       int len;
       int i1;
       ConversionTaskList$TaskInfo str1011;
       ConversionTaskList str1011;
       i obj2;
       int b5;
       c uoc3;
       boolean mappingTextT;
       Music music;
       c b = this.b;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ShareActivity shareActivit = ShareActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, shareActivit, "8")) {
          this = b;
       }else {
          Intent intent = b.getIntent();
          long l = k1.i();
          String str = "1";
          d uod = PatchProxy.applyTwoRefsWithListener(b, intent, objArray, a.class, str);
          String str1 = "6";
          String str2 = "10";
          String str3 = "";
          String str4 = null;
          if (uod != patchProxyRe) {
          }else {
             Object[] objArray7 = new Object[str4];
             String str8 = "ShareIntentParseUtils";
             a.b().w(str8, "resolveIntent\(\) called\(\)", objArray7);
             d k = new d();
             String lastPathSegm = "share_qphoto";
             if (j0.g(intent, lastPathSegm)) {
                k.D = b.a(intent.getParcelableExtra(lastPathSegm));
             }else if(i.g().getEditQPhoto().get() != null){
                k.D = i.g().getEditQPhoto().get();
             }
             lastPathSegm = b.a(b.getContentResolver(), j0.d(intent, "android.intent.extra.STREAM"));
             if (TextUtils.x(lastPathSegm) && k.D == null) {
                PatchProxy.onMethodExit(a.class, str);
                uod = null;
             }else {
                k.t = j0.a(intent, "wont_start_homepage_when_finished_as_last_activity", str4);
                String str9 = (intent.getData() == null)? null: intent.getData().getLastPathSegment();
                k.b = str9;
                k.d = j0.e(intent, "music");
                k.k.l(i.g().getPublishLocation().get());
                byte[] byteArrayExt = intent.getByteArrayExtra("VIDEO_CONTEXT");
                if (byteArrayExt != null) {
                   videoContext = new VideoContext();
                   videoContext.k0(byteArrayExt);
                   k.f = videoContext;
                   l1 = l;
                   Object[] objArray8 = new Object[0];
                   a.b().w(str8, "resolveIntent\(\) set videoContext from intent data len="+byteArrayExt.length, objArray8);
                }else {
                   l1 = l;
                }
                d String str10 = "photo_task_id";
                if (j0.g(intent, str10)) {
                   k.r = j0.f(intent, str10);
                }
                if (TextUtils.x(k.r)) {
                   k.r = u1.f();
                }
                intent.putExtra(str10, k.r);
                str10 = k.D;
                c uoc = i.m().p().l();
                if (str10 == null || DraftUtils.N(uoc)) {
                   uoc1 = b;
                   patchProxyRe2 = patchProxyRe;
                   k.g = uoc;
                }else {
                   uoc3 = null;
                   a uoa = new a(0);
                   uoa.g(c.i(uoc3, str10));
                   uoa.f(k.r);
                   uoc = DraftUtils.j(uoa);
                   if (!PatchProxy.applyVoidTwoRefs(uoc, str10, uoc3, c.class, str2) && (str10.getPhotoMeta() != null && (str10.getPhotoMeta().mKgTags == null || str10.getPhotoMeta().mKgTags.isEmpty()))) {
                      uoc1 = b;
                      patchProxyRe2 = patchProxyRe;
                   }else {
                      b uob2 = a.p(uoc);
                      uob2.c0();
                      Publish$b uob3 = uob2.k();
                      Iterator CaptionTopic$b str102 = str10.getPhotoMeta().mKgTags.iterator();
                      while (str102.hasNext()) {
                         PhotoKgTag photoKgTag = str102.next();
                         str102 = CaptionTopic.newBuilder();
                         str102.b(photoKgTag.mId);
                         str102.c(TextUtils.k(photoKgTag.mName));
                         str102.d(CaptionTopic$TopicType.FILM_CARD);
                         str102.a(TextUtils.k(photoKgTag.mKgId));
                         uob3.a(str102.build());
                         str102 = str102;
                         b = b;
                         patchProxyRe = patchProxyRe;
                      }
                      uoc1 = b;
                      patchProxyRe2 = patchProxyRe;
                      uob2.f();
                   }
                   k.g = uoc;
                }
                if (i.g().getFromThirdParty().get(Boolean.FALSE).booleanValue()) {
                   if (TextUtils.x(lastPathSegm)) {
                      Object[] objArray3 = new Object[0];
                      a.b().t(str8, "No workspace or file to share.", objArray3);
                      PatchProxy.onMethodExit(a.class, str);
                      str5 = str2;
                      str6 = str1;
                      this = uoc1;
                      patchProxyRe1 = patchProxyRe2;
                      uod = null;
                   label_00a4 :
                      i = 0;
                   label_08a4 :
                      this.W = uod;
                      str7 = "FEED_PAGE";
                      if (!PatchProxy.applyVoid(null, this, shareActivit, str6)) {
                         p op = new p();
                         boolean b2 = str7.equalsIgnoreCase(this.W.m);
                         ShareActivity w1 = this.W;
                         b3 = DraftUtils.O(w1.D, w1.g);
                         str8 = "ShareActivity";
                         if (b2 || b3) {
                            objArray5 = new Object[i];
                            a.b().w(str8, "init reEditRepo, page from feed?"+b2+" isReEditAfterDelete"+b3, objArray5);
                            ShareActivity w2 = this.W;
                            this.W.F = new k(w2.D, w2.g);
                         }
                         if (this.J3()) {
                            objArray6 = new Object[i];
                            a.b().w(str8, "EnablePublishServiceLink, init ShareBusinessRepo", objArray6);
                            this.W.G = new f(b2, this.W.F, op);
                         }
                         this.W.k.q.add(ViewModelProviders.of(this, new d(this)).get(d.class));
                      }
                      objArray1 = new Object[i];
                      a.b().s("time_tag", "onCreate resolveIntent timeCost: "+k1.t(l1), objArray1);
                      ShareActivity w = this.W;
                      if (w == null) {
                         lastPathSegm = (intent.getData() != null)? intent.getData().getLastPathSegment(): str3;
                         str7 = "ks://share";
                         if (!TextUtils.isEmpty(lastPathSegm)) {
                            str3 = "/"+lastPathSegm;
                         }
                         objArray2 = new Object[i];
                         a.b().t(str7+str3, "Intent data parse error. Finish.", objArray2);
                         this.finish();
                      }else {
                         k = w.k;
                         if (k != null) {
                            k.y = str7.equalsIgnoreCase(w.m);
                         }
                         if (!PatchProxy.applyVoid(null, this, shareActivit, "14")) {
                            w = this.W;
                            if (w.g != null && TextUtils.x(w.C)) {
                               w = this.W;
                               b uob = w.g.Q0();
                               k = this.W.z;
                               o oo = o.class;
                               if (PatchProxy.isSupport(oo)) {
                                  str4 = PatchProxy.applyTwoRefs(uob, Boolean.valueOf(k), null, oo, str5);
                                  if (str4 != patchProxyRe1) {
                                  }else if(uob == null){
                                     if (k == null || uob.v() == null) {
                                        objArray = new Object[i];
                                        a.b().s("share_draft_tag", "getDraftImmutableText caption draft is null", objArray);
                                     }else {
                                        str4 = uob.v().getImmutableText();
                                        Object[] objArray4 = new Object[i];
                                        a.b().s("share_draft_tag", "getDraftImmutableText: "+str4, objArray4);
                                     }
                                  }
                                  str4 = null;
                               }else {
                                  goto label_09f2 ;
                               }
                               w.C = str4;
                            }
                         }
                         if (!PatchProxy.applyVoid(null, this, shareActivit, "7")) {
                            v1 ov1 = new v1();
                            ov1.f(this.findViewById(R.id.publish_view));
                            objArray3 = new Object[]{this,this.W};
                            ov1.i(objArray3);
                         }
                         uod = this.W.k;
                         if (uod != null) {
                            b1 = b5.a(this);
                            p0 op0 = p0.class;
                            if (!PatchProxy.isSupport(op0) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b1), uod, op0, "11")) {
                               uod.o.onNext(Boolean.valueOf(b1));
                            }
                         }
                      }
                   }else {
                      k.B = lastPathSegm;
                      b1 = 0;
                      objArray2 = new Object[b1];
                      a.b().w(str8, "Direct share "+lastPathSegm, objArray2);
                   }
                }else {
                   b1 = 0;
                }
                uod = k.g;
                if (uod != null) {
                   k.f = uod.d1();
                   str101 = new Object[b1];
                   a.b().w(str8, "resolveIntent\(\) set videoContext from work space", str101);
                   b uob1 = k.g.Q0();
                   if (uob1 != null && uob1.v() != null) {
                      str101 = true;
                      k.z = str101;
                      k.A = DraftUtils.l0(uob1.v().getAttributes().getModifiedAt());
                   label_0287 :
                      k.y = j0.b(intent, "EDITING_ACTION", 3);
                      str7 = -1;
                      if (PatchProxy.applyVoidTwoRefs(intent, k, null, a.class, str1)) {
                         str7 = str8;
                         str5 = str2;
                         str6 = str1;
                         str11 = str;
                         patchProxyRe1 = patchProxyRe2;
                         i = 0;
                      }else {
                         i = 0;
                         objArray7 = new Object[i];
                         a.b().w(str8, "fillSameFrameInfoToSharePageModel", objArray7);
                         int b4 = j0.b(intent, "same_frame_available_depth", str7);
                         if (b4 == str7) {
                            b4 = a1.s(la.d(k.f), str7);
                         }
                         int i2 = b4;
                         if (PatchProxy.isSupport(a.class)) {
                            str7 = str8;
                            str5 = str2;
                            str6 = str1;
                            str11 = str;
                            Workspace$Type obj3 = PatchProxy.applyThreeRefs(Integer.valueOf(i2), k, intent, null, a.class, "7");
                            patchProxyRe1 = patchProxyRe2;
                            if (obj3 != patchProxyRe1) {
                               mappingTextT = obj3.booleanValue();
                            }else if(("com.kwai.videoeditor").equals(i.g().getThirdPartyAppPackage().get())){
                               mappingTextT = false;
                            }else if(!i2){
                               uod = k.g;
                               obj3 = (uod != null)? uod.a1(): Workspace$Type.UNKNOWN;
                               g = k.g;
                               Workspace$Source source = (g != null)? g.T0(): Workspace$Source.UNRECOGNIZED;
                               if (obj3 == Workspace$Type.VIDEO || (obj3 == Workspace$Type.KTV_MV || (obj3 == Workspace$Type.LONG_VIDEO || (obj3 == Workspace$Type.KUAISHAN || (obj3 == Workspace$Type.AI_CUT || (source == Workspace$Source.KUAI_SHAN || obj3 == Workspace$Type.ALBUM_MOVIE)))))) {
                                  mappingTextT = j0.a(intent, "disable_sameframe_switch", i);
                               }
                            }
                            mappingTextT = true;
                         }else {
                            str7 = str8;
                            str5 = str2;
                            str6 = str1;
                            str11 = str;
                            patchProxyRe1 = patchProxyRe2;
                            goto label_02f4 ;
                         }
                         if (!mappingTextT) {
                            lastPathSegm = j0.f(intent, "same_frame_user_name");
                            str4 = j0.f(intent, "same_frame_photo_id");
                            if (TextUtils.x(str4)) {
                               str4 = la.f(k.f);
                            }
                            String str12 = str4;
                            if (TextUtils.x(lastPathSegm)) {
                               lastPathSegm = la.e(k.f);
                            }
                            String str13 = lastPathSegm;
                            b3 = j0.a(intent, "same_frame_allow_lrc", i);
                            boolean b6 = (!j0.g(intent, "same_frame_allow_lrc"))? a.a(k.f): b3;
                            objArray1 = new Object[i];
                            a.b().w(str7, "video is allow sameFrame", objArray1);
                            SameFrameShareConfig sameFrameSha = new SameFrameShareConfig(str13, str12, true, b6, i2);
                            k.H = lastPathSegm;
                         }
                      }
                      k.E = c.j(k.g);
                      e$c uoc2 = i.m().k().f();
                      if (k.E.isEmpty() && uoc2 != null) {
                         list = c.d(uoc2.a(), new HashMap());
                         objArray6 = new Object[i];
                         a.b().w(str7, "resolveIntent: add atFriends users="+list, objArray6);
                         if (!q.f(list)) {
                            iterator = list.iterator();
                            while (iterator.hasNext()) {
                               User user = iterator.next();
                               objArray5 = new Object[i];
                               a.b().w(str7, "resolveIntent: add atFriends "+user.mName+" "+user.mId, objArray5);
                               k.E.put(user.mId, user);
                            }
                         }
                      }
                      uod = k.f;
                      if (uod != null) {
                         list = b.j(la.a(uod));
                         if (list != null) {
                            iterator = list.iterator();
                            while (iterator.hasNext()) {
                               MagicEmoji$MagicFace magicFace = iterator.next();
                               if (!k.e.contains(magicFace)) {
                                  k.e.add(magicFace);
                               }
                            }
                         }
                         uod = k.d;
                         if (uod == null) {
                            music = la.b(k.f, c.m(k.g), str101);
                         }
                         k.d = uod;
                         g = k.g;
                         if (!PatchProxy.applyVoidTwoRefs(uod, g, null, u.class, "44")) {
                            uoc3 = (g != null)? g.J0(): null;
                            if (uod != null && uoc3 != null) {
                               Song song = u.a.h(uoc3);
                               if (song != null && !q.f(song.getMappingTextTagList())) {
                                  mappingTextT = song.getMappingTextTagCount();
                                  uod.mMappingTextTags = new ArrayList();
                                  for (b5 = 0; b5 < mappingTextT; b5 = b5 + 1) {
                                     uod.mMappingTextTags.add(song.getMappingTextTag(b5));
                                  }
                               }
                            }
                         }
                      }
                   label_04ae :
                      lastPathSegm = j0.f(intent, "tag");
                      if (!TextUtils.x(lastPathSegm)) {
                         k.c.add(lastPathSegm);
                      }
                      uod = k.d;
                      if (uod != null && !q.f(uod.mMappingTextTags)) {
                         ArrayList uArrayList = Lists.c(k.d.mMappingTextTags);
                         str2 = null;
                         TagSourceUtils.b.f(uArrayList, "MUSIC", str2);
                         uArrayList.removeAll(Collections.singleton(str2));
                         uArrayList.removeAll(k.c);
                         k.c.addAll(uArrayList);
                      }
                      if (k.e.isEmpty()) {
                         lastPathSegm = "magic_emoji";
                         if (j0.g(intent, lastPathSegm)) {
                            k.e.add(j0.e(intent, lastPathSegm));
                         }
                      }
                      lastPathSegm = "encode_config_id";
                      if (j0.g(intent, lastPathSegm)) {
                         k.q = j0.c(intent, lastPathSegm, 0);
                      }
                      lastPathSegm = "share_video_duration";
                      if (j0.g(intent, lastPathSegm)) {
                         k.s = j0.c(intent, lastPathSegm, -1);
                      }
                      lastPathSegm = j0.f(intent, "encode_request_key");
                      if (!TextUtils.x(lastPathSegm)) {
                         k.p = r5.b().a(lastPathSegm, EncodeRequest.class);
                      }
                      if (k.p == null) {
                         k.p = EncodeRequest.fromJson(j0.f(intent, "encode_request"));
                      }
                      uod = k.g;
                      if (uod != null) {
                         g = k.p;
                         if (g != null) {
                            EncodeRequest mWorkspaceId = g.mWorkspaceId;
                            if (mWorkspaceId != null && mWorkspaceId.equals(uod.D0())) {
                               k.p.mWorkspace = k.g.v();
                            }
                         }
                      }
                      if (!PatchProxy.applyVoidTwoRefs(k, intent, null, a.class, "4")) {
                         str8 = j0.f(intent, "cover_path");
                         if (k.i == null && !TextUtils.x(str8)) {
                            try{
                               k.i = new File(str8);
                            }catch(java.lang.Exception e0){
                               PostUtils.D("SharePageIntentDataError", "coverFileError"+str8, e0);
                            }
                         }
                      }
                   label_05c0 :
                      if (!PatchProxy.applyVoidTwoRefs(k, intent, null, a.class, "5")) {
                         str8 = j0.f(intent, "ORIGIN_COVER_PATH");
                         if (k.j == null && !TextUtils.x(str8)) {
                            try{
                               k.j = new File(str8);
                            }catch(java.lang.Exception e0){
                               PostUtils.D("SharePageIntentDataError", "originCoverFileError"+str8, e0);
                            }
                         }
                      }
                   }
                }
                str101 = true;
                goto label_0287 ;
             }
          }
          this = b;
          patchProxyRe1 = patchProxyRe;
          str5 = str2;
          str6 = str1;
          l1 = l;
          goto label_00a4 ;
       }
       this.I3();
       return;
    }
}
