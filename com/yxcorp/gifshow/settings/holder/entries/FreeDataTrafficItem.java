package com.yxcorp.gifshow.settings.holder.entries.FreeDataTrafficItem;
import ihc.c;
import com.yxcorp.gifshow.settings.holder.entries.FreeDataTrafficItem$a;
import nsd.u;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.settings.holder.entries.FreeDataTrafficItem$action$1;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ka0.a;
import com.yxcorp.gifshow.freetraffic.FreeTrafficManager;
import com.kuaishou.gifshow.network.freetraffic.model.FreeTrafficDeviceInfoResponse;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.t;
import gr8.b;
import brd.x;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.settings.holder.entries.FreeDataTrafficItem$b;
import com.yxcorp.gifshow.settings.holder.entries.FreeDataTrafficItem$c;
import erd.g;
import crd.b;
import ihc.a;
import android.content.res.Resources;
import android.content.Context;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.text.SpannableString;
import wgc.l;
import androidx.lifecycle.MutableLiveData;
import lhc.b;

public final class FreeDataTrafficItem extends c	// class@001b2f
{
    public boolean s;
    public final int t;
    public final l u;
    public static final FreeDataTrafficItem$a v;

    static {
       FreeDataTrafficItem.v = new FreeDataTrafficItem$a(null);
    }
    public void FreeDataTrafficItem(BaseFragment p0,SettingItemStencil p1){
       a.p(p0, "targetFragment");
       a.p(p1, "data");
       super(p0, p1);
       this.t = 0x7f080be9;
       this.u = new FreeDataTrafficItem$action$1(this);
    }
    public int c(){
       return this.t;
    }
    public l getAction(){
       return this.u;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, FreeDataTrafficItem.class, "1")) {
          return;
       }
       if (!a.b()) {
          return;
       }
       if (this.s != null) {
          FreeTrafficManager uFreeTraffic = FreeTrafficManager.j();
          a.o(uFreeTraffic, "FreeTrafficManager.getInstance\(\)");
          this.p(uFreeTraffic.h());
          return;
       }else {
          FreeTrafficManager.j().g(RequestTiming.LOGIN).compose(this.m()).observeOn(d.a).subscribe(new FreeDataTrafficItem$b(this), new FreeDataTrafficItem$c(this));
          return;
       }
    }
    public final void p(FreeTrafficDeviceInfoResponse p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, FreeDataTrafficItem.class, "2")) {
          return;
       }
       int i = 0x7f100f88;
       if (p0 == null) {
          str = this.b.getResources().getString(i);
       }else if(TextUtils.isEmpty(p0.mFreeTrafficType) || p0.mIsActivated != null){
          str = this.b.getResources().getString(i);
       }else if(p0.mSwitch != null){
          str = l.a(this.b, R.drawable.arg_RES_7f081f90, 0x7f100f85);
       }else {
          str = l.a(this.b, R.drawable.arg_RES_7f081f8f, 0x7f100f82);
       }
       a.o(str, "statusValue");
       b.a(this.getStatus(), str);
       return;
    }
}
