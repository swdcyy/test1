package com.yxcorp.gifshow.s;
import in5.a;
import java.lang.Object;
import android.os.Build$VERSION;
import java.lang.Long;
import java.util.HashMap;
import android.os.ConditionVariable;
import com.yxcorp.gifshow.s$a;
import android.content.Context;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.content.MutableContextWrapper;
import oxa.a;
import android.os.Looper;
import android.os.HandlerThread;
import oxa.i;
import oxa.b;
import android.widget.FrameLayout;
import uv8.y0;
import android.view.ViewGroup;
import oxa.i$e;
import android.view.View;
import com.kwai.robust.PatchProxyResult;

public class s implements a	// class@001ef3
{
    public final int a;
    public final Long b;
    public final Long c;
    public WeakReference d;
    public View e;
    public View f;
    public View g;
    public HashMap h;
    public HashMap i;
    public ConditionVariable j;
    public boolean k;
    public boolean l;
    public boolean m;

    public void s(){
       super();
       this.a = Build$VERSION.SDK_INT;
       this.b = Long.valueOf(50);
       this.c = Long.valueOf(80);
       this.h = new HashMap();
       this.i = new HashMap();
       this.j = new ConditionVariable();
       this.k = false;
       this.l = false;
       this.m = false;
    }
    public static s c(){
       return s$a.a;
    }
    public void a(int p0,Context p1,String p2){
       if (PatchProxy.isSupport(s.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, s.class, "3")) {
          return;
       }
       if (this.h.get(p2) == null && p1 != null) {
          MutableContextWrapper mutableConte = new MutableContextWrapper(p1);
          if (this.h.get(p2) == null) {
             this.h.put(p2, new ConditionVariable());
          }
          i oi = b.a(mutableConte, a.a().getLooper());
          if (this.h.get(p2) == null) {
             this.h.put(p2, new ConditionVariable());
          }
          oi.a(p0, new FrameLayout(p1), new y0(this, p2));
       }
       return;
    }
    public View b(Context p0,String p1){
       s os = s.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, os, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          if (!PatchProxy.applyVoidOneRefs(p1, this, os, "7") && (this.i.get(p1) == null && this.h.get(p1) != null)) {
             this.h.get(p1).block(this.b.longValue());
          }
       label_0039 :
          View view = this.i.remove(p1);
          if (PatchProxy.applyVoidTwoRefs(view, p0, this, os, "4") || (view != null && p0 != null)) {
             Context context = view.getContext();
             if (context instanceof MutableContextWrapper) {
                context.setBaseContext(p0);
             }
          }
          return view;
       }catch(java.lang.Exception e0){
       }
    }
    public final boolean d(){
       s ta = this.a;
       if (ta == 26 || ta == 27) {
          return true;
       }
       return false;
    }
}
