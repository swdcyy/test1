package com.kwai.live.gzone.accompanyplay.LiveGzoneAccompanyFleetWaitingMembersFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import io.reactivex.subjects.PublishSubject;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.kwai.live.gzone.accompanyplay.LiveGzoneAccompanyFleetWaitingMembersFragment$b;
import nkc.a;
import android.view.ViewGroup;
import nkc.d;
import java.lang.Boolean;
import java.util.Map;
import android.content.res.Configuration;
import java.util.Objects;
import g37.c;
import com.kwai.library.widget.popup.common.c;
import com.kwai.live.gzone.widget.e;
import crd.b;
import lnc.b9;
import android.os.Bundle;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import d61.y;
import g37.a;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.LiveGzoneAccompanyFleetWaitingMembersFragment$a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import brd.t;
import y8c.g;
import com.kwai.live.gzone.accompanyplay.a;
import k37.p1;
import j47.c;
import qvb.i;
import g37.b;
import fq5.b;

public class LiveGzoneAccompanyFleetWaitingMembersFragment extends RecyclerFragment	// class@000aeb
{
    public PublishSubject F;
    public b G;
    public p1 H;
    public String I;
    public String J;
    public ClientContent$LiveStreamPackage K;
    public String L;
    public c M;

    public void LiveGzoneAccompanyFleetWaitingMembersFragment(){
       super();
       this.F = PublishSubject.g();
    }
    public t Bh(){
       View obj = PatchProxy.apply(null, this, LiveGzoneAccompanyFleetWaitingMembersFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getView();
       if (obj == null) {
          return super.Bh();
       }
       return new LiveGzoneAccompanyFleetWaitingMembersFragment$b(this, new a(obj.findViewById(0x7f0a3f11)));
    }
    public final void Gh(boolean p0){
       if (PatchProxy.isSupport(LiveGzoneAccompanyFleetWaitingMembersFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveGzoneAccompanyFleetWaitingMembersFragment.class, "2")) {
          return;
       }
       View view = this.getView().findViewById(R.id.accompany_waiting_members_container);
       int i = (p0)? 0x7f080215: 0x7f080214;
       view.setBackgroundResource(i);
       return;
    }
    public boolean S1(){
       return false;
    }
    public int getLayoutResId(){
       return 0x7f0d0b5e;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAccompanyFleetWaitingMembersFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveGzoneAccompanyFleetWaitingMembersFragment.class, null);
       return objectsByTag;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAccompanyFleetWaitingMembersFragment.class, "6")) {
          return;
       }
       super.onConfigurationChanged(p0);
       boolean b = (p0.orientation == 2)? true: false;
       this.Gh(b);
       LiveGzoneAccompanyFleetWaitingMembersFragment tM = this.M;
       Objects.requireNonNull(tM);
       if (!PatchProxy.applyVoidOneRefs(p0, tM, c.class, "2")) {
          tM.h0(tM.f);
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAccompanyFleetWaitingMembersFragment.class, "7")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.G);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneAccompanyFleetWaitingMembersFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.Gh(y.d(this.getActivity()));
       p0.findViewById(R.id.popup_close).setOnClickListener(new a(this));
       this.G = this.F.subscribe(new LiveGzoneAccompanyFleetWaitingMembersFragment$a(this), Functions.d());
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneAccompanyFleetWaitingMembersFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.F, this.H.h);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneAccompanyFleetWaitingMembersFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(this.H.a.getLiveStreamId());
    }
}
