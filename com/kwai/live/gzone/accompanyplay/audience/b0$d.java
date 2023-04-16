package com.kwai.live.gzone.accompanyplay.audience.b0$d;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.ArrayList;
import com.kwai.live.gzone.accompanyplay.audience.b0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import java.lang.Math;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kwai.live.gzone.accompanyplay.audience.b0$e;
import java.lang.Integer;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.View$OnClickListener;
import android.view.View;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.model.CDNUrl;
import k37.s;
import android.view.ViewGroup;
import com.yxcorp.gifshow.widget.density.KwaiFixedSimpleDraweeView;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.utility.n;
import android.widget.ImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;

public class b0$d extends RecyclerView$Adapter	// class@000b6b
{
    public b0$c e;
    public List f;
    public int g;
    public k0$g h;

    public void b0$d(){
       super();
       this.f = new ArrayList();
    }
    public void b0$d(b0$a p0){
       super();
       this.f = new ArrayList();
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, b0$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Math.max(this.f.size(), this.g);
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       b0$d uod = b0$d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "2")) {
          if (p1 >= this.f.size()) {
             p0.itemView.L(null);
             p0.itemView.setOnClickListener(null);
             p0.itemView.setPlaceHolderImage(R.drawable.arg_RES_7f081204);
          }else {
             User user = this.f.get(p1);
             p0.itemView.U(user.mAvatars);
             p0.itemView.setPlaceHolderImage(R.drawable.detail_avatar_secret);
             p0.itemView.setOnClickListener(new s(this, p1, user));
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       b0$e uoe;
       b0$d uod = b0$d.class;
       if (PatchProxy.isSupport(uod)) {
          uoe = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uod, "1");
          if (uoe != PatchProxyResult.class) {
          label_005f :
             return uoe;
          }
       }
       KwaiFixedSimpleDraweeView kwaiFixedSim = new KwaiFixedSimpleDraweeView(p0.getContext());
       kwaiFixedSim.setPlaceHolderImage(R.drawable.arg_RES_7f081204);
       kwaiFixedSim.setLayoutParams(new ViewGroup$LayoutParams(n.c(p0.getContext(), 40.00f), n.c(p0.getContext(), 40.00f)));
       kwaiFixedSim.getHierarchy().L(RoundingParams.a());
       kwaiFixedSim.getHierarchy().x(0);
       uoe = new b0$e(kwaiFixedSim);
       goto label_005f ;
    }
}
