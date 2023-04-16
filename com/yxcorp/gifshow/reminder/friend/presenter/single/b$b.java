package com.yxcorp.gifshow.reminder.friend.presenter.single.b$b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import z1.a;
import com.yxcorp.gifshow.reminder.friend.presenter.single.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.reminder.friend.presenter.single.b$c;
import java.lang.Integer;
import com.kwai.social.startup.reminder.model.FriendTabStartupConfig$a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.gifshow.reminder.friend.presenter.single.c;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import i2b.a;

public final class b$b extends RecyclerView$Adapter	// class@001ad6
{
    public final List e;
    public final a f;

    public void b$b(List p0,a p1,b$a p2){
       super();
       this.e = p0;
       this.f = p1;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, b$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       b$b uob = b$b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "3")) {
          FriendTabStartupConfig$a uoa = this.e.get(p1);
          p0.a.L(uoa.mEntranceLightIcon);
          p0.b.setText(uoa.mEntranceItemName);
          p0.itemView.setOnClickListener(new c(this, uoa));
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       b$c uoc;
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob)) {
          uoc = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "2");
          if (uoc != PatchProxyResult.class) {
          label_0025 :
             return uoc;
          }
       }
       uoc = new b$c(a.i(p0, 0x7f0d1097));
       goto label_0025 ;
    }
}
