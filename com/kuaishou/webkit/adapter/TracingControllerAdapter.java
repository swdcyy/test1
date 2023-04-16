package com.kuaishou.webkit.adapter.TracingControllerAdapter;
import com.kuaishou.webkit.TracingController;
import android.webkit.TracingController;
import com.kuaishou.webkit.TracingConfig;
import android.webkit.TracingConfig;
import android.webkit.TracingConfig$Builder;
import java.util.List;
import java.util.Collection;
import java.io.OutputStream;
import java.util.concurrent.Executor;

public class TracingControllerAdapter extends TracingController	// class@0012b2
{
    public TracingController mStub;

    public void TracingControllerAdapter(TracingController p0){
       super();
       this.mStub = p0;
    }
    public static TracingControllerAdapter getInstance(TracingController p0){
       TracingControllerAdapter tracingContr = (p0 != null)? new TracingControllerAdapter(p0): null;
       return tracingContr;
    }
    public boolean isTracing(){
       return this.mStub.isTracing();
    }
    public void start(TracingConfig p0){
       if (p0 == null) {
          this.mStub.start(null);
          return;
       }else {
          TracingConfig$Builder uBuilder = new TracingConfig$Builder();
          int[] ointArray = new int[]{p0.getPredefinedCategories()};
          uBuilder.addCategories(ointArray);
          uBuilder.addCategories(p0.getCustomIncludedCategories());
          uBuilder.setTracingMode(p0.getTracingMode());
          this.mStub.start(uBuilder.build());
          return;
       }
    }
    public boolean stop(OutputStream p0,Executor p1){
       return this.mStub.stop(p0, p1);
    }
}
