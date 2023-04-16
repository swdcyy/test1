package com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls$c;
import erd.o;
import com.yxcorp.gifshow.share.util.PhotoForward;
import com.yxcorp.gifshow.share.OperationModel;
import msd.p;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import java.io.File;
import wkd.b;
import j80.c;
import java.lang.StringBuilder;
import com.kwai.framework.model.feed.BaseFeed;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import brd.t;
import com.kuaishou.android.model.feed.ImageFeed;
import java.lang.IllegalArgumentException;

public final class PhotoForward$DefaultImpls$c implements o	// class@001c85
{
    public final PhotoForward b;
    public final OperationModel c;
    public final boolean d;
    public final boolean e;
    public final p f;

    public void PhotoForward$DefaultImpls$c(PhotoForward p0,OperationModel p1,boolean p2,boolean p3,p p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, PhotoForward$DefaultImpls$c.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          if (p0.getFirst().booleanValue()) {
             File uFile = b.a(-1504323719).o();
             StringBuilder str = "";
             BaseFeed uBaseFeed = this.c.i();
             String id = (uBaseFeed != null)? uBaseFeed.getId(): null;
             File uFile1 = new File(uFile, str+id+"share.jpg");
             p0 = p0.getSecond();
             a.m(p0);
             BitmapUtil.Q(p0, uFile1.getAbsolutePath(), 85);
             this.c.y(uFile1);
             this.c.A(uFile1);
             p0 = t.just(this.c);
          }else {
             p0 = this.c.i();
             if (p0 != null) {
                p0 = (p0 instanceof ImageFeed)? this.b.F0(this.c, this.d, this.e, this.f): this.b.O0(this.c, this.d, this.e, this.f);
             }else {
                throw new IllegalArgumentException("photo is null");
             }
          }
          ot = p0;
       }
       return ot;
    }
}
