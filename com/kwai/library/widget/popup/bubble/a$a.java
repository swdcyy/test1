package com.kwai.library.widget.popup.bubble.a$a;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import ag6.a;
import o07.n;

public final class a$a implements PopupInterface$f	// class@000975
{
    public final int b;

    public void a$a(int p0){
       this.b = p0;
       super();
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       return a.c(p1, this.b, p2, false);
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
