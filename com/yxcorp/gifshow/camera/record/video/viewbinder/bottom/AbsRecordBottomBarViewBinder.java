package com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.AbsRecordBottomBarViewBinder;
import com.kuaishou.viewbinder.BaseViewBinder;
import c35.c;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;

public abstract class AbsRecordBottomBarViewBinder extends BaseViewBinder	// class@000f99
{
    public View A;
    public View B;
    public PressedImageView C;
    public ConstraintLayout e;
    public View f;
    public View g;
    public View h;
    public Guideline i;
    public View j;
    public View k;
    public KwaiImageView l;
    public TextView m;
    public View n;
    public KwaiImageView o;
    public LinearLayout p;
    public TextView q;
    public KwaiImageView r;
    public ImageView s;
    public View t;
    public View u;
    public KwaiImageView v;
    public ViewStub w;
    public TextView x;
    public ViewStub y;
    public View z;

    public void AbsRecordBottomBarViewBinder(c p0){
       super(p0);
    }
    public final View A(){
       return this.h;
    }
    public final KwaiImageView B(){
       return this.l;
    }
    public final View C(){
       return this.j;
    }
    public final View D(){
       return this.k;
    }
    public final TextView E(){
       return this.m;
    }
    public final View G(){
       return this.u;
    }
    public final KwaiImageView H(){
       return this.v;
    }
    public final View I(){
       return this.t;
    }
    public final TextView J(){
       return this.x;
    }
    public abstract KwaiImageView K();
    public abstract ImageView L();
    public final ConstraintLayout y(){
       return this.e;
    }
    public final Guideline z(){
       return this.i;
    }
}
