package com.yxcorp.gifshow.activity.share.presenter.n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import java.util.regex.Pattern;
import lnc.a1;
import com.yxcorp.gifshow.activity.share.presenter.n$a;
import java.util.HashMap;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.activity.share.presenter.n$d;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Number;
import com.yxcorp.utility.TextUtils;
import java.util.regex.Matcher;
import ow8.c;
import xw8.p0;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import gr8.c;
import brd.x;
import zw8.p;
import com.yxcorp.gifshow.activity.share.presenter.m;
import erd.g;
import crd.b;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.model.CDNUrl;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.activity.share.presenter.n$b;
import android.view.View$OnFocusChangeListener;
import android.widget.EditText;
import com.yxcorp.gifshow.activity.share.presenter.n$c;
import android.text.TextWatcher;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.BoolArg;
import java.lang.Boolean;
import com.kuaishou.android.post.PostPageArg;
import android.view.View;
import java.lang.Runnable;
import android.util.Pair;
import com.yxcorp.gifshow.model.SelectUsersBundle;
import tkd.b;
import tkd.d;
import wu5.a;
import zw8.o;
import android.app.Activity;
import n3d.a;
import vw8.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.util.List;
import com.kwai.feature.post.api.feature.publish.model.PublishPageSetting;
import java.lang.Math;
import com.yxcorp.gifshow.model.ContactTargetItem;
import java.lang.IndexOutOfBoundsException;
import java.lang.Throwable;
import com.yxcorp.utility.n;
import im8.f;
import java.util.Objects;
import com.yxcorp.gifshow.activity.share.at.PublishAtFriendFragment;
import com.yxcorp.gifshow.activity.share.at.PublishAtFriendSearchFragment;
import com.yxcorp.gifshow.activity.share.at.PublishAtFriendDefaultFragment;
import lw8.a;
import kotlin.jvm.internal.a;
import lw8.b;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Publish$b;
import java.util.Collection;
import java.util.Iterator;
import com.kuaishou.edit.draft.AtFriend$b;
import com.kuaishou.edit.draft.AtFriend;
import com.kuaishou.edit.draft.Publish;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiEditText;
import zw8.n;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.activity.GifshowActivity;
import bba.b;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;

public class n extends PresenterV2	// class@001419
{
    public boolean A;
    public boolean B;
    public final Runnable C;
    public HashMap D;
    public final HashMap E;
    public boolean F;
    public PublishAtFriendFragment G;
    public int H;
    public int I;
    public boolean J;
    public final boolean K;
    public final b L;
    public final int p;
    public EmojiEditText q;
    public EmojiEditText r;
    public View s;
    public GifshowActivity t;
    public b u;
    public c v;
    public p0 w;
    public PublishPageSetting x;
    public String y;
    public f z;
    public static final Pattern M;

    static {
       n.M = Pattern.compile("[@＠][^ @＠#\n]*");
    }
    public void n(){
       super();
       this.p = a1.e(150.00f);
       this.A = false;
       this.B = false;
       this.C = new n$a(this);
       this.E = new HashMap();
       this.F = false;
       this.H = -1;
       this.I = -1;
       this.J = false;
       this.K = PostExperimentUtils.A1();
       this.L = new n$d(this);
    }
    public static int S8(CharSequence p0,int p1){
       Matcher obj1;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, on, "9");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       if (PatchProxy.isSupport(on)) {
          obj1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, on, "10");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }else if(!TextUtils.x(p0) && (p1 > p0.length() || p1 <= 0)){
             i = p1;
             while (true) {
                if (i > 0) {
                   int i1 = i - 1;
                   CharSequence uCharSequenc = p0.subSequence(i1, i);
                   if (TextUtils.n("@", uCharSequenc) || TextUtils.n("＠", uCharSequenc)) {
                      i = i1;
                      break ;
                   }else {
                      i = i1;
                   }
                }
             }
          }
          i = -1;
       }else {
          goto label_0038 ;
       }
       if (i != -1) {
          obj1 = n.M.matcher(p0);
          if (!obj1.find(i) || (obj1.start() == i && obj1.end() >= p1)) {
             if (c.a.matcher(p0.subSequence(i, p1)).find(0)) {
                return -1;
             }else {
                return i;
             }
          }
       }
       return -1;
    }
    public void E8(){
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "3")) {
          return;
       }
       if (this.K != null && !PatchProxy.applyVoid(objArray, this, on, "4")) {
          this.X7(this.w.b.compose(c.c(this.t.m(), ActivityEvent.DESTROY)).subscribe(new p(this), m.b));
       }
       on = this.D;
       if (on == null || on.isEmpty()) {
          Editable text = this.q.getText();
          n tD = this.D;
          if (!PatchProxy.applyVoidTwoRefs(text, tD, objArray, c.class, "17") && !TextUtils.x(text)) {
             Matcher matcher = c.a.matcher(text);
             while (matcher.find()) {
                User user = new User(matcher.group(2), matcher.group(1), null, null, null);
                objArray.setFriend(1);
                tD.put(matcher.group(2), objArray);
                Object[] objArray1 = new Object[0];
                a.b().s("SharePageUtils", "getAtFriendsFromText: add one "+matcher.group(), objArray1);
             }
          }
       }
       on = this.r;
       if (on != null) {
          on.setOnFocusChangeListener(new n$b(this));
       }
       this.q.addTextChangedListener(new n$c(this));
       if (i.g().getDisableShareCaptionEdit().get(Boolean.FALSE).booleanValue()) {
          View view = this.k8(R.id.at_button);
          if (view != null) {
             view.setVisibility(8);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, n.class, "11")) {
          return;
       }
       this.m8().removeCallbacks(this.C);
       return;
    }
    public void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "15")) {
          return;
       }
       if (this.K != null) {
          Editable text = this.q.getText();
          int selectionSta = this.q.getSelectionStart();
          int selectionEnd = this.q.getSelectionEnd();
          if (text != null && (selectionSta >= 0 && (selectionEnd >= 0 && selectionSta <= selectionEnd))) {
             if (selectionSta && text.charAt((selectionSta - 1)) != ' ') {
                text.replace(selectionSta, selectionEnd, " @");
             }else {
                text.replace(selectionSta, selectionEnd, "@");
             }
             return;
          }
       }
    label_0042 :
       n tw = this.w;
       if (tw == null) {
          objArray = new Object[0];
          a.b().t("ShareAtFriendsPresenter", "atFriends: publish page nolonger exist, mSharePagePresenterModel is null.", objArray);
          return;
       }else {
          Pair pair = this.R8();
          d.a(0x6de3c81e).qE(this.t, new SelectUsersBundle().setBizId(2001).setSingleFollowLimitNum(pair.first.intValue()).setSingleFollowLimitToast(pair.second.intValue()).setNeedUseCache(this.B), new o(this, tw.i()));
          this.t.overridePendingTransition(R.anim.arg_RES_7f010105, 0x7f0100f1);
          if (!PatchProxy.applyVoid(objArray, objArray, a.class, "39")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action = 1023;
             uElementPack.name = "click_at_friend";
             u1.u(1, uElementPack, new ClientContent$ContentPackage());
          }
          return;
       }
    }
    public final Pair R8(){
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n on = n.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, on, "19");
       if (obj != patchProxyRe) {
          return obj;
       }
       int i = (this.q.getText() != null)? c.h(c.d(this.q.getText().toString(), this.D)): 0;
       Object[] objArray1 = new Object[0];
       a.b().s("ShareAtFriendsPresenter", "getAtLimitInfo: atNotMutuallyFriends ="+i, objArray1);
       Object[] obj1 = PatchProxy.apply(objArray, this, on, "14");
       if (obj1 != patchProxyRe) {
          i1 = obj1.intValue();
       }else if(this.x.mMaxAtFriendsNum > null){
          objArray = new Object[0];
          a.b().w("ShareAtFriendsPresenter", "getMaxAtFriendsNum: using switch config max="+this.x.mMaxAtFriendsNum, objArray);
          i1 = this.x.mMaxAtFriendsNum;
       }else {
          obj1 = new Object[0];
          a.b().w("ShareAtFriendsPresenter", "getMaxAtFriendsNum: using default=3", obj1);
          i1 = 3;
       }
       i1 = Math.max((i1 - i), 0);
       int i2 = (("FEED_PAGE").equals(this.y))? 0x7f1007a4: 0x7f103ddf;
       return new Pair(Integer.valueOf(i1), Integer.valueOf(i2));
    }
    public void V8(int p0,ContactTargetItem p1){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, on, "17")) {
          return;
       }
       Editable text = this.q.getText();
       if (text == null) {
          return;
       }
       Matcher matcher = c.a.matcher(text);
       while (true) {
          if (matcher.find()) {
             if (TextUtils.n(matcher.group(2), p1.mId)) {
                int i = matcher.start();
                int i1 = matcher.end();
                int i2 = 1;
                i1 = (i1 < text.length() && text.charAt(i1) == ' ')? (i1 - i) + i2: i1 - i;
                this.F = i2;
                if (i1 < 0 || i < 0) {
                   a.b().e("ShareAtFriendsPresenter", "removeSelectUser: ", new IndexOutOfBoundsException("text="+text+"\n matcherStart= "+i+",deleteLength= "+i1));
                   return;
                }else {
                   text.replace(i, (i + i1), "");
                   this.F = false;
                   n tH = this.H;
                   if (matcher.end() <= tH) {
                      this.H = tH - i1;
                      this.I = this.I - i1;
                      break ;
                   }
                   break ;
                }
             }
          }else {
             this.D.remove(p1.mId);
             this.a9();
             this.Z8(this.q.getText(), this.q.getSelectionStart(), 0, 0, true);
             return;
          }
       }
       this.V8(p0, p1);
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, n.class, "21")) {
          return;
       }
       int i = 1;
       int i1 = ((n.j(this.t) - this.z.get().intValue()) - n.p(this.s)[i]) - this.s.getHeight();
       if (this.G != null) {
          Object[] objArray = new Object[0];
          a.b().w("ShareAtFriendsPresenter", "setHasEnoughSpace gapHeight="+i1, objArray);
          n tG = this.G;
          if (i1 < this.p) {
             i = false;
          }
          Objects.requireNonNull(tG);
          if (!PatchProxy.isSupport(PublishAtFriendFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(i), tG, PublishAtFriendFragment.class, "13")) {
             tG.u.J = i;
          }
       }
       return;
    }
    public void X8(int p0){
       n on = n.class;
       String str = "6";
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, on, str)) {
          return;
       }
       this.W8();
       if (this.F != null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().w("ShareAtFriendsPresenter", "startAtFriend", objArray);
       this.H = p0;
       this.w.p(3);
       boolean b = true;
       this.J = b;
       on = this.G;
       if (on == null || on.s != null) {
          PublishAtFriendFragment publishAtFri = new PublishAtFriendFragment();
          this.G = publishAtFri;
          Objects.requireNonNull(publishAtFri);
          String str1 = "8";
          if (!PatchProxy.isSupport(PublishAtFriendFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, publishAtFri, PublishAtFriendFragment.class, str1)) {
             PublishAtFriendFragment t1 = publishAtFri.t;
             Objects.requireNonNull(t1);
             if (!PatchProxy.isSupport(PublishAtFriendDefaultFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, t1, PublishAtFriendDefaultFragment.class, str)) {
                t1.F.v1(b);
             }
             publishAtFri = publishAtFri.u;
             Objects.requireNonNull(publishAtFri);
             if (!PatchProxy.isSupport(PublishAtFriendSearchFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, publishAtFri, PublishAtFriendSearchFragment.class, str1)) {
                publishAtFri.K.v1(b);
             }
          }
          n tG = this.G;
          on = this.L;
          Objects.requireNonNull(tG);
          if (!PatchProxy.applyVoidOneRefs(on, tG, PublishAtFriendFragment.class, str)) {
             a.p(on, "callback");
             PublishAtFriendFragment t = tG.t;
             Objects.requireNonNull(t);
             if (!PatchProxy.applyVoidOneRefs(on, t, PublishAtFriendDefaultFragment.class, "5")) {
                a.p(on, "callback");
                t.F.t1(on);
             }
             PublishAtFriendFragment u = tG.u;
             Objects.requireNonNull(u);
             if (!PatchProxy.applyVoidOneRefs(on, u, PublishAtFriendSearchFragment.class, "7")) {
                a.p(on, "callback");
                u.K.t1(on);
             }
          }
       }
    label_00dc :
       this.w.o(this.G);
       return;
    }
    public final void Y8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "7")) {
          return;
       }
       if (this.F != null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().w("ShareAtFriendsPresenter", "stopAtFriend: "+p0, objArray);
       if (this.w.b() != 3) {
          return;
       }
       this.I = -1;
       this.H = -1;
       this.w.p(1);
       this.w.g();
       return;
    }
    public void Z8(CharSequence p0,int p1,int p2,int p3,boolean p4){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, on, "8")) {
             return;
          }
       }
       if (this.F != null) {
          return;
       }else {
          p1 = p1 + p3;
          if (this.w.b() != 3 || p4) {
             p2 = n.S8(p0, p1);
             if (p2 != -1) {
                this.X8(p2);
             }else {
             label_00cc :
                return;
             }
          }
          Object[] objArray1 = new Object[0];
          a.c("ShareAtFriendsPresenter", "updateAtFriend", objArray1);
          n tH = this.H;
          if (tH == p0.length()) {
             tH = n.S8(p0, p1);
             this.H = tH;
          }
          if (tH < 0 || tH > p0.length()) {
             this.Y8("非@模式");
             goto label_00cc ;
          }else {
             Matcher matcher = n.M.matcher(p0);
             if (!matcher.find(tH) || matcher.start() != tH) {
                this.Y8("@匹配失败");
                return;
             }else if(matcher.end() < p1){
                this.Y8("输入了@终止符号");
                return;
             }else if(p1 <= tH){
                this.Y8("光标在@之前");
                return;
             }else {
                this.I = p1;
                p0 = p0.subSequence((tH + 1), p1);
                Object[] objArray2 = new Object[0];
                a.b().w("ShareAtFriendsPresenter", "updateAtFriend search: "+p0, objArray2);
                n tG = this.G;
                if (tG != null) {
                   tG.mh(p0.toString());
                }
                return;
             }
          }
       }
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, n.class, "20")) {
          return;
       }
       n tu = this.u;
       if (tu == null) {
          return;
       }
       tu.c0();
       Publish$b uob = this.u.k();
       uob.b();
       Iterator iterator = this.D.values().iterator();
       while (iterator.hasNext()) {
          User user = iterator.next();
          AtFriend$b uob1 = AtFriend.newBuilder();
          uob1.a(user.getId());
          uob1.c(user.getName());
          uob1.b(c.p(user));
          uob.copyOnWrite();
          uob.instance.addAtFriends(uob1);
       }
       this.u.f();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a0ca8);
       this.r = m1.f(p0, 0x7f0a3f52);
       this.s = m1.f(p0, 0x7f0a31f3);
       m1.a(p0, new n(this), R.id.at_button);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.t = this.r8("SHARE_ACTIVITY");
       this.u = this.t8("PUBLISH");
       this.v = this.t8("WORKSPACE");
       this.w = this.r8("SHARE_PAGE_PRESENTER_MODEL");
       this.x = this.r8("share_page_setting_kswtich");
       this.y = this.t8("SHARE_FROM_PAGE");
       this.D = this.r8("selected_user_map");
       this.z = this.r8("KEY_BOARD_HEIGHT");
       return;
    }
}
