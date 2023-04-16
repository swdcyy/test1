package etb.i0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem$ContentInfo;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem$SubContentInfo;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.List;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem$SimpleUserInfo;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem$RightButtonInfo;
import zf6.k;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem$MaterialInfo;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem$CardPhotoInfo;
import java.util.Collection;
import ekd.q;
import etb.j0;
import g9c.a;
import lnc.a1;
import tyc.i2;
import tyc.j2;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.ViewGroup;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import etb.f0;
import erd.o;
import t45.d;
import brd.z;
import etb.e0;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import etb.g0;
import java.lang.Runnable;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import etb.h0;
import java.lang.Iterable;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import android.net.Uri;
import ekd.x0;
import wkd.b;
import nf6.i;
import android.content.Intent;
import android.view.View;
import ekd.m1;
import etb.i0$a;
import android.view.View$OnClickListener;
import etb.i0$b;
import ctb.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.notice.box.data.NoticeBoxPlateSetting;
import java.lang.Boolean;

public class i0 extends PresenterV2	// class@0027fa
{
    public KwaiImageView A;
    public TextView B;
    public KwaiImageView C;
    public KwaiImageView D;
    public KwaiImageView E;
    public KwaiImageView F;
    public TextView G;
    public RecyclerView H;
    public g I;
    public GridLayoutManager J;
    public int p;
    public boolean q;
    public String r;
    public a s;
    public NoticeBoxVideoCardItem t;
    public RecyclerFragment u;
    public NoticeBoxPlateSetting v;
    public TextView w;
    public TextView x;
    public KwaiImageView y;
    public TextView z;

    public void i0(){
       super();
    }
    public void E8(){
       i0 a;
       i0 oi01;
       g og = this;
       i0 oi0 = i0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, og, oi0, "3")) {
          return;
       }
       og.x.setText(og.t.mTime);
       int i = 8;
       if (og.t.mContentInfo != null) {
          this.P8();
          NoticeBoxVideoCardItem$ContentInfo mSubContentI = og.t.mContentInfo.mSubContentInfo;
          if (mSubContentI != null) {
             if (TextUtils.x(mSubContentI.mSubContent)) {
                og.G.setVisibility(i);
             }else {
                og.G.setText(og.t.mContentInfo.mSubContentInfo.mSubContent);
                og.G.setVisibility(0);
             }
          }else {
             og.G.setVisibility(i);
          }
       }else {
          og.w.setVisibility(i);
          og.G.setVisibility(i);
       }
       int i1 = 4;
       int i2 = 2;
       if (!PatchProxy.applyVoid(objArray, og, oi0, "4")) {
          KwaiImageView[] kwaiImageVie = new KwaiImageView[i1];
          kwaiImageVie[0] = og.C;
          kwaiImageVie[1] = og.D;
          kwaiImageVie[i2] = og.E;
          kwaiImageVie[3] = og.F;
          NoticeBoxVideoCardItem mContentInfo = og.t.mContentInfo;
          if (mContentInfo != null) {
             NoticeBoxVideoCardItem$ContentInfo mSubContentI1 = mContentInfo.mSubContentInfo;
             if (mSubContentI1 != null) {
                oi01 = mSubContentI1.mUserList.size();
             label_008e :
                int i6 = 0;
                while (i6 < i1) {
                   if (i6 < oi01) {
                      kwaiImageVie[i6].P(og.t.mContentInfo.mSubContentInfo.mUserList.get(i6).headUrls);
                      kwaiImageVie[i6].setVisibility(0);
                   }else {
                      kwaiImageVie[i6].setVisibility(i);
                   }
                   i6 = i6 + 1;
                }
             }
          }
          oi01 = null;
          goto label_008e ;
       }
       og.y.L(og.t.mLeftThumbnail);
       NoticeBoxVideoCardItem mRightButton = og.t.mRightButtonInfo;
       if (mRightButton != null) {
          og.z.setText(mRightButton.mText);
          og.z.setVisibility(0);
       }else {
          og.z.setVisibility(i);
       }
       if (og.t.mMaterialInfo != null) {
          a = og.A;
          NoticeBoxVideoCardItem$MaterialInfo mDarkLogoUrl = (k.d())? og.t.mMaterialInfo.mDarkLogoUrl: og.t.mMaterialInfo.mLightLogoUrl;
          a.L(mDarkLogoUrl);
          og.A.setVisibility(0);
          og.B.setText(og.t.mMaterialInfo.mName);
          og.B.setVisibility(0);
       }else {
          og.A.setVisibility(i);
          og.B.setVisibility(i);
       }
       if (!PatchProxy.applyVoid(objArray, og, oi0, "5")) {
          NoticeBoxVideoCardItem mCardPhotoIn = og.t.mCardPhotoInfo;
          if (mCardPhotoIn != null && !q.f(mCardPhotoIn.mPhotoIds)) {
             int i3 = og.t.mCardPhotoInfo.mPhotoIds.size();
             if (i3 == 1) {
                i1 = 1;
             }else if(i3 < i1){
                i1 = 2;
             }
             i0 i4 = og.I;
             if (i4 == null) {
                j0 oj0 = new j0(og);
                og.I = oj0;
                oj0.W0(og.R8(i1));
                int i5 = a1.e(2.00f);
                i2 oi2 = new i2(i5, 0, 0, i5, 0, 0, null);
                og.H.addItemDecoration(a);
                i4 = og.H;
                Context context = this.getContext();
                if (i3 == 1) {
                   i2 = 1;
                }
                GridLayoutManager gridLayoutMa = new GridLayoutManager(context, i2);
                og.J = gridLayoutMa;
                i4.setLayoutManager(gridLayoutMa);
                og.H.setAdapter(og.I);
             }else {
                i4.W0(og.R8(i1));
                i4 = og.J;
                if (i3 == 1) {
                   i2 = 1;
                }
                i4.setSpanCount(i2);
                og.I.k0();
             }
             og.H.setVisibility(0);
          }else {
             og.H.setVisibility(i);
          }
       }
       og.X7(og.t.observable().map(f0.b).distinctUntilChanged().observeOn(d.a).subscribe(new e0(og), Functions.d()));
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "7")) {
          return;
       }
       NoticeBoxVideoCardItem mContentInfo = this.t.mContentInfo;
       if (mContentInfo == null || TextUtils.x(mContentInfo.mContent)) {
          this.w.setVisibility(8);
          return;
       }else {
          this.w.setText(this.t.mContentInfo.mContent);
          this.w.post(new g0(this));
          this.w.setVisibility(0);
          return;
       }
    }
    public final List R8(int p0){
       ArrayList obj;
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oi0, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = Lists.f(p0);
       for (int i = 0; i < p0; i = i + 1) {
          obj.add(CollectionsKt___CollectionsKt.o2(this.t.mCardPhotoInfo.mPhotos, new h0(this, i)));
       }
       return obj;
    }
    public void S8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "10")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity == null) {
          return;
       }
       Intent intent = b.a(0x66dce92a).c(activity, x0.f(p0), true, true);
       if (intent != null) {
          activity.startActivity(intent);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a2e3c);
       this.x = m1.f(p0, 0x7f0a2e3f);
       this.y = m1.f(p0, 0x7f0a2e36);
       this.z = m1.f(p0, 0x7f0a2e34);
       this.A = m1.f(p0, 0x7f0a2e3e);
       this.B = m1.f(p0, 0x7f0a2e3b);
       this.C = m1.f(p0, 0x7f0a2e2f);
       this.D = m1.f(p0, 0x7f0a2e30);
       this.E = m1.f(p0, 0x7f0a2e31);
       this.F = m1.f(p0, 0x7f0a2e32);
       this.G = m1.f(p0, 0x7f0a2e40);
       this.H = m1.f(p0, 0x7f0a2e17);
       p0.setOnClickListener(new i0$a(this));
       this.z.setOnClickListener(new i0$b(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "1")) {
          return;
       }
       this.r = this.r8("KEY_NOTICE_BOX_NAME");
       this.s = this.q8(a.class);
       this.t = this.q8(NoticeBoxVideoCardItem.class);
       this.p = this.r8("ADAPTER_POSITION").intValue();
       this.u = this.r8("NOTICE_BOX_FRAGMENT");
       this.v = this.t8("NOTICE_BOX_ITEM_PLATE_SETTING");
       this.q = this.r8("KEY_NOTICE_BOX_IS_UP_SCROLL_LOAD_MORE").booleanValue();
       return;
    }
}
