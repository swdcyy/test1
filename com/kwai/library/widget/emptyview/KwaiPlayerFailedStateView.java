package com.kwai.library.widget.emptyview.KwaiPlayerFailedStateView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.library.widget.emptyview.KwaiEmptyStateInit;
import android.view.View$OnClickListener;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.String;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.res.Resources;

public class KwaiPlayerFailedStateView extends FrameLayout	// class@000937
{
    public final View$OnClickListener b;
    public CharSequence c;
    public boolean d;
    public TextView e;
    public TextView f;
    public TextView g;

    public void KwaiPlayerFailedStateView(Context p0){
       super(p0, null);
    }
    public void KwaiPlayerFailedStateView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiPlayerFailedStateView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       View$OnClickListener networkResol = KwaiEmptyStateInit.INSTANCE.getNetworkResolveClickListener();
       this.b = networkResol;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.b2, p2, 0);
       this.d = typedArray.getBoolean(0, true);
       this.c = typedArray.getString(true);
       typedArray.recycle();
       LayoutInflater.from(this.getContext()).inflate(R.layout.arg_RES_7f0d1718, this);
       this.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       this.e = this.findViewById(0x7f0a35e0);
       this.f = this.findViewById(0x7f0a41f1);
       this.g = this.findViewById(0x7f0a4177);
       if (!TextUtils.isEmpty(this.c)) {
          this.e(this.c);
       }
       if (this.d != null) {
          this.setBackgroundColor(this.getContext().getResources().getColor(R.color.arg_RES_7f062127));
       }
       this.b(networkResol);
       return;
    }
    public KwaiPlayerFailedStateView a(CharSequence p0){
       this.g.setText(p0);
       return this;
    }
    public KwaiPlayerFailedStateView b(View$OnClickListener p0){
       this.f.setOnClickListener(p0);
       return this;
    }
    public KwaiPlayerFailedStateView c(int p0){
       this.f.setVisibility(p0);
       return this;
    }
    public KwaiPlayerFailedStateView d(int p0){
       this.e(this.getResources().getString(p0));
       return this;
    }
    public KwaiPlayerFailedStateView e(CharSequence p0){
       if (!TextUtils.isEmpty(p0)) {
          this.f.setText(p0);
       }
       return this;
    }
    public KwaiPlayerFailedStateView f(View$OnClickListener p0){
       if (p0 == null) {
          this.e.setVisibility(8);
       }else {
          this.e.setOnClickListener(p0);
          this.e.setVisibility(0);
       }
       return this;
    }
    public String getRetryBtnText(){
       return this.e.getText().toString();
    }
}
