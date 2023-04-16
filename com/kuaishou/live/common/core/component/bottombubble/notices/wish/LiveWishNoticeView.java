package com.kuaishou.live.common.core.component.bottombubble.notices.wish.LiveWishNoticeView;
import pd1.b;
import com.yxcorp.widget.selector.view.SelectShapeRelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pd1.d;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import xh3.b;
import android.widget.TextView;
import xh3.g;
import android.view.View;
import xh3.l;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.e;
import android.view.View$OnClickListener;
import pd1.c;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup;
import jc1.a;
import java.lang.Boolean;

public class LiveWishNoticeView extends SelectShapeRelativeLayout implements b	// class@00101b
{
    public KwaiImageView c;
    public TextView d;
    public TextView e;
    public ViewGroup f;
    public TextView g;
    public static final int h;

    public void LiveWishNoticeView(Context p0){
       super(p0, null);
    }
    public void LiveWishNoticeView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void LiveWishNoticeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(AndroidViewModel p0,LifecycleOwner p1){
       this.c(p0, p1);
    }
    public void c(f p0,LifecycleOwner p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveWishNoticeView.class, "3")) {
          return;
       }
       p0.a.observe(p1, new d(this));
       b.b(this.c, p1, p0.b);
       g.a(this.d, p1, p0.c);
       g.a(this.e, p1, p0.d);
       l.c(this.f, p1, p0.e);
       g.a(this.g, p1, p0.f);
       this.g.setOnClickListener(new e(p0));
       p0.g.observe(p1, new c(this));
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveWishNoticeView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.c = this.findViewById(0x7f0a1b4b);
       this.d = this.findViewById(0x7f0a1b4c);
       this.e = this.findViewById(0x7f0a1b5b);
       this.f = this.findViewById(0x7f0a1b5a);
       this.g = this.findViewById(0x7f0a1b59);
       this.setClickable(true);
       a.b(this.d);
       a.b(this.e);
       return;
    }
    public final void setContentIconShape(boolean p0){
       if (PatchProxy.isSupport(LiveWishNoticeView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveWishNoticeView.class, "2")) {
          return;
       }
       a.a(p0, this.c);
       return;
    }
}
