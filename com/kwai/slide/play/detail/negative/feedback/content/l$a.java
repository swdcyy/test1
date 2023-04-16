package com.kwai.slide.play.detail.negative.feedback.content.l$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.slide.play.detail.negative.feedback.content.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kwai.slide.play.detail.negative.feedback.content.l$a$a;
import java.lang.Integer;
import com.kwai.slide.play.detail.negative.feedback.content.h$b;
import android.graphics.drawable.Drawable;
import zf6.j;
import android.widget.ImageView;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.View$OnClickListener;
import lnc.a1;
import android.widget.TextView;
import com.kwai.slide.play.detail.negative.feedback.content.k;
import android.view.View$OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import ag6.a;

public class l$a extends RecyclerView$Adapter	// class@00183e
{
    public final h e;

    public void l$a(h p0){
       super();
       this.e = p0;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, l$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.a.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       l$a uoa = l$a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          h$b uob = this.e.a.get(p1);
          if (uob.a()) {
             p0.a.setBackground(j.j(uob.a(), 1));
          }else if(!TextUtils.isEmpty(uob.b())){
             if (uob.c()) {
                p0.a.setPlaceHolderImage(uob.c());
             }
             p0.a.L(uob.b());
          }else if(uob.c()){
             p0.a.setBackgroundResource(uob.c());
          }
          p0.a.setOnClickListener(uob.f);
          if (uob.e()) {
             p0.b.setText(a1.p(uob.e()));
          }else {
             p0.b.setText(uob.d());
          }
          if (uob.g != null) {
             p0.itemView.addOnAttachStateChangeListener(new k(this, p0));
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       l$a$a uoa$a;
       l$a uoa = l$a.class;
       if (PatchProxy.isSupport(uoa)) {
          uoa$a = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (uoa$a != PatchProxyResult.class) {
          label_002e :
             return uoa$a;
          }
       }
       uoa$a = new l$a$a(a.c(LayoutInflater.from(p0.getContext()), 0x7f0d03af, p0, false));
       goto label_002e ;
    }
}
