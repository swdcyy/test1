package com.kuaishou.live.core.basic.activity.x;
import m02.o;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.lifecycle.LifecycleOwner;

public interface abstract x implements o	// class@001858
{

    boolean a();
    FragmentActivity getActivity();
    c getChildFragmentManager();
    boolean isAdded();
    long s0();
    LivePlayFragment t0();
    BaseFragment t0();
    LifecycleOwner u0();
    boolean v0();
    boolean w0();
}
