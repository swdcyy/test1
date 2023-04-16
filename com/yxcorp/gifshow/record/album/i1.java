package com.yxcorp.gifshow.record.album.i1;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.TimeRange;
import com.yxcorp.gifshow.localwork.model.LongVideoLocalProject;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import k8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Asset$b;

public final class i1 implements o	// class@001729
{
    public static final i1 b;

    static {
       i1.b = new i1();
    }
    public void i1(){
       super();
    }
    public final Object apply(Object p0){
       TimeRange timeRange = null;
       a obj = PatchProxy.applyOneRefs(p0, timeRange, LocalAlbumUtils.class, "21");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          obj = p0.o0();
          if (obj != null) {
             obj.c0();
             if (obj.t() != null) {
                timeRange = obj.t().getSelectedRange();
             }
             double d = (double)((float)LongVideoLocalProject.e(false) / 1000.00f);
             timeRange = (timeRange != null)? DraftUtils.k(timeRange.getStart(), (timeRange.getStart() + d)): DraftUtils.k(0, d);
             Object[] objArray = new Object[false];
             a.D().w("LocalAlbumUtils", "convertVideoAssetDuration timeRange start: "+timeRange.getStart()+" duration: "+timeRange.getDuration(), objArray);
             obj.k().s(timeRange);
             obj.g(false);
          }
       }
       return p0;
    }
}
