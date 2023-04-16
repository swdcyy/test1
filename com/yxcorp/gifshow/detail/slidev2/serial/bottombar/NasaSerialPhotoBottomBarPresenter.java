package com.yxcorp.gifshow.detail.slidev2.serial.bottombar.NasaSerialPhotoBottomBarPresenter;
import o8a.c;
import b1a.o;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.slidev2.serial.bottombar.NasaSerialPhotoBottomBarPresenter$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.kwai.framework.activitycontext.ActivityContext;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.m1;
import android.view.ViewStub;
import ga5.d;
import android.widget.TextView;
import android.widget.ImageView;
import android.text.TextPaint;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import java.lang.CharSequence;
import hf5.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.tube.SerialInfo;
import fm5.a;
import com.yxcorp.gifshow.tube.SerialInfo$SplitEntranceDescription;
import java.lang.StringBuilder;
import uw9.o;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import u8a.b;
import o8a.b;
import u8a.q;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialEpisodePanelFragment;
import ilc.a;
import nsd.u;
import android.app.Activity;
import k2b.e0;
import qrd.l1;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import yy6.c;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialEpisodePanelFragment$a;
import u8a.q$a;
import java.util.List;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.detail.slidev2.serial.bottombar.NasaSerialPhotoBottomBarPresenter$showBottomSerialPanel$$inlined$let$lambda$1;
import msd.a;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Pair;
import sy6.a;
import fw6.c;
import p8a.a;
import zl5.d;

public final class NasaSerialPhotoBottomBarPresenter extends c	// class@0019dd
{
    public final String L;
    public TextView M;
    public ImageView N;
    public ImageView O;
    public PhotoDetailParam P;
    public c Q;
    public NasaSerialPhotoBottomBarPresenter$a R;

    public void NasaSerialPhotoBottomBarPresenter(o p0){
       a.p(p0, "param");
       super(p0);
       this.L = "NasaSerialPhotoBottomBarPresenter";
       this.R = new NasaSerialPhotoBottomBarPresenter$a(this, p0);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, NasaSerialPhotoBottomBarPresenter.class, "2")) {
          return;
       }
       ActivityContext.i(this.R);
       super.E8();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, NasaSerialPhotoBottomBarPresenter.class, "3")) {
          return;
       }
       ActivityContext.k(this.R);
       super.J8();
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, NasaSerialPhotoBottomBarPresenter.class, "5")) {
          return;
       }
       View view = m1.f(this.m8(), R.id.similar_advertisement_photo_bottom_bar_view_stub);
       a.o(view, "ViewBindUtils.bindWidget¡­oto_bottom_bar_view_stub\)");
       view = d.b(view);
       if (!PatchProxy.applyVoidOneRefs(view, this, c.class, "13")) {
          a.p(view, "<set-?>");
          this.x = view;
       }
       view = this.X8().findViewById(R.id.nasa_similar_photo_bottom_bar_title);
       a.o(view, "mSimilarPhotoBottomBarVi¡­r_photo_bottom_bar_title\)");
       this.M = view;
       view = this.X8().findViewById(R.id.nasa_similar_photo_icon);
       a.o(view, "mSimilarPhotoBottomBarVi¡­.nasa_similar_photo_icon\)");
       this.N = view;
       NasaSerialPhotoBottomBarPresenter tM = this.M;
       if (tM == null) {
          a.S("mSimilarPhotoBottomBarTitleView");
       }
       TextPaint paint = tM.getPaint();
       if (paint != null) {
          paint.setFakeBoldText(true);
       }
       view = this.X8().findViewById(R.id.nasa_similar_photo_bottom_bar_open_icon);
       a.o(view, "mSimilarPhotoBottomBarVi¡­oto_bottom_bar_open_icon\)");
       this.O = view;
       return;
    }
    public void b9(){
       if (PatchProxy.applyVoid(null, this, NasaSerialPhotoBottomBarPresenter.class, "4")) {
          return;
       }
       NasaSerialPhotoBottomBarPresenter tN = this.N;
       String str = "mSimilarPhotoBottomIcon";
       if (tN == null) {
          a.S(str);
       }
       tN.setImageResource(R.drawable.arg_RES_7f0819c0);
       tN = this.N;
       if (tN == null) {
          a.S(str);
       }
       ViewGroup$LayoutParams layoutParams = tN.getLayoutParams();
       layoutParams.width = a1.e(16.00f);
       layoutParams.height = a1.e(16.00f);
       tN = this.M;
       str = "mSimilarPhotoBottomBarTitleView";
       if (tN == null) {
          a.S(str);
       }
       tN.setText("");
       QPhoto currentPhoto = this.S8().getCurrentPhoto();
       if (currentPhoto != null) {
          SerialInfo serialInfo = a.i(currentPhoto);
          if (serialInfo != null) {
             serialInfo = serialInfo.mSplitEntranceDescription;
             if (serialInfo != null) {
                SerialInfo$SplitEntranceDescription mContinueInf = serialInfo.mContinueInfo;
                if (mContinueInf != null) {
                   String str1 = a1.p(0x7f10466b)+" ¡¤ "+mContinueInf+' ';
                   NasaSerialPhotoBottomBarPresenter tM = this.M;
                   if (tM == null) {
                      a.S(str);
                   }
                   tM.setText(str1);
                }
             }
          }
       }
       tN = this.O;
       if (tN == null) {
          a.S("mSimilarPhotoOpenIcon");
       }
       tN.setAlpha(0x3f000000);
       return;
    }
    public void d9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NasaSerialPhotoBottomBarPresenter.class, "6")) {
          return;
       }
       int i = 0;
       if (this.S8().getCurrentPhoto() == null) {
          Object[] objArray1 = new Object[i];
          o.C().w(this.L, "showBottomSerialPanel no qphoto", objArray1);
          return;
       }else {
          QPhoto currentPhoto = this.S8().getCurrentPhoto();
          a.m(currentPhoto);
          String str = "mFeedMilanoProtocol.currentPhoto!!";
          a.o(currentPhoto, str);
          b uob = PatchProxy.applyOneRefs(currentPhoto, this, c.class, "18");
          if (uob != PatchProxyResult.class) {
          }else {
             a.p(currentPhoto, "originalPhoto");
             uob = new b(this, currentPhoto);
          }
          Object obj = uob;
          if (this.W8() == null) {
             SerialEpisodePanelFragment$a c1 = SerialEpisodePanelFragment.C1;
             a uoa = new a(i, 1, objArray);
             uoa.F0(this.S8().getCurrentPhoto());
             if (this.getActivity() != null && this.getActivity() instanceof e0) {
                uoa.A0(this.getActivity());
             }
             this.G = c1.a(uoa, this.P, this.Q, i);
          }else {
             QPhoto currentPhoto1 = this.S8().getCurrentPhoto();
             a.m(currentPhoto1);
             a.o(currentPhoto1, str);
             q$a uoa1 = new q$a().b(currentPhoto1).a(obj);
             q oq2 = this.W8();
             if (oq2 != null) {
                oq2.g6(uoa1);
             }
          }
          q oq = this.W8();
          if (oq != null) {
             oq.Y2(this.E);
          }
          q oq1 = this.W8();
          if (oq1 != null) {
             Activity activity = this.getActivity();
             Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
             Activity uActivity = activity;
             oq1.Ig(uActivity, oq1.getClass().getSimpleName(), R.id.serial_slide_panel, this.S8().getCurrentPhoto(), 0, obj, true, new NasaSerialPhotoBottomBarPresenter$showBottomSerialPanel$$inlined$let$lambda$1(this, obj));
          }
          this.C = true;
          return;
       }
    }
    public void h9(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaSerialPhotoBottomBarPresenter.class, "7")) {
          return;
       }
       a.p(p0, "photo");
       q oq = this.W8();
       if (oq != null) {
          ArrayList uArrayList = new ArrayList(oq.r8());
          Pair cursor = oq.getCursor();
          c dataSource = this.Y8().getDataSource();
          if (!dataSource instanceof a) {
             dataSource = null;
          }
          int i = 0;
          if (dataSource != null) {
             Object[] objArray = new Object[i];
             o.C().w(this.L, "onSimilarPhotoSelected update Slide cursor", objArray);
             dataSource.V0().n(cursor.getFirst());
             dataSource.V0().x(cursor.getSecond());
          }
          Object[] objArray1 = new Object[]{cursor,",items:",uArrayList};
          o.C().w(this.L, "onSimilarPhotoSelected cursor:", objArray1);
          this.Y8().x(uArrayList, p0, 1, this.L);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, NasaSerialPhotoBottomBarPresenter.class, "1")) {
          return;
       }
       super.j8();
       this.P = this.s8(PhotoDetailParam.class);
       this.Q = this.s8(c.class);
       return;
    }
}
