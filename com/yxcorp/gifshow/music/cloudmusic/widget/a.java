package com.yxcorp.gifshow.music.cloudmusic.widget.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.music.cloudmusic.widget.BaseTabGroupWithIndicator;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import kpb.c;
import com.kwai.library.widget.popup.common.f;

public final class a implements Runnable	// class@00204e
{
    public final BaseTabGroupWithIndicator b;
    public final View c;
    public final View d;
    public final float e;

    public void a(BaseTabGroupWithIndicator p0,View p1,View p2,float p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       a tb = this.b;
       a tc = this.c;
       Objects.requireNonNull(tb);
       f.G(tc, new c(tb, this.d, tc, this.e));
    }
}
