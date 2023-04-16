package com.kuaishou.live.lite.util.viewupdater.d;
import com.kuaishou.live.lite.util.viewupdater.d$a;
import java.util.List;
import android.view.ViewGroup;
import z1.a;

public interface abstract d	// class@000bad
{
    public static final d$a j0;

    static {
       d.j0 = d$a.a;
    }
    void a(List p0);
    ViewGroup getContainer();
    void release();
    void setAddViewCallback(a p0);
    void setRemoveViewCallback(a p0);
}
