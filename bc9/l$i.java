package bc9.l$i;
import cc9.i;
import bc9.l;
import java.lang.Object;
import cc9.q;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.assistant.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import fc9.a;
import android.view.View;
import android.view.ViewGroup;
import bc9.m;
import android.view.View$OnClickListener;
import kotlin.jvm.internal.Ref$BooleanRef;
import cc9.h;
import cc9.n;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import android.widget.TextView;
import bc9.q;
import java.lang.Runnable;

public final class l$i implements i	// class@0003fb
{
    public final l a;

    public void l$i(l p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$i.class, "1")) {
       }else {
          a.p(p0, "newState");
          if (this.a.g2().D()) {
             l$i ta = this.a;
             Objects.requireNonNull(ta);
             Object[] objArray = null;
             l ol = PatchProxy.apply(objArray, ta, l.class, "4");
             if (ol != PatchProxyResult.class) {
             }else if(ta.F == null){
                ol = ta.E;
                if (ol != null) {
                   objArray = ol.findViewById(R.id.button_collection_assistant);
                }
                a uoa = new a(objArray, 0x7f0a0259, 0x7f0a07dc);
                ta.F = uoa;
                View view = uoa.c();
                if (view != null) {
                   view.setOnClickListener(new m(ta));
                }
             }
             ol = ta.F;
             if (ol != null) {
                Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
                int i = 1;
                boolean b = (p0.j() && !this.a.g2().z())? true: false;
                uBooleanRef.element = b;
                p0 = p0.c();
                if (p0 instanceof n) {
                   p0 = p0.c().mChildId;
                   if (p0 != null && p0.length()) {
                      i = 0;
                   }
                   if (!i) {
                      uBooleanRef.element = false;
                   }
                }
                p0 = ol.c();
                if (p0 == null || p0.isSelected() != uBooleanRef.element) {
                   p0 = ol.c();
                   if (p0 != null) {
                      p0.setSelected(uBooleanRef.element);
                   }
                   p0 = ol.f();
                   if (p0 != null) {
                      p0.post(new q(ol, uBooleanRef));
                   }
                }
             }
          }
       }
       return;
    }
}
