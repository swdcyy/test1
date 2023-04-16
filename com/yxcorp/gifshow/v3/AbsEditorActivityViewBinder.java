package com.yxcorp.gifshow.v3.AbsEditorActivityViewBinder;
import com.kuaishou.viewbinder.BaseViewBinder;
import c35.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.Button;
import com.kwai.feature.post.api.widget.PostRadioGroupWithIndicator;
import android.view.View;
import android.widget.ImageView;
import lwc.h;
import androidx.fragment.app.Fragment;
import com.kwai.feature.post.api.flywheel.widget.FlyWheelFrameLayout;

public abstract class AbsEditorActivityViewBinder extends BaseViewBinder	// class@000d0d
{
    public ImageView e;
    public Button f;
    public Button g;
    public TextView h;
    public View i;
    public View j;
    public View k;
    public TextView l;
    public PostRadioGroupWithIndicator m;
    public TextView n;
    public FlyWheelFrameLayout o;
    public View p;
    public FrameLayout q;
    public c r;

    public void AbsEditorActivityViewBinder(c p0){
       a.p(p0, "viewHost");
       super(p0);
       this.r = p0;
    }
    public final TextView A(){
       AbsEditorActivityViewBinder obj = PatchProxy.apply(null, this, AbsEditorActivityViewBinder.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h;
       if (obj == null) {
          a.S("leftTextView");
       }
       return obj;
    }
    public final Button B(){
       AbsEditorActivityViewBinder obj = PatchProxy.apply(null, this, AbsEditorActivityViewBinder.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       if (obj == null) {
          a.S("photoVisibilityBtn");
       }
       return obj;
    }
    public final PostRadioGroupWithIndicator C(){
       AbsEditorActivityViewBinder obj = PatchProxy.apply(null, this, AbsEditorActivityViewBinder.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m;
       if (obj == null) {
          a.S("tabContainer");
       }
       return obj;
    }
    public final View D(){
       AbsEditorActivityViewBinder obj = PatchProxy.apply(null, this, AbsEditorActivityViewBinder.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj == null) {
          a.S("titleContainer");
       }
       return obj;
    }
    public final ImageView E(){
       AbsEditorActivityViewBinder obj = PatchProxy.apply(null, this, AbsEditorActivityViewBinder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj == null) {
          a.S("topLeftBtn");
       }
       return obj;
    }
    public abstract void G(h p0,Fragment p1);
    public final FlyWheelFrameLayout y(){
       return this.o;
    }
    public final c z(){
       return this.r;
    }
}
