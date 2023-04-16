package com.facebook.rebound.ui.SpringConfiguratorView$d;
import android.widget.BaseAdapter;
import com.facebook.rebound.ui.SpringConfiguratorView;
import android.content.Context;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.AbsListView$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.content.res.Resources;
import android.widget.FrameLayout;
import eg.a;
import java.lang.CharSequence;

public class SpringConfiguratorView$d extends BaseAdapter	// class@001448
{
    public final Context b;
    public final List c;
    public final SpringConfiguratorView d;

    public void SpringConfiguratorView$d(SpringConfiguratorView p0,Context p1){
       this.d = p0;
       super();
       this.b = p1;
       this.c = new ArrayList();
    }
    public void a(String p0){
       this.c.add(p0);
       this.notifyDataSetChanged();
    }
    public int getCount(){
       return this.c.size();
    }
    public Object getItem(int p0){
       return this.c.get(p0);
    }
    public long getItemId(int p0){
       return (long)p0;
    }
    public View getView(int p0,View p1,ViewGroup p2){
       TextView textView;
       if (p1 == null) {
          textView = new TextView(this.b);
          textView.setLayoutParams(new AbsListView$LayoutParams(-1, -1));
          textView.setPadding(a.c(12.00f, this.d.getResources()), a.c(12.00f, this.d.getResources()), a.c(12.00f, this.d.getResources()), a.c(12.00f, this.d.getResources()));
          textView.setTextColor(this.d.h);
       }else {
       }
       textView.setText(this.c.get(p0));
       return textView;
    }
}
