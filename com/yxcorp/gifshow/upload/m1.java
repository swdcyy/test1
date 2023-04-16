package com.yxcorp.gifshow.upload.m1;
import erd.r;
import com.yxcorp.gifshow.upload.SegmentUploader;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import retrofit2.HttpException;
import retrofit2.p;
import njd.a;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;

public class m1 implements r	// class@001e8f
{
    public final SegmentUploader b;

    public void m1(SegmentUploader p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, m1.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 instanceof HttpException && (p0.response() != null && (!p0.response().a() instanceof a || (p0.response().a().b() != 209 && p0.C(a.a().a()))))){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
