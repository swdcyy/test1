package com.yxcorp.gifshow.prettify.makeup.n;
import com.yxcorp.gifshow.prettify.makeup.a;
import p0c.f;
import n1c.l;
import hka.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.prettify.makeup.a$b;
import java.lang.Integer;
import g9c.a;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupPart;
import android.view.View;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.CharSequence;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupItem;
import android.widget.ImageView;
import android.graphics.Typeface;
import f1c.m0;
import android.view.View$OnClickListener;

public class n extends a	// class@00118f
{
    public MakeupSuite j;
    public int k;
    public l l;

    public void n(f p0,l p1,h p2){
       super(p0, p2);
       this.l = p1;
    }
    public int Z0(){
       Object obj = PatchProxy.apply(null, this, n.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.i.d;
    }
    public void g1(MakeupSuite p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "5")) {
          return;
       }
       this.j = p0;
       int i = (p0.inPresetState(this.i.a()))? 0: -1;
       this.k = i;
       this.k0();
       return;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       n on = n.class;
       if (!PatchProxy.isSupport(on) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, on, "2")) {
          MakeupPart makeupPart = this.N0(p1);
          if (makeupPart != null) {
             this.l.d(p0.itemView);
             if (makeupPart.isNull()) {
                p0.d.setText(R.string.arg_RES_7f1039a6);
                p0.b.setImageResource(R.drawable.arg_RES_7f081d29);
             }else if(makeupPart.isPreset()){
                p0.d.setText(R.string.arg_RES_7f104fba);
                p0.b.setImageResource(R.drawable.arg_RES_7f0816dc);
             }else {
                p0.d.setText(makeupPart.mName);
                MakeupPart makeupPart1 = PatchProxy.applyOneRefs(makeupPart, this, on, "3");
                if (makeupPart1 != PatchProxyResult.class) {
                }else {
                   on = this.j;
                   makeupPart1 = (MakeupItem.isValid(on) && on.partInPresetState(makeupPart, this.i.a()))? makeupPart.mSelectedImageUrls: makeupPart.mImageUrls;
                }
                this.d1(p0.b, makeupPart1);
             }
             boolean b = (p1 == this.k)? true: false;
             p0.b.setSelected(b);
             p0.d.setSelected(b);
             p0.d.setTypeface(null, b);
             a$b c = p0.c;
             if (c != null) {
                c.setSelected(b);
             }
             p0.itemView.setOnClickListener(new m0(this, p1, makeupPart));
          }
       }
       return;
    }
}
