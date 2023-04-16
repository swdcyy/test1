package com.kuaishou.viewbinder.IViewBinder;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import androidx.lifecycle.ViewModel;

public interface abstract IViewBinder	// class@001199
{

    void bindViews(View p0);
    View getBindedView(LayoutInflater p0,ViewGroup p1,Bundle p2);
    void onDestroy();
    boolean onInterceptUserEvent(View p0,ViewModel p1,boolean p2);
}
