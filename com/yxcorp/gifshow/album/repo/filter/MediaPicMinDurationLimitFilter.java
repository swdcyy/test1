package com.yxcorp.gifshow.album.repo.filter.MediaPicMinDurationLimitFilter;
import com.yxcorp.gifshow.album.selected.IMediaSelectableFilter;
import com.yxcorp.gifshow.album.repo.filter.MediaPicMinDurationLimitFilter$a;
import nsd.u;
import java.lang.String;
import r79.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import com.yxcorp.gifshow.album.vm.viewdata.DataType;
import kotlin.jvm.internal.a;
import o79.i;
import java.util.List;

public final class MediaPicMinDurationLimitFilter extends IMediaSelectableFilter	// class@001a93
{
    public String alert;
    public boolean maxDurationUseSdk;
    public int minDurationPerVideo;
    public String minDurationPerVideoAlert;
    public static final MediaPicMinDurationLimitFilter$a Companion;

    static {
       MediaPicMinDurationLimitFilter.Companion = new MediaPicMinDurationLimitFilter$a(null);
    }
    public void MediaPicMinDurationLimitFilter(int p0,String p1){
       super();
       this.minDurationPerVideo = p0;
       this.minDurationPerVideoAlert = p1;
       this.alert = "";
    }
    public final long a(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MediaPicMinDurationLimitFilter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = (this.maxDurationUseSdk != null)? 4000: p0.getDuration();
       return l;
    }
    public final boolean b(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MediaPicMinDurationLimitFilter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.getDataType() == DataType.IMAGE)? true: false;
       return b;
    }
    public final boolean getMaxDurationUseSdk(){
       return this.maxDurationUseSdk;
    }
    public final int getMinDurationPerVideo(){
       return this.minDurationPerVideo;
    }
    public final String getMinDurationPerVideoAlert(){
       return this.minDurationPerVideoAlert;
    }
    public int isClickable(c p0){
       int i;
       MediaPicMinDurationLimitFilter obj = PatchProxy.applyOneRefs(p0, this, MediaPicMinDurationLimitFilter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.q(p0, "media");
       if (this.b(p0)) {
          MediaPicMinDurationLimitFilter tminDuration = this.minDurationPerVideo;
          if (this.a(p0) - (long)tminDuration < 0) {
             obj = this.minDurationPerVideoAlert;
             if (obj == null) {
                String str = i.q(R.string.arg_RES_7f1018d0, String.valueOf(((long)tminDuration / 1000)));
                a.h(str, "CommonUtil.string\(\n     ¡­ACTOR\).toString\(\)\n      \)");
             }
             this.alert = obj;
             i = -8;
          label_004b :
             return i;
          }
       }
       this.alert = "";
       i = 0;
       goto label_004b ;
    }
    public int isSelectable(c p0,List p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, MediaPicMinDurationLimitFilter.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1.intValue();
       }
       int i = 0;
       String str = "";
       if (p0 == null) {
          this.alert = str;
       }else if(this.b(p0)){
          MediaPicMinDurationLimitFilter tminDuration = this.minDurationPerVideo;
          if (this.a(p0) - (long)tminDuration < 0) {
             MediaPicMinDurationLimitFilter tminDuration1 = this.minDurationPerVideoAlert;
             if (tminDuration1 == null) {
                tminDuration1 = i.q(R.string.arg_RES_7f1018d0, String.valueOf(((long)tminDuration / 1000)));
                a.h(tminDuration1, "CommonUtil.string\(\n     ¡­ACTOR\).toString\(\)\n      \)");
             }
             this.alert = tminDuration1;
             i = -8;
          }
       }
       this.alert = str;
       return i;
    }
    public String nonselectableAlert(){
       return this.alert;
    }
    public final void setMaxDurationUseSdk(boolean p0){
       this.maxDurationUseSdk = p0;
    }
    public final void setMinDurationPerVideo(int p0){
       this.minDurationPerVideo = p0;
    }
    public final void setMinDurationPerVideoAlert(String p0){
       this.minDurationPerVideoAlert = p0;
    }
}
