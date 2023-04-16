package com.kwai.library.kwaiplayerkit.domain.play.ui.a;
import java.lang.Runnable;
import com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule$c$c;
import android.widget.FrameLayout$LayoutParams;
import java.lang.Object;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;

public final class a implements Runnable	// class@00085e
{
    public final DefaultFrameUiModule$c$c b;
    public final FrameLayout$LayoutParams c;

    public void a(DefaultFrameUiModule$c$c p0,FrameLayout$LayoutParams p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       this.b.b.setLayoutParams(this.c);
    }
}
