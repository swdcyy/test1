package com.yxcorp.gifshow.camera.record.frame.f$a;
import ml8.d;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.camera.record.frame.f;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.TextView;

public class f$a extends RecyclerView$ViewHolder implements d	// class@000de2
{
    public View b;
    public TextView c;
    public final f d;

    public void f$a(f p0,View p1){
       this.d = p0;
       super(p1);
       this.doBindView(p1);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a0fff);
       this.c = m1.f(p0, 0x7f0a1000);
       return;
    }
}
