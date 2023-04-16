package com.gifshow.tuna.player.poi.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.gifshow.tuna.player.poi.f;
import android.app.Activity;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.util.Objects;
import i2b.a;
import oj.c;
import android.view.View$OnClickListener;
import o07.n;

public final class b implements PopupInterface$f	// class@0015f1
{
    public final f b;
    public final Activity c;

    public void b(f p0,Activity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       b tb = this.b;
       Objects.requireNonNull(tb);
       View view = a.g(p1, R.layout.arg_RES_7f0d1184, p2, false);
       view.setOnClickListener(new c(tb, this.c));
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
