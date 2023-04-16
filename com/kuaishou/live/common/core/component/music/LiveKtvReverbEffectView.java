package com.kuaishou.live.common.core.component.music.LiveKtvReverbEffectView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import i91.i;
import lnc.a1;
import java.util.List;
import java.util.Collections;
import android.view.ViewGroup;
import com.kuaishou.live.common.core.basic.arya.SoundEffectItem;
import com.kuaishou.live.common.core.component.music.LiveKtvReverbEffectView$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ru1.d;
import java.lang.Runnable;

public class LiveKtvReverbEffectView extends RecyclerView	// class@0016b3
{
    public LiveKtvReverbEffectView$c b;
    public SoundEffectItem c;
    public LiveKtvReverbEffectView$a d;
    public LiveKtvReverbEffectView$d e;
    public int f;
    public int g;
    public List h;
    public static final int i;

    public void LiveKtvReverbEffectView(Context p0){
       super(p0, null);
    }
    public void LiveKtvReverbEffectView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveKtvReverbEffectView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = i.b;
       this.f = a1.e(22.00f);
       this.g = a1.e(16.00f);
       this.h = Collections.emptyList();
       this.setOverScrollMode(2);
    }
    public SoundEffectItem getCurrentSelectedEffectItem(){
       return this.c;
    }
    public void setHorizontalMargin(int p0){
       this.f = p0;
    }
    public void setOnReverbItemSelectedListener(LiveKtvReverbEffectView$d p0){
       this.e = p0;
    }
    public void setSupportEffects(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveKtvReverbEffectView.class, "1")) {
          return;
       }
       if (p0 == this.h) {
          return;
       }
       this.h = p0;
       this.post(new d(this));
       return;
    }
    public void setVerticalMargin(int p0){
       this.g = p0;
    }
}
