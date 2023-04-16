package com.kuaishou.live.common.core.component.gift.album.c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.live.common.core.component.gift.album.c$c;
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import java.lang.Number;
import rm1.f;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.LiveCustomGift;
import java.util.Collection;
import ekd.q;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.common.core.component.gift.album.c$a;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import i2b.a;
import com.kuaishou.live.common.core.component.gift.album.c$b;

public class c extends RecyclerView$Adapter	// class@001140
{
    public List e;
    public final Set f;
    public final c$c g;
    public int h;
    public int i;
    public GiftPanelItem j;
    public int k;
    public int l;

    public void c(c$c p0){
       super();
       this.e = new ArrayList();
       this.f = new HashSet();
       this.h = -1;
       this.i = -1;
       this.k = 0;
       this.l = 1;
       this.g = p0;
    }
    public final boolean J0(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (p0 >= 0 && p0 < this.e.size())? true: false;
       return b;
    }
    public int f0(int p0){
       Object obj;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "7");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       if (!this.J0(p0)) {
          return this.k;
       }else {
          c tj = this.j;
          obj = PatchProxy.applyOneRefs(tj, null, f.class, "13");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(tj != null && tj.isCustomGift()){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             b = this.j.getCustomGift().getState();
             if (!b || b == 2) {
                return this.l;
             }
          }
          return this.k;
       }
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (q.f(this.e))? 0: this.e.size();
       return i;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && (!PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "2") && this.J0(p1))) {
          p0.a(p1);
          if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "3")) {
             uoc = this.h;
             if (p1 == uoc) {
                p0.b(this.e.get(p1), p1, false);
                this.i = this.h;
                this.h = -1;
                p0.d.setVisibility(false);
             }else if(uoc != -1){
                p0.d.setVisibility(8);
                p0.itemView.setSelected(false);
             }else if(p1 == this.i){
                p0.d.setVisibility(false);
             }else {
                p0.d.setVisibility(8);
                p0.itemView.setSelected(false);
             }
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       c$b uob;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          uob = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1");
          if (uob != PatchProxyResult.class) {
          }else {
          label_0019 :
             View view = a.d(p0.getContext(), R.layout.arg_RES_7f0d0b19, p0, false);
             uob = (p1 == this.l)? new c$b(this, view, f.i(this.j)): new c$a(this, view);
          }
       }else {
          goto label_0019 ;
       }
       return uob;
    }
}
