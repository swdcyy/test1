package com.yxcorp.gifshow.v3.widget.gestures.ITimeLineGestureProcessor$HeadingDirection;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ITimeLineGestureProcessor$HeadingDirection extends Enum	// class@001669
{
    public static final ITimeLineGestureProcessor$HeadingDirection[] $VALUES;
    public static final ITimeLineGestureProcessor$HeadingDirection LEFT;
    public static final ITimeLineGestureProcessor$HeadingDirection NONE;
    public static final ITimeLineGestureProcessor$HeadingDirection RIGHT;

    static {
       ITimeLineGestureProcessor$HeadingDirection headingDirec1;
       ITimeLineGestureProcessor$HeadingDirection[] headingDirec = new ITimeLineGestureProcessor$HeadingDirection[]{headingDirec1,headingDirec1,headingDirec1};
       headingDirec1 = new ITimeLineGestureProcessor$HeadingDirection("NONE", 0);
       ITimeLineGestureProcessor$HeadingDirection.NONE = headingDirec1;
       headingDirec1 = new ITimeLineGestureProcessor$HeadingDirection("LEFT", 1);
       ITimeLineGestureProcessor$HeadingDirection.LEFT = headingDirec1;
       headingDirec1 = new ITimeLineGestureProcessor$HeadingDirection("RIGHT", 2);
       ITimeLineGestureProcessor$HeadingDirection.RIGHT = headingDirec1;
       ITimeLineGestureProcessor$HeadingDirection.$VALUES = headingDirec;
    }
    public void ITimeLineGestureProcessor$HeadingDirection(String p0,int p1){
       super(p0, p1);
    }
    public static ITimeLineGestureProcessor$HeadingDirection valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ITimeLineGestureProcessor$HeadingDirection.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ITimeLineGestureProcessor$HeadingDirection.class, p0);
    }
    public static ITimeLineGestureProcessor$HeadingDirection[] values(){
       Object obj = PatchProxy.apply(null, null, ITimeLineGestureProcessor$HeadingDirection.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ITimeLineGestureProcessor$HeadingDirection.$VALUES.clone();
    }
}
