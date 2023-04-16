package com.kwai.live.gzone.accompanyplay.edit.a0$g;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.live.gzone.accompanyplay.edit.a0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kwai.live.gzone.accompanyplay.edit.a0$h;
import java.lang.Integer;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyJsonInfoItem;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import ag6.a;

public class a0$g extends RecyclerView$Adapter	// class@000bd6
{
    public List e;

    public void a0$g(){
       super();
    }
    public void a0$g(a0$a p0){
       super();
    }
    public int getItemCount(){
       a0$g obj = PatchProxy.apply(null, this, a0$g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.e;
       int i = (obj == null)? 0: obj.size();
       return i;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       a0$g og = a0$g.class;
       if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, og, "2")) {
          LiveGzoneAccompanyJsonInfoItem liveGzoneAcc = this.e.get(p1);
          if (TextUtils.x(liveGzoneAcc.mTitle)) {
             p0.a.setVisibility(8);
          }else {
             p0.a.setVisibility(0);
             p0.a.setText(liveGzoneAcc.mTitle);
          }
          if (TextUtils.x(liveGzoneAcc.mContent)) {
             p0.b.setVisibility(8);
          }else {
             p0.b.setVisibility(0);
             p0.b.setText(liveGzoneAcc.mContent);
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       a0$h oh;
       a0$g og = a0$g.class;
       if (PatchProxy.isSupport(og)) {
          oh = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, og, "1");
          if (oh != PatchProxyResult.class) {
          label_002e :
             return oh;
          }
       }
       oh = new a0$h(a.c(LayoutInflater.from(p0.getContext()), 0x7f0d099f, p0, false));
       goto label_002e ;
    }
}
