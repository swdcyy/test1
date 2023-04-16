package com.kuaishou.cover.Link$a;
import a30.b;
import com.kuaishou.cover.Link;
import a30.d;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import d30.c;
import java.lang.StringBuilder;
import android.app.Activity;
import java.util.Map;
import android.util.LongSparseArray;

public class Link$a implements b	// class@0016cd
{
    public final b a;
    public final long b;
    public final d c;
    public final FragmentActivity d;
    public final Link e;

    public void Link$a(Link p0,b p1,long p2,d p3,FragmentActivity p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void a(long p0){
       Link$a uoa = Link$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "5")) {
          return;
       }
       uoa = this.a;
       if (uoa != null) {
          uoa.a(p0);
       }
       return;
    }
    public void b(boolean p0){
       Link$a uoa = Link$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       uoa = this.a;
       if (uoa != null) {
          uoa.b(p0);
       }
       return;
    }
    public void onDismiss(){
       if (PatchProxy.applyVoid(null, this, Link$a.class, "2")) {
          return;
       }
       Link$a ta = this.a;
       if (ta != null) {
          ta.onDismiss();
       }
       return;
    }
    public boolean onFailed(){
       Link$a obj = PatchProxy.apply(null, this, Link$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       if (obj != null) {
          return obj.onFailed();
       }
       return false;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, Link$a.class, "1")) {
          return;
       }
       Link$a ta = this.a;
       if (ta != null) {
          ta.onShow();
       }
       ta = this.e;
       Link$a tb = this.b;
       Link$a tc = this.c;
       Link$a td = this.d;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(Link.class) || !PatchProxy.applyVoidThreeRefs(Long.valueOf(tb), tc, td, ta, Link.class, "12")) {
          if (td == null) {
             c.b("addToWidgetMap, attachActivity is null");
          }else {
             c.d("addContainer, materialId: "+tb);
             String str = ta.i(td);
             if (str != null) {
                LongSparseArray longSparseAr = ta.d.get(str);
                if (longSparseAr == null) {
                   longSparseAr = new LongSparseArray();
                   ta.d.put(str, longSparseAr);
                }
                longSparseAr.append(tb, tc);
             }
          }
       }
       return;
    }
}
