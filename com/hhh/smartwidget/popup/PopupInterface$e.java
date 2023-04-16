package com.hhh.smartwidget.popup.PopupInterface$e;
import com.hhh.smartwidget.popup.PopupInterface$d;
import java.lang.Object;
import com.hhh.smartwidget.popup.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import ag6.a;
import nm.g;

public class PopupInterface$e implements PopupInterface$d	// class@00058e
{
    public final int a;

    public void PopupInterface$e(int p0){
       super();
       this.a = p0;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       View view = a.c(p1, this.a, p2, false);
       this.c(p0, view);
       return view;
    }
    public void b(c p0){
       g.a(this, p0);
    }
    public void c(c p0,View p1){
    }
}
