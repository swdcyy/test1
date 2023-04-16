package com.yxcorp.gifshow.profile.presenter.profile.header.background.MediaRatioFilter;
import com.yxcorp.gifshow.album.selected.IMediaSelectableFilter;
import com.yxcorp.gifshow.album.repo.filter.FilterType;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import r79.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;

public class MediaRatioFilter extends IMediaSelectableFilter	// class@001495
{
    public final String alert;
    public final FilterType filterType;
    public final float maxRatio;
    public final float minRatio;

    public void MediaRatioFilter(FilterType p0){
       super(p0, null, 0, 0, 14, null);
    }
    public void MediaRatioFilter(FilterType p0,String p1){
       super(p0, p1, 0, 0, 12, null);
    }
    public void MediaRatioFilter(FilterType p0,String p1,float p2){
       super(p0, p1, p2, 0, 8, null);
    }
    public void MediaRatioFilter(FilterType p0,String p1,float p2,float p3){
       a.p(p0, "filterType");
       super();
       this.filterType = p0;
       this.alert = p1;
       this.minRatio = p2;
       this.maxRatio = p3;
    }
    public void MediaRatioFilter(FilterType p0,String p1,float p2,float p3,int p4,u p5){
       if (p4 & 0x02) {
          p1 = null;
       }
       if (p4 & 0x04) {
          p2 = 0.43f;
       }
       if (p4 & 0x08) {
          p3 = 2.00f;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public final int a(c p0){
       int i1;
       Object obj = PatchProxy.applyOneRefs(p0, this, MediaRatioFilter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 1;
       if (p0 != null && (p0.isVideoType() == i && (float)p0.getWidth() - ((float)p0.getHeight() * this.minRatio) < 0)) {
          i1 = -4;
       }else if(p0 != null && (p0.isVideoType() == i && (float)p0.getWidth() - ((float)p0.getHeight() * this.maxRatio) > 0)){
          i1 = -5;
       }else {
          i1 = 0;
       }
       return i1;
    }
    public int isClickable(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MediaRatioFilter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "media");
       int i = (this.filterType == FilterType.CLICK)? this.a(p0): super.isClickable(p0);
       return i;
    }
    public int isDisplay(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MediaRatioFilter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.filterType == FilterType.DISPLAY)? this.a(p0): super.isDisplay(p0);
       return i;
    }
    public int isSelectable(c p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MediaRatioFilter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.filterType == FilterType.SELECT)? this.a(p0): super.isSelectable(p0, p1);
       return i;
    }
    public String nonselectableAlert(){
       MediaRatioFilter obj = PatchProxy.apply(null, this, MediaRatioFilter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.alert;
       if (obj == null) {
          String str = super.nonselectableAlert();
       }
       return obj;
    }
}
