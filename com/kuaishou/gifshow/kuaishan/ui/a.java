package com.kuaishou.gifshow.kuaishan.ui.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.content.Context;
import java.lang.String;
import oa0.a;
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
import java.lang.CharSequence;
import android.text.TextUtils;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import m90.b;
import android.view.View$OnClickListener;
import m90.a;

public class a extends RecyclerView$Adapter	// class@001aab
{
    public final Context e;
    public final String f;
    public final String g;
    public boolean h;

    public void a(Context p0,String p1,String p2){
       super();
       this.h = a.a.getBoolean("asset_server_processing_dialog_checked", true);
       this.e = p0;
       this.f = p1;
       this.g = p2;
    }
    public boolean J0(){
       return this.h;
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
          uoa1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2");
          if (uoa1 != PatchProxyResult.class) {
          label_00b9 :
             return uoa1;
          }
       }
       boolean b = false;
       View view = a.c(LayoutInflater.from(this.e), R.layout.arg_RES_7f0d071f, p0, b);
       uoa1 = new a(view);
       TextView textView = view.findViewById(R.id.item);
       TextView textView1 = view.findViewById(R.id.item_title);
       SelectShapeImageView selectShapeI = view.findViewById(R.id.checkbox);
       if (TextUtils.isEmpty(this.f) || TextUtils.isEmpty(this.g)) {
          textView.setText(a1.p(R.string.arg_RES_7f101bcf));
          textView1.setVisibility(8);
       }else {
          this.h = a.a.getBoolean("asset_face_change_dialog_checked", b);
          textView.setText(a1.p(R.string.arg_RES_7f10013f));
          selectShapeI.getLayoutParams().height = a1.d(0x7f0702cc);
          selectShapeI.getLayoutParams().width = a1.d(0x7f0702cc);
          textView1.setVisibility(b);
          textView1.setText(this.f);
          textView1.setOnClickListener(new b(this));
          textView1.setTextSize(13.00f);
          textView.setTextSize(13.00f);
       }
       selectShapeI.setSelected(this.h);
       view.setOnClickListener(new a(this, selectShapeI));
       goto label_00b9 ;
    }
}
