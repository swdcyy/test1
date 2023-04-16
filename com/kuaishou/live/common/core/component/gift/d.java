package com.kuaishou.live.common.core.component.gift.d;
import com.kuaishou.live.common.core.component.gift.GiftAnimItemView;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.common.core.component.gift.BatchAnimBgView;

public class d	// class@00114d
{
    public final View a;
    public BatchAnimBgView b;
    public ObjectAnimator c;
    public ObjectAnimator d;
    public ObjectAnimator e;
    public ObjectAnimator f;
    public boolean g;
    public int h;
    public boolean i;

    public void d(GiftAnimItemView p0){
       super();
       this.g = false;
       this.h = 0;
       this.a = p0.h;
       GiftAnimItemView m = p0.m;
       this.b = m;
       m.setTarget(p0.n);
    }
    public void a(){
       this.i = true;
    }
}
