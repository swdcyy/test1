package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$EditList$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$EditList;
import zqa.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zqa.b$d;
import msd.l;
import android.text.Editable;
import android.widget.EditText;
import java.lang.CharSequence;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.util.Objects;
import java.util.Collection;
import zsd.u;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$EditList$a$a;
import java.lang.Runnable;
import ekd.k1;

public final class GrowthTestViewHolder$EditList$a implements View$OnClickListener	// class@001561
{
    public final GrowthTestViewHolder$EditList b;
    public final b c;

    public void GrowthTestViewHolder$EditList$a(GrowthTestViewHolder$EditList p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestViewHolder$EditList$a.class, "1")) {
          return;
       }
       l ol = this.c.d();
       GrowthTestViewHolder$EditList c = this.b.c;
       Editable text = (c != null)? c.getText(): null;
       String[] stringArray = new String[]{","};
       List list = StringsKt__StringsKt.H4(String.valueOf(text), stringArray, false, 0, 6, null);
       ArrayList uArrayList = new ArrayList(u.Y(list, 10));
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
          uArrayList.add(StringsKt__StringsKt.o5(str).toString());
       }
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator1 = uArrayList.iterator();
       while (iterator1.hasNext()) {
          Object obj = iterator1.next();
          int i = u.S1(obj) ^ 0x01;
          if (i) {
             uArrayList1.add(obj);
          }
       }
       ol.invoke(uArrayList1);
       GrowthTestViewHolder$EditList c1 = this.b.c;
       if (c1 != null) {
          c1.setText("");
       }
       k1.r(new GrowthTestViewHolder$EditList$a$a(this), 300);
       return;
    }
}
