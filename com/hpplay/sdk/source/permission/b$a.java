package com.hpplay.sdk.source.permission.b$a;
import java.lang.Object;
import android.view.View;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.content.Context;
import java.util.List;
import java.util.Map;

public abstract class b$a	// class@00067a
{

    public void b$a(){
       super();
    }
    public abstract Parcelable onCaptureSharedElementSnapshot(View p0,Matrix p1,RectF p2);
    public abstract View onCreateSnapshotView(Context p0,Parcelable p1);
    public abstract void onMapSharedElements(List p0,Map p1);
    public abstract void onRejectSharedElements(List p0);
    public abstract void onSharedElementEnd(List p0,List p1,List p2);
    public abstract void onSharedElementStart(List p0,List p1,List p2);
}
