package com.kuaishou.live.feedback.a;
import bz5.a$c;
import com.kuaishou.live.feedback.b;
import java.lang.Object;
import android.view.ViewParent;
import android.view.ViewGroup;
import a43.e;
import java.lang.Runnable;

public final class a implements a$c	// class@001bc3
{
    public final b a;

    public void a(b p0){
       this.a = p0;
    }
    public final void D(){
       a ta = this.a;
       b b = ta.b;
       if (b != null && b.getParent() != null) {
          ViewGroup parent = ta.b.getParent();
          parent.post(new e(ta, parent));
       }
       return;
    }
}
