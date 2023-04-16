package com.yxcorp.gifshow.v3.editor.text.font.adapter.LocalFontVH;
import zuc.a;
import android.view.View;
import zuc.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.LocalFontVH$textView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.LocalFontVH$textWrapper$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.TextView;
import d0c.d;
import java.lang.Integer;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.LocalFontVH$a;
import android.widget.RelativeLayout;

public final class LocalFontVH extends a	// class@00143d
{
    public final p b;
    public final p c;
    public final c d;

    public void LocalFontVH(View p0,c p1){
       a.p(p0, "itemView");
       super(p0);
       this.d = p1;
       this.b = s.c(new LocalFontVH$textView$2(p0));
       this.c = s.c(new LocalFontVH$textWrapper$2(p0));
    }
    public View a(){
       TextView obj = PatchProxy.apply(null, this, LocalFontVH.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f();
       a.o(obj, "textView");
       return obj;
    }
    public void b(int p0,d p1){
       LocalFontVH localFontVH = LocalFontVH.class;
       if (PatchProxy.isSupport(localFontVH) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, localFontVH, "3")) {
          return;
       }
       a.p(p1, "item");
       super.b(p0, p1);
       this.f().setOnClickListener(null);
       this.d(p1.l());
       if (!PatchProxy.applyVoid(null, this, localFontVH, "4")) {
          if (this.a != null) {
             this.f().setTextColor(0xff000000);
          }else {
             this.f().setTextColor(-1);
          }
       }
       this.f().setOnClickListener(new LocalFontVH$a(this, p1));
       return;
    }
    public View e(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LocalFontVH localFontVH = LocalFontVH.class;
       Object obj = PatchProxy.apply(null, this, localFontVH, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, localFontVH, "2");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.c.getValue();
       }
       a.o(obj1, "textWrapper");
       return obj1;
    }
    public final TextView f(){
       Object obj = PatchProxy.apply(null, this, LocalFontVH.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
}
