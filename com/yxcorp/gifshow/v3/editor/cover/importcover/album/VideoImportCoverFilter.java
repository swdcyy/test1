package com.yxcorp.gifshow.v3.editor.cover.importcover.album.VideoImportCoverFilter;
import com.yxcorp.gifshow.album.selected.IMediaSelectableFilter;
import com.yxcorp.gifshow.album.repo.filter.FilterType;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import r79.c;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import lnc.a1;

public class VideoImportCoverFilter extends IMediaSelectableFilter	// class@000e71
{
    public final FilterType filterType;
    public final float maxRatio;
    public final float minRatio;

    public void VideoImportCoverFilter(FilterType p0){
       super(p0, 0, 0, 6, null);
    }
    public void VideoImportCoverFilter(FilterType p0,float p1){
       super(p0, p1, 0, 4, null);
    }
    public void VideoImportCoverFilter(FilterType p0,float p1,float p2){
       a.p(p0, "filterType");
       super();
       this.filterType = p0;
       this.minRatio = p1;
       this.maxRatio = p2;
    }
    public void VideoImportCoverFilter(FilterType p0,float p1,float p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = 0.25f;
       }
       if (p3 & 0x04) {
          p2 = 4.00f;
       }
       super(p0, p1, p2);
       return;
    }
    public int isSelectable(c p0,List p1){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, VideoImportCoverFilter.class, "1");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       if (this.filterType != FilterType.SELECT || p0 == null) {
          return super.isSelectable(p0, p1);
       }
       p1 = PatchProxy.applyOneRefs(p0, this, VideoImportCoverFilter.class, "3");
       if (p1 != patchProxyRe) {
          i = p1.intValue();
       }else if((float)p0.getWidth() - ((float)p0.getHeight() * this.minRatio) < 0 || (float)p0.getWidth() - ((float)p0.getHeight() * this.maxRatio) > 0){
          i = -404;
       }else {
          i = 0;
       }
       return i;
    }
    public String nonselectableAlert(){
       Object obj = PatchProxy.apply(null, this, VideoImportCoverFilter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a1.p(0x7f10164a);
    }
}
