package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.LongPictureSubViewBinder$resizeContainerView$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ond.d;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import java.util.Objects;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import lnd.a;
import java.util.List;
import xld.a;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import ond.c;
import erd.r;
import android.graphics.Rect;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class LongPictureSubViewBinder$resizeContainerView$1 extends Lambda implements a	// class@000b43
{
    public final d this$0;

    public void LongPictureSubViewBinder$resizeContainerView$1(d p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LongPictureSubViewBinder$resizeContainerView$1.class, "1")) {
          return;
       }
       if (this.this$0.J()) {
          return;
       }
       this.this$0.e.e0();
       LongPictureSubViewBinder$resizeContainerView$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoid(objArray, tthis$0, d.class, "5")) {
          int i = tthis$0.D();
          Iterator iterator = tthis$0.c.o0().j().iterator();
          int i1 = 0;
          int i2 = 0;
          while (iterator.hasNext()) {
             List obj = iterator.next();
             int i3 = i1 + 1;
             if (i1 < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             obj = tthis$0.e.o0(new c(obj));
             Rect rect = tthis$0.H(i1);
             a.o(obj, "elementList");
             Iterator iterator1 = obj.iterator();
             while (iterator1.hasNext()) {
                EditDecorationBaseDrawer uEditDecorat = iterator1.next();
                a.o(uEditDecorat, "it");
                int i4 = i2 - i;
                uEditDecorat.setAdditionOffsetY(i4);
                uEditDecorat.mEditRect = rect;
                Log.b("LongPictureSubViewBinder", "editRect: "+uEditDecorat.mEditRect);
                tthis$0.e.C0(uEditDecorat);
             }
             i2 = i2 + rect.height();
             i1 = i3;
          }
       }
       return;
    }
}
