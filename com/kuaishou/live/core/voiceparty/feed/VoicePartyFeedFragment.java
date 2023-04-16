package com.kuaishou.live.core.voiceparty.feed.VoicePartyFeedFragment;
import ml8.d;
import com.kuaishou.live.core.voiceparty.feed.VoicePartyFeedBaseFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.ImageButton;
import wr2.c;
import android.view.View$OnClickListener;
import wr2.b;
import zf6.k;
import com.kwai.robust.PatchProxyResult;
import wr2.f;
import java.util.Map;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import y8c.g;
import xr2.b;
import k2b.e0;
import qvb.i;
import xr2.j;

public class VoicePartyFeedFragment extends VoicePartyFeedBaseFragment implements d	// class@0014f0
{
    public ImageButton I;
    public View J;
    public static final int K;

    public void VoicePartyFeedFragment(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyFeedFragment.class, "1")) {
          return;
       }
       int i = 0x7f0a2732;
       this.I = m1.f(p0, i);
       this.J = m1.f(p0, 0x7f0a2734);
       m1.a(p0, new c(this), R.id.voice_party_tittle_container);
       m1.a(p0, new b(this), i);
       if (k.d()) {
          this.J.setVisibility(8);
       }else {
          this.J.setVisibility(0);
       }
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d16a9;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyFeedFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, VoicePartyFeedFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(VoicePartyFeedFragment.class, new f());
       }else {
          obj.put(VoicePartyFeedFragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       return 0x75f8;
    }
    public d ia(){
       Object obj = PatchProxy.apply(null, this, VoicePartyFeedFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.ia();
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, VoicePartyFeedFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = super.onCreateView(p0, p1, p2);
       this.doBindView(view);
       return view;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyFeedFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(null, this.getPage(), 0, 33);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyFeedFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j(this.G);
    }
}
