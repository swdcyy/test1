package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.a;
import androidx.lifecycle.Observer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.c;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import faa.a;
import java.lang.String;
import q87.c;
import java.util.List;
import nmd.i;
import ekd.q$b;
import qtc.a;
import java.util.Collection;
import mrd.a;

public final class a implements Observer	// class@000aa2
{
    public final c b;
    public final boolean c;
    public final boolean d;

    public void a(c p0,boolean p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onChanged(Object p0){
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       Objects.requireNonNull(tb);
       if (p0.intValue() == 2) {
          Object[] objArray = new Object[0];
          a.D().s("NewStickerEditor", "initResource: SUCCESS", objArray);
          tb.b.clear();
          tb.b.addAll(tb.i.r0(new i(tb, tc, td)));
       }
       tb.g.onNext(p0);
       return;
    }
}
