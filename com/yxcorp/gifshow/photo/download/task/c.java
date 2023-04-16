package com.yxcorp.gifshow.photo.download.task.c;
import erd.o;
import com.yxcorp.gifshow.photo.download.task.f;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import r16.f;
import com.yxcorp.gifshow.util.LoadPolicy;
import java.lang.Class;
import brd.a0;
import lnc.y6;
import com.yxcorp.gifshow.photo.download.task.d;
import brd.t;

public final class c implements o	// class@000ef1
{
    public final f b;

    public void c(f p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       c tb = this.b;
       return y6.s(f.class, LoadPolicy.SILENT_IMMEDIATE).w(new d(tb, p0, tb.j.getAbsolutePath()));
    }
}
