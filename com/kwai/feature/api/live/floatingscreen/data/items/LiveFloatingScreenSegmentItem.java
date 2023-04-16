package com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenSegmentItem;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenBaseItemData;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenSegmentItem$a;
import nsd.u;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveFloatingScreenSegmentItem extends LiveFloatingScreenBaseItemData	// class@000fc8
{
    public UserStateRichTextSegment[] segment;
    public int segmentHeight;
    public String segmentStr;
    public static final LiveFloatingScreenSegmentItem$a Companion;
    public static final long serialVersionUID;

    static {
       LiveFloatingScreenSegmentItem.Companion = new LiveFloatingScreenSegmentItem$a(null);
    }
    public void LiveFloatingScreenSegmentItem(){
       super();
       this.segmentStr = "";
    }
    public final UserStateRichTextSegment[] getSegment(){
       return this.segment;
    }
    public final int getSegmentHeight(){
       return this.segmentHeight;
    }
    public final String getSegmentStr(){
       return this.segmentStr;
    }
    public final void setSegment(UserStateRichTextSegment[] p0){
       this.segment = p0;
    }
    public final void setSegmentHeight(int p0){
       this.segmentHeight = p0;
    }
    public final void setSegmentStr(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenSegmentItem.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.segmentStr = p0;
       return;
    }
}
