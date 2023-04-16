package com.yxcorp.gifshow.v3.mixed.editor.frame.b;
import g9c.a;
import com.yxcorp.gifshow.v3.mixed.editor.frame.MixFrameAdjustInfo;
import java.lang.Iterable;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Collection;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.v3.mixed.editor.frame.b$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.view.View;
import com.yxcorp.gifshow.v3.mixed.editor.frame.a;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import lnc.a1;
import android.view.LayoutInflater;
import i2b.a;

public class b extends a	// class@001550
{
    public b$b g;

    public void b(){
       super();
       this.L0(Lists.c(MixFrameAdjustInfo.PRESET_LIST));
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       b$a b;
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "2")) {
          MixFrameAdjustInfo mixFrameAdju = this.e.get(p1);
          ViewGroup$LayoutParams layoutParams = p0.a.getLayoutParams();
          layoutParams.width = mixFrameAdju.mIconWidth;
          layoutParams.height = mixFrameAdju.mIconHeight;
          p0.a.setLayoutParams(layoutParams);
          p0.c.setText(mixFrameAdju.mNameRes);
          MixFrameAdjustInfo mIsSelected = mixFrameAdju.mIsSelected;
          p0.b.setSelected(mIsSelected);
          p0.c.setSelected(mIsSelected);
          b = p0.b;
          int i = (mIsSelected != null)? 0: 4;
          b.setVisibility(i);
          p0.itemView.setOnClickListener(new a(this, mixFrameAdju));
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       b$a uoa;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (uoa != PatchProxyResult.class) {
          label_002e :
             return uoa;
          }
       }
       uoa = new b$a(a.g(LayoutInflater.from(a1.c()), 0x7f0d0521, p0, false));
       goto label_002e ;
    }
}
