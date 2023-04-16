package com.yxcorp.gifshow.activity.share.topic.j;
import y8c.g;
import fx8.m0;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.activity.share.topic.j$a;
import ml8.c;

public class j extends g	// class@001482
{
    public m0 w;

    public void j(m0 p0){
       super();
       this.w = p0;
    }
    public f h1(ViewGroup p0,int p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oj, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.d(p0.getContext(), 0x7f0d1501, p0, false), new j$a(this));
    }
}
