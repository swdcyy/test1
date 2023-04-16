package com.yxcorp.gifshow.music.cloudmusic.common.category.CategoryOptPresenter$b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.music.cloudmusic.common.category.CategoryOptPresenter$c;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.music.cloudmusic.common.category.CategoryOptPresenter$b$a;
import java.lang.Integer;
import com.yxcorp.gifshow.music.network.model.response.Channel;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.net.Uri;
import ekd.x0;
import jd.c;
import ub.b;
import com.yxcorp.gifshow.music.cloudmusic.common.category.a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.content.Context;
import android.view.View;
import i2b.a;

public class CategoryOptPresenter$b extends RecyclerView$Adapter	// class@002009
{
    public final List e;
    public final CategoryOptPresenter$c f;

    public void CategoryOptPresenter$b(CategoryOptPresenter$c p0){
       super();
       this.e = new ArrayList();
       this.f = p0;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, CategoryOptPresenter$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       CategoryOptPresenter$b uob = CategoryOptPresenter$b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "3")) {
          Channel uChannel = this.e.get(p1);
          Channel mIconUrls = uChannel.mIconUrls;
          if (mIconUrls != null && mIconUrls.length > 0) {
             p0.b.U(mIconUrls);
          }else {
             Uri uri = x0.f(uChannel.mIcon);
             if (uri != null) {
                p0.b.H(uri, null, null);
             }
          }
          p0.b.setOnClickListener(new a(this, uChannel));
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       CategoryOptPresenter$b$a uob$a;
       CategoryOptPresenter$b uob = CategoryOptPresenter$b.class;
       if (PatchProxy.isSupport(uob)) {
          uob$a = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "2");
          if (uob$a != PatchProxyResult.class) {
          label_0029 :
             return uob$a;
          }
       }
       uob$a = new CategoryOptPresenter$b$a(a.a(p0.getContext(), 0x7f0d1018));
       goto label_0029 ;
    }
}
