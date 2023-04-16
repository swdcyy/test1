package com.yxcorp.gifshow.camera.record.sidebar.SideBarViewBinder;
import com.kuaishou.viewbinder.ViewStubViewBinder;
import c35.c;
import com.yxcorp.gifshow.widget.textview.TextImageView;
import android.view.ViewGroup;
import android.view.View;

public abstract class SideBarViewBinder extends ViewStubViewBinder	// class@000f0d
{
    public ViewGroup f;
    public ViewStub g;
    public View h;

    public void SideBarViewBinder(c p0){
       super(p0);
    }
    public abstract TextImageView B();
    public final ViewGroup C(){
       return this.f;
    }
    public abstract View D();
    public final void E(View p0){
       this.h = p0;
    }
    public final void G(ViewGroup p0){
       this.f = p0;
    }
}
