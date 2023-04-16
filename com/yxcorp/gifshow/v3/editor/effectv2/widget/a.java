package com.yxcorp.gifshow.v3.editor.effectv2.widget.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.content.Context;
import oa0.a;
import java.lang.String;
import android.content.SharedPreferences;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import v07.a;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.View;
import ag6.a;
import android.widget.TextView;
import com.yxcorp.widget.selector.view.SelectShapeImageView;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.ImageView;
import rqc.b;
import android.view.View$OnClickListener;

public class a extends RecyclerView$Adapter	// class@000f72
{
    public final Context e;
    public boolean f;

    public void a(Context p0){
       super();
       this.f = a.a.getBoolean("highlight_server_processing_dialog_checked", true);
       this.e = p0;
    }
    public boolean J0(){
       return this.f;
    }
    public int getItemCount(){
       return 1;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       a uoa1;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          uoa1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (uoa1 != PatchProxyResult.class) {
          label_0063 :
             return uoa1;
          }
       }
       View view = a.c(LayoutInflater.from(this.e), R.layout.arg_RES_7f0d05b5, p0, false);
       uoa1 = new a(view);
       SelectShapeImageView selectShapeI = view.findViewById(R.id.checkbox);
       view.findViewById(R.id.item).setText(a1.p(R.string.arg_RES_7f101bcf));
       view.findViewById(R.id.item_title).setVisibility(8);
       selectShapeI.setSelected(this.f);
       view.setOnClickListener(new b(this, selectShapeI));
       goto label_0063 ;
    }
}
