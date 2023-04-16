package com.kwai.library.widget.popup.common.PopupInterface$g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import ag6.a;
import o07.n;

public class PopupInterface$g implements PopupInterface$f	// class@000985
{
    public final int b;

    public void PopupInterface$g(int p0){
       super();
       this.b = p0;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       View view = a.c(p1, this.b, p2, false);
       this.c(p0, view);
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
    public void c(c p0,View p1){
    }
}
