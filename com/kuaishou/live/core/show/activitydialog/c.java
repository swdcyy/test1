package com.kuaishou.live.core.show.activitydialog.c;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d$b;
import androidx.fragment.app.FragmentPagerAdapter;
import android.content.Context;
import androidx.fragment.app.c;
import java.util.List;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.activitydialog.c$b;
import com.kuaishou.live.common.core.component.pk.entry.LiveTabView;
import java.lang.CharSequence;
import com.kuaishou.live.core.show.activitydialog.c$a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import d61.v;
import androidx.fragment.app.Fragment;

public class c extends FragmentPagerAdapter implements PagerSlidingTabStrip$d$b	// class@00092c
{
    public final List h;
    public final List i;
    public final Context j;

    public void c(Context p0,c p1,List p2){
       super(p1, 1);
       this.i = new ArrayList();
       this.j = p0;
       this.h = p2;
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
       }else {
          for (int i = 0; i < this.h.size(); i++) {
             LiveTabView liveTabView = new LiveTabView(this.j);
             liveTabView.setText(this.h.get(i).b);
             c$a uoa = new c$a(this.d(i), liveTabView);
             this.i.add(uoa);
          }
       }
       return;
    }
    public PagerSlidingTabStrip$d b(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 >= this.i.size()) {
          return new PagerSlidingTabStrip$d(this.d(p0));
       }else {
          return this.i.get(p0);
       }
    }
    public int c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return v.h(p0, 0);
    }
    public String d(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return String.valueOf(p0);
    }
    public PagerSlidingTabStrip$d e(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoc, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.applyOneRefs(p0, this, uoc, "3");
       int i = (obj1 != patchProxyRe)? obj1.intValue(): v.h(p0, 0);
       return this.b(i);
    }
    public int j(){
       Object obj = PatchProxy.apply(null, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.h.size();
    }
    public Fragment z(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.h.get(p0).a;
    }
}
