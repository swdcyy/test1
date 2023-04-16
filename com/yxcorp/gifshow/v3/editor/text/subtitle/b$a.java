package com.yxcorp.gifshow.v3.editor.text.subtitle.b$a;
import y8c.g;
import com.yxcorp.gifshow.v3.editor.text.subtitle.b;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.text.model.TextConfigParam;
import y8c.f$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.text.subtitle.b$b;
import java.lang.Number;
import java.util.List;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Integer;
import android.content.Context;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.v3.editor.text.subtitle.s;
import ml8.c;

public class b$a extends g	// class@001491
{
    public final b w;

    public void b$a(b p0){
       this.w = p0;
       super();
    }
    public Object N0(int p0){
       return this.r1(p0);
    }
    public f$b d1(f$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b$b(p0, this.w, this.r1(p0.b));
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.w.g.size();
    }
    public f h1(ViewGroup p0,int p1){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.d(p0.getContext(), 0x7f0d1579, p0, false), new s((this.w.j ^ 0x01)));
    }
    public TextConfigParam r1(int p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.w.g.get(p0);
    }
}
