package com.yxcorp.gifshow.follow.stagger.post.fragment.TopSnackBarFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.follow.stagger.post.fragment.TopSnackBarFragment$a;
import nsd.u;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import android.content.Context;
import kotlin.jvm.internal.a;
import android.os.Bundle;
import android.os.Parcelable;
import org.parceler.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.follow.stagger.post.fragment.TopSnackBarFragment$b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import zf6.k;
import i2b.a;
import com.yxcorp.gifshow.follow.stagger.post.MockUploadFailedPresenter;
import ekd.i;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.utility.n;

public final class TopSnackBarFragment extends BaseFragment	// class@0011df
{
    public TopSnackBarFragment$b j;
    public final PresenterV2 k;
    public QPhoto l;
    public static final TopSnackBarFragment$a m;

    static {
       TopSnackBarFragment.m = new TopSnackBarFragment$a(null);
    }
    public void TopSnackBarFragment(){
       super(null, null, null, null, 15, null);
       this.k = super();
    }
    public final void ch(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TopSnackBarFragment.class, "6")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          c supportFragm = activity.getSupportFragmentManager();
          if (supportFragm != null) {
             objArray = supportFragm.beginTransaction();
          }
       }
       if (objArray != null) {
          e uoe = objArray.u(this);
          if (uoe != null) {
             uoe.m();
          }
       }
       return;
    }
    public void onAttach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TopSnackBarFragment.class, "1")) {
          return;
       }
       a.p(p0, "context");
       super.onAttach(p0);
       Bundle arguments = this.getArguments();
       Parcelable parcelable = (arguments != null)? arguments.getParcelable("photo"): null;
       QPhoto qPhoto = b.a(parcelable);
       this.l = qPhoto;
       this.j = new TopSnackBarFragment$b(this, this, qPhoto);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TopSnackBarFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       if (p0 != null) {
          this.ch();
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TopSnackBarFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       int i = (k.d())? 0x7f0d08d0: 0x7f0d08cf;
       return a.g(p0, i, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, TopSnackBarFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       this.k.unbind();
       this.k.destroy();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       ViewGroup$MarginLayoutParams layoutParams;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TopSnackBarFragment.class, "4")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.k.U7(new MockUploadFailedPresenter());
       this.k.f(p0);
       TopSnackBarFragment tk = this.k;
       Object[] objArray = new Object[1];
       TopSnackBarFragment tj = this.j;
       if (tj == null) {
          a.S("innerContext");
       }
       objArray[0] = tj;
       tk.i(objArray);
       if (i.c()) {
          layoutParams = p0.getLayoutParams();
          if (layoutParams != null) {
             Context context = this.getContext();
             a.m(context);
             layoutParams.topMargin = n.A(context);
          }
       }else {
          layoutParams = p0.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.topMargin = 0;
          }
       }
       return;
    }
}
