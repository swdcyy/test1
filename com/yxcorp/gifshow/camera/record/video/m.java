package com.yxcorp.gifshow.camera.record.video.m;
import android.view.ViewStub$OnInflateListener;
import com.yxcorp.gifshow.camera.record.video.n;
import java.lang.Object;
import android.view.ViewStub;
import android.view.View;
import java.util.Objects;
import oh9.g0;
import android.view.View$OnClickListener;

public final class m implements ViewStub$OnInflateListener	// class@000f8c
{
    public final n a;

    public void m(n p0){
       this.a = p0;
    }
    public final void onInflate(ViewStub p0,View p1){
       m ta = this.a;
       Objects.requireNonNull(ta);
       if (p1 == null) {
       }else {
          p1 = p1.findViewById(R.id.finish_record_layout);
          ta.v = p1;
          if (p1 != null) {
             p1.setOnClickListener(new g0(ta));
          }
       }
       return;
    }
}
