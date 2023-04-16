package com.kuaishou.viewbinder.IBaseViewHost;
import c35.c;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;

public interface abstract IBaseViewHost implements c	// class@001198
{

    Context host();
    LifecycleOwner lifecycleOwner();
}
