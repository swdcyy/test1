package com.feature.post.bridge.r;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.post.api.feature.bridge.JsAudioRecordParams;
import f55.g;
import java.lang.Object;
import om6.b;
import java.lang.String;
import brd.t;
import mg.y1;
import mg.k3;
import crd.b;

public final class r implements g	// class@0014b7
{
    public final GifshowActivity b;
    public final JsAudioRecordParams c;
    public final g d;

    public void r(GifshowActivity p0,JsAudioRecordParams p1,g p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       r tc = this.c;
       r td = this.d;
       p0.gu(this.b, tc.mData, tc.mTimeLength, tc.mTimeLimit).subscribe(new y1(td), new k3(td));
    }
}
