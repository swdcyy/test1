package com.yxcorp.gifshow.profile.preview.ProfilePreviewFragment;
import lnc.g2$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e5c.c;
import g5c.b;
import f5c.c;
import android.os.Bundle;
import lnc.g2;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.profile.preview.b;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.profile.preview.a;
import android.view.View$OnClickListener;
import crd.b;
import lnc.b9;
import im8.c;
import java.util.ArrayList;
import ekd.j;
import brd.t;
import qa9.q;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.profile.preview.c;
import erd.g;

public class ProfilePreviewFragment extends BaseFragment implements g2$a	// class@001594
{
    public b j;
    public g2 k;
    public static UserProfile l;
    public static q m;

    public void ProfilePreviewFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, ProfilePreviewFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new c());
       obj.U7(new b());
       obj.U7(new c());
       PatchProxy.onMethodExit(ProfilePreviewFragment.class, "4");
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePreviewFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.k = new g2(this, this);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ProfilePreviewFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d125a, p1, false);
       view.findViewById(R.id.user_operation_layout).setOnTouchListener(b.b);
       view.findViewById(R.id.back_btn).setOnClickListener(a.b);
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, ProfilePreviewFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.j);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfilePreviewFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = new Object[]{this,new c("userProfile", ProfilePreviewFragment.l)};
       this.k.b(j.a(objArray));
       b9.a(this.j);
       this.j = ProfilePreviewFragment.m.f().observeOn(d.a).subscribe(new c(this));
       return;
    }
}
