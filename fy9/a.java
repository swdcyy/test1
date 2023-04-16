package fy9.a;
import qp7.b;
import fy9.a$a;
import nsd.u;
import xq7.d;
import rp7.a;
import fy9.a$b;
import cr7.h;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.IMPhotoReplyConfigInfo;
import java.util.Collection;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kuaishou.android.model.mix.IMPhotoReplyConfigInfo$IMPhotoReplyItem;
import java.util.Objects;
import cr7.i;
import ra6.a;
import qp7.x0;
import cr7.j;
import pp7.b;
import qp7.c;
import fy9.a$c;
import crd.b;
import erd.g;
import io.reactivex.internal.functions.Functions;
import brd.t;
import fy9.a$d;
import com.yxcorp.gifshow.util.rx.RxBus;
import xwa.a;
import fy9.a$e;
import erd.r;
import fy9.a$f;
import fy9.a$g;
import qp7.b1;
import qp7.a;
import v6a.m0;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.w;
import fy9.a$h;
import k2b.f3;
import k2b.e0;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import qp7.d;
import com.kwai.slide.play.detail.information.imquickreply.IMQuickReplyElementView;

public final class a extends b	// class@002384
{
    public BaseFragment q;
    public QPhoto r;
    public IMPhotoReplyConfigInfo s;
    public PublishSubject t;
    public boolean u;
    public List v;
    public final a$b w;
    public static final a$a x;

    static {
       a.x = new a$a(null);
    }
    public void a(){
       super(d.q);
       this.w = new a$b(this);
    }
    public void O(){
       IMPhotoReplyConfigInfo$IMPhotoReplyItem mSimpleChine;
       h oh = h.class;
       a uoa = a.class;
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, uoa, str)) {
          return;
       }
       a ts = this.s;
       if (ts != null && (ts != null && ts.mEnableShowReply == 1)) {
          IMPhotoReplyConfigInfo mReplyItems = (ts != null)? ts.mReplyItems: objArray;
          String str1 = null;
          String str2 = (mReplyItems == null || mReplyItems.isEmpty())? 1: null;
          if (!str2) {
             if (!PatchProxy.applyVoid(objArray, this, uoa, "7")) {
                uoa = this.s;
                a.m(uoa);
                IMPhotoReplyConfigInfo mReplyItems1 = uoa.mReplyItems;
                a.m(mReplyItems1);
                a.o(mReplyItems1, "replyConfigInfo!!.mReplyItems!!");
                ArrayList uArrayList = new ArrayList(u.Y(mReplyItems1, 10));
                Iterator iterator = mReplyItems1.iterator();
                while (iterator.hasNext()) {
                   IMPhotoReplyConfigInfo$IMPhotoReplyItem iMPhotoReply = iterator.next();
                   a$a x = a.x;
                   a.o(iMPhotoReply, "it");
                   Objects.requireNonNull(x);
                   i oi = PatchProxy.applyOneRefs(iMPhotoReply, x, a$a.class, "1");
                   if (oi != PatchProxyResult.class) {
                   }else if(a.f()){
                      mSimpleChine = iMPhotoReply.mSimpleChineseContent;
                   }else if(a.e()){
                      mSimpleChine = iMPhotoReply.mEnglishContent;
                   }else {
                      mSimpleChine = iMPhotoReply.mTraditionalChineseContent;
                   }
                   iMPhotoReply = iMPhotoReply.mEmotionId;
                   a.o(iMPhotoReply, "item.mEmotionId");
                   a.o(mSimpleChine, "content");
                   oi = new i(iMPhotoReply.mMsgSeq, iMPhotoReply, mSimpleChine);
                   int i = str1 + 1;
                   oi.b = i;
                   uArrayList.add(oi);
                }
                this.v = uArrayList;
                j oj = this.E();
                Objects.requireNonNull(oj);
                if (!PatchProxy.applyVoidOneRefs(uArrayList, oj, j.class, str)) {
                   a.p(uArrayList, "newState");
                   oj.d.f(uArrayList);
                }
             }
             h oh1 = this.A();
             a$c uoc = new a$c(this);
             Objects.requireNonNull(oh1);
             b uob = PatchProxy.applyOneRefs(uoc, oh1, oh, "3");
             if (uob != PatchProxyResult.class) {
             }else {
                a.p(uoc, "onNext");
                uob = oh1.a.subscribe(uoc, Functions.d());
                a.o(uob, "buttonClickSubject.subsc¡­unctions.emptyConsumer\(\)\)");
             }
             this.j(uob);
             oh1 = this.A();
             a$d uod = new a$d(this);
             Objects.requireNonNull(oh1);
             b uob1 = PatchProxy.applyOneRefs(uod, oh1, oh, "4");
             if (uob1 != PatchProxyResult.class) {
             }else {
                a.p(uod, "onNext");
                uob1 = oh1.b.subscribe(uod, Functions.d());
                a.o(uob1, "buttonShowSubject.subscr¡­unctions.emptyConsumer\(\)\)");
             }
             this.j(uob1);
             uob1 = RxBus.f.f(a.class).filter(new a$e(this)).subscribe(new a$f(this));
             a.o(uob1, "it");
             this.j(uob1);
             this.E().g(new a$g(this));
             this.i(this.w);
             return;
          }
       }
    label_015c :
       this.b0();
       return;
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
       }else {
          a.p(p0, "callerContext");
          super.P(p0);
          this.q = p0.b;
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          a.o(mPhoto, "callerContext.mPhotoDetailParam.mPhoto");
          this.r = mPhoto;
          if (mPhoto == null) {
             a.S("qPhoto");
          }
          this.s = w.U(mPhoto.getEntity());
          this.t = p0.i0;
          PatchProxy.onMethodExit(a.class, "1");
       }
       return;
    }
    public void T(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.E().g(new a$h(this));
       return;
    }
    public final void e0(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "12")) {
          return;
       }
       if (p0.a != null) {
          return;
       }
       p0.b(true);
       f3 uof3 = f3.j("MESSAGE_QUICK_REPLY_BUTTON");
       uof3.m(this.f0(p0));
       uof3.h(this.q);
       return;
    }
    public final String f0(i p0){
       i3 obj = PatchProxy.applyOneRefs(p0, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.d("emoji_content", p0.a());
       obj.d("id", p0.d);
       obj.c("index", Integer.valueOf(p0.b));
       return obj.e();
    }
    public d q(){
       IMQuickReplyElementView iMQuickReply = PatchProxy.apply(null, this, a.class, "5");
       if (iMQuickReply != PatchProxyResult.class) {
       }else {
          iMQuickReply = new IMQuickReplyElementView();
       }
       return iMQuickReply;
    }
    public c r(){
       h oh = PatchProxy.apply(null, this, a.class, "6");
       if (oh != PatchProxyResult.class) {
       }else {
          oh = new h();
       }
       return oh;
    }
    public x0 t(){
       j oj = PatchProxy.apply(null, this, a.class, "4");
       if (oj != PatchProxyResult.class) {
       }else {
          oj = new j();
       }
       return oj;
    }
}
