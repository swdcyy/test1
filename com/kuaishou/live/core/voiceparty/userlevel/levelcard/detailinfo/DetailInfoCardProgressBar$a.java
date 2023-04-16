package com.kuaishou.live.core.voiceparty.userlevel.levelcard.detailinfo.DetailInfoCardProgressBar$a;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.userlevel.levelcard.detailinfo.DetailInfoCardProgressBar;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class DetailInfoCardProgressBar$a implements Runnable	// class@001aac
{
    public final DetailInfoCardProgressBar b;
    public final float c;

    public void DetailInfoCardProgressBar$a(DetailInfoCardProgressBar p0,float p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, DetailInfoCardProgressBar$a.class, "1")) {
          return;
       }
       DetailInfoCardProgressBar g = this.b.G;
       if (g == null) {
          a.S("currentExpTextView");
       }
       int measuredWidt = g.getMeasuredWidth();
       int measuredWidt1 = DetailInfoCardProgressBar.L(this.b).getMeasuredWidth();
       DetailInfoCardProgressBar f = this.b.F;
       if (f == null) {
          a.S("rightProgressImageView");
       }
       float f1 = (float)measuredWidt;
       float f2 = (float)(measuredWidt1 + f.getMeasuredWidth());
       a uoa = new a();
       uoa.i(DetailInfoCardProgressBar.M(this.b));
       uoa.p(DetailInfoCardProgressBar.L(this.b).getId(), ((((float)1 - (f1 / f2)) * this.c) + ((f1 / (float)2) / f2)));
       uoa.b(DetailInfoCardProgressBar.M(this.b));
       return;
    }
}
