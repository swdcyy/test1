package eod.d;
import ei0.a;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import bod.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nuc.a;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import d0c.a;
import nsd.u;
import androidx.recyclerview.widget.RecyclerView;
import msd.a;
import java.lang.Integer;
import java.lang.Boolean;
import android.view.ViewGroup;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.utils.TextTemplateConstantV2;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import qrd.l1;
import android.view.ViewTreeObserver;
import eod.d$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import god.c;
import eod.d$b;

public class d extends a	// class@000db7
{

    public void d(View p0){
       a.p(p0, "rootView");
       super(p0);
    }
    public final d D(d p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "textTemplateItem");
       d uod = new d(p0.k(), null, null, false, p0.g(), p0.j(), null, p0.e(), p0.f(), 78, null);
       return obj;
    }
    public final void E(int p0,RecyclerView p1,boolean p2,a p3){
       int i;
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), p3, this, d.class, "1")) {
          return;
       }
       a.p(p1, "recyclerView");
       if (p1.getWidth() && (!p1.getHeight() || !p1.getChildCount())) {
          d$a uoa = new d$a(this, p1, p0, p2, p3);
          p1.getViewTreeObserver().addOnGlobalLayoutListener(v7);
          return;
       }else if(p2){
          Objects.requireNonNull(TextTemplateConstantV2.m);
          i = (p1.getWidth() / 2) - TextTemplateConstantV2.k;
       }else {
          i = (p1.getHeight() - TextTemplateConstantV2.m.c()) / 2;
       }
       RecyclerView$LayoutManager layoutManage = p1.getLayoutManager();
       Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
       layoutManage.scrollToPositionWithOffset(p0, i);
       if (p3 != null) {
          p3.invoke();
       }
       return;
    }
    public final void F(int p0,RecyclerView p1,boolean p2,a p3){
       int i;
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), p3, this, d.class, "2")) {
          return;
       }
       a.p(p1, "recyclerView");
       if (p1.getWidth() && (!p1.getHeight() || !p1.getChildCount())) {
          d$b uob = new d$b(this, p1, p0, p2, p3);
          p1.getViewTreeObserver().addOnGlobalLayoutListener(v7);
          return;
       }else if(p2){
          Objects.requireNonNull(c.p);
          i = (p1.getWidth() / 2) - c.a;
       }else {
          i = (p1.getHeight() - c.p.e()) / 2;
       }
       RecyclerView$LayoutManager layoutManage = p1.getLayoutManager();
       Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
       layoutManage.scrollToPositionWithOffset(p0, i);
       if (p3 != null) {
          p3.invoke();
       }
       return;
    }
}
