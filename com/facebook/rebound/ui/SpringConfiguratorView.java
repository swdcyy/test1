package com.facebook.rebound.ui.SpringConfiguratorView;
import android.widget.FrameLayout;
import java.text.DecimalFormat;
import java.lang.String;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import android.graphics.Color;
import dg.j;
import dg.g;
import com.facebook.rebound.ui.SpringConfiguratorView$d;
import android.content.res.Resources;
import eg.a;
import dg.e;
import dg.c;
import com.facebook.rebound.ui.SpringConfiguratorView$b;
import dg.h;
import android.widget.TableLayout$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.Spinner;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.facebook.rebound.ui.SpringConfiguratorView$a;
import android.view.View$OnTouchListener;
import com.facebook.rebound.ui.SpringConfiguratorView$c;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.widget.SpinnerAdapter;
import com.facebook.rebound.ui.SpringConfiguratorView$e;
import android.widget.AdapterView$OnItemSelectedListener;
import java.util.Map;
import java.util.Collections;
import java.util.List;
import android.widget.BaseAdapter;
import java.util.Set;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;
import dg.f;

public class SpringConfiguratorView extends FrameLayout	// class@00144a
{
    public final SpringConfiguratorView$d b;
    public final List c;
    public final e d;
    public final float e;
    public final float f;
    public final g g;
    public final int h;
    public SeekBar i;
    public SeekBar j;
    public Spinner k;
    public TextView l;
    public TextView m;
    public f n;
    public static final DecimalFormat o;

    static {
       SpringConfiguratorView.o = new DecimalFormat("#.#");
    }
    public void SpringConfiguratorView(Context p0){
       super(p0, null);
    }
    public void SpringConfiguratorView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SpringConfiguratorView(Context p0,AttributeSet p1,int p2){
       SpringConfiguratorView springConfig = this;
       Context uContext = p0;
       super(p0, p1, p2);
       ArrayList uArrayList = new ArrayList();
       springConfig.c = uArrayList;
       int i = Color.argb(255, 225, 225, 225);
       springConfig.h = i;
       g b = g.b;
       springConfig.g = b;
       SpringConfiguratorView$d uod = new SpringConfiguratorView$d(springConfig, uContext);
       springConfig.b = uod;
       Resources resources = this.getResources();
       springConfig.f = (float)a.c(40.00f, resources);
       springConfig.e = (float)a.c(280.00f, resources);
       e uoe = j.d().b();
       springConfig.d = uoe;
       uoe.e(0x3ff0000000000000);
       uoe.f(0x3ff0000000000000);
       uoe.a(new SpringConfiguratorView$b(springConfig));
       Resources resources1 = this.getResources();
       int i1 = a.c(10.00f, resources1);
       int i2 = a.c(20.00f, resources1);
       TableLayout$LayoutParams layoutParams = new TableLayout$LayoutParams(0, -2, 0x3f800000);
       layoutParams.setMargins(0, 0, a.c(5.00f, resources1), 0);
       FrameLayout uFrameLayout = new FrameLayout(uContext);
       uFrameLayout.setLayoutParams(a.a(-1, a.c(300.00f, resources1)));
       FrameLayout uFrameLayout1 = new FrameLayout(uContext);
       FrameLayout$LayoutParams layoutParams1 = a.a(-1, -1);
       layoutParams1.setMargins(0, i2, 0, 0);
       uFrameLayout1.setLayoutParams(layoutParams1);
       uFrameLayout1.setBackgroundColor(Color.argb(100, 0, 0, 0));
       uFrameLayout.addView(uFrameLayout1);
       springConfig.k = new Spinner(uContext, 0);
       layoutParams1 = a.b();
       layoutParams1.gravity = 48;
       layoutParams1.setMargins(i1, i1, i1, 0);
       springConfig.k.setLayoutParams(layoutParams1);
       uFrameLayout1.addView(springConfig.k);
       LinearLayout linearLayout = new LinearLayout(uContext);
       FrameLayout$LayoutParams layoutParams2 = a.b();
       layoutParams2.setMargins(0, 0, 0, a.c(80.00f, resources1));
       layoutParams2.gravity = 80;
       linearLayout.setLayoutParams(layoutParams2);
       linearLayout.setOrientation(1);
       uFrameLayout1.addView(linearLayout);
       LinearLayout linearLayout1 = new LinearLayout(uContext);
       FrameLayout$LayoutParams layoutParams3 = a.b();
       layoutParams3.setMargins(i1, i1, i1, i2);
       linearLayout1.setPadding(i1, i1, i1, i1);
       linearLayout1.setLayoutParams(layoutParams3);
       linearLayout1.setOrientation(0);
       linearLayout.addView(linearLayout1);
       SeekBar seekBar = new SeekBar(uContext);
       springConfig.i = seekBar;
       seekBar.setLayoutParams(layoutParams);
       linearLayout1.addView(springConfig.i);
       TextView textView = new TextView(this.getContext());
       springConfig.m = textView;
       textView.setTextColor(i);
       springConfig.m.setGravity(19);
       springConfig.m.setLayoutParams(a.a(a.c(50.00f, resources1), -1));
       springConfig.m.setMaxLines(1);
       linearLayout1.addView(springConfig.m);
       linearLayout1 = new LinearLayout(uContext);
       layoutParams3 = a.b();
       layoutParams3.setMargins(i1, i1, i1, i2);
       linearLayout1.setPadding(i1, i1, i1, i1);
       linearLayout1.setLayoutParams(layoutParams3);
       linearLayout1.setOrientation(0);
       linearLayout.addView(linearLayout1);
       SeekBar seekBar1 = new SeekBar(uContext);
       springConfig.j = seekBar1;
       seekBar1.setLayoutParams(layoutParams);
       linearLayout1.addView(springConfig.j);
       TextView textView1 = new TextView(this.getContext());
       springConfig.l = textView1;
       textView1.setTextColor(i);
       springConfig.l.setGravity(19);
       springConfig.l.setLayoutParams(a.a(a.c(50.00f, resources1), -1));
       springConfig.l.setMaxLines(1);
       linearLayout1.addView(springConfig.l);
       View view = new View(uContext);
       FrameLayout$LayoutParams layoutParams4 = a.a(a.c(60.00f, resources1), a.c(40.00f, resources1));
       layoutParams4.gravity = 49;
       view.setLayoutParams(layoutParams4);
       view.setOnTouchListener(new SpringConfiguratorView$a(springConfig));
       view.setBackgroundColor(Color.argb(255, 0, 164, 209));
       uFrameLayout.addView(view);
       springConfig.addView(uFrameLayout);
       SpringConfiguratorView$c uoc = new SpringConfiguratorView$c(springConfig);
       i = 0x186a0;
       springConfig.i.setMax(i);
       springConfig.i.setOnSeekBarChangeListener(uoc);
       springConfig.j.setMax(i);
       springConfig.j.setOnSeekBarChangeListener(uoc);
       springConfig.k.setAdapter(uod);
       springConfig.k.setOnItemSelectedListener(new SpringConfiguratorView$e(springConfig));
       Map map = Collections.unmodifiableMap(b.a);
       uod.c.clear();
       uod.notifyDataSetChanged();
       uArrayList.clear();
       Iterator iterator = map.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry.getKey() == f.c) {
             continue ;
          }
          springConfig.c.add(uEntry.getKey());
          springConfig.b.a(uEntry.getValue());
       }
       springConfig.c.add(f.c);
       springConfig.b.a(map.get(f.c));
       springConfig.b.notifyDataSetChanged();
       if (springConfig.c.size() > 0) {
          springConfig.k.setSelection(0);
       }
       springConfig.setTranslationY(springConfig.e);
       return;
    }
}
