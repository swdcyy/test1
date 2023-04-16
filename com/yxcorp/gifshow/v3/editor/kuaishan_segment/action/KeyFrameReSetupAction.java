package com.yxcorp.gifshow.v3.editor.kuaishan_segment.action.KeyFrameReSetupAction;
import xvc.b;
import u80.d;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class KeyFrameReSetupAction extends b	// class@001014
{
    public final int endPosition;
    public final d ksProject;
    public final List oldKeyFrameList;
    public final int startPosition;

    public void KeyFrameReSetupAction(d p0,List p1,int p2,int p3){
       a.p(p0, "ksProject");
       a.p(p1, "oldKeyFrameList");
       super();
       this.ksProject = p0;
       this.oldKeyFrameList = p1;
       this.startPosition = p2;
       this.endPosition = p3;
    }
    public final int getEndPosition(){
       return this.endPosition;
    }
    public final d getKsProject(){
       return this.ksProject;
    }
    public final List getOldKeyFrameList(){
       return this.oldKeyFrameList;
    }
    public final int getStartPosition(){
       return this.startPosition;
    }
}
