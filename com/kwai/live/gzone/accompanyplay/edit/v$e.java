package com.kwai.live.gzone.accompanyplay.edit.v$e;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.live.gzone.accompanyplay.edit.v$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kwai.live.gzone.accompanyplay.edit.v$f;
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

public class v$e extends RecyclerView$Adapter	// class@000c1e
{
    public List e;

    public void v$e(){
       super();
    }
    public void v$e(v$a p0){
       super();
    }
    public int getItemCount(){
       v$e obj = PatchProxy.apply(null, this, v$e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.e;
       int i = (obj == null)? 0: obj.size();
       return i;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       v$e uoe = v$e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "2")) {
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
       v$f uof;
       v$e uoe = v$e.class;
       if (PatchProxy.isSupport(uoe)) {
          uof = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1");
          if (uof != PatchProxyResult.class) {
          label_002e :
             return uof;
          }
       }
       uof = new v$f(a.c(LayoutInflater.from(p0.getContext()), 0x7f0d099f, p0, false));
       goto label_002e ;
    }
}
