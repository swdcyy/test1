package com.yxcorp.gifshow.v3.editor.magicfinger.i;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.magicfinger.model.MagicFingerItem;
import java.lang.Object;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.magicfinger.i$d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.magicfinger.i$c;
import android.widget.TextView;
import lnc.a1;
import java.io.File;
import android.os.Build$VERSION;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.v3.editor.magicfinger.i$a;
import android.view.View$OnClickListener;
import android.view.View;
import android.graphics.Typeface;
import android.animation.Animator;
import ekd.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewGroup;
import android.content.Context;
import i2b.a;

public class i extends RecyclerView$Adapter	// class@001036
{
    public List e;
    public Bitmap f;
    public int g;
    public boolean h;
    public i$b i;
    public static final List j;

    static {
       ArrayList uArrayList = new ArrayList();
       i.j = uArrayList;
       uArrayList.add(MagicFingerItem.filter_prism);
       uArrayList.add(MagicFingerItem.filter_lips);
       uArrayList.add(MagicFingerItem.filter_fire);
       uArrayList.add(MagicFingerItem.filter_rich);
       uArrayList.add(MagicFingerItem.filter_ballon);
       uArrayList.add(MagicFingerItem.filter_stick);
       uArrayList.add(MagicFingerItem.filter_ice);
       uArrayList.add(MagicFingerItem.filter_heart);
       uArrayList.add(MagicFingerItem.filter_shower);
       uArrayList.add(MagicFingerItem.filter_lotus);
       uArrayList.add(MagicFingerItem.filter_rain);
       uArrayList.add(MagicFingerItem.filter_celebration);
    }
    public void i(){
       super();
       this.g = -1;
       this.e = i.j;
    }
    public void J0(i$d p0,int p1){
       int i;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oi, "2")) {
          return;
       }
       MagicFingerItem magicFingerI = this.e.get(p1);
       p0.e.setText(magicFingerI.mFilterItemInfo.a);
       i = a1.d(R.dimen.arg_RES_7f07031d);
       File uFile = new File(magicFingerI.mFilterItemInfo.b);
       if (Build$VERSION.SDK_INT <= 22) {
          p0.a.v(uFile, i, i);
       }else {
          p0.a.x(uFile, i, i);
       }
       p0.b.setForegroundDrawable(new ColorDrawable(a1.a(R.color.arg_RES_7f062049)));
       p0.b.setImageBitmap(this.f);
       this.K0(p0, p1);
       p0.itemView.setOnClickListener(new i$a(this, p1, magicFingerI));
       return;
    }
    public final void K0(i$d p0,int p1){
       int i;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oi, "7")) {
          return;
       }
       i = 0;
       if (this.g == p1) {
          p0.itemView.setSelected(true);
          p0.c.setVisibility(i);
          p0.d.setVisibility(i);
          p0.e.setTypeface(Typeface.DEFAULT_BOLD);
          if (this.h == null) {
             this.h = true;
             f.m(p0.itemView);
          }
       }else {
          p0.c.setVisibility(4);
          p0.d.setVisibility(4);
          p0.e.setTypeface(Typeface.DEFAULT);
          p0.itemView.setSelected(i);
          p0.itemView.clearAnimation();
       }
       return;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       this.J0(p0, p1);
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       i$d uod;
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          uod = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oi, "1");
          if (uod != PatchProxyResult.class) {
          label_002a :
             return uod;
          }
       }
       uod = new i$d(a.d(p0.getContext(), 0x7f0d0931, p0, false));
       goto label_002a ;
    }
}
