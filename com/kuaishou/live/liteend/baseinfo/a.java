package com.kuaishou.live.liteend.baseinfo.a;
import com.kuaishou.live.viewcontroller.ViewController;
import or5.d;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.View;
import i2b.a;
import android.view.ViewGroup;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import or5.b;
import ud3.a;
import ae3.a;
import android.view.View$OnClickListener;

public class a extends ViewController	// class@000bbc
{
    public final d j;
    public final Runnable k;

    public void a(d p0,Runnable p1){
       super();
       this.j = p0;
       this.k = p1;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       ViewGroup viewGroup = a.a(this.D2(), R.layout.arg_RES_7f0d0c59);
       this.R2(viewGroup);
       a.a(viewGroup.findViewById(R.id.live_lite_end_background_image_view), this.j.r5(), 8, 5);
       viewGroup.setOnClickListener(new a(this));
       return;
    }
}
