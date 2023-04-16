package com.kuaishou.live.core.show.test.k0;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import android.content.Context;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import com.kuaishou.live.core.show.test.LiveFrequencyConfigTestFragment;
import androidx.fragment.app.Fragment;
import java.lang.String;

public final class k0 implements View$OnClickListener	// class@0011b0
{
    public static final k0 b;

    static {
       k0.b = new k0();
    }
    public void k0(){
       super();
    }
    public final void onClick(View p0){
       e uoe = p0.getContext().getSupportFragmentManager().beginTransaction();
       uoe.f(0x1020002, new LiveFrequencyConfigTestFragment());
       uoe.j(null);
       uoe.m();
    }
}
