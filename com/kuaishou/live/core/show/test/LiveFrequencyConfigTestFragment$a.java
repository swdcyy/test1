package com.kuaishou.live.core.show.test.LiveFrequencyConfigTestFragment$a;
import android.widget.ArrayAdapter;
import android.content.Context;
import java.util.List;
import java.util.Collections;
import com.kuaishou.live.core.show.test.LiveFrequencyConfigTestFragment$a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import android.widget.Filter;

public final class LiveFrequencyConfigTestFragment$a extends ArrayAdapter	// class@00118b
{
    public List b;
    public final LiveFrequencyConfigTestFragment$a$a c;

    public void LiveFrequencyConfigTestFragment$a(Context p0,int p1){
       super(p0, p1);
       this.b = Collections.emptyList();
       this.c = new LiveFrequencyConfigTestFragment$a$a(this);
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFrequencyConfigTestFragment$a.class, "2")) {
          return;
       }
       this.clear();
       this.addAll(p0);
       return;
    }
    public Filter getFilter(){
       return this.c;
    }
}
