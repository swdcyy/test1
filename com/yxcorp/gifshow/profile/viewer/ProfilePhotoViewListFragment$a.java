package com.yxcorp.gifshow.profile.viewer.ProfilePhotoViewListFragment$a;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.gifshow.profile.viewer.ProfilePhotoViewListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import i2b.a;
import g9c.d;
import java.lang.Throwable;
import java.lang.Boolean;
import com.yxcorp.retrofit.model.KwaiException;
import qvb.i;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.profile.viewer.a;
import android.view.View$OnClickListener;
import ekd.m1;
import com.kwai.library.widget.refresh.RefreshLayout;
import k2b.f3;
import k2b.e0;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import mkc.b;
import com.yxcorp.utility.n;

public class ProfilePhotoViewListFragment$a extends f	// class@0015e7
{
    public View l;
    public View m;
    public b n;
    public final ProfilePhotoViewListFragment o;

    public void ProfilePhotoViewListFragment$a(ProfilePhotoViewListFragment p0,RecyclerFragment p1){
       this.o = p0;
       super(p1);
    }
    public View J0(){
       Object obj = PatchProxy.apply(null, this, ProfilePhotoViewListFragment$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.i == null) {
          this.i = a.i(this.a, 0x7f0d168b);
       }
       return this.i;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, ProfilePhotoViewListFragment$a.class, "5")) {
          return;
       }
       if (this.m != null) {
          this.g.ia().l1(this.m);
       }
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, ProfilePhotoViewListFragment$a.class, "2")) {
          return;
       }
       super.j();
       this.l = null;
       return;
    }
    public void k(boolean p0,Throwable p1){
       ProfilePhotoViewListFragment$a uoa = ProfilePhotoViewListFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       v0 = p1 instanceof KwaiException;
       if (uoa && p1.mErrorCode == 13) {
          return;
       }
       this.f();
       this.x();
       String str = null;
       if (uoa) {
          str = p1.mErrorMessage;
       }
       if (p0 && this.o.q().isEmpty()) {
          Objects.requireNonNull(this.o);
          p0 = false;
          KwaiEmptyStateView$a uoa1 = (uoa && p1.mErrorCode == 0x320ce)? 1: null;
          if (uoa1) {
             QCurrentUser.ME.setEnablePhotoGuest(p0).commitChanges();
             View view = a.i(this.a, R.layout.arg_RES_7f0d168d);
             this.l = view;
             m1.a(view, new a(this), R.id.open_permission);
             this.a.K(this.l);
             f3.j("BROWSING_HIS_OPEN").h(this.g);
          }else {
             KwaiEmptyStateView kwaiEmptySta = this.b(p1, str);
             this.l = kwaiEmptySta;
             this.e(p1, str).a(kwaiEmptySta);
             this.a.K(kwaiEmptySta);
             ExceptionHandler.handleUserNotLoginFirstTimeAlert(p1, kwaiEmptySta);
          }
          return;
       }else {
          ExceptionHandler.handleException(a.a().a(), p1);
          return;
       }
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, ProfilePhotoViewListFragment$a.class, "4")) {
          return;
       }
       if (this.m == null) {
          this.m = a.i(this.g.h0(), 0x7f0d168c);
       }
       this.g.ia().L0(this.m);
       return;
    }
    public b r(){
       return b.f;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, ProfilePhotoViewListFragment$a.class, "3")) {
          return;
       }
       super.x();
       View[] viewArray = new View[]{this.f};
       n.Z(8, viewArray);
       return;
    }
}
