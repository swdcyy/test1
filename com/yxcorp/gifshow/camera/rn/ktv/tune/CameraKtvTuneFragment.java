package com.yxcorp.gifshow.camera.rn.ktv.tune.CameraKtvTuneFragment;
import mm6.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import f3b.o;
import kotlin.jvm.internal.a;
import mm6.b;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import mm6.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import ag6.a;
import android.view.KeyEvent;
import hka.d;
import hka.c;
import com.yxcorp.gifshow.camera.rn.ktv.tune.KtvTuneKrnFragment;
import com.yxcorp.gifshow.camera.rn.ktv.tune.KtvTuneKrnFragment$a;
import androidx.fragment.app.c;
import androidx.fragment.app.e;

public final class CameraKtvTuneFragment extends BaseFragment implements c	// class@000ff4
{

    public void CameraKtvTuneFragment(){
       super(null, null, null, null, 15, null);
    }
    public int Ff(){
       return 0x7f0619d5;
    }
    public int S5(){
       return 0x7f08103c;
    }
    public String Xa(){
       String obj = PatchProxy.apply(null, this, CameraKtvTuneFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = o.i(112);
       a.o(obj, "ProtoStringUtil.getPage\(page\)");
       return obj;
    }
    public boolean Xg(){
       return true;
    }
    public boolean a4(){
       return b.b(this);
    }
    public void dg(Activity p0){
    }
    public boolean f9(){
       return b.f(this);
    }
    public Drawable i9(){
       return b.i(this);
    }
    public boolean lf(){
       return b.h(this);
    }
    public boolean onBackPressed(){
       FragmentActivity obj = PatchProxy.apply(null, this, CameraKtvTuneFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getActivity();
       if (obj == null) {
          return false;
       }
       a.o(obj, "activity ?: return false");
       if (obj instanceof a) {
          obj.A0();
       }
       return true;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, CameraKtvTuneFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.c(p0, 0x7f0d017c, p1, false);
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       return c.a(this, p0, p1);
    }
    public boolean onKeyUp(int p0,KeyEvent p1){
       return c.b(this, p0, p1);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CameraKtvTuneFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       KtvTuneKrnFragment ktvTuneKrnFr = new KtvTuneKrnFragment();
       ktvTuneKrnFr.setArguments(KtvTuneKrnFragment$a.b(KtvTuneKrnFragment.E, new Bundle(), "recommend", true, null, false, 24, null));
       e uoe = this.getChildFragmentManager().beginTransaction();
       uoe.f(R.id.camera_ktv_tune_container, ktvTuneKrnFr);
       uoe.l();
       return;
    }
    public boolean re(){
       return b.g(this);
    }
    public boolean x2(){
       return true;
    }
}
