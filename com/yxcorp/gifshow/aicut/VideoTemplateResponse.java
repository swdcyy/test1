package com.yxcorp.gifshow.aicut.VideoTemplateResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.aicut.VideoTemplateResponse$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.aicut.VideoTemplateGroupInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.ArrayList;

public final class VideoTemplateResponse implements Serializable	// class@001944
{
    public int mDpi;
    public ArrayList templateGroups;
    public static final VideoTemplateResponse$a Companion;
    public static final long serialVersionUID;

    static {
       VideoTemplateResponse.Companion = new VideoTemplateResponse$a(null);
       VideoTemplateResponse.serialVersionUID = 1;
    }
    public void VideoTemplateResponse(){
       super();
    }
    public final void appendStandaloneRecoGroup(VideoTemplateGroupInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoTemplateResponse.class, "1")) {
          return;
       }
       a.p(p0, "recoGroup");
       VideoTemplateResponse ttemplateGro = this.templateGroups;
       if (ttemplateGro != null) {
          ttemplateGro.add(0, p0);
       }
       return;
    }
    public final int getMDpi(){
       return this.mDpi;
    }
    public final ArrayList getTemplateGroups(){
       return this.templateGroups;
    }
    public final void setMDpi(int p0){
       this.mDpi = p0;
    }
    public final void setTemplateGroups(ArrayList p0){
       this.templateGroups = p0;
    }
}
