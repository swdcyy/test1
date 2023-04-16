package com.yxcorp.gifshow.util.ARecyclerAdapter$d;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import ag6.a;

public abstract class ARecyclerAdapter$d extends RecyclerView$ViewHolder	// class@001ec5
{
    public Object a;

    public void ARecyclerAdapter$d(View p0){
       a.p(p0, "view");
       super(p0);
    }
    public void ARecyclerAdapter$d(ViewGroup p0,int p1){
       a.p(p0, "parent");
       View view = a.c(LayoutInflater.from(p0.getContext()), p1, p0, false);
       a.o(view, "LayoutInflater.from\(pare¡­te\(layout, parent, false\)");
       super(view);
    }
    public final View a(int p0){
       return this.itemView.findViewById(p0);
    }
    public final Object b(){
       return this.a;
    }
    public void c(int p0,Object p1,Object p2){
    }
    public void d(Object p0){
    }
    public void e(Object p0){
    }
    public final void f(Object p0){
       this.a = p0;
    }
}
