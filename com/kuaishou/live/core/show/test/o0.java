package com.kuaishou.live.core.show.test.o0;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import android.content.Context;
import android.content.Intent;
import com.kuaishou.live.core.basic.activity.LivePlayTestActivity;
import java.lang.Class;

public final class o0 implements View$OnClickListener	// class@0011b8
{
    public static final o0 b;

    static {
       o0.b = new o0();
    }
    public void o0(){
       super();
    }
    public final void onClick(View p0){
       p0.getContext().startActivity(new Intent(p0.getContext(), LivePlayTestActivity.class));
    }
}
