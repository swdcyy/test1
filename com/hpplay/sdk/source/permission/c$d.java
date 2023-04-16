package com.hpplay.sdk.source.permission.c$d;
import android.app.SharedElementCallback;
import com.hpplay.sdk.source.permission.c$c;
import android.view.View;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import com.hpplay.sdk.source.permission.b$a;
import android.content.Context;
import java.util.List;
import java.util.Map;
import android.app.SharedElementCallback$OnSharedElementsReadyListener;
import com.hpplay.sdk.source.permission.c$d$1;
import com.hpplay.sdk.source.permission.c$a;

public class c$d extends SharedElementCallback	// class@000681
{
    public c$c a;

    public void c$d(c$c p0){
       super();
       this.a = p0;
    }
    public Parcelable onCaptureSharedElementSnapshot(View p0,Matrix p1,RectF p2){
       return this.a.onCaptureSharedElementSnapshot(p0, p1, p2);
    }
    public View onCreateSnapshotView(Context p0,Parcelable p1){
       return this.a.onCreateSnapshotView(p0, p1);
    }
    public void onMapSharedElements(List p0,Map p1){
       this.a.onMapSharedElements(p0, p1);
    }
    public void onRejectSharedElements(List p0){
       this.a.onRejectSharedElements(p0);
    }
    public void onSharedElementEnd(List p0,List p1,List p2){
       this.a.onSharedElementEnd(p0, p1, p2);
    }
    public void onSharedElementStart(List p0,List p1,List p2){
       this.a.onSharedElementStart(p0, p1, p2);
    }
    public void onSharedElementsArrived(List p0,List p1,SharedElementCallback$OnSharedElementsReadyListener p2){
       this.a.onSharedElementsArrived(p0, p1, new c$d$1(this, p2));
    }
}
