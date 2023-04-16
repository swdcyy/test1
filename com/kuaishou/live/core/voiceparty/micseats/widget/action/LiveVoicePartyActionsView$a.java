package com.kuaishou.live.core.voiceparty.micseats.widget.action.LiveVoicePartyActionsView$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.live.core.voiceparty.micseats.widget.action.LiveVoicePartyActionsView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import ot2.a;
import java.lang.Integer;
import java.util.Map;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyActionButtonResponse$ButtonData;
import ot2.h;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.FrameLayout;
import android.view.LayoutInflater;

public class LiveVoicePartyActionsView$a extends RecyclerView$Adapter	// class@001783
{
    public final LiveVoicePartyActionsView e;

    public void LiveVoicePartyActionsView$a(LiveVoicePartyActionsView p0){
       this.e = p0;
       super();
    }
    public int f0(int p0){
       if (this.e.p != null) {
          return 0x134820f;
       }
       return 0x1347e14;
    }
    public int getItemCount(){
       LiveVoicePartyActionsView$a obj = PatchProxy.apply(null, this, LiveVoicePartyActionsView$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.e;
       if (obj.p == null) {
          return 3;
       }
       LiveVoicePartyActionsView j = obj.j;
       int i = (j == null)? 0: j.size();
       return i;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       LiveVoicePartyActionsView$a uoa = LiveVoicePartyActionsView$a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          uoa = this.e;
          h oh = null;
          if (uoa.p != null) {
             int i = uoa.j.get(p1).intValue();
             LiveVoicePartyActionButtonResponse$ButtonData uButtonData = this.e.k.get(Integer.valueOf(i));
             p0.a(uButtonData);
             if (uButtonData != null && uButtonData.isEnabled != null) {
                p0.itemView.setOnClickListener(new h(this, i));
             }else {
                p0.itemView.setOnClickListener(oh);
             }
          }else {
             p0.a(oh);
             p0.itemView.setOnClickListener(oh);
          }
          RecyclerView$LayoutParams layoutParams = p0.itemView.getLayoutParams();
          if (layoutParams != null) {
             if (!p1) {
                LiveVoicePartyActionsView$a te = this.e;
                layoutParams.setMargins(te.e, 0, te.f, 0);
             }else if(p1 == (this.getItemCount() - 1)){
                layoutParams.setMargins(0, 0, this.e.e, 0);
             }else {
                layoutParams.setMargins(0, 0, this.e.f, 0);
             }
             p0.itemView.setLayoutParams(layoutParams);
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       a uoa1;
       LiveVoicePartyActionsView$a uoa = LiveVoicePartyActionsView$a.class;
       if (PatchProxy.isSupport(uoa)) {
          uoa1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (uoa1 != PatchProxyResult.class) {
          label_003f :
             return uoa1;
          }
       }
       View view = LayoutInflater.from(this.e.getContext()).inflate(R.layout.arg_RES_7f0d0e2e, null);
       uoa = this.e;
       view.setLayoutParams(new RecyclerView$LayoutParams(uoa.g, uoa.h));
       uoa1 = new a(view);
       goto label_003f ;
    }
}
