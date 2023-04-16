package com.kuaishou.live.core.show.liveslidesquare.sidebar.widget.LiveSquareSideBarFocusBarView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kuaishou.live.core.show.liveslidesquare.sidebar.response.LiveSquareSideBarFocusBarData;

public class LiveSquareSideBarFocusBarView extends FrameLayout	// class@000cb2
{
    public KwaiImageView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public LiveSquareSideBarFocusBarData f;

    public void LiveSquareSideBarFocusBarView(Context p0){
       super(p0, null);
    }
    public void LiveSquareSideBarFocusBarView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveSquareSideBarFocusBarView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveSquareSideBarFocusBarView.class, "2")) {
       }else {
          a.k(this, R.layout.arg_RES_7f0d0dd5, true);
          this.b = this.findViewById(0x7f0a25d7);
          this.c = this.findViewById(0x7f0a25da);
          this.d = this.findViewById(0x7f0a25d9);
          this.e = this.findViewById(0x7f0a25d8);
       }
       return;
    }
    public LiveSquareSideBarFocusBarData getFocusBarData(){
       return this.f;
    }
}
