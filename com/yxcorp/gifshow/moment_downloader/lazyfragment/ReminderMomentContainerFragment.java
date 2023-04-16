package com.yxcorp.gifshow.moment_downloader.lazyfragment.ReminderMomentContainerFragment;
import hka.l;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import hka.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import pw5.o;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import o56.f;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tkd.b;
import tkd.d;
import rx5.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import wkd.b;
import eob.t;
import java.util.Objects;
import brd.t;
import com.yxcorp.gifshow.moment_downloader.lazyfragment.c;
import erd.r;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.moment_downloader.lazyfragment.b;
import com.kwai.live.gzone.accompanyplay.audience.a0;
import erd.g;
import crd.b;

public class ReminderMomentContainerFragment extends LazyInitSupportedFragment implements l	// class@001fc1
{
    public String s;
    public Fragment t;
    public static final int u;

    public void ReminderMomentContainerFragment(){
       super();
    }
    public boolean S0(){
       return j.d(this);
    }
    public boolean S1(){
       return j.b(this);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ReminderMomentContainerFragment.class, "5")) {
          return;
       }
       RxBus.f.b(new o());
       return;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ReminderMomentContainerFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d08db, p1, false);
       if (!f.b(this.getActivity())) {
          view.setBackgroundColor(a1.a(R.color.arg_RES_7f06008d));
       }
       return view;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReminderMomentContainerFragment.class, "3")) {
          return;
       }
       if (TextUtils.x(this.s)) {
          View[] viewArray = new View[]{p0};
          d.a(0x77cfa10c).Qa(this, viewArray);
          FragmentActivity activity = this.getActivity();
          Objects.requireNonNull(activity);
          t ot = b.a(-992634779).a(activity, 0);
          ot.filter(c.b).observeOn(d.a).subscribe(new b(this), a0.b);
       }
       return;
    }
    public boolean i0(){
       return j.c(this);
    }
    public boolean lh(){
       return true;
    }
    public boolean n5(){
       return j.e(this);
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReminderMomentContainerFragment.class, "1")) {
          return;
       }
       if (p0 != null) {
          p0.clear();
       }
       super.onCreate(p0);
       return;
    }
    public boolean u2(){
       return j.f(this);
    }
    public boolean x0(){
       return j.a(this);
    }
}
