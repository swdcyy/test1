package jmd.b;
import hmd.d;
import jmd.b$a;
import nsd.u;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import hmd.d$a;
import mn6.a;
import android.content.Context;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.gifshow.post.api.feature.vote.model.VoteResultResponse;
import jn6.c;
import lnc.k1;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.MultiVoteStickerFeedUIData;
import nmd.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.InteractStickerWrapperView;
import com.kwai.robust.PatchProxyResult;
import jmd.a;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Number;
import lnc.a1;
import jmd.b$d;
import android.view.View;
import android.view.ViewGroup;
import i2b.a;
import ekd.m1;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteTextView;
import android.widget.TextView;
import com.yxcorp.gifshow.kuaishan.widget.KSProgressBar;
import android.text.TextPaint;
import android.widget.EditText;
import nmd.f;
import android.widget.FrameLayout;
import java.lang.Integer;
import com.kwai.gifshow.post.api.feature.vote.model.VoteInfo;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.MultiVoteOptionFeedData;
import com.kwai.gifshow.post.api.feature.vote.model.VoteResult;
import java.util.Collection;
import brd.t;
import java.lang.UnsupportedOperationException;
import java.lang.Throwable;
import psb.e;
import psb.f;
import cjd.e;
import erd.o;
import jmd.b$b;
import erd.g;
import jmd.b$c;
import crd.b;

public final class b implements d	// class@00170f
{
    public b a;
    public final int b;
    public a c;
    public final BaseFeed d;
    public static final b$a e;

    static {
       b.e = new b$a(null);
    }
    public void b(BaseFeed p0){
       super();
       this.d = p0;
       this.b = 0x7f081b4d;
    }
    public void a(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       a.p(p0, "intent");
       if (!PatchProxy.applyVoidTwoRefs(this, p0, null, d$a.class, "1")) {
          a.p(p0, "intent");
       }
       return;
    }
    public int b(){
       return this.b;
    }
    public void c(a p0,Context p1,InteractStickerInfo p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "3")) {
          return;
       }
       a.p(p1, "context");
       a.p(p2, "data");
       Object[] objArray = new Object[0];
       a.D().w("ThreeOptionsVote", "updateExpandView: helper = ["+p0+"], context = ["+p1+"], data = ["+p2+']', objArray);
       VoteResultResponse voteResultRe = c.e(p2);
       k1.a(voteResultRe, "ThreeOptionsVote", "updateExpandView: illegal data");
       if (voteResultRe != null) {
          b tc = this.c;
          if (tc != null) {
             int i = (p0 != null)? 2: 1;
             tc.d(this.e(voteResultRe, i));
          }
       }
       return;
    }
    public InteractStickerWrapperView d(a p0,Context p1,InteractStickerInfo p2){
       Object[] this;
       b c;
       ClientEvent$ElementPackage obj4;
       b$d uod;
       b uob = this;
       Object[] obj = p0;
       Object obj1 = p1;
       Object[] obj2 = p2;
       VoteResultResponse obj3 = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "2");
       if (obj3 != PatchProxyResult.class) {
          return obj3;
       }
       a.p(obj1, "context");
       a.p(obj2, "data");
       this = new Object[0];
       String str = "ThreeOptionsVote";
       a.D().w(str, "initExpandView: helper = ["+obj+"], context = ["+obj1+"], data = ["+obj2+']', this);
       obj3 = c.e(p2);
       k1.a(obj3, str, "initExpandView: illegal data");
       obj2 = null;
       if (obj3 == null) {
          return obj2;
       }
       if (uob.c == null) {
          uob.c = new a();
       }
       InteractStickerWrapperView interactStic = new InteractStickerWrapperView(obj1, uob);
       b uob1 = 2;
       a int this1 = (obj != null)? 2: 1;
       MultiVoteStickerFeedUIData multiVoteSti = uob.e(obj3, this1);
       this1 = a.a;
       Objects.requireNonNull(this1);
       if (!PatchProxy.applyVoid(obj2, this1, a.class, "1")) {
          obj4 = new ClientEvent$ElementPackage();
          obj4.action2 = "THREE_VOTE_STICKER_DIALOG";
          u1.C0("", obj2, 4, obj4, obj2);
       }
       c = uob.c;
       a.m(c);
       Objects.requireNonNull(c);
       obj4 = PatchProxy.apply(obj2, c, a.class, "3");
       int i = (obj4 != PatchProxyResult.class)? obj4.intValue(): a1.d(R.dimen.arg_RES_7f0702d6);
       interactStic.setStickerExtraWidth(i);
       c = uob.c;
       a.m(c);
       Objects.requireNonNull(c);
       obj4 = PatchProxy.applyOneRefs(multiVoteSti, c, a.class, "4");
       if (obj4 != PatchProxyResult.class) {
          i = obj4.intValue();
       }else {
          a.p(multiVoteSti, "data");
          i = (multiVoteSti.isAuthor() && multiVoteSti.getPageSource() == uob1)? a1.d(R.dimen.arg_RES_7f0702f8): 0;
       }
       interactStic.setStickerExtraHeight(i);
       b c1 = uob.c;
       a.m(c1);
       obj = (obj == null || uob.d == null)? obj2: new b$d(uob, obj3, obj, obj1);
       Objects.requireNonNull(c1);
       b uob2 = c1;
       MultiVoteStickerFeedUIData multiVoteSti1 = multiVoteSti;
       View view = PatchProxy.applyThreeRefs(p1, multiVoteSti, obj, c1, a.class, "1");
       if (view != PatchProxyResult.class) {
       }else {
          a.p(obj1, "context");
          a.p(multiVoteSti1, "data");
          uob2.b = obj;
          view = a.c(obj1, R.layout.arg_RES_7f0d07a7, null);
          uob2.c = view;
          a.o(view, "stickerView");
          if (!PatchProxy.applyVoidOneRefs(view, uob2, a.class, "2")) {
             uob2.d = m1.f(view, 0x7f0a33a4);
             uob2.e = m1.f(view, 0x7f0a33ad);
             uob2.f = m1.f(view, 0x7f0a2ef8);
             uob2.i = m1.f(view, 0x7f0a2efb);
             uob2.l = m1.f(view, 0x7f0a2efd);
             uob2.g = m1.f(view, 0x7f0a2eea);
             uob2.j = m1.f(view, 0x7f0a2ef1);
             uob2.m = m1.f(view, 0x7f0a2eef);
             uob2.h = m1.f(view, 0x7f0a2ee9);
             uob2.k = m1.f(view, 0x7f0a2ef0);
             uob2.n = m1.f(view, 0x7f0a2eee);
             uob2.o = m1.f(view, 0x7f0a2c54);
             uob2.p = m1.f(view, 0x7f0a2c55);
             uob2.q = m1.f(view, 0x7f0a35d2);
             a e = uob2.e;
             if (e != null) {
                TextPaint paint = e.getPaint();
                if (paint != null) {
                   paint.setFakeBoldText(true);
                label_01ec :
                   e = uob2.f;
                   if (e != null) {
                      paint = e.getPaint();
                      if (paint != null) {
                         paint.setFakeBoldText(true);
                      }
                   }
                   e = uob2.i;
                   if (e != null) {
                      paint = e.getPaint();
                      if (paint != null) {
                         paint.setFakeBoldText(true);
                      }
                   }
                   e = uob2.l;
                   if (e != null) {
                      paint = e.getPaint();
                      if (paint != null) {
                         paint.setFakeBoldText(true);
                      }
                   }
                   e = uob2.g;
                   if (e != null) {
                      f.a(e);
                   }
                   e = uob2.j;
                   if (e != null) {
                      f.a(e);
                   }
                   e = uob2.m;
                   if (e != null) {
                      f.a(e);
                   }
                }
             }
             i = true;
             goto label_01ec ;
          }
          uob2.d(multiVoteSti1);
       }
       interactStic.addView(view);
       return interactStic;
    }
    public final MultiVoteStickerFeedUIData e(VoteResultResponse p0,int p1){
       VoteInfo obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("ThreeOptionsVote", "toMultiVoteStickerFeedUIData: ", objArray);
       VoteInfo mQuestion = p0.mVoteInfo.mQuestion;
       a.o(mQuestion, "mVoteInfo.mQuestion");
       obj = p0.mVoteInfo.mOptions;
       a.o(obj, "mVoteInfo.mOptions");
       ArrayList uArrayList = new ArrayList(u.Y(obj, 10));
       Iterator iterator = obj.iterator();
       boolean i = 0;
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          a.o(obj1, "option");
          VoteResultResponse mVoteResult = p0.mVoteResult;
          int i2 = (mVoteResult != null)? (int)mVoteResult.getResult(i): 0;
          i = (i == p0.votedOption)? true: false;
          uArrayList.add(new MultiVoteOptionFeedData(obj1, i2, i));
          i = i1;
       }
       MultiVoteStickerFeedUIData multiVoteSti = new MultiVoteStickerFeedUIData(mQuestion, new ArrayList(uArrayList), p0.mIsAuthor, p0.mVoted, p1);
       return p0;
    }
    public t getData(){
       t obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("ThreeOptionsVote", "getData: photo = ["+this.d+']', objArray);
       if (this.d == null) {
          obj = t.error(new UnsupportedOperationException());
          a.o(obj, "Observable.error\(UnsupportedOperationException\(\)\)");
          return obj;
       }else {
          obj = f.a().e(this.d.getId()).map(new e()).doOnNext(b$b.b).map(b$c.b);
          a.o(obj, "EditApiServiceManager.ge¡­toInteractStickerInfo\(\) }");
          return obj;
       }
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("ThreeOptionsVote", "release: ", objArray);
       b ta = this.a;
       if (ta != null) {
          ta.dispose();
       }
       return;
    }
}
