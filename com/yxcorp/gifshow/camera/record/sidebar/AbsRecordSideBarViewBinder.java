package com.yxcorp.gifshow.camera.record.sidebar.AbsRecordSideBarViewBinder;
import com.yxcorp.gifshow.camera.record.sidebar.SideBarViewBinder;
import c35.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.widget.PressedImageView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.widget.textview.TextImageView;

public abstract class AbsRecordSideBarViewBinder extends SideBarViewBinder	// class@000f08
{
    public View i;

    public void AbsRecordSideBarViewBinder(c p0){
       a.p(p0, "viewHost");
       super(p0);
    }
    public abstract PressedImageView H();
    public abstract View I();
    public abstract ImageView J();
    public abstract TextView K();
    public final View L(){
       return this.i;
    }
    public abstract View M();
    public abstract View N();
    public abstract TextImageView O();
    public abstract ImageView P();
    public abstract View Q();
    public abstract TextView R();
}
