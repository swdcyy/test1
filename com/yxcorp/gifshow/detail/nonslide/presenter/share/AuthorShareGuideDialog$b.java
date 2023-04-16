package com.yxcorp.gifshow.detail.nonslide.presenter.share.AuthorShareGuideDialog$b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.AuthorShareGuideDialog;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.AuthorShareGuideDialog$c;
import java.lang.Integer;
import java.util.Objects;
import android.widget.ImageView;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.AuthorShareGuideDialog$a;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.AuthorShareGuideDialog$PlatformAdapter$onBindViewHolder$1;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$LayoutParams;

public final class AuthorShareGuideDialog$b extends RecyclerView$Adapter	// class@0015d2
{
    public final List e;
    public final AuthorShareGuideDialog f;

    public void AuthorShareGuideDialog$b(AuthorShareGuideDialog p0,List p1){
       a.p(p1, "platforms");
       this.f = p0;
       super();
       this.e = p1;
    }
    public final List J0(){
       return this.e;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, AuthorShareGuideDialog$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Math.min(4, this.e.size());
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       AuthorShareGuideDialog$b uob = AuthorShareGuideDialog$b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "3")) {
          a.p(p0, "holder");
          p0 = p0.itemView;
          Objects.requireNonNull(p0, "null cannot be cast to non-null type android.widget.ImageView");
          p0.setImageResource(this.e.get(p1).a);
          p0.setOnClickListener(new AuthorShareGuideDialog$PlatformAdapter$onBindViewHolder$1(this, p1));
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       AuthorShareGuideDialog$c uoc;
       AuthorShareGuideDialog$b uob = AuthorShareGuideDialog$b.class;
       if (PatchProxy.isSupport(uob)) {
          uoc = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (uoc != PatchProxyResult.class) {
          label_003b :
             return uoc;
          }
       }
       a.p(p0, "parent");
       ImageView imageView = new ImageView(p0.getContext());
       imageView.setLayoutParams(new RecyclerView$LayoutParams(a1.e(40.00f), a1.e(40.00f)));
       uoc = new AuthorShareGuideDialog$c(imageView);
       goto label_003b ;
    }
}
