package com.kuaishou.webkit.TracingConfig$Builder;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import com.kuaishou.webkit.TracingConfig;

public class TracingConfig$Builder	// class@00125d
{
    public final List mCustomIncludedCategories;
    public int mPredefinedCategories;
    public int mTracingMode;

    public void TracingConfig$Builder(){
       super();
       this.mPredefinedCategories = 0;
       this.mCustomIncludedCategories = new ArrayList();
       this.mTracingMode = 1;
    }
    public TracingConfig$Builder addCategories(Collection p0){
       this.mCustomIncludedCategories.addAll(p0);
       return this;
    }
    public TracingConfig$Builder addCategories(int[] p0){
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          int i1 = p0[i] | this.mPredefinedCategories;
          this.mPredefinedCategories = i1;
       }
       return this;
    }
    public TracingConfig$Builder addCategories(String[] p0){
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          this.mCustomIncludedCategories.add(p0[i]);
       }
       return this;
    }
    public TracingConfig build(){
       return new TracingConfig(this.mPredefinedCategories, this.mCustomIncludedCategories, this.mTracingMode);
    }
    public TracingConfig$Builder setTracingMode(int p0){
       this.mTracingMode = p0;
       return this;
    }
}
