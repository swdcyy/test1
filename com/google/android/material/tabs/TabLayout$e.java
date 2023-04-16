package com.google.android.material.tabs.TabLayout$e;
import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

public class TabLayout$e extends DataSetObserver	// class@0016cd
{
    public final TabLayout a;

    public void TabLayout$e(TabLayout p0){
       this.a = p0;
       super();
    }
    public void onChanged(){
       this.a.x();
    }
    public void onInvalidated(){
       this.a.x();
    }
}
