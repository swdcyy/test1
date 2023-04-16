package com.yxcorp.gifshow.profile.fragment.AvatarFragment$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.fragment.AvatarFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import zf6.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import zf6.j;
import com.kwai.framework.model.user.User;
import lu7.f;
import java.lang.CharSequence;
import java.lang.Boolean;
import qa6.a;
import android.view.View;
import com.yxcorp.gifshow.profile.fragment.AvatarFragment$b$a;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.profile.fragment.AvatarFragment$b$b;
import oe6.e;
import im8.f;
import com.yxcorp.gifshow.util.rx.RxBus;
import cx5.e;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import k3c.f;
import erd.g;
import crd.b;
import com.kwai.framework.model.user.User$FollowStatus;
import com.yxcorp.gifshow.profile.fragment.a;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$c;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.profile.common.model.ProfileStatusInfo;
import com.yxcorp.gifshow.profile.fragment.AvatarFragment$b$c;
import h3c.h;
import kotlin.jvm.internal.a;
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
import com.yxcorp.gifshow.album.AlbumLimitOption;
import w69.i;
import java.io.File;
import wkd.b;
import j80.c;
import com.yxcorp.gifshow.profile.album.a;
import com.tbruyelle.rxpermissions2.g;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier;
import com.kwai.framework.model.user.UserStatus;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType;
import h3c.h$a;
import gx5.h;
import nsd.u;
import ekd.m1;
import com.yxcorp.gifshow.model.CDNUrl;
import t3c.g;

public class AvatarFragment$b extends PresenterV2	// class@0012fd
{
    public View A;
    public AvatarFragment p;
    public User q;
    public CDNUrl[] r;
    public g s;
    public boolean t;
    public f u;
    public f v;
    public KwaiActionBar w;
    public View x;
    public View y;
    public View z;
    public static final int B = 2131771095;

    public void AvatarFragment$b(AvatarFragment p0){
       super();
       this.p = p0;
    }
    public void E8(){
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AvatarFragment$b uob = AvatarFragment$b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       this.w.q(R.string.arg_RES_7f103e9a);
       if (k.d()) {
          this.w.j(j.n(this.getContext(), R.drawable.arg_RES_7f081d80, 0x7f060151));
       }
       boolean b = true;
       this.w.g(b);
       if (this.t != null) {
          this.w.r(f.a(this.q));
       }
       Object obj = PatchProxy.apply(objArray, this, uob, "9");
       boolean b1 = (obj != patchProxyRe)? obj.booleanValue(): a.b(this.q);
       if (b1) {
          this.y.setVisibility(0);
          this.w.getRightButton().setVisibility(4);
          this.x.setVisibility(0);
          this.x.setOnClickListener(new AvatarFragment$b$a(this));
          this.A.getLayoutParams().width = (int)((float)n.z(this.getContext()) * 0x3f19999a);
          this.A.setOnClickListener(new AvatarFragment$b$b(this));
          if (e.R() < 480 && (e.R() > 0 && !this.v.get().booleanValue())) {
             this.z.setVisibility(0);
          }else {
             this.z.setVisibility(8);
          }
          this.X7(RxBus.f.g(e.class, RxBus$ThreadMode.MAIN).subscribe(new f(this)));
       }else {
          obj = PatchProxy.apply(objArray, this, uob, "7");
          if (obj != patchProxyRe) {
             b2 = obj.booleanValue();
          }else if(this.q.getFollowStatus() == User$FollowStatus.FOLLOWING && this.u.get().booleanValue()){
             b = 0;
          }
          b2 = b;
          if (b2) {
             if (!PatchProxy.applyVoid(objArray, this, uob, "8")) {
                this.w.m(R.string.arg_RES_7f104fdc);
                this.w.getRightButton().setVisibility(0);
                this.w.l(new a(this));
             }
          }else {
             this.w.getRightButton().setVisibility(4);
             this.y.setVisibility(4);
          }
       }
       return;
    }
    public void P8(ImageSelectSupplier$c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AvatarFragment$b.class, "4")) {
          return;
       }
       Activity uActivity = this.getActivity();
       ProfileStatusInfo w = AvatarFragment.w;
       h$a obj = null;
       object oobject = (w == null)? obj: w.mUserStatus;
       AvatarFragment$b$c uob$c = new AvatarFragment$b$c(this);
       int i = 0;
       int i1 = 1;
       if (PatchProxy.isSupport2(h.class, "4")) {
          Object[] objArray = new Object[]{uActivity,oobject,uob$c,p0,p1};
          if (PatchProxy.applyVoid(objArray, obj, h.class, "4")) {
          label_00da :
             return;
          }
       }
       a.p(uActivity, "activity");
       b$a uoa = new b$a();
       uoa.c(i1);
       k$a uoa1 = new k$a();
       uoa1.f(a1.p(R.string.arg_RES_7f103a83));
       f$a uoa2 = new f$a();
       uoa2.g(a.c);
       uoa2.h(i);
       AlbumLimitOption$Builder uBuilder = new AlbumLimitOption$Builder();
       uBuilder.p(i1);
       a uoa3 = new a(uActivity, new g(uActivity), new File(b.a(-1504323719).o(), "avatar.png"));
       uoa3.g(p0);
       uoa3.s = p1;
       uoa3.l(oobject);
       t ot = uoa3.f(new i$a().a(uoa.a()).m(uoa1.b()).d(uoa2.a()).f(uBuilder.d()).b(), ImageSelectSupplier$ImageSelectType.AVATAR);
       obj = new h$a(uActivity, oobject, uob$c, p0, false, 16, null);
       ot.subscribe(v10);
       PatchProxy.onMethodExit(h.class, "4");
       goto label_00da ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AvatarFragment$b.class, "2")) {
          return;
       }
       this.y = m1.f(p0, 0x7f0a2ab2);
       this.w = m1.f(p0, 0x7f0a3f6a);
       this.x = m1.f(p0, 0x7f0a2bfb);
       this.z = m1.f(p0, 0x7f0a06aa);
       this.A = m1.f(p0, 0x7f0a06a9);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, AvatarFragment$b.class, "1")) {
          return;
       }
       this.q = this.r8("user");
       this.r = this.r8("cnds");
       this.s = this.r8("editLogger");
       this.t = this.r8("showKwaiId").booleanValue();
       this.u = this.x8("showModifyAlias");
       this.v = this.x8("defaultHead");
       return;
    }
}
