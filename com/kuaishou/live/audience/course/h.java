package com.kuaishou.live.audience.course.h;
import io.reactivex.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import java.lang.Object;
import brd.v;
import com.kwai.feature.component.photofeatures.paycourse.PayCourseUtils;
import s31.b0;
import android.content.Context;
import z1.a;

public final class h implements g	// class@000c04
{
    public final GifshowActivity b;
    public final String c;

    public void h(GifshowActivity p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       h tb = this.b;
       PayCourseUtils.e.d(tb, this.c, new b0(p0, tb));
    }
}
