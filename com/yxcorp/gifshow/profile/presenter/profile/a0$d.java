package com.yxcorp.gifshow.profile.presenter.profile.a0$d;
import ub.a;
import com.yxcorp.gifshow.profile.presenter.profile.a0;
import android.view.View;
import java.lang.String;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import da6.c;
import com.yxcorp.image.callercontext.a;

public class a0$d extends a	// class@00147f
{
    public a b;
    public final WeakReference c;
    public final String d;
    public final a0 e;

    public void a0$d(a0 p0,View p1,String p2){
       this.e = p0;
       super();
       this.c = new WeakReference(p1);
       this.d = p2;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a0$d.class, "2")) {
       }else if(this.c.get() != null){
          this.c.get().setTag(R.id.profile_cover_context, this.b);
       }
       a0$d te = this.e;
       if (te.q != null) {
          te.r.putExtra("KWAI_IMAGE_CALLER_CONTEXT", this.b);
       }
       return;
    }
    public void onSubmit(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a0$d.class, "1")) {
          return;
       }
       if (p1 instanceof a) {
          this.b = p1;
       }
       return;
    }
}
