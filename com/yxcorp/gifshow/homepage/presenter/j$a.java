package com.yxcorp.gifshow.homepage.presenter.j$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.homepage.presenter.j;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import im8.f;
import java.lang.Integer;
import tkd.b;
import tkd.d;
import os5.l;
import jyb.a;

public class j$a extends m	// class@0017cd
{
    public final j c;

    public void j$a(j p0,boolean p1){
       this.c = p0;
       super(p1);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "1")) {
          return;
       }
       this.c.S8(new QPhoto(this.c.p), this.c.r.get().intValue());
       d.a(-1492894991).AE();
       d.a(-1079301847).sw();
       return;
    }
}
