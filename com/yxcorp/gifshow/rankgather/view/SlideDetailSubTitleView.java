package com.yxcorp.gifshow.rankgather.view.SlideDetailSubTitleView;
import android.widget.LinearLayout;
import android.content.Context;
import com.yxcorp.gifshow.rankgather.view.SlideDetailSubTitleView$a;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;

public class SlideDetailSubTitleView extends LinearLayout	// class@0016f0
{
    public TextView b;
    public TextView c;
    public KwaiImageView d;
    public View e;
    public final SlideDetailSubTitleView$a f;

    public void SlideDetailSubTitleView(Context p0){
       super(p0);
       this.f = new SlideDetailSubTitleView$a(this);
       this.a(p0);
    }
    public void SlideDetailSubTitleView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.f = new SlideDetailSubTitleView$a(this);
       this.a(p0);
    }
    public void SlideDetailSubTitleView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = new SlideDetailSubTitleView$a(this);
       this.a(p0);
    }
    public final void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideDetailSubTitleView.class, "1")) {
          return;
       }
       this.setOrientation(0);
       a.c(LayoutInflater.from(p0), R.layout.arg_RES_7f0d08b3, this, true);
       this.b = this.findViewById(0x7f0a1738);
       this.c = this.findViewById(0x7f0a3668);
       this.d = this.findViewById(0x7f0a3653);
       this.e = this.findViewById(0x7f0a0bdd);
       return;
    }
    public SlideDetailSubTitleView$a getBuilder(){
       return this.f;
    }
}
