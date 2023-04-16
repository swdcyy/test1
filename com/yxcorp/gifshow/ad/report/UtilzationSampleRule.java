package com.yxcorp.gifshow.ad.report.UtilzationSampleRule;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.report.UtilzationSampleRule$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class UtilzationSampleRule implements Serializable	// class@0017b4
{
    public float mFileSize;
    public String mName;
    public float mSampleRatio;
    public static final UtilzationSampleRule$a Companion;
    public static final long serialVersionUID;

    static {
       UtilzationSampleRule.Companion = new UtilzationSampleRule$a(null);
    }
    public void UtilzationSampleRule(){
       super();
       this.mSampleRatio = 0.00f;
       this.mName = "";
    }
    public final float getMFileSize(){
       return this.mFileSize;
    }
    public final String getMName(){
       return this.mName;
    }
    public final float getMSampleRatio(){
       return this.mSampleRatio;
    }
    public final void setMFileSize(float p0){
       this.mFileSize = p0;
    }
    public final void setMName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UtilzationSampleRule.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mName = p0;
       return;
    }
    public final void setMSampleRatio(float p0){
       this.mSampleRatio = p0;
    }
}
