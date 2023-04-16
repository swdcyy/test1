package com.kuaishou.live.common.core.component.gift.domain.giftdiy.vc.input.LiveDiyPanelDataBinding$bindVM$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import fj1.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.text.Editable;
import android.widget.EditText;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.viewswitcher.LiveViewSwitcher;
import android.widget.ViewSwitcher;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveDiyPanelDataBinding$bindVM$1 implements Model$a	// class@001248
{
    public final d b;

    public void LiveDiyPanelDataBinding$bindVM$1(d p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       int b;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveDiyPanelDataBinding$bindVM$1.class, "1")) {
       }else {
          a.p(p0, "source");
          LiveDiyPanelDataBinding$bindVM$1 tb = this.b;
          Objects.requireNonNull(tb);
          p1 = PatchProxy.apply(null, tb, d.class, "5");
          if (p1 != PatchProxyResult.class) {
             b = p1.booleanValue();
          }else {
             Editable text = tb.c.getText();
             b = (text != null)? text.length(): 0;
             if (b <= 0) {
                b = true;
             }else {
                b = false;
             }
          }
          if (b) {
             this.b.b().setVisibility(0);
             this.b.c();
          }else {
             this.b.d();
             this.b.b().setVisibility(8);
          }
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveDiyPanelDataBinding$bindVM$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}
