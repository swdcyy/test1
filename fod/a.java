package fod.a;
import fod.c;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nn9.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mn9.a;
import java.util.Objects;
import bod.c;
import android.widget.ImageView;
import bod.d;
import com.yxcorp.gifshow.image.KwaiImageView;
import faa.a;
import q87.c;
import nuc.a;
import com.yxcorp.gifshow.component.postlistcomponent.state.ItemLoadingStatus;

public final class a extends c	// class@000e50
{

    public void a(View p0,boolean p1){
       a.p(p0, "itemView");
       super(p0, p1);
    }
    public void f(b p0,b p1){
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "1")) {
          return;
       }
       a.p(p1, "newState");
       a uoa1 = p1.g();
       Objects.requireNonNull(uoa1, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.model.LocalTextTemplateItem");
       c ti = this.i;
       int i = (p1.d())? 0: 8;
       ti.setVisibility(i);
       if (!PatchProxy.applyVoidOneRefs(uoa1, this, uoa, "2")) {
          if (a.g(uoa1.getId(), this.h().getTag())) {
             Object[] objArray = new Object[0];
             a.D().w("NormalLocalTextTemplateItemVH", "updateImageIconIfNeeded id == tag, return", objArray);
          }else if(a.g(uoa1.k().r(), "shadow_01")){
             this.h().setImageResource(R.drawable.arg_RES_7f081b50);
          }
       }
       this.i(p1.e());
       return;
    }
}
