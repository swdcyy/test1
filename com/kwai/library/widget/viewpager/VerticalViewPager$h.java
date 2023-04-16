package com.kwai.library.widget.viewpager.VerticalViewPager$h;
import android.database.DataSetObserver;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import java.lang.Object;
import java.util.List;

public class VerticalViewPager$h extends DataSetObserver	// class@000a7f
{
    public final VerticalViewPager a;

    public void VerticalViewPager$h(VerticalViewPager p0){
       this.a = p0;
       super();
    }
    public void onChanged(){
       this.a.f();
       VerticalViewPager m = this.a.m;
       if (m != null) {
          int i = 0;
          DataSetObserver[] uDataSetObse = new DataSetObserver[i];
          DataSetObserver[] uDataSetObse1 = m.toArray(uDataSetObse);
          int len = uDataSetObse1.length;
          while (i < len) {
             object oobject = uDataSetObse1[i];
             if (oobject != null) {
                oobject.onChanged();
             }
             i = i + 1;
          }
       }
       return;
    }
    public void onInvalidated(){
       this.a.f();
       VerticalViewPager m = this.a.m;
       if (m != null) {
          int i = 0;
          DataSetObserver[] uDataSetObse = new DataSetObserver[i];
          DataSetObserver[] uDataSetObse1 = m.toArray(uDataSetObse);
          int len = uDataSetObse1.length;
          while (i < len) {
             object oobject = uDataSetObse1[i];
             if (oobject != null) {
                oobject.onInvalidated();
             }
             i = i + 1;
          }
       }
       return;
    }
}
