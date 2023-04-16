package com.yxcorp.gifshow.relation.intimate.dialog.s;
import y8c.g;
import java.util.ArrayList;
import y8c.f;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.relation.intimate.dialog.s$a;
import ml8.c;

public class s extends g	// class@001904
{
    public final ArrayList w;

    public void s(ArrayList p0){
       super();
       this.w = p0;
    }
    public ArrayList a1(int p0,f p1){
       return this.w;
    }
    public f h1(ViewGroup p0,int p1){
       s os = s.class;
       if (PatchProxy.isSupport(os)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, os, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d0644), new s$a());
    }
}
