package com.yxcorp.gifshow.v3.editor.segment.timeline.SegmentTimelineFragment$a;
import im8.g;
import com.yxcorp.gifshow.v3.editor.segment.timeline.SegmentTimelineFragment;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.segment.timeline.h;
import java.util.Map;
import java.util.HashMap;

public class SegmentTimelineFragment$a implements g	// class@0011e2
{
    public SegmentTimelineFragment b;
    public i c;
    public String d;
    public SingleSegmentInfo e;
    public b0$c f;
    public b g;
    public final SegmentTimelineFragment h;

    public void SegmentTimelineFragment$a(SegmentTimelineFragment p0){
       this.h = p0;
       super();
       this.d = "";
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SegmentTimelineFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, SegmentTimelineFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(SegmentTimelineFragment$a.class, new h());
       }else {
          obj.put(SegmentTimelineFragment$a.class, null);
       }
       return obj;
    }
}
