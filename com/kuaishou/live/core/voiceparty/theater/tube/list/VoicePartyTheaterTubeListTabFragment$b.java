package com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import mrd.a;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$b$a;
import erd.g;
import crd.b;
import brd.t;
import java.lang.IllegalArgumentException;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeChannel;
import android.view.View;
import android.widget.Button;
import java.lang.CharSequence;
import android.view.ViewGroup;
import android.content.Context;
import i2b.a;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$b$b;

public final class VoicePartyTheaterTubeListTabFragment$b extends RecyclerView$Adapter	// class@001a1b
{
    public int e;
    public final List f;
    public final int g;
    public final l h;

    public void VoicePartyTheaterTubeListTabFragment$b(List p0,int p1,a p2,l p3){
       a.p(p0, "channels");
       a.p(p2, "selectedBehavior");
       a.p(p3, "selectedListener");
       super();
       this.f = p0;
       this.g = p1;
       this.h = p3;
       this.e = -1;
       VoicePartyTheaterTubeListTabFragment$b$a uob$a = (p1 >= 0 && p1 < p0.size())? 1: null;
       if (uob$a) {
          p2.subscribe(new VoicePartyTheaterTubeListTabFragment$b$a(this));
          return;
       }else {
          throw new IllegalArgumentException("Failed requirement.".toString());
       }
    }
    public static boolean K0(VoicePartyTheaterTubeListTabFragment$b p0,int p1,boolean p2,int p3,Object p4){
       boolean b = true;
       if (p3 & 0x02) {
          p2 = true;
       }
       Objects.requireNonNull(p0);
       VoicePartyTheaterTubeListTabFragment$b uob = VoicePartyTheaterTubeListTabFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p1), Boolean.valueOf(p2), p0, uob, "6");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
          label_002a :
             uob = p0.e;
             if (uob == p1) {
                b = false;
             }else {
                p0.e = p1;
                if (p2) {
                   if (uob >= null) {
                      p0.l0(uob);
                   }
                   if (p1 >= 0) {
                      p0.l0(p1);
                   }
                }
             }
          }
       }else {
          goto label_002a ;
       }
       return b;
    }
    public final int J0(int p0){
       return (p0 + this.g);
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTheaterTubeListTabFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.f.size() - this.g);
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       VoicePartyTheaterTubeChannel voicePartyTh1;
       VoicePartyTheaterTubeListTabFragment$b uob = VoicePartyTheaterTubeListTabFragment$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "3")) {
          return;
       }
       a.p(p0, "holder");
       VoicePartyTheaterTubeChannel voicePartyTh = null;
       if (PatchProxy.isSupport(uob)) {
          voicePartyTh1 = PatchProxy.applyOneRefs(Integer.valueOf(p1), this, uob, "4");
          if (voicePartyTh1 != PatchProxyResult.class) {
          }else {
          label_0032 :
             int i = this.J0(p1);
             voicePartyTh1 = (i >= 0 && i < this.f.size())? this.f.get(i): voicePartyTh;
          }
       }else {
          goto label_0032 ;
       }
       RecyclerView$ViewHolder itemView = p0.itemView;
       a.o(itemView, "holder.itemView");
       boolean b = (this.e == p1)? true: false;
       itemView.setSelected(b);
       p0 = p0.itemView;
       Objects.requireNonNull(p0, "null cannot be cast to non-null type android.widget.Button");
       if (voicePartyTh1 != null) {
          voicePartyTh = voicePartyTh1.mName;
       }
       p0.setText(voicePartyTh);
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       VoicePartyTheaterTubeListTabFragment$b uob = VoicePartyTheaterTubeListTabFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "parent");
       View view = a.d(p0.getContext(), R.layout.arg_RES_7f0d16eb, p0, false);
       a.o(view, "itemView");
       return new VoicePartyTheaterTubeListTabFragment$b$b(this, view);
    }
}
