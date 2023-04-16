package com.yxcorp.gifshow.v3.mixed.MixImporterFragment$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.v3.mixed.MixImporterFragment;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import o07.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.v3.mixed.MixImporterActivity;

public class MixImporterFragment$b implements PopupInterface$h	// class@001544
{
    public final MixImporterFragment b;

    public void MixImporterFragment$b(MixImporterFragment p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       o.e(this, p0);
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(MixImporterFragment$b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, MixImporterFragment$b.class, "1")) {
          return;
       }
       MixImporterFragment$b tb = this.b;
       tb.o = null;
       tb.j.finish();
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
