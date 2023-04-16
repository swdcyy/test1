package com.kuaishou.tuna.plc.dynamic_container.test.PlcDynamicTestView;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;

public final class PlcDynamicTestView extends FrameLayout	// class@000ff8
{
    public PlcDynamicContainerConfig b;
    public HashMap c;

    public void PlcDynamicTestView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void PlcDynamicTestView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void PlcDynamicTestView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
}
