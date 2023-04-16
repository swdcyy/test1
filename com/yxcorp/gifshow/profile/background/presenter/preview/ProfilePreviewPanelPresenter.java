package com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewPanelPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewPanelPresenter$mIsRedesignImmersive$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewPanelPresenter$imageSelectSupplier$2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.util.rx.RxBus;
import i3c.d;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewPanelPresenter$d;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import ekd.m1;
import android.widget.ImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$Type;
import w69.i$a;
import w69.b$a;
import w69.b;
import w69.k$a;
import lnc.a1;
import w69.k;
import w69.f$a;
import o79.a;
import w69.f;
import com.yxcorp.gifshow.album.AlbumLimitOption$Builder;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.MediaRatioFilter;
import com.yxcorp.gifshow.album.repo.filter.FilterType;
import nsd.u;
import com.yxcorp.gifshow.album.selected.IMediaSelectableFilter;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import w69.i;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewPanelPresenter$e;
import z5c.l0;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewPanelPresenter$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewPanelPresenter$b;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewPanelPresenter$c;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;

public final class ProfilePreviewPanelPresenter extends PresenterV2	// class@00127b
{
    public View p;
    public View q;
    public View r;
    public BaseFragment s;
    public ProfileBgVideoInfo t;
    public final p u;
    public final p v;

    public void ProfilePreviewPanelPresenter(){
       super();
       this.u = s.c(ProfilePreviewPanelPresenter$mIsRedesignImmersive$2.INSTANCE);
       this.v = s.c(new ProfilePreviewPanelPresenter$imageSelectSupplier$2(this));
    }
    public static final BaseFragment P8(ProfilePreviewPanelPresenter p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ProfilePreviewPanelPresenter.class, "6")) {
          return;
       }
       ProfilePreviewPanelPresenter tp = this.p;
       if (tp == null) {
          a.S("mSelectItemGallery");
       }
       this.V8(tp, R.drawable.arg_RES_7f0822fa, 0x7f1010ff);
       tp = this.q;
       if (tp == null) {
          a.S("mSelectItemPhoto");
       }
       this.V8(tp, R.drawable.arg_RES_7f0822ec, 0x7f10460e);
       tp = this.r;
       if (tp == null) {
          a.S("mSelectItemCamera");
       }
       this.V8(tp, R.drawable.arg_RES_7f0822b9, 0x7f1010fe);
       this.X7(RxBus.f.f(d.class).observeOn(d.a).subscribe(new ProfilePreviewPanelPresenter$d(this)));
       return;
    }
    public final ImageSelectSupplier R8(){
       Object obj = PatchProxy.apply(null, this, ProfilePreviewPanelPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.getValue();
    }
    public final boolean S8(){
       Object obj = PatchProxy.apply(null, this, ProfilePreviewPanelPresenter.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.u.getValue();
       }
       return obj.booleanValue();
    }
    public final void V8(View p0,int p1,int p2){
       if (PatchProxy.isSupport(ProfilePreviewPanelPresenter.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ProfilePreviewPanelPresenter.class, "7")) {
          return;
       }
       m1.f(p0, R.id.select_item_image).setImageResource(p1);
       m1.f(p0, R.id.select_item_title).setText(p2);
       return;
    }
    public final void W8(ImageSelectSupplier$Type p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePreviewPanelPresenter.class, "5")) {
          return;
       }
       a.p(p0, "type");
       b$a uoa = new b$a();
       uoa.c(true);
       k$a uoa1 = new k$a();
       uoa1.f(a1.p(R.string.arg_RES_7f103a83));
       f$a uoa2 = new f$a();
       uoa2.g(a.e);
       uoa2.h(false);
       AlbumLimitOption$Builder uBuilder = new AlbumLimitOption$Builder();
       uBuilder.p(true);
       uBuilder.k(true);
       MediaRatioFilter mediaRatioFi = new MediaRatioFilter(FilterType.SELECT, a1.p(0x7f103fb2), 0, 0, 12, null);
       i oi = new i$a().a(uoa.a()).m(uoa1.c(a1.p(R.string.arg_RES_7f104604)).b()).d(uoa2.a()).f(uBuilder.o(v2).d()).b();
       this.R8().i(p0);
       ImageSelectSupplier$ImageSelectType bACKGROUND_R = (this.S8())? ImageSelectSupplier$ImageSelectType.BACKGROUND_REDESIGN: ImageSelectSupplier$ImageSelectType.BACKGROUND;
       this.R8().f(oi, bACKGROUND_R).subscribe(new ProfilePreviewPanelPresenter$e(this), l0.a(""));
       return;
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePreviewPanelPresenter.class, "3")) {
          return;
       }
       a.p(p0, "view");
       view = m1.f(p0, R.id.select_panel);
       a.o(view, "ViewBindUtils.bindWidget¡­\(view, R.id.select_panel\)");
       view.setVisibility(0);
       View view1 = m1.f(p0, R.id.select_item_gallery);
       a.o(view1, "ViewBindUtils.bindWidget¡­R.id.select_item_gallery\)");
       this.p = view1;
       View view2 = m1.f(p0, R.id.select_item_photo);
       a.o(view2, "ViewBindUtils.bindWidget¡­, R.id.select_item_photo\)");
       this.q = view2;
       View view3 = m1.f(p0, R.id.select_item_camera);
       a.o(view3, "ViewBindUtils.bindWidget¡­ R.id.select_item_camera\)");
       this.r = view3;
       m1.b(p0, new ProfilePreviewPanelPresenter$a(this), R.id.select_item_gallery);
       m1.b(p0, new ProfilePreviewPanelPresenter$b(this), R.id.select_item_photo);
       m1.b(p0, new ProfilePreviewPanelPresenter$c(this), R.id.select_item_camera);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ProfilePreviewPanelPresenter.class, "4")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(PageAccessIds.FRAGMENT\)");
       this.s = obj;
       this.t = this.t8("PROFILE_PREVIEW_VIDEO_INFO");
       return;
    }
}
