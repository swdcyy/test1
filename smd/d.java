package smd.d;
import amd.c;
import xvc.f;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import mmd.b;
import java.util.Objects;
import mmd.b$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xld.a;
import java.util.List;
import mod.a;
import mmd.a;
import nsd.u;
import smd.b;
import com.yxcrop.gifshow.v3.editor.decoration_v2.vm.DecorationMiddleware;
import xvc.g;
import smd.a;
import rmd.c;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import eba.a;
import haa.a;
import com.kuaishou.edit.draft.Workspace$Type;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.f;
import xpc.b;
import xpc.b$a;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Sticker;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData$a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewOriginFileRenderViewData;
import java.lang.Long;
import com.kuaishou.edit.draft.Sticker$Type;
import rmd.b;
import java.lang.Enum;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawerData;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawerData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.kuaishou.edit.draft.RelayStickerParam;
import trd.u;
import com.kuaishou.edit.draft.Friend;
import com.yxcorp.gifshow.record.interactive.RelayUserInfo;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import java.util.Collection;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElementData;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.kuaishou.edit.draft.TagStickerParam;
import com.kuaishou.edit.draft.StickerResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import com.kuaishou.edit.draft.TimeRange;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.DynamicStickerParam;
import com.yxcrop.gifshow.v3.editor.decoration_v2.data.NewDecorationElementData;
import amd.a;
import jod.a;
import com.yxcorp.gifshow.widget.adv.Action$a;
import com.yxcorp.gifshow.widget.adv.Action$Type;
import com.yxcorp.gifshow.widget.adv.Action;
import com.yxcorp.gifshow.widget.adv.model.a;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import com.yxcorp.gifshow.widget.adv.model.f;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a$a;
import com.kuaishou.edit.draft.Workspace$Source;
import xvc.b;
import tvc.e;
import ooc.g;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import xvc.c;
import com.yxcorp.gifshow.v3.framework.KSStore;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import tvc.b;
import smd.c;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import amd.b;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.StickerInitAction;
import oa0.a;
import java.util.Map;
import uvc.a;
import android.graphics.RectF;
import com.yxcrop.gifshow.v3.editor.decoration_v2.action.DecorationTipShowAction;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.timeline.DecorationTimelineAttachAction;
import com.yxcrop.gifshow.v3.editor.decoration_v2.action.PhotoMovieDecorationTimelineAttachAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.timeline.DecorationTimelineDetachAction;
import com.yxcorp.gifshow.v3.editor.sticker.h1;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;
import com.yxcrop.gifshow.v3.editor.decoration_v2.action.PhotoMovieDecorationTimelineDetachAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationSelectAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationUnSelectAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationMoveStartAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationScaleStartAction;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.StickerScaleAndRotateEndAction;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.AddStickerAction;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.UpdateStickerAttachInfoAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationMoveEndAction;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.DeleteStickerAction;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.StickerLibraryShowAction;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.StickerLibraryCloseAction;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.UpdateSelectedLayerAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.KeyboardPanelFoldButtonClickedAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.TextEditStartAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.TextEditEndAction;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.pic.PicTemplateStartAction;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.pic.SaveTemplateStickerAction;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.pic.DiscardTemplateStickerAction;
import cmd.a;
import msd.l;
import ekd.q;
import java.util.HashMap;
import java.lang.Float;

public class d extends c	// class@0025bf
{

    public void d(boolean p0,f p1,VideoSDKPlayerView p2){
       a.p(p1, "editRepo");
       b$a d = b.D;
       Objects.requireNonNull(d);
       b uob = PatchProxy.apply(null, d, b$a.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          b uob1 = new b(null, null, false, false, null, false, false, null, false, 511, null);
       }
       super(p0, p1, p2, uob, new b());
       return;
    }
    public b A0(g p0,b p1){
       a a;
       PatchProxyResult patchProxyRe1;
       String obj3;
       g obj4;
       boolean i;
       String obj5;
       int i1;
       a uoa1;
       a uoa2;
       c uoc3;
       ArrayList uArrayList1;
       boolean b;
       String str4;
       ArrayList uArrayList2;
       Workspace$Type type1;
       Sticker sticker1;
       int i3;
       StickerResult result1;
       int i4;
       String external;
       String text;
       String id;
       Iterator obj = p0;
       c obj1 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "2";
       String obj2 = PatchProxy.applyTwoRefs(obj, obj1, this, d.class, str);
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       obj2 = "draftState";
       a.p(obj, obj2);
       String str1 = "oldState";
       a.p(obj1, str1);
       a = a.a;
       Objects.requireNonNull(a);
       c uoc = c.class;
       String str2 = "1";
       b uob = PatchProxy.applyTwoRefs(obj, obj1, a, a.class, str2);
       if (uob != patchProxyRe) {
       }else {
          a.p(obj, obj2);
          a.p(obj1, str1);
          c uoc1 = p0.i();
          a.m(uoc1);
          a uoa = a.q(uoc1);
          c a1 = c.a;
          c uoc2 = p0.i();
          a.m(uoc2);
          Workspace$Type type = uoc2.a1();
          a.o(type, "draftState.workspaceDraft!!.type");
          Objects.requireNonNull(a1);
          ArrayList uArrayList = PatchProxy.applyTwoRefs(type, uoa, a1, uoc, str2);
          Object[] objArray = null;
          if (uArrayList != patchProxyRe) {
          }else {
             a.p(type, "workspaceType");
             a.p(uoa, "stickerDraft");
             uArrayList = new ArrayList();
             boolean b1 = f.E(type);
             int i2 = b.k.a(type);
             List list = uoa.z();
             a.o(list, "stickerDraft.messages");
             Iterator iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                Sticker sticker = iterator1.next();
                NewStickerElementData$a p = NewStickerElementData.P;
                Objects.requireNonNull(p);
                NewStickerElementData newStickerEl1 = PatchProxy.apply(objArray, p, NewStickerElementData$a.class, str2);
                if (newStickerEl1 != patchProxyRe) {
                }else {
                   NewStickerElementData newStickerEl2 = new NewStickerElementData(0, 0, 0, 0, 0, 0, 63, null);
                }
                if (!b1) {
                   newStickerEl1 = new NewOriginFileRenderViewData(objArray, 1, objArray);
                }
                String str3 = "it";
                a.o(sticker, str3);
                Sticker$Type stickerType = sticker.getStickerType();
                obj5 = "";
                Iterator iterator2 = iterator1;
                if (stickerType == null) {
                   str4 = str2;
                label_00da :
                   i1 = 0;
                   newStickerEl1.N0(i1);
                label_0119 :
                   patchProxyRe1 = patchProxyRe;
                   uArrayList2 = uArrayList;
                   type1 = type;
                   sticker1 = sticker;
                   i3 = i2;
                label_0122 :
                   uArrayList1 = -1;
                }else {
                   i1 = b.a[stickerType.ordinal()];
                   str4 = str2;
                   if (i1 != 1) {
                      if (i1 != 2) {
                         if (i1 != 3) {
                            if (i1 != 4) {
                               if (i1 != 5) {
                                  goto label_00da ;
                               }else {
                                  NewVoteStickerDrawerData newVoteStick = new NewVoteStickerDrawerData(null, null, null, null, false, true, 0, 95, null);
                                  c.a.a(sticker, str2);
                                  newStickerEl1 = str2;
                                  goto label_0119 ;
                               }
                            }else {
                               iterator1 = null;
                               if (f.B(type)) {
                                  iterator1 = iterator2;
                                  str2 = str4;
                                  objArray = null;
                               }else {
                                  NewRelayStickerDrawerData newRelayStic = new NewRelayStickerDrawerData(null, 0, null, b1, false, false, 0, false, 0, 503, null);
                                  c a3 = c.a;
                                  Objects.requireNonNull(a3);
                                  sticker1 = sticker;
                                  i3 = i2;
                                  String str5 = str3;
                                  if (PatchProxy.applyVoidThreeRefs(sticker, newStickerEl1, uoa, a3, c.class, "3")) {
                                     patchProxyRe1 = patchProxyRe;
                                     uArrayList2 = uArrayList;
                                     type1 = type;
                                     goto label_0122 ;
                                  }else {
                                     newStickerEl1.L(0x3f733333);
                                     RelayStickerParam relaySticker = sticker1.getRelayStickerParam();
                                     String str6 = "sticker.relayStickerParam";
                                     a.o(relaySticker, str6);
                                     text = relaySticker.getText();
                                     a.o(text, "sticker.relayStickerParam.text");
                                     newStickerEl1.f1(text);
                                     relaySticker = sticker1.getRelayStickerParam();
                                     a.o(relaySticker, str6);
                                     newStickerEl1.b1(relaySticker.getFriendsCount());
                                     relaySticker = sticker1.getRelayStickerParam();
                                     a.o(relaySticker, str6);
                                     newStickerEl1.d1((long)relaySticker.getWorkCount());
                                     String RelayStickerParam relaySticker1 = sticker1.getRelayStickerParam();
                                     a.o(relaySticker1, str6);
                                     relaySticker1 = relaySticker1.getFromPhotoid();
                                     a.o(relaySticker1, "sticker.relayStickerParam.fromPhotoid");
                                     ArrayList uArrayList3 = (!relaySticker1.length())? 1: null;
                                     relaySticker1 = "it.id";
                                     if (uArrayList3) {
                                        newStickerEl1.e1(true);
                                        patchProxyRe1 = patchProxyRe;
                                        uArrayList2 = uArrayList;
                                        type1 = type;
                                        external = str5;
                                     }else {
                                        newStickerEl1.e1(iterator1);
                                        uArrayList3 = newStickerEl1.V0();
                                        RelayStickerParam relaySticker3 = sticker1.getRelayStickerParam();
                                        a.o(relaySticker3, str6);
                                        List fromPhotoFri = relaySticker3.getFromPhotoFriendsList();
                                        a.o(fromPhotoFri, "sticker.relayStickerParam.fromPhotoFriendsList");
                                        type1 = type;
                                        ArrayList uArrayList5 = new ArrayList(u.Y(fromPhotoFri, 10));
                                        obj = fromPhotoFri.iterator();
                                        while (obj.hasNext()) {
                                           Friend uFriend1 = obj.next();
                                           Iterator iterator4 = obj;
                                           external = str5;
                                           a.o(uFriend1, external);
                                           String id1 = uFriend1.getId();
                                           a.o(id1, relaySticker1);
                                           patchProxyRe1 = patchProxyRe;
                                           uArrayList2 = uArrayList;
                                           File uFile2 = DraftFileManager.E().B(uFriend1.getFile(), uoa);
                                           obj3 = (uFile2 != null)? uFile2.getAbsolutePath(): null;
                                           uArrayList5.add(new RelayUserInfo(id1, obj3, uFriend1.getFile()));
                                           str5 = external;
                                           obj = iterator4;
                                           patchProxyRe = patchProxyRe1;
                                           uArrayList = uArrayList2;
                                        }
                                        patchProxyRe1 = patchProxyRe;
                                        uArrayList2 = uArrayList;
                                        external = str5;
                                        uArrayList3.addAll(uArrayList5);
                                     }
                                     RelayStickerParam relaySticker2 = sticker1.getRelayStickerParam();
                                     a.o(relaySticker2, str6);
                                     List friendsList = relaySticker2.getFriendsList();
                                     a.o(friendsList, "sticker.relayStickerParam.friendsList");
                                     ArrayList uArrayList4 = new ArrayList(u.Y(friendsList, 10));
                                     Iterator iterator3 = friendsList.iterator();
                                     while (iterator3.hasNext()) {
                                        Friend uFriend = iterator3.next();
                                        a.o(uFriend, external);
                                        id = uFriend.getId();
                                        a.o(id, relaySticker1);
                                        File uFile1 = DraftFileManager.E().B(uFriend.getFile(), uoa);
                                        text = (uFile1 != null)? uFile1.getAbsolutePath(): null;
                                        uArrayList4.add(new RelayUserInfo(id, text, uFriend.getFile()));
                                     }
                                     newStickerEl1.g1(uArrayList4);
                                     goto label_0122 ;
                                  }
                               }
                            }
                         }else {
                            patchProxyRe1 = patchProxyRe;
                            uArrayList2 = uArrayList;
                            type1 = type;
                            sticker1 = sticker;
                            i3 = i2;
                            newStickerEl1 = new NewTagStickerElementData(obj5, new Size(-1, -1), false, 4097);
                            uoc3 = c.a;
                            Objects.requireNonNull(uoc3);
                            obj3 = "5";
                            if (!PatchProxy.applyVoidTwoRefs(sticker1, newStickerEl1, uoc3, uoc, obj3)) {
                               TagStickerParam tagStickerPa = sticker1.getTagStickerParam();
                               a.o(tagStickerPa, "sticker.tagStickerParam");
                               external = tagStickerPa.getText();
                               a.o(external, "sticker.tagStickerParam.text");
                               if (!PatchProxy.applyVoidOneRefs(external, newStickerEl1, NewTagStickerElementData.class, obj3)) {
                                  a.p(external, "<set-?>");
                                  newStickerEl1.R = external;
                               }
                            }
                         }
                      }else {
                         patchProxyRe1 = patchProxyRe;
                         uArrayList2 = uArrayList;
                         type1 = type;
                         sticker1 = sticker;
                         i3 = i2;
                         NewVoteStickerDrawerData newVoteStick1 = new NewVoteStickerDrawerData(null, null, null, null, false, false, 0, 127, null);
                         c.a.a(sticker1, newStickerEl1);
                      }
                   }else {
                      patchProxyRe1 = patchProxyRe;
                      uArrayList2 = uArrayList;
                      type1 = type;
                      sticker1 = sticker;
                      i3 = i2;
                      newStickerEl1.N0(4);
                   }
                }
                StickerResult result = sticker1.getResult();
                obj3 = "it.result";
                a.o(result, obj3);
                if (!TextUtils.isEmpty(result.getPreviewImageFile())) {
                   result1 = sticker1.getResult();
                   a.o(result1, obj3);
                   File uFile = DraftFileManager.E().B(result1.getPreviewImageFile(), uoa);
                   if (uFile != null) {
                      external = uFile.getAbsolutePath();
                      if (external != null) {
                         obj5 = external;
                      }
                   }
                }
                uoc3 = c.a;
                result1 = sticker1.getResult();
                a.o(result1, obj3);
                Objects.requireNonNull(uoc3);
                if (PatchProxy.isSupport(uoc)) {
                   Object[] objArray1 = new Object[]{sticker1,result1,newStickerEl1,obj5,Integer.valueOf(i3)};
                   if (PatchProxy.applyVoid(objArray1, uoc3, uoc, str)) {
                      i4 = i3;
                      uArrayList = uArrayList2;
                      patchProxyRe = null;
                   label_044a :
                      uArrayList.add(newStickerEl1);
                      i2 = i4;
                      type = type1;
                      patchProxyRe = patchProxyRe1;
                      iterator1 = iterator2;
                      str2 = str4;
                      objArray = null;
                      i4 = p0;
                   }
                }
                TimeRange range = result1.getRange();
                newStickerEl1.T(0);
                newStickerEl1.Y(result1.getCenterX());
                newStickerEl1.Z(result1.getCenterY());
                newStickerEl1.b0(result1.getScale());
                newStickerEl1.K(result1.getViewScale());
                if (DraftUtils.Q(sticker1.getStickerType())) {
                   newStickerEl1.b0(result1.getViewScale());
                   newStickerEl1.K(0x3f800000);
                }
                newStickerEl1.a0(result1.getRotate());
                a.o(range, "timeRange");
                newStickerEl1.x0(range.getStart());
                newStickerEl1.q0(range.getDuration());
                newStickerEl1.v0(result1.getZIndex());
                FeatureId featureId = sticker1.getFeatureId();
                a.o(featureId, "sticker.featureId");
                external = featureId.getExternal();
                a.o(external, "sticker.featureId.external");
                newStickerEl1.S(external);
                DynamicStickerParam dynamicStick = sticker1.getDynamicStickerParam();
                a.o(dynamicStick, "sticker.dynamicStickerParam");
                if (dynamicStick.getAnimatedSubAssetFileType() == 3) {
                   obj5 = new File(obj5, result1.getOutputImageFile()).getAbsolutePath();
                   a.o(obj5, "File\(previewFilePath, st¡­utImageFile\).absolutePath");
                }
                newStickerEl1.R(obj5);
                newStickerEl1.Q0((float)result1.getResourceWidth());
                newStickerEl1.P0((float)result1.getResourceHeight());
                newStickerEl1.t0(sticker1.getTemplateSticker());
                newStickerEl1.C0(result1.getAssetIdentifierList());
                i4 = i3;
                newStickerEl1.K0(i4);
                newStickerEl1.D0(newStickerEl1.B0());
                uArrayList = uArrayList2;
                goto label_044a ;
             }
          }
          patchProxyRe1 = patchProxyRe;
          obj3 = null;
          obj = uArrayList.iterator();
          while (true) {
             if (obj.hasNext()) {
                obj4 = obj.next();
                i = (obj4.l0() == p1.o())? 1: 0;
                if (i) {
                   obj5 = obj4;
                }
             }else {
                obj5 = null;
             }
             i = (obj5 != null)? 1: 0;
             i1 = (i)? p1.o(): -1;
             a a2 = a.a;
             obj1 = c.a;
             Objects.requireNonNull(obj1);
             if (PatchProxy.isSupport(uoc)) {
                uoa1 = PatchProxy.applyTwoRefs(uArrayList, Integer.valueOf(i1), obj1, uoc, "6");
                if (uoa1 != patchProxyRe1) {
                   obj4 = p0;
                   uoa2 = p1;
                   type = 1;
                label_0515 :
                   uoa1 = a2.a(obj4, uoa2, i1, uoa1);
                   uoc = 0;
                   uoc3 = p0.i();
                   a.m(uoc3);
                   if (uoc3.a1() == Workspace$Type.SINGLE_PICTURE) {
                      uoc3 = p0.i();
                      a.m(uoc3);
                      if (uoc3.T0() == Workspace$Source.REEDIT) {
                      label_053a :
                         uob = b.x(p1, uoa1, uArrayList, uoc, type, 0, 0, 0, 0, 0, 500, 0);
                         break ;
                      }
                   }
                   type = 0;
                   goto label_053a ;
                }
             }
             a.p(uArrayList, "stickerList");
             uArrayList1 = new ArrayList();
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                NewStickerElementData newStickerEl = iterator.next();
                Action$a uoa3 = new Action$a(Action$Type.DECORATION, newStickerEl.l0());
                uoa3.c(newStickerEl.m0());
                uoa3.d(newStickerEl.j0());
                a uoa4 = new a(uoa3.a());
                b = true;
                uoa4.A(b);
                uoa4.z(b);
                i = (i1 == newStickerEl.l0())? true: false;
                uoa4.B(i);
                uoa4.D(f.s);
                uArrayList1.add(uoa4);
             }
             b = 1;
             uoa2 = p1;
             uoa1 = new a(uArrayList1);
             obj4 = p0;
             goto label_0515 ;
          }
       }
       return uob;
    }
    public e v0(b p0,e p1){
       return this.z0(p0, p1);
    }
    public e w0(g p0,e p1){
       return this.A0(p0, p1);
    }
    public void x0(g p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "3")) {
          return;
       }
       a.p(p0, "func");
       a.p(p1, "draftState");
       if (CollectionsKt___CollectionsKt.H1(this.p0(), p0) && p0 instanceof EditorItemFunc) {
          if (this.p0().contains(p0) && p0 != EditorItemFunc.STICKER_V2) {
             this.s0().g(this.s0().b());
             this.s0().c(this.z0(new EditDraftAction(false, 1, null), this.A0(p1, this.s0().b())));
          }else {
             super.x0(p0, p1);
          }
       }
       return;
    }
    public EditorItemFunc y0(){
       return EditorItemFunc.STICKER_V2;
    }
    public b z0(b p0,b p1){
       c a;
       boolean b;
       List list;
       String str5;
       boolean i1;
       int i2;
       List list1;
       SharedPreferences$Editor uEditor;
       Iterator obj4;
       boolean b5;
       boolean b7;
       List list2;
       Map map;
       Map map1;
       int i4;
       a uoa1;
       double d;
       boolean b8;
       Object obj = p0;
       c obj1 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       String obj2 = PatchProxy.applyTwoRefs(obj, obj1, this, d.class, str);
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       obj2 = "action";
       a.p(obj, obj2);
       String str1 = "oldState";
       a.p(obj1, str1);
       a = c.a;
       Objects.requireNonNull(a);
       c uoc = c.class;
       b uob = PatchProxy.applyTwoRefs(obj, obj1, a, uoc, str);
       if (uob != patchProxyRe) {
       }else {
          a.p(obj, obj2);
          a.p(obj1, str1);
          Object[] objArray = new Object[0];
          a.D().w("StickerReducer", "action = "+obj+", attachInfo = "+p1.A(), objArray);
          a uoa = b.a.b(obj, obj1);
          String str2 = "StickerReducer";
          String str3 = ", attachInfo = ";
          String str4 = "action = ";
          c uoc1 = uoc;
          obj1 = a;
          b uob1 = b.x(p1, uoa, null, false, false, null, 0, null, null, 0, 510, 0);
          VideoSDKPlayerView videoSDKPlay = 1;
          if (obj instanceof StickerInitAction) {
             int i = 5;
             if (uob1.v()) {
                if (a.j() - (long)i < 0) {
                label_00b1 :
                   b = true;
                label_00b6 :
                   uob1 = b.x(uob1, a.b(uoa, false, null, null, null, null, 0, null, null, 0, false, false, b, false, null, 0, 0, 0, null, false, 0x7f7ff, null), null, null, null, null, 1, false, obj.getAttachInfo(), false, 350, null);
                }
             }else if(a.i() - (long)i < 0){
                goto label_00b1 ;
             }
             b = false;
             goto label_00b6 ;
          }else if(obj instanceof DecorationTipShowAction){
             long l = 1;
             if (uob1.v()) {
                uEditor = a.a.edit();
                uEditor.putLong("count_of_sticker_video_tip", (a.j() + l));
                g.a(uEditor);
             }else {
                uEditor = a.a.edit();
                uEditor.putLong("count_of_sticker_photo_tip", (a.i() + l));
                g.a(uEditor);
             }
             uob1 = b.x(uob1, a.b(uoa, false, null, null, null, null, 0, null, null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0x7f7ff, null), null, null, null, null, 1, false, null, false, 478, null);
          }else if(obj instanceof DecorationTimelineAttachAction || obj instanceof PhotoMovieDecorationTimelineAttachAction){
             uob1 = b.x(uob1, null, null, false, false, null, false, false, null, false, 447, null);
          }else if(obj instanceof DecorationTimelineDetachAction){
             obj4 = obj;
             if (obj4.isSticker()) {
                if (obj4.isSave()) {
                   h1.m();
                }
                h1.b();
             }
             b5 = false;
             uob1 = b.x(uob1, a.b(uoa, false, null, null, null, null, 0, a.b(uob1.a(), 0, false, null, 6, null), null, 0, b5, false, false, false, null, 0, 0, 0, null, false, 0x7ffbf, null), 0, false, b5, null, true, null, null, false, 414, null);
          }else if(obj instanceof PhotoMovieDecorationTimelineDetachAction){
             obj4 = obj;
             if (obj4.isSticker()) {
                if (obj4.isSave()) {
                   h1.m();
                }
                h1.b();
             }
             b5 = false;
             uob1 = b.x(uob1, a.b(uoa, false, null, null, null, null, 0, a.b(uob1.a(), 0, false, null, 6, null), null, 0, b5, false, false, false, null, 0, 0, 0, null, false, 0x7ffbf, null), 0, false, b5, null, true, null, null, false, 414, null);
          }else if(obj instanceof DecorationSelectAction){
             boolean b6 = (uob1.v() && a.a.getBoolean("enable_sticker_continue_play_tip", videoSDKPlay))? true: false;
             uob1 = b.x(uob1, null, null, false, false, null, false, b6, null, false, 447, null);
          }else if(obj instanceof DecorationUnSelectAction || (obj instanceof DecorationMoveStartAction || obj instanceof DecorationScaleStartAction)){
             uob1 = b.x(uob1, null, null, false, false, null, false, false, null, false, 447, null);
          }else if(obj instanceof StickerScaleAndRotateEndAction){
             b7 = false;
             list = null;
             list2 = null;
             map = null;
             map1 = null;
             i4 = 0;
             uoa1 = uoa.a();
             d = 0;
             b8 = (uoa.o() < 0 && (!uob1.s() && !uob1.B()))? true: false;
             b5 = false;
             uob1 = b.x(uob1, a.b(uoa, b7, list, list2, map, map1, i4, a.b(uoa1, d, b8, UpdateTo.PLAYER, 1, null), null, 0, b5, false, false, false, null, 0, 0, 0, null, false, 0x7ffbf, null), 0, false, b5, null, null, null, null, false, 510, null);
          }else if(obj instanceof AddStickerAction){
             uob1 = b.x(uob1, null, null, false, false, null, false, false, null, false, 411, null);
          }else if(obj instanceof UpdateStickerAttachInfoAction){
             uob1 = b.x(uob1, null, null, false, false, null, false, false, obj.getAttachInfo(), false, 383, null);
          }else if(obj instanceof DecorationMoveEndAction){
             b7 = false;
             list = null;
             list2 = null;
             map = null;
             map1 = null;
             i4 = 0;
             uoa1 = uob1.a();
             d = 0;
             b8 = (uob1.o() < 0 && (!uob1.s() && !uob1.B()))? true: false;
             b5 = false;
             uob1 = b.x(uob1, a.b(uoa, b7, list, list2, map, map1, i4, a.b(uoa1, d, b8, UpdateTo.PLAYER, 1, null), null, 0, b5, false, false, false, null, 0, 0, 0, null, false, 0x7ffbf, null), 0, false, b5, null, null, null, null, false, 510, null);
          }else if(obj instanceof DeleteStickerAction){
             obj4 = 0;
             c uoc2 = null;
             String str6 = null;
             String str7 = null;
             b7 = false;
             list = null;
             list2 = null;
             map = null;
             map1 = null;
             i4 = (obj.getLayerIndex() == p1.o())? -1: p1.o();
             uoa1 = p1.a();
             d = 0;
             b8 = (!uob1.s() && !uob1.B())? true: false;
             uob1 = b.x(uob1, a.b(uoa, b7, list, list2, map, map1, i4, a.b(uoa1, d, b8, UpdateTo.PLAYER, 1, null), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0x7fb9f, null), uoc2, str6, str7, a.a(uob1.y(), false, false, false, 0, null, 0, null, null, 254, null), null, obj4, null, 0, 430, null);
          }else if(obj instanceof StickerLibraryShowAction){
             uob1 = b.x(uob1, null, null, true, false, null, false, false, null, false, 507, null);
          }else if(obj instanceof StickerLibraryCloseAction){
             uob1 = b.x(uob1, null, null, false, false, null, false, false, null, false, 507, null);
          }else if(obj instanceof UpdateSelectedLayerAction){
             obj4 = uob1.r().b().iterator();
             while (obj4.hasNext()) {
                a uoa2 = obj4.next();
                i1 = (uoa2.e() == obj.getLayerIndex())? true: false;
                uoa2.B(i1);
             }
             uob1 = b.x(uob1, a.b(uoa, false, null, null, null, null, obj.getLayerIndex(), a.b(p1.a(), 0, false, UpdateTo.PLAYER, 1, null), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0x7ff9f, null), null, null, null, null, false, 0, null, false, 446, null);
          }else if(obj instanceof KeyboardPanelFoldButtonClickedAction){
             uob1 = b.x(uob1, null, null, false, false, a.a(uob1.y(), false, false, false, 0, null, obj.isPanelOpen(), null, null, 223, null), 0, null, null, null, 495, null);
          }else if(obj instanceof TextEditStartAction){
             Object obj5 = obj;
             a uoa3 = new a(true, false, false, obj5.getKeyboardOffset(), obj5.getOriginText(), false, null, null, 230, null);
             uob1 = b.x(uob1, a.b(uoa, false, null, null, null, null, 0, a.b(uoa.a(), 0, false, UpdateTo.BOTH, 1, null), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0x7ffbf, null), null, null, null, uob, null, false, null, false, 430, null);
          }else if(obj instanceof TextEditEndAction){
             uob1 = b.x(uob1, null, null, false, false, new a(false, false, false, 0, null, false, null, null, 255, null), null, null, null, null, 495, null);
          }else if(obj instanceof PicTemplateStartAction){
             uob1 = b.x(uob1, null, null, false, false, null, false, false, null, true, 255, null);
          }else if(obj instanceof SaveTemplateStickerAction || obj instanceof DiscardTemplateStickerAction){
             uob1 = b.x(uob1, null, null, false, false, null, false, false, null, false, 255, null);
          }
          if (obj instanceof EditDraftAction) {
             a obj3 = PatchProxy.applyOneRefs(uob1, obj1, uoc1, "2");
             if (obj3 != patchProxyRe) {
                list = obj3;
                str5 = str2;
                i1 = 0;
             }else {
                i1 = 0;
                Object[] objArray1 = new Object[i1];
                str5 = str2;
                a.D().s(str5, "updateElementList: stickerAttachInfo = "+uob1.A(), objArray1);
                obj3 = uob1.A();
                if (obj3 != null) {
                   Iterator iterator = uob1.i().iterator();
                   while (iterator.hasNext()) {
                      NewStickerElementData newStickerEl = iterator.next();
                      if (!obj3.e()) {
                         i2 = (CollectionsKt___CollectionsKt.V2(a.a(), "", null, null, 0, null, null, 62, null)).hashCode();
                      }else if(!q.f(newStickerEl.A0())){
                         list = newStickerEl.A0();
                         a.m(list);
                         i2 = (CollectionsKt___CollectionsKt.V2(list, "", null, null, 0, null, null, 62, null)).hashCode();
                      }
                      c a1 = c.a;
                      Size size = c.d(newStickerEl, a1.b(newStickerEl.E0(), newStickerEl.F0()), (float)obj3.c());
                      newStickerEl.P((float)size.b);
                      newStickerEl.M((float)size.c);
                      boolean b1 = newStickerEl.I0();
                      boolean b2 = newStickerEl.J0();
                      boolean b3 = uob1.s();
                      boolean b4 = uob1.y().f();
                      Objects.requireNonNull(NewStickerElementData.P);
                      int i3 = 17;
                      if (obj3.e()) {
                         if (b1 || b2) {
                            if (b4) {
                            label_07e6 :
                               i3 = 1;
                            }else {
                            label_07e3 :
                               i3 = 4097;
                            }
                         }
                      }else if(b1 || b2){
                         if (b3 || b4) {
                            goto label_07e6 ;
                         }else {
                            goto label_07e3 ;
                         }
                      }else if(b3 || b4){
                         i3 = 4113;
                      }
                      newStickerEl.M0(i3);
                      Integer integer = null;
                      if (!newStickerEl.H0() - integer || !newStickerEl.G0() - integer) {
                         if (newStickerEl.J0()) {
                            newStickerEl.Q0(newStickerEl.i());
                            newStickerEl.P0(newStickerEl.f());
                         }
                      }
                      Float uFloat = obj3.b().get(Integer.valueOf(i2));
                      if (obj3.e() && uFloat != null) {
                         newStickerEl.o0(uFloat.floatValue());
                      }
                      float f = 0x3f800000;
                      if (newStickerEl.E0() == 6 || newStickerEl.E0() == 3) {
                         f = newStickerEl.A();
                      }else {
                         Size size1 = obj3.a().get(Integer.valueOf(i2));
                         if (size1 != null && uFloat != null) {
                            float f1 = newStickerEl.A();
                            float f2 = newStickerEl.i();
                            float f3 = uFloat.floatValue();
                            size1 = size1.b;
                            float f4 = (float)obj3.c();
                            float f5 = newStickerEl.H0() * f;
                            if (obj3.e()) {
                               f5 = f5 / f2;
                               f1 = f1 * f5;
                               f1 = f1 / f3;
                            }else {
                               f5 = f5 / (float)size1;
                               f5 = f5 * f;
                               f1 = f1 * f5;
                               f1 = f1 * f4;
                               f1 = f1 / f2;
                            }
                            f = f1;
                         }
                      }
                      if (f - (float)i1 > 0 && !Float.isNaN(f)) {
                         newStickerEl.b0(f);
                      }
                      if (newStickerEl instanceof NewOriginFileRenderViewData && obj3.d() != null) {
                         newStickerEl.T0(a1.c(obj3.d(), newStickerEl.l0()));
                      }
                      videoSDKPlay = 1;
                   }
                   list1 = uob1.i();
                }else {
                   list1 = uob1.i();
                }
                list = list1;
             }
             uob1 = b.x(uob1, null, list, false, false, null, false, false, null, false, 509, null);
          }else {
             str5 = str2;
             i1 = 0;
          }
          uob = uob1;
          objArray = new Object[i1];
          a.D().w(str5, str4+obj+str3+uob.A(), objArray);
       }
       return uob;
    }
}
