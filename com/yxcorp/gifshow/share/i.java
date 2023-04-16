package com.yxcorp.gifshow.share.i;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import java.lang.Object;
import com.yxcorp.gifshow.share.OperationFactoryAdapter;
import gic.j;
import mhc.h0;

public abstract class i	// class@001bb8
{
    public GifshowActivity a;
    public QPhoto b;
    public KwaiOp c;
    public boolean d;
    public i$b e;

    public void i(GifshowActivity p0,QPhoto p1,KwaiOp p2){
       super();
       this.d = false;
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public abstract OperationFactoryAdapter a(QPhoto p0);
    public abstract h0 b(QPhoto p0,j p1);
}
