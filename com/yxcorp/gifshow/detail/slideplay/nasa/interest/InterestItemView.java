package com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestItemView;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestSeekBar;
import android.widget.SeekBar;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestItemView$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestSeekBar$b;
import android.util.AttributeSet;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementV3Meta;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestItemView$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class InterestItemView extends FrameLayout	// class@001736
{
    public InterestSeekBar b;
    public KwaiImageView c;
    public TextView d;
    public TextView e;
    public InterestManagementV3Meta$InterestV3Entity f;
    public InterestManagementV3Meta g;
    public InterestItemView$b h;

    public void InterestItemView(Context p0){
       a.p(p0, "context");
       super(p0);
       a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d0634, this, true);
       View view = this.findViewById(R.id.interest_item_progress);
       a.o(view, "findViewById\(R.id.interest_item_progress\)");
       this.b = view;
       view.setPadding(0, 0, 0, 0);
       this.b.setSaveEnabled(0);
       view = this.findViewById(R.id.interest_item_icon);
       a.o(view, "findViewById\(R.id.interest_item_icon\)");
       this.c = view;
       view = this.findViewById(R.id.interest_item_name);
       a.o(view, "findViewById\(R.id.interest_item_name\)");
       this.d = view;
       view = this.findViewById(R.id.interest_item_weight);
       a.o(view, "findViewById\(R.id.interest_item_weight\)");
       this.e = view;
       this.b.setSeekBarChangeListener(new InterestItemView$a(this));
    }
    public void InterestItemView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d0634, this, true);
       View view = this.findViewById(R.id.interest_item_progress);
       a.o(view, "findViewById\(R.id.interest_item_progress\)");
       this.b = view;
       view.setPadding(0, 0, 0, 0);
       this.b.setSaveEnabled(0);
       view = this.findViewById(R.id.interest_item_icon);
       a.o(view, "findViewById\(R.id.interest_item_icon\)");
       this.c = view;
       view = this.findViewById(R.id.interest_item_name);
       a.o(view, "findViewById\(R.id.interest_item_name\)");
       this.d = view;
       view = this.findViewById(R.id.interest_item_weight);
       a.o(view, "findViewById\(R.id.interest_item_weight\)");
       this.e = view;
       this.b.setSeekBarChangeListener(new InterestItemView$a(this));
    }
    public void InterestItemView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d0634, this, true);
       View view = this.findViewById(R.id.interest_item_progress);
       a.o(view, "findViewById\(R.id.interest_item_progress\)");
       this.b = view;
       view.setPadding(0, 0, 0, 0);
       this.b.setSaveEnabled(0);
       view = this.findViewById(R.id.interest_item_icon);
       a.o(view, "findViewById\(R.id.interest_item_icon\)");
       this.c = view;
       view = this.findViewById(R.id.interest_item_name);
       a.o(view, "findViewById\(R.id.interest_item_name\)");
       this.d = view;
       view = this.findViewById(R.id.interest_item_weight);
       a.o(view, "findViewById\(R.id.interest_item_weight\)");
       this.e = view;
       this.b.setSeekBarChangeListener(new InterestItemView$a(this));
    }
    public final int a(int p0){
       if (p0 <= -60) {
          p0 = 20;
       }else if(-10 <= p0 && 10 >= p0){
          p0 = 50;
       }else {
          p0 = (p0 + 100) / 2;
       }
       return p0;
    }
    public final String b(int p0){
       InterestItemView tg;
       InterestManagementV3Meta interestMana = null;
       if (p0 < 45) {
          tg = this.g;
          if (tg != null) {
             interestMana = tg.mDecreaseOptionText;
          }
       }else if(p0 > 55){
          tg = this.g;
          if (tg != null) {
             interestMana = tg.mIncreaseOptionText;
          }
       }else {
          tg = this.g;
          if (tg != null) {
             interestMana = tg.mDefaultOptionText;
          }
       }
       return interestMana;
    }
    public final void setProgressChangeListener(InterestItemView$b p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, InterestItemView.class, "2")) {
          return;
       }
       a.p(p0, "listener");
       this.h = p0;
       PatchProxy.onMethodExit(InterestItemView.class, "2");
       return;
    }
}
