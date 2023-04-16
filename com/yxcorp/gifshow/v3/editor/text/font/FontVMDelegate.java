package com.yxcorp.gifshow.v3.editor.text.font.FontVMDelegate;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.font.FontVMDelegate$fontList$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import d0c.d;
import d0c.a;
import java.lang.Integer;

public final class FontVMDelegate	// class@00142c
{
    public final p a;
    public FontViewModel b;

    public void FontVMDelegate(FontViewModel p0){
       a.p(p0, "vm");
       super();
       this.b = p0;
       this.a = s.c(new FontVMDelegate$fontList$2(this));
    }
    public final int a(String p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, FontVMDelegate.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "fontName");
       int i = 0;
       obj = this.d().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return -1;
          }
          Object obj1 = obj.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          if (a.g(p0, obj1.c()) && obj1.j()) {
             break ;
          }else {
             i = i1;
          }
       }
       return i;
    }
    public final int b(){
       Object obj = PatchProxy.apply(null, this, FontVMDelegate.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.t0();
    }
    public final String c(){
       String obj = PatchProxy.apply(null, this, FontVMDelegate.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "";
       if (!this.d().isEmpty() && this.d().get(0).j()) {
          obj = this.d().get(0).c();
          if (obj != null) {
             str = obj;
          }
       }
       return str;
    }
    public final List d(){
       Object obj = PatchProxy.apply(null, this, FontVMDelegate.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final String e(){
       String obj = PatchProxy.apply(null, this, FontVMDelegate.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "";
       if (!this.d().isEmpty() && this.b() >= 0) {
          obj = this.d().get(this.b()).c();
          if (obj != null) {
             str = obj;
          }
       }
       return str;
    }
    public final FontViewModel f(){
       return this.b;
    }
    public final void g(int p0){
       FontVMDelegate uFontVMDeleg = FontVMDelegate.class;
       if (PatchProxy.isSupport(uFontVMDeleg) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uFontVMDeleg, "2")) {
          return;
       }
       this.b.A0(p0);
       return;
    }
}
