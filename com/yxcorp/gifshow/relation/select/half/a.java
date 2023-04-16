package com.yxcorp.gifshow.relation.select.half.a;
import android.content.DialogInterface$OnKeyListener;
import com.yxcorp.gifshow.relation.select.half.SelectFriendHalfPanelFragment;
import java.lang.Object;
import android.content.DialogInterface;
import android.view.KeyEvent;
import java.util.Objects;
import sbc.h;
import java.lang.Runnable;
import ekd.k1;

public final class a implements DialogInterface$OnKeyListener	// class@00199f
{
    public final SelectFriendHalfPanelFragment b;

    public void a(SelectFriendHalfPanelFragment p0){
       this.b = p0;
    }
    public final boolean onKey(DialogInterface p0,int p1,KeyEvent p2){
       boolean b;
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == 4) {
          k1.r(new h(tb), 100);
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
