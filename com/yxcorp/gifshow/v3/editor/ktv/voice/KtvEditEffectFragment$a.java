package com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditEffectFragment$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditEffectFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditEffectFragment$b;
import java.lang.Integer;
import ppb.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.ImageView;
import java.lang.Boolean;
import mwc.p;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.ktv.voice.h;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import i2b.a;

public class KtvEditEffectFragment$a extends RecyclerView$Adapter	// class@000ff0
{
    public final KtvEditEffectFragment e;

    public void KtvEditEffectFragment$a(KtvEditEffectFragment p0){
       this.e = p0;
       super();
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, KtvEditEffectFragment$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.k.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       boolean b;
       KtvEditEffectFragment$a uoa = KtvEditEffectFragment$a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          a uoa1 = this.e.k.get(p1);
          p0.a.setImageResource(uoa1.b);
          p0.b.setText(uoa1.a);
          int i = 1;
          int i1 = 0;
          if (uoa1.c == i) {
             p0.a.setBackgroundResource(i1);
          }else {
             p0.a.setBackgroundResource(R.drawable.arg_RES_7f081f9d);
          }
          Object obj = PatchProxy.applyOneRefs(uoa1, this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(p.a() == null){
             b = false;
          }else if(uoa1.c == null){
             if (p.a().b() != uoa1.d) {
             label_007b :
                i = 0;
             }
          }else if(p.a().f() == uoa1.d){
          }
          b = i;
          p0.a.setSelected(b);
          p0.b.setSelected(b);
          KtvEditEffectFragment$b c = p0.c;
          if (!b) {
             i1 = 8;
          }
          c.setVisibility(i1);
          p0.itemView.setOnClickListener(new h(this, uoa1));
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       KtvEditEffectFragment$b uob;
       KtvEditEffectFragment$a uoa = KtvEditEffectFragment$a.class;
       if (PatchProxy.isSupport(uoa)) {
          uob = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (uob != PatchProxyResult.class) {
          label_002e :
             return uob;
          }
       }
       uob = new KtvEditEffectFragment$b(a.g(LayoutInflater.from(p0.getContext()), 0x7f0d070d, p0, false));
       goto label_002e ;
    }
}
