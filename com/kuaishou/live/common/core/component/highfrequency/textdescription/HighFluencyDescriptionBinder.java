package com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyDescriptionBinder;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyDescriptionBinder$DisplayPosition;
import java.lang.Class;
import java.util.EnumMap;
import com.google.common.collect.Maps;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.e;
import java.util.Map;
import ok.n;
import java.lang.Object;
import com.google.common.collect.StandardTable;
import ok.x;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.b;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.c;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.d;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.google.common.collect.s;
import android.widget.TextView;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyDescriptionBinder$a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import lnc.a1;
import android.text.SpannableStringBuilder;
import java.lang.CharSequence;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide$TextDescription;
import android.view.ViewGroup;

public abstract class HighFluencyDescriptionBinder	// class@001342
{
    public static final s a;

    static {
       EnumMap uEnumMap = Maps.r(HighFluencyDescriptionBinder$DisplayPosition.class);
       e b = e.b;
       n.b(uEnumMap.isEmpty());
       n.j(b);
       HighFluencyDescriptionBinder.a = new StandardTable(uEnumMap, b);
       HighFluencyDescriptionBinder$DisplayPosition title = HighFluencyDescriptionBinder$DisplayPosition.Title;
       HighFluencyDescriptionBinder.a(title, 3, b.b);
       HighFluencyDescriptionBinder.a(title, 2, c.b);
       HighFluencyDescriptionBinder.a(title, 1, d.b);
       title = HighFluencyDescriptionBinder$DisplayPosition.SubTitle;
       HighFluencyDescriptionBinder.a(title, 3, b.b);
       HighFluencyDescriptionBinder.a(title, 2, c.b);
       HighFluencyDescriptionBinder.a(title, 1, d.b);
    }
    public void HighFluencyDescriptionBinder(){
       super();
    }
    public static void a(HighFluencyDescriptionBinder$DisplayPosition p0,int p1,x p2){
       if (PatchProxy.isSupport(HighFluencyDescriptionBinder.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, HighFluencyDescriptionBinder.class, "1")) {
          return;
       }
       HighFluencyDescriptionBinder.a.put(p0, Integer.valueOf(p1), p2);
       return;
    }
    public void b(TextView p0,int p1,HighFluencyDescriptionBinder$a p2){
       if (PatchProxy.isSupport(HighFluencyDescriptionBinder.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, HighFluencyDescriptionBinder.class, "2")) {
          return;
       }
       Drawable uDrawable = p2.a(p0.getContext(), p1);
       if (uDrawable != null) {
          LiveSpannable liveSpannabl = new LiveSpannable();
          LiveSpannable$a uoa = new LiveSpannable$a(uDrawable).c(a1.d(R.dimen.arg_RES_7f0702a4));
          uoa.b(-3);
          liveSpannabl.e().h(uoa);
          p0.append(liveSpannabl.k());
       }
       return;
    }
    public void c(int p0,int p1,HighFluencyDescriptionBinder$DisplayPosition p2,boolean p3){
    }
    public abstract void d(HighFrequencyActionGuide$TextDescription p0);
    public void e(int p0,HighFluencyDescriptionBinder$a p1){
    }
    public void f(){
    }
    public abstract void g(Context p0,ViewGroup p1,HighFrequencyActionGuide$TextDescription p2);
}
