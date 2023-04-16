package com.yxcorp.gifshow.camera.record.video.t;
import ok.o;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class t implements o	// class@000f93
{
    public static final t b;

    static {
       t.b = new t();
    }
    public void t(){
       super();
    }
    public final boolean apply(Object p0){
       boolean b = (p0 != null && !TextUtils.x(p0.mId))? true: false;
       return b;
    }
}
