package com.kuaishou.live.core.show.wealthgrade.barrage.view.LiveBarrageNickView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.TextView;

public class LiveBarrageNickView extends LinearLayout	// class@001256
{
    public TextView b;
    public TextView c;

    public void LiveBarrageNickView(Context p0){
       super(p0);
       this.a();
    }
    public void LiveBarrageNickView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
    }
    public void LiveBarrageNickView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveBarrageNickView.class, "1")) {
          return;
       }
       a.k(this, R.layout.arg_RES_7f0d0aeb, true);
       this.b = this.findViewById(0x7f0a1c18);
       this.c = this.findViewById(0x7f0a1c1a);
       return;
    }
    public TextView getGradeIconView(){
       return this.b;
    }
    public TextView getNickNameView(){
       return this.c;
    }
}
