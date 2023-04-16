package bmd.f;
import uxb.q;
import java.lang.Object;
import itc.a3;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.sticker.h1;
import android.util.Pair;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.feature.sticker.IStickerDetailInfo;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Double;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.app.Activity;
import android.view.View;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.record.interactive.RecordVoteStickerData;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawerData;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import nsd.u;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import com.yxcorp.gifshow.record.interactive.RecordStickerBaseData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawerData$a;
import java.util.ArrayList;
import com.yxcrop.gifshow.v3.editor.sticker_v2.record.RecordVoteStickerDrawer;
import bmd.f$a;
import umd.b;
import com.yxcorp.gifshow.v3.editor.j;
import bmd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.graphics.Bitmap;
import lnc.a1;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteTextView;
import android.widget.TextView$BufferType;
import java.lang.Number;
import android.text.TextPaint;
import android.graphics.Paint$Align;
import bvc.c;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import android.widget.EditText;
import android.view.View$MeasureSpec;
import zv9.a;
import eba.a;
import androidx.fragment.app.Fragment;
import lmd.c;
import itc.a0;
import java.lang.NullPointerException;
import android.text.Layout;
import com.yxcorp.gifshow.record.interactive.RecordInteractiveStickerData;
import xvc.f;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kuaishou.edit.draft.Asset;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import cmd.b;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.AddStickerAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.relay.RelayStickerTitleUpdateAction;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.relay.RelayStickerInvitedFriendsUpdateAction;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.StickerScaleAndRotateEndAction;
import com.kuaishou.edit.draft.Sticker;
import com.kuaishou.edit.draft.Sticker$Type;
import kotlin.Pair;
import com.kuaishou.edit.draft.RelayStickerParam;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.RelayStickerParam$b;
import com.yxcorp.gifshow.record.interactive.RelayUserInfo;
import com.kuaishou.edit.draft.Friend$b;
import com.kuaishou.edit.draft.Friend;
import com.kuaishou.edit.draft.Sticker$b;
import com.yxcorp.gifshow.postwork.PostStatus;
import r26.a;
import brd.t;
import bmd.f$b;
import io.reactivex.g;
import bmd.f$c;
import t45.d;
import brd.z;

public class f implements q	// class@000286
{
    public final a3 b;

    public void f(){
       super();
       this.b = new a3();
    }
    public void AD(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "6")) {
          return;
       }
       h1.n(p0);
       return;
    }
    public Pair C0(String p0,int p1,float p2){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), this, f.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "text");
       Pair pair = this.b.C0(p0, p1, p2);
       a.o(pair, "stickerPluginImplDelegat¡­ap\(text, maxWidth, scale\)");
       return pair;
    }
    public void Dg(IStickerDetailInfo p0,List p1,c p2,double p3){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Double.valueOf(p3), this, f.class, "12")) {
          return;
       }
       a.p(p0, "stickerDetailInfo");
       a.p(p1, "assetIds");
       a.p(p2, "workspaceDraft");
       this.b.Dg(p0, p1, p2, p3);
       return;
    }
    public boolean FQ(IStickerDetailInfo p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "stickerDetailInfo");
       a.p(p1, "workspaceDraft");
       boolean b = false;
       if (p0 instanceof StickerDetailInfo && (TextUtils.x(p0.mStickerId) || (p1.T0() != Workspace$Source.REEDIT && (!p0.isVoteSticker() || !f.B(p1.a1()))))) {
          b = true;
       }
    label_0047 :
       return b;
    }
    public EditDecorationBaseDrawer I60(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "beClonedDrawer");
       return p0;
    }
    public void IO(boolean p0,BaseFragment p1){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, f.class, "10")) {
          return;
       }
       a.p(p1, "fragment");
       return;
    }
    public void TN(Activity p0,EditDecorationBaseDrawer p1,View p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "15")) {
          return;
       }
       a.p(p1, "voteDrawer");
       a.p(p2, "previewView");
       if (!p1 instanceof NewVoteStickerDrawer) {
          return;
       }
       p1.update();
       return;
    }
    public EditDecorationBaseDrawer Uz(RecordVoteStickerData p0,Activity p1,View p2,List p3){
       Object[] this;
       Object obj3;
       Object obj = p0;
       Object obj1 = p3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       NewVoteStickerDrawerData obj2 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, f.class, "14");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       a.p(obj, "data");
       a.p(p2, "mRootView");
       a.p(obj1, "mVoteStickerListeners");
       obj2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, f.class, "16");
       if (obj2 != patchProxyRe) {
       }else {
          int i = 0;
          this = new Object[i];
          a.D().w("StickerV2PinsPluginImpl", "convertToVoteDrawerData: data = "+obj, this);
          boolean b = PostExperimentUtils.w();
          NewVoteStickerDrawerData newVoteStick = new NewVoteStickerDrawerData(null, null, null, null, false, false, 0, 127, null);
          int this1 = 3;
          v1.K0(this1);
          v1.Y(p0.getCenterX());
          v1.Z(p0.getCenterY());
          v1.P((float)NewVoteStickerDrawer.VOTE_STICKER_LAYOUT_ORIGIN_WIDTH);
          v1.M((float)NewVoteStickerDrawer.VOTE_STICKER_LAYOUT_ORIGIN_HEIGHT);
          int i1 = 4096;
          int i2 = (b)? 4097: 4096;
          v1.M0(i2);
          v1.a1(true);
          v1.u0(true);
          if (!b) {
             v1.b(256);
          }
          v1.b(i1);
          v1.v0(0x4e20);
          v1.N0(this1);
          NewVoteStickerDrawerData$a y = NewVoteStickerDrawerData.Y;
          v1.N(y.a());
          v1.O(y.a());
          v1.b1(p0.getQuestion());
          if (p0.getOptionList().size() > 0) {
             obj3 = p0.getOptionList().get(i);
             a.o(obj3, "data.optionList[0]");
             v1.Y0(obj3);
          }
          if (p0.getOptionList().size() > 1) {
             obj3 = p0.getOptionList().get(true);
             a.o(obj3, "data.optionList[1]");
             v1.Z0(obj3);
          }
          obj2 = v1;
       }
       return new RecordVoteStickerDrawer(obj2, new f$a(obj1), ((float)p2.getWidth() / (float)p2.getHeight()));
    }
    public boolean WC(j p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "revertableEditor");
       return p0 instanceof b;
    }
    public void fH(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f.class, "9")) {
          return;
       }
       a.p(p0, "parent");
       PatchProxy.onMethodExit(f.class, "9");
       return;
    }
    public Bitmap h00(String p0,String p1,String p2,float p3){
       Bitmap obj4;
       boolean i1;
       Object obj6;
       Object obj7;
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       Object obj3 = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj4 = PatchProxy.applyFourRefs(p0, p1, p2, Float.valueOf(p3), this, f.class, "5");
          if (obj4 != patchProxyRe) {
             return obj4;
          }
       }
       a.p(obj1, "text");
       a.p(obj2, "optionOne");
       a.p(obj3, "optionTwo");
       if (PatchProxy.isSupport(uof)) {
          obj4 = PatchProxy.applyFourRefs(p0, p1, p2, Float.valueOf(p3), this, f.class, "19");
          if (obj4 != patchProxyRe) {
          label_0150 :
             return obj4;
          }
       }
       int i = a1.d(R.dimen.arg_RES_7f070c17);
       View view = a.c(LayoutInflater.from(a1.c()), R.layout.arg_RES_7f0d07a4, null, false);
       VoteTextView voteTextView = view.findViewById(R.id.question_text);
       voteTextView.setText(obj1, TextView$BufferType.EDITABLE);
       VoteTextView obj5 = PatchProxy.applyOneRefs(obj1, obj, uof, "20");
       if (obj5 != patchProxyRe) {
          i1 = obj5.intValue();
          obj6 = obj3;
          obj7 = obj2;
       }else {
          TextPaint textPaint = new TextPaint();
          i1 = true;
          textPaint.setAntiAlias(i1);
          textPaint.setColor(a1.a(R.color.arg_RES_7f061fd5));
          textPaint.setTextSize((float)a1.d(R.dimen.arg_RES_7f070d5e));
          textPaint.setTextAlign(c.b(i1));
          obj6 = obj3;
          obj7 = obj2;
          StaticLayout staticLayout = new StaticLayout(p0, textPaint, a1.d(0x7f070c15), Layout$Alignment.ALIGN_CENTER, 0x3f800000, null, 0);
          i1 = (v5.getLineCount() > i1)? a1.d(R.dimen.arg_RES_7f070d5c): a1.d(R.dimen.arg_RES_7f070d5d);
       }
       voteTextView.a(i1);
       ViewGroup viewGroup = view.findViewById(R.id.options_layout);
       obj5 = viewGroup.findViewById(R.id.options_left);
       voteTextView = viewGroup.findViewById(R.id.options_right);
       obj5.setText(obj7);
       voteTextView.setText(obj6);
       a.o(obj5, "optionLeft");
       obj5.b(obj.n(obj5, obj7));
       a.o(voteTextView, "optionRight");
       voteTextView.b(obj.n(voteTextView, obj6));
       view.measure(View$MeasureSpec.makeMeasureSpec(i, 0x40000000), View$MeasureSpec.makeMeasureSpec(0x3fffffff, Integer.MIN_VALUE));
       a.o(view, "view");
       view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
       obj4 = a.b(view, p3, 0);
       a.o(obj4, "DecorationUtil.convertVi¡­itmap\(view, scale, false\)");
       goto label_0150 ;
    }
    public void iY(boolean p0,a p1,String p2,List p3,boolean p4,boolean p5){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),p1,p2,p3,Boolean.valueOf(p4),Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uof, "11")) {
             return;
          }
       }
       a.p(p1, "stickerDraft");
       a.p(p2, "text");
       a.p(p3, "assetIds");
       this.b.iY(p0, p1, p2, p3, p4, p5);
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public PresenterV2 kO(Fragment p0,int p1,ViewGroup p2,boolean p3){
       PresenterV2 obj;
       c uoc;
       if (PatchProxy.isSupport2(f.class, "17")) {
          obj = PatchProxy.applyFourRefsWithListener(p0, Integer.valueOf(p1), p2, Boolean.valueOf(p3), this, f.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "fragment");
       a.p(p2, "viewGroup");
       obj = null;
       if (p1 != 1) {
          if (p1 == 3) {
             uoc = new c();
             uoc.R8(p0, p2, p3);
          }
       }else {
          uoc = new a0();
          uoc.R8(p0, p2, p3);
       }
       if (obj != null) {
          PatchProxy.onMethodExit(f.class, "17");
          return obj;
       }else {
          PatchProxy.onMethodExit(f.class, "17");
          throw new NullPointerException("initRecordStickerPresenter stickerType="+p1);
       }
    }
    public void kX(){
       if (PatchProxy.applyVoid(null, this, f.class, "7")) {
          return;
       }
       h1.a();
       return;
    }
    public final int n(VoteTextView p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       StaticLayout staticLayout = new StaticLayout(p1, p0.getPaint(), ((p0.getMaxWidth() - p0.getCompoundPaddingLeft()) - p0.getCompoundPaddingRight()), Layout$Alignment.ALIGN_CENTER, 0x3f800000, 0, false);
       int i = (obj.getLineCount() > 1)? a1.d(R.dimen.arg_RES_7f070c11): a1.d(R.dimen.arg_RES_7f070c13);
       return i;
    }
    public void n4(c p0,RecordInteractiveStickerData p1){
       ArrayList uArrayList;
       double d;
       Pair pair;
       String obj = p0;
       a obj1 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, this, f.class, "18")) {
          return;
       }
       a.p(obj, "workspaceDraft");
       a.p(obj1, "interactiveStickerData");
       c uoc = new c();
       if (!PatchProxy.applyVoidTwoRefs(obj, obj1, uoc, c.class, "1")) {
          a.p(obj, "draft");
          a.p(obj1, "data");
          uoc.A = obj;
          uoc.z.k(obj);
          a uoa = p0.o0();
          if (uoa != null) {
             List list = uoa.z();
             if (list != null) {
                uArrayList = new ArrayList(u.Y(list, 10));
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   Asset uAsset = iterator.next();
                   a.o(uAsset, "it");
                   uArrayList.add(uAsset.getIdentifier());
                }
                ArrayList uArrayList1 = uArrayList;
                boolean b = DraftUtils.V(p0);
                if (!b) {
                   d = 0;
                   if (!p1.getDuration() - d) {
                      if (p0.a1() == Workspace$Type.PHOTO_MOVIE) {
                         uoa = p0.o0();
                         if (uoa != null) {
                            d = (double)uoa.p();
                         }
                         obj1.setDuration((d * 2.00f));
                      }else {
                         uoa = p0.o0();
                         if (uoa != null) {
                            list = uoa.z();
                            if (list != null) {
                               iterator = list.iterator();
                               while (iterator.hasNext()) {
                                  Asset uAsset1 = iterator.next();
                                  a.o(uAsset1, "it");
                                  d = p1.getDuration() + uAsset1.getDuration();
                                  obj1.setDuration(d);
                               }
                            }
                         }
                      }
                   }
                }
                b uob = new b(b, false, null, p1.getContainerWidth(), 0, 0, uArrayList1, 0, p1.getCenterX(), p1.getCenterY(), 182, null);
                StickerDetailInfo relaySticker = StickerDetailInfo.getRelayStickerDetailInfo();
                a.o(relaySticker, "StickerDetailInfo\n      ¡­tRelayStickerDetailInfo\(\)");
                AddStickerAction uAddStickerA = new AddStickerAction(0, p1.getDuration(), relaySticker, v23, false);
                uoc.C.t0(d);
                uoc.C.t0(new RelayStickerTitleUpdateAction(p1.getTitle(), false));
                uoc.C.t0(new RelayStickerInvitedFriendsUpdateAction(p1.getUserInfoList(), true, true, false));
                StickerScaleAndRotateEndAction stickerScale = new StickerScaleAndRotateEndAction(0x4e20, p1.getScale(), 0x3f800000, null, true);
                uoc.C.t0(d);
                iterator = ((p1.getFromPhotoId()).length() > 0)? 1: 0;
                if (iterator) {
                   String fromPhotoId = p1.getFromPhotoId();
                   ArrayList fromPhotoUse = p1.getFromPhotoUserInfoList();
                   if (!PatchProxy.applyVoidThreeRefs(p0, fromPhotoId, fromPhotoUse, uoc, c.class, "2")) {
                      obj1 = p0.U0();
                      if (obj1 != null) {
                         if (!obj1.D()) {
                            obj1.c0();
                         }
                         list = obj1.z();
                         a.o(list, "messages");
                         iterator = list.iterator();
                         int i = 0;
                         while (true) {
                            if (iterator.hasNext()) {
                               Iterator obj2 = iterator.next();
                               RelayUserInfo obj3 = obj2;
                               a.o(obj3, "it");
                               boolean b1 = (obj3.getStickerType() == Sticker$Type.RELAY_STICKER)? true: false;
                               if (b1) {
                                  pair = new Pair(Integer.valueOf(i), obj2);
                               label_01b0 :
                                  if (pair != null) {
                                     RelayStickerParam$b second = pair.getSecond();
                                     a.o(second, "stickerPair.second");
                                     second = second.getRelayStickerParam().toBuilder();
                                     a.o(second, "paramBuilder");
                                     second.copyOnWrite();
                                     second.instance.setFromPhotoid(fromPhotoId);
                                     obj2 = fromPhotoUse.iterator();
                                     while (obj2.hasNext()) {
                                        obj3 = obj2.next();
                                        Friend$b uob1 = Friend.newBuilder();
                                        uob1.b(obj3.getId());
                                        obj = obj3.getProfileUrl();
                                        if (obj != null) {
                                           uob1.a(obj);
                                        }
                                        String profileLocal = obj3.getProfileLocalPath();
                                        if (profileLocal != null) {
                                           uob1.a(obj1.Q(profileLocal));
                                        }
                                        second.copyOnWrite();
                                        second.instance.addFromPhotoFriends(uob1);
                                     }
                                     obj1.n(pair.getFirst().intValue()).g(second);
                                  }
                                  obj1.g(true);
                                  break ;
                               }else {
                                  i = i + 1;
                               }
                            }else {
                               pair = null;
                               goto label_01b0 ;
                            }
                         }
                      }
                   }
                }
             }
          }
          uArrayList = CollectionsKt__CollectionsKt.E();
          goto label_0075 ;
       }
       return;
    }
    public void w(PostStatus p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "13")) {
          return;
       }
       a.p(p0, "status");
       a.p(p1, "iPostWorkInfo");
       this.b.w(p0, p1);
       return;
    }
    public t ws(BaseFragment p0,boolean p1){
       t ot;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uof, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "fragment");
       if (PostExperimentUtils.m()) {
          ot = t.create(new f$b(p0, p1));
          a.o(ot, "Observable.create<Unit> ¡­nimatedSubAsset\)\)\n      }");
          return ot;
       }else {
          ot = t.create(new f$c(p0, p1)).subscribeOn(d.a);
          a.o(ot, "Observable.create<Unit> ¡­beOn\(KwaiSchedulers.MAIN\)");
          return ot;
       }
    }
}
