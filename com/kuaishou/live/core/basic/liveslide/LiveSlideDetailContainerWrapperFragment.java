package com.kuaishou.live.core.basic.liveslide.LiveSlideDetailContainerWrapperFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.widget.SwipeLayout;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.basic.liveslide.LiveSlideDetailContainerFragment;
import d12.d;
import g12.a;
import com.kuaishou.live.core.basic.liveslide.b$b;
import com.kuaishou.live.core.basic.liveslide.b;
import pw6.a;
import androidx.fragment.app.Fragment;
import pw6.d;
import f12.o;
import android.os.Bundle;
import com.kuaishou.live.core.basic.liveslide.a;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;

public class LiveSlideDetailContainerWrapperFragment extends BaseFragment	// class@000839
{
    public LiveSlideDetailContainerFragment j;
    public a k;
    public static final int l;

    public void LiveSlideDetailContainerWrapperFragment(){
       super();
    }
    public SwipeLayout ch(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveSlideDetailContainerWrapperFragment obj = PatchProxy.apply(objArray, this, LiveSlideDetailContainerWrapperFragment.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.j;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, LiveSlideDetailContainerFragment.class, "14");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else {
          d d = obj.g.d;
          if (d != null) {
             objArray = d.a();
          }
       }
       return objArray;
    }
    public void dh(){
       if (PatchProxy.applyVoid(null, this, LiveSlideDetailContainerWrapperFragment.class, "7")) {
          return;
       }
       a uoa = this.k.h().b();
       if (uoa == null) {
          return;
       }
       Fragment uFragment = uoa.a();
       if (uoa.a() instanceof d) {
          uFragment.Mg("ACTIVITY_FINISH");
       }
       return;
    }
    public String getUrl(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, LiveSlideDetailContainerWrapperFragment.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.k.h().b();
       if (!obj instanceof o) {
          return "";
       }
       Objects.requireNonNull(obj);
       String str = PatchProxy.apply(objArray, obj, o.class, "6");
       if (str != patchProxyRe) {
       }else {
          str = obj.h.getUrl();
       }
       return str;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSlideDetailContainerWrapperFragment.class, "3")) {
          return;
       }
       super.onActivityCreated(p0);
       this.k = a.k(this);
       e uoe = this.getChildFragmentManager().beginTransaction();
       LiveSlideDetailContainerFragment liveSlideDet = PatchProxy.apply(null, null, LiveSlideDetailContainerFragment.class, "1");
       if (liveSlideDet != PatchProxyResult.class) {
       }else {
          liveSlideDet = new LiveSlideDetailContainerFragment();
       }
       this.j = liveSlideDet;
       uoe.g(R.id.live_slide_container, liveSlideDet, "live_slide_detail_fragment_tag");
       uoe.m();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveSlideDetailContainerWrapperFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.c(p0, 0x7f0d0dca, p1, false);
    }
}
