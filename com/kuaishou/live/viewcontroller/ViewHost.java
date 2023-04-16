package com.kuaishou.live.viewcontroller.ViewHost;
import com.kuaishou.live.viewcontroller.ViewHost$Companion;
import android.view.View;

public interface abstract ViewHost	// class@000fe8
{
    public static final ViewHost$Companion a;

    static {
       ViewHost.a = ViewHost$Companion.a;
    }
    boolean a(View p0);
    View b(int p0);
}
