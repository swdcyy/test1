package aua.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import aua.e$b;
import aua.e$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import gg6.d;
import brd.t;
import t45.d;
import brd.z;
import aua.b;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import ab5.v;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.SummaryViewModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.graphics.Color;
import java.lang.Exception;
import lnc.a1;
import android.widget.TextView;
import ga5.b;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CoverCommonTagsModel;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel;
import android.view.ViewGroup;
import android.widget.ImageView;
import kp.w1;
import java.util.Collection;
import ekd.q;
import lnc.ya;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.util.List;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import wb5.g;
import java.lang.StringBuilder;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import android.content.res.Resources;
import lu7.f;
import java.util.Objects;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import xl8.b;
import im8.f;
import xl8.d;
import y8c.a;
import lnc.b9;
import aua.a;
import aua.d;
import java.util.concurrent.Callable;
import aua.c;
import android.content.Context;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.Integer;
import ekd.m1;
import android.view.ViewStub;
import com.kwai.library.widget.textview.AdjustSizeTextView;
import com.kuaishou.android.model.mix.AggregateTemplateMeta;

public class e extends PresenterV2	// class@00030c
{
    public ViewGroup A;
    public int B;
    public final e$b C;
    public final e$b D;
    public int E;
    public boolean F;
    public PhotoMeta p;
    public CommonMeta q;
    public User r;
    public AggregateTemplateMeta s;
    public BaseFragment t;
    public PhotoItemViewParam u;
    public f v;
    public b w;
    public AdjustSizeTextView x;
    public KwaiBindableImageView y;
    public ViewStub z;

    public void e(int p0){
       super();
       this.C = new e$b(null);
       this.D = new e$b(null);
       this.E = p0;
    }
    public void E8(){
       int b;
       e tq;
       SummaryViewModel obj;
       boolean b1;
       int i1;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "6")) {
          return;
       }
       this.R8();
       if (!PatchProxy.applyVoid(objArray, this, uoe, "7")) {
          this.X7(b.a(-565398134).c().observeOn(d.a).subscribe(new b(this), Functions.d()));
       }
       int i = 1;
       if (!PatchProxy.applyVoid(objArray, this, uoe, "5") && this.E == null) {
          e tt = this.t;
          if (tt instanceof v && tt instanceof RecyclerFragment) {
             int page = tt.getPage();
             b = 2;
             if (page != i) {
                boolean b2 = 3;
                if (page != b) {
                   if (page != b2) {
                      if (page != 15) {
                         this.E = b;
                      }else {
                         this.E = i;
                      }
                   }
                }else {
                   this.E = b2;
                }
             }
             this.E = b;
          }
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoid(objArray, this, uoe, "10")) {
          b = this.X8();
          if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uoe, "14")) {
             if (b) {
                if (!PatchProxy.applyVoid(objArray, this, uoe, "15")) {
                   tq = this.D;
                   obj = PatchProxy.apply(objArray, this, uoe, "17");
                   if (obj != patchProxyRe) {
                      i1 = obj.intValue();
                   }else {
                      obj = this.p.mFeedBottomRightSummary.mTextColor;
                      if (!TextUtils.x(obj)) {
                         try{
                            i1 = Color.parseColor(obj);
                         }catch(java.lang.Exception e6){
                            e6.printStackTrace();
                         }
                         i1 = a1.a(R.color.arg_RES_7f061fb8);
                      }else {
                         goto label_00c4 ;
                      }
                   }
                   tq.a = i1;
                   this.D.a(this.x);
                }
             }else {
                this.V8();
             }
          }
          tq = this.q;
          obj = PatchProxy.applyOneRefs(tq, objArray, b.class, "4");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else if(tq != null){
             CommonMeta mCoverCommon = tq.mCoverCommonTags;
             if (mCoverCommon != null) {
                objArray = mCoverCommon.mAuthorRightSideTag;
             }
          }
          if (b.b(objArray)) {
             if (tq != null) {
                CommonMeta mCoverCommon1 = tq.mCoverCommonTags;
                if (mCoverCommon1 != null) {
                   CoverCommonTagsModel mAuthorRight = mCoverCommon1.mAuthorRightSideTag;
                   if (mAuthorRight == null || mAuthorRight.disableTag != i) {
                   }
                }else {
                }
             }else {
             }
          }
          b1 = true;
          if (b1) {
             uoe = this.x;
             if (uoe != null) {
                uoe.setVisibility(8);
             }
             uoe = this.A;
             if (uoe != null) {
                uoe.setVisibility(8);
             }
             uoe = this.y;
             if (uoe != null) {
                uoe.setVisibility(8);
             }
          }else if(b){
             PhotoMeta mFeedBottomR = this.p.mFeedBottomRightSummary;
             if (!PatchProxy.applyVoidOneRefs(mFeedBottomR, this, uoe, "18")) {
                w1.c(this.q, i, mFeedBottomR.mKsOrderId);
                SummaryViewModel mUsers = mFeedBottomR.mUsers;
                if (!q.f(mUsers) && (this.z != null && this.A == null)) {
                   View view = new ya(this.m8()).a(R.id.subject_avatars_stub, 0x7f0a3bda);
                   if (view instanceof ViewGroup) {
                      this.A = view;
                   }
                }
                if (this.A != null) {
                   if (q.f(mUsers)) {
                      this.A.setVisibility(8);
                   }else {
                      this.A.setVisibility(0);
                      b = 0;
                      while (b < this.A.getChildCount()) {
                         KwaiBindableImageView childAt = this.A.getChildAt(b);
                         if (b < mUsers.size()) {
                            childAt.setVisibility(0);
                            g.b(childAt, mUsers.get(b), HeadImageSize.SMALL);
                         }else {
                            childAt.setVisibility(8);
                         }
                         b = b + 1;
                      }
                   }
                }
                this.x.setVisibility(0);
                e tx = this.x;
                SummaryViewModel mText = mFeedBottomR.mText;
                if (mText == null) {
                   mText = "";
                }
                tx.setText(mText);
                this.W8(this.P8()+this.x.getText());
                SummaryViewModel mIcon = mFeedBottomR.mIcon;
                if (!PatchProxy.applyVoidOneRefs(mIcon, this, uoe, "23")) {
                   if (this.y != null) {
                      if (!j.h(mIcon)) {
                         this.y.U(mIcon);
                         this.y.setVisibility(0);
                      }else {
                         this.y.setVisibility(8);
                      }
                   }
                   this.x.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
             }
          }else {
             this.a9();
          }
       }
    label_0205 :
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.R8();
       return;
    }
    public String P8(){
       Object obj = PatchProxy.apply(null, this, e.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.r == null) {
          return this.m8().getResources().getString(0x7f103dfd);
       }
       Object[] objArray = new Object[]{f.c(this.r)};
       return this.m8().getResources().getString(0x7f100040, objArray);
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       e tx = this.x;
       if (tx != null && this.F == null) {
          e tC = this.C;
          Objects.requireNonNull(tC);
          if (!PatchProxy.applyVoidOneRefs(tx, tC, e$b.class, "1") && tx != null) {
             tC.a = tx.getCurrentTextColor();
             tC.b = tx.getTextSize();
          }
          this.D.b = (float)a1.d(0x7f070f6c);
          this.B = this.x.getCompoundDrawablePadding();
          this.F = true;
       }
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, e.class, "26")) {
          return;
       }
       if (TextUtils.x(this.x.getText())) {
          this.x.setCompoundDrawablePadding(this.u.mEmptyTextDrawablePaddingRight);
       }else {
          this.x.setCompoundDrawablePadding(this.B);
       }
       return;
    }
    public final void V8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "16")) {
          return;
       }
       this.C.a(this.x);
       if (this.x != null && b.a(-565398134).b()) {
          e tx = this.x;
          Object obj = PatchProxy.apply(objArray, this, uoe, "8");
          int i = (obj != PatchProxyResult.class)? obj.intValue(): this.m8().getResources().getColor(R.color.arg_RES_7f060bd5);
          tx.setTextColor(i);
       }
       uoe = this.A;
       if (uoe != null) {
          uoe.setVisibility(8);
       }
       uoe = this.y;
       if (uoe != null) {
          uoe.setVisibility(8);
       }
       return;
    }
    public void W8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "20")) {
          return;
       }
       this.x.setImportantForAccessibility(2);
       e tw = this.w;
       if (tw != null) {
          tw.d(p0);
       }
       return;
    }
    public final boolean X8(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       e obj = PatchProxy.apply(null, this, uoe, "9");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.p;
       boolean b = true;
       if (obj != null && obj.mFeedBottomRightSummary != null) {
          Object obj1 = PatchProxy.apply(null, this, uoe, "25");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(TextUtils.x(this.q.mRelationTypeText) && this.q.mRelationType != b){
             e tr = this.r;
             if (tr == null || tr.mFavorited == null) {
                b1 = false;
             }
          }
          b1 = true;
          if (!b1 && this.z != null) {
          label_0051 :
             return b;
          }
       }
    label_0050 :
       b = false;
       goto label_0051 ;
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, e.class, "13")) {
          return;
       }
       e tv = this.v;
       if (tv == null || !tv.get().booleanValue()) {
          tv = this.p;
          if (tv != null) {
             this.Z8(tv);
             this.X7(b9.d(this.p, this.t).subscribe(new a(this)));
          }else {
             this.x.setVisibility(4);
          }
       }
       return;
    }
    public final void Z8(PhotoMeta p0){
       PhotoItemViewParam mLikeIconNor;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "19")) {
          return;
       }
       e tv = this.v;
       if (tv != null && tv.get().booleanValue()) {
          return;
       }
       this.x.setVisibility(0);
       int likeCount = p0.getLikeCount();
       if (likeCount <= 0) {
          this.x.setText("");
       }else {
          this.x.setText(TextUtils.N((long)likeCount));
       }
       this.X7(t.fromCallable(new d(this)).subscribeOn(d.c).observeOn(d.a).subscribe(new c(this, likeCount), Functions.e));
       likeCount = PatchProxy.apply(null, this, uoe, "24");
       if (likeCount != PatchProxyResult.class) {
          likeCount = likeCount.intValue();
       }else {
          e tp = this.p;
          likeCount = (tp != null && tp.isLiked())? 0x7f080a09: this.u.mLikeIconNormalResId;
       }
       this.b9(likeCount);
       this.S8();
       return;
    }
    public void a9(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "11")) {
          return;
       }
       e tE = this.E;
       if (tE == 2) {
          this.Y8();
       }else if(tE == 3){
          if (!PatchProxy.applyVoid(objArray, this, uoe, "12")) {
             CommonMeta mCreated = this.q.mCreated;
             if (mCreated - null <= 0) {
                this.x.setVisibility(4);
             }else {
                this.x.setVisibility(0);
                if (TextUtils.x(this.q.mShowTime)) {
                   this.q.mShowTime = DateUtils.w(this.getContext(), mCreated);
                }
                this.x.setText(this.q.mShowTime);
                this.W8(this.P8()+this.x.getText());
                this.b9(0);
             }
          }
       }else {
          this.x.setVisibility(8);
       }
       this.S8();
       return;
    }
    public void b9(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "22")) {
          return;
       }
       uoe = this.y;
       if (uoe != null) {
          uoe.setVisibility(8);
       }
       this.x.setCompoundDrawablesWithIntrinsicBounds(p0, 0, 0, 0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.z = m1.f(p0, 0x7f0a3bdb);
       this.y = m1.f(p0, 0x7f0a3bde);
       this.x = m1.f(p0, 0x7f0a3bd9);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.s8(PhotoMeta.class);
       this.q = this.q8(CommonMeta.class);
       this.r = this.s8(User.class);
       this.s = this.s8(AggregateTemplateMeta.class);
       this.t = this.r8("FRAGMENT");
       this.u = this.r8("FEED_ITEM_VIEW_PARAM");
       this.v = this.w8("AD_MARK_SHOW_SUBJECT_VIEW");
       this.w = this.t8("accessible_content");
       return;
    }
}
