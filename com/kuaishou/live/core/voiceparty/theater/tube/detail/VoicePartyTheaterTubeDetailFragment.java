package com.kuaishou.live.core.voiceparty.theater.tube.detail.VoicePartyTheaterTubeDetailFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.String;
import java.lang.Class;
import java.lang.StringBuilder;
import com.kuaishou.live.core.voiceparty.theater.tube.detail.VoicePartyTheaterTubeDetailFragment$a;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import y8c.t;
import dx2.o;
import lnc.a1;
import com.kuaishou.live.core.voiceparty.theater.tube.detail.VoicePartyTheaterTubeDetailFragment$d;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import ex2.a;
import android.view.View$OnClickListener;
import ex2.b;
import java.util.Map;
import dx2.p;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import java.lang.CharSequence;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import ex2.d;
import androidx.recyclerview.widget.RecyclerView$n;
import y8c.g;
import com.kuaishou.live.core.voiceparty.theater.tube.detail.VoicePartyTheaterTubeDetailFragment$b;
import qvb.i;
import com.kuaishou.live.core.voiceparty.theater.tube.detail.VoicePartyTheaterTubeDetailFragment$c;

public class VoicePartyTheaterTubeDetailFragment extends RecyclerFragment implements d	// class@001a08
{
    public p F;
    public String G;
    public String H;
    public int I;
    public VoicePartyTheaterTubeDetailFragment$d J;
    public TextView K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;

    static {
       String name = VoicePartyTheaterTubeDetailFragment.class.getName();
       VoicePartyTheaterTubeDetailFragment.L = name;
       StringBuilder str = name+"_tube_id";
       VoicePartyTheaterTubeDetailFragment.M = str;
       StringBuilder str1 = str;
       VoicePartyTheaterTubeDetailFragment.N = str1+"_tube_name";
       str = name;
       VoicePartyTheaterTubeDetailFragment.O = str+"_tube_type";
    }
    public void VoicePartyTheaterTubeDetailFragment(){
       super();
       this.J = new VoicePartyTheaterTubeDetailFragment$a(this);
    }
    public static VoicePartyTheaterTubeDetailFragment Gh(String p0,String p1,int p2){
       Bundle obj;
       if (PatchProxy.isSupport(VoicePartyTheaterTubeDetailFragment.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, VoicePartyTheaterTubeDetailFragment.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Bundle();
       obj.putString(VoicePartyTheaterTubeDetailFragment.M, p0);
       obj.putString(VoicePartyTheaterTubeDetailFragment.N, p1);
       obj.putInt(VoicePartyTheaterTubeDetailFragment.O, p2);
       VoicePartyTheaterTubeDetailFragment voicePartyTh = new VoicePartyTheaterTubeDetailFragment();
       voicePartyTh.setArguments(obj);
       return voicePartyTh;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTheaterTubeDetailFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new o(this, 0x7f0814f6, a1.p(0x7f102d0b), true);
    }
    public void Hh(VoicePartyTheaterTubeDetailFragment$d p0){
       this.J = p0;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterTubeDetailFragment.class, "3")) {
          return;
       }
       this.K = m1.f(p0, 0x7f0a40ae);
       m1.a(p0, new a(this), R.id.back_btn);
       m1.a(p0, new b(this), R.id.tube_play_all);
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d16e8;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyTheaterTubeDetailFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(VoicePartyTheaterTubeDetailFragment.class, null);
       return objectsByTag;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterTubeDetailFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.F = p.c(this);
       this.G = this.requireArguments().getString(VoicePartyTheaterTubeDetailFragment.M);
       this.H = this.requireArguments().getString(VoicePartyTheaterTubeDetailFragment.N);
       this.I = this.requireArguments().getInt(VoicePartyTheaterTubeDetailFragment.O);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTheaterTubeDetailFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       this.K.setText(this.H);
       boolean b = false;
       int i = 1;
       if (this.I == i) {
          this.h0().setLayoutManager(new GridLayoutManager(this.getContext(), 3, i, b));
       }else {
          this.h0().setLayoutManager(new GridLayoutManager(this.getContext(), 2, i, b));
       }
       this.h0().addItemDecoration(new d(a1.e(8.00f), a1.e(4.00f), a1.e(4.00f)));
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTheaterTubeDetailFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new VoicePartyTheaterTubeDetailFragment$b(this);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTheaterTubeDetailFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new VoicePartyTheaterTubeDetailFragment$c(this);
    }
}
