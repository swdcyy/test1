package com.yxcorp.gifshow.v3.widget.progress.DownloadProgressView;
import dxc.a;
import com.kwai.library.widget.progressbar.DownloadProgressBar;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ll8.c$b;
import android.content.res.TypedArray;
import android.widget.ProgressBar;
import ea9.a;
import android.graphics.Color;

public final class DownloadProgressView extends DownloadProgressBar implements a	// class@001675
{
    public HashMap r;

    public void DownloadProgressView(Context p0){
       super(p0, null);
    }
    public void DownloadProgressView(Context p0,AttributeSet p1){
       Context context;
       a.p(p0, "context");
       super(p0, p1);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.r0);
       a.o(typedArray, "context.obtainStyledAttr¡­ble.DownloadProgressView\)");
       context = this.getContext();
       a.o(context, "getContext\(\)");
       this.setProgressArcWidth(a.a(context, typedArray.getDimension(2, 0x3fc00000)));
       this.setProgressArcColor(typedArray.getColor(1, Color.parseColor("#e5e5e5")));
       this.setProgressArcBackgroundColor(typedArray.getColor(0, Color.parseColor("#c1c1c1")));
       typedArray.recycle();
    }
}
